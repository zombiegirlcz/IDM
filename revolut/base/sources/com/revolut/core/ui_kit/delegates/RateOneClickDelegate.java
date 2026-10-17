package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.AnimatedImageSwitcher;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.EmojiImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.b90;
import ip0.f90;
import ip0.g90;
import ip0.l40;
import ip0.w10;
import ip0.ws;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000f\u0002\u0003\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RateOneClickDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/f90;", "Lcom/revolut/core/ui_kit/delegates/he;", "<init>", "()V", "Companion", "ip0/g90", "ip0/d90", "ip0/b90", "ip0/j90", "ip0/h90", "ip0/c90", "ip0/e90", "ip0/k90", "ip0/i90", "b", "RateOneClickSingleItemDelegate", "RateOneClickProgressiveItemDelegate", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RateOneClickDelegate extends BaseRecyclerViewDelegate<f90, he> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53145c;
    public final ihm.f d;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RateOneClickDelegate$RateOneClickProgressiveItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ce;", "Lcom/revolut/core/ui_kit/delegates/de;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RateOneClickProgressiveItemDelegate extends BaseRecyclerViewDelegate<ce, de> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w10 f53146c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RateOneClickProgressiveItemDelegate(w10 onItemClicked) {
            super(2, new l40(26));
            Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
            this.f53146c = onItemClicked;
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new de(parent);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(final de holder, ce data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            AnimatedImageSwitcher animatedImageSwitcher = holder.f;
            int size = payloads.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (!(payloads.get(i2) instanceof be)) {
                    payloads = null;
                    break;
                }
                i2++;
            }
            List list = payloads;
            boolean z = list == null || list.isEmpty();
            if (payloads != null) {
                Iterator it8 = payloads.iterator();
                while (it8.hasNext()) {
                    z |= ((be) it8.next()).f53727a;
                }
            }
            if (z) {
                Image image = data.f53751b;
                Intrinsics.checkNotNullParameter(image, "image");
                animatedImageSwitcher.setImage(image);
            }
            animatedImageSwitcher.setOnClickListener(new View.OnClickListener() { // from class: com.revolut.core.ui_kit.delegates.ae
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f53679a.f53146c.invoke(Integer.valueOf(holder.getBindingAdapterPosition()));
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RateOneClickDelegate$RateOneClickSingleItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/fe;", "Lcom/revolut/core/ui_kit/delegates/ge;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RateOneClickSingleItemDelegate extends BaseRecyclerViewDelegate<fe, ge> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w10 f53147c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RateOneClickSingleItemDelegate(w10 onItemClicked) {
            super(1, new l40(27));
            Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
            this.f53147c = onItemClicked;
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SmallActionButton smallActionButton = new SmallActionButton(context, null, 6, 0);
            smallActionButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return new ge(smallActionButton);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(ge holder, fe data, int i, List payloads) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            int size = payloads.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (!(payloads.get(i2) instanceof ee)) {
                    payloads = null;
                    break;
                }
                i2++;
            }
            List list = payloads;
            boolean z4 = list == null || list.isEmpty();
            if (payloads != null) {
                z = z4;
                z3 = z;
                for (ee eeVar : payloads) {
                    z4 |= eeVar.f54122a;
                    z |= eeVar.f54123b;
                    z3 |= eeVar.f54124c;
                }
            } else {
                z = z4;
                z3 = z;
            }
            SmallActionButton smallActionButton = holder.f;
            if (z4) {
                smallActionButton.setIcon(data.f54163b);
                smallActionButton.setIconsColorFilterEnabled(!(data.f54163b instanceof EmojiImage));
            }
            if (z) {
                smallActionButton.setText(data.f54164c);
            }
            if (z3) {
                smallActionButton.i(data.d ? ms0.h4.ACCENT : ms0.h4.SEMIACCENT);
            }
            w10 listener = this.f53147c;
            Intrinsics.checkNotNullParameter(listener, "listener");
            holder.f54218g = listener;
        }
    }

    public static final class a {
        private a() {
        }
    }

    public static final class b extends RecyclerView.LayoutManager {
        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
            return new RecyclerView.LayoutParams(-2, -2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean isAutoMeasureEnabled() {
            return true;
        }

        public final int m(ie ieVar, int i, int i2) {
            int decoratedMeasuredWidth = i2;
            for (View view : ieVar.f54293a) {
                addView(view);
                int i3 = i;
                or0.g.a(this, view, decoratedMeasuredWidth, i3, getDecoratedMeasuredWidth(view) + decoratedMeasuredWidth, getDecoratedMeasuredHeight(view) + i);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                decoratedMeasuredWidth += getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                i = i3;
            }
            return i + ieVar.f54294b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(recycler, "recycler");
            Intrinsics.checkNotNullParameter(state, "state");
            if (state.getItemCount() == 0) {
                removeAndRecycleAllViews(recycler);
                return;
            }
            detachAndScrapAttachedViews(recycler);
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int paddingTop = getPaddingTop();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int itemCount = getItemCount();
            int rightDecorationWidth = 0;
            int i = 0;
            int iMax = 0;
            for (int i2 = 0; i2 < itemCount; i2++) {
                View viewForPosition = recycler.getViewForPosition(i2);
                Intrinsics.checkNotNullExpressionValue(viewForPosition, "getViewForPosition(...)");
                measureChildWithMargins(viewForPosition, 0, 0);
                ViewGroup.LayoutParams layoutParams = viewForPosition.getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                if (i + decoratedMeasuredWidth > width && !arrayList2.isEmpty()) {
                    arrayList.add(new ie(iMax, new ArrayList(arrayList2)));
                    arrayList2.clear();
                    i = 0;
                    iMax = 0;
                }
                arrayList2.add(viewForPosition);
                i += decoratedMeasuredWidth;
                ViewGroup.LayoutParams layoutParams3 = viewForPosition.getLayoutParams();
                Intrinsics.i(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.LayoutParams layoutParams4 = (RecyclerView.LayoutParams) layoutParams3;
                iMax = Math.max(iMax, getDecoratedMeasuredHeight(viewForPosition) + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new ie(iMax, new ArrayList(arrayList2)));
            }
            if (arrayList.size() != 1) {
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    paddingTop = m((ie) it8.next(), paddingTop, getPaddingLeft());
                }
                return;
            }
            ie ieVar = (ie) arrayList.get(0);
            ArrayList<View> arrayList3 = ieVar.f54293a;
            if (arrayList3.isEmpty()) {
                return;
            }
            for (View view : arrayList3) {
                ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                Intrinsics.i(layoutParams5, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.LayoutParams layoutParams6 = (RecyclerView.LayoutParams) layoutParams5;
                rightDecorationWidth += getRightDecorationWidth(view) + getLeftDecorationWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin;
            }
            int size = (width - rightDecorationWidth) / arrayList3.size();
            for (View view2 : arrayList3) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getDecoratedMeasuredHeight(view2), 1073741824));
            }
            m(ieVar, paddingTop, getPaddingLeft());
        }
    }

    public RateOneClickDelegate() {
        super(R$layout.internal_delegate_rate_one_click, new l40(25));
        this.f53145c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new he(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(he holder, f90 data, int i, List list) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        RateOneClickDelegate rateOneClickDelegate;
        List<g90> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TextView textView = holder.f54241j;
        TextView textView2 = holder.i;
        ImageView imageView = holder.f54239g;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof g90)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list2 = payloads;
        boolean z11 = list2 == null || list2.isEmpty();
        if (payloads != null) {
            boolean z12 = z11;
            boolean z29 = z12;
            boolean z31 = z29;
            boolean z41 = z31;
            for (g90 g90Var : payloads) {
                boolean z49 = z12 || g90Var.f164372a;
                z12 = z12 || g90Var.f164373b;
                z29 = z29 || g90Var.f164374c;
                z31 = z31 || g90Var.d;
                z41 = z41 || g90Var.e;
                z11 = z49;
            }
            z4 = z31;
            z6 = z41;
            z = z12;
            z3 = z29;
        } else {
            z = z11;
            z3 = z;
            z4 = z3;
            z6 = z4;
        }
        if (z11) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            rateOneClickDelegate = this;
            or0.b.c(rateOneClickDelegate, data, itemView, false, null, 28);
        } else {
            rateOneClickDelegate = this;
        }
        if (z) {
            kli.a.b(holder.f, data.f164222c, ty0.f.f275450a);
        }
        if (z3) {
            imageView.setVisibility(data.d ? 0 : 8);
        }
        if (z4) {
            holder.F(data.f164221b);
        }
        if (z6) {
            b90 b90Var = data.e;
            if (b90Var == null) {
                kli.a.b(textView2, null, ty0.f.f275450a);
                kli.a.b(textView, null, ty0.f.f275450a);
            } else {
                kli.a.b(textView2, b90Var.f163566a, ty0.f.f275450a);
                kli.a.b(textView, b90Var.f163567b, ty0.f.f275450a);
            }
        }
        if (imageView.getVisibility() == 8) {
            imageView.setOnClickListener(null);
            or0.u.d(imageView);
        } else {
            imageView.setOnClickListener(new ws(rateOneClickDelegate, data, 18));
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iW = kli.a.w(R$attr.uikit_dp16, context);
            or0.u.l(imageView, iW, iW, iW, iW);
        }
        hsa.l listener = new hsa.l(data, 25, holder, rateOneClickDelegate);
        Intrinsics.checkNotNullParameter(listener, "listener");
        holder.k = listener;
    }
}
