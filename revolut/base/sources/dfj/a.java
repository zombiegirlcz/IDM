package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kej.a f113901b;

    public a(String iccId, kej.a esimApnConfig) {
        Intrinsics.checkNotNullParameter(iccId, "iccId");
        Intrinsics.checkNotNullParameter(esimApnConfig, "esimApnConfig");
        this.f113900a = iccId;
        this.f113901b = esimApnConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f113900a, aVar.f113900a) && Intrinsics.f(this.f113901b, aVar.f113901b);
    }

    public final int hashCode() {
        return this.f113901b.hashCode() + (this.f113900a.hashCode() * 31);
    }
}
