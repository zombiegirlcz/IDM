package ip0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends koi.b {
    public final SmallActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SmallActionButton f165097g;

    public l(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ConstraintLayout itemView = new ConstraintLayout(parent.getContext());
        itemView.setId(R$id.internal_action_subheader_delegate);
        itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iW = kli.a.w(R$attr.uikit_dp16, context);
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        itemView.setPaddingRelative(iW, iW, iW, kli.a.w(R$attr.uikit_dp12, context2));
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        super(itemView);
        Context context3 = parent.getContext();
        View view = this.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        Intrinsics.h(context3);
        SmallActionButton smallActionButton = new SmallActionButton(context3, null, 6, 0);
        smallActionButton.setId(R$id.internal_action_subheader_end_button);
        ms0.h4 h4Var = ms0.h4.SEMIACCENT;
        smallActionButton.i(h4Var);
        smallActionButton.setIconsColorFilterEnabled(false);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.constrainedWidth = true;
        layoutParams.matchConstraintPercentWidth = 0.5f;
        layoutParams.matchConstraintMaxWidth = -2;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.horizontalBias = 1.0f;
        smallActionButton.setLayoutParams(layoutParams);
        this.f165097g = smallActionButton;
        SmallActionButton smallActionButton2 = new SmallActionButton(context3, null, 6, 0);
        smallActionButton2.setId(R$id.internal_action_subheader_start_button);
        smallActionButton2.i(h4Var);
        smallActionButton2.setIconsColorFilterEnabled(false);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams2.constrainedWidth = true;
        layoutParams2.startToStart = 0;
        layoutParams2.endToStart = smallActionButton.getId();
        layoutParams2.topToTop = 0;
        layoutParams2.bottomToBottom = 0;
        layoutParams2.setMarginEnd(kli.a.k(context3, 16.0f));
        layoutParams2.horizontalBias = BitmapDescriptorFactory.HUE_RED;
        smallActionButton2.setLayoutParams(layoutParams2);
        this.f = smallActionButton2;
        constraintLayout.addView(smallActionButton2);
        constraintLayout.addView(smallActionButton);
    }
}
