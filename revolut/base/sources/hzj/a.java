package hzj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f157195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f157196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f157197c;

    public a(int i, Clause valueClause, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(valueClause, "valueClause");
        this.f157195a = i;
        this.f157196b = valueClause;
        this.f157197c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f157195a == aVar.f157195a && Intrinsics.f(this.f157196b, aVar.f157196b) && Intrinsics.f(this.f157197c, aVar.f157197c);
    }

    public final int hashCode() {
        int iA = p.a.a(Integer.hashCode(this.f157195a) * 31, 31, this.f157196b);
        Clause clause = this.f157197c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
