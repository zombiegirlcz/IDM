package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import yhm.w;
import zhm.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0014\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001a\u0010\fJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001d\u0010\u0006R\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/collection/MutableFloatObjectMap;", "V", "Landroidx/collection/FloatObjectMap;", "", "initialCapacity", "<init>", "(I)V", "", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "", "key", "findAbsoluteInsertIndex", "(F)I", "hash1", "findFirstAvailableSlot", "(I)I", "value", "set", "(FLjava/lang/Object;)V", "clear", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "growthLimit", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableFloatObjectMap<V> extends FloatObjectMap<V> {
    private int growthLimit;

    public /* synthetic */ MutableFloatObjectMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final int findAbsoluteInsertIndex(float key) {
        int iHashCode = Float.hashCode(key) * (-862048943);
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
            int i33 = i21;
            long j5 = j2 ^ (j3 * 72340172838076673L);
            for (long j16 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i6) & i5;
                if (this.keys[iNumberOfTrailingZeros] == key) {
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
                return iFindFirstAvailableSlot;
            }
            i21 = i33 + 8;
            i6 = (i6 + i21) & i5;
        }
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
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            p.t(jArr, -9187201950435737472L);
        }
        this.metadata = jArr;
        int i = capacity >> 3;
        long j2 = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j2)) | j2;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new float[iMax];
        this.values = new Object[iMax];
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
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        int i;
        float[] fArr;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        float[] fArr2 = this.keys;
        Object[] objArr = this.values;
        int i3 = (i2 + 7) >> 3;
        char c2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr[i5] & (-9187201950435737472L);
            jArr[i5] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int iS = d.S(jArr);
        int i6 = iS - 1;
        long j3 = 72057594037927935L;
        jArr[i6] = (jArr[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr[iS] = jArr[0];
        int i21 = 0;
        while (i21 != i2) {
            int i22 = i21 >> 3;
            int i32 = (i21 & 7) << 3;
            long j5 = (jArr[i22] >> i32) & 255;
            if (j5 != 128 && j5 == 254) {
                int iHashCode = Float.hashCode(fArr2[i21]) * (-862048943);
                int i33 = iHashCode ^ (iHashCode << 16);
                int i43 = i33 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i43);
                int i59 = i43 & i2;
                char c3 = c2;
                long j16 = j3;
                if (((iFindFirstAvailableSlot - i59) & i2) / 8 == ((i21 - i59) & i2) / 8) {
                    jArr[i22] = ((i33 & CertificateBody.profileType) << i32) | ((~(255 << i32)) & jArr[i22]);
                    Intrinsics.checkNotNullParameter(jArr, "<this>");
                    jArr[jArr.length - 1] = (jArr[c3] & j16) | Long.MIN_VALUE;
                    i21++;
                } else {
                    int i66 = iFindFirstAvailableSlot >> 3;
                    long j22 = jArr[i66];
                    int i74 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j22 >> i74) & 255) == 128) {
                        i = i2;
                        fArr = fArr2;
                        jArr[i66] = (j22 & (~(255 << i74))) | (((long) (i33 & CertificateBody.profileType)) << i74);
                        jArr[i22] = (jArr[i22] & (~(255 << i32))) | (128 << i32);
                        fArr[iFindFirstAvailableSlot] = fArr[i21];
                        fArr[i21] = 0.0f;
                        objArr[iFindFirstAvailableSlot] = objArr[i21];
                        objArr[i21] = null;
                    } else {
                        i = i2;
                        fArr = fArr2;
                        jArr[i66] = (((long) (i33 & CertificateBody.profileType)) << i74) | (j22 & (~(255 << i74)));
                        float f = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i21];
                        fArr[i21] = f;
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i21];
                        objArr[i21] = obj2;
                        i21--;
                    }
                    Intrinsics.checkNotNullParameter(jArr, "<this>");
                    jArr[jArr.length - 1] = (jArr[c3] & j16) | Long.MIN_VALUE;
                    i21++;
                    i2 = i;
                    fArr2 = fArr;
                }
                c2 = c3;
                j3 = j16;
            } else {
                i21++;
            }
        }
        initializeGrowth();
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        MutableFloatObjectMap<V> mutableFloatObjectMap = this;
        long[] jArr2 = mutableFloatObjectMap.metadata;
        float[] fArr = mutableFloatObjectMap.keys;
        Object[] objArr = mutableFloatObjectMap.values;
        int i = mutableFloatObjectMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr3 = mutableFloatObjectMap.metadata;
        float[] fArr2 = mutableFloatObjectMap.keys;
        Object[] objArr2 = mutableFloatObjectMap.values;
        int i2 = mutableFloatObjectMap._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                float f = fArr[i3];
                int iHashCode = Float.hashCode(f) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableFloatObjectMap.findFirstAvailableSlot(i5 >>> 7);
                long j2 = i5 & CertificateBody.profileType;
                int i6 = iFindFirstAvailableSlot >> 3;
                int i21 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j3 = (jArr3[i6] & (~(255 << i21))) | (j2 << i21);
                jArr3[i6] = j3;
                jArr3[(((iFindFirstAvailableSlot - 7) & i2) + (i2 & 7)) >> 3] = j3;
                fArr2[iFindFirstAvailableSlot] = f;
                objArr2[iFindFirstAvailableSlot] = objArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            mutableFloatObjectMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(float key, V value) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(key);
        this.keys[iFindAbsoluteInsertIndex] = key;
        this.values[iFindAbsoluteInsertIndex] = value;
    }

    public MutableFloatObjectMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }
}
