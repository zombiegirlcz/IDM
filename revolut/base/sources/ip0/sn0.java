package ip0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.flexbox.FlexboxLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sn0 extends koi.b {
    public final ViewGroup f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f166372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f166373h;
    public final UiKitPlayerView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final iv0.q f166374j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f166375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FlexboxLayout f166376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f166377n;
    public final fp0.p o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.voucherBigTile_cardBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.voucherBigTile_cardBackgroundImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166372g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.voucherBigTile_cardBackgroundLottieImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166373h = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.voucherBigTile_cardBackgroundVideo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (UiKitPlayerView) viewFindViewById4;
        this.f166374j = new iv0.q(itemView, R$id.voucherBigTile_cardBackgroundAvatarStub);
        View viewFindViewById5 = itemView.findViewById(R$id.voucherBigTile_iconLocked);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.voucherBigTile_grayMask);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f166375l = viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.voucherBigTile_tagsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f166376m = (FlexboxLayout) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.voucherBigTile_footerText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f166377n = (TextView) viewFindViewById8;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(fp0.b.f137017a);
        mVar.getClass();
        this.o = fp0.m.a(itemView, gVar);
    }
}
