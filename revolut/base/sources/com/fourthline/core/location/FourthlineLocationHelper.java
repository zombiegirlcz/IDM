package com.fourthline.core.location;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import com.fourthline.core.location.internal.AuthorizationManagerImpl;
import com.fourthline.core.location.internal.LocationAvailabilityCheckerImpl;
import com.fourthline.core.location.internal.LocationFetcherImpl;
import com.fourthline.core.location.internal.LocationProviderImpl;
import com.fourthline.core.location.internal.VpnConnectivityCheckerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/fourthline/core/location/FourthlineLocationHelper;", "", "<init>", "()V", "getLocationProvider", "Lcom/fourthline/core/location/LocationProvider;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/activity/ComponentActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "applicationContext", "Landroid/content/Context;", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FourthlineLocationHelper {

    @NotNull
    public static final FourthlineLocationHelper INSTANCE = new FourthlineLocationHelper();

    private FourthlineLocationHelper() {
    }

    @NotNull
    public static final LocationProvider getLocationProvider(@NotNull AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ActivityResultRegistry activityResultRegistry = activity.getActivityResultRegistry();
        Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "<get-activityResultRegistry>(...)");
        return getLocationProvider(applicationContext, activityResultRegistry);
    }

    @NotNull
    public static final LocationProvider getLocationProvider(@NotNull ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ActivityResultRegistry activityResultRegistry = activity.getActivityResultRegistry();
        Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "<get-activityResultRegistry>(...)");
        return getLocationProvider(applicationContext, activityResultRegistry);
    }

    @NotNull
    public static final LocationProvider getLocationProvider(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Context applicationContext = fragmentActivityRequireActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ActivityResultRegistry activityResultRegistry = fragmentActivityRequireActivity.getActivityResultRegistry();
        Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "<get-activityResultRegistry>(...)");
        return getLocationProvider(applicationContext, activityResultRegistry);
    }

    @NotNull
    public static final LocationProvider getLocationProvider(@NotNull Context applicationContext, @NotNull ActivityResultRegistry registry) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(registry, "registry");
        return new LocationProviderImpl(new AuthorizationManagerImpl(applicationContext, registry), new LocationAvailabilityCheckerImpl(applicationContext), new LocationFetcherImpl(applicationContext, new VpnConnectivityCheckerImpl(applicationContext)));
    }
}
