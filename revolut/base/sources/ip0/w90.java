package ip0;

import android.R;
import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w90 extends koi.b {
    public final lu0.u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lu0.u f166965g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(lu0.u itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
        this.f166965g = itemView;
    }

    public final void F(boolean z) {
        lu0.u uVar = this.f166965g;
        if (z) {
            Context context = uVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            uVar.setBackgroundResource(kli.a.x(R.attr.selectableItemBackground, context));
        } else {
            Context context2 = uVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            uVar.setBackgroundResource(kli.a.x(R$attr.uikit_colorForeground_10, context2));
        }
    }

    public final void H(boolean z) {
        int iK;
        lu0.u uVar = this.f166965g;
        if (z) {
            Context context = uVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 16.0f);
        } else {
            Context context2 = uVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK = kli.a.k(context2, BitmapDescriptorFactory.HUE_RED);
        }
        uVar.setPadding(iK, iK, iK, iK);
    }
}
