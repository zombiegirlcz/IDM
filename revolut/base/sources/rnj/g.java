package rnj;

import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.retail.feature.esim.api.model.EsimConnectivityTroubleshootingInfo;
import fej.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rbh.k;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a f255710b;

    public /* synthetic */ g(com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a aVar, int i) {
        this.f255709a = i;
        this.f255710b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        switch (this.f255709a) {
            case 0:
                c it8 = (c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                EsimConnectivityTroubleshootingInfo esimConnectivityTroubleshootingInfo = (EsimConnectivityTroubleshootingInfo) it8.f255703b.getContent();
                return (esimConnectivityTroubleshootingInfo == null || (str = esimConnectivityTroubleshootingInfo.f100199a) == null) ? this.f255710b.f101485t.f100897a : str;
            case 1:
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.e) {
                    this.f255710b.L2();
                }
                return Unit.f186387a;
            default:
                fej.d output = (fej.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean zF = Intrinsics.f(output, d.a.f134638a);
                com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a aVar = this.f255710b;
                if (zF) {
                    aVar.l2(new k(aVar, null, 11), new yi5.b(26));
                } else {
                    if (!Intrinsics.f(output, d.b.f134639a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EsimInstructionType.INSTANCE.getClass();
                    aVar.K2("INSTALLATION");
                }
                return Unit.f186387a;
        }
    }
}
