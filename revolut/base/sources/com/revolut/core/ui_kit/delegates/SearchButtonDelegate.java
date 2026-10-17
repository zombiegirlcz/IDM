package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ad0;
import ip0.e30;
import ip0.t90;
import ip0.w10;
import ip0.zc0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SearchButtonDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SearchButtonDelegate$Model;", "Lip0/ad0;", "<init>", "()V", "Model", "ip0/zc0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SearchButtonDelegate extends BaseRecyclerViewDelegate<Model, ad0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53283c;
    public final e01.a d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SearchButtonDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final aw0.k9 f53286c;
        public final lw0.n d;
        public Parcelable e;
        public qv0.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f53287g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f53288h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f53289j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f53290l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f53291m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f53292n;

        public Model(String listId, Clause searchText, aw0.k9 searchFieldActionButtons, int i, int i2, int i3) {
            searchFieldActionButtons = (i3 & 4) != 0 ? new aw0.k9(null, null, 3) : searchFieldActionButtons;
            lw0.n searchButtonMode = lw0.n.REGULAR_SEARCH;
            i = (i3 & 32) != 0 ? R$attr.uikit_dp16 : i;
            i2 = (i3 & 64) != 0 ? R$attr.uikit_dp16 : i2;
            int i5 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(searchText, "searchText");
            Intrinsics.checkNotNullParameter(searchFieldActionButtons, "searchFieldActionButtons");
            Intrinsics.checkNotNullParameter(searchButtonMode, "searchButtonMode");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(searchText, "searchText");
            Intrinsics.checkNotNullParameter(searchFieldActionButtons, "searchFieldActionButtons");
            Intrinsics.checkNotNullParameter(searchButtonMode, "searchButtonMode");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f53284a = listId;
            this.f53285b = searchText;
            this.f53286c = searchFieldActionButtons;
            this.d = searchButtonMode;
            this.e = null;
            this.f = positionInBox;
            this.f53287g = null;
            this.f53288h = null;
            this.i = null;
            this.f53289j = null;
            this.k = i;
            this.f53290l = i2;
            this.f53291m = i5;
            this.f53292n = i5;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SearchButtonDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getK() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53284a() {
            return this.f53284a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53284a, model.f53284a) && Intrinsics.f(this.f53285b, model.f53285b) && Intrinsics.f(this.f53286c, model.f53286c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53287g, model.f53287g) && Intrinsics.f(this.f53288h, model.f53288h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53289j, model.f53289j) && this.k == model.k && this.f53290l == model.f53290l && this.f53291m == model.f53291m && this.f53292n == model.f53292n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getK() {
            return this.k;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.k = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + ((this.f53286c.hashCode() + p.a.a(this.f53284a.hashCode() * 31, 31, this.f53285b)) * 31)) * 961;
            Parcelable parcelable = this.e;
            int i = h30.l.i(this.f, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f53287g;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53288h;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.i;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53289j;
            return Integer.hashCode(this.f53292n) + j6.a.b(this.f53291m, j6.a.b(this.f53290l, j6.a.b(this.k, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53287g() {
            return this.f53287g;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53288h() {
            return this.f53288h;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53290l() {
            return this.f53290l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53292n() {
            return this.f53292n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53290l = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF() {
            return this.f;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53289j() {
            return this.f53289j;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getI() {
            return this.i;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53287g = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53291m() {
            return this.f53291m;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53288h = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53289j = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new zc0(!Intrinsics.f(r7.f53285b, this.f53285b), !Intrinsics.f(r7.f, this.f), !Intrinsics.f(r7.f53286c, this.f53286c), ((Model) oldItem).d != this.d);
        }
    }

    public SearchButtonDelegate() {
        super(R$layout.internal_delegate_search_button, new t90(21));
        this.f53283c = new e01.a();
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ad0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_search_button));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ad0 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        SearchButton searchButton = holder.f;
        if (payloads.isEmpty()) {
            searchButton.setText(data.f53285b);
            searchButton.setActionButtons(data.f53286c);
            searchButton.setMode$ui_kit_components_release(data.d);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        } else {
            List list = payloads;
            ArrayList<zc0> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.SearchButtonDelegate.Payload");
                arrayList.add((zc0) obj2);
            }
            for (zc0 zc0Var : arrayList) {
                if (zc0Var.f167444a) {
                    searchButton.setText(data.f53285b);
                }
                if (zc0Var.f167446c) {
                    searchButton.setActionButtons(data.f53286c);
                }
                if (zc0Var.f167445b) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, false, null, 28);
                }
                if (zc0Var.d) {
                    searchButton.setMode$ui_kit_components_release(data.d);
                }
            }
        }
        searchButton.setAnalyticsContext(data.e);
        efm.r map = searchButton.f59002m.map(new e30(new w10(data, 15), 22));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f53283c.a(map, holder);
        this.d.a(searchButton.f59003n, holder);
    }
}
