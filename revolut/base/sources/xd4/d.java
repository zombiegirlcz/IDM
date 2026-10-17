package xd4;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f304259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f304260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f304261c;
    public final boolean d;
    public final boolean e;
    public final List f;

    public d(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f304259a = title;
        this.f304260b = textLocalisedClause;
        this.f304261c = textLocalisedClause2;
        this.d = z;
        this.e = z3;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f304259a, dVar.f304259a) && Intrinsics.f(this.f304260b, dVar.f304260b) && Intrinsics.f(this.f304261c, dVar.f304261c) && this.d == dVar.d && this.e == dVar.e && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f304259a.hashCode() * 31;
        TextLocalisedClause textLocalisedClause = this.f304260b;
        int iHashCode2 = (iHashCode + (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode())) * 31;
        Clause clause = this.f304261c;
        return this.f.hashCode() + j6.a.c(j6.a.c((iHashCode2 + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }
}
