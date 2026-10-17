package ou3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f229803c;
    public final a1 d;
    public final l e;
    public final f f;

    public m(String title, String description, int i, a1 icon, l status, f fVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f229801a = title;
        this.f229802b = description;
        this.f229803c = i;
        this.d = icon;
        this.e = status;
        this.f = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f229801a, mVar.f229801a) && Intrinsics.f(this.f229802b, mVar.f229802b) && this.f229803c == mVar.f229803c && this.d == mVar.d && this.e == mVar.e && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + j6.a.b(this.f229803c, p.a.c(this.f229801a.hashCode() * 31, 31, this.f229802b), 31)) * 31)) * 31;
        f fVar = this.f;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }
}
