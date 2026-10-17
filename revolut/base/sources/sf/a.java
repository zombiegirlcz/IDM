package sf;

import xf.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qf.a f262243b = qf.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f262244a;

    public a(k kVar) {
        this.f262244a = kVar;
    }

    @Override // sf.e
    public final boolean a() {
        qf.a aVar = f262243b;
        k kVar = this.f262244a;
        if (kVar == null) {
            aVar.f("ApplicationInfo is null");
        } else if (!kVar.hasGoogleAppId()) {
            aVar.f("GoogleAppId is null");
        } else if (!kVar.hasAppInstanceId()) {
            aVar.f("AppInstanceId is null");
        } else if (!kVar.hasApplicationProcessState()) {
            aVar.f("ApplicationProcessState is null");
        } else {
            if (!kVar.hasAndroidAppInfo()) {
                return true;
            }
            if (!kVar.getAndroidAppInfo().hasPackageName()) {
                aVar.f("AndroidAppInfo.packageName is null");
            } else {
                if (kVar.getAndroidAppInfo().hasSdkVersion()) {
                    return true;
                }
                aVar.f("AndroidAppInfo.sdkVersion is null");
            }
        }
        aVar.f("ApplicationInfo is invalid");
        return false;
    }
}
