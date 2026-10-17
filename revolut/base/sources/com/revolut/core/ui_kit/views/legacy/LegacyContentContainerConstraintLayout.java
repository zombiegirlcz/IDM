package com.revolut.core.ui_kit.views.legacy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import ix0.c2;
import ix0.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import ny0.k;
import org.jetbrains.annotations.NotNull;
import sr0.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/revolut/core/ui_kit/views/legacy/LegacyContentContainerConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lny0/h;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "getFitNavigationBar", "fitNavigationBar", "getInsetsAdjustable", "insetsAdjustable", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LegacyContentContainerConstraintLayout extends ConstraintLayout implements h, w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f59137b;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f59138g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyContentContainerConstraintLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public boolean getFitNavigationBar() {
        return this.f59137b.f265101a;
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return false;
    }

    @Override // ix0.w0, ix0.v0
    public boolean getInsetsAdjustable() {
        return this.f59137b.getInsetsAdjustable();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return super.onApplyWindowInsets(this.f59138g.d(insets, getFitNavigationBar()));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f.b(i);
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyContentContainerConstraintLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyContentContainerConstraintLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59137b = new a(context, attributeSet);
        k kVar = new k(this);
        this.f = kVar;
        this.f59138g = new c2(this);
        kVar.d(true);
    }

    public /* synthetic */ LegacyContentContainerConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
