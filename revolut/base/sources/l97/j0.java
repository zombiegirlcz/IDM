package l97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o97.y f193075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193076c;

    public j0(String listId, o97.y payload, String query) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f193074a = listId;
        this.f193075b = payload;
        this.f193076c = query;
    }

    @Override // l97.l0
    public final o97.y a() {
        return this.f193075b;
    }

    @Override // l97.l0
    public final String b() {
        return this.f193074a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f193074a, j0Var.f193074a) && Intrinsics.f(this.f193075b, j0Var.f193075b) && Intrinsics.f(this.f193076c, j0Var.f193076c);
    }

    public final int hashCode() {
        return this.f193076c.hashCode() + ((this.f193075b.hashCode() + (this.f193074a.hashCode() * 31)) * 31);
    }
}
