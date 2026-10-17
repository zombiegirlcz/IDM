package x64;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f303044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f303045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f303046c;
    public final Clause d;
    public final boolean e;
    public final boolean f;

    public o(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f303044a = items;
        this.f303045b = title;
        this.f303046c = textLocalisedClause;
        this.d = textLocalisedClause2;
        this.e = z;
        this.f = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f303044a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f303044a, oVar.f303044a) && Intrinsics.f(this.f303045b, oVar.f303045b) && Intrinsics.f(this.f303046c, oVar.f303046c) && Intrinsics.f(this.d, oVar.d) && this.e == oVar.e && this.f == oVar.f;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f303044a.hashCode() * 31, 31, this.f303045b);
        Clause clause = this.f303046c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return Boolean.hashCode(this.f) + j6.a.c((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.e);
    }

    public /* synthetic */ o(TextLocalisedClause textLocalisedClause, List list) {
        this(textLocalisedClause, null, null, list, false, false);
    }
}
