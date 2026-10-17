package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f120601a;

    public g(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f120601a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f120601a, ((g) obj2).f120601a);
    }

    public final int hashCode() {
        return this.f120601a.hashCode();
    }

    @Override // dx4.l
    public final String j() {
        return p.a.p("ShowFullScreenInfoPopup(title=", this.f120601a.f120553a, ")");
    }
}
