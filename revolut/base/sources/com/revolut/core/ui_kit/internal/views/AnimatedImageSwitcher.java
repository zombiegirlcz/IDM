package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/AnimatedImageSwitcher;", "Landroid/widget/ViewSwitcher;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "", "setImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnimatedImageSwitcher extends ViewSwitcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image[] f56091a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedImageSwitcher(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setImage(Image image) {
        int displayedChild = getDisplayedChild();
        Image[] imageArr = this.f56091a;
        if (Intrinsics.f(imageArr[displayedChild], image)) {
            return;
        }
        int i = (displayedChild + 1) % 2;
        View nextView = getNextView();
        Intrinsics.i(nextView, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        AppCompatImageView appCompatImageView = (AppCompatImageView) nextView;
        if (!Intrinsics.f(imageArr[i], image)) {
            imageArr[i] = image;
            yy0.f.e(u.k(this).Q(), image, appCompatImageView, null, null, 12);
        }
        setDisplayedChild(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedImageSwitcher(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56091a = new Image[2];
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(appCompatImageView);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
        appCompatImageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(appCompatImageView2);
    }
}
