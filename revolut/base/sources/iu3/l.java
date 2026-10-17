package iu3;

import dx4.z2;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f168485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f168486c;

    public l(String title, z2 z2Var, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168484a = title;
        this.f168485b = z2Var;
        this.f168486c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f168484a, lVar.f168484a) && Intrinsics.f(this.f168485b, lVar.f168485b) && this.f168486c.equals(lVar.f168486c);
    }

    public final int hashCode() {
        int iHashCode = this.f168484a.hashCode() * 31;
        z2 z2Var = this.f168485b;
        return this.f168486c.hashCode() + ((iHashCode + (z2Var == null ? 0 : z2Var.hashCode())) * 31);
    }
}
