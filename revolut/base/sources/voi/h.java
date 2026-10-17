package voi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij0.a f290972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kn0.a f290973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo0.l f290974c;
    public final fni.a d;
    public final ui0.l e;

    public h(h21.a networkConfiguration, kn0.a signingKeyProvider, jo0.l uiKitIllustrationsContext, fni.a nativeValuesProvider, ui0.l lVar) {
        Intrinsics.checkNotNullParameter("com.revolut.revolut", "applicationId");
        Intrinsics.checkNotNullParameter("10.151", "appVersionName");
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        Intrinsics.checkNotNullParameter(signingKeyProvider, "signingKeyProvider");
        Intrinsics.checkNotNullParameter(uiKitIllustrationsContext, "uiKitIllustrationsContext");
        Intrinsics.checkNotNullParameter(nativeValuesProvider, "nativeValuesProvider");
        this.f290972a = networkConfiguration;
        this.f290973b = signingKeyProvider;
        this.f290974c = uiKitIllustrationsContext;
        this.d = nativeValuesProvider;
        this.e = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f290972a, hVar.f290972a) && this.f290973b.equals(hVar.f290973b) && this.f290974c == hVar.f290974c && this.d.equals(hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.d.hashCode() + j6.a.c((this.f290974c.hashCode() + j6.a.c(j6.a.c(j6.a.c((this.f290973b.hashCode() + ((this.f290972a.hashCode() + ((((Integer.hashCode(1030151101) - 1820720091) * 31) + 1867510430) * 31)) * 31)) * 31, 31, false), 31, false), 31, false)) * 31, 31, false)) * 31, 31, true);
        ui0.l lVar = this.e;
        return iC + (lVar != null ? lVar.hashCode() : 0);
    }
}
