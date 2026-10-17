package com.meshconnect.link.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.view.result.contract.ActivityResultContract;
import com.meshconnect.link.entity.IntegrationAccessToken;
import com.meshconnect.link.entity.LinkConfiguration;
import com.meshconnect.link.entity.LinkTheme;
import java.util.List;
import kg.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qk.c;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/meshconnect/link/ui/LaunchLink;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/meshconnect/link/entity/LinkConfiguration;", "Lcom/meshconnect/link/ui/LinkResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LaunchLink extends ActivityResultContract<LinkConfiguration, LinkResult> {
    @Override // androidx.view.result.contract.ActivityResultContract
    @NotNull
    public Intent createIntent(@NotNull Context context, @NotNull LinkConfiguration input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        int i = LinkActivity.f49860d0;
        Intrinsics.checkNotNullParameter(context, "activity");
        Intrinsics.checkNotNullParameter(input, "config");
        Intent intentPutExtra = new Intent(context, (Class<?>) LinkActivity.class).putExtra("token", input.getToken()).putExtra("disable_whitelist", input.getDisableDomainWhiteList()).putExtra("language", input.getLanguage()).putExtra("fiat_currency", input.getDisplayFiatCurrency());
        LinkTheme theme = input.getTheme();
        int i2 = theme == null ? -1 : c.f246925a[theme.ordinal()];
        Intent intentPutExtra2 = intentPutExtra.putExtra("theme", i2 != 1 ? i2 != 2 ? i2 != 3 ? null : "system" : "light" : "dark");
        Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "putExtra(...)");
        List<IntegrationAccessToken> accessTokens = input.getAccessTokens();
        if (accessTokens != null && !accessTokens.isEmpty()) {
            intentPutExtra2.putExtra("access_tokens", new o().k(accessTokens));
        }
        return intentPutExtra2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.result.contract.ActivityResultContract
    @NotNull
    public LinkResult parseResult(int resultCode, Intent intent) {
        int i = LinkActivity.f49860d0;
        if (intent != null) {
            try {
                LinkResult linkResult = (LinkResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("data", LinkResult.class) : intent.getParcelableExtra("data"));
                if (linkResult != null) {
                    return linkResult;
                }
            } catch (Exception e) {
                return new LinkExit(e.getMessage());
            }
        }
        return new LinkExit(null, 1, 0 == true ? 1 : 0);
    }
}
