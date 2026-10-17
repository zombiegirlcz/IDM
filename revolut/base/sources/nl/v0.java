package nl;

import com.onfido.android.sdk.capture.common.data.ThemeDataSource;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Navigator f216956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sl.f f216957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThemeDataSource f216958c;

    public v0(Navigator navigator, sl.f submitTaskCompletionUseCase, ThemeDataSource themeDataSource) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(submitTaskCompletionUseCase, "submitTaskCompletionUseCase");
        Intrinsics.checkNotNullParameter(themeDataSource, "themeDataSource");
        this.f216956a = navigator;
        this.f216957b = submitTaskCompletionUseCase;
        this.f216958c = themeDataSource;
    }
}
