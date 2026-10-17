package qo0;

import android.animation.ValueAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.a f247975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f247976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f247977c;
    public int d;
    public Boolean e;
    public ValueAnimator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f247978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f247979h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f247980j;
    public int k;

    public i(j70.a devicePerformance) {
        Intrinsics.checkNotNullParameter(devicePerformance, "devicePerformance");
        this.f247975a = devicePerformance;
    }

    public final List a(WallpaperAssetSwitcher wallpaperAssetSwitcher) {
        int height = wallpaperAssetSwitcher.getHeight() - this.f247976b;
        int i = height - this.f247980j;
        int i2 = height - this.k;
        float f = this.i;
        e eVar = new e(BitmapDescriptorFactory.HUE_RED, f, i, i2);
        e eVar2 = new e(f, this.f247979h, i2, height);
        int height2 = wallpaperAssetSwitcher.getHeight();
        float f4 = this.f247979h;
        return v.k(eVar, eVar2, new e(f4, f4, height, height2));
    }

    public final void b(WallpaperAssetSwitcher wallpaperAssetSwitcher) {
        Boolean bool;
        List listA;
        if (this.f == null && (bool = this.e) != null) {
            if (bool.booleanValue()) {
                float f = this.f247978g;
                listA = u.c(new e(f, f, 0, wallpaperAssetSwitcher.getHeight()));
            } else {
                listA = a(wallpaperAssetSwitcher);
            }
            w0.b(wallpaperAssetSwitcher, listA, this.f247975a);
        }
    }
}
