package mf4;

import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreen;
import dx4.u1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rv3.b;
import yhm.m;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g f204842b;

    public /* synthetic */ b0(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar, int i) {
        this.f204841a = i;
        this.f204842b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        int i = this.f204841a;
        com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar = this.f204842b;
        switch (i) {
            case 0:
                pf4.n outputData = (pf4.n) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if ((outputData instanceof pf4.i) || (outputData instanceof pf4.l)) {
                    gVar.n2(new m2f.b0(gVar, outputData, null, 20), new whi.b(6));
                } else if (outputData instanceof pf4.g) {
                    c84.t.J2(gVar, false, null, null, 7);
                } else if (outputData instanceof pf4.h) {
                    gVar.l2(new f0(gVar, null, 0), new yi5.b(26));
                } else if (outputData instanceof pf4.m) {
                    u1 u1Var = ((pf4.m) outputData).f235449a;
                    String str = u1Var.f120785c;
                    Intrinsics.checkNotNullParameter(u1Var, "<this>");
                    su3.a aVar = new su3.a(u1Var.f120783a, u1Var.f120784b, (String) null, u1Var.f120785c, 28);
                    Intrinsics.checkNotNullParameter(u1Var, "<this>");
                    gVar.R2(new c0(str, aVar, new DocumentViewerScreenConfig(true, false, ju3.b.INVISIBLE, null, null, null, 56)));
                } else if (outputData instanceof pf4.k) {
                    cv3.b0 b0Var = ((a0) gVar.f68151q).f;
                    cv3.d0 d0Var = b0Var != null ? b0Var.f109237a : null;
                    pf4.k kVar = (pf4.k) outputData;
                    String documentId = kVar.f235445a;
                    su3.a document = kVar.f235446b;
                    DocumentViewerScreenConfig screenConfig = kVar.f235447c;
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    Intrinsics.checkNotNullParameter(document, "document");
                    Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                    Long l2 = d0Var != null ? d0Var.f109249a : null;
                    Long l3 = d0Var != null ? d0Var.f109250b : null;
                    Intrinsics.checkNotNullParameter(document, "<this>");
                    su3.a document2 = su3.a.a(document, do3.q.d(document.f265635a, l2, l3), do3.q.d(document.f265636b, l2, l3), 60);
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    Intrinsics.checkNotNullParameter(document2, "document");
                    Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                    gVar.R2(new c0(documentId, document2, screenConfig));
                } else if (!(outputData instanceof pf4.f) && !(outputData instanceof pf4.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 1:
                wf4.f outputData2 = (wf4.f) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                boolean z = outputData2 instanceof wf4.e;
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar2 = this.f204842b;
                if (z) {
                    wf4.e eVar = (wf4.e) outputData2;
                    int i2 = d0.f204848a[eVar.f296966a.ordinal()];
                    if (i2 == 1) {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "OfferV2FlowModel", "BNPL isn't supported in the offer type selection screen", null, h0Var);
                    } else if (i2 == 2) {
                        oki.h.t2(gVar2, gVar2.v, new OfferV2FlowContract$Step.Calculator(null, 7), true, null, false, 12);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.t2(gVar2, gVar2.v, new OfferV2FlowContract$Step.CreditToRefinance(eVar.f296967b), true, null, false, 12);
                    }
                } else {
                    if (!(outputData2 instanceof wf4.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c84.t.J2(gVar2, false, null, null, 7);
                }
                return Unit.f186387a;
            case 2:
                rv3.b outputData3 = (rv3.b) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (outputData3 instanceof rv3.c) {
                    ht3.a aVar2 = ((rv3.c) outputData3).f257693b;
                    Intrinsics.i(aVar2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.api.models.offer_v2.CreditPromptOfferIntroAction");
                    gVar.Q2((cv3.i) aVar2, true);
                } else if (outputData3 instanceof b.a) {
                    c84.t.J2(gVar, false, null, null, 7);
                } else {
                    if (!(outputData3 instanceof b.C1428b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "OfferV2FlowModel", "Unsupported intro link output for OfferV2FlowModel", null, h0Var2);
                }
                return Unit.f186387a;
            case 3:
                mh4.o outputData4 = (mh4.o) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                if (outputData4 instanceof mh4.l) {
                    gVar.n2(new f0(gVar, null, 1), new whi.b(6));
                } else if (outputData4 instanceof mh4.n) {
                    gVar.n2(new f0(gVar, null, 2), new whi.b(6));
                } else {
                    if (!(outputData4 instanceof mh4.m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OfferV2FlowContract$InputData offerV2FlowContract$InputData = gVar.f68150p;
                    yki.a aVar3 = gVar.v;
                    OfferV2FlowContract$InputData.Config config = offerV2FlowContract$InputData.f68089a;
                    if (config instanceof OfferV2FlowContract$InputData.Config.Intro) {
                        int i3 = d0.e[((OfferV2FlowContract$InputData.Config.Intro) config).f68092a.ordinal()];
                        if (i3 == 1) {
                            try {
                                m.Companion companion = yhm.m.INSTANCE;
                                throw new IllegalStateException("There is no credit selection screen for calculator config");
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable th10) {
                                m.Companion companion2 = yhm.m.INSTANCE;
                                Throwable thA = yhm.m.a(yhm.o.a(th10));
                                if (thA != null) {
                                    hx7.e.n(thA);
                                }
                            }
                        } else if (i3 == 2) {
                            c84.t.J2(gVar, false, null, null, 7);
                            Unit unit = Unit.f186387a;
                        } else {
                            if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!aVar3.e(false)) {
                                Intrinsics.checkNotNullParameter(aVar3, "<this>");
                                aVar3.n();
                            }
                            Unit unit2 = Unit.f186387a;
                        }
                    } else {
                        if (!(config instanceof OfferV2FlowContract$InputData.Config.Insurance) && !(config instanceof OfferV2FlowContract$InputData.Config.Summary)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar3.e(false);
                    }
                }
                return Unit.f186387a;
            case 4:
                aii.q it8 = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                gVar.l2(new f0(gVar, null, 3), new yi5.b(26));
                return Unit.f186387a;
            default:
                oc4.f outputData5 = (oc4.f) obj2;
                Intrinsics.checkNotNullParameter(outputData5, "outputData");
                if (!(outputData5 instanceof oc4.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar.n2(new m2f.b0(gVar, outputData5, null, 21), new whi.b(6));
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b0(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar, CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen) {
        this.f204841a = 3;
        this.f204842b = gVar;
    }
}
