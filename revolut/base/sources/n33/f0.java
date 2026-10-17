package n33;

import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.cards_core.R$string;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f211704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bbj.c f211705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f211706c;

    public f0(c0 orderCardsItemProvider, bbj.c cryptoDisclaimerMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(orderCardsItemProvider, "orderCardsItemProvider");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerMapper, "cryptoDisclaimerMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f211704a = orderCardsItemProvider;
        this.f211705b = cryptoDisclaimerMapper;
        this.f211706c = featureToggleInteractor;
    }

    public final aim.e a(boolean z, boolean z3, Data cardPromotionsData, List list, i iVar, boolean z4, od0.i iVar2, boolean z6, h93.l0 l0Var, do3.n user) {
        ArrayList cardDesigns;
        pc pcVarC;
        TextLocalisedClause textLocalisedClause;
        Object next;
        List list2 = list;
        ArrayList cardDesigns2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof e93.d) {
                cardDesigns2.add(obj2);
            }
        }
        if (z4) {
            cardDesigns = new ArrayList();
            for (Object obj3 : list2) {
                if (obj3 instanceof e93.e) {
                    cardDesigns.add(obj3);
                }
            }
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : list2) {
                if (obj4 instanceof e93.e) {
                    arrayList.add(obj4);
                }
            }
            cardDesigns = new ArrayList();
            for (Object obj5 : arrayList) {
                if (!ce9.m.s((e93.e) obj5)) {
                    cardDesigns.add(obj5);
                }
            }
        }
        ArrayList disposableCardDesigns = new ArrayList();
        for (Object obj6 : list2) {
            e93.f fVar = (e93.f) obj6;
            if ((fVar instanceof e93.e) && ce9.m.x((e93.e) fVar)) {
                disposableCardDesigns.add(obj6);
            }
        }
        aim.e eVarB = zhm.u.b();
        cl4.h hVar = (cl4.h) iVar2.f224257a;
        c0 c0Var = this.f211704a;
        if (!z4 && hVar != null && !hVar.f24939a && z6) {
            Iterator it8 = hVar.i.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                ft3.q0 q0Var = ((em4.a) next).f127606h;
                if ((q0Var != null ? q0Var.getF137852c() : null) == ft3.j1.CREDIT_CARD) {
                    break;
                }
            }
            em4.a aVar = (em4.a) next;
            if (aVar != null) {
                eVarB.add(c0Var.f("DISCOVER_CREDIT_CARD_LIST_ID", aVar));
            }
        }
        Intrinsics.checkNotNullParameter("NEW_PHYSICAL_LIST_ID", "id");
        Intrinsics.checkNotNullParameter(cardPromotionsData, "cardPromotionsData");
        Intrinsics.checkNotNullParameter(cardDesigns2, "cardDesigns");
        Intrinsics.checkNotNullParameter(user, "user");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(z ? R$string.card_order_debit_physical_prepaid_card_title : R$string.card_order_physical_title, null, null, 14);
        TextLocalisedClause textLocalisedClauseA = c0.a(z3, c0.g(user));
        pc pcVarB = hx7.i.y(cardDesigns2) ? c0.b() : null;
        List list3 = (List) cardPromotionsData.getContent();
        if (list3 != null ? list3.contains(n93.d.YOUTH_GRADUATION) : false) {
            Address address = user.k;
            pcVarC = c0.c(address != null ? nz8.d.g(address) : null);
        } else {
            pcVarC = null;
        }
        pc[] elements = {pcVarB, pcVarC};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        e13.a aVar2 = e13.a.PHYSICAL;
        SelectedTab selectedTab = SelectedTab.DEBIT;
        Object objD = c0.d(c0Var, "NEW_PHYSICAL_LIST_ID", textLocalisedClause2, textLocalisedClauseA, listL, aVar2, selectedTab, null, null, l0Var, 192);
        if (iVar == null) {
            objD = new pb0("NEW_PHYSICAL_LIST_ID");
        } else if (!iVar.f211732a) {
            objD = null;
        }
        n14.e.b(eVarB, objD);
        Intrinsics.checkNotNullParameter("NEW_VIRTUAL_LIST_ID", "id");
        Intrinsics.checkNotNullParameter(cardDesigns, "cardDesigns");
        Intrinsics.checkNotNullParameter(user, "user");
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.card_order_virtual_title, null, null, 14);
        if (c0.g(user)) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_order_virtual_debit_subtitle, null, null, 14);
        } else {
            wi0.b.Companion.getClass();
            textLocalisedClause = te0.w.S(user, wi0.b.f297770q3) ? new TextLocalisedClause(R$string.card_order_virtual_subtitle_complimentary, null, null, 14) : new TextLocalisedClause(R$string.card_order_virtual_subtitle, null, null, 14);
        }
        Object objD2 = c0.d(c0Var, "NEW_VIRTUAL_LIST_ID", textLocalisedClause3, textLocalisedClause, zhm.v.l(hx7.i.y(cardDesigns) ? c0.b() : null), e13.a.VIRTUAL, selectedTab, null, null, l0Var, 192);
        if (iVar == null) {
            objD2 = new pb0("NEW_VIRTUAL_LIST_ID");
        } else if (!iVar.f211733b) {
            objD2 = null;
        }
        n14.e.b(eVarB, objD2);
        if (!z4 && !disposableCardDesigns.isEmpty() && l0Var != h93.l0.INDIA_GLOBAL) {
            Intrinsics.checkNotNullParameter("NEW_DISPOSABLE_LIST_ID", "id");
            Intrinsics.checkNotNullParameter(disposableCardDesigns, "disposableCardDesigns");
            Intrinsics.checkNotNullParameter(user, "user");
            eVarB.add(c0.d(c0Var, "NEW_DISPOSABLE_LIST_ID", new TextLocalisedClause(R$string.card_order_disposable_title, null, null, 14), c0.g(user) ? new TextLocalisedClause(R$string.card_order_disposable_debit_subtitle, null, null, 14) : new TextLocalisedClause(R$string.card_order_disposable_subtitle, null, null, 14), zhm.v.l(hx7.i.e(disposableCardDesigns) ? c0.b() : null), e13.a.DISPOSABLE, selectedTab, null, null, null, CaptureActivity.RESULT_EXIT_USER_FLOW));
        }
        return zhm.u.a(eVarB);
    }
}
