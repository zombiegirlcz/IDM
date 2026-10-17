package j8;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import c8.k;
import i8.t;
import i8.u;
import md6.s;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f172071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f172072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f172073c;
    public final Class d;

    public d(Context context, u uVar, u uVar2, Class cls) {
        this.f172071a = context.getApplicationContext();
        this.f172072b = uVar;
        this.f172073c = uVar2;
        this.d = cls;
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, k kVar) {
        Uri uri2 = (Uri) obj2;
        return new t(new x8.e(uri2), new c(this.f172071a, this.f172072b, this.f172073c, uri2, i, i2, kVar, this.d));
    }

    @Override // i8.u
    public final boolean b(Object obj2) {
        return Build.VERSION.SDK_INT >= 29 && s.i((Uri) obj2);
    }
}
