package au0;

import aw0.x8;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h1 extends koi.b implements kfm.g {
    public final WallpaperView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x8 f9217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ HeaderWithBigTileLayout f9218h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(HeaderWithBigTileLayout headerWithBigTileLayout, WallpaperView itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "backgroundView");
        this.f9218h = headerWithBigTileLayout;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
        itemView.f57381b.h().subscribe(this);
    }

    @Override // kfm.g
    public final void accept(Object obj2) {
        this.f9217g = (x8) obj2;
        int i = HeaderWithBigTileLayout.f57263w0;
        this.f9218h.l0();
    }
}
