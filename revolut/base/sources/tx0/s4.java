package tx0;

import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class s4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WallpaperAssetSwitcher f275244b;

    public /* synthetic */ s4(WallpaperAssetSwitcher wallpaperAssetSwitcher, int i) {
        this.f275243a = i;
        this.f275244b = wallpaperAssetSwitcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f275243a
            java.lang.String r1 = "it"
            com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher r2 = r3.f275244b
            switch(r0) {
                case 0: goto L27;
                case 1: goto L20;
                default: goto L9;
            }
        L9:
            android.content.res.Configuration r4 = (android.content.res.Configuration) r4
            com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher$a r0 = com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher.INSTANCE
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            tx0.t4 r4 = r2.z
            if (r4 == 0) goto L1d
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L1d
            r2.setFixedBounds(r4)
        L1d:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L20:
            jv0.m r4 = (jv0.m) r4
            kotlin.Unit r4 = com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher.b(r2, r4)
            return r4
        L27:
            jv0.m r4 = (jv0.m) r4
            com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher$a r0 = com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher.INSTANCE
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            boolean r4 = r2.isAttachedToWindow()
            if (r4 == 0) goto L44
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground r4 = r2.getCurrentBackground()
            boolean r0 = r4 instanceof com.revolut.core.ui_kit.models.NavBarWithContainerBackground.VideoBackground
            if (r0 == 0) goto L44
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground$VideoBackground r4 = (com.revolut.core.ui_kit.models.NavBarWithContainerBackground.VideoBackground) r4
            com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter r4 = r4.f57885c
            if (r4 != 0) goto L44
            r4 = 1
            goto L45
        L44:
            r4 = 0
        L45:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tx0.s4.invoke(java.lang.Object):java.lang.Object");
    }
}
