package h54;

import imk.p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d f149469b;

    public /* synthetic */ h(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, int i) {
        this.f149468a = i;
        this.f149469b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f149468a) {
            case 0:
                j54.z zVar = this.f149469b.I;
                j3c.y onDismiss = new j3c.y(11);
                com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d dVar = (com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d) zVar;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
                a2 a2Var = dVar.f67117s;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                dVar.f67118t = null;
                onDismiss.invoke();
                dVar.T2(new p0(dVar, null, 17), new yi5.b(27));
                break;
            case 1:
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar2 = this.f149469b;
                dVar2.l2(new l(dVar2, null, 5), new yi5.b(26));
                break;
            case 2:
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar3 = this.f149469b;
                dVar3.l2(new l(dVar3, null, 9), new yi5.b(26));
                break;
            case 3:
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar4 = this.f149469b;
                dVar4.l2(new l(dVar4, null, 7), new yi5.b(26));
                break;
            case 4:
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar5 = this.f149469b;
                dVar5.l2(new l(dVar5, null, 2), new yi5.b(26));
                break;
            case 5:
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar6 = this.f149469b;
                dVar6.l2(new l(dVar6, null, 6), new yi5.b(26));
                break;
            default:
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar7 = this.f149469b;
                dVar7.l2(new l(dVar7, null, 10), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
