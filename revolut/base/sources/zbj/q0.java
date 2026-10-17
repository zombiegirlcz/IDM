package zbj;

import com.revolut.feature.contacts.api.navigation.ContactsFeatureConfig;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 extends yji.n implements r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y8k.b f320934l;

    public q0(y8k.b peerToPeerFeatureConfigProvider) {
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        this.f320934l = peerToPeerFeatureConfigProvider;
    }

    @Override // zbj.r
    public final void M() {
        A2(new BridgeDestination(new FeatureCommand(new ContactsFeatureConfig.AddContact.ByPhoneOrEmail(com.revolut.feature.contacts.api.navigation.a.CHAT, null))));
    }

    @Override // zbj.r
    public final void j0(zm3.l contact, xi0.b currency) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(currency, "currency");
        V2(new z8k.p0(this, contact, currency, (Continuation) null, 2), new yi5.b(29));
    }

    @Override // zbj.r
    public final void m0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        A2(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter(key, 2))));
    }
}
