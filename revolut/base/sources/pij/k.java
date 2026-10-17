package pij;

import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimMigrationFromDataPlansOnly;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingProgress;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.EsimDynamicTermsMapper$TermsClickData;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$ClauseClickParcel;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$EsimProfilesParcel;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OpenPortingStatusParcel;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OutputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreenContract$Action;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.EsimMobilePlanEsimMigrationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.EsimMobilePlanEsimMigrationScreenContract$InputData;
import dej.r3;
import dej.s3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimSubscriptionsScreen f236559w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(EsimSubscriptionsScreen esimSubscriptionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f236559w = esimSubscriptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f236559w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k(this.f236559w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k(this.f236559w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
            case 3:
                k kVar4 = new k(this.f236559w, continuation, 3);
                kVar4.v = obj2;
                return kVar4;
            case 4:
                k kVar5 = new k(this.f236559w, continuation, 4);
                kVar5.v = obj2;
                return kVar5;
            case 5:
                k kVar6 = new k(this.f236559w, continuation, 5);
                kVar6.v = obj2;
                return kVar6;
            case 6:
                k kVar7 = new k(this.f236559w, continuation, 6);
                kVar7.v = obj2;
                return kVar7;
            case 7:
                k kVar8 = new k(this.f236559w, continuation, 7);
                kVar8.v = obj2;
                return kVar8;
            default:
                k kVar9 = new k(this.f236559w, continuation, 8);
                kVar9.v = obj2;
                return kVar9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((EsimProfile) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k) create((EsimSubscriptionsScreenContract$EsimProfilesParcel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((k) create((EsimProfile) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((k) create((EsimSubscriptionsScreenContract$EsimProfilesParcel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((k) create((EsimProfile) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        EsimGiftRecipient esimGiftRecipient;
        EsimGiftRecipient esimGiftRecipient2;
        Set<s3> setKeySet;
        Object next;
        aii.r goToGetPlan;
        int i = this.u;
        int i2 = 7;
        int i3 = 2;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i5 = 0;
        int i6 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        EsimSubscriptionsScreen esimSubscriptionsScreen = this.f236559w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE3 = esimSubscriptionsScreen.R2();
                String id10 = clickData.f275445a;
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                if (obj3 instanceof EsimSubscriptionsScreenContract$ClauseClickParcel.UrlNavigation) {
                    String str2 = ((EsimSubscriptionsScreenContract$ClauseClickParcel.UrlNavigation) obj3).f101027a;
                    if (str2 == null) {
                        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Clicked null T&C link with id ", id10));
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsScreenModel", null, illegalStateException, h0Var);
                    } else if (Intrinsics.f(id10, "ID_REVOLUT_TERMS_CLAUSE") || Intrinsics.f(id10, "ID_PARTNER_TERMS_CLAUSE")) {
                        bVar.C1(new ExternalDestination.Browser(str2, null));
                    }
                } else if (obj3 instanceof EsimDynamicTermsMapper$TermsClickData.UrlParcel) {
                    bVar.A1(new v0(bVar, ((EsimDynamicTermsMapper$TermsClickData.UrlParcel) obj3).f100945b, objArr == true ? 1 : 0, i5), new yi5.b(25));
                } else if (obj3 instanceof EsimDynamicTermsMapper$TermsClickData.DownloadContractSummaryParcel) {
                    EsimDynamicTermsMapper$TermsClickData.DownloadContractSummaryParcel downloadContractSummaryParcel = (EsimDynamicTermsMapper$TermsClickData.DownloadContractSummaryParcel) obj3;
                    bVar.A1(new w0(bVar, downloadContractSummaryParcel.f100941a, downloadContractSummaryParcel.d, downloadContractSummaryParcel.f100943c, downloadContractSummaryParcel.e, null), new yi5.b(25));
                }
                return Unit.f186387a;
            case 1:
                EsimProfile esimProfile = (EsimProfile) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE32 = esimSubscriptionsScreen.R2();
                Intrinsics.h(esimProfile);
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
                bVar2.L2(esimProfile, pd.b.j((Boolean) ((v) ((j2) bVar2.f101081e0.f22677a).getValue()).f236585l.getContent()));
                return Unit.f186387a;
            case 2:
                EsimSubscriptionsScreenContract$EsimProfilesParcel esimSubscriptionsScreenContract$EsimProfilesParcel = (EsimSubscriptionsScreenContract$EsimProfilesParcel) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE33 = esimSubscriptionsScreen.R2();
                ArrayList esimProfiles = esimSubscriptionsScreenContract$EsimProfilesParcel.f101028a;
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar3 = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE33;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
                if (esimProfiles.size() == 1) {
                    EsimProfile esimProfile2 = (EsimProfile) zhm.d0.b0(esimProfiles);
                    EsimProfileDetails esimProfileDetails = esimProfile2.f100426g;
                    if (esimProfileDetails == null || (str = esimProfileDetails.f100434b) == null) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Can't install eSIM due to missing activation code");
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsScreenModel", null, illegalStateException2, h0Var2);
                        str = null;
                    }
                    bVar3.W.getClass();
                    String strA = ehj.d.a(esimProfile2);
                    boolean zJ = pd.b.j((Boolean) ((v) ((j2) bVar3.f101081e0.f22677a).getValue()).f236585l.getContent());
                    if (str == null && strA == null) {
                        IllegalStateException illegalStateException3 = new IllegalStateException("Can't trigger eSIM migration: both lpa and installationUrl are null");
                        zhm.h0 h0Var3 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsScreenModel", null, illegalStateException3, h0Var3);
                    } else {
                        EsimMigrationFromDataPlansOnly esimMigrationFromDataPlansOnly = esimProfile2.f100427h;
                        if (esimMigrationFromDataPlansOnly != null) {
                            bVar3.f2(new EsimMobilePlanEsimMigrationScreen(esimMigrationFromDataPlansOnly.f100292a ? EsimMobilePlanEsimMigrationScreenContract$InputData.ActiveDataPlanExists.f101215a : EsimMobilePlanEsimMigrationScreenContract$InputData.NoActiveDataPlan.f101216a), bottom_dialog, new pb2.v(new et0.q0(bVar3, esimProfile2, zJ, i2), 28));
                        } else {
                            bVar3.L2(esimProfile2, zJ);
                        }
                    }
                } else if (esimProfiles.isEmpty()) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Can't open esim installation picker, esimProfiles are empty");
                    zhm.h0 h0Var4 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsScreenModel", null, illegalStateException4, h0Var4);
                } else {
                    bVar3.f2(new EsimSetupOptionsScreen(new EsimSetupOptionsScreenContract$InputData.Install(esimProfiles)), bottom_dialog, new pb2.v(new i0(bVar3, i6), 26));
                }
                return Unit.f186387a;
            case 3:
                EsimProfile esimProfile3 = (EsimProfile) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE34 = esimSubscriptionsScreen.R2();
                Intrinsics.h(esimProfile3);
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar4 = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE34;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(esimProfile3, "esimProfile");
                bVar4.l2(new h1(bVar4, esimProfile3, objArr2 == true ? 1 : 0, i6), new yi5.b(26));
                return Unit.f186387a;
            case 4:
                EsimSubscriptionsScreenContract$EsimProfilesParcel esimSubscriptionsScreenContract$EsimProfilesParcel2 = (EsimSubscriptionsScreenContract$EsimProfilesParcel) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE35 = esimSubscriptionsScreen.R2();
                ArrayList esimProfiles2 = esimSubscriptionsScreenContract$EsimProfilesParcel2.f101028a;
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar5 = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE35;
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(esimProfiles2, "esimProfiles");
                if (esimProfiles2.size() == 1) {
                    EsimProfile esimProfile4 = (EsimProfile) zhm.d0.b0(esimProfiles2);
                    bVar5.R2(esimProfile4, new j0(bVar5, esimProfile4, 0));
                } else if (esimProfiles2.isEmpty()) {
                    zhm.h0 h0Var5 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsScreenModel", "Can't transfer esim profiles to this device esimProfiles are empty", null, h0Var5);
                } else {
                    bVar5.f2(new EsimSetupOptionsScreen(new EsimSetupOptionsScreenContract$InputData.Transfer(esimProfiles2)), bottom_dialog, new pb2.v(new i0(bVar5, i3), 27));
                }
                return Unit.f186387a;
            case 5:
                EsimProfile esimProfile5 = (EsimProfile) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE36 = esimSubscriptionsScreen.R2();
                Intrinsics.h(esimProfile5);
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar6 = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE36;
                bVar6.getClass();
                Intrinsics.checkNotNullParameter(esimProfile5, "esimProfile");
                bVar6.l2(new h1(bVar6, esimProfile5, objArr3 == true ? 1 : 0, i5), new yi5.b(26));
                return Unit.f186387a;
            case 6:
                ty0.a aVar7 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE37 = esimSubscriptionsScreen.R2();
                Object obj4 = aVar7.d;
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar7 = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE37;
                bVar7.getClass();
                if (obj4 instanceof EsimSubscriptionsScreenContract$OpenPortingStatusParcel) {
                    EsimSubscriptionsScreenContract$OpenPortingStatusParcel esimSubscriptionsScreenContract$OpenPortingStatusParcel = (EsimSubscriptionsScreenContract$OpenPortingStatusParcel) obj4;
                    EsimPhoneNumberPortingProgress esimPhoneNumberPortingProgress = esimSubscriptionsScreenContract$OpenPortingStatusParcel.f101042a;
                    if (!esimPhoneNumberPortingProgress.f100384b.isEmpty()) {
                        String str3 = esimSubscriptionsScreenContract$OpenPortingStatusParcel.f101043b;
                        if (str3 != null) {
                            Map map = (Map) ((v) ((j2) bVar7.f101081e0.f22677a).getValue()).f236590r.getContent();
                            if (map == null || (setKeySet = map.keySet()) == null) {
                                esimGiftRecipient2 = null;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                for (s3 s3Var : setKeySet) {
                                    r3 r3Var = s3Var instanceof r3 ? (r3) s3Var : null;
                                    EsimGiftRecipient esimGiftRecipient3 = r3Var != null ? r3Var.f113643a : null;
                                    if (esimGiftRecipient3 != null) {
                                        arrayList.add(esimGiftRecipient3);
                                    }
                                }
                                Iterator it8 = arrayList.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        next = it8.next();
                                        EsimGiftRecipient esimGiftRecipient4 = (EsimGiftRecipient) next;
                                        String str4 = esimGiftRecipient4.f100269b;
                                        if (str4 == null) {
                                            str4 = esimGiftRecipient4.f100270c;
                                        }
                                        if (str3.equals(str4)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                esimGiftRecipient2 = (EsimGiftRecipient) next;
                            }
                            esimGiftRecipient = esimGiftRecipient2;
                        } else {
                            esimGiftRecipient = null;
                        }
                        TextClause textClause = new TextClause(esimPhoneNumberPortingProgress.f100383a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        List list = esimPhoneNumberPortingProgress.f100384b;
                        EsimPhoneNumberPortingProgress.Action action = esimPhoneNumberPortingProgress.d;
                        EsimCompleteNumberTransferBottomSheetScreenContract$Action esimCompleteNumberTransferBottomSheetScreenContract$Action = action != null ? new EsimCompleteNumberTransferBottomSheetScreenContract$Action(new TextClause(action.f100386a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), action.f100387b) : null;
                        List<EsimPhoneNumberPortingProgress.Action> list2 = esimPhoneNumberPortingProgress.f100385c;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (EsimPhoneNumberPortingProgress.Action action2 : list2) {
                            arrayList2.add(new EsimCompleteNumberTransferBottomSheetScreenContract$Action(new TextClause(action2.f100386a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), action2.f100387b));
                        }
                        bVar7.f2(new EsimCompleteNumberTransferBottomSheetScreen(new EsimCompleteNumberTransferBottomSheetScreenContract$InputData(textClause, list, null, arrayList2, esimCompleteNumberTransferBottomSheetScreenContract$Action, esimGiftRecipient, 4)), bottom_dialog, new i0(bVar7, i2));
                    }
                } else if (obj4 instanceof EsimDescriptorValue.Link) {
                    bVar7.l2(new c1(bVar7, obj4, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 7:
                ty0.a aVar9 = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE38 = esimSubscriptionsScreen.R2();
                Object obj5 = aVar9.d;
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar8 = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE38;
                bVar8.getClass();
                EsimDescriptorValue.Link link = obj5 instanceof EsimDescriptorValue.Link ? (EsimDescriptorValue.Link) obj5 : null;
                if (link != null) {
                    bVar8.A1(new v0(bVar8, link.f100253a, objArr4 == true ? 1 : 0, i5), new yi5.b(25));
                }
                return Unit.f186387a;
            default:
                n6 n6Var = (n6) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarE39 = esimSubscriptionsScreen.R2();
                Object obj6 = n6Var.k;
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar9 = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE39;
                bVar9.getClass();
                if (obj6 instanceof w) {
                    int i21 = m0.f236564a[((w) obj6).ordinal()];
                    if (i21 == 1) {
                        goToGetPlan = new EsimSubscriptionsScreenContract$OutputData.GoToGetPlan(0);
                    } else {
                        if (i21 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        goToGetPlan = EsimSubscriptionsScreenContract$OutputData.GiftPlanClicked.f101047a;
                    }
                    bVar9.C2(goToGetPlan);
                }
                return Unit.f186387a;
        }
    }
}
