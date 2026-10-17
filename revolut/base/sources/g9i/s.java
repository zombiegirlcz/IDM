package g9i;

import android.os.Parcelable;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlowContract$State;
import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.UploadDocumentsFlowContract$Step;
import com.revolut.feature.pix.api.model.PixKeyStatus;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.portability_details.PortabilityDetailsContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation.ReservationCreationFlowContract$Step;
import com.revolut.retail.core.navigation.NaviCommand;
import dr7.g;
import ge6.v;
import java.util.concurrent.CopyOnWriteArrayList;
import kl7.a1;
import kl7.y1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.e0;
import nii.m0;
import nii.y0;
import nii.z;
import yo7.i;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        a1 a1Var;
        boolean z;
        m0 zVar;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        Continuation continuation = null;
        switch (this.f) {
            case 0:
                NaviCommand p0 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((sri.m) this.receiver).c(p0);
                return Unit.f186387a;
            case 1:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "p0");
                ((gaa.d) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new z(new TextLocalisedClause(R$string.pix_request_portability_failure, null, null, 14), null, new TextLocalisedClause(R$string.pix_alias_registration_action_try_again, null, null, 14), new TextLocalisedClause(R$string.pix_alias_registration_action_got_it, null, null, 14), null, null, false, null, null, null, null, null, null, 32726);
            case 2:
                Throwable throwable2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable2, "p0");
                ((gaa.d) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                return new z(new TextLocalisedClause(R$string.pix_request_portability_failure, null, null, 14), null, new TextLocalisedClause(R$string.pix_alias_registration_action_try_again, null, null, 14), new TextLocalisedClause(R$string.pix_alias_registration_action_got_it, null, null, 14), null, null, false, null, null, null, null, null, null, 32726);
            case 3:
                String p03 = (String) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((yua.q) ((xua.a) this.receiver)).o(p03);
            case 4:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "p0");
                hb0.j jVar = (hb0.j) this.receiver;
                int i5 = jVar.f150543a;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                switch (i5) {
                    case 0:
                        hb0.k kVar = (hb0.k) jVar.f150544b;
                        kVar.H2(kVar.f150546q, new a3e.s(pagedData, 4));
                        break;
                    default:
                        jb0.i iVar = (jb0.i) jVar.f150544b;
                        iVar.H2(iVar.u, new a3e.s(pagedData, 7));
                        break;
                }
                return Unit.f186387a;
            case 5:
                hba.d p010 = (hba.d) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                com.revolut.feature.pix.impl.flow.portability_details.a aVar = (com.revolut.feature.pix.impl.flow.portability_details.a) this.receiver;
                yki.a aVar2 = aVar.f80676t;
                int i6 = gba.d.f142245a[p010.ordinal()];
                if (i6 == 1) {
                    oki.h.D2(aVar2);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(aVar, aVar2, aVar.I2(), true, null, false, 12);
                }
                return Unit.f186387a;
            case 6:
                wca.f p011 = (wca.f) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                com.revolut.feature.pix.impl.flow.portability_details.a aVar3 = (com.revolut.feature.pix.impl.flow.portability_details.a) this.receiver;
                PortabilityDetailsContract$InputData portabilityDetailsContract$InputData = aVar3.o;
                int i21 = 26;
                if (aVar3.f80675s) {
                    gba.c cVar = aVar3.f80673q;
                    aVar3.l2(new g0a.e(aVar3, new s(1, cVar, gba.c.class, "providePortabilityDifferentOwnershipFinishErrorConfig", "providePortabilityDifferentOwnershipFinishErrorConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Error;", 0, 7), new a76.c(0, cVar, gba.c.class, "providePortabilityDifferentOwnershipFinishSuccessConfig", "providePortabilityDifferentOwnershipFinishSuccessConfig()Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;", 0, 22), new gba.e(aVar3, p011, continuation, i2), (Continuation) null), new yi5.b(i21));
                } else if (portabilityDetailsContract$InputData.f80669b.getF80406b() instanceof PixKeyStatus.UnderPortability.DifferentOwnership) {
                    gba.c cVar2 = aVar3.f80673q;
                    aVar3.l2(new g0a.e(aVar3, new s(1, cVar2, gba.c.class, "providePortabilityDifferentOwnershipDenyErrorConfig", "providePortabilityDifferentOwnershipDenyErrorConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Error;", 0, 8), new a76.c(0, cVar2, gba.c.class, "providePortabilityDifferentOwnershipDenySuccessConfig", "providePortabilityDifferentOwnershipDenySuccessConfig()Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;", 0, 23), new gba.e(aVar3, p011, continuation, i3), (Continuation) null), new yi5.b(i21));
                } else if (portabilityDetailsContract$InputData.f80669b.getF80406b() instanceof PixKeyStatus.UnderPortability.SameOwnership) {
                    gba.c cVar3 = aVar3.f80673q;
                    aVar3.l2(new g0a.e(aVar3, new s(1, cVar3, gba.c.class, "providePortabilitySameOwnershipDenyErrorConfig", "providePortabilitySameOwnershipDenyErrorConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Error;", 0, 9), new a76.c(0, cVar3, gba.c.class, "providePortabilitySameOwnershipDenySuccessConfig", "providePortabilitySameOwnershipDenySuccessConfig()Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;", 0, 24), new gba.e(aVar3, p011, continuation, i), (Continuation) null), new yi5.b(i21));
                }
                return Unit.f186387a;
            case 7:
                Throwable throwable3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable3, "p0");
                ((gba.c) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(throwable3, "throwable");
                return new z(new TextLocalisedClause(R$string.pix_ownership_claim_finish_failure_title, null, null, 14), null, new TextLocalisedClause(R$string.pix_alias_registration_action_try_again, null, null, 14), new TextLocalisedClause(R$string.pix_alias_registration_action_got_it, null, null, 14), null, null, false, null, null, null, null, null, null, 32726);
            case 8:
                Throwable throwable4 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable4, "p0");
                ((gba.c) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(throwable4, "throwable");
                return new z(new TextLocalisedClause(R$string.pix_reply_ownership_claim_decline_failure_title, null, null, 14), null, new TextLocalisedClause(R$string.pix_alias_registration_action_try_again, null, null, 14), new TextLocalisedClause(R$string.pix_alias_registration_action_got_it, null, null, 14), null, null, false, null, null, null, null, null, null, 32726);
            case 9:
                Throwable throwable5 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable5, "p0");
                ((gba.c) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(throwable5, "throwable");
                return new z(new TextLocalisedClause(R$string.pix_migration_details_deny_failure_title, null, null, 14), null, new TextLocalisedClause(R$string.pix_alias_registration_action_try_again, null, null, 14), new TextLocalisedClause(R$string.pix_alias_registration_action_got_it, null, null, 14), null, null, false, null, null, null, null, null, null, 32726);
            case 10:
                Intrinsics.checkNotNullParameter((ServerError) obj2, "p0");
                v.N((v) this.receiver);
                return Boolean.TRUE;
            case 11:
                Intrinsics.checkNotNullParameter((ServerError) obj2, "p0");
                v.N((v) this.receiver);
                return Boolean.TRUE;
            case 12:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                TwinHorizontalButton twinHorizontalButton = ((jqi.b) ((jqi.e) this.receiver)).f177726j;
                if (twinHorizontalButton != null) {
                    twinHorizontalButton.setSecondaryButtonEnabled(zBooleanValue);
                    return Unit.f186387a;
                }
                Intrinsics.r("twinHorizontalButton");
                throw null;
            case 13:
                ieb.h p012 = (ieb.h) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation.a aVar4 = (com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation.a) this.receiver;
                oki.h.t2(aVar4, aVar4.o, new ReservationCreationFlowContract$Step.Confirmation(p012.f160689a.f82809a), false, null, false, 12);
                return Unit.f186387a;
            case 14:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                gh1.i iVar2 = (gh1.i) this.receiver;
                iVar2.getClass();
                yji.l.a1(iVar2, iVar2.X1(new y0(null, new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new gh1.g(iVar2, continuation, i3), 3);
                return Boolean.TRUE;
            case 15:
                ((gom.c) this.receiver).e((Throwable) obj2);
                return Unit.f186387a;
            case 16:
                Throwable p013 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                gm7.d dVar = (gm7.d) this.receiver;
                dVar.getClass();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "request failed", p013, h0Var);
                dVar.L2(vl7.a.a(15, null, null, null));
                return Boolean.TRUE;
            case 17:
                km7.c p014 = (km7.c) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.mta.b bVar = (com.revolut.feature.insurance_car.impl.ui.flow.mta.b) this.receiver;
                MtaFlowContract$State updateState = (MtaFlowContract$State) bVar.A2().f98429a;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                bVar.L2(MtaFlowContract$State.a(updateState, null, false, null, null, p014.f185731a, null, null, null, 495));
                bVar.O2();
                return Unit.f186387a;
            case 18:
                yn7.f p015 = (yn7.f) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.mta.b bVar2 = (com.revolut.feature.insurance_car.impl.ui.flow.mta.b) this.receiver;
                bVar2.getClass();
                MtaFlowContract$State updateState2 = (MtaFlowContract$State) bVar2.A2().f98429a;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                int i22 = gm7.f.f144788a[p015.f315267a.ordinal()];
                if (i22 == 1) {
                    a1Var = a1.VEHICLE_SUBSTITUTE;
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a1Var = a1.VEHICLE_ADD;
                }
                bVar2.L2(MtaFlowContract$State.a(updateState2, a1Var, false, null, null, null, null, null, null, 510));
                bVar2.P2(MtaFlowContract$Step.SelectCar.f75376a);
                return Unit.f186387a;
            case 19:
                ao7.h p016 = (ao7.h) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.mta.b bVar3 = (com.revolut.feature.insurance_car.impl.ui.flow.mta.b) this.receiver;
                if (!(p016 instanceof ao7.g)) {
                    bVar3.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                MtaFlowContract$State updateState3 = (MtaFlowContract$State) bVar3.A2().f98429a;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                ao7.g gVar = (ao7.g) p016;
                bVar3.L2(MtaFlowContract$State.a(updateState3, null, false, gVar.f7909a, gVar.f7910b, null, null, null, null, 499));
                bVar3.O2();
                return Unit.f186387a;
            case 20:
                yo7.i p017 = (yo7.i) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.mta.b bVar4 = (com.revolut.feature.insurance_car.impl.ui.flow.mta.b) this.receiver;
                if (p017 instanceof yo7.j) {
                    MtaFlowContract$State updateState4 = (MtaFlowContract$State) bVar4.A2().f98429a;
                    Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                    bVar4.L2(MtaFlowContract$State.a(updateState4, null, false, null, null, null, ((yo7.j) p017).f315618a, null, null, 479));
                    bVar4.P2(MtaFlowContract$Step.Eligibility.f75371a);
                } else {
                    bVar4.getClass();
                    if (!(p017 instanceof i.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i32 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 21:
                eo7.d p018 = (eo7.d) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.mta.b bVar5 = (com.revolut.feature.insurance_car.impl.ui.flow.mta.b) this.receiver;
                bVar5.getClass();
                MtaFlowContract$State updateState5 = (MtaFlowContract$State) bVar5.A2().f98429a;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                int i33 = gm7.f.f144789b[p018.f127871a.ordinal()];
                if (i33 == 1) {
                    z = false;
                } else {
                    if (i33 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                bVar5.L2(MtaFlowContract$State.a(updateState5, null, z, null, null, null, null, null, null, 509));
                bVar5.P2(MtaFlowContract$Step.DriverDetails.f75369a);
                return Unit.f186387a;
            case 22:
                ep7.g p019 = (ep7.g) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.mta.b bVar6 = (com.revolut.feature.insurance_car.impl.ui.flow.mta.b) this.receiver;
                if (!(p019 instanceof ep7.f)) {
                    bVar6.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                MtaFlowContract$State updateState6 = (MtaFlowContract$State) bVar6.A2().f98429a;
                Intrinsics.checkNotNullParameter(updateState6, "$this$updateState");
                bVar6.L2(MtaFlowContract$State.a(updateState6, null, false, null, null, null, null, ((ep7.f) p019).f128096a, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG));
                bVar6.O2();
                return Unit.f186387a;
            case 23:
                wm7.c p020 = (wm7.c) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.mta.b bVar7 = (com.revolut.feature.insurance_car.impl.ui.flow.mta.b) this.receiver;
                MtaFlowContract$State updateState7 = (MtaFlowContract$State) bVar7.A2().f98429a;
                Intrinsics.checkNotNullParameter(updateState7, "$this$updateState");
                bVar7.L2(MtaFlowContract$State.a(updateState7, null, false, null, null, null, null, null, p020.f298616a, 383));
                bVar7.O2();
                return Unit.f186387a;
            case 24:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "p0");
                ((com.revolut.feature.insurance_car.impl.ui.flow.mta.b) this.receiver).getClass();
                throw null;
            case 25:
                dr7.g p021 = (dr7.g) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b bVar8 = (com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b) this.receiver;
                bVar8.getClass();
                if (p021 instanceof g.a) {
                    bVar8.C1(sl7.c.a("topic.car-insurance"));
                } else if (p021 instanceof dr7.f) {
                    RequestedDocument requestedDocument = ((dr7.f) p021).f117093a;
                    if (requestedDocument.f75305h == y1.UPLOADED) {
                        bVar8.P2(new UploadDocumentsFlowContract$Step.DocumentsPreview(requestedDocument));
                    } else if (requestedDocument.f75304g != null) {
                        bVar8.P2(new UploadDocumentsFlowContract$Step.DocumentRejectionReason(requestedDocument));
                    } else {
                        bVar8.P2(new UploadDocumentsFlowContract$Step.DocumentUploadHint(requestedDocument));
                    }
                } else {
                    if (!(p021 instanceof g.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar8.l2(new ge7.f(bVar8, continuation, 18), new s(1, bVar8, vl7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 26));
                }
                return Unit.f186387a;
            case 26:
                Throwable p022 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                vl7.a.g((yji.l) this.receiver, p022);
                return Boolean.TRUE;
            case 27:
                Throwable p023 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                vl7.a.g((yji.l) this.receiver, p023);
                return Boolean.TRUE;
            case 28:
                Throwable p024 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                vl7.a.g((yji.l) this.receiver, p024);
                return Boolean.TRUE;
            default:
                Throwable p025 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                grc.k kVar2 = (grc.k) this.receiver;
                kVar2.getClass();
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p025, h0Var2);
                if (tj0.a.a(p025)) {
                    zVar = new e0((Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_description, null, null, 14), (TextLocalisedClause) null, (Parcelable) null, false, (AnalyticsProduct) null, 1020);
                } else {
                    ServerError serverErrorA = kVar2.f145978t.a(p025);
                    v60.c cVarB = ((ao0.a) kVar2.u).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
                    TextLocalisedClause textLocalisedClauseO = cVarB != null ? ofm.q.O(cVarB) : null;
                    zVar = new z(textLocalisedClauseO == null ? new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_mx_bank_account_error_title, null, null, 14) : textLocalisedClauseO, textLocalisedClauseO == null ? new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_mx_bank_account_error_subtitle, null, null, 14) : null, null, null, null, null, false, null, null, null, null, null, null, 32764);
                }
                kVar2.X1(new y0(null, zVar, false, 5));
                return Boolean.TRUE;
        }
    }
}
