package androidx.browser.auth;

import android.os.Bundle;

/* JADX INFO: loaded from: classes13.dex */
public final class AuthTabColorSchemeParams {
    private final Integer mNavigationBarColor;
    private final Integer mNavigationBarDividerColor;
    private final Integer mToolbarColor;

    public static final class Builder {
        private Integer mNavigationBarColor;
        private Integer mNavigationBarDividerColor;
        private Integer mToolbarColor;

        public AuthTabColorSchemeParams build() {
            return new AuthTabColorSchemeParams(this.mToolbarColor, this.mNavigationBarColor, this.mNavigationBarDividerColor);
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        Integer num = this.mToolbarColor;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.mNavigationBarColor;
        if (num2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        Integer num3 = this.mNavigationBarDividerColor;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num3.intValue());
        }
        return bundle;
    }

    private AuthTabColorSchemeParams(Integer num, Integer num2, Integer num3) {
        this.mToolbarColor = num;
        this.mNavigationBarColor = num2;
        this.mNavigationBarDividerColor = num3;
    }
}
