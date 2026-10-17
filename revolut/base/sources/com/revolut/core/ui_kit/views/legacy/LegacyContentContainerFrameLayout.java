package com.revolut.core.ui_kit.views.legacy;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import aw0.s8;
import aw0.x8;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import foh.i;
import ix0.c2;
import ix0.s0;
import ix0.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import ny0.k;
import org.jetbrains.annotations.NotNull;
import sr0.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/revolut/core/ui_kit/views/legacy/LegacyContentContainerFrameLayout;", "Landroid/widget/FrameLayout;", "Lny0/h;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "getFitNavigationBar", "fitNavigationBar", "getInsetsAdjustable", "insetsAdjustable", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LegacyContentContainerFrameLayout extends FrameLayout implements h, w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f59142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f59143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f59144c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyContentContainerFrameLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(int i, BasicNavBar colorsReceiver) {
        Intrinsics.checkNotNullParameter(colorsReceiver, "colorsReceiver");
        setBackgroundColor(i);
        ColorDrawable colorDrawable = new ColorDrawable(i);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        x8 x8VarD = s0.d(colorDrawable, context, s8.DEFAULT);
        i.e(colorsReceiver, x8VarD.f10609a, x8VarD.f10610b, x8VarD.f10611c, x8VarD.e);
    }

    public boolean getFitNavigationBar() {
        return this.f59142a.f265101a;
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF51506a() {
        return false;
    }

    @Override // ix0.w0, ix0.v0
    public boolean getInsetsAdjustable() {
        return this.f59142a.getInsetsAdjustable();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return super.onApplyWindowInsets(this.f59144c.d(insets, getFitNavigationBar()));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f59143b.b(i);
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyContentContainerFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyContentContainerFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59142a = new a(context, attributeSet);
        k kVar = new k(this);
        this.f59143b = kVar;
        this.f59144c = new c2(this);
        kVar.d(true);
    }

    public /* synthetic */ LegacyContentContainerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
