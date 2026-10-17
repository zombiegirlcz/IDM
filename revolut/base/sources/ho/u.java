package ho;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154196a;

    public /* synthetic */ u(String str) {
        this.f154196a = str;
    }

    @Override // ho.w
    public final String a() {
        return this.f154196a;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof u) {
            return Intrinsics.f(this.f154196a, ((u) obj2).f154196a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f154196a.hashCode();
    }

    public final String toString() {
        return p.a.p("IndividualIdentity(individualId=", p.a.p("IndividualIdentityId(value=", this.f154196a, ")"), ")");
    }
}
