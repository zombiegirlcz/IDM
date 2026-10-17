package ge6;

import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.mobile_services.api.exceptions.MsApiException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import com.revolut.feature.extension_auth.impl.ui.ExtensionAuthActivity;
import com.revolut.retail.core.navigation.IntentCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.sso.api.R$string;
import efm.d0;
import fo1.b0;
import ip0.dg;
import ip0.pb0;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f143244b;

    public /* synthetic */ m(v vVar, int i) {
        this.f143243a = i;
        this.f143244b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0 d0VarL;
        d0 d0VarL2;
        switch (this.f143243a) {
            case 0:
                dg it8 = (dg) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                final int i = 2;
                final v vVar = this.f143244b;
                pfm.h hVar = new pfm.h(new kfm.a() { // from class: ge6.n
                    @Override // kfm.a
                    public final void run() {
                        switch (i) {
                            case 0:
                                v vVar2 = vVar;
                                vVar2.f143253h.c(new IntentCommand(((s70.b) vVar2.f143258p).b(), null));
                                break;
                            case 1:
                                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, vVar.f143253h);
                                break;
                            case 2:
                                vVar.P();
                                break;
                            default:
                                ((k3l.d) vVar.f143255l).O(new StatusViewConfiguration.Warning("REJECTED_STATUS_VIEW", new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_subtitle, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_suspisious, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_dismiss, null, null, 14), null, 992));
                                break;
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 1:
                String workflowId = (String) obj2;
                Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                return new pfm.h(new f0d.m(this.f143244b, workflowId, 24), 2);
            case 2:
                ((k3l.d) this.f143244b.f143255l).O(new StatusViewConfiguration.Error("status_view_id", new TextLocalisedClause(com.revolut.feature.extension_auth.impl.R$string.revolut_secure_sign_in_timeout_title, null, null, 14), null, null, null, null, null, 8188));
                return Unit.f186387a;
            case 3:
                ExtensionAuthRequestData it9 = (ExtensionAuthRequestData) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                v vVar2 = this.f143244b;
                l lVar = vVar2.i;
                ExtensionAuthRequestData extensionAuthRequestData = (ExtensionAuthRequestData) te0.w.O(((w) lVar.f143241b).w0());
                if (extensionAuthRequestData != null) {
                    d0VarL = lVar.f143240a.a(extensionAuthRequestData).D(extensionAuthRequestData);
                } else {
                    d0VarL = d0.l(new IllegalStateException("state.requestData can't be null"));
                    Intrinsics.checkNotNullExpressionValue(d0VarL, "error(...)");
                }
                pfm.a aVar = new pfm.a(vVar2.O(o70.a.i(d0VarL)), new j(9, new m(vVar2, 9)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return ue0.e.v(aVar);
            case 4:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                v vVar3 = this.f143244b;
                pfm.a aVar2 = new pfm.a(vVar3.i.a(), new j(4, new m(vVar3, 3)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
            case 5:
                this.f143244b.f143260r.onNext(x.LOADING);
                return Unit.f186387a;
            case 6:
                if (((Throwable) obj2) instanceof MsApiException) {
                    ((k3l.d) this.f143244b.f143255l).O(new StatusViewConfiguration.Error("APPROVE_RESULT_FAILURE", new TextLocalisedClause(R$string.revolut_sso_login_incorrect_location_mismatch_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_incorrect_location_mismatch_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_incorrect_location_mismatch_action, null, null, 14), null, null, null, 8176));
                }
                return Unit.f186387a;
            case 7:
                this.f143244b.f143260r.onNext(((Throwable) obj2) instanceof ServerErrorException ? x.FINISHING : x.IDLE);
                return Unit.f186387a;
            case 8:
                this.f143244b.f143260r.onNext(x.FINISHING);
                return Unit.f186387a;
            case 9:
                ExtensionAuthRequestData resultModel = (ExtensionAuthRequestData) obj2;
                Intrinsics.checkNotNullParameter(resultModel, "resultModel");
                return new pfm.h(new f0d.m(this.f143244b, resultModel, 25), 2);
            case 10:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                v vVar4 = this.f143244b;
                l lVar2 = vVar4.i;
                ExtensionAuthRequestData extensionAuthRequestData2 = (ExtensionAuthRequestData) te0.w.O(((w) lVar2.f143241b).w0());
                if (extensionAuthRequestData2 != null) {
                    d0VarL2 = lVar2.f143240a.c(extensionAuthRequestData2).D(extensionAuthRequestData2);
                } else {
                    d0VarL2 = d0.l(new IllegalStateException("state.requestData can't be null"));
                    Intrinsics.checkNotNullExpressionValue(d0VarL2, "error(...)");
                }
                pfm.a aVar3 = new pfm.a(vVar4.O(o70.a.i(d0VarL2)), new j(1, new m(vVar4, 15)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return aVar3;
            case 11:
                v vVar5 = this.f143244b;
                d dVar = (d) vVar5.L();
                if (dVar != null) {
                    vVar5.f143254j.getClass();
                    pb0 pb0Var = new pb0("loading_id");
                    yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                    ((ExtensionAuthActivity) dVar).setItems(zhm.u.c(pb0Var));
                }
                return Unit.f186387a;
            case 12:
                if (((Throwable) obj2) instanceof ServerErrorException) {
                    return Unit.f186387a;
                }
                v vVar6 = this.f143244b;
                d dVar2 = (d) vVar6.L();
                if (dVar2 != null) {
                    vVar6.f143254j.getClass();
                    ((ExtensionAuthActivity) dVar2).setItems(h.c());
                }
                return Unit.f186387a;
            case 13:
                ExtensionAuthRequestData extensionAuthRequestData3 = (ExtensionAuthRequestData) obj2;
                v vVar7 = this.f143244b;
                d dVar3 = (d) vVar7.L();
                if (dVar3 != null) {
                    h hVar2 = vVar7.f143254j;
                    Intrinsics.h(extensionAuthRequestData3);
                    ((ExtensionAuthActivity) dVar3).setItems(hVar2.d(extensionAuthRequestData3));
                }
                efm.r<Long> rVarTimer = efm.r.timer(extensionAuthRequestData3.getF72185c(), TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(rVarTimer, "timer(...)");
                d0 d0VarFirstOrError = te0.w.l(rVarTimer, vVar7.f143260r).filter(new j(3, new gd8.j(11))).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                ufm.n nVarI = o70.a.i(d0VarFirstOrError);
                m mVar = new m(vVar7, 2);
                Function1 function1K = vVar7.K();
                ufm.i iVar = new ufm.i(nVarI, new a08.s(15, new g0d.m(new BreadcrumbException(), 26)), 2);
                Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                ofm.i iVar2 = new ofm.i(new a08.r(19, mVar), new a08.r(19, function1K), 0);
                iVar.q(iVar2);
                Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
                te0.w.j0(vVar7.f239031a, iVar2);
                return Unit.f186387a;
            case 14:
                k3l.j result = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof k3l.g;
                final v vVar8 = this.f143244b;
                if (z || Intrinsics.f(result.a().getF104385a(), "APPROVE_RESULT_FAILURE") || (Intrinsics.f(result.a().getF104385a(), "REJECTED_STATUS_VIEW") && (result instanceof k3l.i))) {
                    final int i2 = 1;
                    pfm.h hVar3 = new pfm.h(new kfm.a() { // from class: ge6.n
                        @Override // kfm.a
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    v vVar22 = vVar8;
                                    vVar22.f143253h.c(new IntentCommand(((s70.b) vVar22.f143258p).b(), null));
                                    break;
                                case 1:
                                    com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, vVar8.f143253h);
                                    break;
                                case 2:
                                    vVar8.P();
                                    break;
                                default:
                                    ((k3l.d) vVar8.f143255l).O(new StatusViewConfiguration.Warning("REJECTED_STATUS_VIEW", new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_subtitle, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_suspisious, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_dismiss, null, null, 14), null, 992));
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                    return hVar3;
                }
                if (Intrinsics.f(result.a().getF104385a(), "REJECTED_STATUS_VIEW") && (result instanceof k3l.h)) {
                    l lVar3 = vVar8.i;
                    lVar3.getClass();
                    pfm.a aVar4 = new pfm.a(te0.w.o0(p0.f264003c, new b0(lVar3, null, 29)), new j(2, new m(vVar8, 1)), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar4, "flatMapCompletable(...)");
                    return aVar4;
                }
                if (!Intrinsics.f(result.a().getF104385a(), "ACCESS_FINE_LOCATION_PERMISSION_EXPLANATION") || !(result instanceof k3l.h)) {
                    pfm.m mVar2 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                    return mVar2;
                }
                final int i3 = 0;
                pfm.h hVar4 = new pfm.h(new kfm.a() { // from class: ge6.n
                    @Override // kfm.a
                    public final void run() {
                        switch (i3) {
                            case 0:
                                v vVar22 = vVar8;
                                vVar22.f143253h.c(new IntentCommand(((s70.b) vVar22.f143258p).b(), null));
                                break;
                            case 1:
                                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, vVar8.f143253h);
                                break;
                            case 2:
                                vVar8.P();
                                break;
                            default:
                                ((k3l.d) vVar8.f143255l).O(new StatusViewConfiguration.Warning("REJECTED_STATUS_VIEW", new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_subtitle, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_suspisious, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_dismiss, null, null, 14), null, 992));
                                break;
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                return hVar4;
            default:
                ExtensionAuthRequestData it12 = (ExtensionAuthRequestData) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                boolean z3 = it12 instanceof ExtensionAuthRequestData.AppChallenge;
                final v vVar9 = this.f143244b;
                if (z3) {
                    final int i5 = 3;
                    pfm.h hVar5 = new pfm.h(new kfm.a() { // from class: ge6.n
                        @Override // kfm.a
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    v vVar22 = vVar9;
                                    vVar22.f143253h.c(new IntentCommand(((s70.b) vVar22.f143258p).b(), null));
                                    break;
                                case 1:
                                    com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, vVar9.f143253h);
                                    break;
                                case 2:
                                    vVar9.P();
                                    break;
                                default:
                                    ((k3l.d) vVar9.f143255l).O(new StatusViewConfiguration.Warning("REJECTED_STATUS_VIEW", new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_subtitle, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_suspisious, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_dismiss, null, null, 14), null, 992));
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                    return hVar5;
                }
                final int i6 = 1;
                pfm.h hVar6 = new pfm.h(new kfm.a() { // from class: ge6.n
                    @Override // kfm.a
                    public final void run() {
                        switch (i6) {
                            case 0:
                                v vVar22 = vVar9;
                                vVar22.f143253h.c(new IntentCommand(((s70.b) vVar22.f143258p).b(), null));
                                break;
                            case 1:
                                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, vVar9.f143253h);
                                break;
                            case 2:
                                vVar9.P();
                                break;
                            default:
                                ((k3l.d) vVar9.f143255l).O(new StatusViewConfiguration.Warning("REJECTED_STATUS_VIEW", new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_subtitle, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_suspisious, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_dismiss, null, null, 14), null, 992));
                                break;
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar6, "fromAction(...)");
                return hVar6;
        }
    }
}
