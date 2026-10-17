package yoj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f315689c;

    public g(String id10, String inviteeId, String inviteeFullName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(inviteeId, "inviteeId");
        Intrinsics.checkNotNullParameter(inviteeFullName, "inviteeFullName");
        this.f315687a = id10;
        this.f315688b = inviteeId;
        this.f315689c = inviteeFullName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f315687a, gVar.f315687a) && Intrinsics.f(this.f315688b, gVar.f315688b) && Intrinsics.f(this.f315689c, gVar.f315689c);
    }

    public final int hashCode() {
        return this.f315689c.hashCode() + p.a.c(this.f315687a.hashCode() * 31, 31, this.f315688b);
    }
}
