package com.onfido.hosted.web.module;

import android.webkit.ValueCallback;
import com.onfido.hosted.web.module.HostedWebModuleFragment;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HostedWebModuleFragment f50164b;

    public /* synthetic */ b(HostedWebModuleFragment hostedWebModuleFragment, int i) {
        this.f50163a = i;
        this.f50164b = hostedWebModuleFragment;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj2) {
        switch (this.f50163a) {
            case 0:
                HostedWebModuleFragment.evaluateBootstrapScript$lambda$3(this.f50164b, (String) obj2);
                break;
            default:
                HostedWebModuleFragment.AnonymousClass1.handleOnBackPressed$lambda$0(this.f50164b, (String) obj2);
                break;
        }
    }
}
