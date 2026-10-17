package p6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.lr;
import ip0.mr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7g.b f233305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f233306c;
    public final u d;
    public final List e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mr f233307g;

    public v(String listId, p7g.b code, Clause label, u uVar, List rules, Clause clause, mr inputType) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        this.f233304a = listId;
        this.f233305b = code;
        this.f233306c = label;
        this.d = uVar;
        this.e = rules;
        this.f = clause;
        this.f233307g = inputType;
    }

    public static v g(v vVar, u uVar, Clause clause, int i) {
        String listId = vVar.f233304a;
        p7g.b code = vVar.f233305b;
        Clause label = vVar.f233306c;
        if ((i & 8) != 0) {
            uVar = vVar.d;
        }
        u uVar2 = uVar;
        List rules = vVar.e;
        if ((i & 32) != 0) {
            clause = vVar.f;
        }
        mr inputType = vVar.f233307g;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        return new v(listId, code, label, uVar2, rules, clause, inputType);
    }

    @Override // p6g.w
    public final p7g.b a() {
        return this.f233305b;
    }

    @Override // p6g.w
    public final Clause b() {
        return this.f;
    }

    @Override // p6g.w
    public final Clause c() {
        return this.f233306c;
    }

    @Override // p6g.w
    public final String d() {
        return this.f233304a;
    }

    @Override // p6g.w
    public final List e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f233304a, vVar.f233304a) && this.f233305b == vVar.f233305b && Intrinsics.f(this.f233306c, vVar.f233306c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f233307g, vVar.f233307g);
    }

    @Override // p6g.w
    public final z f() {
        return this.d;
    }

    public final int hashCode() {
        int iA = p.a.a((this.f233305b.hashCode() + (this.f233304a.hashCode() * 31)) * 31, 31, this.f233306c);
        u uVar = this.d;
        int iD = p.a.d((iA + (uVar == null ? 0 : uVar.f233303a.hashCode())) * 31, 31, this.e);
        Clause clause = this.f;
        return this.f233307g.hashCode() + ((iD + (clause != null ? clause.hashCode() : 0)) * 31);
    }

    public /* synthetic */ v(String str, p7g.b bVar, TextLocalisedClause textLocalisedClause, List list, lr lrVar) {
        this(str, bVar, textLocalisedClause, null, list, null, lrVar);
    }
}
