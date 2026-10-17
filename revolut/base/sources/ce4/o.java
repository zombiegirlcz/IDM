package ce4;

import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$OfferUpdateContext;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rv3.b;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23377a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yki.l f23378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d f23379c;
    public final /* synthetic */ MortgageOfferFlowContract$Step d;

    public /* synthetic */ o(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar, MortgageOfferFlowContract$Step mortgageOfferFlowContract$Step, yki.l lVar) {
        this.f23379c = dVar;
        this.d = mortgageOfferFlowContract$Step;
        this.f23378b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        String str2;
        switch (this.f23377a) {
            case 0:
                com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar = this.f23379c;
                yki.a aVar = dVar.f68000s;
                pf4.n outputData = (pf4.n) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if ((outputData instanceof pf4.i) || (outputData instanceof pf4.l)) {
                    String strB = outputData.b();
                    if (strB == null) {
                        str = "ScreenId is null in MortgageOffer plugin";
                        r6.b.D(str);
                    } else {
                        dVar.l2(new c34.d(dVar, MortgageOfferFlowContract$OfferUpdateContext.CommittedOffer.f67972a, strB, (Continuation) null, 16), new yi5.b(26));
                    }
                } else if (outputData instanceof pf4.h) {
                    dVar.l2(new x(dVar, null, 1), new yi5.b(26));
                } else if (!(outputData instanceof pf4.g)) {
                    boolean z = outputData instanceof pf4.m;
                    ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM fullscreen_slide_from_bottom = ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a;
                    if (z) {
                        oki.h.w2(aVar, new MortgageOfferFlowContract$Step.Document(((pf4.m) outputData).f235449a), fullscreen_slide_from_bottom);
                    } else if (outputData instanceof pf4.k) {
                        pf4.k kVar = (pf4.k) outputData;
                        oki.h.w2(aVar, new MortgageOfferFlowContract$Step.Document(qk.d.w(kVar.f235446b, kVar.f235445a)), fullscreen_slide_from_bottom);
                    } else {
                        if (outputData instanceof pf4.f) {
                            str = "BackendAction outputData is not supported by MortgageOffer plugin";
                        } else {
                            if (!(outputData instanceof pf4.j)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "CustomActionWithAmount outputData is not supported by MortgageOffer plugin";
                        }
                        r6.b.D(str);
                    }
                } else if (((MortgageOfferFlowContract$Step.OfferContent) this.d).f67981a == null) {
                    c84.t.J2(dVar, false, null, null, 7);
                } else {
                    this.f23378b.e(false);
                }
                return Unit.f186387a;
            default:
                rv3.b output = (rv3.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof b.C1428b)) {
                    boolean z3 = output instanceof b.a;
                    yki.l lVar = this.f23378b;
                    if (z3) {
                        lVar.e(false);
                    } else {
                        if (!(output instanceof rv3.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i = r.f23383a[((rv3.c) output).f257692a.ordinal()];
                        if (i == 1) {
                            str2 = "ITEM_BUTTON is not supported by MortgageOffer plugin";
                        } else if (i == 2) {
                            str2 = "SECONDARY_BUTTON is not supported by MortgageOffer plugin";
                        } else {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.t2(this.f23379c, lVar, new MortgageOfferFlowContract$Step.Calculator(((MortgageOfferFlowContract$Step.Prompt) this.d).f67984a, wy3.c.PUSH, true), false, null, false, 12);
                        }
                    }
                    return Unit.f186387a;
                }
                str2 = "Link outputData is not supported by MortgageOffer plugin";
                r6.b.D(str2);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ o(yki.l lVar, com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar, MortgageOfferFlowContract$Step mortgageOfferFlowContract$Step) {
        this.f23378b = lVar;
        this.f23379c = dVar;
        this.d = mortgageOfferFlowContract$Step;
    }
}
