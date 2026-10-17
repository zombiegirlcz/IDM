package olm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.EnumDescriptor;
import yhm.s;
import yhm.u;
import yhm.w;
import yhm.z;

/* JADX INFO: loaded from: classes14.dex */
public final class h implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226482a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f226483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f226484c;

    public h(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f226484c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f226482a) {
            case 0:
                if (this.f226483b > 0) {
                }
                break;
            case 1:
                if (this.f226483b < ((byte[]) this.f226484c).length) {
                }
                break;
            case 2:
                if (this.f226483b < ((int[]) this.f226484c).length) {
                }
                break;
            case 3:
                if (this.f226483b < ((long[]) this.f226484c).length) {
                }
                break;
            default:
                if (this.f226483b < ((short[]) this.f226484c).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f226482a) {
            case 0:
                EnumDescriptor enumDescriptor = (EnumDescriptor) this.f226484c;
                int i = enumDescriptor.f187943c;
                int i2 = this.f226483b;
                this.f226483b = i2 - 1;
                return enumDescriptor.e[i - i2];
            case 1:
                int i3 = this.f226483b;
                byte[] bArr = (byte[]) this.f226484c;
                if (i3 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f226483b));
                }
                this.f226483b = i3 + 1;
                return new s(bArr[i3]);
            case 2:
                int i5 = this.f226483b;
                int[] iArr = (int[]) this.f226484c;
                if (i5 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f226483b));
                }
                this.f226483b = i5 + 1;
                return new u(iArr[i5]);
            case 3:
                int i6 = this.f226483b;
                long[] jArr = (long[]) this.f226484c;
                if (i6 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f226483b));
                }
                this.f226483b = i6 + 1;
                return new w(jArr[i6]);
            default:
                int i21 = this.f226483b;
                short[] sArr = (short[]) this.f226484c;
                if (i21 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f226483b));
                }
                this.f226483b = i21 + 1;
                return new z(sArr[i21]);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f226482a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f226484c = array;
    }

    public h(long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f226484c = array;
    }

    public h(short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f226484c = array;
    }

    public h(EnumDescriptor enumDescriptor) {
        this.f226484c = enumDescriptor;
        this.f226483b = enumDescriptor.f187943c;
    }
}
