package com.onfido.android.sdk.capture.ui.welcome;

import com.onfido.android.sdk.capture.ui.options.WelcomeScreenOptions;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/ui/welcome/WelcomePresenter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class WelcomeFragment$presenter$2 extends u implements Function0<WelcomePresenter> {
    final /* synthetic */ WelcomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragment$presenter$2(WelcomeFragment welcomeFragment) {
        super(0);
        this.this$0 = welcomeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final WelcomePresenter invoke() {
        Serializable serializable = this.this$0.requireArguments().getSerializable("WELCOME_SCREEN_OPTIONS");
        WelcomeScreenOptions welcomeScreenOptions = serializable instanceof WelcomeScreenOptions ? (WelcomeScreenOptions) serializable : null;
        if (welcomeScreenOptions != null) {
            return this.this$0.getPresenterFactory$onfido_capture_sdk_core_release().create(welcomeScreenOptions);
        }
        throw new IllegalArgumentException("screenOptions == null");
    }
}
