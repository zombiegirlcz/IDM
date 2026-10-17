package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import yhm.w;
import zhm.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u001e\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010 \u001a\u00020\nH\u0000¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\"\u0010\u0007J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\u0007J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0007J\u000f\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010\u001aJ\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/collection/MutableScatterMap;", "K", "V", "Landroidx/collection/ScatterMap;", "", "initialCapacity", "<init>", "(I)V", "key", "value", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "(Landroidx/collection/ScatterMap;)V", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "removeValueAt", "(I)Ljava/lang/Object;", "clear", "()V", "findInsertIndex", "(Ljava/lang/Object;)I", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "hash1", "findFirstAvailableSlot", "(I)I", "growthLimit", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    private int growthLimit;

    public MutableScatterMap() {
        this(0, 1, null);
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i = this._capacity;
        int i2 = hash1 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i5 = i2 >> 3;
            int i6 = (i2 & 7) << 3;
            long j2 = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j3 = j2 & ((~j2) << 7) & (-9187201950435737472L);
            if (j3 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j3) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            p.t(jArr2, -9187201950435737472L);
            int i = capacity >> 3;
            long j2 = 255 << ((capacity & 7) << 3);
            jArr2[i] = (jArr2[i] & (~j2)) | j2;
            jArr = jArr2;
        }
        this.metadata = jArr;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        this.values = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
    }

    public final void adjustStorage$collection() {
        int i = this._capacity;
        if (i > 8) {
            long j2 = this._size;
            w.Companion companion = w.INSTANCE;
            if (Long.compareUnsigned(j2 * 32, ((long) i) * 25) <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            p.t(jArr, -9187201950435737472L);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j2 = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j2)) | j2;
        }
        p.p(this.values, 0, this._capacity, null);
        p.p(this.keys, 0, this._capacity, null);
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        int i;
        Object[] objArr;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        int i3 = (i2 + 7) >> 3;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr[i6] & (-9187201950435737472L);
            jArr[i6] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int iS = d.S(jArr);
        int i21 = iS - 1;
        jArr[i21] = (jArr[i21] & 72057594037927935L) | (-72057594037927936L);
        jArr[iS] = jArr[0];
        int i22 = 0;
        while (i22 != i2) {
            int i32 = i22 >> 3;
            int i33 = (i22 & 7) << 3;
            long j3 = (jArr[i32] >> i33) & 255;
            if (j3 != 128 && j3 == 254) {
                Object obj2 = objArr2[i22];
                int iHashCode = (obj2 != null ? obj2.hashCode() : i5) * (-862048943);
                int i43 = iHashCode ^ (iHashCode << 16);
                int i59 = i43 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i59);
                int i66 = i59 & i2;
                int i74 = i5;
                if (((iFindFirstAvailableSlot - i66) & i2) / 8 == ((i22 - i66) & i2) / 8) {
                    jArr[i32] = (((long) (i43 & CertificateBody.profileType)) << i33) | (jArr[i32] & (~(255 << i33)));
                    Intrinsics.checkNotNullParameter(jArr, "<this>");
                    jArr[jArr.length - 1] = jArr[i74];
                    i22++;
                } else {
                    int i92 = iFindFirstAvailableSlot >> 3;
                    long j5 = jArr[i92];
                    int i96 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j5 >> i96) & 255) == 128) {
                        i = i2;
                        objArr = objArr2;
                        jArr[i92] = (j5 & (~(255 << i96))) | (((long) (i43 & CertificateBody.profileType)) << i96);
                        jArr[i32] = (jArr[i32] & (~(255 << i33))) | (128 << i33);
                        objArr[iFindFirstAvailableSlot] = objArr[i22];
                        objArr[i22] = null;
                        objArr3[iFindFirstAvailableSlot] = objArr3[i22];
                        objArr3[i22] = null;
                    } else {
                        i = i2;
                        objArr = objArr2;
                        jArr[i92] = (((long) (i43 & CertificateBody.profileType)) << i96) | (j5 & (~(255 << i96)));
                        Object obj3 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i22];
                        objArr[i22] = obj3;
                        Object obj4 = objArr3[iFindFirstAvailableSlot];
                        objArr3[iFindFirstAvailableSlot] = objArr3[i22];
                        objArr3[i22] = obj4;
                        i22--;
                    }
                    Intrinsics.checkNotNullParameter(jArr, "<this>");
                    jArr[jArr.length - 1] = jArr[i74];
                    i22++;
                    i2 = i;
                    objArr2 = objArr;
                }
                i5 = i74;
            } else {
                i22++;
            }
        }
        initializeGrowth();
    }

    public final int findInsertIndex(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & CertificateBody.profileType;
        int i5 = this._capacity;
        int i6 = i2 & i5;
        int i21 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i22 = i6 >> 3;
            int i32 = (i6 & 7) << 3;
            long j2 = ((jArr[i22 + 1] << (64 - i32)) & ((-i32) >> 63)) | (jArr[i22] >>> i32);
            long j3 = i3;
            int i33 = i3;
            long j5 = j2 ^ (j3 * 72340172838076673L);
            for (long j16 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j16) >> 3)) & i5;
                if (Intrinsics.f(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this._size++;
                int i43 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i59 = iFindFirstAvailableSlot >> 3;
                long j22 = jArr2[i59];
                int i66 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i43 - (((j22 >> i66) & 255) == 128 ? 1 : 0);
                int i74 = this._capacity;
                long j42 = ((~(255 << i66)) & j22) | (j3 << i66);
                jArr2[i59] = j42;
                jArr2[(((iFindFirstAvailableSlot - 7) & i74) + (i74 & 7)) >> 3] = j42;
                return ~iFindFirstAvailableSlot;
            }
            i21 += 8;
            i6 = (i6 + i21) & i5;
            i3 = i33;
        }
    }

    public final V put(K key, V value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v = (V) objArr[iFindInsertIndex];
        this.keys[iFindInsertIndex] = key;
        objArr[iFindInsertIndex] = value;
        return v;
    }

    public final void putAll(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(K r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L61
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.keys
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r14)
            if (r11 == 0) goto L5b
            goto L6b
        L5b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L42
        L61:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L74
            r10 = -1
        L6b:
            if (r10 < 0) goto L72
            java.lang.Object r14 = r13.removeValueAt(r10)
            return r14
        L72:
            r14 = 0
            return r14
        L74:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object):java.lang.Object");
    }

    public final V removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j2 = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j2;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j2;
        this.keys[index] = null;
        Object[] objArr = this.values;
        V v = (V) objArr[index];
        objArr[index] = null;
        return v;
    }

    public final void resizeStorage$collection(int newCapacity) {
        int i;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i2 = this._capacity;
        initializeStorage(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i3 = this._capacity;
        int i5 = 0;
        while (i5 < i2) {
            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj2 = objArr[i5];
                int iHashCode = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i6 >>> 7);
                i = i5;
                long j2 = i6 & CertificateBody.profileType;
                int i21 = iFindFirstAvailableSlot >> 3;
                int i22 = (iFindFirstAvailableSlot & 7) << 3;
                long j3 = (j2 << i22) | (jArr2[i21] & (~(255 << i22)));
                jArr2[i21] = j3;
                jArr2[(((iFindFirstAvailableSlot - 7) & i3) + (i3 & 7)) >> 3] = j3;
                objArr3[iFindFirstAvailableSlot] = obj2;
                objArr4[iFindFirstAvailableSlot] = objArr2[i];
            } else {
                i = i5;
            }
            i5 = i + 1;
        }
    }

    public final void set(K key, V value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
    }

    public /* synthetic */ MutableScatterMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableScatterMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j2 = jArr[i];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i << 3) + i3;
                        set(objArr[i5], objArr2[i5]);
                    }
                    j2 >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
