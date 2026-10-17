package c93;

import e93.j0;
import ip0.v7;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements Serializable {

    @NotNull
    public static final k Companion = new k();
    public static final l e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f22290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f22291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22292c;
    public final j0 d;

    static {
        dj0.d.Companion.getClass();
        dj0.d dVar = dj0.d.d;
        e = new l(dVar, dVar, null, null);
    }

    public l(dj0.d total, dj0.d fee2, List list, j0 j0Var) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f22290a = total;
        this.f22291b = fee2;
        this.f22292c = list;
        this.d = j0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f22290a, lVar.f22290a) && Intrinsics.f(this.f22291b, lVar.f22291b) && Intrinsics.f(this.f22292c, lVar.f22292c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f22290a.hashCode() * 31, 31, this.f22291b);
        List list = this.f22292c;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        j0 j0Var = this.d;
        return iHashCode + (j0Var != null ? j0Var.hashCode() : 0);
    }
}
