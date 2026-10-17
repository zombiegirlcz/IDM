package com.revolut.ui_kit.card_scene;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import ixl.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revolut/ui_kit/card_scene/CardDesignProxyCarouselView;", "Landroid/widget/FrameLayout;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage;", "backgroundAnimation", "", "setLottieBackground", "(Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage;)V", "", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "ui_kit_card_scene_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDesignProxyCarouselView extends FrameLayout implements h {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f107095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FrameLayout f107096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f107097c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDesignProxyCarouselView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f107097c = q.b(0, 6, null);
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF51506a() {
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        a aVar;
        super.onSizeChanged(i, i2, i3, i5);
        if (i2 <= 0 || (aVar = this.f107095a) == null) {
            return;
        }
        aVar.c(i2);
    }

    public final void setLottieBackground(@NotNull LottieImage backgroundAnimation) {
        Intrinsics.checkNotNullParameter(backgroundAnimation, "backgroundAnimation");
        a aVar = this.f107095a;
        if (aVar != null) {
            aVar.setLottieBackground(backgroundAnimation);
        }
    }
}
