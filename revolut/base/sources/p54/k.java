package p54;

import b94.r;
import c84.v;
import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.retail.core.navigation.FinishCommand;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f233010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CreditApplicationPluginFlowContract$Configuration f233011c;

    public /* synthetic */ k(m mVar, CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration, int i) {
        this.f233009a = i;
        this.f233010b = mVar;
        this.f233011c = creditApplicationPluginFlowContract$Configuration;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        it3.d creditApplicationPluginStatus = (it3.d) obj2;
        switch (this.f233009a) {
            case 0:
                Intrinsics.checkNotNullParameter(creditApplicationPluginStatus, "creditApplicationPluginStatus");
                CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = this.f233011c;
                if (!creditApplicationPluginFlowContract$Configuration.f66896j && creditApplicationPluginStatus.d != ks3.a.IN_PROGRESS) {
                    ufm.b bVarM = d0.m(new FinishCommand(200, v.b(creditApplicationPluginStatus, false), null, 4));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                kotlinx.coroutines.d dVar = p0.f264003c;
                m mVar = this.f233010b;
                ufm.i iVar = new ufm.i(w.o0(dVar, new osk.m(creditApplicationPluginStatus, mVar, null, 21)), new p30.b(23, new k(mVar, creditApplicationPluginFlowContract$Configuration, 1)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            default:
                Intrinsics.checkNotNullParameter(creditApplicationPluginStatus, "updatedCreditApplicationPluginStatus");
                CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration2 = this.f233011c;
                return new ufm.i(this.f233010b.f233014n.a(creditApplicationPluginStatus, creditApplicationPluginFlowContract$Configuration2.f66893c, creditApplicationPluginFlowContract$Configuration2.f66899n, new CreditApplicationStatusNavigationConfig(true, true, 10)), new p30.b(24, new r(creditApplicationPluginStatus, 2)), 1);
        }
    }
}
