package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SecondaryBackgroundConstraintLayout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LabelBadgeInternalClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.je0;
import ip0.uf0;
import ip0.vf0;
import ip0.wf0;
import ip0.xf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;
import yp0.s;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0007\b\t\n\u000b\u0003\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmallStockCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SmallStockCardDelegate$Model;", "Lip0/xf0;", "<init>", "()V", "Companion", "Model", "c", "b", "ip0/vf0", "ip0/wf0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmallStockCardDelegate extends BaseRecyclerViewDelegate<Model, xf0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final aw0.d0 f = new aw0.d0(167, 180);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53378c;
    public final ihm.f d;
    public final ihm.f e;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.SmallStockCardDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f53398a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final rg f53399b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Model.a f53400c;
            public final sg d;

            public a() {
                this(null, null, null, null, 15);
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.f53398a, aVar.f53398a) && Intrinsics.f(this.f53399b, aVar.f53399b) && Intrinsics.f(this.f53400c, aVar.f53400c) && this.d == aVar.d;
            }

            public final int hashCode() {
                Clause clause = this.f53398a;
                int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
                rg rgVar = this.f53399b;
                int iHashCode2 = (iHashCode + (rgVar == null ? 0 : rgVar.hashCode())) * 31;
                Model.a aVar = this.f53400c;
                return this.d.hashCode() + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
            }

            public a(Clause clause, rg rgVar, Model.a aVar, sg valueSize, int i) {
                clause = (i & 1) != 0 ? null : clause;
                rgVar = (i & 2) != 0 ? null : rgVar;
                aVar = (i & 4) != 0 ? null : aVar;
                valueSize = (i & 8) != 0 ? sg.Regular : valueSize;
                Intrinsics.checkNotNullParameter(valueSize, "valueSize");
                this.f53398a = clause;
                this.f53399b = rgVar;
                this.f53400c = aVar;
                this.d = valueSize;
            }
        }

        private b() {
        }
    }

    public static abstract class c {
        private c() {
        }
    }

    public SmallStockCardDelegate() {
        super(R$layout.internal_delegate_small_stock_card, new je0(10));
        this.f53378c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }

    public static void q(xf0 xf0Var, int i) {
        ViewGroup.LayoutParams layoutParams = xf0Var.f167163p.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0) != i) {
            TextView textView = xf0Var.f167163p;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            layoutParams3.setMarginEnd(i);
            textView.setLayoutParams(layoutParams3);
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new xf0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [qv0.a] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(xf0 holder, Model data, int i, List list) {
        ImageView imageView;
        ut0.e eVar;
        boolean z;
        ut0.e eVar2;
        SecondaryBackgroundConstraintLayout secondaryBackgroundConstraintLayout;
        boolean z3;
        qv0.h hVarA;
        Clause clause;
        LabelBadgeInternalClause labelBadgeInternalClause;
        int iK;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        SecondaryBackgroundConstraintLayout secondaryBackgroundConstraintLayout2 = holder.k;
        TextView textView = holder.f167163p;
        SmallActionButton smallActionButton = holder.f167161m;
        TextView textView2 = holder.f167159j;
        ImageView imageView2 = holder.o;
        ImageView imageView3 = holder.f167164q;
        OverlappedIconsView overlappedIconsView = holder.f167160l;
        TextView textView3 = holder.i;
        TextView textView4 = holder.f167162n;
        TextView textView5 = holder.f167158h;
        ImageView imageView4 = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof wf0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z4 = zIsEmpty;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        int i3 = 0;
        while (i3 < size2) {
            wf0 wf0Var = (wf0) payloads.get(i3);
            List list2 = payloads;
            z49 = z49 || wf0Var.f167003a;
            z6 = z6 || wf0Var.f167006g;
            z12 = z12 || wf0Var.f167005c;
            z29 = z29 || wf0Var.f167004b;
            z4 = z4 || wf0Var.d;
            z11 = z11 || wf0Var.e;
            z31 = z31 || wf0Var.f;
            z41 = z41 || wf0Var.f167007h;
            i3++;
            payloads = list2;
        }
        if (z4) {
            c cVar = data.f53382g;
            if (cVar instanceof vg) {
                View view = holder.itemView;
                yy0.f.e(h30.l.z(view, "itemView", view), ((vg) cVar).f54882a, holder.f, null, null, 12);
                imageView4.setVisibility(0);
                overlappedIconsView.setModel(new mx0.db((List) zhm.f0.f322471a, (mx0.bb) null, 0, false, 30));
                overlappedIconsView.setVisibility(8);
            } else if (cVar instanceof wg) {
                imageView4.setImageResource(0);
                imageView4.setVisibility(8);
                yp0.u.c(overlappedIconsView, ((wg) cVar).f54923a, s.b.f315754a, null, 508);
            } else {
                if (!(cVar instanceof ug)) {
                    throw new NoWhenBranchMatchedException();
                }
                imageView4.setImageResource(0);
                imageView4.setVisibility(8);
                yp0.u.a(overlappedIconsView, ((ug) cVar).f54835a, 8);
            }
        }
        if (z49) {
            or0.b.e(this, data.f53381c, holder.f167157g, null, 12);
        }
        if (z6) {
            Image image = data.k;
            Clause clause2 = data.f53385l;
            if (image != null) {
                View view2 = holder.itemView;
                yy0.f.e(h30.l.z(view2, "itemView", view2), image, holder.f167164q, null, null, 12);
                imageView3.setVisibility(0);
                pd.b.p(imageView3, clause2);
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iK2 = kli.a.k(context, 8.0f);
                or0.u.l(imageView3, 0, iK2, iK2, iK2);
            } else {
                imageView3.setVisibility(8);
                imageView3.setContentDescription(null);
                or0.u.d(imageView3);
            }
        }
        if (z11) {
            Integer num = data.i;
            if (num != null) {
                imageView = imageView3;
                kli.a.b(textView, new TextClause(String.valueOf(num.intValue()), (Style) new Custom(new Custom.Color.Gradient(R$attr.uikit_colorGreyTone5, R$attr.uikit_colorGreyTone10, com.revolut.core.ui_kit.models.c.BL_TR), false, false, 254), (Integer) null, false, (aw0.o9) null, (List) null, 124), ty0.f.f275450a);
                if (num.intValue() >= 10) {
                    Context context2 = textView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    iK = kli.a.k(context2, -27.0f);
                } else if (num.intValue() == 1) {
                    iK = 0;
                } else {
                    Context context3 = textView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    iK = kli.a.k(context3, -12.0f);
                }
                q(holder, iK);
            } else {
                imageView = imageView3;
                kli.a.b(textView, null, ty0.f.f275450a);
                q(holder, 0);
            }
        } else {
            imageView = imageView3;
        }
        if (z12) {
            b bVar = data.f53383h;
            if (bVar == null) {
                textView5.setVisibility(8);
                textView4.setVisibility(8);
                imageView2.setVisibility(8);
                textView3.setVisibility(8);
                textView2.setVisibility(8);
                smallActionButton.setVisibility(8);
                eVar = null;
                z = false;
            } else if (bVar instanceof tg) {
                textView5.setVisibility(8);
                textView4.setVisibility(0);
                imageView2.setVisibility(0);
                textView3.setVisibility(8);
                textView2.setVisibility(8);
                smallActionButton.setVisibility(8);
                or0.b.e(this, ((tg) bVar).f54784a, textView4, null, 12);
                imageView2.setVisibility(8);
                z = false;
                eVar = null;
            } else {
                if (!(bVar instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                textView5.setVisibility(0);
                textView4.setVisibility(8);
                imageView2.setVisibility(8);
                smallActionButton.setVisibility(8);
                b.a aVar = (b.a) bVar;
                rg rgVar = aVar.f53399b;
                jb3.l.e(textView3, aVar.d.a());
                Clause clause3 = aVar.f53398a;
                if (rgVar != null) {
                    clause = null;
                    labelBadgeInternalClause = new LabelBadgeInternalClause(new LabelBadgeInternalClause.Type.Inline(rgVar.f54681a, com.revolut.core.ui_kit.models.i.SMALL), null, null);
                } else {
                    clause = null;
                    labelBadgeInternalClause = null;
                }
                z = false;
                Clause[] elements = {clause3, labelBadgeInternalClause, clause};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                if (listL.isEmpty()) {
                    listL = null;
                }
                eVar = null;
                or0.b.e(this, listL != null ? yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), listL) : null, textView5, null, 12);
                Model.a aVar2 = aVar.f53400c;
                or0.b.e(this, aVar2 != null ? aVar2.f53396a : null, textView3, null, 12);
                or0.b.e(this, aVar2 != null ? aVar2.f53397b : null, textView2, null, 12);
            }
        } else {
            eVar = null;
            z = false;
        }
        if (z29) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            eVar2 = eVar;
            or0.b.c(this, data, itemView, false, null, 28);
        } else {
            eVar2 = eVar;
        }
        if (z31 || z29) {
            vf0 vf0Var = data.f53384j;
            Context context4 = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            Drawable drawableA = vf0Var.a(context4, data.f53389q);
            secondaryBackgroundConstraintLayout = secondaryBackgroundConstraintLayout2;
            secondaryBackgroundConstraintLayout.setSecondaryBackground(drawableA);
        } else {
            secondaryBackgroundConstraintLayout = secondaryBackgroundConstraintLayout2;
        }
        if (!z31 && !z29) {
            z3 = true;
        } else if (data.f53384j instanceof qg) {
            View view3 = holder.itemView;
            Context context5 = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            Companion companion = INSTANCE;
            Object obj2 = data.f53389q;
            companion.getClass();
            ?? r56 = obj2 instanceof qv0.a ? (qv0.a) obj2 : eVar2;
            if (r56 == 0 || (hVarA = r56.a()) == null) {
                hVarA = qv0.h.EXTRA_LARGE;
            }
            z3 = true;
            view3.setOutlineProvider(new iv0.s(kli.a.l(context5, hVarA.a()), true));
            holder.itemView.setClipToOutline(true);
        } else {
            z3 = true;
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.v.a(itemView2, data.f53389q);
        }
        if (z41) {
            aw0.d0 d0Var = data.f53386m;
            secondaryBackgroundConstraintLayout.setAspectRatioConfig(d0Var != null ? new ut0.e(d0Var, ut0.a.ADJUST_HEIGHT) : eVar2);
        }
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        py0.d cVar2 = data.o;
        if (cVar2 == null) {
            cVar2 = new py0.c(data.f53381c);
        }
        View itemView4 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
        or0.u.s(itemView3, data, cVar2, new j01.c(new View[]{itemView4}, data, this.f53378c, new ie7.a(holder, 19), 8));
        View itemView5 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView5, "itemView");
        if (data.f53387n) {
            itemView5.setOnLongClickListener(new au0.j(this, data, 2));
        } else {
            or0.u.p(itemView5);
        }
        boolean z54 = data.k != null ? z3 : z;
        or0.m.a(imageView);
        if (z54) {
            imageView.setOnClickListener(new au0.t1(data, 18, this, data));
        } else {
            or0.u.o(imageView);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmallStockCardDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f53380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53381c;
        public final Clause d;
        public final a e;
        public final aw0.j0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f53382g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b f53383h;
        public final Integer i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final vf0 f53384j;
        public final Image k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Clause f53385l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final aw0.d0 f53386m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f53387n;
        public final py0.d o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Object f53388p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public qv0.c f53389q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f53390r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f53391s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f53392t;
        public p31.c u;
        public int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f53393w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final int f53394x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final int f53395y;
        public Parcelable z;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f53396a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f53397b;

            public a() {
                this((PercentageClause) null, 3);
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.f53396a, aVar.f53396a) && Intrinsics.f(this.f53397b, aVar.f53397b);
            }

            public final int hashCode() {
                Clause clause = this.f53396a;
                int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
                Clause clause2 = this.f53397b;
                return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
            }

            public a(Clause clause, Clause clause2) {
                this.f53396a = clause;
                this.f53397b = clause2;
            }

            public /* synthetic */ a(PercentageClause percentageClause, int i) {
                this((i & 1) != 0 ? null : percentageClause, (Clause) null);
            }
        }

        public Model(String listId, Image image, Clause title, Clause clause, a aVar, aw0.j0 backgroundType, c topLeftView, b footer, Integer num, vf0 appearance, Image image2, Clause clause2, aw0.d0 d0Var, boolean z, py0.d dVar, Object obj2, qv0.c positionInBox, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i, int i2, int i3, int i5, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            Intrinsics.checkNotNullParameter(topLeftView, "topLeftView");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f53379a = listId;
            this.f53380b = image;
            this.f53381c = title;
            this.d = clause;
            this.e = aVar;
            this.f = backgroundType;
            this.f53382g = topLeftView;
            this.f53383h = footer;
            this.i = num;
            this.f53384j = appearance;
            this.k = image2;
            this.f53385l = clause2;
            this.f53386m = d0Var;
            this.f53387n = z;
            this.o = dVar;
            this.f53388p = obj2;
            this.f53389q = positionInBox;
            this.f53390r = cVar;
            this.f53391s = cVar2;
            this.f53392t = cVar3;
            this.u = cVar4;
            this.v = i;
            this.f53393w = i2;
            this.f53394x = i3;
            this.f53395y = i5;
            this.z = parcelable;
        }

        public static Model e(Model model, String str, Integer num, c.e eVar, int i) {
            String listId = (i & 1) != 0 ? model.f53379a : str;
            Image image = model.f53380b;
            Clause title = model.f53381c;
            Clause clause = model.d;
            a aVar = model.e;
            aw0.j0 backgroundType = model.f;
            c topLeftView = model.f53382g;
            b footer = model.f53383h;
            Integer num2 = (i & 256) != 0 ? model.i : num;
            vf0 appearance = model.f53384j;
            Image image2 = model.k;
            Clause clause2 = model.f53385l;
            aw0.d0 d0Var = model.f53386m;
            boolean z = model.f53387n;
            py0.d dVar = model.o;
            Object obj2 = model.f53388p;
            qv0.c positionInBox = (i & 65536) != 0 ? model.f53389q : eVar;
            p31.c cVar = model.f53390r;
            p31.c cVar2 = model.f53391s;
            p31.c cVar3 = model.f53392t;
            p31.c cVar4 = model.u;
            int i2 = model.v;
            int i3 = model.f53393w;
            int i5 = model.f53394x;
            int i6 = model.f53395y;
            Parcelable parcelable = model.z;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            Intrinsics.checkNotNullParameter(topLeftView, "topLeftView");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            return new Model(listId, image, title, clause, aVar, backgroundType, topLeftView, footer, num2, appearance, image2, clause2, d0Var, z, dVar, obj2, positionInBox, cVar, cVar2, cVar3, cVar4, i2, i3, i5, i6, parcelable);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SmallStockCardDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52754a() {
            return this.f53388p;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55721a() {
            return this.f53379a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53379a, model.f53379a) && Intrinsics.f(this.f53380b, model.f53380b) && Intrinsics.f(this.f53381c, model.f53381c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f53382g, model.f53382g) && Intrinsics.f(this.f53383h, model.f53383h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53384j, model.f53384j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53385l, model.f53385l) && Intrinsics.f(this.f53386m, model.f53386m) && this.f53387n == model.f53387n && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f53388p, model.f53388p) && Intrinsics.f(this.f53389q, model.f53389q) && Intrinsics.f(this.f53390r, model.f53390r) && Intrinsics.f(this.f53391s, model.f53391s) && Intrinsics.f(this.f53392t, model.f53392t) && Intrinsics.f(this.u, model.u) && this.v == model.v && this.f53393w == model.f53393w && this.f53394x == model.f53394x && this.f53395y == model.f53395y && Intrinsics.f(this.z, model.z);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getE() {
            return this.v;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.v = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52755b() {
            return this.z;
        }

        public final int hashCode() {
            int iHashCode = this.f53379a.hashCode() * 31;
            Image image = this.f53380b;
            int iA = p.a.a((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f53381c);
            Clause clause = this.d;
            int iHashCode2 = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            a aVar = this.e;
            int iHashCode3 = (this.f53383h.hashCode() + ((this.f53382g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31)) * 31)) * 31;
            Integer num = this.i;
            int iHashCode4 = (this.f53384j.hashCode() + ((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
            Image image2 = this.k;
            int iHashCode5 = (iHashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Clause clause2 = this.f53385l;
            int iHashCode6 = (iHashCode5 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            aw0.d0 d0Var = this.f53386m;
            int iC = j6.a.c((iHashCode6 + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31, this.f53387n);
            py0.d dVar = this.o;
            int iHashCode7 = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Object obj2 = this.f53388p;
            int i = h30.l.i(this.f53389q, (iHashCode7 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
            p31.c cVar = this.f53390r;
            int iHashCode8 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53391s;
            int iHashCode9 = (iHashCode8 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53392t;
            int iHashCode10 = (iHashCode9 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.u;
            int iB = j6.a.b(this.f53395y, j6.a.b(this.f53394x, j6.a.b(this.f53393w, j6.a.b(this.v, (iHashCode10 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            Parcelable parcelable = this.z;
            return iB + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52759j() {
            return this.f53390r;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53389q = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getK() {
            return this.f53391s;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53392t = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF() {
            return this.f53393w;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52758h() {
            return this.f53395y;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53393w = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getI() {
            return this.f53389q;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52761m() {
            return this.u;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52760l() {
            return this.f53392t;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53390r = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.z = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52757g() {
            return this.f53394x;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53391s = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.u = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            Model model2 = (Model) oldItem;
            return new wf0(!Intrinsics.f(model2.f53381c, this.f53381c), or0.b.l(this, model), !Intrinsics.f(model2.f53383h, this.f53383h), !Intrinsics.f(model2.f53382g, this.f53382g), !Intrinsics.f(model2.i, this.i), !Intrinsics.f(model2.f53384j, this.f53384j), (Intrinsics.f(model2.k, this.k) && Intrinsics.f(model2.f53385l, this.f53385l)) ? false : true, !Intrinsics.f(model2.f53386m, this.f53386m));
        }

        public /* synthetic */ Model(String str, Image image, Clause clause, Clause clause2, a aVar, c cVar, b bVar, Integer num, vf0 vf0Var, Image image2, aw0.d0 d0Var, boolean z, py0.d dVar, Object obj2, Parcelable parcelable, int i) {
            c vgVar;
            aw0.j0 j0Var = aw0.j0.DEFAULT;
            if ((i & 64) == 0) {
                vgVar = cVar;
            } else {
                if (image == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                vgVar = new vg(image);
            }
            b aVar2 = (i & 128) != 0 ? new b.a(clause2, null, aVar, null, 10) : bVar;
            Integer num2 = (i & 256) != 0 ? null : num;
            vf0 vf0Var2 = (i & 512) != 0 ? uf0.f166653a : vf0Var;
            Image image3 = (i & 1024) != 0 ? null : image2;
            aw0.d0 d0Var2 = (i & 4096) != 0 ? null : d0Var;
            boolean z3 = (i & 8192) != 0 ? false : z;
            py0.d dVar2 = (i & 16384) != 0 ? null : dVar;
            Object obj3 = (32768 & i) != 0 ? null : obj2;
            int i2 = R$attr.uikit_dp0;
            this(str, image, clause, clause2, aVar, j0Var, vgVar, aVar2, num2, vf0Var2, image3, null, d0Var2, z3, dVar2, obj3, c.d.f249513a, null, null, null, null, i2, i2, i2, i2, (i & 33554432) != 0 ? null : parcelable);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, c topLeftView, Clause title, b footer, Object obj2, AnalyticsContext analyticsContext, vf0 vf0Var, ResourceImage resourceImage, py0.c cVar, int i) {
            AnalyticsContext analyticsContext2 = (i & 32) != 0 ? null : analyticsContext;
            vf0 appearance = (i & 128) != 0 ? uf0.f166653a : vf0Var;
            ResourceImage resourceImage2 = (i & 256) != 0 ? null : resourceImage;
            aw0.d0 d0Var = (i & 1024) != 0 ? null : SmallStockCardDelegate.f;
            boolean z = (i & 2048) == 0;
            py0.c cVar2 = (i & 4096) != 0 ? null : cVar;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(topLeftView, "topLeftView");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            this(listId, null, title, null, null, topLeftView, footer, null, appearance, resourceImage2, d0Var, z, cVar2, obj2, analyticsContext2, 33488928);
        }
    }
}
