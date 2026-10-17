package eg;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f125413a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f125414b = ve.b.c("appId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f125415c = ve.b.c("deviceModel");
    public static final ve.b d = ve.b.c("sessionSdkVersion");
    public static final ve.b e = ve.b.c("osVersion");
    public static final ve.b f = ve.b.c("logEnvironment");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f125416g = ve.b.c("androidAppInfo");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        b bVar = (b) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f125414b, bVar.f125401a);
        dVar.add(f125415c, Build.MODEL);
        dVar.add(d, "2.1.2");
        dVar.add(e, Build.VERSION.RELEASE);
        dVar.add(f, bVar.f125402b);
        dVar.add(f125416g, bVar.f125403c);
    }
}
