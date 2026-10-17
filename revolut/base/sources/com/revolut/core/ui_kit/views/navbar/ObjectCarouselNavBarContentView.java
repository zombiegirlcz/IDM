package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import aw0.s8;
import aw0.x8;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.decoration.AlphaDecoration;
import com.revolut.core.ui_kit_core.displayers.image.decoration.DecoratedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import ip0.v7;
import ix0.s0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.a4;
import tx0.b4;
import tx0.o1;
import tx0.u2;
import tx0.x2;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\b\u001a\u001b\u001c\u001d\u001e\u001f !B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/ObjectCarouselNavBarContentView;", "Landroid/widget/FrameLayout;", "Ltx0/x2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/revolut/core/ui_kit/views/navbar/ObjectCarouselNavBarContentView$c;", "model", "", "setModel", "(Lcom/revolut/core/ui_kit/views/navbar/ObjectCarouselNavBarContentView$c;)V", "Ltx0/u2;", "listener", "setColorSchemeListener", "(Ltx0/u2;)V", "", "offset", "setBackgroundOffset", "(I)V", "getCurrentPosition", "()I", "currentPosition", "Companion", "c", "CarouselItemModel", "tx0/z3", "InternalCarouselItemModel", "ImageDelegate", "tx0/a4", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ObjectCarouselNavBarContentView extends FrameLayout implements x2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.b f59423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f59424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f59425c;
    public final ImageDelegate d;
    public final z4l.j e;
    public final AppCompatTextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f59426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f59427h;
    public ShimmerFrameLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AsyncDiffRecyclerView f59428j;
    public final x8 k;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/ObjectCarouselNavBarContentView$CarouselItemModel;", "Lkoi/j;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CarouselItemModel implements koi.j, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f59429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UrlImage f59430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f59431c;

        public CarouselItemModel(String listId, UrlImage image) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            this.f59429a = listId;
            this.f59430b = image;
            this.f59431c = null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF59433a() {
            return this.f59429a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CarouselItemModel)) {
                return false;
            }
            CarouselItemModel carouselItemModel = (CarouselItemModel) obj2;
            return Intrinsics.f(this.f59429a, carouselItemModel.f59429a) && this.f59430b.equals(carouselItemModel.f59430b) && Intrinsics.f(this.f59431c, carouselItemModel.f59431c);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF59435c() {
            return this.f59431c;
        }

        public final int hashCode() {
            int iG = v7.g(this.f59430b, this.f59429a.hashCode() * 31, 31);
            Parcelable parcelable = this.f59431c;
            return iG + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f59431c = parcelable;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/ObjectCarouselNavBarContentView$ImageDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/navbar/ObjectCarouselNavBarContentView$InternalCarouselItemModel;", "Ltx0/a4;", "Lcom/revolut/core/ui_kit/views/navbar/ObjectCarouselNavBarContentView;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ImageDelegate extends BaseRecyclerViewDelegate<InternalCarouselItemModel, a4> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ihm.f f59432c;

        public ImageDelegate(ObjectCarouselNavBarContentView objectCarouselNavBarContentView) {
            super(1001, new t());
            this.f59432c = v0.a.d("create(...)");
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            ConstraintLayout constraintLayout = new ConstraintLayout(parent.getContext());
            constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -1);
            Companion companion = ObjectCarouselNavBarContentView.INSTANCE;
            layoutParams.dimensionRatio = "W,160:260";
            ImageView imageView = new ImageView(parent.getContext());
            constraintLayout.addView(imageView, layoutParams);
            return new a4(imageView, constraintLayout);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(a4 holder, InternalCarouselItemModel data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            boolean zN = ue0.e.n(payloads);
            for (Object obj2 : payloads) {
                if (obj2 instanceof u) {
                    zN = ((u) obj2).f59550a;
                }
            }
            if (zN) {
                Image image = data.f59434b;
                Intrinsics.checkNotNullParameter(image, "image");
                xv0.m.e0(holder, image, holder.f275083g, null, 14);
            }
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.u.s(itemView, data, new py0.b(data.f59434b), new a0(this, holder, 2));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/ObjectCarouselNavBarContentView$InternalCarouselItemModel;", "Lkoi/j;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/views/navbar/u", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InternalCarouselItemModel implements koi.j, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f59433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f59434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f59435c;

        public InternalCarouselItemModel(Parcelable parcelable, Image image, String listId) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            this.f59433a = listId;
            this.f59434b = image;
            this.f59435c = parcelable;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF59433a() {
            return this.f59433a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InternalCarouselItemModel)) {
                return false;
            }
            InternalCarouselItemModel internalCarouselItemModel = (InternalCarouselItemModel) obj2;
            return Intrinsics.f(this.f59433a, internalCarouselItemModel.f59433a) && Intrinsics.f(this.f59434b, internalCarouselItemModel.f59434b) && Intrinsics.f(this.f59435c, internalCarouselItemModel.f59435c);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF59435c() {
            return this.f59435c;
        }

        public final int hashCode() {
            int iC = a10.b.c(this.f59434b, this.f59433a.hashCode() * 31, 31);
            Parcelable parcelable = this.f59435c;
            return iC + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f59435c = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof InternalCarouselItemModel ? (InternalCarouselItemModel) oldItem : null) != null) {
                return new u(!Intrinsics.f(this.f59434b, ((InternalCarouselItemModel) oldItem).f59434b));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int height = parent.getHeight();
            Companion companion = ObjectCarouselNavBarContentView.INSTANCE;
            int width = (parent.getWidth() - ((height * 160) / 260)) / 2;
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            boolean z = childAdapterPosition == 0;
            boolean z3 = childAdapterPosition == state.getItemCount() - 1;
            outRect.left = z ? width : 0;
            if (!z3) {
                width = 0;
            }
            outRect.right = width;
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f59436a = new a();

            private a() {
            }
        }

        private c() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectCarouselNavBarContentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ihm.b bVarE = ihm.b.e(0);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f59423a = bVarE;
        this.f59424b = f0.f322471a;
        ImageDelegate imageDelegate = new ImageDelegate(this);
        this.d = imageDelegate;
        z4l.j jVar = new z4l.j(7, zhm.u.c(imageDelegate), false);
        this.e = jVar;
        this.k = s0.d(new ColorDrawable(0), context, s8.DEFAULT);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f59427h = linearLayout;
        addView(linearLayout, -1, -1);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        AsyncDiffRecyclerView asyncDiffRecyclerView = new AsyncDiffRecyclerView(context2, null, 6, 0);
        asyncDiffRecyclerView.setId(View.generateViewId());
        asyncDiffRecyclerView.setClipToPadding(false);
        asyncDiffRecyclerView.setOverScrollMode(2);
        asyncDiffRecyclerView.setAdapter(jVar);
        asyncDiffRecyclerView.setLayoutManager(new LinearLayoutManager(asyncDiffRecyclerView.getContext(), 0, false));
        asyncDiffRecyclerView.setItemAnimator(null);
        asyncDiffRecyclerView.addItemDecoration(new b());
        new PagerSnapHelper().attachToRecyclerView(asyncDiffRecyclerView);
        asyncDiffRecyclerView.addOnScrollListener(new b4(this));
        this.f59428j = asyncDiffRecyclerView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(View.generateViewId());
        appCompatTextView.setGravity(17);
        jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceHeading2);
        appCompatTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.internal_H2_text_size);
        Intrinsics.checkNotNullParameter(context, "<this>");
        float f = dimensionPixelSize / context.getResources().getDisplayMetrics().scaledDensity;
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(appCompatTextView, (int) (((double) f) * 0.6d), (int) f, 1, 2);
        appCompatTextView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        this.f = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(View.generateViewId());
        appCompatTextView2.setGravity(17);
        jb3.l.e(appCompatTextView2, R$attr.internal_textAppearanceEmphasis2);
        appCompatTextView2.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setEllipsize(truncateAt);
        this.f59426g = appCompatTextView2;
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.bottomMargin = kli.a.k(context, 24.0f);
        layoutParams.weight = 1.0f;
        linearLayout.addView(asyncDiffRecyclerView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(kli.a.k(context, 32.0f), ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, kli.a.k(context, 32.0f), kli.a.k(context, 16.0f));
        linearLayout.addView(appCompatTextView, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(kli.a.k(context, 32.0f), ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, kli.a.k(context, 32.0f), kli.a.k(context, 40.0f));
        linearLayout.addView(appCompatTextView2, layoutParams3);
    }

    public static View a(Context context, int i, int i2) {
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setBackground(new RoundedBackgroundDrawable(context, 0, 6));
        view.setLayoutParams(new ConstraintLayout.LayoutParams(i, i2));
        return view;
    }

    private final int getCurrentPosition() {
        Integer num = (Integer) this.f59423a.f();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // tx0.x2
    public final void H(int i) {
    }

    public final void b() {
        Iterable iterable = (Iterable) this.f59424b;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        int i = 0;
        for (Object obj2 : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            CarouselItemModel carouselItemModel = (CarouselItemModel) obj2;
            String str = carouselItemModel.f59429a;
            Image decoratedImage = carouselItemModel.f59430b;
            if (i != getCurrentPosition()) {
                decoratedImage = new DecoratedImage(decoratedImage, zhm.u.c(new AlphaDecoration(0.2f)));
            }
            arrayList.add(new InternalCarouselItemModel(carouselItemModel.f59431c, decoratedImage, str));
            i = i2;
        }
        this.e.c(arrayList);
    }

    public final void c(int i) {
        AsyncDiffRecyclerView asyncDiffRecyclerView = this.f59428j;
        asyncDiffRecyclerView.stopScroll();
        asyncDiffRecyclerView.smoothScrollBy((i - getCurrentPosition()) * ((asyncDiffRecyclerView.getHeight() * 160) / 260), 0);
    }

    @Override // tx0.x2
    public final void d(float f, int i) {
    }

    @Override // tx0.x2
    public final void d0(int i) {
        LinearLayout linearLayout = this.f59427h;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), i, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        ShimmerFrameLayout shimmerFrameLayout = this.i;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.setPadding(shimmerFrameLayout.getPaddingLeft(), i, shimmerFrameLayout.getPaddingRight(), shimmerFrameLayout.getPaddingBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        efm.r rVarHide = this.d.f59432c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        this.f59425c = rVarHide.subscribe(new o1(new tpl.o(this, 27), 13));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ifm.c cVar = this.f59425c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // tx0.x2
    public void setBackgroundOffset(int offset) {
    }

    @Override // tx0.x2
    public void setColorSchemeListener(@NotNull u2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (listener != null) {
            x8 x8Var = this.k;
            listener.a(x8Var.f10609a, x8Var.f10610b, x8Var.f10611c, x8Var.e);
        }
    }

    public final void setModel(@NotNull c model) {
        Intrinsics.checkNotNullParameter(model, "model");
        boolean z = model instanceof c.a;
        if (z) {
            ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(getContext());
            this.i = shimmerFrameLayout;
            addView(shimmerFrameLayout, -1, -1);
            ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
            ShimmerFrameLayout shimmerFrameLayout2 = this.i;
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.addView(constraintLayout, -1, -1);
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 16.0f);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK2 = kli.a.k(context2, 24.0f);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iK3 = kli.a.k(context3, 40.0f);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            int iK4 = kli.a.k(context4, 96.0f);
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            int iK5 = kli.a.k(context5, 120.0f);
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            int iK6 = kli.a.k(context6, 240.0f);
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            View viewA = a(context7, iK4, iK4);
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            View viewA2 = a(context8, iK4, iK4);
            Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
            View viewA3 = a(context9, iK4, iK4);
            Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
            View viewA4 = a(context10, iK6, iK2);
            Context context11 = getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
            View viewA5 = a(context11, iK5, iK);
            constraintLayout.addView(viewA);
            constraintLayout.addView(viewA2);
            constraintLayout.addView(viewA3);
            constraintLayout.addView(viewA4);
            constraintLayout.addView(viewA5);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(constraintLayout);
            constraintSet.connect(viewA.getId(), 6, 0, 6, iK);
            constraintSet.connect(viewA.getId(), 4, viewA4.getId(), 3, iK3);
            constraintSet.connect(viewA2.getId(), 7, viewA3.getId(), 6);
            constraintSet.connect(viewA2.getId(), 6, viewA.getId(), 7);
            constraintSet.connect(viewA2.getId(), 3, viewA.getId(), 3);
            constraintSet.connect(viewA3.getId(), 7, 0, 7, iK);
            constraintSet.connect(viewA3.getId(), 3, viewA.getId(), 3);
            constraintSet.connect(viewA4.getId(), 6, 0, 6);
            constraintSet.connect(viewA4.getId(), 7, 0, 7);
            constraintSet.connect(viewA4.getId(), 4, viewA5.getId(), 3, iK2);
            constraintSet.connect(viewA5.getId(), 6, 0, 6);
            constraintSet.connect(viewA5.getId(), 7, 0, 7);
            constraintSet.connect(viewA5.getId(), 4, 0, 4, iK3);
            constraintSet.applyTo(constraintLayout);
        } else {
            if (!(model instanceof v)) {
                throw new NoWhenBranchMatchedException();
            }
            v vVar = (v) model;
            kli.a.b(this.f, vVar.f59551a, ty0.f.f275450a);
            kli.a.b(this.f59426g, vVar.f59552b, ty0.f.f275450a);
            Object obj2 = this.f59424b;
            ArrayList arrayList = vVar.f59553c;
            boolean zF = Intrinsics.f(obj2, arrayList);
            CarouselItemModel carouselItemModel = vVar.d;
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            int iIndexOf = arrayList.indexOf(carouselItemModel);
            boolean z3 = (iIndexOf == getCurrentPosition() || iIndexOf == -1) ? false : true;
            if (!zF) {
                this.f59424b = arrayList;
            }
            if (z3) {
                c(iIndexOf);
                this.f59423a.onNext(Integer.valueOf(iIndexOf));
            }
            if (!zF || z3) {
                b();
            }
        }
        this.f59427h.setVisibility(model instanceof v ? 0 : 8);
        ShimmerFrameLayout shimmerFrameLayout3 = this.i;
        if (shimmerFrameLayout3 != null) {
            shimmerFrameLayout3.setVisibility(z ? 0 : 8);
        }
    }

    @Override // tx0.x2
    public final int w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectCarouselNavBarContentView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
