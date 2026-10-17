package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import ip0.g0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends ConstraintLayout {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f59052b;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f59053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f59054h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ActionsView f59055j;
    public final ViewGroup k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f59056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f59057m;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void f0() {
        this.k.setVisibility(this.f.getVisibility() == 0 || this.f59053g.getVisibility() == 0 || this.f59055j.getVisibility() == 0 ? 0 : 8);
    }

    public final void setActionButtons(@NotNull List<ActionsView.Item> actionItems) {
        Intrinsics.checkNotNullParameter(actionItems, "actionItems");
        int i = !actionItems.isEmpty() ? 0 : 8;
        ActionsView actionsView = this.f59055j;
        actionsView.setVisibility(i);
        actionsView.k(actionItems, mx0.t.f210002a);
        f0();
    }

    public final void setAmount(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        ty0.c cVarB0 = or0.u.k(this).b0();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        post(new k0.b(this, ty0.c.a(cVarB0, clause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE), 13));
    }

    public final void setChevronVisible(boolean z) {
        this.f59052b.setVisibility(z ? 0 : 8);
    }

    public final void setHint(Clause clause) {
        Clause clause2;
        if (clause != null) {
            clause2 = clause;
            ty0.c.b(or0.u.k(this).b0(), clause2, this.f, null, ty0.d.f275448a, 4);
        } else {
            clause2 = clause;
        }
        this.f.setVisibility(clause2 != null ? 0 : 8);
        f0();
    }

    public final void setSecondaryHint(Clause clause) {
        Clause clause2;
        if (clause != null) {
            clause2 = clause;
            ty0.c.b(or0.u.k(this).b0(), clause2, this.f59053g, null, null, 12);
        } else {
            clause2 = clause;
        }
        this.f59053g.setVisibility(clause2 != null ? 0 : 8);
        f0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59056l = kli.a.B(context, 44.0f);
        this.f59057m = v0.a.d("create(...)");
        View.inflate(context, R$layout.internal_view_amount_view, this);
        View viewFindViewById = findViewById(R$id.posNumpadView_chevron);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f59052b = imageView;
        View viewFindViewById2 = findViewById(R$id.posNumpadView_hintText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.posNumpadView_secondaryHintText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f59053g = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.posNumpadView_amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f59054h = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.posNumpadView_amountInvisible);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.i = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.posNumpadView_actions);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        ActionsView actionsView = (ActionsView) viewFindViewById6;
        this.f59055j = actionsView;
        View viewFindViewById7 = findViewById(R$id.posNumpadView_bottomContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.k = (ViewGroup) viewFindViewById7;
        actionsView.setVisibility(8);
        actionsView.setLayoutType(mx0.l.NON_SCROLLABLE);
        yy0.f.e(or0.u.k(this).Q(), new LayeredImage(zhm.v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorActionBackground), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_16_chevron_down, Integer.valueOf(R$attr.uikit_colorAccent), 5.0f, 5.0f, 5.0f, 5.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), imageView, null, null, 12);
        imageView.setOnClickListener(new g0(this, 23));
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
