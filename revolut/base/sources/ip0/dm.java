package ip0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.internal.views.OnMeasureCallbackConstraintLayout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.views.BadgeStatusView;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class dm extends koi.b implements xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OnMeasureCallbackConstraintLayout f163922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f163923h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final UiKitMediaView f163924j;
    public final AppCompatImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HorizontalStepsProgressView f163925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BadgeStatusView f163926m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(HeroBannerDelegate heroBannerDelegate, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = new xv0.n(new au0.z3(itemView, 4));
        this.f163922g = (OnMeasureCallbackConstraintLayout) itemView.findViewById(R$id.heroBanner_root);
        this.f163923h = (TextView) itemView.findViewById(R$id.heroBanner_title);
        this.i = (TextView) itemView.findViewById(R$id.heroBanner_description);
        UiKitMediaView uiKitMediaView = (UiKitMediaView) itemView.findViewById(R$id.heroBanner_media);
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
        uiKitMediaView.setExternalMediaRegistry(heroBannerDelegate.f52423c);
        this.f163924j = uiKitMediaView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) itemView.findViewById(R$id.heroBanner_closeButton);
        j01.d dVar = j01.e.Companion;
        Intrinsics.h(appCompatImageView);
        dVar.getClass();
        j01.d.a(appCompatImageView);
        this.k = appCompatImageView;
        HorizontalStepsProgressView horizontalStepsProgressView = (HorizontalStepsProgressView) itemView.findViewById(R$id.heroBanner_progress);
        Context context = horizontalStepsProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        horizontalStepsProgressView.setBaseColor(kli.a.s(R$attr.uikit_colorGreyTone10_50, context));
        horizontalStepsProgressView.setProgressBarRadiusDp(2.0f);
        horizontalStepsProgressView.setGapSizeDp(6.0f);
        this.f163925l = horizontalStepsProgressView;
        this.f163926m = (BadgeStatusView) itemView.findViewById(R$id.heroBanner_badge);
        or0.b.j(heroBannerDelegate, new c.e((qv0.h) null, 3), itemView);
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
