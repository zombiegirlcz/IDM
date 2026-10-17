package com.revolut.uicomponent.toolbar.app_bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewGroupKt;
import com.rd.PageIndicatorView;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.R$style;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import w01.k;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0014J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/revolut/uicomponent/toolbar/app_bar/StepIndicatorRevolutToolbar;", "Lcom/revolut/uicomponent/toolbar/app_bar/CustomViewRevolutToolbar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pageIndicatorView", "Lcom/rd/PageIndicatorView;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setIndicatorVisible", "enabled", "", "setIndicatorStepTo", "position", "setStepsCount", "count", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class StepIndicatorRevolutToolbar extends CustomViewRevolutToolbar {

    @NotNull
    private final PageIndicatorView pageIndicatorView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepIndicatorRevolutToolbar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.CustomViewRevolutToolbar, androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Object next;
        int measuredWidth = 0;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        View customView = getCustomView();
        if (customView == null) {
            return;
        }
        List listJ = y.J(ViewGroupKt.getChildren(this));
        Iterator it8 = listJ.iterator();
        while (true) {
            if (it8.hasNext()) {
                next = it8.next();
                if (((View) next) instanceof ImageButton) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        View view = (View) next;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listJ) {
            if (obj2 instanceof ActionMenuView) {
                arrayList.add(obj2);
            }
        }
        int measuredWidth2 = view != null ? view.getMeasuredWidth() : 0;
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            measuredWidth += ((ActionMenuView) it9.next()).getMeasuredWidth();
        }
        int iAbs = Math.abs(measuredWidth2 - measuredWidth);
        Pair pair = measuredWidth >= measuredWidth2 ? new Pair(Integer.valueOf(iAbs), 0) : new Pair(0, Integer.valueOf(iAbs));
        int iIntValue = ((Number) pair.f186385a).intValue();
        int iIntValue2 = ((Number) pair.f186386b).intValue();
        ViewGroup.LayoutParams layoutParams = customView.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = iIntValue;
        marginLayoutParams.rightMargin = iIntValue2;
        customView.setLayoutParams(marginLayoutParams);
    }

    public final void setIndicatorStepTo(int position) {
        this.pageIndicatorView.setSelection(position);
    }

    public final void setIndicatorVisible(boolean enabled) {
        View customView = getCustomView();
        if (customView != null) {
            k.e(customView, enabled);
        }
        k.e(this.pageIndicatorView, enabled);
    }

    public final void setStepsCount(int count) {
        this.pageIndicatorView.setCount(count);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepIndicatorRevolutToolbar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepIndicatorRevolutToolbar(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setCustomView(R$layout.toolbar_indicator_view);
        View viewFindViewById = findViewById(R$id.page_indicator);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.pageIndicatorView = (PageIndicatorView) viewFindViewById;
        setTitleTextAppearance(context, R$style.MainTitleBold);
    }

    public /* synthetic */ StepIndicatorRevolutToolbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
