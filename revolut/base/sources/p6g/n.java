package p6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7g.b f233291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f233292c;
    public final m d;
    public final List e;
    public final Clause f;

    public n(String listId, p7g.b code, Clause label, m mVar, List rules, Clause clause) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f233290a = listId;
        this.f233291b = code;
        this.f233292c = label;
        this.d = mVar;
        this.e = rules;
        this.f = clause;
    }

    public static n g(n nVar, m mVar, Clause clause, int i) {
        String listId = nVar.f233290a;
        p7g.b code = nVar.f233291b;
        Clause label = nVar.f233292c;
        if ((i & 8) != 0) {
            mVar = nVar.d;
        }
        m mVar2 = mVar;
        List rules = nVar.e;
        if ((i & 32) != 0) {
            clause = nVar.f;
        }
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(rules, "rules");
        return new n(listId, code, label, mVar2, rules, clause);
    }

    @Override // p6g.w
    public final p7g.b a() {
        return this.f233291b;
    }

    @Override // p6g.w
    public final Clause b() {
        return this.f;
    }

    @Override // p6g.w
    public final Clause c() {
        return this.f233292c;
    }

    @Override // p6g.w
    public final String d() {
        return this.f233290a;
    }

    @Override // p6g.w
    public final List e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f233290a, nVar.f233290a) && this.f233291b == nVar.f233291b && Intrinsics.f(this.f233292c, nVar.f233292c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f);
    }

    @Override // p6g.w
    public final z f() {
        return this.d;
    }

    public final int hashCode() {
        int iA = p.a.a((this.f233291b.hashCode() + (this.f233290a.hashCode() * 31)) * 31, 31, this.f233292c);
        m mVar = this.d;
        int iD = p.a.d((iA + (mVar == null ? 0 : mVar.hashCode())) * 31, 31, this.e);
        Clause clause = this.f;
        return iD + (clause != null ? clause.hashCode() : 0);
    }

    public /* synthetic */ n(String str, p7g.b bVar, TextLocalisedClause textLocalisedClause, List list) {
        this(str, bVar, textLocalisedClause, null, list, null);
    }
}
