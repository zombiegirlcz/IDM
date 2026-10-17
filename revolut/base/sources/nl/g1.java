package nl;

import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Navigator f216910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sl.f f216911b;

    public g1(Navigator navigator, sl.f completionUseCase) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(completionUseCase, "completionUseCase");
        this.f216910a = navigator;
        this.f216911b = completionUseCase;
    }
}
