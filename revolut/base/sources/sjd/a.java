package sjd;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.sign_in_methods.api.navigation.SignInMethodsDestination;
import com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.SignInMethodsScreen;
import com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.SignInMethodsScreenContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f263708a;

    public a(Set deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f263708a = deeplinkGateways;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof rjd.a) {
            return ((rjd.a) descriptor).a(new SignInMethodsScreen(null));
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof SignInMethodsDestination)) {
            return null;
        }
        SignInMethodsDestination.DeeplinkData deeplinkData = ((SignInMethodsDestination) destination).f87241b;
        return deeplinkData instanceof SignInMethodsDestination.DeeplinkData.BankIdDeeplink ? new SignInMethodsScreen(new SignInMethodsScreenContract$InputData.BankIdDeeplink(((SignInMethodsDestination.DeeplinkData.BankIdDeeplink) deeplinkData).f87243a)) : deeplinkData instanceof SignInMethodsDestination.DeeplinkData.DAPDeeplink ? new SignInMethodsScreen(new SignInMethodsScreenContract$InputData.DAPDeeplink(((SignInMethodsDestination.DeeplinkData.DAPDeeplink) deeplinkData).f87244a)) : new SignInMethodsScreen(null);
    }

    @Override // aii.p
    public final Set h() {
        return this.f263708a;
    }
}
