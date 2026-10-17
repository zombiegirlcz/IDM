package com.onfido.hosted.web.module.externallink;

import android.content.Context;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.hosted.web.module.di.DaggerHostedWebModuleComponent;
import com.onfido.hosted.web.module.di.HostedWebModuleComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/hosted/web/module/di/HostedWebModuleComponent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleExternalLinkFragment$component$2 extends u implements Function0<HostedWebModuleComponent> {
    final /* synthetic */ HostedWebModuleExternalLinkFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostedWebModuleExternalLinkFragment$component$2(HostedWebModuleExternalLinkFragment hostedWebModuleExternalLinkFragment) {
        super(0);
        this.this$0 = hostedWebModuleExternalLinkFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final HostedWebModuleComponent invoke() {
        HostedWebModuleComponent.Factory factory = DaggerHostedWebModuleComponent.factory();
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return factory.create(SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null));
    }
}
