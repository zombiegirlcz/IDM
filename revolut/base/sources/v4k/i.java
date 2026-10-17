package v4k;

import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import z0h.t1;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f286129a = new i();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        t1 wealthDisclaimersData = (t1) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        return new f(new WealthDisclaimersContract$Disclaimer$Investment.BankTransferWithdraw(wealthDisclaimersData.f318564b), wealthDisclaimersData.f318564b);
    }
}
