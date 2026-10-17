package elf;

import com.revolut.feature.transactions.impl.ui.kompot.details.click_handler.WebLinkAction;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class k2 extends yji.n implements s0 {
    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!(obj2 instanceof WebLinkAction)) {
            return Boolean.FALSE;
        }
        ulm.w0 w0Var = ulm.x0.Companion;
        WebLinkAction webLinkAction = (WebLinkAction) obj2;
        String str2 = webLinkAction.f92042a;
        w0Var.getClass();
        if (ulm.w0.d(str2) == null) {
            return Boolean.FALSE;
        }
        A2(zh9.u0.c(new WebViewFeatureConfig(webLinkAction.f92042a, null, 0, false, true, false, 130974)));
        return Boolean.TRUE;
    }
}
