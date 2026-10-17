package com.onfido.hosted.web.module;

import android.webkit.WebResourceError;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "Landroid/webkit/WebResourceError;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleFragment$setupWebView$1$3 extends u implements Function1<WebResourceError, Unit> {
    final /* synthetic */ HostedWebModuleFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostedWebModuleFragment$setupWebView$1$3(HostedWebModuleFragment hostedWebModuleFragment) {
        super(1);
        this.this$0 = hostedWebModuleFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((WebResourceError) obj2);
        return Unit.f186387a;
    }

    public final void invoke(WebResourceError webResourceError) {
        Timber.INSTANCE.e("Something went wrong while loading module: " + this.this$0.getModuleInfo() + " with error: " + webResourceError, new Object[0]);
        this.this$0.showErrorScreen();
    }
}
