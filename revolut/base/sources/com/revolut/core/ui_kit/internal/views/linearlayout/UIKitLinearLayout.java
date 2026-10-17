package com.revolut.core.ui_kit.internal.views.linearlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import cr0.l;
import iv0.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import ny0.k;
import org.jetbrains.annotations.NotNull;
import yt0.a;
import yt0.j;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00022\u00020\u0002:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/linearlayout/UIKitLinearLayout;", "Landroid/widget/LinearLayout;", "", "Liv0/m;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "", "setReadableAreaGuidelinesEnabled", "(Z)V", "setFitsReadableArea", "getFitsReadableArea", "()Z", "fitsReadableArea", "yt0/a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class UIKitLinearLayout extends LinearLayout implements m, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f57232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f57233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f57234c;
    public List d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UIKitLinearLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // iv0.m
    public final void a() {
        List list = this.f57234c;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                j jVar = ((a) list.get(i)).f316516a;
                Intrinsics.checkNotNullParameter(this, "it");
                jVar.e();
            }
        }
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return this.f57232a;
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        a();
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                l lVar = (l) list.get(i2);
                lVar.getClass();
                Intrinsics.checkNotNullParameter(this, "view");
                if (lVar.e) {
                    return;
                }
                cr0.k kVar = lVar.d;
                if (kVar != null && kVar.b()) {
                    return;
                }
            }
        }
        super.offsetTopAndBottom(i);
        a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        a();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f57233b.b(i);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        a();
    }

    public void setFitsReadableArea(boolean value) {
        if (this.f57232a == value) {
            return;
        }
        this.f57232a = value;
        requestLayout();
    }

    public void setReadableAreaGuidelinesEnabled(boolean value) {
        this.f57233b.d(value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UIKitLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIKitLinearLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57233b = new k(this);
    }

    public /* synthetic */ UIKitLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
