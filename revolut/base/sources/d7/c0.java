package d7;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes16.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111645c;
    public final String d;
    public final String e;
    public Bitmap f;

    public c0(String str, int i, int i2, String str2, String str3) {
        this.f111643a = i;
        this.f111644b = i2;
        this.f111645c = str;
        this.d = str2;
        this.e = str3;
    }

    public final c0 a(float f) {
        int i = (int) (this.f111643a * f);
        int i2 = (int) (this.f111644b * f);
        c0 c0Var = new c0(this.f111645c, i, i2, this.d, this.e);
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            c0Var.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        }
        return c0Var;
    }

    public final Bitmap b() {
        return this.f;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.f111644b;
    }

    public final String e() {
        return this.f111645c;
    }

    public final int f() {
        return this.f111643a;
    }

    public final void g(Bitmap bitmap) {
        this.f = bitmap;
    }
}
