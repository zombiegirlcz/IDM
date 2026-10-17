package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.revpoints.RevPointsPriceView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DoubleTagView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ToDoItemView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.flexbox.FlexboxLayout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.AbstractList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\n\u0003\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ExtraLargeListingCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ExtraLargeListingCardDelegate$Model;", "Lip0/wg;", "<init>", "()V", "ip0/tg", "Model", "com/revolut/core/ui_kit/delegates/b6", "ip0/qg", "ip0/vg", "ip0/sg", "ip0/rg", "a", "ip0/ug", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExtraLargeListingCardDelegate extends BaseRecyclerViewDelegate<Model, ip0.wg> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52266c;
    public final e01.a d;
    public final ihm.f e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f52267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f52268h;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate$a$a, reason: collision with other inner class name */
        public static final class C0403a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0403a f52284a = new C0403a();

            private C0403a() {
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f52285a;

            public b() {
                this(0);
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && this.f52285a == ((b) obj2).f52285a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f52285a);
            }

            public b(int i) {
                this.f52285a = true;
            }
        }

        private a() {
        }
    }

    public ExtraLargeListingCardDelegate() {
        super(R$layout.internal_delegate_extra_large_listing_card, new ip0.zf(7));
        this.f52266c = v0.a.d("create(...)");
        this.d = new e01.a();
        this.e = v0.a.d("create(...)");
        this.f = new e01.a();
        this.f52267g = new e01.a();
        this.f52268h = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.wg(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_extra_large_listing_card));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.wg holder, Model data, int i, List list) {
        ExtraLargeListingCardDelegate extraLargeListingCardDelegate;
        int i2;
        List list2;
        int i3;
        a6 a6Var;
        List<ip0.ug> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        FlexboxLayout flexboxLayout = holder.f167017s;
        LargeActionButton largeActionButton = holder.f167015q;
        DoubleTagView doubleTagView = holder.f167012m;
        TextView textView = holder.k;
        ImageView imageView = holder.f;
        int size = payloads.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            if (!(payloads.get(i5) instanceof ip0.ug)) {
                payloads = null;
                break;
            }
            i5++;
        }
        List list3 = payloads;
        boolean z = list3 == null || list3.isEmpty();
        boolean z3 = list3 == null || list3.isEmpty();
        boolean z4 = list3 == null || list3.isEmpty();
        boolean z6 = list3 == null || list3.isEmpty();
        boolean z11 = list3 == null || list3.isEmpty();
        boolean z12 = list3 == null || list3.isEmpty();
        boolean z29 = list3 == null || list3.isEmpty();
        boolean z31 = list3 == null || list3.isEmpty();
        boolean z41 = list3 == null || list3.isEmpty();
        boolean z49 = list3 == null || list3.isEmpty();
        boolean z54 = list3 == null || list3.isEmpty();
        if (payloads != null) {
            for (ip0.ug ugVar : payloads) {
                z = z || ugVar.f166654a;
                z3 = z3 || ugVar.f166655b;
                z4 = z4 || ugVar.f166656c;
                z6 = z6 || ugVar.d;
                z11 = z11 || ugVar.e;
                z12 = z12 || ugVar.f;
                z29 = z29 || ugVar.f166657g;
                z31 = z31 || ugVar.f166658h;
                z41 = z41 || ugVar.i;
                z49 = z49 || ugVar.f166659j;
                z54 = z54 || ugVar.k;
            }
        }
        if (z) {
            zi0.c.g(imageView, data.f52270b);
        }
        if (z3) {
            kli.a.b(holder.f167008g, data.f52271c, ty0.f.f275450a);
        }
        if (z4) {
            kli.a.b(holder.f167009h, data.d, ty0.f.f275450a);
        }
        if (z11) {
            b6 b6Var = data.f;
            TextView textView2 = holder.i;
            kli.a.b(textView, b6Var != null ? b6Var.f53712a : null, ty0.f.f275450a);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, b6Var != null ? b6Var.f53714c : 0, 0);
            Clause clause = b6Var != null ? b6Var.f53713b : null;
            ty0.d dVar = ty0.d.f275448a;
            kli.a.b(textView2, clause, dVar);
            kli.a.b(holder.f167010j, b6Var != null ? b6Var.e : null, dVar);
            if (b6Var == null || (a6Var = b6Var.d) == null) {
                a6Var = a6.DEFAULT;
            }
            int i6 = c6.f53744a[a6Var.ordinal()];
            if (i6 == 1) {
                jb3.l.e(textView2, R$attr.internal_textAppearanceHeading3);
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                jb3.l.e(textView2, R$attr.internal_textAppearanceBody2);
            }
            holder.f167019w.setVisibility(b6Var != null ? 0 : 8);
        }
        if (z12) {
            ip0.qg qgVar = data.f52272g;
            kli.a.b(holder.f167011l, qgVar != null ? qgVar.f165974a : null, ty0.f.f275450a);
            doubleTagView.setPrimaryTag(qgVar != null ? qgVar.f165975b : null);
            doubleTagView.setSecondaryTag(null);
            holder.f167020x.setVisibility(qgVar != null ? 0 : 8);
        }
        if (z29) {
            ip0.vg vgVar = data.f52273h;
            TextView textView3 = holder.o;
            RevPointsPriceView revPointsPriceView = holder.f167014p;
            kli.a.b(textView3, vgVar != null ? vgVar.f166810a : null, ty0.f.f275450a);
            revPointsPriceView.setVisibility(vgVar != null ? 0 : 8);
            if (vgVar != null) {
                revPointsPriceView.setContent(vgVar.f166811b);
            }
            holder.f167013n.setVisibility(vgVar != null ? 0 : 8);
        }
        if (z6) {
            LinearLayout linearLayout = holder.f167016r;
            List list4 = data.e;
            int childCount = linearLayout.getChildCount() - list4.size();
            if (childCount > 0) {
                linearLayout.removeViews(list4.size(), childCount);
            }
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 4.0f);
            int size2 = list4.size() - 1;
            int size3 = list4.size();
            int i21 = 0;
            while (i21 < size3) {
                ip0.tg tgVar = (ip0.tg) list4.get(i21);
                View childAt = linearLayout.getChildAt(i21);
                boolean z74 = z54;
                ToDoItemView toDoItemView = childAt instanceof ToDoItemView ? (ToDoItemView) childAt : null;
                if (toDoItemView == null) {
                    Context context2 = linearLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    i2 = size3;
                    list2 = list4;
                    i3 = iK;
                    toDoItemView = new ToDoItemView(context2, null, 6, 0);
                    linearLayout.addView(toDoItemView);
                } else {
                    i2 = size3;
                    list2 = list4;
                    i3 = iK;
                }
                toDoItemView.setModel(new aw0.pa(tgVar.f166516a, tgVar.f166517b, aw0.oa.LEGACY_CONTENT_COLOR));
                int i22 = i21 == 0 ? 0 : i3;
                int i32 = i21 == size2 ? 0 : i3;
                ViewGroup.LayoutParams layoutParams = toDoItemView.getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.topMargin != i22 || marginLayoutParams.bottomMargin != i32) {
                    ViewGroup.LayoutParams layoutParams2 = toDoItemView.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = i22;
                    marginLayoutParams2.bottomMargin = i32;
                    toDoItemView.setLayoutParams(marginLayoutParams2);
                }
                i21++;
                z54 = z74;
                size3 = i2;
                list4 = list2;
                iK = i3;
            }
        }
        boolean z83 = z54;
        if (z41) {
            ip0.rg rgVar = data.k;
            largeActionButton.setText((Clause) rgVar.f166181a);
            largeActionButton.o(rgVar.f166183c);
            largeActionButton.setIcon(rgVar.f166182b);
            largeActionButton.setEnabled(rgVar.d);
        }
        if (z49) {
            List<TagViewData> list5 = data.f52274j;
            flexboxLayout.removeAllViews();
            if (list5 != null) {
                for (TagViewData tagViewData : list5) {
                    Context context3 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    TagView tagView = new TagView(context3, null, 6, 0);
                    tagView.setContent(tagViewData);
                    flexboxLayout.addView(tagView);
                }
            }
        }
        if (z83) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            extraLargeListingCardDelegate = this;
            or0.b.c(extraLargeListingCardDelegate, data, itemView, false, null, 28);
        } else {
            extraLargeListingCardDelegate = this;
        }
        if (z31) {
            ip0.sg sgVar = data.i;
            holder.f167018t.setVisibility(sgVar != null ? 0 : 8);
            kli.a.b(holder.u, sgVar != null ? sgVar.f166348a : null, ty0.f.f275450a);
            kli.a.b(holder.v, sgVar != null ? sgVar.f166349b : null, ty0.f.f275450a);
        }
        efm.r map = largeActionButton.o.map(new ip0.a9(new ip0.ad(data, 7), 28));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        extraLargeListingCardDelegate.d.a(map, holder);
        extraLargeListingCardDelegate.f.a(doubleTagView.f58516b, holder);
        extraLargeListingCardDelegate.f52267g.a(doubleTagView.f, holder);
        a aVar = data.f52275l;
        if ((aVar instanceof a.b) && ((a.b) aVar).f52285a) {
            or0.m.a(imageView);
            imageView.setOnClickListener(new ip0.xg(data, extraLargeListingCardDelegate, data, 0));
        } else {
            or0.u.o(imageView);
        }
        if (Intrinsics.f(data.f52275l, a.C0403a.f52284a)) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.m.a(itemView2);
            itemView2.setOnClickListener(new ip0.xg(data, extraLargeListingCardDelegate, data, 1));
        } else {
            View itemView3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            or0.u.o(itemView3);
        }
        fp0.p pVar = holder.f167021y;
        b6 b6Var2 = data.f;
        boolean z89 = (b6Var2 != null ? b6Var2.f53714c : 0) != 0;
        fp0.p.b(pVar, z89);
        View view = pVar.f137029a;
        or0.m.a(view);
        if (z89) {
            view.setOnClickListener(new au0.r2(extraLargeListingCardDelegate, data, 7));
        } else {
            or0.u.o(view);
        }
        View itemView4 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
        or0.b.c(extraLargeListingCardDelegate, data, itemView4, true, null, 24);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ExtraLargeListingCardDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/a6", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f52270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextClause f52271c;
        public final Object d;
        public final List e;
        public final b6 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ip0.qg f52272g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ip0.vg f52273h;
        public final ip0.sg i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f52274j;
        public final ip0.rg k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final a f52275l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Object f52276m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Parcelable f52277n;
        public qv0.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52278p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52279q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f52280r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f52281s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f52282t;
        public int u;
        public final int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f52283w;

        public Model(String str, Image image, TextClause textClause, Clause clause, List list, b6 b6Var, ip0.qg qgVar, ip0.vg vgVar, ip0.sg sgVar, List list2, ip0.rg rgVar, a aVar, Object obj2) {
            this.f52269a = str;
            this.f52270b = image;
            this.f52271c = textClause;
            this.d = clause;
            this.e = list;
            this.f = b6Var;
            this.f52272g = qgVar;
            this.f52273h = vgVar;
            this.i = sgVar;
            this.f52274j = list2;
            this.k = rgVar;
            this.f52275l = aVar;
            this.f52276m = obj2;
            this.f52277n = null;
            this.o = c.d.f249513a;
            this.f52278p = null;
            this.f52279q = null;
            this.f52280r = null;
            this.f52281s = null;
            int i = R$attr.uikit_dp0;
            this.f52282t = i;
            this.u = i;
            this.v = i;
            this.f52283w = i;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ExtraLargeListingCardDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF58324n() {
            return this.f52276m;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF58316a() {
            return this.f52269a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52269a, model.f52269a) && Intrinsics.f(this.f52270b, model.f52270b) && Intrinsics.f(this.f52271c, model.f52271c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52272g, model.f52272g) && Intrinsics.f(this.f52273h, model.f52273h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52274j, model.f52274j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52275l, model.f52275l) && Intrinsics.f(this.f52276m, model.f52276m) && Intrinsics.f(this.f52277n, model.f52277n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52278p, model.f52278p) && Intrinsics.f(this.f52279q, model.f52279q) && Intrinsics.f(this.f52280r, model.f52280r) && Intrinsics.f(this.f52281s, model.f52281s);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF() {
            return this.f52282t;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52282t = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF57047h() {
            return this.f52277n;
        }

        public final int hashCode() {
            int iHashCode = this.f52269a.hashCode() * 31;
            Image image = this.f52270b;
            int iD = p.a.d(p.a.b(ip0.v7.b((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f52271c), 31, this.d), 31, this.e);
            b6 b6Var = this.f;
            int iHashCode2 = (iD + (b6Var == null ? 0 : b6Var.hashCode())) * 31;
            ip0.qg qgVar = this.f52272g;
            int iHashCode3 = (iHashCode2 + (qgVar == null ? 0 : qgVar.hashCode())) * 31;
            ip0.vg vgVar = this.f52273h;
            int iHashCode4 = (iHashCode3 + (vgVar == null ? 0 : vgVar.hashCode())) * 31;
            ip0.sg sgVar = this.i;
            int iHashCode5 = (iHashCode4 + (sgVar == null ? 0 : sgVar.hashCode())) * 31;
            List list = this.f52274j;
            int iHashCode6 = (this.f52275l.hashCode() + ((this.k.hashCode() + ((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
            Object obj2 = this.f52276m;
            int iHashCode7 = (iHashCode6 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52277n;
            int i = h30.l.i(this.o, (iHashCode7 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52278p;
            int iHashCode8 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52279q;
            int iHashCode9 = (iHashCode8 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52280r;
            int iHashCode10 = (iHashCode9 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52281s;
            return iHashCode10 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52250l() {
            return this.f52278p;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.o = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52251m() {
            return this.f52279q;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52280r = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52247g() {
            return this.u;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getI() {
            return this.f52283w;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.u = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52253p() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getO() {
            return this.f52281s;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52252n() {
            return this.f52280r;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52278p = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52277n = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52248h() {
            return this.v;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52279q = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52281s = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            boolean z = true;
            boolean z3 = !Intrinsics.f(model.f52270b, this.f52270b);
            boolean z4 = !Intrinsics.f(model.f52271c, this.f52271c);
            boolean z6 = !Intrinsics.f(model.d, this.d);
            boolean z11 = !Intrinsics.f(model.e, this.e);
            boolean z12 = !Intrinsics.f(model.f, this.f);
            boolean z29 = !Intrinsics.f(model.f52272g, this.f52272g);
            boolean z31 = !Intrinsics.f(model.f52273h, this.f52273h);
            boolean z41 = !Intrinsics.f(model.i, this.i);
            boolean z49 = !Intrinsics.f(model.k, this.k);
            boolean z54 = !Intrinsics.f(model.f52274j, this.f52274j);
            if (Intrinsics.f(model.f52278p, this.f52278p) && Intrinsics.f(model.f52279q, this.f52279q) && Intrinsics.f(model.f52280r, this.f52280r) && Intrinsics.f(model.f52281s, this.f52281s)) {
                z = false;
            }
            return new ip0.ug(z3, z4, z6, z11, z12, z29, z31, z41, z49, z54, z);
        }

        public Model(String listId, UrlImage urlImage, TextClause title, Clause subtitle, AbstractList listingCardItems, Clause clause, int i, Clause clause2, a6 a6Var, MoneyClause moneyClause, TextLocalisedClause textLocalisedClause, TagViewData tagViewData, Clause clause3, nw0.a aVar, TextLocalisedClause textLocalisedClause2, CompositeClause compositeClause, List list, Clause buttonText, ResourceImage resourceImage, boolean z, Object obj2, int i2) {
            a clicksTarget;
            UrlImage urlImage2 = (i2 & 2) != 0 ? null : urlImage;
            a6 priceStyle = (i2 & 256) != 0 ? a6.DEFAULT : a6Var;
            MoneyClause moneyClause2 = (i2 & 512) != 0 ? null : moneyClause;
            TextLocalisedClause textLocalisedClause3 = (i2 & 1024) != 0 ? null : textLocalisedClause;
            TagViewData tagViewData2 = (i2 & 2048) != 0 ? null : tagViewData;
            TextLocalisedClause textLocalisedClause4 = (32768 & i2) != 0 ? null : textLocalisedClause2;
            CompositeClause compositeClause2 = (65536 & i2) != 0 ? null : compositeClause;
            List list2 = (131072 & i2) != 0 ? null : list;
            LargeActionButton.ButtonStyle.DefaultFilledButton buttonStyle = LargeActionButton.ButtonStyle.f58726b;
            ResourceImage resourceImage2 = (1048576 & i2) != 0 ? null : resourceImage;
            if ((i2 & 4194304) != 0) {
                clicksTarget = new a.b(0);
            } else {
                clicksTarget = a.C0403a.f52284a;
            }
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            UrlImage urlImage3 = urlImage2;
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(listingCardItems, "listingCardItems");
            Intrinsics.checkNotNullParameter(priceStyle, "priceStyle");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            Intrinsics.checkNotNullParameter(clicksTarget, "clicksTarget");
            a aVar2 = clicksTarget;
            ResourceImage resourceImage3 = resourceImage2;
            b6 b6Var = new b6(clause, clause2, i, priceStyle, moneyClause2);
            ip0.qg qgVar = (textLocalisedClause3 == null || tagViewData2 == null) ? null : new ip0.qg(tagViewData2, textLocalisedClause3);
            ip0.qg qgVar2 = qgVar;
            this(listId, urlImage3, title, subtitle, listingCardItems, b6Var, qgVar2, (clause3 == null || aVar == null) ? null : new ip0.vg(clause3, aVar), (textLocalisedClause4 == null || compositeClause2 == null) ? null : new ip0.sg(textLocalisedClause4, compositeClause2), list2, new ip0.rg(buttonText, resourceImage3, buttonStyle, z), aVar2, obj2);
        }
    }
}
