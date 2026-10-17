package wxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f300890c;
    public final h d;

    public u(String id10, String title, x content, h hVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f300888a = id10;
        this.f300889b = title;
        this.f300890c = content;
        this.d = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f300888a, uVar.f300888a) && Intrinsics.f(this.f300889b, uVar.f300889b) && Intrinsics.f(this.f300890c, uVar.f300890c) && Intrinsics.f(this.d, uVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f300890c.hashCode() + p.a.c(this.f300888a.hashCode() * 31, 31, this.f300889b)) * 31;
        h hVar = this.d;
        return iHashCode + (hVar == null ? 0 : hVar.f300862a.hashCode());
    }
}
