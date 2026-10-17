package nl;

import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Navigator f216901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sl.f f216902b;

    public e1(Navigator navigator, sl.f completionUseCase) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(completionUseCase, "completionUseCase");
        this.f216901a = navigator;
        this.f216902b = completionUseCase;
    }
}
