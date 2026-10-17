package b29;

import android.webkit.CookieManager;
import od0.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {
    @Override // od0.e
    public final void clear() {
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
    }
}
