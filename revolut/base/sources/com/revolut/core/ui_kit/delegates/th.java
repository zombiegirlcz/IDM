package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.SummaryCardDelegate;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class th extends koi.b {
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AvatarView f54785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f54786h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f54787j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f54788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f54789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f54790n;
    public final ImageView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.summaryCard_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.summaryCard_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        AvatarView avatarView = (AvatarView) viewFindViewById2;
        this.f54785g = avatarView;
        View viewFindViewById3 = itemView.findViewById(R$id.summaryCard_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54786h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.summaryCard_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.summaryCard_primaryLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f54787j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.summaryCard_primaryValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.summaryCard_primaryValueInfoIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f54788l = (ImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.summaryCard_secondaryLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f54789m = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.summaryCard_secondaryValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f54790n = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.summaryCard_secondaryValueInfoIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = (ImageView) viewFindViewById10;
        avatarView.setDefaultAvatarStyle$ui_kit_components_release(mx0.i1.SIZE_80_80);
        View viewFindViewById11 = avatarView.findViewById(R$id.uikit_imageWithAnimatedBackgroundView_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        SummaryCardDelegate.Companion.getClass();
        rd0.e.r((ImageView) viewFindViewById11, SummaryCardDelegate.d);
    }

    public static void H(SummaryCardDelegate.Model model, ph phVar, rh rhVar, ImageView imageView, uh uhVar) {
        Image image = phVar.f54612c;
        py0.b bVar = image != null ? new py0.b(image) : null;
        boolean z = image != null;
        or0.m.a(imageView);
        if (z) {
            imageView.setOnClickListener(new ip0.d6(model, bVar, uhVar, model, rhVar, 9));
        } else {
            or0.u.o(imageView);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void F(ph phVar, TextView textView, TextView textView2, ImageView imageView) {
        kli.a.b(textView, phVar.f54610a, ty0.f.f275450a);
        kli.a.b(textView2, phVar.f54611b, ty0.f.f275450a);
        Image image = phVar.f54612c;
        zi0.c.g(imageView, image);
        pd.b.p(imageView, image != null ? image.getD() : null);
        boolean z = image != null;
        pd.b.h(imageView, z);
        if (!z) {
            or0.u.d(imageView);
            return;
        }
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 14.0f);
        or0.u.l(imageView, iK, iK, 0, iK);
    }
}
