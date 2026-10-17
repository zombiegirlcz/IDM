package com.revolut.core.ui_kit.delegates.widgets;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.widgets.TilePaginatedGridWidgetDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.recyclerkit.UIKitRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class o4 {

    @NotNull
    public static final op0.s4 Companion = new op0.s4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIKitRecyclerView f55453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f55454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f55455c;
    public final bs0.c d;
    public final ok7.c e;
    public final Handler f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f55456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f55457h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o6.a f55458j;
    public final n4 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final op0.t4 f55459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile TilePaginatedGridWidgetDelegate.Model f55460m;

    public o4(UIKitRecyclerView recyclerView, View itemView, RecyclerView recyclerView2, bs0.c snapHelper, ok7.c onHintPlayed) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(snapHelper, "snapHelper");
        Intrinsics.checkNotNullParameter(onHintPlayed, "onHintPlayed");
        this.f55453a = recyclerView;
        this.f55454b = itemView;
        this.f55455c = recyclerView2;
        this.d = snapHelper;
        this.e = onHintPlayed;
        this.f = new Handler(Looper.getMainLooper());
        this.f55456g = new Rect();
        this.i = true;
        this.f55458j = new o6.a(this, 2);
        this.k = new n4(this);
        this.f55459l = new op0.t4(this);
    }

    public final void a(TilePaginatedGridWidgetDelegate.Model model) {
        if (model != null) {
            AnimationRequest animationRequest = model.i;
            if (this.f55457h) {
                return;
            }
            Intrinsics.checkNotNullParameter(model, "model");
            if (animationRequest == null || animationRequest.f57724a || model.d.size() <= 6) {
                return;
            }
            View view = this.f55454b;
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                return;
            }
            if (view.getGlobalVisibleRect(this.f55456g)) {
                float fWidth = r3.width() / view.getWidth();
                float fHeight = r3.height() / view.getHeight();
                if (fWidth < 0.8f || fHeight < 0.8f) {
                    return;
                }
                RecyclerView recyclerView = this.f55455c;
                if (recyclerView == null || recyclerView.getScrollState() == 0) {
                    int width = view.getWidth();
                    if (width > 0) {
                        if (this.i) {
                            this.d.attachToRecyclerView(null);
                            this.i = false;
                        }
                        UIKitRecyclerView uIKitRecyclerView = this.f55453a;
                        int i = width / 6;
                        if (uIKitRecyclerView.getLayoutDirection() == 1) {
                            i = -i;
                        }
                        uIKitRecyclerView.smoothScrollBy(i, 0);
                    }
                    animationRequest.f57724a = true;
                    this.e.invoke(model);
                }
            }
        }
    }
}
