package kbe;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import efm.r;
import i9e.f;
import ip0.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import mae.h;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import qua.p;
import qv0.i;
import te0.w;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends abe.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f182578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f182579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f182580c;

    public d(a9e.b commonSubscriptionMapper, h recurringPaymentsMapper, e dateProvider) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(recurringPaymentsMapper, "recurringPaymentsMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f182578a = commonSubscriptionMapper;
        this.f182579b = recurringPaymentsMapper;
        this.f182580c = dateProvider;
    }

    public static Clause e(tua.a aVar, dj0.d dVar, boolean z, MoneyClause moneyClause) {
        int i = c.f182577a[aVar.ordinal()];
        if (i == 1) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_statement, null, null, 14);
            if (dVar.k()) {
                moneyClause = null;
            }
            Object[] elements = {textLocalisedClause, moneyClause};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12);
        }
        if (i != 2) {
            if (i == 3) {
                return new TextLocalisedClause(R$string.credit_schedule_payment_fixed_dot_value, u.c(moneyClause), null, 12);
            }
            throw new NoWhenBranchMatchedException();
        }
        boolean z3 = !z && dVar.f(dj0.d.e);
        TextLocalisedClause textLocalisedClause2 = z3 ? new TextLocalisedClause(R$string.credit_common_minimum, null, null, 14) : new TextLocalisedClause(R$string.credit_common_minimum_amount, null, null, 14);
        if (!z3) {
            moneyClause = null;
        }
        Object[] elements2 = {textLocalisedClause2, moneyClause};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements2), new DotDividerClause((Integer) null), null, null, 12);
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        f fVar = (f) this.f182578a;
        return fVar.c(u.c(fVar.m()));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        Data data;
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        ArrayList arrayList = new ArrayList();
        tua.a aVar = model.f182574a;
        Data data2 = model.d;
        dj0.d dVar = model.f182575b;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("id_amount", new TextLocalisedClause(R$string.credit_common_amount, null, null, 14), e(aVar, dVar, model.f, sx4.f.b(3, null, null, dVar)), 0, null, null, null, null, null, false, 0, 0, 32760);
        p pVar = model.f182576c;
        f fVar = (f) this.f182578a;
        i iVarR = fVar.r(pVar, false);
        CellDetailsDelegate.Model modelV = fVar.v(pVar.f249314a.f, pVar);
        if (!q.y(pVar) || !qua.u.i(pVar, ((l80.f) this.f182580c).g())) {
            modelV = null;
        }
        i[] elements = {model2, iVarR, modelV, fVar.A(pVar)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        a0.x(listL, arrayList);
        try {
            Object content = data2.getContent();
            data = new Data(content != null ? ((hce.d) content).f150888a : null, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        k71.q qVar = model.e;
        hce.d dVar2 = (hce.d) data2.getContent();
        List listD = fVar.d(data, qVar, dVar2 != null ? dVar2.f150889b : null);
        if (listD != null) {
            arrayList.addAll(listD);
        }
        CellDetailsChevronDelegate.Model modelS = fVar.s();
        yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
        arrayList.add(modelS);
        return d0.Z(arrayList);
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVarC = zae.c.c(subscriptionContent);
        tua.b bVar = pVarC.f249333x;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Long l2 = pVarC.f249323j;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        xi0.a aVar = xi0.b.Companion;
        String str = pVarC.i;
        aVar.getClass();
        dj0.d dVar = new dj0.d(jLongValue, xi0.a.a(str));
        tua.a aVar2 = bVar.f274544a;
        hce.b bVar2 = subscriptionContent.f150886a;
        return w.h(new a(aVar2, dVar, pVarC, bVar2.f150884b, bVar2.f150885c, bVar.f274545b));
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        tua.b bVar = subscriptionContent.f150886a.f150883a.f249333x;
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        boolean zI = qua.u.i(subscriptionContent.f150886a.f150883a, ((l80.f) this.f182580c).g());
        CompositeClause compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.credit_card_common_product_name, null, null, 14), new TextLocalisedClause(R$string.credit_card_common_autopay, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12);
        dj0.d dVarB = zae.c.b(subscriptionContent);
        a9e.b bVar2 = this.f182578a;
        return w.h(new hce.a(compositeClause, bVar == null ? ((f) bVar2).u(dVarB, zI) : e(bVar.f274544a, dVarB, bVar.f274545b, ((f) bVar2).u(dVarB, zI)), new TextLocalisedClause(R$string.recurring_payment_details_header_scheduled_payment_subtitle, null, null, 14), this.f182579b.f204002a.a(), (Image) null, (Serializable) null, 112));
    }
}
