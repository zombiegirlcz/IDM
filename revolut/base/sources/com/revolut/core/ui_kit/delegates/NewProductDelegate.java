package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.kt;
import ip0.ux;
import ip0.vx;
import ip0.ws;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NewProductDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/NewProductDelegate$Model;", "Lip0/vx;", "<init>", "()V", "Model", "ip0/ux", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewProductDelegate extends BaseRecyclerViewDelegate<Model, vx> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52780c;
    public final ihm.f d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NewProductDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextLocalisedClause f52782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f52783c;
        public final LayeredImage d;
        public final UrlImage e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f52784g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public qv0.c f52785h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f52786j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52787l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52788m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f52789n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f52790p;

        public Model(String listId, TextLocalisedClause title, Clause clause, LayeredImage icon, UrlImage urlImage, Object obj2) {
            int i = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f52781a = listId;
            this.f52782b = title;
            this.f52783c = clause;
            this.d = icon;
            this.e = urlImage;
            this.f = obj2;
            this.f52784g = null;
            this.f52785h = positionInBox;
            this.i = null;
            this.f52786j = null;
            this.k = null;
            this.f52787l = null;
            this.f52788m = i;
            this.f52789n = i;
            this.o = i;
            this.f52790p = i;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new NewProductDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55076n() {
            return this.f;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF58231a() {
            return this.f52781a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f52781a.equals(model.f52781a) && this.f52782b.equals(model.f52782b) && this.f52783c.equals(model.f52783c) && this.d.equals(model.d) && this.e.equals(model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52784g, model.f52784g) && Intrinsics.f(this.f52785h, model.f52785h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52786j, model.f52786j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52787l, model.f52787l) && this.f52788m == model.f52788m && this.f52789n == model.f52789n && this.o == model.o && this.f52790p == model.f52790p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getU() {
            return this.f52788m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52788m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getO() {
            return this.f52784g;
        }

        public final int hashCode() {
            int iC = j6.a.c(ip0.v7.g(this.e, h30.l.e(this.d, p.a.b(t61.a.a(this.f52781a.hashCode() * 31, 31, this.f52782b), 31, this.f52783c), 961), 31), 961, true);
            Object obj2 = this.f;
            int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52784g;
            int i = h30.l.i(this.f52785h, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.i;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52786j;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.k;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52787l;
            return Integer.hashCode(this.f52790p) + j6.a.b(this.o, j6.a.b(this.f52789n, j6.a.b(this.f52788m, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF55078q() {
            return this.f52787l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52785h = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF55079r() {
            return this.i;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52786j = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getV() {
            return this.f52789n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF55083x() {
            return this.f52790p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52789n = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF55077p() {
            return this.f52785h;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF55081t() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF55080s() {
            return this.f52786j;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52787l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52784g = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF55082w() {
            return this.o;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.k = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ux(!model.f52782b.equals(this.f52782b), !model.f52783c.equals(this.f52783c), !model.d.equals(this.d), !model.e.equals(this.e), !Intrinsics.f(model.f52785h, this.f52785h), false, !true, false);
        }
    }

    public NewProductDelegate() {
        super(R$layout.internal_delegate_new_product, new fv(15));
        this.f52780c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    public static void p(ImageView imageView, Image image) {
        yy0.f.e(or0.u.k(imageView).Q(), image, imageView, null, null, 12);
    }

    public static void r(vx vxVar, Model model) {
        View view = vxVar.itemView;
        model.getClass();
        view.setEnabled(true);
        View view2 = vxVar.itemView;
        Intrinsics.i(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view2;
        int childCount = viewGroup.getChildCount();
        for (int iD = 0; iD < childCount; iD = m72.b.d(viewGroup, iD, 1.0f, iD, 1)) {
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final boolean f(int i, koi.j data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data instanceof Model;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new vx(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_new_product));
    }

    /* JADX WARN: Type inference failed for: r2v24, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(vx holder, Model data, int i, List payloads) {
        vx vxVar;
        String str;
        ux uxVar;
        Function1 function1;
        String str2;
        NewProductDelegate newProductDelegate;
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TagView tagView = holder.k;
        TagView tagView2 = holder.f166904j;
        CircleProgressBar circleProgressBar = holder.f166905l;
        ImageView imageView = holder.i;
        TextView textView = holder.f166903h;
        TextView textView2 = holder.f166902g;
        ImageView imageView2 = holder.f;
        if (payloads.isEmpty()) {
            or0.b.e(this, data.f52782b, textView2, null, 12);
            or0.b.e(this, data.f52783c, textView, null, 12);
            p(imageView2, data.d);
            circleProgressBar.setVisibility(8);
            p(imageView, data.e);
            tagView2.setVisibility(8);
            tagView.setVisibility(8);
            r(holder, data);
            vxVar = holder;
            View view = vxVar.itemView;
            str = "itemView";
            Intrinsics.checkNotNullExpressionValue(view, str);
            or0.b.c(this, data, view, false, null, 28);
        } else {
            Object objB0 = zhm.d0.b0(payloads);
            Intrinsics.i(objB0, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.NewProductDelegate.Payload");
            ux uxVar2 = (ux) objB0;
            if (uxVar2.e) {
                View itemView = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                uxVar = uxVar2;
                str2 = "itemView";
                function1 = null;
                newProductDelegate = this;
                or0.b.c(newProductDelegate, data, itemView, false, null, 28);
            } else {
                uxVar = uxVar2;
                function1 = null;
                str2 = "itemView";
                newProductDelegate = this;
            }
            if (uxVar.f166734a) {
                or0.b.e(newProductDelegate, data.f52782b, textView2, function1, 12);
            }
            if (uxVar.f166735b) {
                or0.b.e(newProductDelegate, data.f52783c, textView, function1, 12);
            }
            if (uxVar.f166736c) {
                p(imageView2, data.d);
            }
            if (uxVar.d) {
                p(imageView, data.e);
            }
            if (uxVar.f) {
                r(holder, data);
            }
            if (uxVar.f166737g) {
                data.getClass();
                i2 = 8;
                circleProgressBar.setVisibility(8);
            } else {
                i2 = 8;
            }
            if (uxVar.f166738h) {
                data.getClass();
                tagView2.setVisibility(i2);
                tagView.setVisibility(i2);
            }
            vxVar = holder;
            str = str2;
        }
        View view2 = vxVar.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, str);
        py0.c cVar = new py0.c(data.f52782b);
        or0.m.a(view2);
        view2.setOnClickListener(new kt(data, cVar, this, data, 7));
        imageView2.setOnClickListener(new ws(this, data, 4));
    }
}
