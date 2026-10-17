package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    private static final byte ABSENT = -1;
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 128;
    static final ImmutableMap<Object, Object> EMPTY = new RegularImmutableMap(null, new Object[0], 0);
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 32768;

    @J2ktIncompatible
    private static final long serialVersionUID = 0;

    @VisibleForTesting
    final transient Object[] alternatingKeysAndValues;
    private final transient Object hashTable;
    private final transient int size;

    /* JADX INFO: loaded from: classes17.dex */
    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient ImmutableMap<K, V> map;
        private final transient int size;

        public EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.map = immutableMap;
            this.alternatingKeysAndValues = objArr;
            this.keyOffset = i;
            this.size = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj2) {
            if (obj2 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj2;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.map.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.size;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                @J2ktIncompatible
                public Object writeReplace() {
                    return super.writeReplace();
                }

                @Override // java.util.List
                public Map.Entry<K, V> get(int i) {
                    Preconditions.checkElementIndex(i, EntrySet.this.size);
                    int i2 = i * 2;
                    Object obj2 = EntrySet.this.alternatingKeysAndValues[EntrySet.this.keyOffset + i2];
                    Objects.requireNonNull(obj2);
                    Object obj3 = EntrySet.this.alternatingKeysAndValues[i2 + (EntrySet.this.keyOffset ^ 1)];
                    Objects.requireNonNull(obj3);
                    return new AbstractMap.SimpleImmutableEntry(obj2, obj3);
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class KeySet<K> extends ImmutableSet<K> {
        private final transient ImmutableList<K> list;
        private final transient ImmutableMap<K, ?> map;

        public KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.map = immutableMap;
            this.list = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> asList() {
            return this.list;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj2) {
            return this.map.get(obj2) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<K> iterator() {
            return asList().iterator();
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class KeysOrValuesAsList extends ImmutableList<Object> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        public KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.alternatingKeysAndValues = objArr;
            this.offset = i;
            this.size = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.size);
            Object obj2 = this.alternatingKeysAndValues[(i * 2) + this.offset];
            Objects.requireNonNull(obj2);
            return obj2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    private RegularImmutableMap(Object obj2, Object[] objArr, int i) {
        this.hashTable = obj2;
        this.alternatingKeysAndValues = objArr;
        this.size = i;
    }

    public static <K, V> RegularImmutableMap<K, V> create(int i, Object[] objArr) {
        return create(i, objArr, null);
    }

    private static Object createHashTable(Object[] objArr, int i, int i2, int i3) {
        int i5;
        ImmutableMap.Builder.DuplicateKey duplicateKey = null;
        int i6 = 1;
        if (i == 1) {
            Object obj2 = objArr[i3];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj3);
            CollectPreconditions.checkEntryNotNull(obj2, obj3);
            return null;
        }
        int i21 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i22 = 0;
            for (int i32 = 0; i32 < i; i32++) {
                int i33 = (i32 * 2) + i3;
                int i43 = (i22 * 2) + i3;
                Object obj4 = objArr[i33];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i33 ^ 1];
                Objects.requireNonNull(obj5);
                CollectPreconditions.checkEntryNotNull(obj4, obj5);
                int iSmear = Hashing.smear(obj4.hashCode());
                while (true) {
                    int i59 = iSmear & i21;
                    int i66 = bArr[i59] & 255;
                    if (i66 == 255) {
                        bArr[i59] = (byte) i43;
                        if (i22 < i32) {
                            objArr[i43] = obj4;
                            objArr[i43 ^ 1] = obj5;
                        }
                        i22++;
                    } else {
                        if (obj4.equals(objArr[i66])) {
                            int i74 = i66 ^ 1;
                            Object obj6 = objArr[i74];
                            Objects.requireNonNull(obj6);
                            duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj4, obj5, obj6);
                            objArr[i74] = obj5;
                            break;
                        }
                        iSmear = i59 + 1;
                    }
                }
            }
            return i22 == i ? bArr : new Object[]{bArr, Integer.valueOf(i22), duplicateKey};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i92 = 0;
            for (int i96 = 0; i96 < i; i96++) {
                int i99 = (i96 * 2) + i3;
                int i100 = (i92 * 2) + i3;
                Object obj7 = objArr[i99];
                Objects.requireNonNull(obj7);
                Object obj8 = objArr[i99 ^ 1];
                Objects.requireNonNull(obj8);
                CollectPreconditions.checkEntryNotNull(obj7, obj8);
                int iSmear2 = Hashing.smear(obj7.hashCode());
                while (true) {
                    int i101 = iSmear2 & i21;
                    int i102 = sArr[i101] & HPKE.aead_EXPORT_ONLY;
                    if (i102 == 65535) {
                        sArr[i101] = (short) i100;
                        if (i92 < i96) {
                            objArr[i100] = obj7;
                            objArr[i100 ^ 1] = obj8;
                        }
                        i92++;
                    } else {
                        if (obj7.equals(objArr[i102])) {
                            int i103 = i102 ^ 1;
                            Object obj9 = objArr[i103];
                            Objects.requireNonNull(obj9);
                            duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj7, obj8, obj9);
                            objArr[i103] = obj8;
                            break;
                        }
                        iSmear2 = i101 + 1;
                    }
                }
            }
            return i92 == i ? sArr : new Object[]{sArr, Integer.valueOf(i92), duplicateKey};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i104 = 0;
        int i105 = 0;
        while (i104 < i) {
            int i106 = (i104 * 2) + i3;
            int i107 = (i105 * 2) + i3;
            Object obj10 = objArr[i106];
            Objects.requireNonNull(obj10);
            Object obj11 = objArr[i106 ^ i6];
            Objects.requireNonNull(obj11);
            CollectPreconditions.checkEntryNotNull(obj10, obj11);
            int iSmear3 = Hashing.smear(obj10.hashCode());
            while (true) {
                int i108 = iSmear3 & i21;
                int i109 = iArr[i108];
                if (i109 == -1) {
                    iArr[i108] = i107;
                    if (i105 < i104) {
                        objArr[i107] = obj10;
                        objArr[i107 ^ 1] = obj11;
                    }
                    i105++;
                    i5 = i6;
                } else {
                    i5 = i6;
                    if (obj10.equals(objArr[i109])) {
                        int i110 = i109 ^ 1;
                        Object obj12 = objArr[i110];
                        Objects.requireNonNull(obj12);
                        duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj10, obj11, obj12);
                        objArr[i110] = obj11;
                        break;
                    }
                    iSmear3 = i108 + 1;
                    i6 = i5;
                }
            }
            i104++;
            i6 = i5;
        }
        int i111 = i6;
        if (i105 == i) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i111] = Integer.valueOf(i105);
        objArr2[2] = duplicateKey;
        return objArr2;
    }

    public static Object createHashTableOrThrow(Object[] objArr, int i, int i2, int i3) {
        Object objCreateHashTable = createHashTable(objArr, i, i2, i3);
        if (objCreateHashTable instanceof Object[]) {
            throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) objCreateHashTable)[2]).exception();
        }
        return objCreateHashTable;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new EntrySet(this, this.alternatingKeysAndValues, 0, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        return new KeySet(this, new KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.size));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        return new KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj2) {
        V v = (V) get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj2);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }

    public static <K, V> RegularImmutableMap<K, V> create(int i, Object[] objArr, ImmutableMap.Builder<K, V> builder) {
        if (i == 0) {
            return (RegularImmutableMap) EMPTY;
        }
        if (i == 1) {
            Object obj2 = objArr[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr[1];
            Objects.requireNonNull(obj3);
            CollectPreconditions.checkEntryNotNull(obj2, obj3);
            return new RegularImmutableMap<>(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i, objArr.length >> 1);
        Object objCreateHashTable = createHashTable(objArr, i, ImmutableSet.chooseTableSize(i), 0);
        if (objCreateHashTable instanceof Object[]) {
            Object[] objArr2 = (Object[]) objCreateHashTable;
            ImmutableMap.Builder.DuplicateKey duplicateKey = (ImmutableMap.Builder.DuplicateKey) objArr2[2];
            if (builder == null) {
                throw duplicateKey.exception();
            }
            builder.duplicateKey = duplicateKey;
            Object obj4 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objCreateHashTable = obj4;
            i = iIntValue;
        }
        return new RegularImmutableMap<>(objCreateHashTable, objArr, i);
    }

    public static Object get(Object obj2, Object[] objArr, int i, int i2, Object obj3) {
        if (obj3 == null) {
            return null;
        }
        if (i == 1) {
            Object obj4 = objArr[i2];
            Objects.requireNonNull(obj4);
            if (!obj4.equals(obj3)) {
                return null;
            }
            Object obj5 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj5);
            return obj5;
        }
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int iSmear = Hashing.smear(obj3.hashCode());
            while (true) {
                int i3 = iSmear & length;
                int i5 = bArr[i3] & 255;
                if (i5 == 255) {
                    return null;
                }
                if (obj3.equals(objArr[i5])) {
                    return objArr[i5 ^ 1];
                }
                iSmear = i3 + 1;
            }
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int iSmear2 = Hashing.smear(obj3.hashCode());
            while (true) {
                int i6 = iSmear2 & length2;
                int i21 = sArr[i6] & HPKE.aead_EXPORT_ONLY;
                if (i21 == 65535) {
                    return null;
                }
                if (obj3.equals(objArr[i21])) {
                    return objArr[i21 ^ 1];
                }
                iSmear2 = i6 + 1;
            }
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int iSmear3 = Hashing.smear(obj3.hashCode());
            while (true) {
                int i22 = iSmear3 & length3;
                int i32 = iArr[i22];
                if (i32 == -1) {
                    return null;
                }
                if (obj3.equals(objArr[i32])) {
                    return objArr[i32 ^ 1];
                }
                iSmear3 = i22 + 1;
            }
        }
    }
}
