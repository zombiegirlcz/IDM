package u7d;

import b8d.n;
import b8d.o;
import b8d.p;
import b8d.q;
import b8d.r;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.impl.faq.FaqFlowContract$Step;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.a;
import com.revolut.feature.shared.help_centre.impl.faq.screens.list.a;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import f9d.l;
import k8d.h;
import k8d.i;
import k8d.j;
import k8d.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m8d.s;
import m8d.t;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.c f277738b;

    public /* synthetic */ c(com.revolut.feature.shared.help_centre.impl.faq.c cVar, int i) {
        this.f277737a = i;
        this.f277738b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f277737a) {
            case 0:
                com.revolut.feature.shared.help_centre.impl.faq.screens.list.a output = (com.revolut.feature.shared.help_centre.impl.faq.screens.list.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof j;
                com.revolut.feature.shared.help_centre.impl.faq.c cVar = this.f277738b;
                if (z) {
                    cVar.E2(new FaqFlowContract$Step.FaqList.ByNode(((j) output).f182116a, true), true, null, false);
                } else if (output instanceof i) {
                    cVar.E2(new FaqFlowContract$Step.FaqArticle.ByNode(((i) output).f182115a), true, null, false);
                } else if (output instanceof k) {
                    cVar.E2(new FaqFlowContract$Step.SomethingElse(((k) output).f182117a), true, null, false);
                } else if (output instanceof a.b) {
                    cVar.E2(new FaqFlowContract$Step.TopLevelFaq(null), false, null, false);
                } else if (output instanceof a.C0541a) {
                    cVar.I2();
                } else {
                    if (!(output instanceof h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h hVar = (h) output;
                    cVar.R2(hVar.f182112a, hVar.f182114c);
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.shared.help_centre.impl.faq.c cVar2 = this.f277738b;
                be7.h hVar2 = cVar2.B;
                be7.k kVar = cVar2.z;
                y80.a aVar = cVar2.A;
                com.revolut.feature.shared.help_centre.impl.faq.screens.article.a output2 = (com.revolut.feature.shared.help_centre.impl.faq.screens.article.a) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof p) {
                    p pVar = (p) output2;
                    cVar2.R2(pVar.f13183a, pVar.f13185c);
                } else if (output2 instanceof q) {
                    q qVar = (q) output2;
                    cVar2.n2(new g(cVar2, qVar.f13187b.f51418c, qVar.f13186a, null), new whi.b(6));
                } else if (output2 instanceof r) {
                    r rVar = (r) output2;
                    cVar2.E2(new FaqFlowContract$Step.FormChooser(rVar.f13189a, rVar.f13190b, rVar.f13191c), true, null, false);
                } else if (output2 instanceof n) {
                    FaqFlowContract$Step.InboundCall.CreateNewTicket createNewTicket = new FaqFlowContract$Step.InboundCall.CreateNewTicket(((n) output2).f13180a);
                    if (!aVar.c("android.permission.RECORD_AUDIO")) {
                        cVar2.E2(createNewTicket, true, null, false);
                    } else if (((com.revolut.feature.in_app_calls.b) kVar).b()) {
                        ((com.revolut.feature.in_app_calls.a) hVar2).c();
                    } else {
                        cVar2.l2(new com.revolut.feature.shared.help_centre.impl.faq.b(cVar2, createNewTicket, null), new yi5.b(26));
                    }
                } else if (output2 instanceof o) {
                    o oVar = (o) output2;
                    FaqFlowContract$Step.InboundCall.UseExistingTicket useExistingTicket = new FaqFlowContract$Step.InboundCall.UseExistingTicket(oVar.f13181a, oVar.f13182b);
                    if (!aVar.c("android.permission.RECORD_AUDIO")) {
                        cVar2.E2(useExistingTicket, true, null, false);
                    } else if (((com.revolut.feature.in_app_calls.b) kVar).b()) {
                        ((com.revolut.feature.in_app_calls.a) hVar2).c();
                    } else {
                        cVar2.l2(new com.revolut.feature.shared.help_centre.impl.faq.b(cVar2, useExistingTicket, null), new yi5.b(26));
                    }
                } else if (output2 instanceof a.b) {
                    cVar2.E2(new FaqFlowContract$Step.TopLevelFaq(null), false, null, false);
                } else {
                    if (!(output2 instanceof a.C0540a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar2.I2();
                }
                return Unit.f186387a;
            case 2:
                j8d.e output3 = (j8d.e) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (!(output3 instanceof j8d.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                j8d.d dVar = (j8d.d) output3;
                String str = dVar.f172169a;
                String str2 = dVar.f172170b.f51418c;
                com.revolut.feature.shared.help_centre.impl.faq.c cVar3 = this.f277738b;
                cVar3.n2(new g(cVar3, str2, str, null), new whi.b(6));
                return Unit.f186387a;
            case 3:
                i9d.i result = (i9d.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z3 = result instanceof i9d.g;
                com.revolut.feature.shared.help_centre.impl.faq.c cVar4 = this.f277738b;
                if (z3) {
                    i9d.g gVar = (i9d.g) result;
                    cVar4.E2(new FaqFlowContract$Step.UpcomingTransactionTroubleshooter(gVar.f159635a, gVar.f159636b), true, null, false);
                } else if (result instanceof i9d.h) {
                    cVar4.E2(new FaqFlowContract$Step.SomethingElse(((i9d.h) result).f159637a), true, null, false);
                } else {
                    if (!Intrinsics.f(result, i9d.f.f159634a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar4.I2();
                }
                return Unit.f186387a;
            case 4:
                b9d.h result2 = (b9d.h) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z4 = result2 instanceof b9d.g;
                com.revolut.feature.shared.help_centre.impl.faq.c cVar5 = this.f277738b;
                if (z4) {
                    SharedFaqDestination.StartPoint.SomethingElse somethingElse = new SharedFaqDestination.StartPoint.SomethingElse(((b9d.g) result2).f13719a);
                    SharedFaqDestination.PassthroughData passthroughData = cVar5.v.f86109b;
                    cVar5.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) somethingElse, new SharedFaqDestination.PassthroughData(passthroughData.f86110a, true, passthroughData.f86112c), false, 12));
                } else {
                    if (!(result2 instanceof b9d.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar5.I2();
                }
                return Unit.f186387a;
            case 5:
                com.revolut.feature.shared.help_centre.impl.faq.c cVar6 = this.f277738b;
                be7.h hVar3 = cVar6.B;
                be7.k kVar2 = cVar6.z;
                y80.a aVar2 = cVar6.A;
                t output4 = (t) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                if (output4 instanceof m8d.r) {
                    n7d.a aVar3 = ((m8d.r) output4).f203521a;
                    cVar6.R2(aVar3.f213067a, aVar3.f213068b);
                } else if (output4 instanceof s) {
                    s sVar = (s) output4;
                    cVar6.n2(new g(cVar6, sVar.f203523b, sVar.f203522a, null), new whi.b(6));
                } else if (output4 instanceof m8d.p) {
                    FaqFlowContract$Step.InboundCall.CreateNewTicket createNewTicket2 = new FaqFlowContract$Step.InboundCall.CreateNewTicket(((m8d.p) output4).f203518a);
                    if (!aVar2.c("android.permission.RECORD_AUDIO")) {
                        cVar6.E2(createNewTicket2, true, null, false);
                    } else if (((com.revolut.feature.in_app_calls.b) kVar2).b()) {
                        ((com.revolut.feature.in_app_calls.a) hVar3).c();
                    } else {
                        cVar6.l2(new com.revolut.feature.shared.help_centre.impl.faq.b(cVar6, createNewTicket2, null), new yi5.b(26));
                    }
                } else if (output4 instanceof m8d.q) {
                    m8d.q qVar2 = (m8d.q) output4;
                    FaqFlowContract$Step.InboundCall.UseExistingTicket useExistingTicket2 = new FaqFlowContract$Step.InboundCall.UseExistingTicket(qVar2.f203519a, qVar2.f203520b);
                    if (!aVar2.c("android.permission.RECORD_AUDIO")) {
                        cVar6.E2(useExistingTicket2, true, null, false);
                    } else if (((com.revolut.feature.in_app_calls.b) kVar2).b()) {
                        ((com.revolut.feature.in_app_calls.a) hVar3).c();
                    } else {
                        cVar6.l2(new com.revolut.feature.shared.help_centre.impl.faq.b(cVar6, useExistingTicket2, null), new yi5.b(26));
                    }
                } else {
                    if (!Intrinsics.f(output4, m8d.o.f203517a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar6.I2();
                }
                return Unit.f186387a;
            case 6:
                com.revolut.feature.shared.help_centre.impl.faq.c cVar7 = this.f277738b;
                mde.e eVar = cVar7.u;
                l result3 = (l) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof f9d.i) {
                    f9d.i iVar = (f9d.i) result3;
                    cVar7.E2(new FaqFlowContract$Step.TransactionTroubleshooterActions(iVar.f132927a, iVar.f132928b, iVar.f132929c, iVar.d), true, null, false);
                } else if (result3 instanceof f9d.k) {
                    cVar7.C1(eVar.c());
                } else if (result3 instanceof f9d.j) {
                    cVar7.E2(new FaqFlowContract$Step.SomethingElse(((f9d.j) result3).f132930a), true, null, false);
                } else {
                    if (!Intrinsics.f(result3, f9d.h.f132926a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.getClass();
                    cVar7.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP))));
                }
                return Unit.f186387a;
            case 7:
                u8d.d output5 = (u8d.d) obj2;
                Intrinsics.checkNotNullParameter(output5, "output");
                boolean z6 = output5 instanceof u8d.c;
                com.revolut.feature.shared.help_centre.impl.faq.c cVar8 = this.f277738b;
                if (z6) {
                    u8d.c cVar9 = (u8d.c) output5;
                    cVar8.R2(cVar9.f278168a, cVar9.f278170c);
                } else {
                    if (!(output5 instanceof u8d.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar8.I2();
                }
                return Unit.f186387a;
            default:
                v8d.i output6 = (v8d.i) obj2;
                Intrinsics.checkNotNullParameter(output6, "output");
                boolean z11 = output6 instanceof v8d.f;
                com.revolut.feature.shared.help_centre.impl.faq.c cVar10 = this.f277738b;
                if (z11) {
                    cVar10.E2(new FaqFlowContract$Step.CardsTroubleshooter(((v8d.f) output6).f286736a), true, null, false);
                } else if (output6 instanceof v8d.g) {
                    cVar10.E2(new FaqFlowContract$Step.FaqArticle.ByNode(((v8d.g) output6).f286737a), true, null, false);
                } else {
                    if (!(output6 instanceof v8d.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar10.E2(new FaqFlowContract$Step.FaqList.ByNode(((v8d.h) output6).f286738a, true), true, null, false);
                }
                return Unit.f186387a;
        }
    }
}
