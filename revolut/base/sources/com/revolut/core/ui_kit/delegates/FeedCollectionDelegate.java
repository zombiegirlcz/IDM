package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.FeedCollectionDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.internal.views.framelayout.NestedScrollableHost;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\b\u0007\u0003\b\t\n\u000b\f\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FeedCollectionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/FeedCollectionDelegate$Model;", "Lip0/ai;", "<init>", "()V", "Companion", "Model", "ip0/xh", "ip0/yh", "ip0/zh", "ip0/wh", "zi0/c", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FeedCollectionDelegate extends BaseRecyclerViewDelegate<Model, ip0.ai> {
    public static final aw0.d0 k = new aw0.d0(4, 5);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final aw0.d0 f52318l = new aw0.d0(1, 1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final aw0.d0 f52319m = new aw0.d0(343, 382);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChallengeMediumDelegate f52320c;
    public final VoucherSmallTileDelegate d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f52321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f52322h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f52323j;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FeedCollectionDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/m;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem, qv0.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UrlImage f52325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextClause f52326c;
        public final Clause d;
        public final f6 e;
        public final ip0.zh f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ip0.wh f52327g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f52328h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public qv0.c f52329j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52330l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52331m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52332n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f52333p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f52334q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f52335r;

        public Model(UrlImage headerIconImage, TextClause headerTitle, f6 content, ip0.wh favoriteActionState, Clause actionButtonText, Object obj2) {
            ip0.zh shareActionState = ip0.zh.DISABLED;
            int i = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter("COLLECTION_PRODUCT_LIST_ID", "listId");
            Intrinsics.checkNotNullParameter(headerIconImage, "headerIconImage");
            Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(shareActionState, "shareActionState");
            Intrinsics.checkNotNullParameter(favoriteActionState, "favoriteActionState");
            Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
            this.f52324a = "COLLECTION_PRODUCT_LIST_ID";
            this.f52325b = headerIconImage;
            this.f52326c = headerTitle;
            this.d = actionButtonText;
            this.e = content;
            this.f = shareActionState;
            this.f52327g = favoriteActionState;
            this.f52328h = obj2;
            this.i = null;
            this.f52329j = c.d.f249513a;
            this.k = null;
            this.f52330l = null;
            this.f52331m = null;
            this.f52332n = null;
            this.o = i;
            this.f52333p = i;
            this.f52334q = i;
            this.f52335r = i;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new FeedCollectionDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55862c() {
            return this.f52328h;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52550a() {
            return this.f52324a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52324a, model.f52324a) && Intrinsics.f(this.f52325b, model.f52325b) && Intrinsics.f(this.f52326c, model.f52326c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f52327g == model.f52327g && Intrinsics.f(this.f52328h, model.f52328h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52329j, model.f52329j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52330l, model.f52330l) && Intrinsics.f(this.f52331m, model.f52331m) && Intrinsics.f(this.f52332n, model.f52332n) && this.o == model.o && this.f52333p == model.f52333p && this.f52334q == model.f52334q && this.f52335r == model.f52335r;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getK() {
            return this.o;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.o = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.i;
        }

        public final int hashCode() {
            int iHashCode = (this.f52327g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + p.a.a(ip0.v7.b(ip0.v7.g(this.f52325b, this.f52324a.hashCode() * 31, 31), 31, this.f52326c), 31, this.d)) * 31)) * 31)) * 31;
            Object obj2 = this.f52328h;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.i;
            int i = h30.l.i(this.f52329j, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.k;
            int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52330l;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52331m;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52332n;
            return Integer.hashCode(this.f52335r) + j6.a.b(this.f52334q, j6.a.b(this.f52333p, j6.a.b(this.o, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52555j() {
            return this.k;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52329j = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52553g() {
            return this.f52330l;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52331m = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52556l() {
            return this.f52333p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52558n() {
            return this.f52335r;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52333p = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF() {
            return this.f52329j;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getI() {
            return this.f52332n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52554h() {
            return this.f52331m;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.k = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52557m() {
            return this.f52334q;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52330l = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52332n = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ip0.xh(!Intrinsics.f(model.f52325b, this.f52325b), !Intrinsics.f(model.f52326c, this.f52326c), model.f != this.f, model.f52327g != this.f52327g, !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.e, this.e), or0.b.l(this, (qv0.i) oldItem));
        }
    }

    public FeedCollectionDelegate() {
        super(R$layout.internal_delegate_feed_collection, new ip0.zf(15));
        ChallengeMediumDelegate challengeMediumDelegate = new ChallengeMediumDelegate();
        this.f52320c = challengeMediumDelegate;
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.d = voucherSmallTileDelegate;
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f52321g = v0.a.d("create(...)");
        this.f52322h = v0.a.d("create(...)");
        this.i = challengeMediumDelegate.d;
        this.f52323j = voucherSmallTileDelegate.f53608c;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.ai(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_feed_collection), this.f52320c, this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v0, types: [yy0.f] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(final ip0.ai holder, final Model data, int i, List payloads) {
        List list;
        ip0.ai aiVar;
        py0.c cVar;
        aw0.d0 d0Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        String str = data.f52324a;
        TextClause textClause = data.f52326c;
        f6 f6Var = data.e;
        holder.f163449g = str;
        AsyncDiffRecyclerView asyncDiffRecyclerView = holder.o;
        ImageView imageView = holder.f163452l;
        ImageView imageView2 = holder.k;
        TextView textView = holder.f163451j;
        ImageView imageView3 = holder.f163450h;
        LargeActionButton largeActionButton = holder.f163453m;
        AsyncDiffRecyclerView asyncDiffRecyclerView2 = holder.f163454n;
        List list2 = payloads;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            list = payloads;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (!(it8.next() instanceof ip0.xh)) {
                    list = null;
                    break;
                }
            }
            list = payloads;
        }
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        Intrinsics.i(list, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.FeedCollectionDelegate.Payload>");
        boolean zIsEmpty = list.isEmpty();
        int size = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        int i2 = 0;
        while (i2 < size) {
            ip0.xh xhVar = (ip0.xh) list.get(i2);
            int i3 = size;
            z29 = z29 || xhVar.f167172a;
            z = z || xhVar.f167173b;
            z3 = z3 || xhVar.f167174c;
            z4 = z4 || xhVar.d;
            z6 = z6 || xhVar.e;
            z11 = z11 || xhVar.f;
            z12 = z12 || xhVar.f167175g;
            i2++;
            size = i3;
        }
        if (z29) {
            zi0.c.g(holder.i, data.f52325b);
        }
        if (z) {
            kli.a.b(textView, textClause, ty0.f.f275450a);
        }
        if (z3) {
            or0.u.o(imageView2);
            int i5 = ip0.bi.f163614b[data.f.ordinal()];
            if (i5 == 1) {
                imageView2.setImageResource(0);
                imageView2.setVisibility(8);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                imageView2.setVisibility(0);
                imageView2.setImageResource(R$drawable.uikit_icn_24_share_ios);
                final int i6 = 1;
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: ip0.vh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i6) {
                            case 0:
                                koi.j jVar = holder.e;
                                FeedCollectionDelegate.Model model = jVar instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar : null;
                                if (model == null) {
                                    model = data;
                                }
                                this.f52322h.onNext(model);
                                break;
                            case 1:
                                koi.j jVar2 = holder.e;
                                FeedCollectionDelegate.Model model2 = jVar2 instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar2 : null;
                                if (model2 == null) {
                                    model2 = data;
                                }
                                this.f52321g.onNext(model2);
                                break;
                            case 2:
                                koi.j jVar3 = holder.e;
                                FeedCollectionDelegate.Model model3 = jVar3 instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar3 : null;
                                if (model3 == null) {
                                    model3 = data;
                                }
                                this.f.onNext(model3);
                                break;
                            default:
                                koi.j jVar4 = holder.e;
                                FeedCollectionDelegate.Model model4 = jVar4 instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar4 : null;
                                if (model4 == null) {
                                    model4 = data;
                                }
                                this.f.onNext(model4);
                                break;
                        }
                    }
                });
            }
        }
        if (z4) {
            or0.u.o(imageView);
            int i21 = ip0.bi.f163613a[data.f52327g.ordinal()];
            if (i21 == 1) {
                imageView.setVisibility(8);
                imageView.setImageResource(0);
            } else if (i21 == 2) {
                imageView.setVisibility(0);
                imageView.setImageResource(R$drawable.uikit_icn_24_heart_outline);
                final int i22 = 2;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: ip0.vh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                koi.j jVar = holder.e;
                                FeedCollectionDelegate.Model model = jVar instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar : null;
                                if (model == null) {
                                    model = data;
                                }
                                this.f52322h.onNext(model);
                                break;
                            case 1:
                                koi.j jVar2 = holder.e;
                                FeedCollectionDelegate.Model model2 = jVar2 instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar2 : null;
                                if (model2 == null) {
                                    model2 = data;
                                }
                                this.f52321g.onNext(model2);
                                break;
                            case 2:
                                koi.j jVar3 = holder.e;
                                FeedCollectionDelegate.Model model3 = jVar3 instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar3 : null;
                                if (model3 == null) {
                                    model3 = data;
                                }
                                this.f.onNext(model3);
                                break;
                            default:
                                koi.j jVar4 = holder.e;
                                FeedCollectionDelegate.Model model4 = jVar4 instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar4 : null;
                                if (model4 == null) {
                                    model4 = data;
                                }
                                this.f.onNext(model4);
                                break;
                        }
                    }
                });
            } else {
                if (i21 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                imageView.setVisibility(0);
                imageView.setImageResource(R$drawable.uikit_icn_24_heart);
                final int i32 = 3;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: ip0.vh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i32) {
                            case 0:
                                koi.j jVar = holder.e;
                                FeedCollectionDelegate.Model model = jVar instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar : null;
                                if (model == null) {
                                    model = data;
                                }
                                this.f52322h.onNext(model);
                                break;
                            case 1:
                                koi.j jVar2 = holder.e;
                                FeedCollectionDelegate.Model model2 = jVar2 instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar2 : null;
                                if (model2 == null) {
                                    model2 = data;
                                }
                                this.f52321g.onNext(model2);
                                break;
                            case 2:
                                koi.j jVar3 = holder.e;
                                FeedCollectionDelegate.Model model3 = jVar3 instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar3 : null;
                                if (model3 == null) {
                                    model3 = data;
                                }
                                this.f.onNext(model3);
                                break;
                            default:
                                koi.j jVar4 = holder.e;
                                FeedCollectionDelegate.Model model4 = jVar4 instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar4 : null;
                                if (model4 == null) {
                                    model4 = data;
                                }
                                this.f.onNext(model4);
                                break;
                        }
                    }
                });
            }
        }
        if (z6) {
            largeActionButton.setText(data.d);
            final int i33 = 0;
            largeActionButton.setOnClickListener(new View.OnClickListener() { // from class: ip0.vh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i33) {
                        case 0:
                            koi.j jVar = holder.e;
                            FeedCollectionDelegate.Model model = jVar instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar : null;
                            if (model == null) {
                                model = data;
                            }
                            this.f52322h.onNext(model);
                            break;
                        case 1:
                            koi.j jVar2 = holder.e;
                            FeedCollectionDelegate.Model model2 = jVar2 instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar2 : null;
                            if (model2 == null) {
                                model2 = data;
                            }
                            this.f52321g.onNext(model2);
                            break;
                        case 2:
                            koi.j jVar3 = holder.e;
                            FeedCollectionDelegate.Model model3 = jVar3 instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar3 : null;
                            if (model3 == null) {
                                model3 = data;
                            }
                            this.f.onNext(model3);
                            break;
                        default:
                            koi.j jVar4 = holder.e;
                            FeedCollectionDelegate.Model model4 = jVar4 instanceof FeedCollectionDelegate.Model ? (FeedCollectionDelegate.Model) jVar4 : null;
                            if (model4 == null) {
                                model4 = data;
                            }
                            this.f.onNext(model4);
                            break;
                    }
                }
            });
        }
        if (!z11) {
            aiVar = holder;
            cVar = null;
        } else {
            if (f6Var == null) {
                throw new NoWhenBranchMatchedException();
            }
            ip0.yh yhVar = f6Var.f54145b;
            ArrayList arrayList = f6Var.f54144a;
            RecyclerView.Adapter adapter = asyncDiffRecyclerView2.getAdapter();
            Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.rxdiffadapter.RxDiffAdapter");
            ((z4l.j) adapter).c(arrayList);
            asyncDiffRecyclerView.setVisibility(8);
            asyncDiffRecyclerView2.setVisibility(0);
            int i43 = R$attr.uikit_colorWhite;
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iS = kli.a.s(i43, context);
            imageView.setColorFilter(iS);
            imageView2.setColorFilter(iS);
            textView.setTextColor(iS);
            largeActionButton.o(LargeActionButton.ButtonStyle.f58734p);
            String str2 = data.f52324a;
            VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) zhm.d0.d0(arrayList);
            if (model == null) {
                aiVar = holder;
                cVar = null;
            } else {
                cVar = null;
                imageView3.setImageDrawable(null);
                VoucherSmallTileDelegate.c cVar2 = model.f53610b;
                if (!(cVar2 instanceof zi)) {
                    throw new NoWhenBranchMatchedException();
                }
                ?? Q = or0.u.k(imageView3).Q();
                ?? r142 = ((zi) cVar2).f55714a;
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                aiVar = holder;
                Q.c(r142, context2, 0, 0, new dqd.a(holder, str2, holder, f6Var, 25), new ie7.a(aiVar, 6));
            }
            int[] iArr = ip0.bi.f163615c;
            int i59 = iArr[yhVar.ordinal()];
            if (i59 == 1) {
                d0Var = k;
            } else if (i59 == 2) {
                d0Var = f52318l;
            } else {
                if (i59 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                d0Var = f52319m;
            }
            ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.dimensionRatio = a0.d.g(d0Var.f10274a, d0Var.f10275b, "H,", ":");
            imageView3.setLayoutParams(layoutParams2);
            int i66 = iArr[yhVar.ordinal()];
            if (i66 == 1) {
                ViewParent parent = asyncDiffRecyclerView2.getParent();
                ?? r132 = parent instanceof NestedScrollableHost ? (NestedScrollableHost) parent : cVar;
                if (r132 != 0) {
                    Context context3 = asyncDiffRecyclerView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    int iK = kli.a.k(context3, 8.0f);
                    Context context4 = asyncDiffRecyclerView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    or0.u.z(r132, 0, kli.a.k(context4, 40.0f), 0, iK, false, 21);
                }
            } else if (i66 == 2) {
                ViewParent parent2 = asyncDiffRecyclerView2.getParent();
                ?? r133 = parent2 instanceof NestedScrollableHost ? (NestedScrollableHost) parent2 : cVar;
                if (r133 != 0) {
                    Context context5 = asyncDiffRecyclerView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    int iK2 = kli.a.k(context5, BitmapDescriptorFactory.HUE_RED);
                    Context context6 = asyncDiffRecyclerView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                    or0.u.z(r133, 0, kli.a.k(context6, 24.0f), 0, iK2, false, 21);
                }
            } else {
                if (i66 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewParent parent3 = asyncDiffRecyclerView.getParent();
                ?? r134 = parent3 instanceof NestedScrollableHost ? (NestedScrollableHost) parent3 : cVar;
                if (r134 != 0) {
                    Context context7 = asyncDiffRecyclerView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                    int iK3 = kli.a.k(context7, 16.0f);
                    Context context8 = asyncDiffRecyclerView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                    or0.u.z(r134, 0, kli.a.k(context8, 32.0f), 0, iK3, false, 21);
                }
            }
        }
        if (z12) {
            View itemView = aiVar.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        View itemView2 = aiVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        or0.u.o(itemView2);
        View itemView3 = aiVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        py0.c cVar3 = textClause != null ? new py0.c(textClause) : cVar;
        or0.m.a(itemView3);
        itemView3.setOnClickListener(new au0.i3(data, cVar3, this, data, 25));
    }
}
