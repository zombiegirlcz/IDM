package ip0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.internal.views.navbar.preview.WallpaperPreviewView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bo extends koi.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f163639m = 0;
    public final wn f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitConstraintLayout f163640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WallpaperPreviewView f163641h;
    public final MaterialShapeDrawable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final au0.q4 f163642j;
    public up0.l0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xr0.i f163643l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(View itemView, wn innerViewHolder) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(innerViewHolder, "innerViewHolder");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = innerViewHolder;
        View viewFindViewById = itemView.findViewById(R$id.homeScreenPreview_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        UIKitConstraintLayout uIKitConstraintLayout = (UIKitConstraintLayout) viewFindViewById;
        this.f163640g = uIKitConstraintLayout;
        View viewFindViewById2 = itemView.findViewById(R$id.homeScreenPreview_wallpaper);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        WallpaperPreviewView wallpaperPreviewView = (WallpaperPreviewView) viewFindViewById2;
        this.f163641h = wallpaperPreviewView;
        this.i = new MaterialShapeDrawable();
        this.f163642j = new au0.q4(this, 3);
        this.f163643l = new xr0.i(itemView, new zn(this, 0), new zn(this, 1), null);
        uIKitConstraintLayout.addView(innerViewHolder.itemView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(uIKitConstraintLayout);
        constraintSet.connect(innerViewHolder.itemView.getId(), 3, itemView.getId(), 3);
        constraintSet.connect(innerViewHolder.itemView.getId(), 4, itemView.getId(), 4);
        constraintSet.connect(innerViewHolder.itemView.getId(), 6, itemView.getId(), 6);
        constraintSet.connect(innerViewHolder.itemView.getId(), 7, itemView.getId(), 7);
        constraintSet.applyTo(uIKitConstraintLayout);
        wallpaperPreviewView.wallpaperAssetSwitcher.h().subscribe(new qh(29, new zn(this, 2)));
        wallpaperPreviewView.f57425h.subscribe(new ao(0, new zn(this, 3)));
    }
}
