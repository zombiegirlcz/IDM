package iqg;

import com.revolut.data.model.Data;
import com.revolut.feature_autoinvest_ui_api.navigation.AutoInvestMoveControllerApi$Result;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b f167847b;

    public /* synthetic */ l(com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar, int i) {
        this.f167846a = i;
        this.f167847b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f167846a) {
            case 0:
                g it8 = (g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Data data = it8.f167838a;
                this.f167847b.getClass();
                h hVar = (h) data.getContent();
                j jVar = hVar != null ? hVar.f167840a : null;
                yvh.b bVar = jVar != null ? jVar.f167843b : null;
                yvh.b bVar2 = jVar != null ? jVar.f167842a : null;
                if (bVar == null || bVar.equals(bVar2)) {
                    return null;
                }
                return bVar;
            default:
                AutoInvestMoveControllerApi$Result result = (AutoInvestMoveControllerApi$Result) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof AutoInvestMoveControllerApi$Result.Cancel) {
                    this.f167847b.B2();
                } else if (!(result instanceof AutoInvestMoveControllerApi$Result.Move)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
