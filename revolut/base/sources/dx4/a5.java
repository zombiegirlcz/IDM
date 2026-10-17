package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z4 f120549c;
    public final l d;

    public a5(String title, String description, z4 status, l lVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f120547a = title;
        this.f120548b = description;
        this.f120549c = status;
        this.d = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj2;
        return Intrinsics.f(this.f120547a, a5Var.f120547a) && Intrinsics.f(this.f120548b, a5Var.f120548b) && Intrinsics.f(this.f120549c, a5Var.f120549c) && Intrinsics.f(this.d, a5Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f120549c.hashCode() + p.a.c(this.f120547a.hashCode() * 31, 31, this.f120548b)) * 31;
        l lVar = this.d;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}
