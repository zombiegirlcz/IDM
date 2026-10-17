package com.revolut.uicomponent.toolbar.app_bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.toolbar.ToolbarProgressView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w01.k;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/revolut/uicomponent/toolbar/app_bar/ProgressViewRevolutToolbar;", "Lcom/revolut/uicomponent/toolbar/app_bar/CustomViewRevolutToolbar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "progressView", "Lcom/revolut/uicomponent/toolbar/ToolbarProgressView;", "setProgress", "", "progress", "max", "setProgressVisibility", "visible", "", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class ProgressViewRevolutToolbar extends CustomViewRevolutToolbar {

    @NotNull
    private final ToolbarProgressView progressView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressViewRevolutToolbar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setProgress(int progress, int max) {
        ToolbarProgressView toolbarProgressView = this.progressView;
        if (max <= 0) {
            toolbarProgressView.f107286a.setProgress(0);
        } else {
            toolbarProgressView.f107286a.setMax(max);
            toolbarProgressView.f107286a.setProgress(progress, true);
        }
    }

    public final void setProgressVisibility(boolean visible) {
        k.e(this.progressView, visible);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressViewRevolutToolbar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressViewRevolutToolbar(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setCustomView(R$layout.toolbar_progress_view);
        View viewFindViewById = findViewById(R$id.toolbar_progress_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.progressView = (ToolbarProgressView) viewFindViewById;
    }

    public /* synthetic */ ProgressViewRevolutToolbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
