package ya7;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.hidden_accounts.api.navigation.BiometricAuthenticationDestination;
import com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.BiometricAuthenticationFlow;
import com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.BiometricAuthenticationFlowContract$InputData;
import com.revolut.feature.hidden_accounts.impl.ui.flow.HiddenAccountsFlow;
import com.revolut.feature.hidden_accounts.impl.ui.flow.HiddenAccountsFlowContract$InputData;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.SecretAccountsFlow;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.CreateSecretPhraseFlow;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.CreateSecretPhraseFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import qa7.c;
import qa7.d;
import qa7.f;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof d) {
            d dVar = (d) descriptor;
            return dVar.a(new HiddenAccountsFlow(new HiddenAccountsFlowContract$InputData(dVar.f243973a, dVar.f243974b)));
        }
        if (descriptor instanceof qa7.a) {
            return ((qa7.a) descriptor).a(new BiometricAuthenticationFlow(new BiometricAuthenticationFlowContract$InputData(null)));
        }
        if (descriptor instanceof c) {
            c cVar = (c) descriptor;
            return cVar.a(new CreateSecretPhraseFlow(new CreateSecretPhraseFlowContract$InputData(cVar.f243972a)));
        }
        if (descriptor instanceof f) {
            return ((f) descriptor).a(new SecretAccountsFlow());
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BiometricAuthenticationDestination) {
            return new BiometricAuthenticationFlow(new BiometricAuthenticationFlowContract$InputData(((BiometricAuthenticationDestination) destination).f74649a));
        }
        return null;
    }
}
