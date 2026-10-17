package lbe;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import do3.n;
import efm.r;
import hce.c;
import ip0.y10;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import l80.e;
import l80.f;
import org.joda.time.LocalDate;
import qua.o;
import qua.p;
import qua.u;
import qv0.i;
import te0.w;
import ufm.d;
import zhm.a0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends abe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f193660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final abe.b f193661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f193662c;
    public final d d;
    public final xae.a e;

    public b(a9e.b commonSubscriptionMapper, abe.b paymentFromItemMapper, e dateProvider, d recurringPaymentSplitStatusProvider, xae.a recurringSplitContentMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(paymentFromItemMapper, "paymentFromItemMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentSplitStatusProvider, "recurringPaymentSplitStatusProvider");
        Intrinsics.checkNotNullParameter(recurringSplitContentMapper, "recurringSplitContentMapper");
        this.f193660a = commonSubscriptionMapper;
        this.f193661b = paymentFromItemMapper;
        this.f193662c = dateProvider;
        this.d = recurringPaymentSplitStatusProvider;
        this.e = recurringSplitContentMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    @Override // abe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ip0.z a(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            lbe.a r1 = (lbe.a) r1
            java.lang.String r2 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            qua.p r2 = r1.f193657a
            l80.e r3 = r0.f193662c
            l80.f r3 = (l80.f) r3
            org.joda.time.DateTime r3 = r3.g()
            boolean r3 = qua.u.i(r2, r3)
            a9e.b r4 = r0.f193660a
            r5 = 0
            if (r3 == 0) goto L37
            f5j.a r6 = r2.f249329r
            if (r6 == 0) goto L25
            java.lang.String r6 = r6.f132329a
            goto L26
        L25:
            r6 = r5
        L26:
            if (r6 == 0) goto L37
            int r6 = r6.length()
            if (r6 != 0) goto L2f
            goto L37
        L2f:
            r6 = r4
            i9e.f r6 = (i9e.f) r6
            com.revolut.core.ui_kit.views.ActionsView$Item r6 = r6.m()
            goto L38
        L37:
            r6 = r5
        L38:
            xae.a r7 = r0.e
            com.revolut.data.model.Data r1 = r1.d
            com.revolut.core.ui_kit.views.ActionsView$Item r1 = r7.a(r1)
            boolean r7 = qua.u.w(r2)
            if (r7 == 0) goto L7d
            r2 = r4
            i9e.f r2 = (i9e.f) r2
            r2.getClass()
            com.revolut.core.ui_kit.views.ActionsView$Item r7 = new com.revolut.core.ui_kit.views.ActionsView$Item
            mx0.d r8 = mx0.d.SEMIACCENT
            f01.a r2 = r2.d
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r10 = com.revolut.feature.subscriptionscommon.impl.R$string.mandate_details_action_cancel_future_payments_title
            r11 = 14
            r9.<init>(r10, r5, r5, r11)
            java.lang.CharSequence r2 = r2.b(r9)
            java.lang.String r2 = r2.toString()
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r9 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r10 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_decline
            r16 = 0
            r17 = 254(0xfe, float:3.56E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r10 = "ID_CANCEL_NZ_DIRECT_DEBIT_ACTION"
            r7.<init>(r10, r8, r2, r9)
            java.util.List r2 = zhm.u.c(r7)
            goto L96
        L7d:
            boolean r7 = qua.u.r(r2)
            if (r7 == 0) goto L8b
            r7 = r4
            i9e.f r7 = (i9e.f) r7
            java.util.List r2 = r7.H(r2, r5)
            goto L96
        L8b:
            r2 = r4
            i9e.f r2 = (i9e.f) r2
            com.revolut.core.ui_kit.views.ActionsView$Item r2 = r2.i()
            java.util.List r2 = zhm.u.c(r2)
        L96:
            com.revolut.core.ui_kit.views.ActionsView$Item[] r1 = new com.revolut.core.ui_kit.views.ActionsView.Item[]{r6, r1}
            java.lang.String r6 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            java.util.List r1 = kotlin.collections.d.L(r1)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r1 = zhm.d0.E0(r2, r1)
            i9e.f r4 = (i9e.f) r4
            ip0.z r1 = r4.c(r1)
            if (r3 == 0) goto Lb2
            return r1
        Lb2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lbe.b.a(java.lang.Object):ip0.z");
    }

    @Override // abe.a
    public final List b(Object obj2) {
        a aVar;
        Data data;
        q qVar;
        uua.a aVar2;
        a9e.b bVar;
        p pVar;
        ibd.e eVar;
        CellDetailsDelegate.Model modelT;
        Data data2;
        dj0.d dVar;
        String str;
        n nVar;
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        ArrayList arrayList = new ArrayList();
        p subscription = model.f193657a;
        Data data3 = model.f193658b;
        q qVar2 = model.f193659c;
        boolean zI = u.i(subscription, ((f) this.f193662c).g());
        ibd.e eVar2 = subscription.f249314a;
        uua.a aVar3 = subscription.f249331t;
        a9e.b bVar2 = this.f193660a;
        sa saVarG = null;
        if (zI) {
            aVar = model;
            data = data3;
            qVar = qVar2;
            aVar2 = aVar3;
            bVar = bVar2;
            pVar = subscription;
            eVar = eVar2;
        } else if (u.w(subscription)) {
            i9e.f fVar = (i9e.f) bVar2;
            f01.a aVar4 = fVar.d;
            Intrinsics.checkNotNullParameter("ID_UNBLOCK_NZ_DIRECT_DEBIT_WIDGET", "listId");
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            LocalDate localDate = subscription.f249319d0;
            if (localDate == null) {
                localDate = ((f) fVar.e).g().toLocalDate();
            }
            LocalDate localDatePlusMonths = subscription.f249320e0;
            if (localDatePlusMonths == null) {
                localDatePlusMonths = localDate.plusMonths(9);
            }
            Intrinsics.h(localDate);
            String string = aVar4.b(i9e.f.q(localDate)).toString();
            Intrinsics.h(localDatePlusMonths);
            data = data3;
            aVar = model;
            qVar = qVar2;
            eVar = eVar2;
            aVar2 = aVar3;
            bVar = bVar2;
            pVar = subscription;
            saVarG = new sa("ID_UNBLOCK_NZ_DIRECT_DEBIT_WIDGET", (Clause) new TextLocalisedClause(R$string.recurring_payment_details_blocked_warning_nz_direct_debit_title, zhm.u.c(string), null, 12), (Clause) new TextLocalisedClause(R$string.recurring_payment_details_blocked_warning_nz_direct_debit_subtitle, zhm.u.c(aVar4.b(i9e.f.q(localDatePlusMonths)).toString()), null, 12), zhm.u.c(new ActionsView.Item("ID_UNBLOCK_NZ_DIRECT_DEBIT_WIDGET", null, false, null, null, new TextLocalisedClause(R$string.recurring_payment_details_action_unblock_future_payments, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_lock_opened, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, subscription, null, 24478)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
        } else {
            aVar = model;
            data = data3;
            qVar = qVar2;
            aVar2 = aVar3;
            bVar = bVar2;
            pVar = subscription;
            eVar = eVar2;
            if (u.r(pVar)) {
                String str2 = aVar2 != null ? aVar2.f283189b : null;
                if (str2 == null) {
                    str2 = "";
                }
                saVarG = ((i9e.f) bVar).G("ID_UNBLOCK_SUBSCRIPTION_WIDGET", str2, pVar, null);
            } else {
                saVarG = null;
            }
        }
        List listL = v.l(saVarG);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        a0.x(listL, arrayList);
        i9e.f fVar2 = (i9e.f) bVar;
        CellDetailsDelegate.Model modelF = fVar2.F(eVar.e);
        if (eVar.e == null) {
            modelF = null;
        }
        CellDetailsDelegate.Model[] elements = {modelF, fVar2.v(eVar.f, pVar)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL2 = kotlin.collections.d.L(elements);
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        a0.x(listL2, arrayList);
        q qVar3 = qVar;
        i iVarA = this.f193661b.a(pVar, qVar3);
        o oVar = pVar.M;
        if (oVar != null) {
            modelT = fVar2.t(oVar, (qVar3 == null || (nVar = qVar3.f181794a) == null) ? null : nVar.f116408a);
        } else {
            modelT = null;
        }
        i[] elements2 = {iVarA, modelT};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL3 = kotlin.collections.d.L(elements2);
        yp0.b.k(listL3, 0, 0, 0, 0, 31);
        a0.x(listL3, arrayList);
        if (aVar2 != null && (str = aVar2.e) != null) {
            String str3 = !d0.W(str) ? str : null;
            if (str3 != null) {
                CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_AUTHORISATION_CODE", new TextLocalisedClause(R$string.recurring_payment_details_authorisation_code_title, null, null, 14), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                arrayList.add(model2);
            }
        }
        try {
            Object content = data.getContent();
            data2 = new Data(content != null ? ((hce.d) content).f150888a : null, data.getError(), data.getLoading());
            dVar = null;
        } catch (Throwable th10) {
            dVar = null;
            data2 = new Data(null, th10, data.getLoading());
        }
        hce.d dVar2 = (hce.d) data.getContent();
        List listD = fVar2.d(data2, qVar3, dVar2 != null ? dVar2.f150889b : dVar);
        if (listD != null) {
            a0.x(listD, arrayList);
        }
        ArrayList arrayListB = this.e.b(aVar.d);
        if (arrayListB != null) {
            a0.x(arrayListB, arrayList);
        }
        CellDetailsChevronDelegate.Model modelS = fVar2.s();
        yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
        arrayList.add(modelS);
        return arrayList;
    }

    @Override // abe.a
    public final r c(c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVar = subscriptionContent.f150886a.f150883a;
        r map = this.d.j(pVar).map(new lak.i(new bbe.b(pVar, subscriptionContent, 1), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // abe.a
    public final r d(c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        dj0.d dVarB = zae.c.b(subscriptionContent);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        p pVar = subscriptionContent.f150886a.f150883a;
        boolean zI = u.i(pVar, ((f) this.f193662c).g());
        i9e.f fVar = (i9e.f) this.f193660a;
        MoneyClause moneyClauseU = fVar.u(dVarB, zI);
        String str = pVar.k;
        if (str == null) {
            str = "";
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_detail_transfer_type_dd_value, null, null, 14);
        fVar.getClass();
        return w.h(new hce.a(moneyClauseU, textClause, textLocalisedClause, h5k.a.c(), (Image) null, (Serializable) null, 112));
    }
}
