package ojl;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.sso.api.app_consent.RevolutSsoAppConsentDestination;
import com.revolut.sso.api.app_consent.RevolutSsoQrConsentDestination;
import com.revolut.sso.api.device_lock_protection.RevolutSsoDeviceLockProtectionDestination;
import com.revolut.sso.api.email.change.ChangeEmailInputData;
import com.revolut.sso.api.email.change.RevolutSsoChangeEmailFlowDestination;
import com.revolut.sso.api.login.RevolutSsoApi$Toggles;
import com.revolut.sso.api.navigation.RevolutSsoConnectedAppDetailsDestination;
import com.revolut.sso.api.navigation.RevolutSsoOperationBoundAuthenticationDestination;
import com.revolut.sso.api.navigation.RevolutSsoPasskeysManagementFlowDestination;
import com.revolut.sso.api.navigation.SignInWithRevolutIDDestination;
import com.revolut.sso.api.passcode.change.RevolutSsoChangePasscodeFlowDestination;
import com.revolut.sso.api.phone.change.RevolutSsoChangePhoneFlowDestination;
import com.revolut.sso.api.revolut_id.RevolutIDDestination;
import com.revolut.sso.impl.ui.consent.app.AppConsentFlow;
import com.revolut.sso.impl.ui.consent.qr.QrConsentFlow;
import com.revolut.sso.impl.ui.consent.qr.QrConsentFlowContract$InputData;
import com.revolut.sso.impl.ui.email.change_flow.ChangeEmailFlow;
import com.revolut.sso.impl.ui.passcode.change_flow.ChangePasscodeFlow;
import com.revolut.sso.impl.ui.passkeys_management.PasskeysManagementFlow;
import com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlow;
import com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$InputData;
import com.revolut.sso.impl.ui.protection_check.flow.ProtectionCheckFlow;
import com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.ReauthenticationWrapperFlow;
import com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.ReauthenticationWrapperFlowContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.RevolutIDFlow;
import com.revolut.sso.impl.ui.revolut_id.RevolutIDFlowContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.ConnectedAppDetailsFlow;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.ConnectedAppDetailsFlowContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.ConnectedClientDetailsDestination;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.ConnectedClientDetailsFlow;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.ConnectedClientDetailsFlowContract$InputData;
import com.revolut.sso.impl.ui.signin_with_revolut_id.SignInWithRevolutIdFlow;
import com.revolut.sso.impl.ui.signin_with_revolut_id.SignInWithRevolutIdFlowContract$InputData;
import djl.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ljl.p0;
import ljl.p1;
import rqk.k;
import vil.h;
import yhm.m;
import yhm.o;
import yol.c;
import yol.d;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phm.a f225850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f225851b;

    public a(p0 dependenciesProvider, phm.a reauthenticationWrapperFlowFactory) {
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        Intrinsics.checkNotNullParameter(reauthenticationWrapperFlowFactory, "reauthenticationWrapperFlowFactory");
        this.f225850a = dependenciesProvider;
        this.f225851b = reauthenticationWrapperFlowFactory;
    }

    @Override // aii.p
    public final void b() {
        try {
            m.Companion companion = m.INSTANCE;
            p1.Companion.b();
            Unit unit = Unit.f186387a;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            o.a(th10);
        }
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof b) {
            b bVar = (b) descriptor;
            return bVar.a(((d) ((c) this.f225851b.get())).a(bVar.f(), bVar.e(), bVar.d(), bVar.c(), bVar.b()));
        }
        if (descriptor instanceof ejl.c) {
            ejl.c cVar = (ejl.c) descriptor;
            return cVar.a(new ChangePasscodeFlow(cVar.b()));
        }
        boolean z = descriptor instanceof zil.d;
        phm.a aVar = this.f225850a;
        if (z) {
            zil.d dVar = (zil.d) descriptor;
            return dVar.a(new ChangeEmailFlow(new ChangeEmailInputData(dVar.b().getF105828a(), ((k) ((bjl.p0) aVar.get())).f256593p, dVar.b().getF105830c(), dVar.b().getD(), dVar.b().getE(), dVar.b().getF())));
        }
        if (descriptor instanceof com.revolut.sso.api.phone.change.a) {
            com.revolut.sso.api.phone.change.a aVar2 = (com.revolut.sso.api.phone.change.a) descriptor;
            return aVar2.a(new ChangePhoneFlow(new ChangePhoneFlowContract$InputData(((k) ((bjl.p0) aVar.get())).f256593p, aVar2.b().getF106018a(), aVar2.b().getF106019b())));
        }
        if (!(descriptor instanceof h)) {
            return null;
        }
        h hVar = (h) descriptor;
        return hVar.a(new QrConsentFlow(new QrConsentFlowContract$InputData(hVar.b().getF105824a(), hVar.b().getF105825b(), hVar.b().getF105826c())));
    }

    @Override // nte.a
    public final List e() {
        return RevolutSsoApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RevolutSsoAppConsentDestination) {
            return new AppConsentFlow(((RevolutSsoAppConsentDestination) destination).getF105821b());
        }
        boolean z = destination instanceof RevolutSsoChangeEmailFlowDestination;
        phm.a aVar = this.f225850a;
        if (z) {
            RevolutSsoChangeEmailFlowDestination revolutSsoChangeEmailFlowDestination = (RevolutSsoChangeEmailFlowDestination) destination;
            return new ChangeEmailFlow(new ChangeEmailInputData(((k) ((bjl.p0) aVar.get())).f256593p, revolutSsoChangeEmailFlowDestination.getF105833b().getF105834a(), revolutSsoChangeEmailFlowDestination.getF105833b().getF105835b(), revolutSsoChangeEmailFlowDestination.getF105833b().getF105836c(), 17));
        }
        if (destination instanceof RevolutSsoChangePasscodeFlowDestination) {
            return new ChangePasscodeFlow(((RevolutSsoChangePasscodeFlowDestination) destination).getF106016c());
        }
        if (destination instanceof RevolutSsoChangePhoneFlowDestination) {
            RevolutSsoChangePhoneFlowDestination revolutSsoChangePhoneFlowDestination = (RevolutSsoChangePhoneFlowDestination) destination;
            return new ChangePhoneFlow(new ChangePhoneFlowContract$InputData(((k) ((bjl.p0) aVar.get())).f256593p, revolutSsoChangePhoneFlowDestination.getF106017b().getF106018a(), revolutSsoChangePhoneFlowDestination.getF106017b().getF106019b()));
        }
        if (destination instanceof RevolutSsoConnectedAppDetailsDestination) {
            return new ConnectedAppDetailsFlow(new ConnectedAppDetailsFlowContract$InputData(((RevolutSsoConnectedAppDetailsDestination) destination).getF106008a()));
        }
        if (destination instanceof ConnectedClientDetailsDestination) {
            ConnectedClientDetailsDestination connectedClientDetailsDestination = (ConnectedClientDetailsDestination) destination;
            return new ConnectedClientDetailsFlow(new ConnectedClientDetailsFlowContract$InputData(connectedClientDetailsDestination.getF106724a(), connectedClientDetailsDestination.getF106725b()));
        }
        if (destination instanceof RevolutSsoDeviceLockProtectionDestination) {
            return new ProtectionCheckFlow();
        }
        if (destination instanceof RevolutSsoPasskeysManagementFlowDestination) {
            return new PasskeysManagementFlow();
        }
        if (destination instanceof RevolutSsoOperationBoundAuthenticationDestination) {
            RevolutSsoOperationBoundAuthenticationDestination revolutSsoOperationBoundAuthenticationDestination = (RevolutSsoOperationBoundAuthenticationDestination) destination;
            return new ReauthenticationWrapperFlow(new ReauthenticationWrapperFlowContract$InputData(revolutSsoOperationBoundAuthenticationDestination.getF106009b(), revolutSsoOperationBoundAuthenticationDestination.getF106010c(), revolutSsoOperationBoundAuthenticationDestination.getD(), revolutSsoOperationBoundAuthenticationDestination.getE()));
        }
        if (destination instanceof RevolutSsoQrConsentDestination) {
            RevolutSsoQrConsentDestination revolutSsoQrConsentDestination = (RevolutSsoQrConsentDestination) destination;
            return new QrConsentFlow(new QrConsentFlowContract$InputData(revolutSsoQrConsentDestination.getF105823a().getF105824a(), revolutSsoQrConsentDestination.getF105823a().getF105825b(), revolutSsoQrConsentDestination.getF105823a().getF105826c()));
        }
        if (destination instanceof SignInWithRevolutIDDestination) {
            SignInWithRevolutIDDestination signInWithRevolutIDDestination = (SignInWithRevolutIDDestination) destination;
            return new SignInWithRevolutIdFlow(new SignInWithRevolutIdFlowContract$InputData(signInWithRevolutIDDestination.getF106012b(), signInWithRevolutIDDestination.getF106013c(), signInWithRevolutIDDestination.getD(), signInWithRevolutIDDestination.getE(), signInWithRevolutIDDestination.getF()));
        }
        if (destination instanceof RevolutIDDestination) {
            return new RevolutIDFlow(new RevolutIDFlowContract$InputData(((RevolutIDDestination.InputData) ((RevolutIDDestination) destination).f98300a).getF106022a()));
        }
        return null;
    }
}
