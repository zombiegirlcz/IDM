package tx0;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.PhotoHeaderView;
import com.revolut.core.ui_kit.views.navbar.ScrollerNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class o1 implements kfm.g, NestedScrollView.OnScrollChangeListener, OnApplyWindowInsetsListener, kfm.o, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f275216b;

    public /* synthetic */ o1(Object obj2, int i) {
        this.f275215a = i;
        this.f275216b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f275215a;
        Object obj3 = this.f275216b;
        switch (i) {
            case 0:
                NavBarLargeCentred.Companion companion = NavBarLargeCentred.INSTANCE;
                ((n1) obj3).invoke(obj2);
                break;
            case 1:
                NavBarLargeCentred.Companion companion2 = NavBarLargeCentred.INSTANCE;
                ((n1) obj3).invoke(obj2);
                break;
            case 2:
                NavBarLargeCentred.Companion companion3 = NavBarLargeCentred.INSTANCE;
                ((n1) obj3).invoke(obj2);
                break;
            case 3:
                NavBarLargeCentred.Companion companion4 = NavBarLargeCentred.INSTANCE;
                ((n1) obj3).invoke(obj2);
                break;
            case 4:
                NavBarLargeCentred.Companion companion5 = NavBarLargeCentred.INSTANCE;
                ((n1) obj3).invoke(obj2);
                break;
            case 5:
            case 8:
            default:
                WallpaperAssetSwitcher.Companion companion6 = WallpaperAssetSwitcher.INSTANCE;
                ((s4) obj3).invoke(obj2);
                break;
            case 6:
                int i2 = NavBarWithBigTile.f0;
                ((m2) obj3).invoke(obj2);
                break;
            case 7:
                int i3 = NavBarWithBigTile.f0;
                ((m2) obj3).invoke(obj2);
                break;
            case 9:
                NavBarWithToolbar.Companion companion7 = NavBarWithToolbar.INSTANCE;
                ((k3) obj3).invoke(obj2);
                break;
            case 10:
                NavBarWithToolbar.Companion companion8 = NavBarWithToolbar.INSTANCE;
                ((k3) obj3).invoke(obj2);
                break;
            case 11:
                NavBarWithToolbar.Companion companion9 = NavBarWithToolbar.INSTANCE;
                ((k3) obj3).invoke(obj2);
                break;
            case 12:
                ((su0.c) obj3).invoke(obj2);
                break;
            case 13:
                ObjectCarouselNavBarContentView.Companion aVar = ObjectCarouselNavBarContentView.INSTANCE;
                ((tpl.o) obj3).invoke(obj2);
                break;
            case 14:
                int i5 = PhotoHeaderView.U;
                ((c4) obj3).invoke(obj2);
                break;
            case 15:
                int i6 = PhotoHeaderView.U;
                ((c4) obj3).invoke(obj2);
                break;
            case 16:
                int i21 = PhotoHeaderView.U;
                ((c4) obj3).invoke(obj2);
                break;
            case 17:
                ScrollerNavBarContentView.Companion aVar2 = ScrollerNavBarContentView.INSTANCE;
                ((g4) obj3).invoke(obj2);
                break;
            case 18:
                ((twg.a) obj3).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f275215a;
        Object obj2 = this.f275216b;
        switch (i) {
            case 19:
                WallpaperAssetSwitcher.Companion companion = WallpaperAssetSwitcher.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
            case 21:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (Boolean) ((ty1.a) obj2).invoke(p0);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        NavBarWithContainerHeaderView navBarWithContainerHeaderView = (NavBarWithContainerHeaderView) this.f275216b;
        NavBarWithContainerHeaderView.Companion companion = NavBarWithContainerHeaderView.INSTANCE;
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        navBarWithContainerHeaderView.N = insets.getInsets(WindowInsetsCompat.Type.systemBars()).top;
        navBarWithContainerHeaderView.m();
        return insets;
    }

    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i5) {
        e4 e4Var = (e4) this.f275216b;
        Intrinsics.checkNotNullParameter(nestedScrollView, "<unused var>");
        e4Var.d(i2);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        s4 s4Var = (s4) this.f275216b;
        WallpaperAssetSwitcher.Companion companion = WallpaperAssetSwitcher.INSTANCE;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) s4Var.invoke(p0)).booleanValue();
    }
}
