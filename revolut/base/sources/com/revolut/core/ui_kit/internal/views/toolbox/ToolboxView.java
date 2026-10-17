package com.revolut.core.ui_kit.internal.views.toolbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.dialogs.ToolboxDialogDisplayer$Configuration$Cell;
import com.revolut.core.ui_kit.dialogs.ToolboxDialogDisplayer$Configuration$Divider;
import com.revolut.core.ui_kit.dialogs.ToolboxDialogDisplayer$Configuration$Item;
import com.revolut.core.ui_kit.internal.views.toolbox.ToolboxView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.BubbleTooltipView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import fs2.k;
import fv0.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.ranges.IntRange;
import mx0.o2;
import org.jetbrains.annotations.NotNull;
import rp0.a2;
import rp0.b2;
import te0.w;
import z4l.j;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class ToolboxView extends ConstraintLayout {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f57681b;
    public Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f57682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f57683h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b2 f57684j;
    public final j k;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/toolbox/ToolboxView$CellDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/dialogs/ToolboxDialogDisplayer$Configuration$Cell;", "Lcom/revolut/core/ui_kit/internal/views/toolbox/b;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CellDelegate extends BaseRecyclerViewDelegate<ToolboxDialogDisplayer$Configuration$Cell, b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f57685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellDelegate(k onItemClick) {
            super(R$layout.internal_view_toolbox_cell, new fq7.j(29));
            Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
            this.f57685c = onItemClick;
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new b(s.r(parent, this.f98535a));
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(b holder, final ToolboxDialogDisplayer$Configuration$Cell data, int i, List payloads) {
            int iS;
            int i2;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            TextView textView = holder.f;
            if (data.e) {
                holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.revolut.core.ui_kit.internal.views.toolbox.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f57689a.f57685c.invoke(data);
                    }
                });
            } else {
                holder.itemView.setOnClickListener(null);
            }
            View view = holder.itemView;
            ImageView imageView = holder.f57692h;
            ImageView imageView2 = holder.f57691g;
            view.setClickable(data.e);
            or0.b.e(this, data.f55723c, textView, null, 12);
            or0.b.f(this, data.f55722b, imageView2);
            imageView.setVisibility(data.f ? 0 : 8);
            if (data.d) {
                int i3 = c.f57693a[data.f55724g.ordinal()];
                if (i3 == 1) {
                    i2 = R$attr.uikit_colorForeground;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$attr.uikit_colorRed;
                }
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iS = kli.a.s(i2, context);
            } else {
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorGrey20, context2);
            }
            ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(iS));
            ImageViewCompat.setImageTintList(imageView2, ColorStateList.valueOf(iS));
            textView.setTextColor(iS);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/toolbox/ToolboxView$DividerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/dialogs/ToolboxDialogDisplayer$Configuration$Divider;", "Lcom/revolut/core/ui_kit/internal/views/toolbox/d;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DividerDelegate extends BaseRecyclerViewDelegate<ToolboxDialogDisplayer$Configuration$Divider, d> {
        public DividerDelegate() {
            super(R$layout.internal_view_toolbox_divider, new fv0.c(0));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View itemView = s.r(parent, this.f98535a);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            return new d(itemView);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/toolbox/ToolboxView$SmartLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Lfv0/d;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class SmartLayoutManager extends RecyclerView.LayoutManager implements fv0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f57686a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f57687b = -1;

        public SmartLayoutManager() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
            return new RecyclerView.LayoutParams(-2, -2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean isAutoMeasureEnabled() {
            return true;
        }

        public final int m(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            return getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }

        public final int n(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            return getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            View viewForPosition;
            RecyclerView.Recycler recycler2 = recycler;
            Intrinsics.checkNotNullParameter(recycler2, "recycler");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f57687b = state.getItemCount();
            this.f57686a = -1;
            if (state.getItemCount() == 0) {
                removeAllViews();
                return;
            }
            detachAndScrapAttachedViews(recycler);
            int itemCount = state.getItemCount();
            int i = itemCount - 3;
            View viewForPosition2 = recycler2.getViewForPosition(itemCount - 2);
            String str = "getViewForPosition(...)";
            Intrinsics.checkNotNullExpressionValue(viewForPosition2, "getViewForPosition(...)");
            int i2 = 0;
            measureChildWithMargins(viewForPosition2, 0, 0);
            int iN = n(viewForPosition2);
            int iM = m(viewForPosition2);
            View viewForPosition3 = recycler2.getViewForPosition(itemCount - 1);
            Intrinsics.checkNotNullExpressionValue(viewForPosition3, "getViewForPosition(...)");
            measureChildWithMargins(viewForPosition3, 0, 0);
            int iN2 = n(viewForPosition3);
            int iM2 = m(viewForPosition3);
            int i3 = iN + iN2;
            ToolboxView toolboxView = ToolboxView.this;
            int measuredWidth = toolboxView.getMeasuredWidth();
            RecyclerView recyclerView = toolboxView.getRecyclerView();
            Intrinsics.checkNotNullExpressionValue(recyclerView, "access$getRecyclerView(...)");
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int marginEnd = measuredWidth - (marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart());
            if (i >= 0) {
                int i5 = marginEnd;
                int i6 = 0;
                int i21 = 0;
                while (true) {
                    viewForPosition = recycler2.getViewForPosition(i6);
                    Intrinsics.checkNotNullExpressionValue(viewForPosition, str);
                    measureChildWithMargins(viewForPosition, i2, i2);
                    int iN3 = n(viewForPosition);
                    int iM3 = m(viewForPosition);
                    if (iN3 > i5) {
                        break;
                    }
                    int i22 = i5;
                    if (i6 != i && i22 - iN3 < i3) {
                        break;
                    }
                    addView(viewForPosition);
                    int i32 = i21;
                    i21 = i32 + iN3;
                    int i33 = i6;
                    int i43 = i3;
                    String str2 = str;
                    layoutDecoratedWithMargins(viewForPosition, i32, 0, i21, iM3);
                    i5 = i22 + (-iN3);
                    this.f57686a = i33;
                    if (i33 == i) {
                        return;
                    }
                    i6 = i33 + 1;
                    i3 = i43;
                    str = str2;
                    i2 = 0;
                    recycler2 = recycler;
                }
                int i59 = i3;
                int i66 = i21;
                if (i6 == 0) {
                    measureChildWithMargins(viewForPosition, i59, 0);
                    int iN4 = n(viewForPosition);
                    int iM4 = m(viewForPosition);
                    addView(viewForPosition);
                    int i74 = i66 + iN4;
                    layoutDecoratedWithMargins(viewForPosition, i66, 0, i74, iM4);
                    this.f57686a = 0;
                    i66 = i74;
                }
                addView(viewForPosition2);
                int i92 = i66 + iN;
                layoutDecoratedWithMargins(viewForPosition2, i66, 0, i92, iM);
                addView(viewForPosition3);
                layoutDecoratedWithMargins(viewForPosition3, i92, 0, i92 + iN2, iM2);
            }
        }
    }

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolboxView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 0;
        this.f57682g = w.y0(new Function0(this) { // from class: fv0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ToolboxView f138301b;

            {
                this.f138301b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ToolboxView toolboxView = this.f138301b;
                switch (i3) {
                    case 0:
                        ToolboxView.a aVar = ToolboxView.Companion;
                        return (RecyclerView) toolboxView.findViewById(R$id.toolbox_recycler);
                    case 1:
                        ToolboxView.a aVar2 = ToolboxView.Companion;
                        return toolboxView.findViewById(R$id.toolbox_bubble);
                    default:
                        ToolboxView.a aVar3 = ToolboxView.Companion;
                        return (BubbleTooltipView) toolboxView.findViewById(R$id.toolbox_tooltip);
                }
            }
        });
        final int i3 = 1;
        this.f57683h = w.y0(new Function0(this) { // from class: fv0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ToolboxView f138301b;

            {
                this.f138301b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                ToolboxView toolboxView = this.f138301b;
                switch (i32) {
                    case 0:
                        ToolboxView.a aVar = ToolboxView.Companion;
                        return (RecyclerView) toolboxView.findViewById(R$id.toolbox_recycler);
                    case 1:
                        ToolboxView.a aVar2 = ToolboxView.Companion;
                        return toolboxView.findViewById(R$id.toolbox_bubble);
                    default:
                        ToolboxView.a aVar3 = ToolboxView.Companion;
                        return (BubbleTooltipView) toolboxView.findViewById(R$id.toolbox_tooltip);
                }
            }
        });
        final int i5 = 2;
        this.i = w.y0(new Function0(this) { // from class: fv0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ToolboxView f138301b;

            {
                this.f138301b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                ToolboxView toolboxView = this.f138301b;
                switch (i32) {
                    case 0:
                        ToolboxView.a aVar = ToolboxView.Companion;
                        return (RecyclerView) toolboxView.findViewById(R$id.toolbox_recycler);
                    case 1:
                        ToolboxView.a aVar2 = ToolboxView.Companion;
                        return toolboxView.findViewById(R$id.toolbox_bubble);
                    default:
                        ToolboxView.a aVar3 = ToolboxView.Companion;
                        return (BubbleTooltipView) toolboxView.findViewById(R$id.toolbox_tooltip);
                }
            }
        });
        com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.b bVar = new com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.b(1);
        j jVar = new j(3, v.k(new DividerDelegate(), new CellDelegate(new k(this, 10))), false);
        this.k = jVar;
        View.inflate(context, R$layout.internal_view_toolbox, this);
        setId(R$id.toolbox_root);
        setClipChildren(false);
        getRecyclerView().setAdapter(jVar);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(context, 0, false));
        getRecyclerView().addOnScrollListener(new fv0.b(this));
        int iK = kli.a.k(context, 24.0f);
        float fK = kli.a.k(context, 16.0f);
        int iS = kli.a.s(R$attr.uikit_colorPopoverBackground, context);
        int iS2 = kli.a.s(com.revolut.core.ui_kit.R$attr.internal_colorPopupShadow, context);
        ShapeAppearanceModel shapeAppearanceModelWithCornerSize = new ShapeAppearanceModel().withCornerSize(fK);
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelWithCornerSize, "withCornerSize(...)");
        getBubble().setOnTouchListener(bVar);
        View bubble = getBubble();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelWithCornerSize);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(iS));
        materialShapeDrawable.setElevation(iK);
        materialShapeDrawable.setShadowColor(iS2);
        bubble.setBackground(materialShapeDrawable);
        getTooltip().setOnTouchListener(bVar);
        getTooltip().f0(o2.ACCENT);
        getTooltip().setBottomArrowVisible(false);
    }

    public static Unit f0(ToolboxView toolboxView, ToolboxDialogDisplayer$Configuration$Cell cell) {
        IntRange intRange;
        List listSubList;
        Function1 function1;
        Intrinsics.checkNotNullParameter(cell, "cell");
        if (Intrinsics.f(cell.f55721a, "TOOLBOX_MORE_ID")) {
            j jVar = toolboxView.k;
            Object layoutManager = toolboxView.getRecyclerView().getLayoutManager();
            fv0.d dVar = layoutManager instanceof fv0.d ? (fv0.d) layoutManager : null;
            if (dVar != null) {
                SmartLayoutManager smartLayoutManager = (SmartLayoutManager) dVar;
                int i = smartLayoutManager.f57686a;
                if (i < 0 || i > smartLayoutManager.f57687b - 3) {
                    IntRange.INSTANCE.getClass();
                    intRange = IntRange.d;
                } else {
                    intRange = new IntRange(smartLayoutManager.f57686a + 1, smartLayoutManager.f57687b - 3, 1);
                }
                if (!intRange.isEmpty()) {
                    int size = jVar.f319395l.size();
                    int i2 = intRange.f186449b;
                    if (size < i2) {
                        listSubList = f0.f322471a;
                    } else {
                        listSubList = jVar.f319395l.subList(intRange.f186448a, i2 + 1);
                        Intrinsics.i(listSubList, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.dialogs.ToolboxDialogDisplayer.Configuration.Cell>");
                    }
                    if (!listSubList.isEmpty() && (function1 = toolboxView.f) != null) {
                        function1.invoke(listSubList);
                    }
                }
            }
        } else {
            Function1 function12 = toolboxView.f57681b;
            if (function12 != null) {
                function12.invoke(cell);
            }
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getBubble() {
        return (View) this.f57683h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final RecyclerView getRecyclerView() {
        return (RecyclerView) this.f57682g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final BubbleTooltipView getTooltip() {
        return (BubbleTooltipView) this.i.getValue();
    }

    public final Function1<ToolboxDialogDisplayer$Configuration$Cell, Unit> getOnItemClick() {
        return this.f57681b;
    }

    public final Function1<List<ToolboxDialogDisplayer$Configuration$Cell>, Unit> getOnMoreActionClick() {
        return this.f;
    }

    public final void h0() {
        BubbleTooltipView tooltip = getTooltip();
        Intrinsics.checkNotNullExpressionValue(tooltip, "<get-tooltip>(...)");
        knm.b.z(tooltip, false, 200L, 12);
    }

    public final void setItems(@NotNull List<? extends ToolboxDialogDisplayer$Configuration$Item> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        b2 b2Var = this.f57684j;
        if ((b2Var == null ? -1 : e.f138304a[b2Var.ordinal()]) == 1) {
            aim.e eVarB = u.b();
            a0.x(items, eVarB);
            eVarB.add(ToolboxDialogDisplayer$Configuration$Divider.f55725a);
            eVarB.add(new ToolboxDialogDisplayer$Configuration$Cell("TOOLBOX_MORE_ID", new ResourceImage(R$drawable.uikit_icn_24_ellipsis, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.uikit_actions_more, null, null, 14), 126), null, true, true, false, a2.PRIMARY));
            items = u.a(eVarB);
        }
        this.k.c(items);
    }

    public final void setLayoutType(@NotNull b2 layoutType) {
        RecyclerView.LayoutManager smartLayoutManager;
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this.f57684j = layoutType;
        RecyclerView recyclerView = getRecyclerView();
        int i = e.f138304a[layoutType.ordinal()];
        if (i == 1) {
            smartLayoutManager = new SmartLayoutManager();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            smartLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        }
        recyclerView.setLayoutManager(smartLayoutManager);
    }

    public final void setOnItemClick(Function1<? super ToolboxDialogDisplayer$Configuration$Cell, Unit> function1) {
        this.f57681b = function1;
    }

    public final void setOnMoreActionClick(Function1<? super List<ToolboxDialogDisplayer$Configuration$Cell>, Unit> function1) {
        this.f = function1;
    }
}
