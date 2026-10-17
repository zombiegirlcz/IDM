package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.AnimatedBorderGradientDrawable;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.je0;
import ip0.oh0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SummaryCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SummaryCardDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/th;", "<init>", "()V", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SummaryCardDelegate extends BaseRecyclerViewDelegate<Model, th> {

    @NotNull
    private static final a Companion = new a();
    public static final yp0.p d = new yp0.p(R$attr.uikit_colorForeground);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53497c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SummaryCardDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/sh", "com/revolut/core/ui_kit/delegates/ph", "com/revolut/core/ui_kit/delegates/qh", "com/revolut/core/ui_kit/delegates/rh", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextClause f53498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextClause f53499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AvatarModel.Default f53500c;
        public final ph d;
        public final ph e;
        public Parcelable f;

        public Model(TextClause title, TextClause description, AvatarModel.Default avatarModel, ph primaryInfo, ph secondaryInfo) {
            Intrinsics.checkNotNullParameter("portfolio_reveal_card", "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
            Intrinsics.checkNotNullParameter(primaryInfo, "primaryInfo");
            Intrinsics.checkNotNullParameter(secondaryInfo, "secondaryInfo");
            this.f53498a = title;
            this.f53499b = description;
            this.f53500c = avatarModel;
            this.d = primaryInfo;
            this.e = secondaryInfo;
            this.f = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SummaryCardDelegate();
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b */
        public final String getF52324a() {
            return "portfolio_reveal_card";
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f53498a.equals(model.f53498a) && this.f53499b.equals(model.f53499b) && this.f53500c.equals(model.f53500c) && this.d.equals(model.d) && this.e.equals(model.e) && Intrinsics.f(this.f, model.f);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f53500c.hashCode() + ip0.v7.b(ip0.v7.b(60005781, 31, this.f53498a), 31, this.f53499b)) * 31)) * 31)) * 31;
            Parcelable parcelable = this.f;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new sh(!this.f53498a.equals(r9.f53498a), !this.f53499b.equals(r9.f53499b), !this.f53500c.equals(r9.f53500c), !this.d.equals(r9.d), !this.e.equals(r9.e));
            }
            return null;
        }
    }

    public static final class a {
        private a() {
        }
    }

    public SummaryCardDelegate() {
        super(R$layout.internal_delegate_summary_card, new je0(24));
        this.f53497c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        th thVar = new th(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_summary_card));
        c.e eVar = new c.e(qv0.h.EXTRA_LARGE, 2);
        View view = thVar.f;
        or0.b.j(this, eVar, view);
        oh0.a(view);
        return thVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: h */
    public final void o(RecyclerView.ViewHolder viewHolder) {
        th holder = (th) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = oh0.f165664a;
        View view = holder.f;
        Intrinsics.checkNotNullParameter(view, "view");
        AnimatedBorderGradientDrawable animatedBorderGradientDrawableB = oh0.b(view.getBackground());
        if (animatedBorderGradientDrawableB != null) {
            animatedBorderGradientDrawableB.stop();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: k */
    public final void n(RecyclerView.ViewHolder viewHolder) {
        th holder = (th) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = oh0.f165664a;
        View view = holder.f;
        Intrinsics.checkNotNullParameter(view, "view");
        AnimatedBorderGradientDrawable animatedBorderGradientDrawableB = oh0.b(view.getBackground());
        if (animatedBorderGradientDrawableB != null) {
            animatedBorderGradientDrawableB.start();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void n(koi.b bVar) {
        th holder = (th) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = oh0.f165664a;
        View view = holder.f;
        Intrinsics.checkNotNullParameter(view, "view");
        AnimatedBorderGradientDrawable animatedBorderGradientDrawableB = oh0.b(view.getBackground());
        if (animatedBorderGradientDrawableB != null) {
            animatedBorderGradientDrawableB.start();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void o(koi.b bVar) {
        th holder = (th) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = oh0.f165664a;
        View view = holder.f;
        Intrinsics.checkNotNullParameter(view, "view");
        AnimatedBorderGradientDrawable animatedBorderGradientDrawableB = oh0.b(view.getBackground());
        if (animatedBorderGradientDrawableB != null) {
            animatedBorderGradientDrawableB.stop();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(th holder, Model data, int i, List list) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        ImageView imageView = holder.o;
        ImageView imageView2 = holder.f54788l;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof sh)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list2 = payloads;
        boolean z11 = list2 == null || list2.isEmpty();
        if (payloads != null) {
            int size2 = payloads.size();
            z = z11;
            z3 = z;
            z4 = z3;
            z6 = z4;
            for (int i3 = 0; i3 < size2; i3++) {
                sh shVar = (sh) payloads.get(i3);
                z11 = z11 || shVar.f54720c;
                z = z || shVar.f54718a;
                z3 = z3 || shVar.f54719b;
                z4 = z4 || shVar.d;
                z6 = z6 || shVar.e;
            }
        } else {
            z = z11;
            z3 = z;
            z4 = z3;
            z6 = z4;
        }
        uh onInfoIconClick = new uh(1, 0, ihm.f.class, this.f53497c, "onNext", "onNext(Ljava/lang/Object;)V");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onInfoIconClick, "onInfoIconClick");
        if (z11) {
            holder.f54785g.setModel(data.f53500c);
        }
        if (z) {
            kli.a.b(holder.f54786h, data.f53498a, ty0.f.f275450a);
        }
        if (z3) {
            kli.a.b(holder.i, data.f53499b, ty0.f.f275450a);
        }
        if (z4) {
            holder.F(data.d, holder.f54787j, holder.k, imageView2);
        }
        if (z6) {
            holder.F(data.e, holder.f54789m, holder.f54790n, imageView);
        }
        th.H(data, data.d, rh.PRIMARY, imageView2, onInfoIconClick);
        th.H(data, data.e, rh.SECONDARY, imageView, onInfoIconClick);
    }
}
