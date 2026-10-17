package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.DoubleTagView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.hq;
import ip0.ku;
import ip0.lu;
import ip0.mu;
import ip0.pu;
import ip0.qu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0003\u0002\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ListingCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ku;", "Lip0/pu;", "<init>", "()V", "Companion", "ip0/lu", "ip0/mu", "ip0/ju", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListingCardDelegate extends BaseRecyclerViewDelegate<ku, pu> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52747c;
    public final e01.a d;
    public final e01.a e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f52748g;

    public ListingCardDelegate() {
        super(R$layout.internal_delegate_listing_card, new hq(26));
        this.f52747c = v0.a.d("create(...)");
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = v0.a.d("create(...)");
        this.f52748g = v0.a.d("create(...)");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void q(ip0.ku r4, ip0.pu r5) {
        /*
            aw0.i9 r0 = r4.f165084t
            if (r0 == 0) goto L2f
            com.revolut.core.ui_kit.internal.views.RatingCell r0 = r5.f165881y
            r1 = 0
            r0.setVisibility(r1)
            com.revolut.core.ui_kit.internal.views.RatingCell r5 = r5.f165881y
            aw0.i9 r4 = r4.f165084t
            java.lang.Float r0 = r4.f10362c
            if (r0 == 0) goto L26
            float r0 = r0.floatValue()
            double r0 = (double) r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L26
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L26
            java.lang.Float r0 = r4.f10362c
            goto L27
        L26:
            r0 = 0
        L27:
            aw0.i9 r4 = aw0.i9.a(r4, r0)
            r5.setContent(r4)
            return
        L2f:
            com.revolut.core.ui_kit.internal.views.RatingCell r4 = r5.f165881y
            r5 = 8
            r4.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.ListingCardDelegate.q(ip0.ku, ip0.pu):void");
    }

    public static void r(ku kuVar, pu puVar) {
        TextView textView = puVar.f165877s;
        mu muVar = kuVar.f165081q;
        CompositeClause compositeClause = null;
        kli.a.b(textView, muVar != null ? muVar.f165419a : null, ty0.f.f275450a);
        TextView textView2 = puVar.f165878t;
        mu muVar2 = kuVar.f165081q;
        if (muVar2 != null) {
            List listK = zhm.v.k(muVar2.f165420b, new TextClause("+", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126));
            m70.a.t(kotlin.jvm.internal.t0.f186434a);
            compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), null, null, 12);
        }
        kli.a.b(textView2, compositeClause, ty0.f.f275450a);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new pu(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_listing_card));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(pu holder, ku data, int i, List payloads) {
        DoubleTagView doubleTagView;
        pu puVar;
        int i2;
        int i3;
        ListingCardDelegate listingCardDelegate;
        TextView textView;
        pu puVar2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        TextView textView2;
        TagView tagView;
        int i5;
        TagView tagView2;
        TagView tagView3;
        TagView tagView4;
        Iterator it8;
        TextView textView3;
        String str;
        TagView tagView5;
        ImageView imageView4;
        TextView textView4;
        DoubleTagView doubleTagView2;
        View view;
        TextView textView5;
        TextView textView6;
        ImageView imageView5;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        View view2;
        TextView textView10;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView11 = holder.C;
        TextView textView12 = holder.B;
        TextView textView13 = holder.z;
        ImageView imageView6 = holder.f165872m;
        TextView textView14 = holder.f165876r;
        View view3 = holder.f165875q;
        TextView textView15 = holder.o;
        TextView textView16 = holder.f165871l;
        TextView textView17 = holder.f165870j;
        TextView textView18 = holder.i;
        ImageView imageView7 = holder.f165869h;
        TextView textView19 = holder.f165868g;
        TextView textView20 = holder.f;
        TextView textView21 = textView11;
        View view4 = holder.A;
        TextView textView22 = textView12;
        TextView textView23 = holder.k;
        View view5 = view4;
        DoubleTagView doubleTagView3 = holder.f165874p;
        TextView textView24 = textView13;
        TagView tagView6 = holder.f165880x;
        TagView tagView7 = holder.f165879w;
        boolean zIsEmpty = payloads.isEmpty();
        TagView tagView8 = tagView6;
        String str2 = "itemView";
        ty0.d dVar = ty0.d.f275448a;
        TagView tagView9 = tagView7;
        if (zIsEmpty) {
            Image image = data.f165078m;
            Clause clause = data.f165076j;
            Clause clause2 = data.i;
            List list = data.f165077l;
            Clause clause3 = data.f165080p;
            zi0.c.g(imageView6, image);
            kli.a.b(textView20, data.f165072b, ty0.f.f275450a);
            kli.a.b(textView19, data.f165073c, ty0.f.f275450a);
            zi0.c.g(imageView7, data.d);
            kli.a.b(textView18, data.e, dVar);
            textView23.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, data.f165075h, 0);
            kli.a.b(textView23, data.f165074g, ty0.f.f275450a);
            kli.a.b(textView17, data.f, dVar);
            kli.a.b(textView16, data.k, ty0.f.f275450a);
            kli.a.b(textView15, data.f165079n, ty0.f.f275450a);
            doubleTagView = doubleTagView3;
            doubleTagView.setPrimaryTag(data.o);
            doubleTagView.setSecondaryTag(null);
            view3.setVisibility(clause3 != null ? 0 : 8);
            kli.a.b(textView14, clause3, ty0.f.f275450a);
            puVar = holder;
            r(data, puVar);
            puVar.u.setVisibility(list != null ? 0 : 8);
            kli.a.b(textView24, data.u, ty0.f.f275450a);
            puVar.J(list == null ? zhm.f0.f322471a : list);
            view5.setVisibility((clause2 == null && clause == null) ? 8 : 0);
            kli.a.b(textView22, clause2, ty0.f.f275450a);
            kli.a.b(textView21, clause, ty0.f.f275450a);
            q(data, puVar);
            TagViewData tagViewData = data.f165082r;
            if (tagViewData != null) {
                i3 = 0;
                tagView9.setVisibility(0);
                tagView9.setContent(tagViewData);
                i2 = 8;
            } else {
                i2 = 8;
                i3 = 0;
                tagView9.setVisibility(8);
            }
            TagViewData tagViewData2 = data.f165083s;
            if (tagViewData2 != null) {
                tagView8.setVisibility(i3);
                tagView8.setContent(tagViewData2);
            } else {
                tagView8.setVisibility(i2);
            }
            holder.H(data);
            View view6 = puVar.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, str2);
            listingCardDelegate = this;
            or0.b.c(listingCardDelegate, data, view6, false, null, 28);
        } else {
            List list2 = payloads;
            ImageView imageView8 = imageView6;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (Iterator it9 = list2.iterator(); it9.hasNext(); it9 = it9) {
                Object next = it9.next();
                Intrinsics.i(next, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ListingCardDelegate.Payload");
                arrayList.add((lu) next);
            }
            for (Iterator it10 = arrayList.iterator(); it10.hasNext(); it10 = it8) {
                lu luVar = (lu) it10.next();
                if (luVar.f165260a) {
                    kli.a.b(textView20, data.f165072b, ty0.f.f275450a);
                }
                if (luVar.f165261b) {
                    kli.a.b(textView19, data.f165073c, ty0.f.f275450a);
                }
                if (luVar.f165262c) {
                    zi0.c.g(imageView7, data.d);
                }
                if (luVar.d) {
                    kli.a.b(textView18, data.e, dVar);
                }
                if (luVar.f165263g || luVar.e) {
                    kli.a.b(textView23, data.f165074g, ty0.f.f275450a);
                    textView = textView18;
                    textView23.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, data.f165075h, 0);
                } else {
                    textView = textView18;
                }
                if (luVar.f) {
                    kli.a.b(textView17, data.f, dVar);
                }
                if (luVar.f165266l) {
                    kli.a.b(textView16, data.k, ty0.f.f275450a);
                }
                if (luVar.f165267m) {
                    kli.a.b(textView15, data.f165079n, ty0.f.f275450a);
                }
                if (luVar.f165268n) {
                    doubleTagView3.setPrimaryTag(data.o);
                }
                if (luVar.o) {
                    data.getClass();
                    doubleTagView3.setSecondaryTag(null);
                }
                if (luVar.f165269p) {
                    view3.setVisibility(data.f165080p != null ? 0 : 8);
                    kli.a.b(textView14, data.f165080p, ty0.f.f275450a);
                }
                if (luVar.f165270q) {
                    puVar2 = holder;
                    r(data, puVar2);
                } else {
                    puVar2 = holder;
                }
                if (luVar.k) {
                    imageView = imageView7;
                    imageView2 = imageView8;
                    zi0.c.g(imageView2, data.f165078m);
                } else {
                    imageView = imageView7;
                    imageView2 = imageView8;
                }
                if (luVar.f165271r) {
                    TagViewData tagViewData3 = data.f165082r;
                    if (tagViewData3 != null) {
                        imageView3 = imageView2;
                        textView2 = textView19;
                        tagView = tagView9;
                        i5 = 0;
                        tagView.setVisibility(0);
                        tagView.setContent(tagViewData3);
                    } else {
                        imageView3 = imageView2;
                        textView2 = textView19;
                        tagView = tagView9;
                        i5 = 0;
                        tagView.setVisibility(8);
                    }
                } else {
                    imageView3 = imageView2;
                    textView2 = textView19;
                    tagView = tagView9;
                    i5 = 0;
                }
                if (luVar.f165272s) {
                    TagViewData tagViewData4 = data.f165083s;
                    if (tagViewData4 != null) {
                        tagView2 = tagView;
                        tagView3 = tagView8;
                        tagView3.setVisibility(i5);
                        tagView3.setContent(tagViewData4);
                    } else {
                        tagView2 = tagView;
                        tagView3 = tagView8;
                        tagView3.setVisibility(8);
                    }
                } else {
                    tagView2 = tagView;
                    tagView3 = tagView8;
                }
                if (luVar.f165265j) {
                    List list3 = data.f165077l;
                    if (list3 == null) {
                        list3 = zhm.f0.f322471a;
                    }
                    puVar2.J(list3);
                }
                if (luVar.f165273t) {
                    q(data, puVar2);
                }
                if (luVar.u) {
                    View view7 = puVar2.itemView;
                    TagView tagView10 = tagView3;
                    String str3 = str2;
                    Intrinsics.checkNotNullExpressionValue(view7, str3);
                    it8 = it10;
                    view = view3;
                    tagView4 = tagView10;
                    tagView5 = tagView2;
                    imageView4 = imageView3;
                    imageView5 = imageView;
                    str = str3;
                    doubleTagView2 = doubleTagView3;
                    textView3 = textView14;
                    textView5 = textView15;
                    textView6 = textView2;
                    textView4 = textView;
                    textView7 = textView20;
                    or0.b.c(this, data, view7, false, null, 28);
                } else {
                    tagView4 = tagView3;
                    it8 = it10;
                    textView3 = textView14;
                    str = str2;
                    tagView5 = tagView2;
                    imageView4 = imageView3;
                    textView4 = textView;
                    doubleTagView2 = doubleTagView3;
                    view = view3;
                    textView5 = textView15;
                    textView6 = textView2;
                    imageView5 = imageView;
                    textView7 = textView20;
                }
                if (luVar.v) {
                    textView8 = textView24;
                    kli.a.b(textView8, data.u, ty0.f.f275450a);
                } else {
                    textView8 = textView24;
                }
                if (luVar.f165264h) {
                    view2 = view5;
                    view2.setVisibility(data.i != null ? 0 : 8);
                    textView9 = textView22;
                    kli.a.b(textView9, data.i, ty0.f.f275450a);
                } else {
                    textView9 = textView22;
                    view2 = view5;
                }
                if (luVar.i) {
                    view2.setVisibility(data.f165076j != null ? 0 : 8);
                    textView10 = textView21;
                    kli.a.b(textView10, data.f165076j, ty0.f.f275450a);
                } else {
                    textView10 = textView21;
                }
                if (luVar.f165274w) {
                    holder.H(data);
                }
                textView24 = textView8;
                view5 = view2;
                textView22 = textView9;
                textView21 = textView10;
                textView19 = textView6;
                textView18 = textView4;
                imageView7 = imageView5;
                textView20 = textView7;
                textView14 = textView3;
                view3 = view;
                doubleTagView3 = doubleTagView2;
                textView15 = textView5;
                tagView8 = tagView4;
                tagView9 = tagView5;
                str2 = str;
                imageView8 = imageView4;
            }
            listingCardDelegate = this;
            doubleTagView = doubleTagView3;
            i3 = 0;
            puVar = holder;
        }
        fp0.p pVar = puVar.G;
        boolean z = data.f165075h != 0 ? 1 : i3;
        fp0.p.b(pVar, z);
        View view8 = pVar.f137029a;
        or0.m.a(view8);
        if (z != 0) {
            view8.setOnClickListener(new qu(listingCardDelegate, data, 0));
        } else {
            or0.u.o(view8);
        }
        fp0.p pVar2 = puVar.F;
        boolean z3 = data.f165085w;
        fp0.p.b(pVar2, z3);
        View view9 = pVar2.f137029a;
        or0.m.a(view9);
        if (z3) {
            view9.setOnClickListener(new qu(listingCardDelegate, data, 1));
        } else {
            or0.u.o(view9);
        }
        fp0.p pVar3 = puVar.f165873n;
        boolean z4 = data.f165078m == null ? i3 : 1;
        fp0.p.b(pVar3, z4);
        View view10 = pVar3.f137029a;
        or0.m.a(view10);
        if (z4 != 0) {
            view10.setOnClickListener(new qu(listingCardDelegate, data, 2));
        } else {
            or0.u.o(view10);
        }
        listingCardDelegate.d.a(doubleTagView.f58516b, puVar);
        listingCardDelegate.e.a(doubleTagView.f, puVar);
    }
}
