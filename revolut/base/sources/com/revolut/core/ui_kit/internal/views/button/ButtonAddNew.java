package com.revolut.core.ui_kit.internal.views.button;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import fw0.b;
import java.util.List;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/button/ButtonAddNew;", "Landroid/widget/FrameLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/view/View$OnClickListener;", "l", "", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lfw0/b;", "model", "setModel", "(Lfw0/b;)V", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ButtonAddNew extends FrameLayout implements TrackableItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallActionButton f56562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f56563b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonAddNew(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext */
    public Parcelable getD() {
        return this.f56562a.getD();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.f56562a.setAnalyticsContext(parcelable);
    }

    public final void setModel(@NotNull b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.f56563b, model)) {
            return;
        }
        this.f56563b = model;
        Clause clause = model.f138511a;
        SmallActionButton smallActionButton = this.f56562a;
        smallActionButton.setText(clause);
        smallActionButton.i(model.f138512b.a());
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l2) {
        this.f56562a.setOnClickListener(l2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonAddNew(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonAddNew(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public ButtonAddNew(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        SmallActionButton button = new SmallActionButton(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(button, "button");
        super(context, attributeSet, i);
        this.f56562a = button;
        addView(button, new ViewGroup.LayoutParams(-1, -1));
        button.setIcon(new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        button.setContentPadding(a.k(context, 8.0f));
        button.setForcedHeight$ui_kit_components_release(-1);
    }
}
