package icm;

import android.graphics.Bitmap;
import e8.e0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class m implements q8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f160343b;

    public m(int i) {
        switch (i) {
            case 2:
                this.f160343b = Bitmap.CompressFormat.JPEG;
                this.f160342a = 100;
                break;
            default:
                this.f160343b = new int[10];
                break;
        }
    }

    public static m b() {
        m mVar = new m();
        mVar.f160343b = ye.d.DEFAULT;
        return mVar;
    }

    public ye.a a() {
        return new ye.a(this.f160342a, (ye.d) this.f160343b);
    }

    public boolean c(int i) {
        return ((1 << i) & this.f160342a) != 0;
    }

    @Override // q8.a
    public e0 d(e0 e0Var, c8.k kVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) e0Var.get()).compress((Bitmap.CompressFormat) this.f160343b, this.f160342a, byteArrayOutputStream);
        e0Var.recycle();
        return new k8.c(byteArrayOutputStream.toByteArray());
    }

    public void e(int i, int i2) {
        int[] iArr = (int[]) this.f160343b;
        if (i >= iArr.length) {
            return;
        }
        this.f160342a = (1 << i) | this.f160342a;
        iArr[i] = i2;
    }
}
