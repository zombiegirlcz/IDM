package com.revolut.ui_kit.carousel_with_sheet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen;
import com.revolut.core.ui_kit.views.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kye.e;
import org.jetbrains.annotations.NotNull;
import qxl.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/revolut/ui_kit/carousel_with_sheet/view/HorizontalScrollExpandableLayoutView;", "Lcom/revolut/core/ui_kit/views/j;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lqxl/a;", "c", "Lqxl/a;", "getOnHorizontalScrollCallback", "()Lqxl/a;", "setOnHorizontalScrollCallback", "(Lqxl/a;)V", "onHorizontalScrollCallback", "ui_kit_carousel_with_sheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HorizontalScrollExpandableLayoutView extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a onHorizontalScrollCallback;
    public boolean d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f107111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f107112h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f107113j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalScrollExpandableLayoutView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final a getOnHorizontalScrollCallback() {
        return this.onHorizontalScrollCallback;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        int action = ev10.getAction();
        if (action == 0) {
            this.f107113j = false;
            this.e = ev10.getX();
            this.f = ev10.getX();
            this.f107111g = ev10.getRawY();
            this.f107112h = BitmapDescriptorFactory.HUE_RED;
            this.d = false;
            return super.onInterceptTouchEvent(ev10);
        }
        if (action != 2) {
            if (action == 3) {
                this.f107113j = false;
            }
        } else {
            if (this.f107113j) {
                return super.onInterceptTouchEvent(ev10);
            }
            this.f107112h = Math.max(this.f107112h, Math.abs(ev10.getRawY() - this.f107111g));
            if (!this.d && Math.abs(ev10.getX() - this.e) > this.i && Math.abs(ev10.getX() - this.e) > this.f107112h) {
                this.d = true;
                a aVar = this.onHorizontalScrollCallback;
                if (aVar != null) {
                    ((CarouselWithBottomSheetScreen) ((e) aVar).f190729b).j3();
                }
                a aVar2 = this.onHorizontalScrollCallback;
                if (aVar2 != null) {
                    ((CarouselWithBottomSheetScreen) ((e) aVar2).f190729b).i3(ev10.getX() - this.f);
                }
                this.f = ev10.getX();
                return true;
            }
            this.f = ev10.getX();
        }
        return super.onInterceptTouchEvent(ev10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev10) {
        a aVar;
        a aVar2;
        Intrinsics.checkNotNullParameter(ev10, "ev");
        if (!this.d || this.f107113j) {
            return super.onTouchEvent(ev10);
        }
        int action = ev10.getAction();
        if (action != 0) {
            if (action == 2) {
                if (this.d && (aVar = this.onHorizontalScrollCallback) != null) {
                    ((CarouselWithBottomSheetScreen) ((e) aVar).f190729b).i3(ev10.getX() - this.f);
                }
                this.f = ev10.getX();
            } else if (this.d && (aVar2 = this.onHorizontalScrollCallback) != null) {
                ((CarouselWithBottomSheetScreen) ((e) aVar2).f190729b).e3();
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.f107113j = z;
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setOnHorizontalScrollCallback(a aVar) {
        this.onHorizontalScrollCallback = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalScrollExpandableLayoutView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalScrollExpandableLayoutView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.i = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
    }

    public /* synthetic */ HorizontalScrollExpandableLayoutView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
