package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.af0;
import ip0.e70;
import ip0.je0;
import ip0.kt;
import ip0.ze0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0007\b\u0003\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SingleChoiceDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SingleChoiceDelegate$Model;", "Lip0/af0;", "<init>", "()V", "Companion", "a", "Model", "b", "ip0/ze0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SingleChoiceDelegate extends BaseRecyclerViewDelegate<Model, af0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final ResourceImage d = new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53323c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SingleChoiceDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f53326c;
        public final b d;
        public final boolean e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qv0.c f53327g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f53328h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f53329j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f53330l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f53331m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f53332n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Parcelable f53333p;

        public Model(String listId, Clause title, boolean z, b selectionIndicator, Object obj2, int i) {
            selectionIndicator = (i & 8) != 0 ? new b.a(0) : selectionIndicator;
            obj2 = (i & 32) != 0 ? null : obj2;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(selectionIndicator, "selectionIndicator");
            this.f53324a = listId;
            this.f53325b = title;
            this.f53326c = z;
            this.d = selectionIndicator;
            this.e = true;
            this.f = obj2;
            this.f53327g = c.d.f249513a;
            this.f53328h = null;
            this.i = null;
            this.f53329j = null;
            this.k = null;
            this.f53330l = i2;
            this.f53331m = i2;
            this.f53332n = i2;
            this.o = i2;
            this.f53333p = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SingleChoiceDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53128j() {
            return this.f;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52550a() {
            return this.f53324a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53324a, model.f53324a) && Intrinsics.f(this.f53325b, model.f53325b) && this.f53326c == model.f53326c && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53327g, model.f53327g) && Intrinsics.f(this.f53328h, model.f53328h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53329j, model.f53329j) && Intrinsics.f(this.k, model.k) && this.f53330l == model.f53330l && this.f53331m == model.f53331m && this.f53332n == model.f53332n && this.o == model.o && Intrinsics.f(this.f53333p, model.f53333p);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getK() {
            return this.f53330l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53330l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f53333p;
        }

        public final int hashCode() {
            int iHashCode = this.f53324a.hashCode() * 31;
            Clause clause = this.f53325b;
            int iC = j6.a.c((this.d.hashCode() + j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f53326c)) * 31, 31, this.e);
            Object obj2 = this.f;
            int i = h30.l.i(this.f53327g, (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
            p31.c cVar = this.f53328h;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.i;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53329j;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.k;
            int iB = j6.a.b(this.o, j6.a.b(this.f53332n, j6.a.b(this.f53331m, j6.a.b(this.f53330l, (iHashCode4 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            Parcelable parcelable = this.f53333p;
            return iB + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52555j() {
            return this.f53328h;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53327g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52553g() {
            return this.i;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53329j = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52556l() {
            return this.f53331m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52558n() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53331m = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF() {
            return this.f53327g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getI() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52554h() {
            return this.f53329j;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53328h = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53333p = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52557m() {
            return this.f53332n;
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
            boolean z = true;
            boolean z3 = !Intrinsics.f(model.f53325b, this.f53325b);
            boolean z4 = (model.f53326c == this.f53326c && Intrinsics.f(model.d, this.d)) ? false : true;
            boolean z6 = model.e != this.e;
            if (Intrinsics.f(model.f53328h, this.f53328h) && Intrinsics.f(model.i, this.i) && Intrinsics.f(model.f53329j, this.f53329j) && Intrinsics.f(model.k, this.k)) {
                z = false;
            }
            return new ze0(z3, z4, z6, z);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.SingleChoiceDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f53334a;

            public a() {
                this(0);
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && this.f53334a == ((a) obj2).f53334a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f53334a);
            }

            public a(int i) {
                SingleChoiceDelegate.INSTANCE.getClass();
                this.f53334a = SingleChoiceDelegate.d.f59995a;
            }
        }

        private b() {
        }
    }

    public SingleChoiceDelegate() {
        super(R$layout.internal_delegate_single_choice, new je0(3));
        this.f53323c = yhm.j.c(yhm.k.NONE, new e70(9));
    }

    public static void r(Model model, af0 af0Var) {
        af0Var.itemView.setEnabled(model.e);
        float f = model.e ? 1.0f : 0.4f;
        View view = af0Var.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int iD = 0; iD < childCount; iD = m72.b.d(viewGroup, iD, f, iD, 1)) {
        }
    }

    public static void s(boolean z, af0 af0Var) {
        Context context = af0Var.itemView.getContext();
        LayerDrawable layerDrawableS = null;
        if (z) {
            Intrinsics.h(context);
            GradientDrawable gradientDrawableH = dr0.l.h(context, qv0.h.LARGE.a(), new Color.Solid(R$attr.uikit_colorActionBackgroundNeutral_40), 0, null);
            int iK = kli.a.k(context, 4.0f);
            Intrinsics.checkNotNullParameter(gradientDrawableH, "<this>");
            layerDrawableS = c6d.b.S(gradientDrawableH, iK, iK, iK, iK);
        }
        af0Var.f.setSecondaryBackground(layerDrawableS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(Model model, af0 af0Var) {
        b bVar = model.d;
        boolean z = model.f53326c;
        CompositeClause compositeClauseM = null;
        if (!(bVar instanceof ng)) {
            if (!(bVar instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            yy0.f.e(or0.u.k(af0Var.f163436h).Q(), z ? new ResourceImage(((b.a) bVar).f53334a, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, af0Var.f163436h, null, null, 12);
            kli.a.b(af0Var.i, null, ty0.f.f275450a);
            return;
        }
        ng ngVar = (ng) bVar;
        Float fValueOf = Float.valueOf(16.0f);
        if (z) {
            Object obj2 = ngVar.f54510a;
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.Clause");
            compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), zhm.v.n(obj2, new ImageClause(ngVar.f54511b, Integer.valueOf(R$attr.uikit_colorAccentNeutral), fValueOf, fValueOf, 16)));
        }
        kli.a.b(af0Var.i, compositeClauseM, ty0.f.f275450a);
        yy0.f.e(or0.u.k(af0Var.f163436h).Q(), null, af0Var.f163436h, null, null, 12);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new af0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_single_choice));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ihm.f p() {
        return (ihm.f) this.f53323c.getValue();
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(af0 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f163435g;
        if (payloads.isEmpty()) {
            kli.a.b(textView, data.f53325b, ty0.f.f275450a);
            s(data.f53326c, holder);
            t(data, holder);
            r(data, holder);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        } else {
            List list = payloads;
            ArrayList<ze0> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.SingleChoiceDelegate.Payload");
                arrayList.add((ze0) obj2);
            }
            for (ze0 ze0Var : arrayList) {
                if (ze0Var.f167453a) {
                    kli.a.b(textView, data.f53325b, ty0.f.f275450a);
                }
                if (ze0Var.f167454b) {
                    s(data.f53326c, holder);
                    t(data, holder);
                }
                if (ze0Var.f167455c) {
                    r(data, holder);
                }
                if (ze0Var.d) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, false, null, 28);
                }
            }
        }
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        Clause clause = data.f53325b;
        py0.c cVar = clause != null ? new py0.c(clause) : null;
        or0.m.a(itemView3);
        itemView3.setOnClickListener(new kt(data, cVar, this, data, 18));
        View itemView4 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
        Clause clause2 = data.f53325b;
        gq0.b bVarF = clause2 != null ? hx7.b.f(clause2) : null;
        CharSequence text = holder.i.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        Intrinsics.checkNotNullParameter(text, "<this>");
        gq0.d[] elements = {bVarF, new gq0.c(text)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView4);
    }
}
