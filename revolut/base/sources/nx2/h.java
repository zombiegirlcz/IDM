package nx2;

import com.revolut.feature.card_design.api.model.SkipConfig;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njj.n0;
import til.r;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.d f220103b;

    public /* synthetic */ h(com.revolut.feature.card_design.impl.card_design.d dVar, int i) {
        this.f220102a = i;
        this.f220103b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f220102a;
        com.revolut.feature.card_design.impl.card_design.d dVar = this.f220103b;
        switch (i) {
            case 0:
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, dii.e.f115068a) && Intrinsics.f(result, dii.f.f115069a)) {
                    SkipConfig f64620j = dVar.o.getF64620j();
                    NaviCommand naviCommand = f64620j != null ? f64620j.f64592a : null;
                    if (naviCommand != null) {
                        dVar.C1(u0.b(naviCommand));
                    }
                } else {
                    int i2 = jli.h.f175850a;
                }
                break;
            default:
                r workflowResult = (r) obj2;
                Intrinsics.checkNotNullParameter(workflowResult, "workflowResult");
                dVar.n2(new n0(workflowResult, dVar, null, 26), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
