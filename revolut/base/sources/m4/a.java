package m4;

import android.graphics.Insets;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.view.WindowInsetsAnimation;
import android.view.animation.PathInterpolator;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void C() {
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info d(Object obj2) {
        return (MediaRoute2Info) obj2;
    }

    public static /* bridge */ /* synthetic */ MediaRouter2$ControllerCallback e(Object obj2) {
        return (MediaRouter2$ControllerCallback) obj2;
    }

    public static /* bridge */ /* synthetic */ MediaRouter2$RouteCallback f(Object obj2) {
        return (MediaRouter2$RouteCallback) obj2;
    }

    public static /* bridge */ /* synthetic */ MediaRouter2 i(Object obj2) {
        return (MediaRouter2) obj2;
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder j(ImmutableList immutableList) {
        return new RouteDiscoveryPreference.Builder(immutableList, false);
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds k(Insets insets) {
        return new WindowInsetsAnimation.Bounds(Insets.NONE, insets);
    }

    public static /* synthetic */ WindowInsetsAnimation l(int i, PathInterpolator pathInterpolator, long j2) {
        return new WindowInsetsAnimation(i, pathInterpolator, j2);
    }

    public static /* synthetic */ void n() {
    }
}
