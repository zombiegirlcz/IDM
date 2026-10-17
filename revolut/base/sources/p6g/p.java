package p6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7g.b f233296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f233297c;
    public final o d;
    public final List e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f233298g;

    public p(String listId, p7g.b code, TextLocalisedClause label, o oVar, List rules, Clause clause, List options) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f233295a = listId;
        this.f233296b = code;
        this.f233297c = label;
        this.d = oVar;
        this.e = rules;
        this.f = clause;
        this.f233298g = options;
    }

    public static p g(p pVar, o oVar, Clause clause, int i) {
        String listId = pVar.f233295a;
        p7g.b code = pVar.f233296b;
        TextLocalisedClause label = pVar.f233297c;
        if ((i & 8) != 0) {
            oVar = pVar.d;
        }
        o oVar2 = oVar;
        List rules = pVar.e;
        if ((i & 32) != 0) {
            clause = pVar.f;
        }
        List options = pVar.f233298g;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(options, "options");
        return new p(listId, code, label, oVar2, rules, clause, options);
    }

    @Override // p6g.w
    public final p7g.b a() {
        return this.f233296b;
    }

    @Override // p6g.w
    public final Clause b() {
        return this.f;
    }

    @Override // p6g.w
    public final Clause c() {
        return this.f233297c;
    }

    @Override // p6g.w
    public final String d() {
        return this.f233295a;
    }

    @Override // p6g.w
    public final List e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f233295a, pVar.f233295a) && this.f233296b == pVar.f233296b && this.f233297c.equals(pVar.f233297c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f233298g, pVar.f233298g);
    }

    @Override // p6g.w
    public final z f() {
        return this.d;
    }

    public final int hashCode() {
        int iA = t61.a.a((this.f233296b.hashCode() + (this.f233295a.hashCode() * 31)) * 31, 31, this.f233297c);
        o oVar = this.d;
        int iD = p.a.d((iA + (oVar == null ? 0 : oVar.hashCode())) * 31, 31, this.e);
        Clause clause = this.f;
        return this.f233298g.hashCode() + ((iD + (clause != null ? clause.hashCode() : 0)) * 31);
    }
}
