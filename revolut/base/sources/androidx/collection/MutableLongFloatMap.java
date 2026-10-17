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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u0005R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/collection/MutableLongFloatMap;", "Landroidx/collection/LongFloatMap;", "", "initialCapacity", "<init>", "(I)V", "", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "", "key", "findInsertIndex", "(J)I", "hash1", "findFirstAvailableSlot", "(I)I", "", "value", "set", "(JF)V", "put", "clear", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "growthLimit", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableLongFloatMap extends LongFloatMap {
    private int growthLimit;

    public MutableLongFloatMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
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

    private final int findInsertIndex(long key) {
        int iHashCode = Long.hashCode(key) * (-862048943);
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
                return ~iFindFirstAvailableSlot;
            }
            i21 = i33 + 8;
            i6 = (i6 + i21) & i5;
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
        this.keys = new long[iMax];
        this.values = new float[iMax];
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
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        int i;
        long[] jArr;
        long[] jArr2 = this.metadata;
        int i2 = this._capacity;
        long[] jArr3 = this.keys;
        float[] fArr = this.values;
        int i3 = (i2 + 7) >> 3;
        char c2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr2[i5] & (-9187201950435737472L);
            jArr2[i5] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int iS = d.S(jArr2);
        int i6 = iS - 1;
        long j3 = 72057594037927935L;
        jArr2[i6] = (jArr2[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr2[iS] = jArr2[0];
        int i21 = 0;
        while (i21 != i2) {
            int i22 = i21 >> 3;
            int i32 = (i21 & 7) << 3;
            long j5 = (jArr2[i22] >> i32) & 255;
            if (j5 != 128 && j5 == 254) {
                int iHashCode = Long.hashCode(jArr3[i21]) * (-862048943);
                int i33 = iHashCode ^ (iHashCode << 16);
                int i43 = i33 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i43);
                int i59 = i43 & i2;
                char c3 = c2;
                long j16 = j3;
                if (((iFindFirstAvailableSlot - i59) & i2) / 8 == ((i21 - i59) & i2) / 8) {
                    jArr2[i22] = ((i33 & CertificateBody.profileType) << i32) | ((~(255 << i32)) & jArr2[i22]);
                    Intrinsics.checkNotNullParameter(jArr2, "<this>");
                    jArr2[jArr2.length - 1] = (jArr2[c3] & j16) | Long.MIN_VALUE;
                    i21++;
                } else {
                    int i66 = iFindFirstAvailableSlot >> 3;
                    long j22 = jArr2[i66];
                    int i74 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j22 >> i74) & 255) == 128) {
                        i = i2;
                        jArr = jArr3;
                        jArr2[i66] = (j22 & (~(255 << i74))) | (((long) (i33 & CertificateBody.profileType)) << i74);
                        jArr2[i22] = (jArr2[i22] & (~(255 << i32))) | (128 << i32);
                        jArr[iFindFirstAvailableSlot] = jArr[i21];
                        jArr[i21] = 0;
                        fArr[iFindFirstAvailableSlot] = fArr[i21];
                        fArr[i21] = 0.0f;
                    } else {
                        i = i2;
                        jArr = jArr3;
                        jArr2[i66] = (((long) (i33 & CertificateBody.profileType)) << i74) | (j22 & (~(255 << i74)));
                        long j42 = jArr[iFindFirstAvailableSlot];
                        jArr[iFindFirstAvailableSlot] = jArr[i21];
                        jArr[i21] = j42;
                        float f = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i21];
                        fArr[i21] = f;
                        i21--;
                    }
                    Intrinsics.checkNotNullParameter(jArr2, "<this>");
                    jArr2[jArr2.length - 1] = (jArr2[c3] & j16) | Long.MIN_VALUE;
                    i21++;
                    i2 = i;
                    jArr3 = jArr;
                }
                c2 = c3;
                j3 = j16;
            } else {
                i21++;
            }
        }
        initializeGrowth();
    }

    public final void put(long key, float value) {
        set(key, value);
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        MutableLongFloatMap mutableLongFloatMap = this;
        long[] jArr2 = mutableLongFloatMap.metadata;
        long[] jArr3 = mutableLongFloatMap.keys;
        float[] fArr = mutableLongFloatMap.values;
        int i = mutableLongFloatMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr4 = mutableLongFloatMap.metadata;
        long[] jArr5 = mutableLongFloatMap.keys;
        float[] fArr2 = mutableLongFloatMap.values;
        int i2 = mutableLongFloatMap._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j2 = jArr3[i3];
                int iHashCode = Long.hashCode(j2) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableLongFloatMap.findFirstAvailableSlot(i5 >>> 7);
                long j3 = i5 & CertificateBody.profileType;
                int i6 = iFindFirstAvailableSlot >> 3;
                int i21 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j5 = (jArr4[i6] & (~(255 << i21))) | (j3 << i21);
                jArr4[i6] = j5;
                jArr4[(((iFindFirstAvailableSlot - 7) & i2) + (i2 & 7)) >> 3] = j5;
                jArr5[iFindFirstAvailableSlot] = j2;
                fArr2[iFindFirstAvailableSlot] = fArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            mutableLongFloatMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(long key, float value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
    }

    public /* synthetic */ MutableLongFloatMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }
}
