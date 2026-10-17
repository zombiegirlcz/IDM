package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ao;
import ip0.cp;
import ip0.dk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/IconDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/IconDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/g7;", "<init>", "()V", "Companion", "Model", "ip0/cp", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IconDelegate extends BaseRecyclerViewDelegate<Model, g7> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52482c;
    public final ihm.f d;

    public IconDelegate() {
        super(R$layout.internal_delegate_icon, new dk(22));
        this.f52482c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new g7(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_icon));
    }

    public final efm.r p() {
        efm.r map = this.f52482c.map(new ao(1, new ip0.za(6)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(g7 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        CircleBadgeView circleBadgeView = holder.i;
        CircleBadgeView circleBadgeView2 = holder.f54202h;
        CutoutImageView cutoutImageView = holder.f54201g;
        TextView textView = holder.k;
        ix0.l0 l0Var = holder.f54206n;
        if (payloads.isEmpty()) {
            cutoutImageView.setClipToOutline(true);
            cutoutImageView.setOutlineProvider(holder.f54205m);
            Image imageMedia = data.f52484b;
            Intrinsics.checkNotNullParameter(imageMedia, "imageMedia");
            xv0.m.e0(holder, imageMedia, cutoutImageView, null, 14);
            circleBadgeView2.setBadgeAndVisibility(data.e, l0Var);
            circleBadgeView.setBadgeAndVisibility(data.f, l0Var);
            kli.a.b(textView, data.f52485c, ty0.f.f275450a);
            textView.setMaxLines(data.d ? 1 : 2);
            holder.F(data.f52486g);
            holder.H(data.f52487h);
        } else {
            List list = payloads;
            ArrayList<cp> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.IconDelegate.Payload");
                arrayList.add((cp) obj2);
            }
            for (cp cpVar : arrayList) {
                if (cpVar.f163768a) {
                    Image imageMedia2 = data.f52484b;
                    Intrinsics.checkNotNullParameter(imageMedia2, "imageMedia");
                    xv0.m.e0(holder, imageMedia2, cutoutImageView, null, 14);
                }
                if (cpVar.f163769b) {
                    circleBadgeView2.setBadgeAndVisibility(data.e, l0Var);
                }
                if (cpVar.f163770c) {
                    circleBadgeView.setBadgeAndVisibility(data.f, l0Var);
                }
                if (cpVar.d) {
                    kli.a.b(textView, data.f52485c, ty0.f.f275450a);
                }
                if (cpVar.e) {
                    textView.setMaxLines(data.d ? 1 : 2);
                }
                if (cpVar.f) {
                    holder.F(data.f52486g);
                }
                if (cpVar.f163771g) {
                    holder.H(data.f52487h);
                }
            }
        }
        Clause clause = data.f52485c;
        py0.d cVar = clause != null ? new py0.c(clause) : new py0.b(data.f52484b);
        fp0.p pVar = holder.f54203j;
        fp0.p.b(pVar, true);
        View view = pVar.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new ip0.d6(data, cVar, this, data, holder, 3));
        holder.itemView.setOnLongClickListener(new ip0.af(this, data, holder, 1));
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/IconDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/d7", "com/revolut/core/ui_kit/delegates/e7", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f52484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52485c;
        public final boolean d;
        public final CircleBadgeModel e;
        public final CircleBadgeModel f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d7 f52486g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e7 f52487h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f52488j;

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Image image, Clause clause, Object obj2, int i) {
            Clause clause2 = (i & 4) != 0 ? null : clause;
            Object obj3 = (i & 32) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            this(listId, image, clause2, null, null, null, obj3, null, 200);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new IconDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getK() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53284a() {
            return this.f52483a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52483a, model.f52483a) && Intrinsics.f(this.f52484b, model.f52484b) && Intrinsics.f(this.f52485c, model.f52485c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52486g, model.f52486g) && this.f52487h == model.f52487h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52488j, model.f52488j);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f52488j;
        }

        public final int hashCode() {
            int iC = a10.b.c(this.f52484b, this.f52483a.hashCode() * 31, 31);
            Clause clause = this.f52485c;
            int iC2 = j6.a.c((iC + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
            CircleBadgeModel circleBadgeModel = this.e;
            int iHashCode = (iC2 + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31;
            CircleBadgeModel circleBadgeModel2 = this.f;
            int iHashCode2 = (this.f52487h.hashCode() + ((this.f52486g.hashCode() + ((iHashCode + (circleBadgeModel2 == null ? 0 : circleBadgeModel2.hashCode())) * 31)) * 31)) * 31;
            Object obj2 = this.i;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52488j;
            return iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52488j = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new cp(!Intrinsics.f(model.f52484b, this.f52484b), !Intrinsics.f(model.e, this.e), !Intrinsics.f(model.f, this.f), !Intrinsics.f(model.f52485c, this.f52485c), model.d != this.d, !Intrinsics.f(model.f52486g, this.f52486g), model.f52487h != this.f52487h);
        }

        public Model(String listId, Image image, Clause clause, CircleBadgeModel circleBadgeModel, CircleBadgeModel circleBadgeModel2, e7 widthStyle, Object obj2, AnalyticsContext analyticsContext, int i) {
            d7 labelStyle;
            clause = (i & 4) != 0 ? null : clause;
            boolean z = (i & 8) == 0;
            if ((i & 64) != 0) {
                labelStyle = b7.f53715a;
            } else {
                labelStyle = c7.f53745a;
            }
            widthStyle = (i & 128) != 0 ? e7.MATCH_PARENT : widthStyle;
            obj2 = (i & 256) != 0 ? null : obj2;
            analyticsContext = (i & 512) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(labelStyle, "labelStyle");
            Intrinsics.checkNotNullParameter(widthStyle, "widthStyle");
            this.f52483a = listId;
            this.f52484b = image;
            this.f52485c = clause;
            this.d = z;
            this.e = circleBadgeModel;
            this.f = circleBadgeModel2;
            this.f52486g = labelStyle;
            this.f52487h = widthStyle;
            this.i = obj2;
            this.f52488j = analyticsContext;
        }
    }
}
