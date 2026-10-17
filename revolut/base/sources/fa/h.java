package fa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f133009c;
    public final m d;
    public final c e;
    public final boolean f;

    public h(String title, String str, g avatar, m status, c cVar, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f133007a = title;
        this.f133008b = str;
        this.f133009c = avatar;
        this.d = status;
        this.e = cVar;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f133007a, hVar.f133007a) && Intrinsics.f(this.f133008b, hVar.f133008b) && Intrinsics.f(this.f133009c, hVar.f133009c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f133007a.hashCode() * 31;
        String str = this.f133008b;
        int iHashCode2 = (this.d.hashCode() + ((this.f133009c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        c cVar = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = v0.a.m("Cell(title=", this.f133007a, ", description=", this.f133008b, ", avatar=");
        sbM.append(this.f133009c);
        sbM.append(", status=");
        sbM.append(this.d);
        sbM.append(", action=");
        sbM.append(this.e);
        sbM.append(", required=");
        sbM.append(this.f);
        sbM.append(")");
        return sbM.toString();
    }
}
