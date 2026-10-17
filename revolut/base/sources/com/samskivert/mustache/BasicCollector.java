package com.samskivert.mustache;

import com.samskivert.mustache.Mustache;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BasicCollector implements Mustache.Collector {
    protected static final Mustache.VariableFetcher MAP_FETCHER = new Mustache.VariableFetcher() { // from class: com.samskivert.mustache.BasicCollector.2
        @Override // com.samskivert.mustache.Mustache.VariableFetcher
        public Object get(Object obj2, String str) throws Exception {
            Map map = (Map) obj2;
            return map.containsKey(str) ? map.get(str) : Template.NO_FETCHER_FOUND;
        }
    };
    protected static final Mustache.VariableFetcher LIST_FETCHER = new Mustache.VariableFetcher() { // from class: com.samskivert.mustache.BasicCollector.3
        @Override // com.samskivert.mustache.Mustache.VariableFetcher
        public Object get(Object obj2, String str) throws Exception {
            try {
                return ((List) obj2).get(Integer.parseInt(str));
            } catch (IndexOutOfBoundsException unused) {
                return Template.NO_FETCHER_FOUND;
            } catch (NumberFormatException unused2) {
                return Template.NO_FETCHER_FOUND;
            }
        }
    };
    protected static final Mustache.VariableFetcher ITER_FETCHER = new Mustache.VariableFetcher() { // from class: com.samskivert.mustache.BasicCollector.4
        @Override // com.samskivert.mustache.Mustache.VariableFetcher
        public Object get(Object obj2, String str) throws Exception {
            try {
                Iterator it8 = (Iterator) obj2;
                int i = Integer.parseInt(str);
                for (int i2 = 0; i2 < i; i2++) {
                    it8.next();
                }
                return it8.next();
            } catch (NumberFormatException unused) {
                return Template.NO_FETCHER_FOUND;
            } catch (NoSuchElementException unused2) {
                return Template.NO_FETCHER_FOUND;
            }
        }
    };
    protected static final Mustache.VariableFetcher THIS_FETCHER = new Mustache.VariableFetcher() { // from class: com.samskivert.mustache.BasicCollector.5
        @Override // com.samskivert.mustache.Mustache.VariableFetcher
        public Object get(Object obj2, String str) throws Exception {
            return obj2;
        }
    };
    protected static final ArrayHelper OBJECT_ARRAY_HELPER = new ArrayHelper() { // from class: com.samskivert.mustache.BasicCollector.6
        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public Object get(Object obj2, int i) {
            return ((Object[]) obj2)[i];
        }

        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public int length(Object obj2) {
            return ((Object[]) obj2).length;
        }
    };
    protected static final ArrayHelper BOOLEAN_ARRAY_HELPER = new ArrayHelper() { // from class: com.samskivert.mustache.BasicCollector.7
        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public Object get(Object obj2, int i) {
            return Boolean.valueOf(((boolean[]) obj2)[i]);
        }

        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public int length(Object obj2) {
            return ((boolean[]) obj2).length;
        }
    };
    protected static final ArrayHelper BYTE_ARRAY_HELPER = new ArrayHelper() { // from class: com.samskivert.mustache.BasicCollector.8
        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public Object get(Object obj2, int i) {
            return Byte.valueOf(((byte[]) obj2)[i]);
        }

        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public int length(Object obj2) {
            return ((byte[]) obj2).length;
        }
    };
    protected static final ArrayHelper CHAR_ARRAY_HELPER = new ArrayHelper() { // from class: com.samskivert.mustache.BasicCollector.9
        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public Object get(Object obj2, int i) {
            return Character.valueOf(((char[]) obj2)[i]);
        }

        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public int length(Object obj2) {
            return ((char[]) obj2).length;
        }
    };
    protected static final ArrayHelper SHORT_ARRAY_HELPER = new ArrayHelper() { // from class: com.samskivert.mustache.BasicCollector.10
        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public Object get(Object obj2, int i) {
            return Short.valueOf(((short[]) obj2)[i]);
        }

        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public int length(Object obj2) {
            return ((short[]) obj2).length;
        }
    };
    protected static final ArrayHelper INT_ARRAY_HELPER = new ArrayHelper() { // from class: com.samskivert.mustache.BasicCollector.11
        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public Object get(Object obj2, int i) {
            return Integer.valueOf(((int[]) obj2)[i]);
        }

        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public int length(Object obj2) {
            return ((int[]) obj2).length;
        }
    };
    protected static final ArrayHelper LONG_ARRAY_HELPER = new ArrayHelper() { // from class: com.samskivert.mustache.BasicCollector.12
        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public Object get(Object obj2, int i) {
            return Long.valueOf(((long[]) obj2)[i]);
        }

        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public int length(Object obj2) {
            return ((long[]) obj2).length;
        }
    };
    protected static final ArrayHelper FLOAT_ARRAY_HELPER = new ArrayHelper() { // from class: com.samskivert.mustache.BasicCollector.13
        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public Object get(Object obj2, int i) {
            return Float.valueOf(((float[]) obj2)[i]);
        }

        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public int length(Object obj2) {
            return ((float[]) obj2).length;
        }
    };
    protected static final ArrayHelper DOUBLE_ARRAY_HELPER = new ArrayHelper() { // from class: com.samskivert.mustache.BasicCollector.14
        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public Object get(Object obj2, int i) {
            return Double.valueOf(((double[]) obj2)[i]);
        }

        @Override // com.samskivert.mustache.BasicCollector.ArrayHelper
        public int length(Object obj2) {
            return ((double[]) obj2).length;
        }
    };

    public static abstract class ArrayHelper implements Mustache.VariableFetcher {
        public abstract Object get(Object obj2, int i);

        @Override // com.samskivert.mustache.Mustache.VariableFetcher
        public Object get(Object obj2, String str) throws Exception {
            try {
                return get(obj2, Integer.parseInt(str));
            } catch (ArrayIndexOutOfBoundsException unused) {
                return Template.NO_FETCHER_FOUND;
            } catch (NumberFormatException unused2) {
                return Template.NO_FETCHER_FOUND;
            }
        }

        public abstract int length(Object obj2);
    }

    public static ArrayHelper arrayHelper(Object obj2) {
        if (obj2 instanceof Object[]) {
            return OBJECT_ARRAY_HELPER;
        }
        if (obj2 instanceof boolean[]) {
            return BOOLEAN_ARRAY_HELPER;
        }
        if (obj2 instanceof byte[]) {
            return BYTE_ARRAY_HELPER;
        }
        if (obj2 instanceof char[]) {
            return CHAR_ARRAY_HELPER;
        }
        if (obj2 instanceof short[]) {
            return SHORT_ARRAY_HELPER;
        }
        if (obj2 instanceof int[]) {
            return INT_ARRAY_HELPER;
        }
        if (obj2 instanceof long[]) {
            return LONG_ARRAY_HELPER;
        }
        if (obj2 instanceof float[]) {
            return FLOAT_ARRAY_HELPER;
        }
        if (obj2 instanceof double[]) {
            return DOUBLE_ARRAY_HELPER;
        }
        return null;
    }

    @Override // com.samskivert.mustache.Mustache.Collector
    public Mustache.VariableFetcher createFetcher(Object obj2, String str) {
        if (str == Template.DOT_NAME || str == Template.THIS_NAME) {
            return THIS_FETCHER;
        }
        if (obj2 instanceof Map) {
            return MAP_FETCHER;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt < '0' || cCharAt > '9') {
            return null;
        }
        if (obj2 instanceof List) {
            return LIST_FETCHER;
        }
        if (obj2 instanceof Iterator) {
            return ITER_FETCHER;
        }
        if (obj2.getClass().isArray()) {
            return arrayHelper(obj2);
        }
        return null;
    }

    @Override // com.samskivert.mustache.Mustache.Collector
    public abstract <K, V> Map<K, V> createFetcherCache();

    @Override // com.samskivert.mustache.Mustache.Collector
    public Iterator<?> toIterator(Object obj2) {
        if (obj2 instanceof Iterable) {
            return ((Iterable) obj2).iterator();
        }
        if (obj2 instanceof Iterator) {
            return (Iterator) obj2;
        }
        if (obj2.getClass().isArray()) {
            return new Iterator<Object>(arrayHelper(obj2), obj2) { // from class: com.samskivert.mustache.BasicCollector.1
                private int _count;
                private int _idx;
                final /* synthetic */ ArrayHelper val$helper;
                final /* synthetic */ Object val$value;

                {
                    this.val$helper = arrayHelper;
                    this.val$value = obj2;
                    this._count = arrayHelper.length(obj2);
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this._idx < this._count;
                }

                @Override // java.util.Iterator
                public Object next() {
                    ArrayHelper arrayHelper = this.val$helper;
                    Object obj3 = this.val$value;
                    int i = this._idx;
                    this._idx = i + 1;
                    return arrayHelper.get(obj3, i);
                }

                @Override // java.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }
        return null;
    }
}
