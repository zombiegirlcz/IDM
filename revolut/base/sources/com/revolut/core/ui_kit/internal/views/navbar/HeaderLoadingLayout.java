package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/HeaderLoadingLayout;", "Lcom/revolut/core/ui_kit/internal/views/framelayout/UIKitFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "au0/k0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HeaderLoadingLayout extends UIKitFrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShimmerFrameLayout f57261h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AppCompatImageView f57262j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderLoadingLayout(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderLoadingLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_header_loading, this);
        setPaddingRelative(kli.a.k(context, 8.0f), 0, kli.a.k(context, 8.0f), 0);
        setReadableAreaGuidelinesEnabled(true);
        this.f57261h = (ShimmerFrameLayout) findViewById(R$id.headerLayout_shimmeringView);
        this.i = findViewById(R$id.headerLoading_description);
        this.f57262j = (AppCompatImageView) findViewById(R$id.headerLoading_profileAvatar);
    }
}
