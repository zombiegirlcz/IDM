package daj;

import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.retail.feature.crypto.navigation.api.interceptor.CryptoNavigationMainContainerActionExtensionPayload;
import com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreen;
import com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends n implements etb.a {
    @Override // etb.a
    public final void E(MainScreenContainerActionData actionData) {
        CryptoNavigationInterceptorScreenContract$InputData deeplink;
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        CryptoNavigationMainContainerActionExtensionPayload cryptoNavigationMainContainerActionExtensionPayload = (CryptoNavigationMainContainerActionExtensionPayload) actionData.f83422b;
        if (cryptoNavigationMainContainerActionExtensionPayload instanceof CryptoNavigationMainContainerActionExtensionPayload.Deeplink) {
            deeplink = new CryptoNavigationInterceptorScreenContract$InputData.Deeplink(((CryptoNavigationMainContainerActionExtensionPayload.Deeplink) cryptoNavigationMainContainerActionExtensionPayload).f100024a);
        } else if (cryptoNavigationMainContainerActionExtensionPayload instanceof CryptoNavigationMainContainerActionExtensionPayload.Navigation) {
            deeplink = new CryptoNavigationInterceptorScreenContract$InputData.Navigation(((CryptoNavigationMainContainerActionExtensionPayload.Navigation) cryptoNavigationMainContainerActionExtensionPayload).f100025a);
        } else {
            if (cryptoNavigationMainContainerActionExtensionPayload != null) {
                throw new NoWhenBranchMatchedException();
            }
            deeplink = new CryptoNavigationInterceptorScreenContract$InputData.Deeplink("");
        }
        n.O2(this, new CryptoNavigationInterceptorScreen(deeplink), null, 2);
    }

    @Override // etb.a
    public final boolean i2(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        return actionData.f83422b instanceof CryptoNavigationMainContainerActionExtensionPayload;
    }
}
