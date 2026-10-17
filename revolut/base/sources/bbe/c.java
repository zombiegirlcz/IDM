package bbe;

import a9e.i;
import aw0.o9;
import b79.g;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.shared.recurring_payments.models.RecurringPaymentEndCriteria;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import do3.n;
import efm.r;
import ip0.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import l80.e;
import l80.f;
import m3j.j;
import qua.o;
import qua.p;
import qua.u;
import te0.w;
import ufm.d;
import zhm.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends abe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f14263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final abe.b f14264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f14265c;
    public final i d;
    public final j e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xae.a f14266g;

    public c(a9e.b commonSubscriptionMapper, abe.b paymentFromItemMapper, e dateProvider, i tempTransactionsMapper, j beneficiaryAvatarMapper, d recurringPaymentSplitStatusProvider, xae.a recurringSplitContentMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(paymentFromItemMapper, "paymentFromItemMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(tempTransactionsMapper, "tempTransactionsMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        Intrinsics.checkNotNullParameter(recurringPaymentSplitStatusProvider, "recurringPaymentSplitStatusProvider");
        Intrinsics.checkNotNullParameter(recurringSplitContentMapper, "recurringSplitContentMapper");
        this.f14263a = commonSubscriptionMapper;
        this.f14264b = paymentFromItemMapper;
        this.f14265c = dateProvider;
        this.d = tempTransactionsMapper;
        this.e = beneficiaryAvatarMapper;
        this.f = recurringPaymentSplitStatusProvider;
        this.f14266g = recurringSplitContentMapper;
    }

    public static String e(f5j.a aVar) {
        String str;
        String str2 = aVar.e;
        if (str2 != null && (str = aVar.f) != null) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(str2, " ", str);
        }
        String str3 = aVar.d;
        if (str3 != null) {
            return str3;
        }
        return null;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (!u.i(model.f14257a, ((f) this.f14265c).g())) {
            return null;
        }
        f5j.a aVar = model.f14257a.f249329r;
        a9e.b bVar = this.f14263a;
        ActionsView.Item itemM = aVar != null ? ((i9e.f) bVar).m() : null;
        i9e.f fVar = (i9e.f) bVar;
        ActionsView.Item[] elements = {itemM, this.f14266g.a(model.d), fVar.x()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return fVar.c(kotlin.collections.d.L(elements));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        ArrayList arrayList;
        Data data;
        dj0.d dVar;
        n nVar;
        CellDetailsDelegate.Model model;
        CellDetailsDelegate.Model modelV;
        a aVar;
        CellDetailsDelegate.Model model2;
        CellDetailsDelegate.Model model3;
        Data data2;
        n nVar2;
        a model4 = (a) obj2;
        Intrinsics.checkNotNullParameter(model4, "model");
        p pVar = model4.f14257a;
        q qVar = model4.f14259c;
        Data data3 = model4.f14258b;
        boolean zI = u.i(pVar, ((f) this.f14265c).g());
        UltimateDebtor ultimateDebtor = pVar.S;
        String str = pVar.f249325m;
        kq2.c cVar = pVar.N;
        o oVar = pVar.M;
        List list = pVar.R;
        ibd.e eVar = pVar.f249314a;
        f5j.a aVar2 = pVar.f249329r;
        abe.b bVar = this.f14264b;
        i iVar = this.d;
        a9e.b bVar2 = this.f14263a;
        if (zI) {
            arrayList = new ArrayList();
            i9e.f fVar = (i9e.f) bVar2;
            qv0.i iVarR = fVar.r(pVar, false);
            CellDetailsDelegate.Model modelF = (eVar.e == null || ofm.q.H(pVar)) ? null : fVar.F(eVar.e);
            if (ofm.q.y(pVar)) {
                model = modelF;
                modelV = fVar.v(eVar.f, pVar);
            } else {
                model = modelF;
                modelV = null;
            }
            RecurringPaymentEndCriteria endCriteria = eVar.i;
            if (endCriteria != null) {
                fVar.getClass();
                model2 = modelV;
                Intrinsics.checkNotNullParameter(endCriteria, "endCriteria");
                if (!(endCriteria instanceof RecurringPaymentEndCriteria.Date)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = model4;
                model3 = new CellDetailsDelegate.Model("ID_END_CRITERIA", new TextLocalisedClause(R$string.recurring_payment_details_ends_on_title, null, null, 14), i9e.f.q(jli.b.i(((RecurringPaymentEndCriteria.Date) endCriteria).f86442a)), 0, null, null, null, null, null, false, 0, 0, 32760);
            } else {
                aVar = model4;
                model2 = modelV;
                model3 = null;
            }
            qv0.i[] elements = {iVarR, model, model2, model3};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            a0.x(listL, arrayList);
            List listB = ((mae.u) iVar).b(aVar2);
            if (listB != null) {
                qv0.i iVarA = bVar.a(pVar, qVar);
                CellDetailsDelegate.Model modelT = fVar.t(oVar, (qVar == null || (nVar2 = qVar.f181794a) == null) ? null : nVar2.f116408a);
                CellDetailsDelegate.Model modelJ = cVar != null ? fVar.j(cVar) : null;
                aim.e eVarB = zhm.u.b();
                eVarB.add(iVarA);
                if (modelT != null) {
                    eVarB.add(modelT);
                }
                eVarB.addAll(listB);
                if (modelJ != null) {
                    eVarB.add(modelJ);
                }
                aim.e eVarA = zhm.u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                a0.x(eVarA, arrayList);
            }
            if (list.isEmpty()) {
                CellDetailsNoteDelegate.Model modelD = fVar.D(str);
                if (modelD != null) {
                    yp0.b.l(modelD, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(modelD);
                }
            } else {
                a0.x(fVar.E(list), arrayList);
            }
            if (ultimateDebtor != null) {
                a0.x(fVar.I(ultimateDebtor), arrayList);
            }
            try {
                Object content = data3.getContent();
                data2 = new Data(content != null ? ((hce.d) content).f150888a : null, data3.getError(), data3.getLoading());
            } catch (Throwable th10) {
                data2 = new Data(null, th10, data3.getLoading());
            }
            hce.d dVar2 = (hce.d) data3.getContent();
            List listD = fVar.d(data2, qVar, dVar2 != null ? dVar2.f150889b : null);
            if (listD != null) {
                a0.x(listD, arrayList);
            }
            ArrayList arrayListB = this.f14266g.b(aVar.d);
            if (arrayListB != null) {
                a0.x(arrayListB, arrayList);
            }
            CellDetailsChevronDelegate.Model modelS = fVar.s();
            yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
            arrayList.add(modelS);
            CellDetailsChevronDelegate.Model modelL = fVar.l(R.string.common_action_delete);
            yp0.b.l(modelL, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
            arrayList.add(modelL);
        } else {
            arrayList = new ArrayList();
            i9e.f fVar2 = (i9e.f) bVar2;
            sa saVarZ = fVar2.z(aVar2 != null ? e(aVar2) : null);
            yp0.b.l(saVarZ, 0, 0, 0, 0, null, false, 63);
            arrayList.add(saVarZ);
            qv0.i[] elements2 = {fVar2.r(pVar, false), (eVar.e == null || ofm.q.H(pVar)) ? null : fVar2.F(eVar.e)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            List listL2 = kotlin.collections.d.L(elements2);
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            a0.x(listL2, arrayList);
            List listB2 = ((mae.u) iVar).b(aVar2);
            if (listB2 != null) {
                qv0.i iVarA2 = bVar.a(pVar, qVar);
                CellDetailsDelegate.Model modelT2 = fVar2.t(oVar, (qVar == null || (nVar = qVar.f181794a) == null) ? null : nVar.f116408a);
                CellDetailsDelegate.Model modelJ2 = cVar != null ? fVar2.j(cVar) : null;
                aim.e eVarB2 = zhm.u.b();
                eVarB2.add(iVarA2);
                if (modelT2 != null) {
                    eVarB2.add(modelT2);
                }
                eVarB2.addAll(listB2);
                if (modelJ2 != null) {
                    eVarB2.add(modelJ2);
                }
                aim.e eVarA2 = zhm.u.a(eVarB2);
                yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
                a0.x(eVarA2, arrayList);
            }
            if (list.isEmpty()) {
                CellDetailsNoteDelegate.Model modelD2 = fVar2.D(str);
                if (modelD2 != null) {
                    yp0.b.l(modelD2, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(modelD2);
                }
            } else {
                a0.x(fVar2.E(list), arrayList);
            }
            if (ultimateDebtor != null) {
                a0.x(fVar2.I(ultimateDebtor), arrayList);
            }
            try {
                Object content2 = data3.getContent();
                data = new Data(content2 != null ? ((hce.d) content2).f150888a : null, data3.getError(), data3.getLoading());
                dVar = null;
            } catch (Throwable th11) {
                dVar = null;
                data = new Data(null, th11, data3.getLoading());
            }
            hce.d dVar3 = (hce.d) data3.getContent();
            List listD2 = fVar2.d(data, qVar, dVar3 != null ? dVar3.f150889b : dVar);
            if (listD2 != null) {
                a0.x(listD2, arrayList);
            }
            CellDetailsChevronDelegate.Model modelS2 = fVar2.s();
            yp0.b.l(modelS2, 0, 0, 0, 0, null, false, 63);
            arrayList.add(modelS2);
            CellDetailsChevronDelegate.Model modelL2 = fVar2.l(R.string.common_action_delete);
            yp0.b.l(modelL2, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
            arrayList.add(modelL2);
        }
        return arrayList;
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVar = subscriptionContent.f150886a.f150883a;
        r map = this.f.j(pVar).map(new g(new b(pVar, subscriptionContent, 0), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        Image imageC;
        Clause textLocalisedClause;
        Clause clauseC;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        boolean z = subscriptionContent.f150887b;
        hce.b bVar = subscriptionContent.f150886a;
        p pVar = bVar.f150883a;
        Serializable serializable = z ? "ID_BANK_DETAILS" : null;
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        boolean zI = u.i(pVar, ((f) this.f14265c).g());
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        f5j.a aVar = pVar.f249329r;
        a9e.b bVar2 = this.f14263a;
        if (aVar == null || (imageC = this.e.a(aVar)) == null) {
            ((i9e.f) bVar2).getClass();
            imageC = h5k.a.c();
        }
        Image image = imageC;
        i9e.f fVar = (i9e.f) bVar2;
        MoneyClause moneyClauseU = fVar.u(zae.c.b(subscriptionContent), zI);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        f5j.a aVar2 = bVar.f150883a.f249329r;
        String substring = aVar2 != null ? e(aVar2) : null;
        int i = subscriptionContent.f150887b ? R$attr.uikit_colorAccent : R$attr.uikit_colorForeground;
        if (substring != null) {
            int i2 = R$attr.uikit_colorBlack;
            ((mae.u) this.d).getClass();
            Intrinsics.checkNotNullParameter(substring, "fullString");
            Intrinsics.checkNotNullParameter(substring, "substring");
            int iT = d0.T(substring, substring, 0, false, 6);
            int length = substring.length() + iT;
            TextClause textClause = new TextClause(substring, (Style) null, Integer.valueOf(i), false, (o9) null, (List) null, 122);
            if (iT == 0) {
                String strSubstring = substring.substring(length);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                textLocalisedClause = yoj.b.w(textClause, new TextClause(strSubstring, (Style) null, Integer.valueOf(i2), false, (o9) null, (List) null, 122));
            } else if (iT <= 0 || length >= substring.length()) {
                String strSubstring2 = substring.substring(0, iT);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                textLocalisedClause = yoj.b.w(new TextClause(strSubstring2, (Style) null, Integer.valueOf(i2), false, (o9) null, (List) null, 122), textClause);
            } else {
                String strSubstring3 = substring.substring(0, iT);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                String strSubstring4 = substring.substring(length);
                Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                textLocalisedClause = yoj.b.w(yoj.b.w(new TextClause(strSubstring3, (Style) null, Integer.valueOf(i2), false, (o9) null, (List) null, 122), textClause), new TextClause(strSubstring4, (Style) null, Integer.valueOf(i2), false, (o9) null, (List) null, 122));
            }
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.recurring_payments_form_transfer, null, new Custom(Integer.valueOf(i), false, null, false, null, 254), 10);
        }
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        f5j.a aVar3 = pVar.f249329r;
        if ((aVar3 != null ? aVar3.f132335l : null) == f5j.r.CHEQUE) {
            clauseC = new TextLocalisedClause(R$string.recurring_payment_details_header_subtitle_cheque, null, null, 14);
        } else {
            Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
            clauseC = u.D(pVar) ? fVar.C() : new TextLocalisedClause(R$string.recurring_payment_details_header_subtitle_one_off, null, null, 14);
        }
        return w.h(new hce.a(moneyClauseU, textLocalisedClause, clauseC, image, fVar.g(!zI), serializable, 32));
    }
}
