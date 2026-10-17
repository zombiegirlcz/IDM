package com.onfido.hosted.web.module;

import com.onfido.android.sdk.capture.databinding.OnfidoHostedWebModuleFragmentLayoutBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleFragment$setupWebView$1$2 extends u implements Function0<Unit> {
    final /* synthetic */ OnfidoHostedWebModuleFragmentLayoutBinding $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostedWebModuleFragment$setupWebView$1$2(OnfidoHostedWebModuleFragmentLayoutBinding onfidoHostedWebModuleFragmentLayoutBinding) {
        super(0);
        this.$this_with = onfidoHostedWebModuleFragmentLayoutBinding;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3741invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3741invoke() {
        this.$this_with.onfidoWebView.setVisibility(0);
        this.$this_with.webViewErrorLayout.setVisibility(8);
    }
}
