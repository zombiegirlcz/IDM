package vq4;

import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.CreditCardLimitDecreaseFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import ft3.a1;
import ft3.m;
import grl.r2;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.b f291309b;

    public /* synthetic */ c(com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.b bVar, int i) {
        this.f291308a = i;
        this.f291309b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f291308a;
        com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.b bVar = this.f291309b;
        switch (i) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                h.w2(bVar.f69204s, CreditCardLimitDecreaseFlowContract$Step.Error.f69199a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Boolean.TRUE;
            default:
                tq4.e result = (tq4.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.C1(u0.c(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.ACCOUNT_DETAILS, null, null, null, result.f273523a, 14), new m(bVar.o.f69195a, gt3.b.USER_INITIATED), null, null, null, null, null, null, null, null, 2044)));
                return Unit.f186387a;
        }
    }
}
