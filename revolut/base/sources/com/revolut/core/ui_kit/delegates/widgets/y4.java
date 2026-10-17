package com.revolut.core.ui_kit.delegates.widgets;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.e7;
import com.revolut.core.ui_kit.internal.views.SuggestionView;
import com.revolut.core.ui_kit.internal.views.SuggestionViewStyle;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.flexbox.FlexboxLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import op0.d5;
import op0.e5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class y4 extends op0.p {

    @NotNull
    public static final e5 Companion = new e5();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f55564j;
    public final AppCompatTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SuggestionView f55565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AppCompatImageButton f55566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final UiKitMediaView f55567n;
    public final View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f55568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z4l.j f55569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function1 f55570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Function0 f55571s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.travelModeWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f55564j = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.travelModeWidget_topLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.travelModeWidget_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        SuggestionView suggestionView = (SuggestionView) viewFindViewById3;
        this.f55565l = suggestionView;
        View viewFindViewById4 = itemView.findViewById(R$id.travelModeWidget_disable);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f55566m = (AppCompatImageButton) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.travelModeWidget_backgroundMedia);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        UiKitMediaView uiKitMediaView = (UiKitMediaView) viewFindViewById5;
        this.f55567n = uiKitMediaView;
        View viewFindViewById6 = itemView.findViewById(R$id.travelModeWidget_productsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.travelModeWidget_topOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.o = viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.travelModeWidget_bottomOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f55568p = viewFindViewById8;
        IconDelegate iconDelegate = new IconDelegate();
        this.f55570r = new ood.o0(10);
        this.f55571s = new ok7.b(25);
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
        F(op0.q.LARGE);
        suggestionView.g0(new SuggestionViewStyle.Semiaccent((Object) null));
        suggestionView.setIcon(null);
        z4l.j jVar = new z4l.j(7, zhm.u.c(iconDelegate), false);
        this.f55569q = jVar;
        recyclerView.setAdapter(jVar);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(itemView.getContext(), 1);
        flexboxLayoutManager.z(0);
        flexboxLayoutManager.B(2);
        flexboxLayoutManager.A(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.addItemDecoration(new tw0.c(24.0f));
        viewFindViewById7.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{TravelModeWidgetDelegate.f55279h, 0}));
        viewFindViewById8.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{TravelModeWidgetDelegate.i, 0}));
        iconDelegate.p().subscribe(new op0.o3(12, new d5(this, 0)));
        suggestionView.f56417b.subscribe(new op0.o3(13, new d5(this, 1)));
    }

    public static IconDelegate.Model H(v4 v4Var) {
        return new IconDelegate.Model(v4Var.f55536a, LayeredImage.Companion.p(LayeredImage.INSTANCE, v4Var.f55537b, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorWhite_20, 8.0f, 32.0f), v4Var.f55538c, null, null, e7.WRAP_CONTENT, v4Var, null, 520);
    }
}
