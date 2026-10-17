package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.ra0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class oe extends koi.b implements xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AvatarView f54558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f54559h;
    public final AppCompatTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f54560j;
    public final ty0.c k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(FrameLayout itemView, AvatarView avatarView, AppCompatTextView titleTextView, AppCompatTextView notificationTextView, AppCompatTextView subtitleTextView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(avatarView, "avatarView");
        Intrinsics.checkNotNullParameter(titleTextView, "titleTextView");
        Intrinsics.checkNotNullParameter(notificationTextView, "notificationTextView");
        Intrinsics.checkNotNullParameter(subtitleTextView, "subtitleTextView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = new xv0.n(new ra0(avatarView, 0));
        this.f54558g = avatarView;
        this.f54559h = titleTextView;
        this.i = notificationTextView;
        this.f54560j = subtitleTextView;
        this.k = or0.u.k(itemView).b0();
    }

    public final void F(RewardDelegate.c notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        boolean z = notification instanceof RewardDelegate.c.a;
        AppCompatTextView appCompatTextView = this.i;
        if (z) {
            appCompatTextView.setVisibility(8);
        } else {
            if (!(notification instanceof ne)) {
                throw new NoWhenBranchMatchedException();
            }
            appCompatTextView.setVisibility(0);
            ty0.c.b(this.k, ((ne) notification).f54509a, appCompatTextView, null, null, 12);
        }
    }

    @Override // xv0.m
    public final void f(Image image, ImageView to6, Function1 function1, Function0 function0, boolean z) {
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f.f(image, to6, function1, null, z);
    }

    @Override // xv0.m
    public final xv0.i getItemRenderState() {
        return this.f.f309159b;
    }

    @Override // xv0.m
    public final View getRenderView() {
        return this.f.getRenderView();
    }

    @Override // xv0.m
    public final void setItemRenderState(xv0.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        xv0.n nVar = this.f;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        nVar.f309159b = iVar;
    }
}
