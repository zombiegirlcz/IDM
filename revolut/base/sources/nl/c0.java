package nl;

import android.content.Context;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f216893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f216894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f216895c;
    public final Navigator d;
    public final sl.f e;
    public final OnfidoRemoteConfig f;

    public c0(Context context, q0 faceLivenessFlowHelper, x0 permissionsFlowHelper, Navigator navigator, sl.f submitTaskCompletionUseCase, OnfidoRemoteConfig onfidoRemoteConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(faceLivenessFlowHelper, "faceLivenessFlowHelper");
        Intrinsics.checkNotNullParameter(permissionsFlowHelper, "permissionsFlowHelper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(submitTaskCompletionUseCase, "submitTaskCompletionUseCase");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        this.f216893a = context;
        this.f216894b = faceLivenessFlowHelper;
        this.f216895c = permissionsFlowHelper;
        this.d = navigator;
        this.e = submitTaskCompletionUseCase;
        this.f = onfidoRemoteConfig;
    }
}
