package u8j;

import aw0.q0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements d8j.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f278237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f278238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CurrencyClause f278239c;
    public final Clause d;
    public final Clause e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q0 f278240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsContext f278241h;

    public d(ArrayList items, ArrayList menuItems, CurrencyClause toolbarTitle, RateClause rateClause, Clause clause, Data headerData, q0 q0Var, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        this.f278237a = items;
        this.f278238b = menuItems;
        this.f278239c = toolbarTitle;
        this.d = rateClause;
        this.e = clause;
        this.f = headerData;
        this.f278240g = q0Var;
        this.f278241h = analyticsContext;
    }

    @Override // cli.p
    public final List c() {
        return this.f278237a;
    }

    @Override // d8j.g
    public final Clause e() {
        return this.f278239c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f278237a.equals(dVar.f278237a) && this.f278238b.equals(dVar.f278238b) && this.f278239c.equals(dVar.f278239c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f278240g, dVar.f278240g) && Intrinsics.f(this.f278241h, dVar.f278241h);
    }

    @Override // d8j.g
    public final Data g() {
        return this.f;
    }

    @Override // d8j.g
    public final Clause h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f278239c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f278238b, this.f278237a.hashCode() * 31, 31)) * 31;
        Clause clause = this.d;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        int iC = kii.e.c(this.f, (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
        q0 q0Var = this.f278240g;
        int iHashCode3 = (iC + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f278241h;
        return iHashCode3 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // d8j.g
    public final Clause i() {
        return this.d;
    }

    @Override // d8j.g
    public final q0 o() {
        return this.f278240g;
    }
}
