package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0007\b\t\n\u000b\u0003\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FixedTabsDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/FixedTabsDelegate$Model;", "Lip0/pi;", "<init>", "()V", "Companion", "Model", "com/revolut/core/ui_kit/delegates/g6", "ip0/oi", "ip0/ni", "ExtraButton", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FixedTabsDelegate extends BaseRecyclerViewDelegate<Model, ip0.pi> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52339c;
    public final e01.a d;
    public final e01.a e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FixedTabsDelegate$ExtraButton;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Icon", "Lcom/revolut/core/ui_kit/delegates/FixedTabsDelegate$ExtraButton$Icon;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ExtraButton extends TrackableItem {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FixedTabsDelegate$ExtraButton$Icon;", "Lcom/revolut/core/ui_kit/delegates/FixedTabsDelegate$ExtraButton;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Icon implements ExtraButton {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ResourceImage f52340a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Parcelable f52341b;

            public Icon(ResourceImage image) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.f52340a = image;
                this.f52341b = null;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj2;
                return Intrinsics.f(this.f52340a, icon.f52340a) && Intrinsics.f(this.f52341b, icon.f52341b);
            }

            @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
            /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
            public final Parcelable getU() {
                return this.f52341b;
            }

            public final int hashCode() {
                int iHashCode = this.f52340a.hashCode() * 31;
                Parcelable parcelable = this.f52341b;
                return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
            }

            @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
            public final void setAnalyticsContext(Parcelable parcelable) {
                this.f52341b = parcelable;
            }
        }
    }

    public FixedTabsDelegate() {
        super(R$layout.internal_delegate_fixed_tabs, new ip0.zf(19));
        this.f52339c = new e01.a();
        this.d = new e01.a();
        this.e = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.pi(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_fixed_tabs));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.pi holder, Model data, int i, List payloads) {
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        FixedTabs fixedTabs = holder.f;
        efm.r map = fixedTabs.f.map(new ip0.qh(4, new ip0.mi(data, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52339c.a(map, holder);
        List list = payloads;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (it8.hasNext()) {
                    if (!(it8.next() instanceof ip0.oi)) {
                        payloads = null;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        Intrinsics.i(payloads, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.FixedTabsDelegate.Payload>");
        boolean zIsEmpty = payloads.isEmpty();
        int size = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        for (int i2 = 0; i2 < size; i2++) {
            ip0.oi oiVar = (ip0.oi) payloads.get(i2);
            zIsEmpty = zIsEmpty || oiVar.f165667a;
            z = z || oiVar.f165668b;
            z3 = z3 || oiVar.f165669c;
            z4 = z4 || oiVar.d;
            z6 = z6 || oiVar.e;
        }
        if (zIsEmpty) {
            fixedTabs.setItems(data.f52343b, data.f52344c);
        }
        if (z && !zIsEmpty && (str = data.f52344c) != null) {
            fixedTabs.i0(str);
        }
        if (z3) {
            fixedTabs.setExtraActions(data.d);
        }
        if (z4) {
            fixedTabs.setFixedTabsWidthMode(data.e);
        }
        if (z6) {
            fixedTabs.setTabsEnabled(data.f);
        }
        efm.r map2 = fixedTabs.f58556l.c().map(new ip0.qh(5, new ip0.mi(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        efm.r map3 = fixedTabs.f58556l.c().map(new ip0.qh(6, new ip0.za(4)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        this.e.a(map3, holder);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        if (Intrinsics.f(data.i, c.d.f249513a)) {
            fixedTabs.setStyle$ui_kit_components_release(mx0.i6.DARK);
        } else {
            fixedTabs.setStyle$ui_kit_components_release(mx0.i6.LIGHT);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FixedTabsDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterable f52343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f52344c;
        public final List d;
        public final mx0.l6 e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f52345g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f52346h;
        public qv0.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f52347j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52348l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52349m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52350n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52351p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52352q;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.FixedTabsDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static final List a(Companion companion, ExtraButton extraButton) {
                companion.getClass();
                if (extraButton instanceof ExtraButton.Icon) {
                    ExtraButton.Icon icon = (ExtraButton.Icon) extraButton;
                    return zhm.u.c(new mx0.lc(icon.f52341b, icon.f52340a, "LEGACY_EXTRA_ACTION_BUTTON_ID"));
                }
                if (extraButton == null) {
                    return zhm.f0.f322471a;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Iterable items, String str, boolean z, Object obj2, int i) {
            zhm.f0 extraActions = zhm.f0.f322471a;
            boolean z3 = (i & 32) != 0 ? true : z;
            Object obj3 = (i & 64) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(extraActions, "extraActions");
            mx0.j6 tabsWidthMode = mx0.j6.f209780a;
            Intrinsics.checkNotNullParameter(tabsWidthMode, "tabsWidthMode");
            this(listId, items, str, extraActions, tabsWidthMode, z3, obj3, 0, 0, 0, 0, 130688);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new FixedTabsDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51565t() {
            return this.f52345g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51552a() {
            return this.f52342a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52342a, model.f52342a) && Intrinsics.f(this.f52343b, model.f52343b) && Intrinsics.f(this.f52344c, model.f52344c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f52345g, model.f52345g) && Intrinsics.f(this.f52346h, model.f52346h) && Intrinsics.f(this.i, model.i) && this.f52347j == model.f52347j && this.k == model.k && this.f52348l == model.f52348l && this.f52349m == model.f52349m && Intrinsics.f(this.f52350n, model.f52350n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52351p, model.f52351p) && Intrinsics.f(this.f52352q, model.f52352q);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51561p() {
            return this.f52347j;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52347j = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getU() {
            return this.f52346h;
        }

        public final int hashCode() {
            int iHashCode = (this.f52343b.hashCode() + (this.f52342a.hashCode() * 31)) * 31;
            String str = this.f52344c;
            int iC = j6.a.c((this.e.hashCode() + p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31, 31, this.f);
            Object obj2 = this.f52345g;
            int iHashCode2 = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52346h;
            int iB = j6.a.b(this.f52349m, j6.a.b(this.f52348l, j6.a.b(this.k, j6.a.b(this.f52347j, h30.l.i(this.i, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f52350n;
            int iHashCode3 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.o;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52351p;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52352q;
            return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51558l() {
            return this.f52350n;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.i = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51559m() {
            return this.o;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52351p = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51562q() {
            return this.k;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51564s() {
            return this.f52349m;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.k = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getK() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getO() {
            return this.f52352q;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51560n() {
            return this.f52351p;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52350n = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52346h = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51563r() {
            return this.f52348l;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52352q = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new ip0.oi(!Intrinsics.f(r9.f52343b, this.f52343b), !Intrinsics.f(r9.f52344c, this.f52344c), !Intrinsics.f(r9.d, this.d), !Intrinsics.f(r9.e, this.e), ((Model) oldItem).f != this.f);
        }

        public Model(String str, Iterable iterable, String str2, List list, mx0.l6 l6Var, boolean z, Object obj2, int i, int i2, int i3, int i5, int i6) {
            l6Var = (i6 & 16) != 0 ? mx0.j6.f209780a : l6Var;
            z = (i6 & 32) != 0 ? true : z;
            i = (i6 & 512) != 0 ? R$attr.uikit_dp16 : i;
            i2 = (i6 & 1024) != 0 ? R$attr.uikit_dp16 : i2;
            i3 = (i6 & 2048) != 0 ? R$attr.uikit_dp16 : i3;
            i5 = (i6 & 4096) != 0 ? R$attr.uikit_dp16 : i5;
            this.f52342a = str;
            this.f52343b = iterable;
            this.f52344c = str2;
            this.d = list;
            this.e = l6Var;
            this.f = z;
            this.f52345g = obj2;
            this.f52346h = null;
            this.i = c.d.f249513a;
            this.f52347j = i;
            this.k = i2;
            this.f52348l = i3;
            this.f52349m = i5;
            this.f52350n = null;
            this.o = null;
            this.f52351p = null;
            this.f52352q = null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Iterable items, String str, Object obj2, ExtraButton.Icon icon, int i, int i2, int i3, int i5, int i6) {
            Object obj3 = (i6 & 8) != 0 ? null : obj2;
            ExtraButton.Icon icon2 = (i6 & 16) == 0 ? icon : null;
            int i21 = (i6 & 32) != 0 ? R$attr.uikit_dp16 : i;
            int i22 = (i6 & 64) != 0 ? R$attr.uikit_dp16 : i2;
            int i32 = (i6 & 128) != 0 ? R$attr.uikit_dp16 : i3;
            int i33 = (i6 & 256) != 0 ? R$attr.uikit_dp16 : i5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(items, "items");
            this(listId, items, str, Companion.a(INSTANCE, icon2), null, false, obj3, i21, i22, i32, i33, 123312);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Iterable items, String str, ip0.ni niVar, ExtraButton extraButton, Integer num, int i, int i2, int i3) {
            ip0.ni backgroundType = (i3 & 8) != 0 ? ip0.ni.WIDGET : niVar;
            ExtraButton extraButton2 = (i3 & 16) != 0 ? null : extraButton;
            Integer num2 = (i3 & 64) != 0 ? null : num;
            int i5 = (i3 & 256) != 0 ? R$attr.uikit_dp16 : i;
            int i6 = (i3 & 512) != 0 ? R$attr.uikit_dp16 : i2;
            int i21 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            mx0.j6 tabsWidthMode = mx0.j6.f209780a;
            Intrinsics.checkNotNullParameter(tabsWidthMode, "tabsWidthMode");
            this(listId, items, str, Companion.a(INSTANCE, extraButton2), tabsWidthMode, false, num2, i5, i6, i21, i21, 123168);
        }
    }
}
