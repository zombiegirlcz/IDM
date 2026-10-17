package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/views/InnerScrollView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InnerScrollView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f58655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f58656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f58657c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerScrollView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(ev10);
        boolean zCanScrollVertically = canScrollVertically(1);
        boolean zCanScrollVertically2 = canScrollVertically(-1);
        if (!zCanScrollVertically && !zCanScrollVertically2) {
            return zDispatchTouchEvent;
        }
        int action = ev10.getAction();
        if (action == 0) {
            this.f58655a = ev10.getY();
            this.f58656b = ev10.getX();
            this.f58657c = false;
            return true;
        }
        if (action != 2) {
            return false;
        }
        if (this.f58655a != BitmapDescriptorFactory.HUE_RED) {
            float y2 = ev10.getY() - this.f58655a;
            float x3 = ev10.getX() - this.f58656b;
            if (y2 == BitmapDescriptorFactory.HUE_RED && x3 == BitmapDescriptorFactory.HUE_RED) {
                return true;
            }
            if ((y2 < BitmapDescriptorFactory.HUE_RED && zCanScrollVertically) || (y2 > BitmapDescriptorFactory.HUE_RED && zCanScrollVertically2)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f58657c = true;
            }
        }
        this.f58655a = BitmapDescriptorFactory.HUE_RED;
        return this.f58657c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerScrollView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerScrollView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
