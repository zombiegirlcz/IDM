package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.WideCardDelegate;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class lp0 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UiKitMediaView f165248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f165249h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(WideCardDelegate wideCardDelegate, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (TextView) itemView.findViewById(R$id.wideCard_title);
        UiKitMediaView uiKitMediaView = (UiKitMediaView) itemView.findViewById(R$id.wideCard_media);
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
        uiKitMediaView.setExternalMediaRegistry(wideCardDelegate.f53640c);
        this.f165248g = uiKitMediaView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) itemView.findViewById(R$id.wideCard_closeButton);
        Intrinsics.h(appCompatImageView);
        appCompatImageView.setOnTouchListener(new j01.e(new View[]{appCompatImageView}));
        this.f165249h = appCompatImageView;
    }
}
