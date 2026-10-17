package a1a;

import a2f.p;
import a32.a0;
import a68.e;
import a68.l;
import a72.m;
import a7b.s;
import a97.k;
import a9d.u;
import aae.h;
import aah.g;
import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoCardService;
import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoWithdrawalService;
import com.revolut.feature.cards_troubleshooter.impl.network.CardsTroubleshooterService;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import com.revolut.feature.payments.splitbill.impl.data.recurringsplit.RecurringSplitService;
import com.revolut.feature.retail.savings.api.domain.interactors.SavingsDisclaimersClickAction;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import dx4.a1;
import dx4.y0;
import e72.c;
import ft3.h1;
import gim.i;
import h93.f0;
import ha3.x;
import ht3.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kp0.w0;
import mp.r;
import p9d.n;
import pai.j;
import pfe.f;
import skm.e0;
import v6l.b1;
import vkm.j2;
import yhm.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f568w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f569x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f568w = obj2;
        this.f569x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a((d) this.f568w, (String) this.f569x, continuation, 0);
            case 1:
                return new a((p) this.f568w, (u2f.d) this.f569x, continuation, 1);
            case 2:
                return new a((a2j.d) this.f568w, (SavingsDisclaimersClickAction) this.f569x, continuation, 2);
            case 3:
                return new a((a0) this.f568w, (h1j.d) this.f569x, continuation, 3);
            case 4:
                return new a((f) this.f568w, (List) this.f569x, continuation, 4);
            case 5:
                return new a((com.revolut.feature.retail.cfd.impl.flows.withdraw.a) this.f568w, (a3b.f) this.f569x, continuation, 5);
            case 6:
                return new a((com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.a) this.f568w, (f5j.a) this.f569x, continuation, 6);
            case 7:
                return new a((a44.d) this.f568w, (h1) this.f569x, continuation, 7);
            case 8:
                return new a((a4h.b) this.f568w, (String) this.f569x, continuation, 8);
            case 9:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a) this.f568w, (it3.d) this.f569x, continuation, 9);
            case 10:
                return new a((e) this.f568w, (r58.b) this.f569x, continuation, 10);
            case 11:
                return new a((a68.i) this.f568w, (String) this.f569x, continuation, 11);
            case 12:
                return new a((com.revolut.feature.masav.impl.ui.c) this.f568w, (DirectDebitData) this.f569x, continuation, 12);
            case 13:
                return new a((z5e.c) this.f568w, (ProductAccountId) this.f569x, continuation, 13);
            case 14:
                return new a((a72.d) this.f568w, (String) this.f569x, continuation, 14);
            case 15:
                return new a((m) this.f568w, (dj0.d) this.f569x, continuation, 15);
            case 16:
                return new a((m) this.f568w, (String) this.f569x, continuation, 16);
            case 17:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.a) this.f568w, (ConsentPreferencesSelection) this.f569x, continuation, 17);
            case 18:
                return new a((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) this.f568w, (HyperTextTarget) this.f569x, continuation, 18);
            case 19:
                return new a((com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) this.f568w, (FlightSearchRequestFilters) this.f569x, continuation, 19);
            case 20:
                return new a((com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) this.f568w, (FlightSearchQuery) this.f569x, continuation, 20);
            case 21:
                return new a((com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a) this.f568w, (ArrayList) this.f569x, continuation, 21);
            case 22:
                return new a((a8e.i) this.f568w, (u6e.a) this.f569x, continuation, 22);
            case 23:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.b) this.f568w, (it3.d) this.f569x, continuation, 23);
            case 24:
                a aVar = new a((k) this.f569x, continuation, 24);
                aVar.f568w = obj2;
                return aVar;
            case 25:
                return new a((u) this.f568w, (hj0.b) this.f569x, continuation, 25);
            case 26:
                return new a((h) this.f568w, (qua.p) this.f569x, continuation, 26);
            case 27:
                a aVar2 = new a((g) this.f569x, continuation, 27);
                aVar2.f568w = obj2;
                return aVar2;
            case 28:
                return new a((r) this.f568w, (ya3.a) this.f569x, continuation, 28);
            default:
                return new a((com.revolut.feature_retail_user_declarations.email.verification_screen.a) this.f568w, (String) this.f569x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair;
        switch (this.u) {
            case 0:
                d dVar = (d) this.f568w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    RecurringSplitService recurringSplitService = dVar.f576a;
                    String str = (String) this.f569x;
                    this.v = 1;
                    if (recurringSplitService.cancelRecurringSplit(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                x4l.c cVar = dVar.d;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar.d(unit, false, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                p pVar = (p) this.f568w;
                a2f.o oVar = new a2f.o(pVar, (u2f.d) this.f569x, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(pVar.k, "REGISTER_ACCOUNT_TASK_ID", oVar, this);
                return objB == aVar2 ? aVar2 : objB;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                a2j.d dVar2 = (a2j.d) this.f568w;
                a2j.c cVar2 = new a2j.c(dVar2, (SavingsDisclaimersClickAction) this.f569x, null, 0);
                this.v = 1;
                Object objP2 = dVar2.p2(this, cVar2);
                return objP2 == aVar3 ? aVar3 : objP2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    a0 a0Var = (a0) this.f568w;
                    a2j.c cVar3 = new a2j.c(a0Var, (h1j.d) this.f569x, null, 1);
                    this.v = 1;
                    if (a0Var.p2(this, cVar3) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                f fVar = (f) this.f568w;
                Set setI1 = d0.i1((List) this.f569x);
                this.v = 1;
                Object objB2 = fVar.b(setI1, this);
                return objB2 == aVar5 ? aVar5 : objB2;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    com.revolut.feature.retail.cfd.impl.flows.withdraw.a aVar7 = (com.revolut.feature.retail.cfd.impl.flows.withdraw.a) this.f568w;
                    dj0.d dVar3 = ((a3b.d) ((a3b.f) this.f569x)).f1081a;
                    this.v = 1;
                    if (com.revolut.feature.retail.cfd.impl.flows.withdraw.a.I2(aVar7, dVar3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.a aVar9 = (com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.a) this.f568w;
                a3k.c cVar4 = new a3k.c(aVar9, (f5j.a) this.f569x, null);
                this.v = 1;
                Object objP22 = aVar9.p2(this, cVar4);
                return objP22 == aVar8 ? aVar8 : objP22;
            case 7:
                a44.d dVar4 = (a44.d) this.f568w;
                Object gVar = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = dVar4.f1193a;
                    String str2 = ((h1) this.f569x).f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService.getPhotosUploadConfig(str2, this);
                    if (obj2 != gVar) {
                    }
                    return gVar;
                }
                if (i32 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                x14.f dto = (x14.f) obj2;
                dr3.g gVar2 = dVar4.f1194b.f139531a;
                Intrinsics.checkNotNullParameter(dto, "dto");
                l0 l0VarC = dr3.g.c(gVar2, dto.getIntro(), null, null, 14);
                x14.e photos = dto.getPhotos();
                String title = photos.getTitle();
                x14.g secondDescription = photos.getSecondDescription();
                String text = secondDescription.getText();
                y0 y0Var = a1.Companion;
                String icon = secondDescription.getIcon();
                y0Var.getClass();
                bz3.d dVar5 = new bz3.d(text, y0.a(icon), dr3.g.c(gVar2, secondDescription.getInfo(), null, null, 14));
                String buttonTitle = photos.getButtonTitle();
                x14.a addPhotoItem = photos.getAddPhotoItem();
                String text2 = addPhotoItem.getText();
                a1 a1VarA = y0.a(addPhotoItem.getIcon());
                if (a1VarA == null) {
                    a1VarA = a1.IMAGE;
                }
                bz3.b bVar = new bz3.b(a1VarA, text2);
                bz3.e eVar = new bz3.e(photos.getSuccessPopup().getTitle());
                x14.c deleteConfirmationPopup = photos.getDeleteConfirmationPopup();
                gVar = new bz3.g(l0VarC, new bz3.f(title, dVar5, buttonTitle, bVar, eVar, new bz3.c(deleteConfirmationPopup.getTitle(), deleteConfirmationPopup.getDescription(), deleteConfirmationPopup.getPrimaryButton(), deleteConfirmationPopup.getSecondaryButton())));
                return gVar;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    a4h.b bVar2 = (a4h.b) this.f568w;
                    f9i.c cVar5 = new f9i.c(new f9i.e((String) this.f569x, false));
                    this.v = 1;
                    if (bVar2.C2(cVar5, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a aVar12 = (com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a) this.f568w;
                    a54.e eVar2 = new a54.e(aVar12, (it3.d) this.f569x, null);
                    this.v = 1;
                    if (aVar12.p2(this, eVar2) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                l lVar = ((e) this.f568w).f1565h;
                r58.b bVar3 = (r58.b) this.f569x;
                this.v = 1;
                Object objA = lVar.a(bVar3, this);
                return objA == aVar13 ? aVar13 : objA;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                a68.i iVar = (a68.i) this.f568w;
                a31.g gVar3 = new a31.g((String) this.f569x, 8);
                this.v = 1;
                Object objO = e0.o(new a68.h(gVar3, iVar, null), this);
                return objO == aVar14 ? aVar14 : objO;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    com.revolut.feature.masav.impl.ui.c cVar6 = (com.revolut.feature.masav.impl.ui.c) this.f568w;
                    com.revolut.feature.masav.impl.ui.a aVar16 = new com.revolut.feature.masav.impl.ui.a(cVar6, (DirectDebitData) this.f569x, null);
                    this.v = 1;
                    if (cVar6.p2(this, aVar16) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    z5e.c cVar7 = (z5e.c) this.f568w;
                    ProductAccountId productAccountId = (ProductAccountId) this.f569x;
                    this.v = 1;
                    if (cVar7.d(productAccountId, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                Object bVar4 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    MultibancoCardService multibancoCardService = ((a72.d) this.f568w).f1753a;
                    e72.b bVar5 = new e72.b((String) this.f569x);
                    this.v = 1;
                    obj2 = multibancoCardService.enrollmentSearch(bVar5, this);
                    if (obj2 != bVar4) {
                    }
                    return bVar4;
                }
                if (i96 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                e72.c cVar8 = (e72.c) obj2;
                Intrinsics.checkNotNullParameter(cVar8, "<this>");
                c.a multibancoCard = cVar8.getMultibancoCard();
                h02.a aVar18 = multibancoCard != null ? new h02.a(multibancoCard.getId(), multibancoCard.getBrand()) : null;
                c.a matchingCard = cVar8.getMatchingCard();
                bVar4 = new h02.b(aVar18, matchingCard != null ? new h02.a(matchingCard.getId(), matchingCard.getBrand()) : null);
                return bVar4;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    MultibancoWithdrawalService multibancoWithdrawalService = ((m) this.f568w).f1762a;
                    jo3.a aVarP = mo3.a.p((dj0.d) this.f569x);
                    this.v = 1;
                    obj2 = multibancoWithdrawalService.postWithdrawal(aVarP, this);
                    if (obj2 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return w0.s((e72.i) obj2);
            case 16:
                String str3 = (String) this.f569x;
                MultibancoWithdrawalService multibancoWithdrawalService2 = ((m) this.f568w).f1762a;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (multibancoWithdrawalService2.postWithdrawalCancel(str3, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i100 != 1) {
                        if (i100 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return w0.s((e72.i) obj2);
                    }
                    o.b(obj2);
                }
                this.v = 2;
                obj2 = multibancoWithdrawalService2.getWithdrawalCode(str3, this);
                if (obj2 == aVar20) {
                    return aVar20;
                }
                return w0.s((e72.i) obj2);
            case 17:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.a aVar22 = (com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.a) this.f568w;
                    a2j.c cVar9 = new a2j.c(aVar22, (ConsentPreferencesSelection) this.f569x, null, 3);
                    this.v = 1;
                    if (aVar22.p2(this, cVar9) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c cVar10 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) this.f568w;
                s sVar = new s(cVar10, (HyperTextTarget) this.f569x, null);
                this.v = 1;
                Object objP23 = cVar10.p2(this, sVar);
                return objP23 == aVar23 ? aVar23 : objP23;
            case 19:
                FlightSearchRequestFilters flightSearchRequestFilters = (FlightSearchRequestFilters) this.f569x;
                com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar6 = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) this.f568w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    i4g.b bVar7 = bVar6.f93425s;
                    this.v = 1;
                    j2 j2Var = bVar7.f158423b;
                    j2Var.getClass();
                    j2Var.g(null, flightSearchRequestFilters);
                    if (Unit.f186387a == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar6.I2(flightSearchRequestFilters, ((a7g.r) ((j2) bVar6.f93427w.f22677a).getValue()).f1895g);
                return Unit.f186387a;
            case 20:
                com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar8 = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) this.f568w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    h4g.k kVar = bVar8.f93423q;
                    this.v = 1;
                    if (kVar.f149371a.b(this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar8.J2((FlightSearchQuery) this.f569x, ((a7g.r) ((j2) bVar8.f93427w.f22677a).getValue()).f1895g);
                return Unit.f186387a;
            case 21:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    l93.f fVar2 = ((com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a) this.f568w).o;
                    ArrayList arrayList = (ArrayList) this.f569x;
                    this.v = 1;
                    x xVar = (x) fVar2;
                    xVar.getClass();
                    ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(h6l.b.b((f0) it8.next()));
                    }
                    mk0.a aVar27 = ((b1) xVar.f150432a).f286427g.f286453a;
                    v6l.i.Companion.getClass();
                    Intrinsics.checkNotNullParameter("CARDS_SORT_ORDER", "id");
                    Object objE = aVar27.e(new tk0.e("CARDS_SORT_ORDER"), arrayList2, this);
                    fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                    if (objE != aVar28) {
                        objE = Unit.f186387a;
                    }
                    if (objE != aVar28) {
                        objE = Unit.f186387a;
                    }
                    if (objE != aVar28) {
                        objE = Unit.f186387a;
                    }
                    if (objE == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    a8e.i iVar2 = (a8e.i) this.f568w;
                    a2j.c cVar11 = new a2j.c(iVar2, (u6e.a) this.f569x, null, 4);
                    this.v = 1;
                    if (iVar2.p2(this, cVar11) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.b bVar9 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.b) this.f568w;
                    a2j.c cVar12 = new a2j.c(bVar9, (it3.d) this.f569x, null, 6);
                    this.v = 1;
                    if (bVar9.p2(this, cVar12) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                FlowCollector flowCollector = (FlowCollector) this.f568w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    b bVar10 = new b((k) this.f569x, flowCollector, (Continuation) null, 13);
                    this.f568w = null;
                    this.v = 1;
                    if (e0.o(bVar10, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    n nVar = ((u) this.f568w).f2424s;
                    hj0.b bVar11 = (hj0.b) this.f569x;
                    String str4 = bVar11.d;
                    if (Intrinsics.f(str4, "revolut://app/cards/order-selection")) {
                        str4 = "revolut://app/cards/order-selection/skip_cards";
                    }
                    String key = bVar11.f152624a;
                    String title2 = bVar11.f152625b;
                    String str5 = bVar11.f152626c;
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(title2, "title");
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(title2, "title");
                    this.v = 1;
                    wli.x xVar2 = nVar.f234303a;
                    if (str4 == null || kotlin.text.d0.W(str4) || !xVar2.y1(str4)) {
                        pair = new Pair(str5, Boolean.valueOf(str5 != null ? xVar2.y1(str5) : false));
                    } else {
                        pair = new Pair(str4, Boolean.TRUE);
                    }
                    Object objM = gc0.c.m(xVar2, nVar.f234304b.a((String) pair.f186385a, ((Boolean) pair.f186386b).booleanValue()), "CardsTroubleshooterSelectionScreenModel", this);
                    if (objM != fim.a.COROUTINE_SUSPENDED) {
                        objM = Unit.f186387a;
                    }
                    if (objM == obj3) {
                        return obj3;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                h hVar = (h) this.f568w;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    o.b(obj2);
                    aae.f fVar3 = new aae.f(hVar, (qua.p) this.f569x, null, 1);
                    this.v = 1;
                    if (hVar.p2(this, fVar3) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                hVar.C2(aae.d.f2808a);
                return Unit.f186387a;
            case 27:
                ty0.a aVar33 = (ty0.a) this.f568w;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    o.b(obj2);
                    aah.h hVar2 = (aah.h) ((g) this.f569x).e;
                    this.f568w = null;
                    this.v = 1;
                    hVar2.getClass();
                    Object objB3 = pu7.a.B(hVar2.e, "onClauseClick", new a2j.c(aVar33, hVar2, null, 8), this);
                    if (objB3 != obj4) {
                        objB3 = Unit.f186387a;
                    }
                    if (objB3 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    o.b(obj2);
                    CardsTroubleshooterService cardsTroubleshooterService = (CardsTroubleshooterService) ((r) this.f568w).f207713b;
                    String strName = ((ya3.a) this.f569x).name();
                    this.v = 1;
                    obj2 = cardsTroubleshooterService.getCardTroubleshooters(strName, this);
                    if (obj2 == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return ((za3.a) obj2).getTroubleshooters();
            default:
                com.revolut.feature_retail_user_declarations.email.verification_screen.a aVar35 = (com.revolut.feature_retail_user_declarations.email.verification_screen.a) this.f568w;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                Continuation continuation = null;
                if (i113 == 0) {
                    o.b(obj2);
                    a2j.c cVar13 = new a2j.c(aVar35, (String) this.f569x, continuation, 9);
                    this.v = 1;
                    obj2 = aVar35.p2(this, cVar13);
                    if (obj2 == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                j jVar = (j) obj2;
                if (Intrinsics.f(jVar, pai.i.f234566a) || Intrinsics.f(jVar, pai.g.f234564a)) {
                    aVar35.f97604t.getClass();
                    return yji.l.a1(aVar35, aVar35.X1(pai.f.b()), null, null, new a07.d(aVar35, continuation, 15), 3);
                }
                if (!Intrinsics.f(jVar, pai.h.f234565a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar35.f97604t.getClass();
                return aVar35.X1(pai.f.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f569x = obj2;
    }
}
