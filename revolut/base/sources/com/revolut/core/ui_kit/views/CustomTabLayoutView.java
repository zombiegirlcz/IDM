package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR(\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/revolut/core/ui_kit/views/CustomTabLayoutView;", "Lcom/google/android/material/tabs/TabLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "a", "Z", "isHandlingTouchUp", "()Z", "setHandlingTouchUp", "(Z)V", "isHandlingTouchUp$annotations", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomTabLayoutView extends TabLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f58494c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean isHandlingTouchUp;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final maa.r f58496b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomTabLayoutView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        if (ev10.getAction() != 1) {
            return super.dispatchTouchEvent(ev10);
        }
        maa.r rVar = this.f58496b;
        removeCallbacks(new a3l.c(9, rVar));
        this.isHandlingTouchUp = true;
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(ev10);
        post(new a3l.c(10, rVar));
        return zDispatchTouchEvent;
    }

    public final void setHandlingTouchUp(boolean z) {
        this.isHandlingTouchUp = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomTabLayoutView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLayoutView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58496b = new maa.r(this, 27);
    }

    public /* synthetic */ CustomTabLayoutView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
