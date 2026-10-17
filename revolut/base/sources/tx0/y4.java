package tx0;

import android.graphics.drawable.Drawable;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;

/* JADX INFO: loaded from: classes20.dex */
public final class y4 extends gim.c {
    public Drawable u;
    public NavBarWithContainerBackground v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f275281w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ WallpaperAssetSwitcher f275282x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f275283y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(WallpaperAssetSwitcher wallpaperAssetSwitcher, gim.c cVar) {
        super(cVar);
        this.f275282x = wallpaperAssetSwitcher;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f275281w = obj2;
        this.f275283y |= Integer.MIN_VALUE;
        return WallpaperAssetSwitcher.c(this.f275282x, null, null, this);
    }
}
