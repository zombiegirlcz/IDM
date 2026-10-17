package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.SecondaryBackgroundConstraintLayout;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import koi.b;
import koi.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;
import qv0.i;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0018\b\u0001\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003*\u00020\u0004*\b\b\u0002\u0010\u0007*\u00020\u00062\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n0\b:\u0004\f\r\n\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DraggableDelegate;", "Lqv0/i;", "InnerItem", "Lkoi/k;", "", "InnerDelegate", "Lkoi/b;", "InnerVH", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/DraggableDelegate$Model;", "Lip0/ze;", "Companion", "Model", "ip0/ye", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DraggableDelegate<InnerItem extends qv0.i, InnerDelegate extends koi.k, InnerVH extends koi.b> extends BaseRecyclerViewDelegate<Model<InnerItem>, ip0.ze> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final iv0.t f52194g = new iv0.t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate f52195c;
    public final ItemTouchHelper d;
    public final ihm.f e;
    public final ihm.f f;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\nJ\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DraggableDelegate$Model;", "Lkoi/j;", "InnerItem", "Lqv0/i;", "Lgx0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/q5", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model<InnerItem extends koi.j> implements qv0.i, gx0.a, TrackableItem, qv0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RowDelegate.Model f52196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ResourceImage f52197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q5 f52198c;
        public final boolean d;
        public final String e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qv0.c f52199g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f52200h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f52201j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Object f52202l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52203m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f52204n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f52205p;

        public Model(String listId, RowDelegate.Model innerItem, ResourceImage resourceImage, q5 state, boolean z, Object obj2, int i) {
            z = (i & 16) != 0 ? false : z;
            obj2 = (i & 32) != 0 ? null : obj2;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(innerItem, "innerItem");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f52196a = innerItem;
            this.f52197b = resourceImage;
            this.f52198c = state;
            this.d = z;
            this.e = listId;
            this.f = null;
            this.f52199g = c.d.f249513a;
            this.f52200h = null;
            this.i = null;
            this.f52201j = null;
            this.k = null;
            this.f52202l = obj2;
            this.f52203m = i2;
            this.f52204n = i2;
            this.o = i2;
            this.f52205p = i2;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53564b() {
            return this.f52202l;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52222a() {
            return this.e;
        }

        @Override // gx0.a
        public final py0.d d() {
            RowDelegate.Model model = this.f52196a;
            if (model == null) {
                model = null;
            }
            if (model != null) {
                return model.d();
            }
            return null;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52196a, model.f52196a) && Intrinsics.f(this.f52197b, model.f52197b) && Intrinsics.f(this.f52198c, model.f52198c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52199g, model.f52199g) && Intrinsics.f(this.f52200h, model.f52200h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52201j, model.f52201j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52202l, model.f52202l) && this.f52203m == model.f52203m && this.f52204n == model.f52204n && this.o == model.o && this.f52205p == model.f52205p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53567h() {
            return this.f52203m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52203m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = this.f52196a.hashCode() * 31;
            ResourceImage resourceImage = this.f52197b;
            int iC = p.a.c(j6.a.c((this.f52198c.hashCode() + ((iHashCode + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
            Parcelable parcelable = this.f;
            int i = h30.l.i(this.f52199g, (iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52200h;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.i;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52201j;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.k;
            int iHashCode5 = (iHashCode4 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31;
            Object obj2 = this.f52202l;
            return Integer.hashCode(this.f52205p) + j6.a.b(this.o, j6.a.b(this.f52204n, j6.a.b(this.f52203m, (iHashCode5 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53569l() {
            return this.k;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52199g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53570m() {
            return this.f52200h;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getI() {
            return this.f52204n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getK() {
            return this.f52205p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52204n = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53566g() {
            return this.f52199g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getO() {
            return this.f52201j;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53571n() {
            return this.i;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.k = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53568j() {
            return this.o;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52200h = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52201j = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ip0.ye(this.f52196a.z(model.f52196a), !Intrinsics.f(this.f52197b, model.f52197b), !Intrinsics.f(this.f52198c, model.f52198c), this.d != model.d, !Intrinsics.f(this.f52199g, model.f52199g));
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.DraggableDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableDelegate(RowDelegate innerDelegate, ItemTouchHelper itemTouchHelper) {
        super(f52194g.a(RowDelegate.class), new in1.a(innerDelegate, 3));
        Intrinsics.checkNotNullParameter(innerDelegate, "innerDelegate");
        this.f52195c = innerDelegate;
        this.d = itemTouchHelper;
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.internal_delegate_draggable, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        this.f52195c.getClass();
        ip0.ze zeVar = new ip0.ze(viewInflate, RowDelegate.A(parent));
        zeVar.f167451h.addView(((koi.b) zeVar.f).itemView);
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = dr0.b.f117045a;
        Intrinsics.checkNotNullParameter(context, "context");
        zeVar.i.setBackground(new RippleDrawable(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorSelectableItemBackground, context)), null, dr0.b.e(context, c.b.f249511a)));
        return zeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.View$OnClickListener, android.view.View$OnLongClickListener, android.view.View$OnTouchListener] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.ze holder, final Model data, int i, List list) {
        boolean z;
        SecondaryBackgroundConstraintLayout secondaryBackgroundConstraintLayout;
        ?? r92;
        View view;
        float f;
        int i2;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        RecyclerView.ViewHolder viewHolder = holder.f;
        RowDelegate.Model model = data.f52196a;
        q5 q5Var = data.f52198c;
        model.j(c.d.f249513a);
        int size = payloads.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof ip0.ye)) {
                payloads = null;
                break;
            }
            i3++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = payloads.iterator();
        while (it8.hasNext()) {
            Object obj2 = ((ip0.ye) it8.next()).f167305a;
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        SecondaryBackgroundConstraintLayout secondaryBackgroundConstraintLayout2 = holder.f167450g;
        ImageView imageView = holder.k;
        ImageView imageView2 = holder.f167452j;
        boh.f.b(this.f52195c, (koi.b) viewHolder, data.f52196a, i, arrayList, data);
        int size2 = payloads.size();
        boolean z3 = zIsEmpty;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        int i5 = 0;
        while (true) {
            z = true;
            if (i5 >= size2) {
                break;
            }
            ip0.ye yeVar = (ip0.ye) payloads.get(i5);
            boolean z12 = zIsEmpty || yeVar.f167306b;
            z11 = zIsEmpty || yeVar.f167307c;
            boolean z29 = zIsEmpty || yeVar.e;
            if (!zIsEmpty && !yeVar.d) {
                z = false;
            }
            i5++;
            z3 = z12;
            z4 = z29;
            z6 = z;
        }
        if (z3) {
            zi0.c.g(imageView2, data.f52197b);
        }
        if (z4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            view = imageView;
            secondaryBackgroundConstraintLayout = secondaryBackgroundConstraintLayout2;
            r92 = 0;
            or0.b.c(this, data, itemView, true, null, 24);
        } else {
            secondaryBackgroundConstraintLayout = secondaryBackgroundConstraintLayout2;
            r92 = 0;
            view = imageView;
        }
        if (z6) {
            if (data.d) {
                qq0.a.a(imageView2, viewHolder, secondaryBackgroundConstraintLayout);
            } else {
                imageView2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
        }
        if (z11) {
            boolean z31 = q5Var instanceof k5;
            if (z31) {
                z = ((k5) q5Var).f54369a;
            } else {
                if (!(q5Var instanceof p5)) {
                    throw new NoWhenBranchMatchedException();
                }
                o5 o5Var = ((p5) q5Var).f54576a;
                if (o5Var.equals(l5.f54422a) || o5Var.equals(m5.f54459a)) {
                    z = false;
                } else if (!(o5Var instanceof n5)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            view.setVisibility(z ? 0 : 8);
            if (z31) {
                f = 0.4f;
            } else {
                if (!(q5Var instanceof p5)) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
            }
            int childCount = secondaryBackgroundConstraintLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                secondaryBackgroundConstraintLayout.getChildAt(i6).setAlpha(f);
            }
            view.setOnTouchListener(r92);
            View view2 = holder.i;
            view2.setOnLongClickListener(r92);
            imageView2.setOnClickListener(r92);
            view2.setOnClickListener(r92);
            or0.u.d(imageView2);
            if (z31) {
                i2 = 0;
            } else {
                if (!(q5Var instanceof p5)) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iW = kli.a.w(R$attr.uikit_dp16, context);
                or0.u.l(imageView2, iW, iW, iW, iW);
                final int i21 = 0;
                imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.we

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ DraggableDelegate f166993b;

                    {
                        this.f166993b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        switch (i21) {
                            case 0:
                                this.f166993b.e.onNext(data);
                                break;
                            case 1:
                                this.f166993b.f.onNext(data);
                                break;
                            default:
                                this.f166993b.f.onNext(data);
                                break;
                        }
                    }
                });
                o5 o5Var2 = ((p5) q5Var).f54576a;
                if (o5Var2 instanceof n5) {
                    final int i22 = 1;
                    view2.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.we

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ DraggableDelegate f166993b;

                        {
                            this.f166993b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            switch (i22) {
                                case 0:
                                    this.f166993b.e.onNext(data);
                                    break;
                                case 1:
                                    this.f166993b.f.onNext(data);
                                    break;
                                default:
                                    this.f166993b.f.onNext(data);
                                    break;
                            }
                        }
                    });
                    view.setOnTouchListener(new ar0.a(holder, this, 5));
                    view2.setOnLongClickListener(new ip0.xe(this, holder, 0));
                } else if (o5Var2 instanceof l5) {
                    final int i32 = 2;
                    view2.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.we

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ DraggableDelegate f166993b;

                        {
                            this.f166993b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            switch (i32) {
                                case 0:
                                    this.f166993b.e.onNext(data);
                                    break;
                                case 1:
                                    this.f166993b.f.onNext(data);
                                    break;
                                default:
                                    this.f166993b.f.onNext(data);
                                    break;
                            }
                        }
                    });
                } else {
                    if (!(o5Var2 instanceof m5)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 8;
                }
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
    }
}
