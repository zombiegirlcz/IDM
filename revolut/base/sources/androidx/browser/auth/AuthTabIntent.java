package androidx.browser.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.browser.auth.AuthTabColorSchemeParams;
import androidx.browser.auth.AuthTabSession;

/* JADX INFO: loaded from: classes13.dex */
public class AuthTabIntent {
    public final Intent intent;

    public static final class Builder {
        private SparseArray<Bundle> mColorSchemeParamBundles;
        private Bundle mDefaultColorSchemeBundle;
        private final Intent mIntent = new Intent("android.intent.action.VIEW");
        private final AuthTabColorSchemeParams.Builder mDefaultColorSchemeBuilder = new AuthTabColorSchemeParams.Builder();

        private void setSessionParameters(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.mIntent.putExtras(bundle);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AuthTabIntent build() {
            this.mIntent.putExtra("androidx.browser.auth.extra.LAUNCH_AUTH_TAB", true);
            AuthTabSession authTabSession = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (!this.mIntent.hasExtra("android.support.customtabs.extra.SESSION")) {
                setSessionParameters(null, null);
            }
            this.mIntent.putExtras(this.mDefaultColorSchemeBuilder.build().toBundle());
            Bundle bundle = this.mDefaultColorSchemeBundle;
            if (bundle != null) {
                this.mIntent.putExtras(bundle);
            }
            if (this.mColorSchemeParamBundles != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.mColorSchemeParamBundles);
                this.mIntent.putExtras(bundle2);
            }
            return new AuthTabIntent(this.mIntent, authTabSession, objArr2 == true ? 1 : 0);
        }
    }

    private AuthTabIntent(Intent intent, AuthTabSession authTabSession, AuthTabSession.PendingSession pendingSession) {
        this.intent = intent;
    }
}
