package androidx.core.util;

import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public interface Predicate<T> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$2(Predicate predicate, Object obj2) {
        return test(obj2) || predicate.test(obj2);
    }

    default Predicate<T> or(final Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: v3.a
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj2) {
                return this.f285756a.lambda$or$2(predicate, obj2);
            }
        };
    }

    boolean test(T t2);
}
