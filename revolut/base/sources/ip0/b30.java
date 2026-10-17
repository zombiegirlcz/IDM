package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ProductValuePropCardDelegate;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class b30 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f163520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UiKitMediaView f163521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(ProductValuePropCardDelegate productValuePropCardDelegate, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        TextView title = (TextView) itemView.findViewById(R$id.productValuePropCard_title);
        this.f = title;
        this.f163520g = (TextView) itemView.findViewById(R$id.productValuePropCard_subtitle);
        UiKitMediaView uiKitMediaView = (UiKitMediaView) itemView.findViewById(R$id.productValuePropCard_media);
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
        uiKitMediaView.setExternalMediaRegistry(productValuePropCardDelegate.f52986c);
        this.f163521h = uiKitMediaView;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        jb3.l.e(title, R$attr.internal_textAppearanceMarketingDisplay2_noXmlUsage);
        or0.b.j(productValuePropCardDelegate, new c.e((qv0.h) null, 3), itemView);
    }
}
