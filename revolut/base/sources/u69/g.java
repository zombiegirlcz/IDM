package u69;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlowContract$Step;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import ggc.l;
import ggc.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import mii.k;
import phc.j;
import u87.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f277516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f277517c;

    public /* synthetic */ g(eel.c cVar, q qVar, TradingLegalEntityInformation tradingLegalEntityInformation) {
        this.f277515a = 10;
        this.f277516b = cVar;
        this.f277517c = tradingLegalEntityInformation;
    }

    private final Object a(Object obj2) {
        ugc.g gVar = (ugc.g) this.f277516b;
        fgc.c args = (fgc.c) this.f277517c;
        Unit it8 = (Unit) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        j jVar = (j) gVar.f280008b;
        Intrinsics.checkNotNullParameter(args, "args");
        return jVar.f236275g.f(args, false);
    }

    private final Object b(Object obj2) {
        ugc.g gVar = (ugc.g) this.f277516b;
        String rewardId = (String) this.f277517c;
        l reward = (l) obj2;
        Intrinsics.checkNotNullParameter(reward, "reward");
        gVar.getClass();
        boolean z = v.a(reward) && v.b(reward);
        if (z) {
            j jVar = (j) gVar.f280008b;
            Intrinsics.checkNotNullParameter(rewardId, "rewardId");
            return jVar.f236279m.f(rewardId, false);
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return zi0.c.j(Boolean.FALSE);
    }

    private final Object c(Object obj2) {
        com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.b bVar = (com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.b) this.f277516b;
        yki.l lVar = (yki.l) this.f277517c;
        rnj.d result = (rnj.d) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result == null) {
            throw new NoWhenBranchMatchedException();
        }
        oki.h.t2(bVar, lVar, new EsimConnectivityTroubleshootingFlowContract$Step.Instructions(result.f255705a, result.f255706b), false, null, false, 14);
        return Unit.f186387a;
    }

    private final Object d(Object obj2) {
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f277516b;
        com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar = (com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b) this.f277517c;
        qhb.b outputData = (qhb.b) obj2;
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        ref$BooleanRef.f186407a = true;
        if (!Intrinsics.f(outputData, qhb.b.f246593a)) {
            throw new NoWhenBranchMatchedException();
        }
        bVar.v.getClass();
        yji.l.a1(bVar, bVar.X1(new k("DIALOG_ID_EMAIL_SENT", new TextLocalisedClause(R$string.salary_switch_assistant_review_email_email_sent_toast, null, null, 14), null, null, null, 28)), null, null, new uea.e(bVar, null, 2), 3);
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x08fa  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r80) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u69.g.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ g(Object obj2, Object obj3, int i) {
        this.f277515a = i;
        this.f277516b = obj2;
        this.f277517c = obj3;
    }
}
