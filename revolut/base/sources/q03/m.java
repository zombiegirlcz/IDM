package q03;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.card_reader.tips.impl.data.network.CardReaderTipsService;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentGroups;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingIntroScreenContent;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingReferralFlag;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingSummary;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.OptionalDocumentsContent;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ReferralFlagDetails;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.RequiredCheck;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreenContract$InputData$Legacy;
import com.revolut.feature.full_screen_prompt.navigation.PromptRetailBridgeDestination;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.offboarding.impl.data.service.RetailOffboardingService;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import dx4.a1;
import dx4.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import pej.a;
import qc0.f1;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f241091w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f241092x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f241091w = bVar;
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m((com.revolut.feature.card_management.impl.ui.kompot.settings.b) this.f241091w, (h93.f0) this.f241092x, continuation, 0);
            case 1:
                return new m((com.revolut.feature.card_management.impl.ui.kompot.settings.b) this.f241091w, (e03.b) this.f241092x, continuation, 1);
            case 2:
                return new m((com.revolut.feature.card_management.impl.ui.kompot.settings.b) this.f241091w, continuation);
            case 3:
                return new m((com.revolut.feature.card_management.impl.ui.kompot.settings.b) this.f241091w, (String) this.f241092x, continuation, 3);
            case 4:
                m mVar = new m((Address) this.f241092x, continuation, 4);
                mVar.f241091w = obj2;
                return mVar;
            case 5:
                m mVar2 = new m((q2a.f) this.f241092x, continuation, 5);
                mVar2.f241091w = obj2;
                return mVar2;
            case 6:
                return new m((com.revolut.feature.store.impl.ui.brand_detail.flow.c) this.f241092x, continuation, 6);
            case 7:
                return new m((q34.d) this.f241091w, (String) this.f241092x, continuation, 7);
            case 8:
                return new m((com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.f241091w, (j4a.a) this.f241092x, continuation, 8);
            case 9:
                return new m((com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.f241091w, (WhoToTransferFilter) this.f241092x, continuation, 9);
            case 10:
                return new m((com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.f241091w, this.f241092x, continuation, 10);
            case 11:
                return new m((vkm.d) this.f241091w, (q50.b) this.f241092x, continuation, 11);
            case 12:
                return new m((vkm.d) this.f241091w, (q50.f) this.f241092x, continuation, 12);
            case 13:
                return new m((vkm.d) this.f241091w, (q50.t) this.f241092x, continuation, 13);
            case 14:
                return new m((vkm.d) this.f241091w, (q50.o0) this.f241092x, continuation, 14);
            case 15:
                return new m((q53.c) this.f241091w, (wz5.a) this.f241092x, continuation, 15);
            case 16:
                return new m((com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) this.f241091w, (Function1) this.f241092x, continuation);
            case 17:
                return new m((com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a) this.f241091w, (dj0.d) this.f241092x, continuation, 17);
            case 18:
                return new m((q79.d) this.f241091w, (String) this.f241092x, continuation, 18);
            case 19:
                return new m((com.revolut.feature.credit.application.plugins.impl.ui.debts.c) this.f241091w, (x84.l) this.f241092x, continuation, 19);
            case 20:
                return new m((com.revolut.feature.credit.application.plugins.impl.ui.debts.c) this.f241091w, (pu3.b) this.f241092x, continuation, 20);
            case 21:
                return new m((com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a) this.f241091w, (eel.c) this.f241092x, continuation, 21);
            case 22:
                return new m((q95.b) this.f241091w, (w4l.k) this.f241092x, continuation, 22);
            case 23:
                return new m((q97.y) this.f241092x, continuation, 23);
            case 24:
                return new m((pej.a) this.f241091w, (q97.p0) this.f241092x, continuation, 24);
            case 25:
                return new m((qa0.e) this.f241091w, (String) this.f241092x, continuation, 25);
            case 26:
                return new m((com.revolut.feature.onboarding.impl.onboarding.country.screen.a) this.f241091w, (wi0.b) this.f241092x, continuation, 26);
            case 27:
                return new m((qah.c) this.f241091w, (q0h.a) this.f241092x, continuation, 27);
            case 28:
                return new m((com.revolut.feature.cash_topup.impl.ui.amount.c) this.f241091w, (qb3.h) this.f241092x, continuation, 28);
            default:
                return new m((f1) this.f241091w, (TutorialScreen) this.f241092x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v55, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v35, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v8, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f03.a aVar;
        Object objX;
        Object objB;
        Object objD;
        Object manualUnderwritingSummary;
        ManualUnderwritingIntroScreenContent manualUnderwritingIntroScreenContent;
        Iterator it8;
        tz3.g gVar;
        String str;
        DocumentGroups documentGroups;
        ?? arrayList;
        a1 a1VarA;
        ?? arrayList2;
        tz3.f fVar;
        ?? arrayList3;
        OptionalDocumentsContent optionalDocumentsContent;
        Object offboardingDeeplink;
        Object objX2;
        Object objA;
        Object objB2;
        Object objC;
        Object objC2;
        Object objA2;
        switch (this.u) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar = (com.revolut.feature.card_management.impl.ui.kompot.settings.b) this.f241091w;
                l lVar = new l(bVar, (h93.f0) this.f241092x, null);
                this.v = 1;
                Object objP2 = bVar.p2(this, lVar);
                return objP2 == aVar2 ? aVar2 : objP2;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar2 = (com.revolut.feature.card_management.impl.ui.kompot.settings.b) this.f241091w;
                n nVar = new n(bVar2, (e03.b) this.f241092x, null);
                this.v = 1;
                Object objP22 = bVar2.p2(this, nVar);
                return objP22 == aVar3 ? aVar3 : objP22;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar3 = (com.revolut.feature.card_management.impl.ui.kompot.settings.b) this.f241091w;
                    aVar = bVar3.v;
                    jhi.b bVarE = ((h0) bVar3.f64912s).e();
                    this.f241092x = aVar;
                    this.v = 1;
                    objX = vkm.q.x(bVarE, this);
                    if (objX == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    f03.a aVar5 = (f03.a) this.f241092x;
                    yhm.o.b(obj2);
                    aVar = aVar5;
                    objX = obj2;
                }
                this.f241092x = null;
                this.v = 2;
                if (aVar.b3((h93.f0) objX) == aVar4) {
                    return aVar4;
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar4 = (com.revolut.feature.card_management.impl.ui.kompot.settings.b) this.f241091w;
                pmk.t tVar = new pmk.t(bVar4, (String) this.f241092x, null, 9);
                this.v = 1;
                Object objB3 = pu7.a.B(bVar4.k, "terminate_card", tVar, this);
                return objB3 == aVar6 ? aVar6 : objB3;
            case 4:
                FlowCollector flowCollector = (FlowCollector) this.f241091w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    Data dataP = zi0.c.P((Address) this.f241092x, false, null, 3);
                    this.f241091w = null;
                    this.v = 1;
                    if (flowCollector.emit(dataP, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                PersistedBackground persistedBackground = (PersistedBackground) this.f241091w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q2a.f fVar2 = (q2a.f) this.f241092x;
                this.f241091w = null;
                this.v = 1;
                Object objC3 = fVar2.c(persistedBackground, this);
                return objC3 == aVar8 ? aVar8 : objC3;
            case 6:
                com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar = (com.revolut.feature.store.impl.ui.brand_detail.flow.c) this.f241092x;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarE = cVar.f88668w.e();
                    this.v = 1;
                    objB = nim.a.b(d0VarE, this);
                    if (objB == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar = (com.revolut.feature.store.impl.ui.brand_detail.flow.c) this.f241091w;
                        yhm.o.b(obj2);
                        objD = obj2;
                        return cVar.C1(new BridgeDestination((NaviCommand) objD));
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                hha.d dVar = (hha.d) objB;
                jgk.v vVar = cVar.f88669x;
                Intrinsics.h(dVar);
                this.f241091w = cVar;
                this.v = 2;
                objD = ((jjk.c) vVar).d(dVar, this);
                if (objD == aVar9) {
                    return aVar9;
                }
                return cVar.C1(new BridgeDestination((NaviCommand) objD));
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = ((q34.d) this.f241091w).f241797b;
                    String str2 = (String) this.f241092x;
                    this.v = 1;
                    manualUnderwritingSummary = creditPluginsService.getManualUnderwritingSummary(str2, this);
                    if (manualUnderwritingSummary == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    manualUnderwritingSummary = obj2;
                }
                tz3.i iVar = (tz3.i) manualUnderwritingSummary;
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                tz3.h introScreen = iVar.getIntroScreen();
                if (introScreen != null) {
                    Intrinsics.checkNotNullParameter(introScreen, "<this>");
                    manualUnderwritingIntroScreenContent = new ManualUnderwritingIntroScreenContent(introScreen.getTitle(), introScreen.getSubtitle());
                } else {
                    manualUnderwritingIntroScreenContent = null;
                }
                List referralFlags = iVar.getReferralFlags();
                Intrinsics.checkNotNullParameter(referralFlags, "<this>");
                List list = referralFlags;
                int i33 = 10;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    tz3.g gVar2 = (tz3.g) it9.next();
                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                    String referralId = gVar2.getReferralId();
                    String referralFlagName = gVar2.getReferralFlagName();
                    String title = gVar2.getTitle();
                    String subtitle = gVar2.getSubtitle();
                    String buttonText = gVar2.getButtonText();
                    String buttonHint = gVar2.getButtonHint();
                    tz3.f documentGroups2 = gVar2.getDocumentGroups();
                    if (documentGroups2 != null) {
                        Intrinsics.checkNotNullParameter(documentGroups2, "<this>");
                        List mandatoryReferralFlagsDetails = documentGroups2.getMandatoryReferralFlagsDetails();
                        if (mandatoryReferralFlagsDetails != null) {
                            List list2 = mandatoryReferralFlagsDetails;
                            it8 = it9;
                            gVar = gVar2;
                            arrayList2 = new ArrayList(zhm.w.t(list2, i33));
                            for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                tz3.k kVar = (tz3.k) it10.next();
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                arrayList2.add(new ReferralFlagDetails(kVar.getTitle(), kVar.getSubtitle()));
                            }
                        } else {
                            it8 = it9;
                            gVar = gVar2;
                            arrayList2 = zhm.f0.f322471a;
                        }
                        List optionalReferralFlagsDetails = documentGroups2.getOptionalReferralFlagsDetails();
                        if (optionalReferralFlagsDetails != null) {
                            List list3 = optionalReferralFlagsDetails;
                            fVar = documentGroups2;
                            arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                            for (Iterator it11 = list3.iterator(); it11.hasNext(); it11 = it11) {
                                tz3.k kVar2 = (tz3.k) it11.next();
                                Intrinsics.checkNotNullParameter(kVar2, "<this>");
                                arrayList3.add(new ReferralFlagDetails(kVar2.getTitle(), kVar2.getSubtitle()));
                            }
                        } else {
                            fVar = documentGroups2;
                            arrayList3 = zhm.f0.f322471a;
                        }
                        tz3.j optionalDocumentsContent2 = fVar.getOptionalDocumentsContent();
                        if (optionalDocumentsContent2 != null) {
                            Intrinsics.checkNotNullParameter(optionalDocumentsContent2, "<this>");
                            str = referralId;
                            optionalDocumentsContent = new OptionalDocumentsContent(optionalDocumentsContent2.getTitle(), optionalDocumentsContent2.getDescription(), optionalDocumentsContent2.getButtonTitle());
                        } else {
                            str = referralId;
                            optionalDocumentsContent = null;
                        }
                        documentGroups = new DocumentGroups(arrayList2, arrayList3, optionalDocumentsContent);
                    } else {
                        it8 = it9;
                        gVar = gVar2;
                        str = referralId;
                        documentGroups = new DocumentGroups(0);
                    }
                    List requiredChecks = gVar.getRequiredChecks();
                    if (requiredChecks != null) {
                        List<tz3.l> list4 = requiredChecks;
                        arrayList = new ArrayList(zhm.w.t(list4, 10));
                        for (tz3.l lVar2 : list4) {
                            Intrinsics.checkNotNullParameter(lVar2, "<this>");
                            String icon = lVar2.getIcon();
                            if (icon != null) {
                                a1.Companion.getClass();
                                a1VarA = y0.a(icon);
                            } else {
                                a1VarA = null;
                            }
                            arrayList.add(new RequiredCheck(a1VarA, lVar2.getText()));
                        }
                    } else {
                        arrayList = zhm.f0.f322471a;
                    }
                    arrayList4.add(new ManualUnderwritingReferralFlag(str, referralFlagName, title, subtitle, buttonText, buttonHint, documentGroups, arrayList));
                    it9 = it8;
                    i33 = 10;
                }
                return new ManualUnderwritingSummary(manualUnderwritingIntroScreenContent, arrayList4);
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar12 = (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.f241091w;
                    WhoToTransferActionItem whoToTransferActionItem = ((j4a.a) this.f241092x).f171330a;
                    this.v = 1;
                    if (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a.I2(aVar12, whoToTransferActionItem, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar14 = (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.f241091w;
                mcg.j jVar = new mcg.j(aVar14, (WhoToTransferFilter) this.f241092x, null, 9);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar14.k, "onFilterSelected", jVar, this);
                return objB4 == aVar13 ? aVar13 : objB4;
            case 10:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar16 = (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.f241091w;
                pmk.t tVar2 = new pmk.t(this.f241092x, aVar16, null, 12);
                this.v = 1;
                Object objB5 = pu7.a.B(aVar16.k, "onRowItemClicked", tVar2, this);
                return objB5 == aVar15 ? aVar15 : objB5;
            case 11:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    vkm.d dVar2 = (vkm.d) this.f241091w;
                    q50.b bVar5 = (q50.b) this.f241092x;
                    this.v = 1;
                    if (dVar2.collect(bVar5, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    vkm.d dVar3 = (vkm.d) this.f241091w;
                    q50.f fVar3 = (q50.f) this.f241092x;
                    this.v = 1;
                    if (dVar3.collect(fVar3, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    vkm.d dVar4 = (vkm.d) this.f241091w;
                    q50.t tVar3 = (q50.t) this.f241092x;
                    this.v = 1;
                    if (dVar4.collect(tVar3, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    vkm.d dVar5 = (vkm.d) this.f241091w;
                    q50.o0 o0Var = (q50.o0) this.f241092x;
                    this.v = 1;
                    if (dVar5.collect(o0Var, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                CardReaderTipsService cardReaderTipsService = ((q53.c) this.f241091w).f242289a;
                uz5.a aVarQ = knm.b.Q((wz5.a) this.f241092x);
                this.v = 1;
                Object objUpdateTipsSettings = cardReaderTipsService.updateTipsSettings(aVarQ, this);
                return objUpdateTipsSettings == aVar21 ? aVar21 : objUpdateTipsSettings;
            case 16:
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b bVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) this.f241091w;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    iuf.y yVar = new iuf.y(bVar6, 18);
                    boe.k kVar3 = new boe.k(20, null, (gim.i) this.f241092x);
                    this.v = 1;
                    if (n14.k.V(bVar6, null, null, yVar, kVar3, this, 3) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bVar6.C2(q64.m.f242485a);
                return Unit.f186387a;
            case 17:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a aVar24 = (com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a) this.f241091w;
                q75.q qVar = new q75.q(aVar24, (dj0.d) this.f241092x, null, 2);
                this.v = 1;
                Object objB6 = pu7.a.B(aVar24.k, "repay", qVar, this);
                return objB6 == aVar23 ? aVar23 : objB6;
            case 18:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                s8l.c cVar2 = null;
                str = null;
                String str3 = null;
                cVar2 = null;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    RetailOffboardingService retailOffboardingService = ((q79.d) this.f241091w).f242783a;
                    String str4 = (String) this.f241092x;
                    if (str4 == null) {
                        str4 = null;
                    }
                    this.v = 1;
                    offboardingDeeplink = retailOffboardingService.getOffboardingDeeplink(str4, this);
                    if (offboardingDeeplink == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    offboardingDeeplink = obj2;
                }
                q8l.b bVar7 = (q8l.b) offboardingDeeplink;
                String deeplink = bVar7.getDeeplink();
                q8l.a configuration = bVar7.getConfiguration();
                if (configuration != null) {
                    String confirmedDeeplink = configuration.getConfirmedDeeplink();
                    if (confirmedDeeplink == null || confirmedDeeplink.length() == 0) {
                        configuration = null;
                    }
                    if (configuration != null) {
                        String planOfferRetentionType = configuration.getPlanOfferRetentionType();
                        if (planOfferRetentionType != null && !kotlin.text.d0.W(planOfferRetentionType)) {
                            str3 = planOfferRetentionType;
                        }
                        String confirmedDeeplink2 = configuration.getConfirmedDeeplink();
                        if (confirmedDeeplink2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        cVar2 = new s8l.c(str3, confirmedDeeplink2);
                    }
                }
                return new s8l.d(deeplink, cVar2);
            case 19:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.debts.c) this.f241091w;
                    pmk.t tVar4 = new pmk.t(cVar3, (x84.l) this.f241092x, null, 13);
                    this.v = 1;
                    if (cVar3.p2(this, tVar4) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.debts.c) this.f241091w;
                q84.m mVar = new q84.m(cVar4, (pu3.b) this.f241092x, null, 1);
                this.v = 1;
                Object objB7 = pu7.a.B(cVar4.k, "remove debt", mVar, this);
                return objB7 == aVar27 ? aVar27 : objB7;
            case 21:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    b4h.e eVar = ((com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a) this.f241091w).f74602p;
                    eel.c cVar5 = (eel.c) this.f241092x;
                    this.v = 1;
                    if (eVar.b(cVar5, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                w4l.k kVar4 = (w4l.k) this.f241092x;
                q95.b bVar8 = (q95.b) this.f241091w;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    vkm.y yVarE = rd0.e.e(mo3.a.g(bVar8.f243639a.c(kVar4), null, new q92.f(1), 1), zhm.h0.f322473a, new otd.a(3, 13, null));
                    this.v = 1;
                    objX2 = vkm.q.x(yVarE, this);
                    if (objX2 == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i107 != 1) {
                        if (i107 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objA = obj2;
                        return q95.b.c((String) objA);
                    }
                    yhm.o.b(obj2);
                    objX2 = obj2;
                }
                if (!((Boolean) objX2).booleanValue()) {
                    throw new IllegalStateException("No active overdraft facility and application not available");
                }
                o95.i iVar2 = bVar8.f243640b;
                this.v = 2;
                objA = iVar2.a(kVar4, this);
                if (objA == aVar29) {
                    return aVar29;
                }
                return q95.b.c((String) objA);
            case 23:
                q97.y yVar2 = (q97.y) this.f241092x;
                q5b.c cVar6 = yVar2.f243824a;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    if (!((c6b.p) cVar6).a()) {
                        return zhm.f0.f322471a;
                    }
                    this.f241091w = yVar2;
                    this.v = 1;
                    objB2 = ((c6b.p) cVar6).b(this);
                    if (objB2 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar2 = (q97.y) this.f241091w;
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                boolean zBooleanValue = ((Boolean) objB2).booleanValue();
                yVar2.getClass();
                return zhm.u.c(new p97.a(t97.d.IHG_COBRAND, R$drawable.uikit_icn_24_hotel, zBooleanValue ? new TextLocalisedClause(R$string.cobrands_search_products_ihg_cobranded_title, null, null, 14) : new TextLocalisedClause(R$string.cobrands_search_products_ihg_title, null, null, 14), null, null, zhm.v.k(new TextLocalisedClause(R$string.cobrands_search_products_ihg_keywords_cobranded_card, null, null, 14), new TextLocalisedClause(R$string.cobrands_search_products_ihg_keywords_ihg, null, null, 14), new TextLocalisedClause(R$string.cobrands_search_products_ihg_keywords_ihg_one_rewards, null, null, 14), new TextLocalisedClause(R$string.cobrands_search_products_ihg_keywords_intercontinental, null, null, 14)), null));
            case 24:
                q97.p0 p0Var = (q97.p0) this.f241092x;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    pej.a aVar32 = (pej.a) this.f241091w;
                    if (aVar32 instanceof a.b) {
                        return vhi.c.c(new PromptRetailBridgeDestination(new FullScreenPromptScreenContract$InputData$Legacy(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_not_supported_prompt_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_not_supported_prompt_subtitle, null, null, 14), new ColorImage(new ColorImage.ColorAttr(R$attr.uikit_colorTransparent), null), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.common_action_got_it, null, null, 14), 16776140)), yhi.b.POPUP, null, false, 12);
                    }
                    if (!(aVar32 instanceof a.C1306a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fej.b bVar9 = p0Var.f243765b;
                    this.v = 1;
                    objC = ((ifj.f) bVar9).c(true, this);
                    if (objC == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objC = obj2;
                }
                return (FeatureCommand) objC;
            case 25:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    qa0.e eVar2 = (qa0.e) this.f241091w;
                    String str5 = (String) this.f241092x;
                    this.v = 1;
                    if (eVar2.c3(str5, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                com.revolut.feature.onboarding.impl.onboarding.country.screen.a aVar34 = (com.revolut.feature.onboarding.impl.onboarding.country.screen.a) this.f241091w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    efm.r rVarC = ((ik3.g) ((ik3.c) aVar34.f78431q).f161878a).f161888g.c();
                    this.v = 1;
                    objC2 = nim.a.c(rVarC, this);
                    if (objC2 == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objC2 = obj2;
                }
                e7l.f fVar4 = (e7l.f) objC2;
                if (fVar4 == null) {
                    return null;
                }
                aVar34.H2(aVar34.u, new pza.d((wi0.b) this.f241092x, 5, aVar34, fVar4));
                return Unit.f186387a;
            case 27:
                qah.c cVar7 = (qah.c) this.f241091w;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    sgh.a aVar37 = cVar7.f244037b;
                    q0h.a aVar38 = (q0h.a) this.f241092x;
                    this.v = 1;
                    objA2 = sgh.a.a(aVar38);
                    if (objA2 == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA2 = obj2;
                }
                cVar7.f244036a.b(new FeatureCommand((FeatureConfig) objA2));
                return Unit.f186387a;
            case 28:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.cash_topup.impl.ui.amount.c cVar8 = (com.revolut.feature.cash_topup.impl.ui.amount.c) this.f241091w;
                    pmk.t tVar5 = new pmk.t(cVar8, (qb3.h) this.f241092x, null, 14);
                    this.v = 1;
                    if (cVar8.p2(this, tVar5) == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar = ((f1) this.f241091w).f244419g;
                String str6 = ((TutorialScreen) this.f241092x).f63716j;
                Intrinsics.h(str6);
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, str6, null, null, this, 6);
                return objX1 == aVar40 ? aVar40 : objX1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b bVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 16;
        this.f241091w = bVar;
        this.f241092x = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241091w = obj2;
        this.f241092x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241092x = obj2;
    }
}
