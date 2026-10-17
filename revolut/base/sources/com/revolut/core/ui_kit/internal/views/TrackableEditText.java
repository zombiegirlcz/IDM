package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import au0.m4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.j5;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/TrackableEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Lgx0/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnFocusChangeListener;", "l", "", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "getOnFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrackableEditText extends AppCompatEditText implements gx0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View.OnFocusChangeListener f56468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f56469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackableEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        addTextChangedListener(new j5(this, 0));
        super.setOnFocusChangeListener(new m4(this, 7));
    }

    public static void d(TrackableEditText trackableEditText, View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = trackableEditText.f56468a;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        if (!z) {
            trackableEditText.e();
        } else {
            trackableEditText.f56470c = false;
            trackableEditText.f56469b = null;
        }
    }

    public final void e() {
        String string;
        if (this.f56470c) {
            return;
        }
        CharSequence text = getText();
        if (text == null) {
            text = "";
        }
        if (text.length() != 0 || (string = this.f56469b) == null) {
            string = text.toString();
        }
        u.k(this).n0().e(this, string);
        this.f56470c = true;
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.f56468a;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener l2) {
        this.f56468a = l2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackableEditText(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        addTextChangedListener(new j5(this, 1));
        super.setOnFocusChangeListener(new m4(this, 7));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackableEditText(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        addTextChangedListener(new j5(this, 2));
        super.setOnFocusChangeListener(new m4(this, 7));
    }
}
