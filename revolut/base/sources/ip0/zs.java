package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.LightPromptDelegate;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zs extends xs {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f167535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f167536h;
    public final UiKitMediaView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final UiKitMediaView f167537j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs(LightPromptDelegate lightPromptDelegate, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        TextView textView = (TextView) itemView.findViewById(R$id.lightPrompt_title);
        this.f = textView;
        this.f167535g = (TextView) itemView.findViewById(R$id.lightPrompt_description);
        this.f167536h = itemView.findViewById(R$id.lightPrompt_fullSizeMediaWrapper);
        UiKitMediaView uiKitMediaView = (UiKitMediaView) itemView.findViewById(R$id.lightPrompt_fullSizeMedia);
        xt0.a aVar = lightPromptDelegate.f52629c;
        uiKitMediaView.setExternalMediaRegistry(aVar);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        this.i = uiKitMediaView;
        UiKitMediaView uiKitMediaView2 = (UiKitMediaView) itemView.findViewById(R$id.lightPrompt_compactMedia);
        uiKitMediaView2.setGlyphDisplayOption(new yp0.o(yp0.n.FACTOR_50, 0));
        uiKitMediaView2.setExternalMediaRegistry(aVar);
        uiKitMediaView2.setVideoScaleType(oz0.b.FIT);
        uiKitMediaView2.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f167537j = uiKitMediaView2;
        Intrinsics.checkNotNullExpressionValue(textView, "<get-title>(...)");
        jb3.l.e(textView, R$attr.internal_textAppearanceMarketingDisplay2_noXmlUsage);
    }
}
