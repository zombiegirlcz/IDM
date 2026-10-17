package p6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7g.b f233270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f233271c;
    public final a d;
    public final List e;
    public final Clause f;

    public b(String listId, p7g.b code, TextLocalisedClause label, a aVar, List rules, Clause clause) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f233269a = listId;
        this.f233270b = code;
        this.f233271c = label;
        this.d = aVar;
        this.e = rules;
        this.f = clause;
    }

    public static b g(b bVar, a aVar, Clause clause, int i) {
        String listId = bVar.f233269a;
        p7g.b code = bVar.f233270b;
        TextLocalisedClause label = bVar.f233271c;
        if ((i & 8) != 0) {
            aVar = bVar.d;
        }
        a aVar2 = aVar;
        List rules = bVar.e;
        if ((i & 32) != 0) {
            clause = bVar.f;
        }
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(rules, "rules");
        return new b(listId, code, label, aVar2, rules, clause);
    }

    @Override // p6g.w
    public final p7g.b a() {
        return this.f233270b;
    }

    @Override // p6g.w
    public final Clause b() {
        return this.f;
    }

    @Override // p6g.w
    public final Clause c() {
        return this.f233271c;
    }

    @Override // p6g.w
    public final String d() {
        return this.f233269a;
    }

    @Override // p6g.w
    public final List e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f233269a, bVar.f233269a) && this.f233270b == bVar.f233270b && this.f233271c.equals(bVar.f233271c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    @Override // p6g.w
    public final z f() {
        return this.d;
    }

    public final int hashCode() {
        int iA = t61.a.a((this.f233270b.hashCode() + (this.f233269a.hashCode() * 31)) * 31, 31, this.f233271c);
        a aVar = this.d;
        int iD = p.a.d((iA + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.e);
        Clause clause = this.f;
        return iD + (clause != null ? clause.hashCode() : 0);
    }
}
