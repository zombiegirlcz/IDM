package ip0;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yl0 extends koi.b {
    public final qr0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UiKitPlayerView f167335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xr0.i f167336h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl0(qr0.d itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UiKitPlayerView uiKitPlayerView = new UiKitPlayerView(context, null, 6, 0);
        uiKitPlayerView.setDetachBehavior(jv0.s.PAUSE_ON_DETACH);
        uiKitPlayerView.setScaleType(oz0.b.CENTER_CROP);
        uiKitPlayerView.setShutter(VideoShutter.FadeIn.f60094a);
        uiKitPlayerView.setRepeat(true);
        uiKitPlayerView.setVolumeLevel(BitmapDescriptorFactory.HUE_RED);
        uiKitPlayerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f167335g = uiKitPlayerView;
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        itemView.setOutlineProvider(new iv0.s(kli.a.l(context2, 40.0f), true));
        itemView.setClipToOutline(true);
        itemView.setAmountMaxTextSizeSp(44);
        itemView.a(uiKitPlayerView);
        final int i = 0;
        final int i2 = 1;
        this.f167336h = new xr0.i(itemView, new Function1(this) { // from class: ip0.xl0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yl0 f167194b;

            {
                this.f167194b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                aw0.v8 v8Var = (aw0.v8) obj2;
                switch (i) {
                    case 0:
                        if (v8Var != null) {
                            qr0.d dVar = this.f167194b.f;
                            Image image = v8Var.f10575a;
                            Clause amount = v8Var.f10577c;
                            aw0.i3 i3Var = v8Var.d;
                            bv0.b switcher = v8Var.e;
                            boolean z = v8Var.f;
                            Intrinsics.checkNotNullParameter(image, "image");
                            Intrinsics.checkNotNullParameter(amount, "amount");
                            Intrinsics.checkNotNullParameter(switcher, "switcher");
                            dVar.setModel(new aw0.v8(image, null, amount, i3Var, switcher, z));
                        }
                        break;
                    default:
                        if (v8Var != null) {
                            this.f167194b.f.setModel(v8Var);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: ip0.xl0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yl0 f167194b;

            {
                this.f167194b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                aw0.v8 v8Var = (aw0.v8) obj2;
                switch (i2) {
                    case 0:
                        if (v8Var != null) {
                            qr0.d dVar = this.f167194b.f;
                            Image image = v8Var.f10575a;
                            Clause amount = v8Var.f10577c;
                            aw0.i3 i3Var = v8Var.d;
                            bv0.b switcher = v8Var.e;
                            boolean z = v8Var.f;
                            Intrinsics.checkNotNullParameter(image, "image");
                            Intrinsics.checkNotNullParameter(amount, "amount");
                            Intrinsics.checkNotNullParameter(switcher, "switcher");
                            dVar.setModel(new aw0.v8(image, null, amount, i3Var, switcher, z));
                        }
                        break;
                    default:
                        if (v8Var != null) {
                            this.f167194b.f.setModel(v8Var);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, new ie7.a(this, 20));
    }
}
