package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.TagsView;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.hv;
import ip0.kv;
import ip0.mv;
import ip0.nv;
import ip0.ov;
import ip0.pv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\t\u0003\u0002\u0007\b\t\n\u000b\f\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ListingTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/u8;", "Lip0/nv;", "<init>", "()V", "Companion", "ip0/gv", "ip0/jv", "ip0/iv", "ip0/hv", "ip0/mv", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListingTileDelegate extends BaseRecyclerViewDelegate<u8, nv> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52751c;
    public final ihm.f d;
    public final ihm.f e;

    public static abstract class b {
        private b() {
        }
    }

    public ListingTileDelegate() {
        super(R$layout.internal_delegate_listing_tile, new fv(0));
        this.f52751c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new nv(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_listing_tile));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(nv holder, u8 data, int i, List list) {
        ProgressBar progressBar;
        ListingTileDelegate listingTileDelegate;
        ProgressBar progressBar2;
        int i2;
        int i3;
        int i5;
        int i6;
        int i21;
        int i22;
        ArrayList arrayList;
        int i32;
        mx0.pc pcVar;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        ProgressBar progressBar3 = holder.f165575m;
        ImageView imageView = holder.f165580s;
        TagView tagView = holder.f165579r;
        FrameLayout frameLayout = holder.f165578q;
        View view = holder.f165581t;
        TextView textView = holder.i;
        TextView textView2 = holder.f165572h;
        TextView textView3 = holder.f165571g;
        List list2 = payloads;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                } else if (!(it8.next() instanceof hv)) {
                    payloads = null;
                    break;
                }
            }
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        Intrinsics.i(payloads, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.ListingTileDelegate.Payload>");
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it9 = payloads.iterator();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        boolean z54 = z49;
        boolean z74 = z54;
        while (it9.hasNext()) {
            hv hvVar = (hv) it9.next();
            zIsEmpty = zIsEmpty || hvVar.f164601a;
            z = z || hvVar.f164602b;
            z3 = z3 || hvVar.f164603c;
            Iterator it10 = it9;
            z4 = z4 || hvVar.d;
            z6 = z6 || hvVar.e;
            z11 = z11 || hvVar.f;
            z12 = z12 || hvVar.f164604g;
            z29 = z29 || hvVar.f164605h;
            z31 = z31 || hvVar.i;
            z41 = z41 || hvVar.f164606j;
            z49 = z49 || hvVar.k;
            z54 = z54 || hvVar.f164607l;
            z74 = z74 || hvVar.f164608m;
            it9 = it10;
        }
        if (zIsEmpty) {
            kli.a.b(textView3, data.f54808b, ty0.f.f275450a);
        }
        if (z) {
            kli.a.b(textView2, data.f54809c, ty0.f.f275450a);
        }
        if (z3) {
            kli.a.b(textView, data.d, ty0.f.f275450a);
        }
        if (z4) {
            or0.b.i(this, data.e, holder.f, null);
        }
        if (z6) {
            mv mvVar = data.f;
            FrameLayout frameLayout2 = holder.f165577p;
            TagsView tagsView = holder.f165576n;
            frameLayout2.setVisibility(mvVar != null ? 0 : 8);
            boolean z83 = mvVar instanceof kv;
            tagsView.setVisibility(z83 ? 0 : 8);
            holder.o.setVisibility(8);
            if (z83) {
                ArrayList arrayList2 = ((kv) mvVar).f165088a;
                if (arrayList2.size() > 2) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    progressBar = progressBar3;
                    rd0.d.a(rd0.c.ERROR, "ListingTileDelegate", "max 2 badges are allowed in top left badges", null, h0Var);
                } else {
                    progressBar = progressBar3;
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                int i33 = 0;
                while (i33 < size) {
                    TagViewData tagViewData = (TagViewData) arrayList2.get(i33);
                    if (i33 >= 2) {
                        arrayList = arrayList2;
                        i32 = size;
                        pcVar = null;
                    } else {
                        arrayList = arrayList2;
                        i32 = size;
                        pcVar = new mx0.pc(a0.d.n("TAGS_VIEW_", i33), tagViewData, null);
                    }
                    if (pcVar != null) {
                        arrayList3.add(pcVar);
                    }
                    i33++;
                    arrayList2 = arrayList;
                    size = i32;
                }
                tagsView.setModel(new mx0.qc(arrayList3, 1));
            } else {
                progressBar = progressBar3;
                if (mvVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            progressBar = progressBar3;
        }
        if (z11) {
            b bVar = data.f54810g;
            if (bVar != null) {
                frameLayout.setVisibility(0);
                if (!(bVar instanceof v8)) {
                    throw new NoWhenBranchMatchedException();
                }
                imageView.setVisibility(8);
                tagView.setVisibility(0);
                tagView.setContent(((v8) bVar).f54859a);
            } else {
                imageView.setVisibility(8);
                tagView.setVisibility(8);
                frameLayout.setVisibility(8);
            }
        }
        if (z12) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            listingTileDelegate = this;
            or0.b.c(listingTileDelegate, data, itemView, false, null, 28);
        } else {
            listingTileDelegate = this;
        }
        if (z29) {
            int i43 = ov.f165732c[data.f54811h.ordinal()];
            if (i43 == 1) {
                view.setBackground(holder.itemView.getContext().getDrawable(R$drawable.internal_listing_gradient_overlay));
            } else if (i43 == 2) {
                view.setBackground(holder.itemView.getContext().getDrawable(R$drawable.internal_listing_gradient_horizontal_overlay));
            } else {
                if (i43 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                view.setBackground(null);
            }
        }
        if (z31) {
            holder.u.setGuidelinePercent(data.i.a());
        }
        if (z41) {
            aw0.v1 v1Var = data.f54812j;
            Context context = holder.itemView.getContext();
            int i59 = ov.f165730a[v1Var.ordinal()];
            if (i59 == 1) {
                i6 = R$attr.uikit_colorWhite;
                i21 = R$attr.uikit_colorWhite_80;
                i22 = R$attr.uikit_colorGrey10_20;
            } else {
                if (i59 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i6 = R$attr.uikit_colorBlack;
                i21 = R$attr.uikit_colorBlack_80;
                i22 = R$attr.uikit_colorBlack_20;
            }
            int i66 = i22;
            int i74 = i21;
            Intrinsics.h(context);
            textView3.setTextColor(kli.a.s(i6, context));
            textView2.setTextColor(kli.a.s(i21, context));
            textView.setTextColor(kli.a.s(i74, context));
            progressBar2 = progressBar;
            progressBar2.setProgressTintList(ColorStateList.valueOf(kli.a.s(i6, context)));
            progressBar2.setProgressBackgroundTintList(ColorStateList.valueOf(kli.a.s(i66, context)));
        } else {
            progressBar2 = progressBar;
        }
        if (z49) {
            int i92 = ov.f165731b[data.k.ordinal()];
            if (i92 == 1) {
                i5 = R$attr.internal_textAppearanceHeading3;
            } else {
                if (i92 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = R$attr.internal_textAppearanceHeading1;
            }
            jb3.l.e(textView3, i5);
        }
        fp0.p pVar = holder.f165573j;
        boolean z89 = data.f54813l;
        fp0.p.b(pVar, z89);
        View view2 = pVar.f137029a;
        or0.m.a(view2);
        if (z89) {
            i2 = 0;
            view2.setOnClickListener(new pv(listingTileDelegate, data, i2));
        } else {
            i2 = 0;
            or0.u.o(view2);
        }
        boolean z96 = (z89 && data.f54814m && data.f54809c != null) ? 1 : i2;
        fp0.p pVar2 = holder.k;
        fp0.p.b(pVar2, z96);
        View view3 = pVar2.f137029a;
        or0.m.a(view3);
        if (z96 != 0) {
            i3 = 1;
            view3.setOnClickListener(new pv(listingTileDelegate, data, i3));
        } else {
            i3 = 1;
            or0.u.o(view3);
        }
        or0.u.n(textView2, z96);
        boolean z100 = (z89 && data.f54815n && data.d != null) ? i3 : i2;
        fp0.p pVar3 = holder.f165574l;
        fp0.p.b(pVar3, z100);
        View view4 = pVar3.f137029a;
        or0.m.a(view4);
        if (z100 != 0) {
            view4.setOnClickListener(new pv(listingTileDelegate, data, 2));
        } else {
            or0.u.o(view4);
        }
        or0.u.n(textView, z100);
        if (z54) {
            progressBar2.setVisibility(8);
        }
        if (z74) {
            List listF0 = data.o;
            if (listF0.size() > 4) {
                List listV0 = zhm.d0.V0(listF0, 3);
                Context context2 = holder.v.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                listF0 = zhm.d0.F0(new TextImage(a0.d.n("+", listF0.size() - 3), kli.a.s(R$attr.uikit_colorWhite, context2), kli.a.s(R$attr.uikit_colorWhite_10, context2), 0, 14, 40, 200), listV0);
            }
            OverlappedIconsView.setIcons$default(holder.v, listF0, mx0.bb.REGULAR12, mx0.cb.TOP_TO_BOTTOM, 0, false, 16, null);
        }
    }
}
