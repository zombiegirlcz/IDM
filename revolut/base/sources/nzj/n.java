package nzj;

import android.os.Parcelable;
import c55.s;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backend_flow.domain.models.BackendFlowWidgetProgression;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.EarningRepresentation;
import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPointsEarningRuleApplied;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$ModalStep;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$OutputData;
import com.revolut.feature.revolutpay.shared.ui.account_picker.AccountPickerContract$OutputData;
import com.revolut.feature.revolutpay.shared.ui.account_picker.AccountPickerItem;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.revolut.feature_fourthline_impl.R;
import eid.t;
import i55.w;
import i55.x;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jec.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import nii.y0;
import q35.v;
import q35.y;
import q35.z;
import q90.u;
import retrofit2.HttpException;
import retrofit2.Response;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [com.revolut.feature.backend_flow.domain.models.c[]] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [com.revolut.feature.backend_flow.domain.models.c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        ?? r142;
        com.revolut.feature.backend_flow.domain.models.b bVar;
        u uVar;
        com.revolut.feature.backend_flow.domain.models.a aVar;
        com.revolut.feature.backend_flow.domain.models.a aVar2;
        com.revolut.feature.backend_flow.domain.models.b bVar2;
        ?? r162;
        int i = 4;
        int i2 = 26;
        BackendFlowWidgetProgression.Step.Action action = null;
        switch (this.f) {
            case 0:
                Throwable p0 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                o oVar = (o) this.receiver;
                k3l.b bVar3 = oVar.f221084j;
                ((tpi.i) oVar.i).Q();
                if (tj0.a.a(p0)) {
                    ((k3l.d) bVar3).O(new StatusViewConfiguration.Error("ID_ERROR_VIEW", new TextLocalisedClause(R$string.offline_widget_title, null, null, 14), new TextLocalisedClause(R$string.offline_widget_description, null, null, 14), new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, 8176));
                } else {
                    ((k3l.d) bVar3).O(new StatusViewConfiguration.Error("ID_ERROR_VIEW", new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, 8180));
                }
                return Unit.f186387a;
            case 1:
                String p03 = (String) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((h8b.f) this.receiver).f2(p03);
            case 2:
                String p010 = (String) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                return ((h8b.f) this.receiver).f2(p010);
            case 3:
                String p011 = (String) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                return ((h8b.f) this.receiver).Y1(p011);
            case 4:
                String p012 = (String) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                return ((h8b.f) this.receiver).Y1(p012);
            case 5:
                String p013 = (String) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                return ((h8b.f) this.receiver).Y1(p013);
            case 6:
                xi0.b fiatCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(fiatCurrency, "p0");
                ((o36.a) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
                return j6.a.q("CEFI_TO_DEFI_ASSETS_", fiatCurrency.f306286a);
            case 7:
                ((hqi.l) this.receiver).F(((Number) obj2).intValue());
                return Unit.f186387a;
            case 8:
                ((hqi.l) this.receiver).h(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 9:
                ((hqi.l) this.receiver).k(((Number) obj2).intValue());
                return Unit.f186387a;
            case 10:
                ((hqi.l) this.receiver).q(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 11:
                x dto = (x) obj2;
                Intrinsics.checkNotNullParameter(dto, "p0");
                s sVar = (s) this.receiver;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(dto, "dto");
                String id10 = dto.getId();
                String loanId = dto.getLoanId();
                y yVar = (y) u1.u(dto.getState(), sVar.e);
                List<w> components = dto.getComponents();
                ArrayList arrayList = new ArrayList(zhm.w.t(components, 10));
                for (w wVar : components) {
                    if (wVar.getReceiptAvailable()) {
                        String str2 = sVar.f21456a.getBaseUrl() + "/refinancing-management/v1/refinancing-components/" + wVar.getId() + "/receipt";
                        zi0.c.l(str2);
                        str = str2;
                    } else {
                        str = null;
                    }
                    String id11 = wVar.getId();
                    dj0.d dVarO = mo3.a.o(wVar.getAmount());
                    q35.u uVar2 = (q35.u) u1.u(wVar.getRefinancingMode(), sVar.f21458c);
                    String representation = wVar.getRepresentation();
                    q35.w wVar2 = representation != null ? (q35.w) u1.u(representation, sVar.f21457b) : q35.w.PersonalLoan;
                    v vVar = (v) u1.u(wVar.getState(), sVar.d);
                    String bankName = wVar.getBankName();
                    String fallbackDateTime = wVar.getFallbackDateTime();
                    arrayList.add(new q35.x(id11, dVarO, uVar2, wVar2, vVar, bankName, str, fallbackDateTime != null ? ZonedDateTime.parse(fallbackDateTime) : null, wVar.getFallbackTransactionId()));
                }
                return new z(id10, yVar, loanId, arrayList);
            case 12:
                Throwable p014 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                ((com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.b) this.receiver).I2(p014);
                return Boolean.TRUE;
            case 13:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((ESignatureDetails) obj2);
            case 14:
                r9a.g p015 = (r9a.g) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar3 = (com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) this.receiver;
                aVar3.H2(aVar3.f80599t, new o3k.a(p015, 22));
                return Unit.f186387a;
            case 15:
                gpf.a p016 = (gpf.a) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar4 = (com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) this.receiver;
                aVar4.H2(aVar4.f80599t, new as1.q(p016, 3));
                return Unit.f186387a;
            case 16:
                eec.g p017 = (eec.g) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver;
                if (p017 instanceof eec.f) {
                    fVar.H2(fVar.M, new o3k.a(p017, i2));
                    fVar.O2();
                } else {
                    if (!(p017 instanceof eec.e)) {
                        fVar.getClass();
                        throw new NoWhenBranchMatchedException();
                    }
                    rdc.d dVar = fVar.f84575t.f141530a;
                    yji.l.a1(fVar, fVar.X1(new y0("PAYMENT_CANCELLED_DIALOG_ID", new nii.z(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_accept_payment_cancelled_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_accept_payment_cancelled_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, null, new com.revolut.feature.revolutpay.impl.ui.summary_screen.c(fVar, null), 3);
                }
                return Unit.f186387a;
            case 17:
                eii.k p018 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar2 = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver;
                fVar2.getClass();
                if (p018 instanceof eii.e) {
                    Object obj3 = ((eii.e) p018).f126651a.d;
                    if (obj3 instanceof RevPointsEarningRuleApplied) {
                        RevPointsEarningRuleApplied revPointsEarningRuleApplied = (RevPointsEarningRuleApplied) obj3;
                        com.revolut.kompot.navigable.vc.modal.a aVar5 = fVar2.P;
                        boolean z = revPointsEarningRuleApplied instanceof EarningRepresentation.CardRule;
                        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                        if (z) {
                            oki.h.v2(aVar5, new RevolutPaySummaryScreenContract$ModalStep.NonBoostedRevPointsInfo((EarningRepresentation.CardRule) revPointsEarningRuleApplied), bottom_dialog);
                        } else if (revPointsEarningRuleApplied instanceof EarningRepresentation.BoostedRule) {
                            oki.h.v2(aVar5, new RevolutPaySummaryScreenContract$ModalStep.BoostedRevPointsInfo((EarningRepresentation.BoostedRule) revPointsEarningRuleApplied), bottom_dialog);
                        } else if (!(revPointsEarningRuleApplied instanceof EarningRepresentation.BusinessRule)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return Unit.f186387a;
            case 18:
                AccountPickerContract$OutputData p019 = (AccountPickerContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar3 = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver;
                fVar3.getClass();
                if (!(p019 instanceof AccountPickerContract$OutputData.ItemSelected)) {
                    throw new NoWhenBranchMatchedException();
                }
                AccountPickerItem accountPickerItem = ((AccountPickerContract$OutputData.ItemSelected) p019).f84700a;
                String str3 = accountPickerItem.f84701a;
                if (Intrinsics.f(str3, "USER_PROFILE_ID")) {
                    int i3 = jli.h.f175850a;
                } else if (Intrinsics.f(str3, "REDIRECT_TO_BUSINESS_ID")) {
                    Parcelable parcelable = accountPickerItem.f;
                    ParcelableDestination parcelableDestination = parcelable instanceof ParcelableDestination ? (ParcelableDestination) parcelable : null;
                    if (parcelableDestination != null) {
                        fVar3.C2(new RevolutPaySummaryScreenContract$OutputData.RedirectToBusiness(parcelableDestination));
                    }
                }
                return Unit.f186387a;
            case 19:
                jec.d p020 = (jec.d) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar4 = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver;
                if (p020 instanceof jec.f) {
                    fVar4.S2(null);
                } else {
                    fVar4.getClass();
                    if (p020 instanceof d.a) {
                        fVar4.C2(new RevolutPaySummaryScreenContract$OutputData.PaymentFailure(((d.a) p020).f173259a));
                    } else {
                        if (!(p020 instanceof jec.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fVar4.K2(((jec.e) p020).f173260a);
                    }
                }
                return Unit.f186387a;
            case 20:
                l6c.b p021 = (l6c.b) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                ((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.receiver).K2(p021);
                return Unit.f186387a;
            case 21:
                lah.c p022 = (lah.c) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar6 = (com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a) this.receiver;
                aVar6.getClass();
                aVar6.l2(new oah.h(p022, aVar6, null), new yi5.b(i2));
                return Unit.f186387a;
            case 22:
                lah.c p023 = (lah.c) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar7 = (com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a) this.receiver;
                aVar7.getClass();
                aVar7.l2(new oah.j(p023, aVar7, null), new yi5.b(i2));
                return Unit.f186387a;
            case 23:
                List p024 = (List) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                obc.m mVar = (obc.m) this.receiver;
                return vkm.q.H(new o4a.b(mVar, p024, null, i), mVar.f223926r.B(new o95.b(28)));
            case 24:
                u item = (u) obj2;
                Intrinsics.checkNotNullParameter(item, "p0");
                ((gc0.h) ((gc0.g) this.receiver)).getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                String headerTitle = item.getHeaderTitle();
                List<u.a> steps = item.getSteps();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(steps, 10));
                for (u.a aVar8 : steps) {
                    u.a.C1335a action2 = aVar8.getAction();
                    BackendFlowWidgetProgression.Step.Action action3 = aVar8.getActionTitle() != null ? action2 != null ? new BackendFlowWidgetProgression.Step.Action(action2.getDeeplink()) : action : action;
                    String title = aVar8.getTitle();
                    String description = aVar8.getDescription();
                    Long date = aVar8.getDate();
                    String lineStyle = aVar8.getLineStyle();
                    if (lineStyle != null) {
                        ?? Values = com.revolut.feature.backend_flow.domain.models.c.values();
                        int length = Values.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                r162 = Values[i5];
                                if (!a0.z(r162.name(), lineStyle, true)) {
                                    i5++;
                                }
                            } else {
                                r162 = action;
                            }
                        }
                        r142 = r162;
                    } else {
                        r142 = action;
                    }
                    String stepColor = aVar8.getStepColor();
                    if (stepColor != null) {
                        com.revolut.feature.backend_flow.domain.models.b[] bVarArrValues = com.revolut.feature.backend_flow.domain.models.b.values();
                        int length2 = bVarArrValues.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 < length2) {
                                bVar2 = bVarArrValues[i6];
                                if (!a0.z(bVar2.name(), stepColor, true)) {
                                    i6++;
                                }
                            } else {
                                bVar2 = null;
                            }
                        }
                        bVar = bVar2;
                    } else {
                        bVar = null;
                    }
                    String actionTitle = action3 != null ? aVar8.getActionTitle() : null;
                    String actionStyle = aVar8.getActionStyle();
                    if (actionStyle != null) {
                        com.revolut.feature.backend_flow.domain.models.a[] aVarArrValues = com.revolut.feature.backend_flow.domain.models.a.values();
                        int length3 = aVarArrValues.length;
                        int i21 = 0;
                        while (true) {
                            if (i21 < length3) {
                                aVar2 = aVarArrValues[i21];
                                uVar = item;
                                if (!a0.z(aVar2.name(), actionStyle, true)) {
                                    i21++;
                                    item = uVar;
                                }
                            } else {
                                uVar = item;
                                aVar2 = null;
                            }
                        }
                        aVar = aVar2;
                    } else {
                        uVar = item;
                        aVar = null;
                    }
                    arrayList2.add(new BackendFlowWidgetProgression.Step(title, description, date, r142, bVar, actionTitle, action3, aVar));
                    item = uVar;
                    action = null;
                }
                return new BackendFlowWidgetProgression(item.getCurrentStepIndex(), headerTitle, arrayList2);
            case 25:
                Throwable p025 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                com.revolut.feature.onboarding.impl.qes_terms.h hVar = (com.revolut.feature.onboarding.impl.qes_terms.h) this.receiver;
                hVar.getClass();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p025, h0Var);
                hVar.R2();
                return Boolean.TRUE;
            case 26:
                Response p026 = (Response) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                ((oid.a0) this.receiver).getClass();
                if (p026.code() == 204) {
                    return new t();
                }
                if (!p026.isSuccessful()) {
                    throw new HttpException(p026);
                }
                Object objBody = p026.body();
                if (objBody != null) {
                    return (t) objBody;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 27:
                List p027 = (List) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                ((ihm.f) this.receiver).onNext(p027);
                return Unit.f186387a;
            case 28:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((gl4.c) obj2);
            default:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((ql4.a) obj2);
        }
    }
}
