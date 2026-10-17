package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u2 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f120787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120788c;

    public u2(String id10, t2 contentType, String url2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f120786a = id10;
        this.f120787b = contentType;
        this.f120788c = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj2;
        return Intrinsics.f(this.f120786a, u2Var.f120786a) && this.f120787b == u2Var.f120787b && Intrinsics.f(this.f120788c, u2Var.f120788c);
    }

    public final int hashCode() {
        return this.f120788c.hashCode() + ((this.f120787b.hashCode() + (this.f120786a.hashCode() * 31)) * 31);
    }
}
