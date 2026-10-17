package l26;

import aw0.q0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d8j.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f191665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f191666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f191667c;
    public final Clause d;
    public final Data e;
    public final q0 f;

    public c(aim.e items, TextClause toolbarTitle, RateClause rateClause, Clause clause, Data headerData, q0 q0Var) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        this.f191665a = items;
        this.f191666b = toolbarTitle;
        this.f191667c = rateClause;
        this.d = clause;
        this.e = headerData;
        this.f = q0Var;
    }

    @Override // cli.p
    public final List c() {
        return this.f191665a;
    }

    @Override // d8j.g
    public final Clause e() {
        return this.f191666b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f191665a, cVar.f191665a) && this.f191666b.equals(cVar.f191666b) && Intrinsics.f(this.f191667c, cVar.f191667c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    @Override // d8j.g
    public final Data g() {
        return this.e;
    }

    @Override // d8j.g
    public final Clause h() {
        return this.d;
    }

    public final int hashCode() {
        int iB = v7.b(this.f191665a.hashCode() * 31, 31, this.f191666b);
        Clause clause = this.f191667c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        int iC = kii.e.c(this.e, (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
        q0 q0Var = this.f;
        return iC + (q0Var != null ? q0Var.hashCode() : 0);
    }

    @Override // d8j.g
    public final Clause i() {
        return this.f191667c;
    }

    @Override // d8j.g
    public final q0 o() {
        return this.f;
    }
}
