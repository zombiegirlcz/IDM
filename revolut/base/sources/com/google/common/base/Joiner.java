package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public class Joiner {
    private final String separator;

    /* JADX INFO: loaded from: classes16.dex */
    public static final class MapJoiner {
        private final Joiner joiner;
        private final String keyValueSeparator;

        public <A extends Appendable> A appendTo(A a7, Map<?, ?> map) throws IOException {
            return (A) appendTo(a7, map.entrySet());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        public MapJoiner useForNull(String str) {
            return new MapJoiner(this.joiner.useForNull(str), this.keyValueSeparator);
        }

        private MapJoiner(Joiner joiner, String str) {
            this.joiner = joiner;
            this.keyValueSeparator = (String) Preconditions.checkNotNull(str);
        }

        public StringBuilder appendTo(StringBuilder sb6, Map<?, ?> map) {
            return appendTo(sb6, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        public <A extends Appendable> A appendTo(A a7, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) appendTo(a7, iterable.iterator());
        }

        public String join(Iterator<? extends Map.Entry<?, ?>> it8) {
            return appendTo(new StringBuilder(), it8).toString();
        }

        public <A extends Appendable> A appendTo(A a7, Iterator<? extends Map.Entry<?, ?>> it8) throws IOException {
            Preconditions.checkNotNull(a7);
            if (it8.hasNext()) {
                Map.Entry<?, ?> next = it8.next();
                a7.append(this.joiner.toString(next.getKey()));
                a7.append(this.keyValueSeparator);
                a7.append(this.joiner.toString(next.getValue()));
                while (it8.hasNext()) {
                    a7.append(this.joiner.separator);
                    Map.Entry<?, ?> next2 = it8.next();
                    a7.append(this.joiner.toString(next2.getKey()));
                    a7.append(this.keyValueSeparator);
                    a7.append(this.joiner.toString(next2.getValue()));
                }
            }
            return a7;
        }

        public StringBuilder appendTo(StringBuilder sb6, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb6, iterable.iterator());
        }

        public StringBuilder appendTo(StringBuilder sb6, Iterator<? extends Map.Entry<?, ?>> it8) {
            try {
                appendTo(sb6, it8);
                return sb6;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    private static Iterable<Object> iterable(final Object obj2, final Object obj3, final Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        return new AbstractList<Object>() { // from class: com.google.common.base.Joiner.3
            @Override // java.util.AbstractList, java.util.List
            public Object get(int i) {
                return i != 0 ? i != 1 ? objArr[i - 2] : obj3 : obj2;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return objArr.length + 2;
            }
        };
    }

    public static Joiner on(String str) {
        return new Joiner(str);
    }

    public <A extends Appendable> A appendTo(A a7, Iterable<? extends Object> iterable) throws IOException {
        return (A) appendTo(a7, iterable.iterator());
    }

    public final String join(Iterable<? extends Object> iterable) {
        return join(iterable.iterator());
    }

    public Joiner skipNulls() {
        return new Joiner(this) { // from class: com.google.common.base.Joiner.2
            @Override // com.google.common.base.Joiner
            public <A extends Appendable> A appendTo(A a7, Iterator<? extends Object> it8) throws IOException {
                Preconditions.checkNotNull(a7, "appendable");
                Preconditions.checkNotNull(it8, "parts");
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next != null) {
                        a7.append(Joiner.this.toString(next));
                        break;
                    }
                }
                while (it8.hasNext()) {
                    Object next2 = it8.next();
                    if (next2 != null) {
                        a7.append(Joiner.this.separator);
                        a7.append(Joiner.this.toString(next2));
                    }
                }
                return a7;
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String str) {
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            @Override // com.google.common.base.Joiner
            public MapJoiner withKeyValueSeparator(String str) {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public CharSequence toString(Object obj2) {
        java.util.Objects.requireNonNull(obj2);
        return obj2 instanceof CharSequence ? (CharSequence) obj2 : obj2.toString();
    }

    public Joiner useForNull(final String str) {
        Preconditions.checkNotNull(str);
        return new Joiner(this, this) { // from class: com.google.common.base.Joiner.1
            final /* synthetic */ Joiner this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.base.Joiner
            public Joiner skipNulls() {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            @Override // com.google.common.base.Joiner
            public CharSequence toString(Object obj2) {
                return obj2 == null ? str : this.this$0.toString(obj2);
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String str2) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public MapJoiner withKeyValueSeparator(char c2) {
        return withKeyValueSeparator(String.valueOf(c2));
    }

    private Joiner(String str) {
        this.separator = (String) Preconditions.checkNotNull(str);
    }

    public static Joiner on(char c2) {
        return new Joiner(String.valueOf(c2));
    }

    public <A extends Appendable> A appendTo(A a7, Iterator<? extends Object> it8) throws IOException {
        Preconditions.checkNotNull(a7);
        if (it8.hasNext()) {
            a7.append(toString(it8.next()));
            while (it8.hasNext()) {
                a7.append(this.separator);
                a7.append(toString(it8.next()));
            }
        }
        return a7;
    }

    public final String join(Iterator<? extends Object> it8) {
        return appendTo(new StringBuilder(), it8).toString();
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(str);
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    private Joiner(Joiner joiner) {
        this.separator = joiner.separator;
    }

    public final String join(Object obj2, Object obj3, Object... objArr) {
        return join(iterable(obj2, obj3, objArr));
    }

    public final <A extends Appendable> A appendTo(A a7, Object[] objArr) throws IOException {
        return (A) appendTo(a7, Arrays.asList(objArr));
    }

    public final <A extends Appendable> A appendTo(A a7, Object obj2, Object obj3, Object... objArr) throws IOException {
        return (A) appendTo(a7, iterable(obj2, obj3, objArr));
    }

    public final StringBuilder appendTo(StringBuilder sb6, Iterable<? extends Object> iterable) {
        return appendTo(sb6, iterable.iterator());
    }

    public final StringBuilder appendTo(StringBuilder sb6, Iterator<? extends Object> it8) {
        try {
            appendTo(sb6, it8);
            return sb6;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final StringBuilder appendTo(StringBuilder sb6, Object[] objArr) {
        return appendTo(sb6, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    public final StringBuilder appendTo(StringBuilder sb6, Object obj2, Object obj3, Object... objArr) {
        return appendTo(sb6, iterable(obj2, obj3, objArr));
    }
}
