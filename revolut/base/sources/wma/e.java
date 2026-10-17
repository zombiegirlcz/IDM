package wma;

import com.revolut.camerakit.core.errors.CameraKitException;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewActivity;
import com.revolut.feature.defi.common.models.domain.DeFiQuoteAmountLimitError;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiMoneyDetails;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesRevPayAbandoned;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesRevPayError;
import com.revolut.feature_exchange.impl.ui.order_details.screen.OrderDetailsActivity;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.a;
import com.revolut.revolut.feature_fourthline_impl.R;
import dx.o;
import h93.f0;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import ly.h;
import nii.y0;
import nii.z;
import nnk.d;
import t27.m;
import th6.a0;
import vkm.j2;
import wp4.j0;
import ww2.i;
import x1g.c0;
import x36.y;
import xfb.n;
import xfb.s;
import yji.l;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v16 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FundingSource fundingSource;
        kyh.g gVar;
        o oVar;
        int i = 2;
        int i2 = 5;
        int i3 = 6;
        boolean z = false;
        z = false;
        z = false;
        boolean z3 = false;
        z = false;
        z = false;
        boolean z4 = false;
        qjf.c cVar = null;
        switch (this.f) {
            case 0:
                Throwable p0 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                f fVar = (f) this.receiver;
                ServerError serverErrorA = fVar.f298628q.a(p0);
                i = serverErrorA != null ? serverErrorA.f51362a : 1;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.email_verification_status_error_title, null, null, 14);
                v60.c cVarB = ((ao0.a) fVar.f298629r).b(Integer.valueOf(i));
                l.a1(fVar, fVar.X1(new y0(null, new z(textLocalisedClause, cVarB != null ? ofm.q.O(cVarB) : null, new TextLocalisedClause(R.string.common_action_close, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, new d(fVar, aboveMaximum, z ? 1 : 0), 3);
                return Boolean.TRUE;
            case 1:
                knm.b.v(((Number) obj2).intValue(), ((CryptoWithdrawToAddressReviewActivity) ((wp5.o) this.receiver)).Z0());
                return Unit.f186387a;
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                i iVar = (i) this.receiver;
                iVar.getClass();
                l.a1(iVar, iVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new ww2.g(iVar, aboveMaximum, i), 3);
                return Boolean.TRUE;
            case 3:
                List p03 = (List) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((BaseLayoutBuilderFragment) ((wx7.c) this.receiver)).setItems(p03);
                return Unit.f186387a;
            case 4:
                String p010 = (String) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                ((cya.f) this.receiver).a2(p010);
                return Unit.f186387a;
            case 5:
                gfd.d p011 = (gfd.d) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b bVar = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b) this.receiver;
                bVar.getClass();
                if (!p011.f143391a.isEmpty()) {
                    bVar.n2(new x18.f(bVar, aboveMaximum, i), new whi.b(i3));
                }
                return Unit.f186387a;
            case 6:
                Throwable p012 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                c0 c0Var = (c0) this.receiver;
                c0Var.getClass();
                if (!(p012 instanceof TravelExperiencesRevPayError)) {
                    if (p012 instanceof TravelExperiencesRevPayAbandoned) {
                    }
                    return Boolean.valueOf(z);
                }
                l.a1(c0Var, c0Var.X1(new y0(null, new z(((TravelExperiencesRevPayError) p012).f93053a, null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, null, 7);
                z = true;
                return Boolean.valueOf(z);
            case 7:
                m p013 = (m) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.a aVar = (com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.a) this.receiver;
                aVar.getClass();
                aVar.n2(new wtj.f(aVar, p013, aboveMaximum, 16), new whi.b(i3));
                return Unit.f186387a;
            case 8:
                List p014 = (List) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                ((OrderDetailsActivity) ((x2i.c) this.receiver)).setItems(p014);
                return Unit.f186387a;
            case 9:
                xu.e p015 = (xu.e) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                ((ar2.c) this.receiver).a(p015);
                return Unit.f186387a;
            case 10:
                g1j.b p016 = (g1j.b) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                y yVar = (y) this.receiver;
                yVar.getClass();
                if (p016 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                j1j.d dVar = p016.f139686a;
                k1j.a aVar2 = dVar.d;
                String strS = dVar.f170617a;
                if (x36.o.f302673b[aVar2.ordinal()] == 1) {
                    strS = cj9.c.s(strS);
                }
                String str = strS;
                DeFiExchangeOrderDraft deFiExchangeOrderDraft = ((x36.a) ((j2) yVar.A.f22677a).getValue()).f302659a;
                Continuation continuation = null;
                if (!Intrinsics.f(str, (deFiExchangeOrderDraft == null || (fundingSource = deFiExchangeOrderDraft.f) == null) ? null : fundingSource.getF92240a())) {
                    yVar.n2(new wih.c(yVar, dVar, str, continuation, 22), new whi.b(i3));
                }
                return Unit.f186387a;
            case 11:
                r66.a p017 = (r66.a) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                y yVar2 = (y) this.receiver;
                yVar2.getClass();
                String str2 = p017.f251645a;
                DeFiExchangeOrderDraft deFiExchangeOrderDraft2 = ((x36.a) ((j2) yVar2.A.f22677a).getValue()).f302659a;
                if (!Intrinsics.f(str2, deFiExchangeOrderDraft2 != null ? deFiExchangeOrderDraft2.e.f71665a.f71671a : null)) {
                    yVar2.n2(new wtj.f(yVar2, p017, aboveMaximum, 21), new whi.b(i3));
                }
                return Unit.f186387a;
            case 12:
                DeFiExchangeOrderDraft draft = (DeFiExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "p0");
                ((b46.c) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(draft, "draft");
                DeFiQuoteAmountLimitError deFiQuoteAmountLimitError = draft.i;
                aboveMaximum = deFiQuoteAmountLimitError instanceof DeFiQuoteAmountLimitError.AboveMaximum ? (DeFiQuoteAmountLimitError.AboveMaximum) deFiQuoteAmountLimitError : 0;
                if (aboveMaximum == 0) {
                    return draft;
                }
                ej0.b bVar2 = aboveMaximum.f71696a;
                if (aboveMaximum.f71697b == null) {
                    return draft;
                }
                BigInteger bigIntegerUnscaledValue = bVar2.f126703a.unscaledValue();
                Intrinsics.checkNotNullExpressionValue(bigIntegerUnscaledValue, "unscaledValue(...)");
                BigInteger bigIntegerB = b46.c.b(bVar2.f126703a.scale(), draft.c(), bigIntegerUnscaledValue);
                int i5 = b46.b.f12184a[draft.f71765c.ordinal()];
                if (i5 == 1) {
                    return b46.c.f(draft, bigIntegerB, true);
                }
                if (i5 == 2) {
                    return b46.c.e(draft, bigIntegerB, true);
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                DeFiExchangeOrderDraft draft2 = (DeFiExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft2, "p0");
                ((b46.c) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(draft2, "draft");
                int i6 = b46.b.f12184a[draft2.f71765c.ordinal()];
                if (i6 == 1) {
                    gVar = kyh.g.BOTTOM;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar = kyh.g.TOP;
                }
                return DeFiExchangeOrderDraft.a(draft2, DeFiMoneyDetails.a(draft2.f71763a, null, null, null, true, 7), DeFiMoneyDetails.a(draft2.f71764b, null, null, null, true, 7), gVar, null, null, null, false, null, 504);
            case 14:
                Data p018 = (Data) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                x6e.g gVar2 = (x6e.g) this.receiver;
                gVar2.getClass();
                return (List) iii.c.f(p018, new x64.a(4), new x48.a(i2), new j0(gVar2, 18));
            case 15:
                List p019 = (List) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                return ((x8h.q) this.receiver).a(p019);
            case 16:
                List p020 = (List) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                return ((x8h.q) this.receiver).a(p020);
            case 17:
                List p021 = (List) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                ((ihm.f) this.receiver).onNext(p021);
                return Unit.f186387a;
            case 18:
                ((Boolean) obj2).booleanValue();
                ((y94.b) this.receiver).getClass();
                return Unit.f186387a;
            case 19:
                List p022 = (List) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                f0 f0VarO = ((x97.e) this.receiver).e.o(b93.d.ALL);
                return f0VarO != null ? d0.F0(f0VarO, p022) : p022;
            case 20:
                ((PinCodeView) this.receiver).setWarningText((Clause) obj2);
                return Unit.f186387a;
            case 21:
                AddressFlowContract$OutputData p023 = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar3 = (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) this.receiver;
                bVar3.getClass();
                bVar3.n2(new xec.c0(bVar3, p023, aboveMaximum, z ? 1 : 0), new whi.b(i3));
                return Unit.f186387a;
            case 22:
                mgb.c p024 = (mgb.c) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                ((s) this.receiver).getClass();
                do3.g gVar3 = p024.f205227a;
                mgb.a aVar3 = p024.f205229c;
                ArrayList arrayList = p024.f205228b;
                boolean z6 = !arrayList.isEmpty() || (aVar3 != null && aVar3.f205224a);
                if (arrayList.isEmpty() && aVar3 != null && aVar3.f205224a) {
                    z4 = true;
                }
                mgb.b bVar4 = p024.d;
                return new xfb.o(gVar3, z6, z4, bVar4 != null ? new n(bVar4.f205226b, bVar4.f205225a) : null);
            case 23:
                tgb.c p025 = (tgb.c) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                ((s) this.receiver).getClass();
                do3.g gVar4 = p025.f271128a;
                tgb.a aVar4 = p025.f271130c;
                ArrayList arrayList2 = p025.f271129b;
                boolean z11 = !arrayList2.isEmpty() || (aVar4 != null && aVar4.f271125a);
                if (arrayList2.isEmpty() && aVar4 != null && aVar4.f271125a) {
                    z3 = true;
                }
                tgb.b bVar5 = p025.d;
                return new xfb.o(gVar4, z11, z3, bVar5 != null ? new n(bVar5.f271127b, bVar5.f271126a) : null);
            case 24:
                String token = (String) obj2;
                Intrinsics.checkNotNullParameter(token, "p0");
                a0 a0Var = (a0) this.receiver;
                a0Var.getClass();
                Intrinsics.checkNotNullParameter(token, "token");
                z9h.n.l(String.class, a0Var.f271262a, "PLAID_TOKEN_KEY", token);
                return Unit.f186387a;
            case 25:
                String p026 = (String) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                return ((f80.b) ((f80.a) this.receiver)).f(p026);
            case 26:
                nnk.d p027 = (nnk.d) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.c cVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.c) this.receiver;
                if (p027 instanceof d.a) {
                    cVar2.C2(a.C0634a.f103169a);
                } else {
                    cVar2.getClass();
                    if (!Intrinsics.f(p027, d.b.f217715a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar2.l2(new xb4.e(cVar2, aboveMaximum, 3), new xe7.a(cVar2, 7));
                }
                return Unit.f186387a;
            case 27:
                jif.g warrantDto = (jif.g) obj2;
                Intrinsics.checkNotNullParameter(warrantDto, "p0");
                ((hif.d) ((hif.c) this.receiver)).getClass();
                Intrinsics.checkNotNullParameter(warrantDto, "warrantDto");
                jif.f banner = warrantDto.getBanner();
                if (banner != null) {
                    String image = banner.getImage();
                    cVar = new qjf.c(image != null ? new UrlImage(image, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, banner.getTitle(), banner.getDescription(), banner.getActionTitle(), banner.getDeepLink());
                }
                return new qjf.b(cVar);
            case 28:
                long jLongValue = ((Number) obj2).longValue();
                ((unj.f) this.receiver).getClass();
                return Long.valueOf(unj.f.a(jLongValue));
            default:
                h p028 = (h) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                com.revolut.feature.alipay.impl.ui.qr.scanner.a aVar5 = (com.revolut.feature.alipay.impl.ui.qr.scanner.a) this.receiver;
                aVar5.getClass();
                boolean z12 = p028 instanceof ly.d;
                xk1.d dVar2 = xk1.d.f306595a;
                if (z12) {
                    CameraKitException cameraKitException = ((ly.d) p028).f200610a;
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, cameraKitException, h0Var);
                    aVar5.C2(dVar2);
                } else {
                    if (!(p028 instanceof ly.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xv.l lVar = ((ly.g) p028).getMetadata().f147024a;
                    dx.q qVar = lVar instanceof dx.q ? (dx.q) lVar : null;
                    String str3 = (qVar == null || (oVar = qVar.f120512b) == null) ? null : oVar.f120508a.f51390a;
                    if (str3 == null) {
                        aVar5.C2(dVar2);
                    } else {
                        aVar5.H2(aVar5.f61077q, new xif.c(9));
                        aVar5.l2(new xec.c0(aVar5, str3, aboveMaximum, 20), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object obj2) {
        super(1, 0, PinCodeView.class, obj2, "setWarningText", "setWarningText(Lcom/revolut/core/ui_kit/models/Clause;)V");
        this.f = 20;
    }
}
