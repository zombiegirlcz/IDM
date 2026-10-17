package com.revolut.core.ui_kit.internal.gallery_picker;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/gallery_picker/GalleryGridLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Companion", "qr0/a", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GalleryGridLayoutManager extends RecyclerView.LayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56042c;
    public final int d;
    public final int e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f56043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f56044h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f56045j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f56046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f56047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f56048n;
    public Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f56049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f56050q;

    public GalleryGridLayoutManager(Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56040a = 1;
        int iK = a.k(context, i);
        this.f56041b = iK;
        int iK2 = a.k(context, i2);
        this.f56042c = iK2;
        int iK3 = a.k(context, 32.0f);
        this.d = iK + iK3;
        int i3 = iK2 + iK3;
        this.e = i3;
        this.f = 1.0f;
        this.f56043g = 1.0f;
        this.f56050q = i3 / 2.0f;
    }

    public static int p(float f, int i) {
        int i2 = i / 4;
        int i3 = (int) ((i / 2.0f) - f);
        if (i3 < 0) {
            i3 = 0;
        }
        return Math.max(i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* JADX INFO: renamed from: canScrollHorizontally */
    public final boolean getF53278a() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final void m() {
        this.f56044h = f.g(this.f56044h, 0, this.f56045j);
        this.i = f.g(this.i, 0, this.k);
        float f = this.f56043g;
        float f4 = this.f;
        if (f == f4) {
            return;
        }
        this.f56043g = f4;
        requestLayout();
    }

    public final void n() {
        int width = (int) (getWidth() / this.f);
        int height = (int) (getHeight() / this.f);
        if (width == 0 || height == 0) {
            return;
        }
        this.f56046l = p(this.f56041b / 2.0f, width);
        this.f56047m = p(this.f56042c / 2.0f, height);
        int itemCount = getItemCount();
        int i = this.f56040a;
        int i2 = ((itemCount + i) - 1) / i;
        int i3 = i * this.d;
        float f = (i2 * this.e) + this.f56050q;
        float f4 = f + (this.f56047m * 2);
        int i5 = ((this.f56046l * 2) + i3) - width;
        if (i5 < 0) {
            i5 = 0;
        }
        this.f56045j = i5;
        int i6 = (int) (f4 - height);
        this.k = i6 >= 0 ? i6 : 0;
    }

    public final void o(RecyclerView.Recycler recycler) {
        float f;
        int i;
        int i2;
        int i3;
        int i5;
        int i6;
        int i21;
        GalleryGridLayoutManager galleryGridLayoutManager = this;
        RecyclerView.Recycler recycler2 = recycler;
        if (galleryGridLayoutManager.getItemCount() == 0) {
            return;
        }
        int i22 = galleryGridLayoutManager.d;
        int i32 = galleryGridLayoutManager.e;
        float fMax = Math.max(i22, i32) * 2.0f;
        float width = (((int) (galleryGridLayoutManager.getWidth() / galleryGridLayoutManager.f)) / 2.0f) + (galleryGridLayoutManager.f56044h - galleryGridLayoutManager.f56046l);
        float height = (((int) (galleryGridLayoutManager.getHeight() / galleryGridLayoutManager.f)) / 2.0f) + (galleryGridLayoutManager.i - galleryGridLayoutManager.f56047m);
        float width2 = ((int) (galleryGridLayoutManager.getWidth() / galleryGridLayoutManager.f56043g)) / 2.0f;
        float f4 = (width - width2) - fMax;
        float height2 = ((int) (galleryGridLayoutManager.getHeight() / galleryGridLayoutManager.f56043g)) / 2.0f;
        float f5 = (height - height2) - fMax;
        float f6 = width + width2 + fMax;
        float f32 = height + height2 + fMax;
        int childCount = galleryGridLayoutManager.getChildCount() - 1;
        while (true) {
            f = galleryGridLayoutManager.f56050q;
            if (-1 >= childCount) {
                break;
            }
            View childAt = galleryGridLayoutManager.getChildAt(childCount);
            if (childAt != null) {
                int position = galleryGridLayoutManager.getPosition(childAt);
                int i33 = galleryGridLayoutManager.f56040a;
                int i43 = position % i33;
                int i59 = position / i33;
                int i66 = i43 * i22;
                float f35 = (i59 * i32) + (i43 % 2 == 1 ? f : BitmapDescriptorFactory.HUE_RED);
                float f36 = i32 + f35;
                if (i66 + i22 < f4 || i66 > f6 || f36 < f5 || f35 > f32) {
                    galleryGridLayoutManager.removeAndRecycleViewAt(childCount, recycler2);
                }
            }
            childCount--;
        }
        int itemCount = galleryGridLayoutManager.getItemCount();
        int i74 = galleryGridLayoutManager.f56040a;
        int i92 = ((itemCount + i74) - 1) / i74;
        float f37 = i22;
        int iG = f.g((int) (f4 / f37), 0, i74 - 1);
        int iG2 = f.g((int) (f6 / f37), 0, galleryGridLayoutManager.f56040a - 1);
        float f41 = i32;
        int i96 = i92 - 1;
        int iG3 = f.g((int) ((f5 - f) / f41), 0, i96);
        int iG4 = f.g((int) (f32 / f41), 0, i96);
        if (iG3 > iG4) {
            return;
        }
        while (true) {
            if (iG <= iG2) {
                int i99 = iG;
                while (true) {
                    int i100 = (galleryGridLayoutManager.f56040a * iG3) + i99;
                    int i101 = i99;
                    if (i100 >= galleryGridLayoutManager.getItemCount()) {
                        break;
                    }
                    int i102 = i101 * i22;
                    i = iG;
                    i3 = i22;
                    float f42 = (iG3 * i32) + (i101 % 2 == 1 ? f : BitmapDescriptorFactory.HUE_RED);
                    float f57 = f42 + f41;
                    if (i102 + i3 < f4 || i102 > f6 || f57 < f5 || f42 > f32 || galleryGridLayoutManager.findViewByPosition(i100) != null) {
                        i5 = i32;
                        i21 = i101;
                        i6 = iG2;
                        i2 = iG3;
                    } else {
                        View viewForPosition = recycler2.getViewForPosition(i100);
                        Intrinsics.checkNotNullExpressionValue(viewForPosition, "getViewForPosition(...)");
                        galleryGridLayoutManager.addView(viewForPosition);
                        int i103 = galleryGridLayoutManager.f56041b;
                        int i104 = iG2;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i103, 1073741824);
                        int i105 = iG3;
                        int i106 = galleryGridLayoutManager.f56042c;
                        viewForPosition.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i106, 1073741824));
                        int i107 = (int) f42;
                        i5 = i32;
                        i21 = i101;
                        i6 = i104;
                        i2 = i105;
                        galleryGridLayoutManager.layoutDecorated(viewForPosition, i102, i107, i102 + i103, i106 + i107);
                    }
                    if (i21 == i6) {
                        break;
                    }
                    i99 = i21 + 1;
                    galleryGridLayoutManager = this;
                    iG3 = i2;
                    iG2 = i6;
                    i32 = i5;
                    iG = i;
                    i22 = i3;
                    recycler2 = recycler;
                }
                i = iG;
                i2 = iG3;
                i3 = i22;
                i5 = i32;
                i6 = iG2;
            } else {
                i = iG;
                i2 = iG3;
                i3 = i22;
                i5 = i32;
                i6 = iG2;
            }
            if (i2 == iG4) {
                return;
            }
            iG3 = i2 + 1;
            galleryGridLayoutManager = this;
            recycler2 = recycler;
            iG2 = i6;
            i32 = i5;
            iG = i;
            i22 = i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        n();
        if (this.f56048n) {
            this.f56044h = f.g(this.f56044h, 0, this.f56045j);
            this.i = f.g(this.i, 0, this.k);
        } else {
            this.f56044h = this.f56045j / 2;
            this.i = this.k / 2;
            this.f56048n = true;
        }
        Integer num = this.o;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue < 0 || iIntValue >= state.getItemCount()) {
                num = null;
            }
            if (num != null) {
                int iIntValue2 = num.intValue();
                this.f56044h = f.g((int) ((this.f56046l + ((this.f56041b / 2.0f) + ((iIntValue2 % this.f56040a) * this.d))) - (((int) (getWidth() / this.f)) / 2.0f)), 0, this.f56045j);
                this.i = f.g((int) ((this.f56047m + ((this.f56042c / 2.0f) + (((iIntValue2 / r0) * this.e) + ((iIntValue2 % this.f56040a) % 2 == 1 ? this.f56050q : BitmapDescriptorFactory.HUE_RED)))) - (((int) (getHeight() / this.f)) / 2.0f)), 0, this.k);
            }
        }
        this.o = null;
        detachAndScrapAttachedViews(recycler);
        o(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        int i2 = this.f56045j;
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f56044h;
        int iG = f.g(i + i3, 0, i2);
        this.f56044h = iG;
        int i5 = iG - i3;
        if (!this.f56049p && i5 != 0) {
            o(recycler);
        }
        return i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        this.o = Integer.valueOf(i);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        int i2 = this.k;
        if (i2 == 0) {
            if (this.f56049p) {
                o(recycler);
                this.f56049p = false;
            }
            return 0;
        }
        int i3 = this.i;
        int iG = f.g(i + i3, 0, i2);
        this.i = iG;
        int i5 = iG - i3;
        if (this.f56049p) {
            o(recycler);
            this.f56049p = false;
            return i5;
        }
        if (i5 != 0) {
            o(recycler);
        }
        return i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
