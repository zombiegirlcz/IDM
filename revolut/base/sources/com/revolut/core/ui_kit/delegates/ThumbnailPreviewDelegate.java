package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.NewBadgeView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.feature.backgroundpicker.impl.interactor.ThemesInteractor$Theme;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.al0;
import ip0.bl0;
import ip0.kt;
import ip0.xk0;
import ip0.yk0;
import ip0.zk0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0005\u0006\u0007\u0003\b\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ThumbnailPreviewDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ThumbnailPreviewDelegate$Model;", "Lip0/bl0;", "Companion", "Model", "ip0/al0", "ip0/xk0", "a", "Lcom/revolut/core/ui_kit/delegates/DarkModeThumbnailPreviewDelegate;", "Lcom/revolut/core/ui_kit/delegates/LightModeThumbnailPreviewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SystemModeThumbnailPreviewDelegate;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ThumbnailPreviewDelegate extends BaseRecyclerViewDelegate<Model, bl0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53548c;
    public final ihm.f d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ThumbnailPreviewDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/ei", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NavBarWithContainerBackground f53550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53551c;
        public final boolean d;
        public final al0 e;
        public final ei f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextLocalisedClause f53552g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ThemesInteractor$Theme f53553h;
        public Parcelable i;

        public Model(String listId, NavBarWithContainerBackground background, Clause label, boolean z, al0 state, ei previewMode, TextLocalisedClause textLocalisedClause, ThemesInteractor$Theme themesInteractor$Theme) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(previewMode, "previewMode");
            this.f53549a = listId;
            this.f53550b = background;
            this.f53551c = label;
            this.d = z;
            this.e = state;
            this.f = previewMode;
            this.f53552g = textLocalisedClause;
            this.f53553h = themesInteractor$Theme;
            this.i = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SystemModeThumbnailPreviewDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55191g() {
            return this.f53553h;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53549a() {
            return this.f53549a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53549a, model.f53549a) && this.f53550b.equals(model.f53550b) && Intrinsics.f(this.f53551c, model.f53551c) && this.d == model.d && this.e.equals(model.e) && this.f == model.f && Intrinsics.f(this.f53552g, model.f53552g) && this.f53553h.equals(model.f53553h) && Intrinsics.f(this.i, model.i);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.i;
        }

        public final int hashCode() {
            int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + j6.a.c(p.a.a((this.f53550b.hashCode() + (this.f53549a.hashCode() * 31)) * 31, 31, this.f53551c), 31, this.d)) * 31)) * 31;
            TextLocalisedClause textLocalisedClause = this.f53552g;
            int iHashCode2 = (this.f53553h.hashCode() + ((iHashCode + (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode())) * 31)) * 31;
            Parcelable parcelable = this.i;
            return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new xk0(!r9.f53550b.equals(this.f53550b), !Intrinsics.f(r9.f53551c, this.f53551c), ((Model) oldItem).d != this.d, !r9.e.equals(this.e), !Intrinsics.f(r9.f53552g, this.f53552g));
        }
    }

    public ThumbnailPreviewDelegate(Function2 function2, int i, int i2) {
        super(i, function2);
        this.f53548c = i2;
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        View viewInflate = LayoutInflater.from(ix0.l1.a(context, context2, this.f53548c)).inflate(R$layout.internal_delegate_thumbnail_preview, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        return new bl0(context3, viewInflate);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(bl0 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.f163625j;
        NewBadgeView newBadgeView = holder.i;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof xk0) {
                zN = zN || ((xk0) next).f167189a;
                zN2 = zN2 || ((xk0) next).f167190b;
                zN3 = zN3 || ((xk0) next).e;
                zN4 = zN4 || ((xk0) next).f167191c;
                zN5 = zN5 || ((xk0) next).d;
            }
        }
        if (zN) {
            holder.f.setBackground(data.f53550b);
        }
        if (zN2) {
            View view2 = holder.itemView;
            ty0.c.b(h30.l.x(view2, "itemView", view2), data.f53551c, holder.f163624h, null, null, 12);
        }
        if (zN3) {
            TextLocalisedClause textLocalisedClause = data.f53552g;
            if (textLocalisedClause != null) {
                newBadgeView.setContent(new NewBadgeContent.WithText(textLocalisedClause));
                newBadgeView.setVisibility(0);
            } else {
                newBadgeView.setVisibility(8);
            }
        }
        if (zN4) {
            holder.f163623g.setVisibility(data.d ? 0 : 8);
        }
        if (zN5) {
            al0 al0Var = data.e;
            if (al0Var.equals(yk0.f167328a)) {
                holder.k.setImageDrawable(null);
                view.setVisibility(8);
            } else {
                if (!(al0Var instanceof zk0)) {
                    throw new NoWhenBranchMatchedException();
                }
                View view3 = holder.itemView;
                yy0.f.e(h30.l.z(view3, "itemView", view3), ((zk0) data.e).f167484a, holder.k, null, null, 12);
                view.setVisibility(0);
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        py0.c cVar = new py0.c(data.f53551c);
        or0.m.a(itemView);
        itemView.setOnClickListener(new kt(data, cVar, this, data, 23));
    }
}
