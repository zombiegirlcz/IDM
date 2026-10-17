package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/views/QrCodePlainView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "withBackground", "", "setBackground", "(Z)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QrCodePlainView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f58847a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrCodePlainView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58847a = v0.a.d("create(...)");
        View.inflate(context, R$layout.internal_view_qr_code_plain, this);
        setOnClickListener(new c9(this, 2));
    }

    public final void setBackground(boolean withBackground) {
        if (withBackground) {
            setBackgroundResource(R$drawable.internal_qr_code_plain_background);
        } else {
            setBackground((Drawable) null);
        }
    }
}
