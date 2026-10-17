package e8e;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.upi.api.UpiFeatureConfig;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qce.t0;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qua.p f123654b;

    public /* synthetic */ t(Object obj2, qua.p pVar, int i) {
        this.f123653a = i;
        this.f123654b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f123653a) {
            case 0:
                m updateState = (m) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return m.a(updateState, null, gc0.c.A(updateState.f123644c, this.f123654b.f249314a.f160150a), null, null, 59);
            case 1:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                qua.p pVar = this.f123654b;
                Intrinsics.h(pVar);
                return new RecurringPaymentWithExtra.LinkedTransaction(pVar, (a3) zhm.d0.d0(transactions));
            case 2:
                ljc.g update = (ljc.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ljc.g.a(update, null, null, null, this.f123654b, null, 47);
            case 3:
                UpiFeatureConfig.Destination.Transfer.InputData it8 = (UpiFeatureConfig.Destination.Transfer.InputData) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return u0.f(new UpiFeatureConfig.Destination.Transfer(it8, null, null, this.f123654b, 6));
            case 4:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                List listV0 = zhm.d0.V0((Iterable) defaultFactory.invoke(), 1);
                yp0.b.k(listV0, 0, R$attr.uikit_dp24, 0, 0, 29);
                return i2b.a.o(listV0, t0.a(this.f123654b));
            case 5:
                Pair pair = (Pair) obj2;
                return new t9e.f(this.f123654b, (List) pair.f186385a, (String) ((od0.i) pair.f186386b).f224257a);
            case 6:
                JuniorBankingProfile profile = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(profile, "profile");
                return qua.p.a(this.f123654b, null, null, null, null, null, null, null, new vua.a(profile.f77103j, profile.f77099b, profile.f77100c, null, profile.f77102h, profile.f77101g), null, 0, null, -262145, 33554431);
            default:
                Map charities = (Map) obj2;
                Intrinsics.checkNotNullParameter(charities, "charities");
                return tsk.t.h(this.f123654b, charities);
        }
    }

    public /* synthetic */ t(qua.p pVar, int i) {
        this.f123653a = i;
        this.f123654b = pVar;
    }
}
