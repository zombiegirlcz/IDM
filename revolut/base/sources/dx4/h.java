package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f120610a;

    public h(z2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f120610a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f120610a, ((h) obj2).f120610a);
    }

    public final int hashCode() {
        return this.f120610a.hashCode();
    }

    @Override // dx4.l
    public final String j() {
        return p.a.p("ShowInfoPopup(title=", this.f120610a.f120860a, ")");
    }
}
