package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.drawables.AnimatedBorderGradientDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0007\b\t\u0003\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/CardWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/CardWidgetDelegate$Model;", "Lop0/c0;", "<init>", "()V", "Companion", "Model", "com/revolut/core/ui_kit/delegates/widgets/q", "op0/b0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.c0> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/CardWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/widgets/p", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f55002c;
        public final Image d;
        public final Object e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p f55003g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final op0.q f55004h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f55005j;
        public op0.r k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final py0.c f55006l;

        public Model(String listId, Image image, Image image2, Clause title, Clause clause, p pVar, Object obj2, int i) {
            clause = (i & 16) != 0 ? null : clause;
            pVar = (i & 32) != 0 ? null : pVar;
            obj2 = (i & 64) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            op0.q qVar = op0.q.SMALL;
            op0.r rVar = op0.r.SEEN;
            this.f55001b = listId;
            this.f55002c = image;
            this.d = image2;
            this.e = title;
            this.f = clause;
            this.f55003g = pVar;
            this.f55004h = qVar;
            this.i = obj2;
            this.f55005j = null;
            this.k = rVar;
            this.f55006l = new py0.c(title);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getK() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.k = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getI() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55001b() {
            return this.f55001b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return this.f55006l;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55001b, model.f55001b) && Intrinsics.f(this.f55002c, model.f55002c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55003g, model.f55003g) && this.f55004h == model.f55004h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f55005j, model.f55005j) && this.k == model.k;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55005j() {
            return this.f55005j;
        }

        public final int hashCode() {
            int iC = a10.b.c(this.f55002c, this.f55001b.hashCode() * 31, 31);
            Image image = this.d;
            int iB = p.a.b((iC + (image == null ? 0 : image.hashCode())) * 31, 31, this.e);
            Clause clause = this.f;
            int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
            p pVar = this.f55003g;
            int iB2 = okl.m.b(this.f55004h, (iHashCode + (pVar == null ? 0 : pVar.f55461a.hashCode())) * 31, 31);
            Object obj2 = this.i;
            int iHashCode2 = (iB2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f55005j;
            return this.k.hashCode() + ((iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55004h() {
            return this.f55004h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55005j = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new op0.b0(!Intrinsics.f(r10.f55002c, this.f55002c), !Intrinsics.f(r10.d, this.d), !Intrinsics.f(r10.e, this.e), !Intrinsics.f(r10.f, this.f), !Intrinsics.f(r10.f55003g, this.f55003g), ((Model) oldItem).f55004h != this.f55004h);
        }
    }

    public CardWidgetDelegate() {
        super(R$layout.internal_delegate_card_widget, new ood.g0(20));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.c0 c0Var = new op0.c0(kotlin.jvm.internal.s.r(parent, this.f54986c));
        p(c0Var, true);
        return c0Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: h */
    public final void o(RecyclerView.ViewHolder viewHolder) {
        op0.c0 holder = (op0.c0) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Drawable background = holder.f227203n.getBackground();
        AnimatedBorderGradientDrawable animatedBorderGradientDrawable = background instanceof AnimatedBorderGradientDrawable ? (AnimatedBorderGradientDrawable) background : null;
        if (animatedBorderGradientDrawable != null) {
            animatedBorderGradientDrawable.stop();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: k */
    public final void n(RecyclerView.ViewHolder viewHolder) {
        op0.c0 holder = (op0.c0) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Drawable background = holder.f227203n.getBackground();
        AnimatedBorderGradientDrawable animatedBorderGradientDrawable = background instanceof AnimatedBorderGradientDrawable ? (AnimatedBorderGradientDrawable) background : null;
        if (animatedBorderGradientDrawable != null) {
            animatedBorderGradientDrawable.start();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void n(koi.b bVar) {
        op0.c0 holder = (op0.c0) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Drawable background = holder.f227203n.getBackground();
        AnimatedBorderGradientDrawable animatedBorderGradientDrawable = background instanceof AnimatedBorderGradientDrawable ? (AnimatedBorderGradientDrawable) background : null;
        if (animatedBorderGradientDrawable != null) {
            animatedBorderGradientDrawable.start();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void o(koi.b bVar) {
        op0.c0 holder = (op0.c0) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Drawable background = holder.f227203n.getBackground();
        AnimatedBorderGradientDrawable animatedBorderGradientDrawable = background instanceof AnimatedBorderGradientDrawable ? (AnimatedBorderGradientDrawable) background : null;
        if (animatedBorderGradientDrawable != null) {
            animatedBorderGradientDrawable.stop();
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.c0 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.f227203n;
        ImageView imageView = holder.k;
        ImageView imageView2 = holder.f227200j;
        TextView textView = holder.f227201l;
        ?? r112 = data.e;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        boolean zN6 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        boolean z = zN4;
        boolean z3 = zN5;
        boolean z4 = zN6;
        while (true) {
            boolean z6 = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof op0.b0) {
                zN = zN || ((op0.b0) next).f227179a;
                zN2 = zN2 || ((op0.b0) next).f227180b;
                zN3 = zN3 || ((op0.b0) next).f227181c;
                boolean z11 = z || ((op0.b0) next).d;
                boolean z12 = z3 || ((op0.b0) next).e;
                if (!z4 && !((op0.b0) next).f) {
                    z6 = false;
                }
                z = z11;
                z3 = z12;
                z4 = z6;
            }
        }
        if (zN) {
            yy0.f.e(or0.u.k(imageView2).Q(), data.f55002c, holder.f227200j, null, null, 12);
        }
        if (zN2) {
            yy0.f.e(or0.u.k(imageView).Q(), data.d, holder.k, null, null, 12);
        }
        if (zN3) {
            ty0.c.b(or0.u.k(textView).b0(), r112, holder.f227201l, null, null, 12);
        }
        if (z) {
            ty0.c.b(or0.u.k(textView).b0(), data.f, holder.f227202m, null, null, 12);
        }
        if (z3) {
            Drawable background = view.getBackground();
            AnimatedBorderGradientDrawable animatedBorderGradientDrawable = background instanceof AnimatedBorderGradientDrawable ? (AnimatedBorderGradientDrawable) background : null;
            if (animatedBorderGradientDrawable != null) {
                animatedBorderGradientDrawable.stop();
            }
            p pVar = data.f55003g;
            if (pVar != null) {
                float fA = r6.b.a(view, "getContext(...)", 6.0f);
                float fA2 = r6.b.a(view, "getContext(...)", 4.0f);
                List list = pVar.f55461a;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    int iIntValue = ((Number) it9.next()).intValue();
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    arrayList.add(Integer.valueOf(kli.a.s(iIntValue, context)));
                }
                AnimatedBorderGradientDrawable animatedBorderGradientDrawable2 = new AnimatedBorderGradientDrawable(zhm.d0.c1(arrayList), new dr0.r(fA, fA2));
                animatedBorderGradientDrawable2.start();
                view.setBackground(animatedBorderGradientDrawable2);
            } else {
                view.setBackground(null);
            }
        }
        TextView textView2 = holder.f227202m;
        py0.c cVar = r112 != 0 ? new py0.c(r112) : null;
        or0.m.a(imageView2);
        imageView2.setOnClickListener(new op0.d0(data, cVar, this, data, 0));
        py0.c cVar2 = r112 != 0 ? new py0.c(r112) : null;
        or0.m.a(imageView);
        imageView.setOnClickListener(new op0.d0(data, cVar2, this, data, 1));
        imageView2.setOnTouchListener(new j01.e(new View[]{imageView2, textView, imageView, textView2}));
        imageView.setOnTouchListener(new j01.e(new View[]{imageView2, textView, imageView, textView2}));
        if (z4) {
            holder.F(data.f55004h);
        }
    }
}
