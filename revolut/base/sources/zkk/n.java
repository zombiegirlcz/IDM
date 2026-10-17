package zkk;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f323074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f323075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f323076c;
    public final List d;

    public n(TextClause textClause, TextClause textClause2, w0 w0Var, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f323074a = textClause;
        this.f323075b = textClause2;
        this.f323076c = w0Var;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f323074a, nVar.f323074a) && Intrinsics.f(this.f323075b, nVar.f323075b) && Intrinsics.f(this.f323076c, nVar.f323076c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f323074a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f323075b;
        return this.d.hashCode() + ((AnalyticsContext.a(this.f323076c) + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31)) * 31);
    }
}
