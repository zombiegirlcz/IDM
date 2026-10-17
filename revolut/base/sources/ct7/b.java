package ct7;

import ck7.j;
import com.revolut.feature.credit.api.navigation.LoanHomeFeatureConfig;
import com.revolut.feature.insurance_credit.api.navigation.Facility;
import com.revolut.feature.insurance_credit.api.navigation.InsuranceCreditNavigationDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.HashMap;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q06.h;
import skm.p0;
import sri.m;
import te0.w;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements yr7.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f108648a;

    public b(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f108648a = navigator;
    }

    public static InsuranceCreditNavigationDestination b(jf0.c cVar) {
        Facility.Loan loan = new Facility.Loan(cVar.e(3));
        HashMap map = cVar.d;
        String str = (String) map.get("policy-id");
        if (str != null) {
            return new InsuranceCreditNavigationDestination(loan, str, (String) map.get("destination"));
        }
        throw new IllegalStateException(j6.a.q("No policyId passed in credit insurance deeplink: ", cVar.f173629c));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Pattern.compile("revolut://app/credit/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/insurance(?:\\?(.*))?$").matcher(deeplink.f173629c).matches();
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        InsuranceCreditNavigationDestination insuranceCreditNavigationDestinationB = b(cVar);
        return cVar.l() ? new h(new BridgeDestination(new CompositeCommand(new FeatureCommand(new LoanHomeFeatureConfig(cVar.e(3))), u0.f(insuranceCreditNavigationDestinationB))), null) : new h(insuranceCreditNavigationDestinationB, null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(p0.f264003c, new j(deeplink, this, null, 19));
    }
}
