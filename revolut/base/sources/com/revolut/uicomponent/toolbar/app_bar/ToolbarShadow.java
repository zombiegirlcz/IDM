package com.revolut.uicomponent.toolbar.app_bar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.uicomponent.R$drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarShadow;", "Landroid/widget/FrameLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$AttachedBehavior;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarShadowBehavior;", "getBehavior", "()Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarShadowBehavior;", "", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "shadowBehaviour", "Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarShadowBehavior;", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class ToolbarShadow extends FrameLayout implements CoordinatorLayout.AttachedBehavior, ny0.h {
    private final boolean fitsReadableArea;

    @NotNull
    private final ToolbarShadowBehavior shadowBehaviour;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ToolbarShadow(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return this.fitsReadableArea;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarShadow(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.shadowBehaviour = new ToolbarShadowBehavior(context, null);
        setAlpha(BitmapDescriptorFactory.HUE_RED);
        setBackground(ContextCompat.getDrawable(context, R$drawable.shadow_toolbar_white));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NotNull
    /* JADX INFO: renamed from: getBehavior, reason: from getter */
    public ToolbarShadowBehavior getShadowBehaviour() {
        return this.shadowBehaviour;
    }

    public /* synthetic */ ToolbarShadow(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
