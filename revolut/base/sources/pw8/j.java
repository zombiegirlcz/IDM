package pw8;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f240350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f240351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f240352c;
    public final Clause d;
    public final boolean e;

    public j(ArrayList items, Clause navBarTitle, Clause clause, Clause clause2, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f240350a = items;
        this.f240351b = navBarTitle;
        this.f240352c = clause;
        this.d = clause2;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f240350a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f240350a.equals(jVar.f240350a) && Intrinsics.f(this.f240351b, jVar.f240351b) && Intrinsics.f(this.f240352c, jVar.f240352c) && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f240350a.hashCode() * 31, 31, this.f240351b);
        Clause clause = this.f240352c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
