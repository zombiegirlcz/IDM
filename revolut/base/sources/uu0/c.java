package uu0;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ihm.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sii.a f283128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f283129b;

    public c(sii.a itemCountAccessor) {
        Intrinsics.checkNotNullParameter(itemCountAccessor, "itemCountAccessor");
        this.f283128a = itemCountAccessor;
        this.f283129b = v0.a.d("create(...)");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        int iIntValue = ((Number) this.f283128a.invoke()).intValue();
        this.f283129b.onNext(Float.valueOf(kotlin.ranges.f.f(iIntValue > 0 ? (((i + 1) + f) / iIntValue) * 100 : 0.0f, BitmapDescriptorFactory.HUE_RED, 100.0f)));
    }
}
