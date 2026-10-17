package eg;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f125406a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f125407b = ve.b.c("packageName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f125408c = ve.b.c("versionName");
    public static final ve.b d = ve.b.c("appBuildVersion");
    public static final ve.b e = ve.b.c("deviceManufacturer");
    public static final ve.b f = ve.b.c("currentProcessDetails");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f125409g = ve.b.c("appProcessDetails");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        a aVar = (a) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f125407b, aVar.f125392a);
        dVar.add(f125408c, aVar.f125393b);
        dVar.add(d, aVar.f125394c);
        dVar.add(e, Build.MANUFACTURER);
        dVar.add(f, aVar.d);
        dVar.add(f125409g, aVar.e);
    }
}
