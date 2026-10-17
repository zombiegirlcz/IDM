package ip0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.views.FadeBottomImageView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.flexbox.FlexboxLayout;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zo extends koi.b implements xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f167511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitFrameLayout f167512h;
    public final FadeBottomImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final UIKitFrameLayout f167513j;
    public final UIKitTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UIKitTextView f167514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AppCompatImageView f167515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AppCompatTextView f167516n;
    public final AppCompatImageView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AppCompatImageView f167517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final UIKitTextView f167518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FlexboxLayout f167519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f167520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final UIKitTextView f167521t;
    public final OverlappedIconsView u;
    public final AppCompatImageView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinearLayout f167522w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fp0.p f167523x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public wo f167524y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(FrameLayout itemView, FrameLayout root, AppCompatImageView backgroundImage, UIKitFrameLayout foregroundImageContainer, FadeBottomImageView foregroundImage, UIKitFrameLayout bottomImageOverlay, UIKitTextView title, UIKitTextView subtitle, AppCompatImageView headerIconImage, AppCompatTextView headerTitle, AppCompatImageView favoriteIcon, AppCompatImageView shareIcon, UIKitTextView priceLine, FlexboxLayout badgeContainer, ArrayList badgeTags, UIKitTextView footerTitleView, OverlappedIconsView footerOverlappedIconsView, AppCompatImageView footerChevron, LinearLayout footerForeground) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(foregroundImageContainer, "foregroundImageContainer");
        Intrinsics.checkNotNullParameter(foregroundImage, "foregroundImage");
        Intrinsics.checkNotNullParameter(bottomImageOverlay, "bottomImageOverlay");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(headerIconImage, "headerIconImage");
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(favoriteIcon, "favoriteIcon");
        Intrinsics.checkNotNullParameter(shareIcon, "shareIcon");
        Intrinsics.checkNotNullParameter(priceLine, "priceLine");
        Intrinsics.checkNotNullParameter(badgeContainer, "badgeContainer");
        Intrinsics.checkNotNullParameter(badgeTags, "badgeTags");
        Intrinsics.checkNotNullParameter(footerTitleView, "footerTitleView");
        Intrinsics.checkNotNullParameter(footerOverlappedIconsView, "footerOverlappedIconsView");
        Intrinsics.checkNotNullParameter(footerChevron, "footerChevron");
        Intrinsics.checkNotNullParameter(footerForeground, "footerForeground");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = new xv0.n(new ie7.a(foregroundImage, 7));
        this.f167511g = backgroundImage;
        this.f167512h = foregroundImageContainer;
        this.i = foregroundImage;
        this.f167513j = bottomImageOverlay;
        this.k = title;
        this.f167514l = subtitle;
        this.f167515m = headerIconImage;
        this.f167516n = headerTitle;
        this.o = favoriteIcon;
        this.f167517p = shareIcon;
        this.f167518q = priceLine;
        this.f167519r = badgeContainer;
        this.f167520s = badgeTags;
        this.f167521t = footerTitleView;
        this.u = footerOverlappedIconsView;
        this.v = footerChevron;
        this.f167522w = footerForeground;
        fp0.m mVar = fp0.p.Companion;
        gp0.h hVar = new gp0.h(new gp0.f(gp0.c.FOREGROUND, 2), new fp0.g(new Color.Solid(R$attr.uikit_colorWhite)));
        mVar.getClass();
        this.f167523x = fp0.m.a(itemView, hVar);
        c8g.a.a(itemView, ny0.a.f220589a, new ad(this, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(ip0.wo r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ratio"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r5.f167524y = r6
            int[] r0 = ip0.yo.f167343a
            int r6 = r6.ordinal()
            r6 = r0[r6]
            r0 = 1
            if (r6 == r0) goto L24
            r0 = 2
            if (r6 == r0) goto L21
            r0 = 3
            if (r6 != r0) goto L1b
            aw0.d0 r6 = com.revolut.core.ui_kit.delegates.HybridTileDelegate.i
            goto L26
        L1b:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L21:
            aw0.d0 r6 = com.revolut.core.ui_kit.delegates.HybridTileDelegate.f52466h
            goto L26
        L24:
            aw0.d0 r6 = com.revolut.core.ui_kit.delegates.HybridTileDelegate.f52465g
        L26:
            java.lang.Object r0 = jo0.g.f176833q
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "getContext(...)"
            if (r0 == 0) goto L48
            android.view.View r0 = r5.itemView
            android.content.Context r0 = r0.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = ny0.i.d(r0)
            if (r0 == 0) goto L48
            r0 = 1134559232(0x43a00000, float:320.0)
            goto L4b
        L48:
            r0 = 1137737728(0x43d08000, float:417.0)
        L4b:
            nt0.c r2 = new nt0.c
            ut0.a r3 = ut0.a.ADJUST_HEIGHT
            android.view.View r4 = r5.itemView
            int r0 = com.google.android.gms.internal.mlkit_vision_face.a.a(r4, r1, r0)
            r2.<init>(r6, r3, r0)
            com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout r6 = r5.f167512h
            r6.setAspectRatio(r2)
            com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout r6 = r5.f167513j
            r6.setAspectRatio(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ip0.zo.F(ip0.wo):void");
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
