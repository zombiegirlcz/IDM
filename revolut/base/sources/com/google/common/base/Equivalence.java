package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.revolut.data.database.models.openbanking.d;
import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {
        static final Equals INSTANCE = new Equals();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object obj2, Object obj3) {
            return obj2.equals(obj3);
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object obj2) {
            return obj2.hashCode();
        }
    }

    public static final class EquivalentToPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<T> equivalence;
        private final T target;

        public EquivalentToPredicate(Equivalence<T> equivalence, T t2) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.target = t2;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(T t2) {
            return this.equivalence.equivalent(t2, this.target);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 instanceof EquivalentToPredicate) {
                EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj2;
                if (this.equivalence.equals(equivalentToPredicate.equivalence) && Objects.equal(this.target, equivalentToPredicate.target)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.equivalence, this.target);
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.equivalence);
            sb6.append(".equivalentTo(");
            return d.t(sb6, this.target, ")");
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {
        static final Identity INSTANCE = new Identity();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object obj2, Object obj3) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object obj2) {
            return System.identityHashCode(obj2);
        }
    }

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;

        @ParametricNullness
        private final T reference;

        public boolean equals(Object obj2) {
            if (obj2 == this) {
                return true;
            }
            if (!(obj2 instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj2;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        @ParametricNullness
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.equivalence);
            sb6.append(".wrap(");
            return d.t(sb6, this.reference, ")");
        }

        private Wrapper(Equivalence<? super T> equivalence, @ParametricNullness T t2) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.reference = t2;
        }
    }

    public static Equivalence<Object> equals() {
        return Equals.INSTANCE;
    }

    public static Equivalence<Object> identity() {
        return Identity.INSTANCE;
    }

    public abstract boolean doEquivalent(T t2, T t3);

    public abstract int doHash(T t2);

    public final boolean equivalent(T t2, T t3) {
        if (t2 == t3) {
            return true;
        }
        if (t2 == null || t3 == null) {
            return false;
        }
        return doEquivalent(t2, t3);
    }

    public final Predicate<T> equivalentTo(T t2) {
        return new EquivalentToPredicate(this, t2);
    }

    public final int hash(T t2) {
        if (t2 == null) {
            return 0;
        }
        return doHash(t2);
    }

    public final <F> Equivalence<F> onResultOf(Function<? super F, ? extends T> function) {
        return new FunctionalEquivalence(function, this);
    }

    @GwtCompatible(serializable = true)
    public final <S extends T> Equivalence<Iterable<S>> pairwise() {
        return new PairwiseEquivalence(this);
    }

    public final <S extends T> Wrapper<S> wrap(@ParametricNullness S s2) {
        return new Wrapper<>(s2);
    }
}
