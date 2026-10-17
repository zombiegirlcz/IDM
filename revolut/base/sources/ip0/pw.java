package ip0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.poolingcontainer.PoolingContainer;
import com.google.android.gms.maps.MapsInitializer;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pw extends koi.b implements ix0.d2 {
    public final ah0.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f165885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f165886h;
    public final AppCompatTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f165887j;
    public final AppCompatImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f165888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AppCompatTextView f165889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f165890n;
    public Bitmap o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f165891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f165892q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(MapDelegate mapDelegate, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ix0.f2 f2Var = new ix0.f2(itemView, this);
        KeyEvent.Callback callbackFindViewById = itemView.findViewById(R$id.internal_map_view);
        Intrinsics.i(callbackFindViewById, "null cannot be cast to non-null type com.revolut.core.mobile_services.api.map.MsMapView");
        ah0.g gVar = (ah0.g) callbackFindViewById;
        this.f = gVar;
        View viewFindViewById = itemView.findViewById(R$id.map_viewContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        this.f165885g = frameLayout;
        View viewFindViewById2 = itemView.findViewById(R$id.map_note);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165886h = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.map_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById3;
        this.f165887j = itemView;
        View viewFindViewById4 = itemView.findViewById(R$id.map_mapImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.k = (AppCompatImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.map_leftIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f165888l = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.map_error);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f165889m = (AppCompatTextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.map_foreground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f165890n = viewFindViewById7;
        PoolingContainer.addPoolingContainerListener(itemView, new nw(this, 0));
        gVar.onCreate(null);
        if (mapDelegate.f52763g == null) {
            Intrinsics.r("mapsInitializer");
            throw null;
        }
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        MapsInitializer.initialize(context);
        i26.l.a(gVar, null).setClickable(false);
        frameLayout.setClickable(false);
        f2Var.a();
    }

    @Override // ix0.d2
    public final void D(boolean z) {
        ah0.g gVar = this.f;
        if (!z) {
            gVar.onPause();
            gVar.onStop();
            return;
        }
        if (this.f165892q) {
            this.f165892q = false;
            this.f165885g.addView(i26.l.a(gVar, null));
        }
        gVar.onStart();
        gVar.onResume();
    }
}
