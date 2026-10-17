package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.kt;
import ip0.yx;
import ip0.zx;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NewProductSmallDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/NewProductSmallDelegate$Model;", "Lip0/zx;", "<init>", "()V", "Companion", "Model", "ip0/yx", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewProductSmallDelegate extends BaseRecyclerViewDelegate<Model, zx> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52791c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NewProductSmallDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextLocalisedClause f52793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f52794c;
        public final CdnImage d;
        public final Object e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f52795g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f52796h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f52797j;
        public qv0.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52798l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52799m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52800n;
        public p31.c o;

        public Model(String listId, TextLocalisedClause title, TextLocalisedClause description, CdnImage icon, Parcelable parcelable, int i) {
            parcelable = (i & 64) != 0 ? null : parcelable;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.f52792a = listId;
            this.f52793b = title;
            this.f52794c = description;
            this.d = icon;
            this.e = parcelable;
            this.f = null;
            this.f52795g = i2;
            this.f52796h = i2;
            this.i = i2;
            this.f52797j = i2;
            this.k = new c.e((qv0.h) null, 3);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new NewProductSmallDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF() {
            return this.e;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53642a() {
            return this.f52792a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f52792a.equals(model.f52792a) && this.f52793b.equals(model.f52793b) && this.f52794c.equals(model.f52794c) && this.d.equals(model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f52795g == model.f52795g && this.f52796h == model.f52796h && this.i == model.i && this.f52797j == model.f52797j;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getI() {
            return this.f52795g;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52795g = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53649m() {
            return this.f;
        }

        public final int hashCode() {
            int iC = j6.a.c((this.d.hashCode() + t61.a.a(t61.a.a(this.f52792a.hashCode() * 31, 31, this.f52793b), 31, this.f52794c)) * 961, 31, true);
            Object obj2 = this.e;
            int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f;
            return Integer.hashCode(this.f52797j) + j6.a.b(this.i, j6.a.b(this.f52796h, j6.a.b(this.f52795g, (iHashCode + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getE() {
            return this.f52798l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.k = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF() {
            return this.f52799m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52800n = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53647j() {
            return this.f52796h;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53648l() {
            return this.f52797j;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52796h = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getD() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53646h() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53645g() {
            return this.f52800n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52798l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getK() {
            return this.i;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52799m = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.o = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new yx(!model.f52793b.equals(this.f52793b), !model.f52794c.equals(this.f52794c), !model.d.equals(this.d), !Intrinsics.f(model.k, this.k), !true, false);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public NewProductSmallDelegate() {
        super(R$layout.internal_delegate_new_product_small, new fv(17));
        this.f52791c = v0.a.d("create(...)");
    }

    public static void p(ImageView imageView, CdnImage cdnImage) {
        int i;
        int iK;
        int iK2;
        yy0.f.e(or0.u.k(imageView).Q(), cdnImage, imageView, null, null, 12);
        if (rd0.e.m(imageView)) {
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 56.0f);
            Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK2 = kli.a.k(context2, 16.0f);
            i = iK;
        } else {
            Context context3 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iK3 = kli.a.k(context3, 96.0f);
            Context context4 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            i = iK3;
            iK = kli.a.k(context4, 98.0f);
            iK2 = 0;
        }
        or0.u.A(imageView, iK, i);
        or0.u.z(imageView, 0, 0, iK2, 0, false, 27);
    }

    public static void r(zx zxVar, Model model) {
        View view = zxVar.itemView;
        model.getClass();
        view.setEnabled(true);
        View view2 = zxVar.itemView;
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
        return new zx(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_new_product_small));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(zx holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f167545h;
        ImageView imageView = holder.i;
        TextView textView2 = holder.f167544g;
        TextView textView3 = holder.f;
        if (payloads.isEmpty()) {
            or0.b.e(this, data.f52793b, textView3, null, 4);
            or0.b.e(this, data.f52794c, textView2, null, 12);
            or0.b.e(this, null, textView, null, 12);
            p(imageView, data.d);
            r(holder, data);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        } else {
            Object objB0 = zhm.d0.b0(payloads);
            Intrinsics.i(objB0, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.NewProductSmallDelegate.Payload");
            yx yxVar = (yx) objB0;
            if (yxVar.d) {
                View itemView2 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                or0.b.c(this, data, itemView2, false, null, 28);
            }
            if (yxVar.f167364a) {
                or0.b.e(this, data.f52793b, textView3, null, 12);
            }
            if (yxVar.f167365b) {
                or0.b.e(this, data.f52794c, textView2, null, 12);
            }
            if (yxVar.f167366c) {
                p(imageView, data.d);
            }
            if (yxVar.e) {
                data.getClass();
                or0.b.e(this, null, textView, null, 12);
            }
            if (yxVar.f) {
                r(holder, data);
            }
        }
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        py0.c cVar = new py0.c(data.f52793b);
        or0.m.a(itemView3);
        itemView3.setOnClickListener(new kt(data, cVar, this, data, 8));
    }
}
