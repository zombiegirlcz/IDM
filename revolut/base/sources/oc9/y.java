package oc9;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f224162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f224163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f224164c;
    public final Clause d;
    public final Clause e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f224165g;

    public y(Clause title, Clause clause, Clause mainScreenButtonClause, Clause clause2, List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mainScreenButtonClause, "mainScreenButtonClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f224162a = title;
        this.f224163b = clause;
        this.f224164c = z;
        this.d = mainScreenButtonClause;
        this.e = clause2;
        this.f = items;
        this.f224165g = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f224162a, yVar.f224162a) && Intrinsics.f(this.f224163b, yVar.f224163b) && this.f224164c == yVar.f224164c && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && this.f224165g == yVar.f224165g;
    }

    public final int hashCode() {
        int iHashCode = this.f224162a.hashCode() * 31;
        Clause clause = this.f224163b;
        int iA = p.a.a(j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f224164c), 31, this.d);
        Clause clause2 = this.e;
        return Boolean.hashCode(this.f224165g) + p.a.d((iA + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.f);
    }
}
