package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120550a;

    public b(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f120550a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f120550a, ((b) obj2).f120550a);
    }

    public final int hashCode() {
        return this.f120550a.hashCode();
    }

    @Override // dx4.l
    public final String j() {
        return p.a.p("Deeplink(deeplink=", this.f120550a, ")");
    }
}
