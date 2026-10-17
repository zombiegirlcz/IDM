package xy3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f309569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f309570c;
    public final String d;
    public final dj0.d e;

    public f(String id10, a1 a1Var, String title, String description, dj0.d leftToRepay) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(leftToRepay, "leftToRepay");
        this.f309568a = id10;
        this.f309569b = a1Var;
        this.f309570c = title;
        this.d = description;
        this.e = leftToRepay;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f309568a, fVar.f309568a) && this.f309569b == fVar.f309569b && Intrinsics.f(this.f309570c, fVar.f309570c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f309568a.hashCode() * 31;
        a1 a1Var = this.f309569b;
        return this.e.hashCode() + p.a.c(p.a.c((iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31, 31, this.f309570c), 31, this.d);
    }
}
