package q0i;

import bw0.m;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import h30.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.i3;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.e f241281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f241282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f241283c;
    public final m d;
    public final Object e;
    public final bw0.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f241284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f241285h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f241286j;
    public final AnalyticsContext k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i3 f241287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AccountId f241288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wd6.i f241289n;
    public final ImageTransformations o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f241290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Clause f241291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f241292r;

    public d(wd6.e exchangeMode, i iVar, e moneyDetails, m mVar, Object obj2, bw0.e suggestionsMode, List suggestions, boolean z, boolean z3, h insertedAmount, AnalyticsContext analyticsContext, i3 i3Var, AccountId accountId, wd6.i exchangePocketType, ImageTransformations imageTransformations, List list, TextLocalisedClause textLocalisedClause, boolean z4) {
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(moneyDetails, "moneyDetails");
        Intrinsics.checkNotNullParameter(suggestionsMode, "suggestionsMode");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(insertedAmount, "insertedAmount");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(exchangePocketType, "exchangePocketType");
        this.f241281a = exchangeMode;
        this.f241282b = iVar;
        this.f241283c = moneyDetails;
        this.d = mVar;
        this.e = obj2;
        this.f = suggestionsMode;
        this.f241284g = suggestions;
        this.f241285h = z;
        this.i = z3;
        this.f241286j = insertedAmount;
        this.k = analyticsContext;
        this.f241287l = i3Var;
        this.f241288m = accountId;
        this.f241289n = exchangePocketType;
        this.o = imageTransformations;
        this.f241290p = list;
        this.f241291q = textLocalisedClause;
        this.f241292r = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f241281a == dVar.f241281a && Intrinsics.f(this.f241282b, dVar.f241282b) && Intrinsics.f(this.f241283c, dVar.f241283c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && Intrinsics.f(this.f241284g, dVar.f241284g) && this.f241285h == dVar.f241285h && this.i == dVar.i && Intrinsics.f(this.f241286j, dVar.f241286j) && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f241287l, dVar.f241287l) && Intrinsics.f(this.f241288m, dVar.f241288m) && this.f241289n == dVar.f241289n && Intrinsics.f(this.o, dVar.o) && Intrinsics.f(this.f241290p, dVar.f241290p) && Intrinsics.f(this.f241291q, dVar.f241291q) && this.f241292r == dVar.f241292r;
    }

    public final int hashCode() {
        int iHashCode = this.f241281a.hashCode() * 31;
        i iVar = this.f241282b;
        int iHashCode2 = (this.f241283c.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31)) * 31;
        m mVar = this.d;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Object obj2 = this.e;
        int iHashCode4 = (this.f241286j.hashCode() + j6.a.c(j6.a.c(p.a.d((this.f.hashCode() + ((iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31)) * 31, 31, this.f241284g), 31, this.f241285h), 31, this.i)) * 31;
        AnalyticsContext analyticsContext = this.k;
        int iA = (iHashCode4 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        i3 i3Var = this.f241287l;
        int iHashCode5 = (this.f241289n.hashCode() + l.b(this.f241288m, (iA + (i3Var == null ? 0 : i3Var.hashCode())) * 31, 31)) * 31;
        ImageTransformations imageTransformations = this.o;
        int iHashCode6 = (iHashCode5 + (imageTransformations == null ? 0 : imageTransformations.hashCode())) * 31;
        List list = this.f241290p;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Clause clause = this.f241291q;
        return Boolean.hashCode(this.f241292r) + ((iHashCode7 + (clause != null ? clause.hashCode() : 0)) * 31);
    }

    public /* synthetic */ d(wd6.e eVar, i iVar, e eVar2, m mVar, Object obj2, bw0.e eVar3, List list, boolean z, boolean z3, g gVar, AnalyticsContext analyticsContext, i3 i3Var, AccountId accountId, wd6.i iVar2) {
        this(eVar, iVar, eVar2, mVar, obj2, eVar3, list, z, z3, gVar, analyticsContext, i3Var, accountId, iVar2, null, null, null, true);
    }
}
