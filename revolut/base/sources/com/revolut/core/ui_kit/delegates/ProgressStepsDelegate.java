package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.l40;
import ip0.m50;
import ip0.n50;
import ip0.o50;
import ip0.p50;
import ip0.q50;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0006\u0007\u0003\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProgressStepsDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ProgressStepsDelegate$Model;", "Lip0/p50;", "<init>", "()V", "Model", "ip0/m50", "ip0/o50", "a", "ip0/n50", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressStepsDelegate extends BaseRecyclerViewDelegate<Model, p50> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53022c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProgressStepsDelegate$Model;", "Lqv0/i;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n50 f53024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f53025c;
        public final Clause d;
        public final Clause e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qv0.c f53026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f53027h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f53028j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f53029l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f53030m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f53031n;
        public final int o;

        public Model(String listId, n50 stateColor, a steps, Clause clause, Clause clause2, int i, int i2) {
            clause = (i2 & 8) != 0 ? null : clause;
            clause2 = (i2 & 16) != 0 ? null : clause2;
            i = (i2 & 64) != 0 ? R$attr.uikit_dp16 : i;
            int i3 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(stateColor, "stateColor");
            Intrinsics.checkNotNullParameter(steps, "steps");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(stateColor, "stateColor");
            Intrinsics.checkNotNullParameter(steps, "steps");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f53023a = listId;
            this.f53024b = stateColor;
            this.f53025c = steps;
            this.d = clause;
            this.e = clause2;
            this.f = null;
            this.f53026g = positionInBox;
            this.f53027h = null;
            this.i = null;
            this.f53028j = null;
            this.k = null;
            this.f53029l = i;
            this.f53030m = i3;
            this.f53031n = i3;
            this.o = i3;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ProgressStepsDelegate();
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52956a() {
            return this.f53023a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53023a, model.f53023a) && this.f53024b == model.f53024b && Intrinsics.f(this.f53025c, model.f53025c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53026g, model.f53026g) && Intrinsics.f(this.f53027h, model.f53027h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53028j, model.f53028j) && Intrinsics.f(this.k, model.k) && this.f53029l == model.f53029l && this.f53030m == model.f53030m && this.f53031n == model.f53031n && this.o == model.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getO() {
            return this.f53029l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53029l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52963m() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = (this.f53025c.hashCode() + ((this.f53024b.hashCode() + (this.f53023a.hashCode() * 31)) * 31)) * 31;
            Clause clause = this.d;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.e;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Parcelable parcelable = this.f;
            int i = h30.l.i(this.f53026g, (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f53027h;
            int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.i;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53028j;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.k;
            return Integer.hashCode(this.o) + j6.a.b(this.f53031n, j6.a.b(this.f53030m, j6.a.b(this.f53029l, (iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52968s() {
            return this.k;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53026g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52969t() {
            return this.f53027h;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52965p() {
            return this.f53030m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52967r() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53030m = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52964n() {
            return this.f53026g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getV() {
            return this.f53028j;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getU() {
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
        public final int getF52966q() {
            return this.f53031n;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53027h = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53028j = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            return new m50(!this.f53025c.equals(r6.f53025c), this.f53024b != ((Model) oldItem).f53024b, !Intrinsics.f(this.d, r6.d), !Intrinsics.f(this.e, r6.e));
        }
    }

    public static abstract class a {
        private a() {
        }

        public abstract o50 a();

        public abstract o50 b();
    }

    public ProgressStepsDelegate() {
        super(R$layout.internal_delegate_progress_steps, new l40(4));
        this.f53022c = v0.a.d("create(...)");
    }

    public static void r(p50 p50Var, float f, float f4) {
        ImageView imageView = p50Var.f;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.horizontalWeight = f;
        imageView.setLayoutParams(layoutParams2);
        ImageView imageView2 = p50Var.f165766g;
        ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.horizontalWeight = f4;
        imageView2.setLayoutParams(layoutParams4);
    }

    public static int s(Context context, n50 n50Var, boolean z) {
        if (!z) {
            return kli.a.s(R$attr.uikit_colorGreyTone20, context);
        }
        int i = q50.f165921a[n50Var.ordinal()];
        if (i == 1) {
            return kli.a.s(R$attr.uikit_colorRed, context);
        }
        if (i == 2) {
            return kli.a.s(R$attr.uikit_colorBlue, context);
        }
        if (i == 3) {
            return kli.a.s(R$attr.uikit_colorGreen, context);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new p50(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_progress_steps));
    }

    public final void p(p50 p50Var, n50 n50Var, a aVar) {
        View view = p50Var.itemView;
        TextView textView = p50Var.f165768j;
        TextView textView2 = p50Var.f165771n;
        TextView textView3 = p50Var.k;
        ImageView imageView = p50Var.f165767h;
        Context context = view.getContext();
        Clause clause = aVar.a().f165624a;
        TextView textView4 = p50Var.i;
        or0.b.e(this, clause, textView4, null, 12);
        or0.b.e(this, aVar.a().f165625b, p50Var.f165769l, null, 12);
        Intrinsics.h(context);
        textView4.setTextColor(kli.a.s(aVar.a().f165626c ? R$attr.uikit_colorForeground : R$attr.uikit_colorGrey50, context));
        rd0.e.q(p50Var.f, Integer.valueOf(s(context, n50Var, aVar.a().f165626c)));
        or0.b.e(this, aVar.b().f165624a, textView, null, 12);
        or0.b.e(this, aVar.b().f165625b, p50Var.f165770m, null, 12);
        textView.setTextColor(kli.a.s(aVar.b().f165626c ? R$attr.uikit_colorForeground : R$attr.uikit_colorGrey50, context));
        rd0.e.q(p50Var.f165766g, Integer.valueOf(s(context, n50Var, aVar.b().f165626c)));
        if (aVar instanceof jc) {
            r(p50Var, 1.0f, 2.0f);
            imageView.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setVisibility(8);
            return;
        }
        if (!(aVar instanceof ic)) {
            throw new NoWhenBranchMatchedException();
        }
        r(p50Var, -1.0f, -1.0f);
        imageView.setVisibility(0);
        textView3.setVisibility(0);
        textView2.setVisibility(0);
        o50 o50Var = ((ic) aVar).f54292c;
        boolean z = o50Var.f165626c;
        or0.b.e(this, o50Var.f165624a, textView3, null, 12);
        or0.b.e(this, o50Var.f165625b, textView2, null, 12);
        textView3.setTextColor(kli.a.s(z ? R$attr.uikit_colorForeground : R$attr.uikit_colorGrey50, context));
        rd0.e.q(imageView, Integer.valueOf(s(context, n50Var, z)));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(p50 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.o;
        TextView textView2 = holder.f165772p;
        ArrayList<m50> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof m50) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            p(holder, data.f53024b, data.f53025c);
            kli.a.d(textView2, data.e, data, new lc(1, 0, ihm.f.class, this.f53022c, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
            or0.b.e(this, data.d, textView, null, 12);
        } else {
            for (m50 m50Var : arrayList) {
                if (m50Var.f165319b || m50Var.f165318a) {
                    p(holder, data.f53024b, data.f53025c);
                }
                if (m50Var.d) {
                    kli.a.d(textView2, data.e, data, new kc(1, 0, ihm.f.class, this.f53022c, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
                }
                if (m50Var.f165320c) {
                    or0.b.e(this, data.d, textView, null, 12);
                }
            }
        }
        textView2.setMovementMethod(ix0.c0.f169220a);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
