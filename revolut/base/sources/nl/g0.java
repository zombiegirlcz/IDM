package nl;

import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Navigator f216908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sl.f f216909b;

    public g0(Navigator navigator, sl.f submitTaskCompletionUseCase) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(submitTaskCompletionUseCase, "submitTaskCompletionUseCase");
        this.f216908a = navigator;
        this.f216909b = submitTaskCompletionUseCase;
    }
}
