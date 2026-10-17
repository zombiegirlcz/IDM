package jji;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.camerakit.ui.views.view.TrackingFaceMaskView;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import tw0.j0;
import tw0.m1;
import uz.k0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f174960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f174961c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj2, int i, Object obj3, Object obj4) {
        this.f174959a = i;
        this.f174960b = obj2;
        this.f174961c = obj3;
        this.d = obj4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it8) {
        int i = this.f174959a;
        Object obj2 = this.f174961c;
        Object obj3 = this.d;
        Object obj4 = this.f174960b;
        switch (i) {
            case 0:
                e eVar = (e) obj4;
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj2;
                View view = (View) obj3;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (view != null && !eVar.f174962a && Intrinsics.f(view.getTag(), "FrontImageLoaded")) {
                    eVar.f174962a = true;
                    appCompatImageView.setImageBitmap(f.d((f) eVar.d, view));
                    break;
                }
                break;
            case 1:
                Float f = (Float) z9h.n.g(it8, "animation", "null cannot be cast to non-null type kotlin.Float");
                ks0.l.d((ks0.l) obj4, this.f174961c, null, f, f, 6);
                ((Function0) obj3).invoke();
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj4;
                qo0.i iVar = (qo0.i) obj2;
                WallpaperAssetSwitcher wallpaperAssetSwitcher = (WallpaperAssetSwitcher) obj3;
                float fFloatValue = ((Float) z9h.n.g(it8, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                arrayList.clear();
                if (fFloatValue <= iVar.f247979h) {
                    arrayList.addAll(iVar.a(wallpaperAssetSwitcher));
                }
                if (fFloatValue > BitmapDescriptorFactory.HUE_RED) {
                    arrayList.add(new qo0.e(fFloatValue, fFloatValue, 0, wallpaperAssetSwitcher.getHeight()));
                }
                w0.b(wallpaperAssetSwitcher, arrayList, iVar.f247975a);
                break;
            case 3:
                RecyclerView rv4 = (RecyclerView) obj2;
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj3;
                Intrinsics.checkNotNullParameter(it8, "update");
                m1 m1Var = ((j0) obj4).f274824a;
                Object animatedValue = it8.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue2 = ((Float) animatedValue).floatValue();
                Intrinsics.checkNotNullParameter(rv4, "rv");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                m1Var.f = fFloatValue2;
                m1.b(rv4, viewHolder, BitmapDescriptorFactory.HUE_RED + m1Var.d, fFloatValue2 + m1Var.e);
                break;
            case 4:
                TrackingFaceMaskView trackingFaceMaskView = (TrackingFaceMaskView) obj4;
                k0 k0Var = (k0) obj2;
                k0 k0Var2 = (k0) obj3;
                TrackingFaceMaskView.Companion aVar = TrackingFaceMaskView.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "animator");
                float animatedFraction = it8.getAnimatedFraction();
                k0 k0Var3 = trackingFaceMaskView.k;
                float f4 = k0Var.f284532a;
                k0Var3.f284532a = j6.a.a(k0Var2.f284532a, f4, animatedFraction, f4);
                float f5 = k0Var.f284533b;
                k0Var3.f284533b = j6.a.a(k0Var2.f284533b, f5, animatedFraction, f5);
                float f6 = k0Var.f284534c;
                k0Var3.f284534c = j6.a.a(k0Var2.f284534c, f6, animatedFraction, f6);
                float f32 = k0Var.d;
                k0Var3.d = j6.a.a(k0Var2.d, f32, animatedFraction, f32);
                trackingFaceMaskView.invalidate();
                break;
            default:
                int i2 = zxl.a.d;
                Intrinsics.checkNotNullParameter(it8, "animation");
                float animatedFraction2 = it8.getAnimatedFraction();
                ((yxl.a) obj4).a(animatedFraction2);
                ((rsl.p) obj2).invoke(Float.valueOf(((yxl.c) obj3).a(animatedFraction2)));
                break;
        }
    }
}
