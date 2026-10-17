package com.onfido.android.sdk.capture.ui.documentselection.di;

import com.onfido.android.sdk.capture.common.di.FragmentScope;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.android.sdk.capture.internal.navigation.navigator.NavigationManagerHolder;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/di/RestrictedDocumentSelectionHostNavigationModule;", "", "()V", "provideNavigationManagerHolder", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "onfidoNavigation", "Lcom/onfido/android/sdk/capture/internal/navigation/OnfidoNavigation;", "provideNavigator", "Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "provideOnfidoNavigation", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RestrictedDocumentSelectionHostNavigationModule {
    @NotNull
    public final NavigationManagerHolder provideNavigationManagerHolder(@NotNull OnfidoNavigation onfidoNavigation) {
        Intrinsics.checkNotNullParameter(onfidoNavigation, "onfidoNavigation");
        return onfidoNavigation.getNavigationManagerHolder();
    }

    @NotNull
    public final Navigator provideNavigator(@NotNull OnfidoNavigation onfidoNavigation) {
        Intrinsics.checkNotNullParameter(onfidoNavigation, "onfidoNavigation");
        return onfidoNavigation.getNavigator();
    }

    @FragmentScope
    @NotNull
    public final OnfidoNavigation provideOnfidoNavigation(@NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        return new OnfidoNavigation(schedulersProvider);
    }
}
