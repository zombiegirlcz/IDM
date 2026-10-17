package bq5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f17732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17733c;
    public final Clause d;

    public m0(TextLocalisedClause nextButtonClause, TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nextButtonClause, "nextButtonClause");
        this.f17731a = items;
        this.f17732b = nextButtonClause;
        this.f17733c = z;
        this.d = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f17731a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return this.f17731a.equals(m0Var.f17731a) && this.f17732b.equals(m0Var.f17732b) && this.f17733c == m0Var.f17733c && Intrinsics.f(this.d, m0Var.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(t61.a.a(this.f17731a.hashCode() * 31, 31, this.f17732b), 31, this.f17733c);
        Clause clause = this.d;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
