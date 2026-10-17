package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fg0;
import ip0.kt;
import ip0.pk0;
import ip0.qk0;
import ip0.ri0;
import ip0.rk0;
import ip0.sk0;
import ip0.tk0;
import ip0.w10;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00062\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u000b\u0003\u0002\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ThemeSwitcherRoundedDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ci;", "Lcom/revolut/core/ui_kit/delegates/di;", "<init>", "()V", "Companion", "ip0/sk0", "ip0/wk0", "ip0/ok0", "ip0/tk0", "ItemDelegate", "ip0/qk0", "Item", "ip0/pk0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThemeSwitcherRoundedDelegate extends BaseRecyclerViewDelegate<ci, di> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f53543c;
    public final e01.a d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ThemeSwitcherRoundedDelegate$Item;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Item implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextLocalisedClause f53545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final sk0 f53546c;
        public final boolean d;
        public final boolean e;
        public Parcelable f;

        public Item(String listId, TextLocalisedClause label, sk0 mode, boolean z, boolean z3, AnalyticsContext analyticsContext) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f53544a = listId;
            this.f53545b = label;
            this.f53546c = mode;
            this.d = z;
            this.e = z3;
            this.f = analyticsContext;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF52946g() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53544a() {
            return this.f53544a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Item)) {
                return false;
            }
            Item item = (Item) obj2;
            return this.f53544a.equals(item.f53544a) && this.f53545b.equals(item.f53545b) && this.f53546c == item.f53546c && this.d == item.d && this.e == item.e && Intrinsics.f(this.f, item.f);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f;
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c((this.f53546c.hashCode() + t61.a.a(this.f53544a.hashCode() * 31, 31, this.f53545b)) * 31, 31, this.d), 961, this.e);
            Parcelable parcelable = this.f;
            return iC + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Item ? (Item) oldItem : null) == null) {
                return null;
            }
            Item item = (Item) oldItem;
            return new pk0(!item.f53545b.equals(this.f53545b), item.f53546c != this.f53546c, item.d != this.d, item.e != this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ThemeSwitcherRoundedDelegate$ItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ThemeSwitcherRoundedDelegate$Item;", "Lip0/qk0;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ItemDelegate extends BaseRecyclerViewDelegate<Item, qk0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ihm.f f53547c;

        public ItemDelegate() {
            super(R$layout.internal_delegate_theme_switcher_rounded_item, new ri0(11));
            this.f53547c = v0.a.d("create(...)");
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new qk0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_theme_switcher_rounded_item));
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(qk0 holder, Item data, int i, List list) {
            j01.e eVar;
            float f;
            int iA;
            List payloads = list;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, list);
            int size = payloads.size();
            int i2 = 0;
            while (true) {
                eVar = null;
                if (i2 >= size) {
                    break;
                }
                if (!(payloads.get(i2) instanceof pk0)) {
                    payloads = null;
                    break;
                }
                i2++;
            }
            if (payloads == null) {
                payloads = zhm.f0.f322471a;
            }
            boolean zIsEmpty = payloads.isEmpty();
            int size2 = payloads.size();
            boolean z = zIsEmpty;
            boolean z3 = z;
            boolean z4 = z3;
            for (int i3 = 0; i3 < size2; i3++) {
                pk0 pk0Var = (pk0) payloads.get(i3);
                z = z || pk0Var.f165844a;
                z4 = z4 || pk0Var.d;
                z3 = z3 || pk0Var.f165845b;
                zIsEmpty = zIsEmpty || pk0Var.f165846c;
            }
            ThemeSwitcherRoundedDelegate themeSwitcherRoundedDelegate = ThemeSwitcherRoundedDelegate.this;
            if (zIsEmpty) {
                boolean z6 = data.d;
                View view = holder.itemView;
                TextView textView = holder.f;
                Context context = view.getContext();
                View view2 = holder.f166011g;
                Intrinsics.h(context);
                Drawable drawable = themeSwitcherRoundedDelegate.f53543c;
                Drawable drawable2 = drawable;
                if (drawable == null) {
                    MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new ShapeAppearanceModel().withCornerSize(kli.a.k(context, 21.0f)));
                    materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
                    materialShapeDrawable.setStrokeColor(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorAccent, context)));
                    materialShapeDrawable.setStrokeWidth(kli.a.k(context, 3.0f));
                    drawable2 = materialShapeDrawable;
                }
                themeSwitcherRoundedDelegate.f53543c = drawable2;
                Drawable drawable3 = drawable2;
                if (!z6) {
                    drawable3 = null;
                }
                view2.setBackground(drawable3);
                int iS = kli.a.s(z6 ? R$attr.uikit_colorAccent : R$attr.uikit_colorGreyTone10, context);
                textView.setTextColor(kli.a.s(z6 ? R$attr.uikit_colorWhite : R$attr.uikit_colorForeground, context));
                Drawable background = textView.getBackground();
                Intrinsics.i(background, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable");
                ((RoundedBackgroundDrawable) background).e(iS);
            }
            if (z) {
                View view3 = holder.itemView;
                ty0.c.b(h30.l.x(view3, "itemView", view3), data.f53545b, holder.f, null, null, 12);
            }
            if (z3) {
                ShapeableImageView shapeableImageView = holder.f166012h;
                sk0 sk0Var = data.f53546c;
                sk0Var.getClass();
                int i5 = rk0.f166201a[sk0Var.ordinal()];
                if (i5 == 1) {
                    iA = jo0.d.DAY.a();
                } else if (i5 == 2) {
                    iA = jo0.d.NIGHT.a();
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iA = jo0.d.SYSTEM.a();
                }
                shapeableImageView.setImageResource(iA);
            }
            if (z4) {
                View view4 = holder.itemView;
                boolean z11 = data.e;
                if (z11) {
                    f = 1.0f;
                } else {
                    if (z11) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 0.4f;
                }
                view4.setAlpha(f);
                View itemView = holder.itemView;
                if (data.e) {
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    eVar = new j01.e(new View[]{itemView});
                }
                itemView.setOnTouchListener(eVar);
            }
            if (!data.e) {
                View itemView2 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                or0.u.o(itemView2);
                return;
            }
            TrackableItem.Companion companion = TrackableItem.INSTANCE;
            Parcelable parcelable = data.f;
            companion.getClass();
            CustomTrackableComponent customTrackableComponentB = TrackableItem.Companion.b(themeSwitcherRoundedDelegate, parcelable);
            View itemView3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            py0.c cVar = new py0.c(data.f53545b);
            or0.m.a(itemView3);
            itemView3.setOnClickListener(new kt(customTrackableComponentB, cVar, this, data, 22));
        }
    }

    public ThemeSwitcherRoundedDelegate() {
        super(R$layout.internal_delegate_theme_switcher_rounded, new ri0(10));
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new di(this, kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_theme_switcher_rounded));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(di holder, ci data, int i, List payloads) {
        ThemeSwitcherRoundedDelegate themeSwitcherRoundedDelegate;
        ci ciVar;
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
            if (!(payloads.get(i2) instanceof tk0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        for (int i3 = 0; i3 < size2; i3++) {
            tk0 tk0Var = (tk0) payloads.get(i3);
            zIsEmpty = zIsEmpty || tk0Var.f166536a;
            z = zIsEmpty || tk0Var.f166537b;
        }
        if (zIsEmpty) {
            holder.f54055g.c(data.f54003b);
        }
        if (z) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            themeSwitcherRoundedDelegate = this;
            ciVar = data;
            or0.b.c(themeSwitcherRoundedDelegate, ciVar, itemView, false, null, 28);
        } else {
            themeSwitcherRoundedDelegate = this;
            ciVar = data;
        }
        efm.r map = holder.f.f53547c.map(new fg0(new w10(ciVar, 19), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        themeSwitcherRoundedDelegate.d.a(map, holder);
    }
}
