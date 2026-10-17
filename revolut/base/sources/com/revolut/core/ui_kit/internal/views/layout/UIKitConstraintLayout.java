package com.revolut.core.ui_kit.internal.views.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.d0;
import com.revolut.core.ui_kit.R$styleable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import ny0.k;
import org.jetbrains.annotations.NotNull;
import ut0.a;
import ut0.b;
import ut0.d;
import ut0.e;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0001\fB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/layout/UIKitConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lut0/b;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lut0/e;", "config", "", "setAspectRatioConfig", "(Lut0/e;)V", "", "value", "setReadableAreaGuidelinesEnabled", "(Z)V", "setFitsReadableArea", "getFitsReadableArea", "()Z", "fitsReadableArea", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class UIKitConstraintLayout extends ConstraintLayout implements b, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f57230b;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f57231g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UIKitConstraintLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return this.f57230b;
    }

    @Override // ut0.b
    public final void j(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.f.b(i);
        e eVar = this.f57231g;
        if (eVar == null) {
            super.onMeasure(i, i2);
        } else {
            d0 d0Var = eVar.f283014a;
            d.a(this, i, i2, d0Var.f10274a / d0Var.f10275b, eVar.f283015b, getMaxWidth(), getMaxHeight());
        }
    }

    public final void setAspectRatioConfig(e config) {
        if (Intrinsics.f(this.f57231g, config)) {
            return;
        }
        this.f57231g = config;
        requestLayout();
    }

    public void setFitsReadableArea(boolean value) {
        if (this.f57230b == value) {
            return;
        }
        this.f57230b = value;
        requestLayout();
    }

    public void setReadableAreaGuidelinesEnabled(boolean value) {
        this.f.d(value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UIKitConstraintLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIKitConstraintLayout(@NotNull Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f = new k(this);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.uikit_AspectRatioConstraintLayout, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.uikit_AspectRatioConstraintLayout_uikit_ratio);
        d0 d0Var = null;
        if (string != null) {
            List listN0 = kotlin.text.d0.n0(string, new String[]{":"}, 0, 6);
            if (listN0.size() > 1) {
                try {
                    try {
                        int i2 = Integer.parseInt((String) listN0.get(0));
                        int i3 = Integer.parseInt((String) listN0.get(1));
                        Integer numValueOf = Integer.valueOf(i3);
                        if (i3 == 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            d0Var = new d0(i2, numValueOf.intValue());
                        } else {
                            throw new IllegalArgumentException("Denominator cannot be zero in aspect ratio.");
                        }
                    } catch (NumberFormatException unused) {
                        m.Companion companion = m.INSTANCE;
                        throw new IllegalArgumentException("Wrong ratio format! Is " + string + ", but should be [width]:[height]");
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    Throwable thA = m.a(o.a(th10));
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                }
            }
        }
        if (d0Var != null) {
            this.f57231g = new e(d0Var, (a) a.a().get(typedArrayObtainStyledAttributes.getInt(R$styleable.uikit_AspectRatioConstraintLayout_uikit_strategy, a.ADJUST_WIDTH.ordinal())));
        }
        Unit unit = Unit.f186387a;
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ UIKitConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
