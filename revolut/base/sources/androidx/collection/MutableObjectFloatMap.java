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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u000f\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001e\u0010\u0006R\u0016\u0010 \u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/collection/MutableObjectFloatMap;", "K", "Landroidx/collection/ObjectFloatMap;", "", "initialCapacity", "<init>", "(I)V", "", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "key", "findIndex", "(Ljava/lang/Object;)I", "hash1", "findFirstAvailableSlot", "(I)I", "", "value", "set", "(Ljava/lang/Object;F)V", "index", "removeValueAt", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "growthLimit", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableObjectFloatMap<K> extends ObjectFloatMap<K> {
    private int growthLimit;

    public /* synthetic */ MutableObjectFloatMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
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

    private final int findIndex(K key) {
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
        this.keys = new Object[iMax];
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

    public final void dropDeletes$collection() {
        int i;
        Object[] objArr;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        Object[] objArr2 = this.keys;
        float[] fArr = this.values;
        int i3 = (i2 + 7) >> 3;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr[i6] & (-9187201950435737472L);
            jArr[i6] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int iS = d.S(jArr);
        int i21 = iS - 1;
        long j3 = 72057594037927935L;
        jArr[i21] = (jArr[i21] & 72057594037927935L) | (-72057594037927936L);
        jArr[iS] = jArr[0];
        int i22 = 0;
        while (i22 != i2) {
            int i32 = i22 >> 3;
            int i33 = (i22 & 7) << 3;
            long j5 = (jArr[i32] >> i33) & 255;
            if (j5 != 128 && j5 == 254) {
                Object obj2 = objArr2[i22];
                int iHashCode = (obj2 != null ? obj2.hashCode() : i5) * (-862048943);
                int i43 = iHashCode ^ (iHashCode << 16);
                int i59 = i43 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i59);
                int i66 = i59 & i2;
                int i74 = i5;
                long j16 = j3;
                if (((iFindFirstAvailableSlot - i66) & i2) / 8 == ((i22 - i66) & i2) / 8) {
                    jArr[i32] = (((long) (i43 & CertificateBody.profileType)) << i33) | ((~(255 << i33)) & jArr[i32]);
                    Intrinsics.checkNotNullParameter(jArr, "<this>");
                    jArr[jArr.length - 1] = (jArr[i74] & j16) | Long.MIN_VALUE;
                    i22++;
                } else {
                    int i92 = iFindFirstAvailableSlot >> 3;
                    long j22 = jArr[i92];
                    int i96 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j22 >> i96) & 255) == 128) {
                        i = i2;
                        objArr = objArr2;
                        jArr[i92] = (j22 & (~(255 << i96))) | (((long) (i43 & CertificateBody.profileType)) << i96);
                        jArr[i32] = (jArr[i32] & (~(255 << i33))) | (128 << i33);
                        objArr[iFindFirstAvailableSlot] = objArr[i22];
                        objArr[i22] = null;
                        fArr[iFindFirstAvailableSlot] = fArr[i22];
                        fArr[i22] = 0.0f;
                    } else {
                        i = i2;
                        objArr = objArr2;
                        jArr[i92] = (((long) (i43 & CertificateBody.profileType)) << i96) | (j22 & (~(255 << i96)));
                        Object obj3 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i22];
                        objArr[i22] = obj3;
                        float f = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i22];
                        fArr[i22] = f;
                        i22--;
                    }
                    Intrinsics.checkNotNullParameter(jArr, "<this>");
                    jArr[jArr.length - 1] = (jArr[i74] & j16) | Long.MIN_VALUE;
                    i22++;
                    i2 = i;
                    objArr2 = objArr;
                }
                i5 = i74;
                j3 = j16;
            } else {
                i22++;
            }
        }
        initializeGrowth();
    }

    public final void removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j2 = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j2;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j2;
        this.keys[index] = null;
    }

    public final void resizeStorage$collection(int newCapacity) {
        int i;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        int i2 = this._capacity;
        initializeStorage(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        float[] fArr2 = this.values;
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
                objArr2[iFindFirstAvailableSlot] = obj2;
                fArr2[iFindFirstAvailableSlot] = fArr[i];
            } else {
                i = i5;
            }
            i5 = i + 1;
        }
    }

    public final void set(K key, float value) {
        int iFindIndex = findIndex(key);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        }
        this.keys[iFindIndex] = key;
        this.values[iFindIndex] = value;
    }

    public MutableObjectFloatMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }
}
