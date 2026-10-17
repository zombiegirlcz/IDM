package ei;

import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f126323c;
    public Object[] d;

    public void a(Disposable disposable) {
        Object obj2;
        Object obj3;
        Object[] objArr = this.d;
        int i = this.f126321a;
        int iHashCode = disposable.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj4 = objArr[i2];
        if (obj4 != null) {
            if (obj4.equals(disposable)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj3 = objArr[i2];
                if (obj3 == null) {
                }
            } while (!obj3.equals(disposable));
            return;
        }
        objArr[i2] = disposable;
        int i3 = this.f126322b + 1;
        this.f126322b = i3;
        if (i3 < this.f126323c) {
            return;
        }
        Object[] objArr2 = this.d;
        int length = objArr2.length;
        int i5 = length << 1;
        int i6 = i5 - 1;
        Object[] objArr3 = new Object[i5];
        while (true) {
            int i21 = i3 - 1;
            if (i3 == 0) {
                this.f126321a = i6;
                this.f126323c = (int) (i5 * 0.75f);
                this.d = objArr3;
                return;
            }
            do {
                length--;
                obj2 = objArr2[length];
            } while (obj2 == null);
            int iHashCode2 = obj2.hashCode() * (-1640531527);
            int i22 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i6;
            if (objArr3[i22] != null) {
                do {
                    i22 = (i22 + 1) & i6;
                } while (objArr3[i22] != null);
            }
            objArr3[i22] = objArr2[length];
            i3 = i21;
        }
    }

    public b b() {
        return ((b[]) this.d)[this.f126321a];
    }

    public byte[][] c(int i, int i2) {
        int i3 = this.f126322b;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3 * i2, this.f126323c * i);
        int i5 = i3 * i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i21 = (i5 - i6) - 1;
            byte[] bArr2 = ((b[]) this.d)[i6 / i2].f126324a;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i22 = 0; i22 < length; i22++) {
                bArr3[i22] = bArr2[i22 / i];
            }
            bArr[i21] = bArr3;
        }
        return bArr;
    }

    public void d(int i, int i2, Object[] objArr) {
        int i3;
        Object obj2;
        this.f126322b--;
        while (true) {
            int i5 = i + 1;
            while (true) {
                i3 = i5 & i2;
                obj2 = objArr[i3];
                if (obj2 == null) {
                    objArr[i] = null;
                    return;
                }
                int iHashCode = obj2.hashCode() * (-1640531527);
                int i6 = (iHashCode ^ (iHashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i6 || i6 > i3) {
                        break;
                    } else {
                        i5 = i3 + 1;
                    }
                } else if (i < i6 || i6 <= i3) {
                    i5 = i3 + 1;
                }
            }
            objArr[i] = obj2;
            i = i3;
        }
    }
}
