package j5a;

import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.TabPaymentsFlowContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.a;
import com.revolut.kompot.common.ExternalDestination;
import d67.p;
import d67.q;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.a f171614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yki.b f171615c;

    public /* synthetic */ c(com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.a aVar, yki.b bVar, int i) {
        this.f171613a = i;
        this.f171614b = aVar;
        this.f171615c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f171613a;
        yki.b bVar = this.f171615c;
        com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.a aVar = this.f171614b;
        switch (i) {
            case 0:
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.a it8 = (com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                pn3.a aVar2 = aVar.f80185p;
                d.D(Boolean.TYPE, aVar.f80188s, "TAB_PAYMENTS_INITIAL_SCREEN_DISPLAYED", Boolean.TRUE);
                if (Intrinsics.f(it8, a.b.f80193a)) {
                    pn3.b bVar2 = (pn3.b) aVar2;
                    if (bVar2.a()) {
                        aVar.I2(bVar);
                    } else {
                        bVar2.d(aVar, new c(aVar, bVar, 2), new dld.c(aVar, bVar, 4));
                    }
                } else {
                    if (!Intrinsics.f(it8, a.C0522a.f80192a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.I2(bVar);
                }
                return Unit.f186387a;
            case 1:
                u it9 = (u) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                s70.a aVar3 = aVar.f80186q;
                TabPaymentsFlowContract$InputData tabPaymentsFlowContract$InputData = aVar.o;
                boolean z = tabPaymentsFlowContract$InputData instanceof TabPaymentsFlowContract$InputData.ChatInputData;
                r rVar = r.f111463a;
                t tVar = t.f111465a;
                s sVar = s.f111464a;
                q qVar = q.f111462a;
                if (z) {
                    if (!Intrinsics.f(it9, qVar)) {
                        if (Intrinsics.f(it9, sVar)) {
                            aVar.C1(new ExternalDestination.ByIntent(((s70.b) aVar3).b(), null));
                            aVar.I2(bVar);
                        } else if (Intrinsics.f(it9, tVar)) {
                            aVar.I2(bVar);
                        } else {
                            if (!Intrinsics.f(it9, rVar) && !(it9 instanceof p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            IllegalStateException illegalStateException = new IllegalStateException("Invalid output " + it9 + " for PromptMarketingScreen");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        }
                    }
                } else {
                    if (!Intrinsics.f(tabPaymentsFlowContract$InputData, TabPaymentsFlowContract$InputData.FindFriendsInputData.f80181a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (Intrinsics.f(it9, tVar) || Intrinsics.f(it9, qVar)) {
                        h.D2(bVar);
                    } else if (Intrinsics.f(it9, sVar)) {
                        aVar.C1(new ExternalDestination.ByIntent(((s70.b) aVar3).b(), null));
                        h.D2(bVar);
                    } else {
                        if (!Intrinsics.f(it9, rVar) && !(it9 instanceof p)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        IllegalStateException illegalStateException2 = new IllegalStateException("Invalid output " + it9 + " for PromptMarketingScreen");
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                    }
                }
                return Unit.f186387a;
            default:
                ((Boolean) obj2).booleanValue();
                aVar.I2(bVar);
                return Unit.f186387a;
        }
    }
}
