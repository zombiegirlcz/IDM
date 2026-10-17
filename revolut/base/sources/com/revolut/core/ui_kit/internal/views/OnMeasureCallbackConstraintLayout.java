package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.i2;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0002\u000b\u0019B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/OnMeasureCallbackConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lms0/i2;", "f", "Lms0/i2;", "getOnMeasureCallback", "()Lms0/i2;", "setOnMeasureCallback", "(Lms0/i2;)V", "onMeasureCallback", "", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnMeasureCallbackConstraintLayout extends ConstraintLayout implements ny0.h {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ny0.k f56296b;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public i2 onMeasureCallback;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnMeasureCallbackConstraintLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF() {
        return false;
    }

    public final i2 getOnMeasureCallback() {
        return this.onMeasureCallback;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        do {
            this.f56296b.b(i);
            super.onMeasure(i, i2);
            i2 i2Var = this.onMeasureCallback;
            if (i2Var == null || !i2Var.b(this)) {
                return;
            } else {
                i3++;
            }
        } while (i3 != 5);
        RuntimeException runtimeException = new RuntimeException("onMeasureCallback should be called at most 5 times");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
    }

    public final void setOnMeasureCallback(i2 i2Var) {
        this.onMeasureCallback = i2Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnMeasureCallbackConstraintLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnMeasureCallbackConstraintLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ny0.k kVar = new ny0.k(this);
        this.f56296b = kVar;
        kVar.d(true);
    }

    public /* synthetic */ OnMeasureCallbackConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
