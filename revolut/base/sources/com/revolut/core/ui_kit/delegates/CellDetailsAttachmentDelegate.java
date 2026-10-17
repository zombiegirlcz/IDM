package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.badge.WarningBadgeView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsAttachmentDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsAttachmentDelegate$Model;", "Lip0/i6;", "<init>", "()V", "Companion", "Model", "ip0/h6", "com/revolut/core/ui_kit/delegates/d2", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsAttachmentDelegate extends BaseRecyclerViewDelegate<Model, ip0.i6> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51808c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsAttachmentDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextLocalisedClause f51810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f51811c;
        public final Image d;
        public final boolean e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qv0.c f51812g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f51813h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f51814j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51815l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f51816m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f51817n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f51818p;

        public Model(String listId, TextLocalisedClause cellTitle, List attachments, ResourceImage resourceImage, boolean z, int i, int i2, int i3, int i5) {
            resourceImage = (i5 & 8) != 0 ? null : resourceImage;
            z = (i5 & 16) != 0 ? true : z;
            int i6 = (i5 & 32) != 0 ? 3 : 2;
            i = (i5 & 1024) != 0 ? R$attr.uikit_dp16 : i;
            i2 = (i5 & 2048) != 0 ? R$attr.uikit_dp16 : i2;
            int i21 = R$attr.uikit_dp16;
            i3 = (i5 & 8192) != 0 ? i21 : i3;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            Intrinsics.checkNotNullParameter(attachments, "attachments");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            Intrinsics.checkNotNullParameter(attachments, "attachments");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f51809a = listId;
            this.f51810b = cellTitle;
            this.f51811c = attachments;
            this.d = resourceImage;
            this.e = z;
            this.f = i6;
            this.f51812g = positionInBox;
            this.f51813h = null;
            this.i = null;
            this.f51814j = null;
            this.k = null;
            this.f51815l = null;
            this.f51816m = i;
            this.f51817n = i2;
            this.o = i21;
            this.f51818p = i3;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsAttachmentDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF53876p() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53867a() {
            return this.f51809a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f51809a.equals(model.f51809a) && this.f51810b.equals(model.f51810b) && Intrinsics.f(this.f51811c, model.f51811c) && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && Intrinsics.f(this.f51812g, model.f51812g) && Intrinsics.f(this.f51813h, model.f51813h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51814j, model.f51814j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51815l, model.f51815l) && this.f51816m == model.f51816m && this.f51817n == model.f51817n && this.o == model.o && this.f51818p == model.f51818p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53878r() {
            return this.f51816m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51816m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f51813h;
        }

        public final int hashCode() {
            int iD = p.a.d(t61.a.a(this.f51809a.hashCode() * 31, 31, this.f51810b), 31, this.f51811c);
            Image image = this.d;
            int i = h30.l.i(this.f51812g, j6.a.c(j6.a.c(j6.a.b(this.f, j6.a.c((iD + (image == null ? 0 : image.hashCode())) * 31, 31, this.e), 31), 31, false), 961, false), 31);
            Parcelable parcelable = this.f51813h;
            int iHashCode = (i + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            p31.c cVar = this.i;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51814j;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.k;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51815l;
            return Integer.hashCode(this.f51818p) + j6.a.b(this.o, j6.a.b(this.f51817n, j6.a.b(this.f51816m, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getO() {
            return this.i;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51812g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53477p() {
            return this.f51814j;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53879s() {
            return this.f51817n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getU() {
            return this.f51818p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51817n = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53475m() {
            return this.f51812g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53479r() {
            return this.f51815l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53478q() {
            return this.k;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.i = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51813h = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53880t() {
            return this.o;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51814j = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51815l = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ip0.h6(!model.f51810b.equals(this.f51810b), !Intrinsics.f(model.f51811c, this.f51811c), !Intrinsics.f(model.d, this.d), model.e != this.e, model.f != this.f, false, or0.b.l(this, (qv0.i) oldItem));
        }
    }

    public CellDetailsAttachmentDelegate() {
        super(R$layout.internal_delegate_cell_details_attachment, new ip0.g4(13));
        this.f51808c = v0.a.d("create(...)");
        v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.i6(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_attachment));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.i6 holder, Model data, int i, List list) {
        Model model;
        int i2;
        CellDetailsAttachmentDelegate cellDetailsAttachmentDelegate = this;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        AppCompatImageView appCompatImageView = holder.f164643h;
        TextView textView = holder.f;
        LinearLayout linearLayout = holder.f164642g;
        int size = payloads.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof ip0.h6)) {
                payloads = null;
                break;
            }
            i3++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        for (int i5 = 0; i5 < size2; i5++) {
            ip0.h6 h6Var = (ip0.h6) payloads.get(i5);
            zIsEmpty = zIsEmpty || h6Var.f164510a;
            z4 = z4 || h6Var.f164511b;
            z3 = z3 || h6Var.f164512c;
            z = z || h6Var.d;
            z6 = z6 || h6Var.e;
            z11 = z11 || h6Var.f;
            z12 = z12 || h6Var.f164513g;
        }
        if (zIsEmpty) {
            or0.b.e(cellDetailsAttachmentDelegate, data.f51810b, textView, null, 12);
        }
        if (z || z3) {
            boolean z29 = data.e;
            Image image = data.d;
            appCompatImageView.setVisibility(z29 ? 0 : 8);
            if (image != null) {
                View view = holder.itemView;
                yy0.f.e(h30.l.z(view, "itemView", view), image, holder.f164643h, null, null, 12);
            }
        }
        if (z4 || z6) {
            List list2 = data.f51811c;
            if (list2.size() > data.f) {
                String strValueOf = list2.size() > 99 ? "99+" : String.valueOf(list2.size());
                cw0.i iVar = (cw0.i) zhm.d0.b0(list2);
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ms0.i iVar2 = new ms0.i(context, null, 6, 0);
                iVar2.setContent(iVar, strValueOf);
                linearLayout.removeAllViews();
                linearLayout.addView(iVar2);
            } else {
                linearLayout.removeAllViews();
                for (Iterator it8 = list2.iterator(); it8.hasNext(); it8 = it8) {
                    cw0.i iVar3 = (cw0.i) it8.next();
                    Context context2 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    ms0.i iVar4 = new ms0.i(context2, null, 6, 0);
                    iVar4.setContent(iVar3, "");
                    linearLayout.addView(iVar4);
                }
            }
        }
        if (z11) {
            WarningBadgeView warningBadgeView = holder.i;
            data.getClass();
            warningBadgeView.setVisibility(8);
        }
        if (z12) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            i2 = 0;
            model = data;
            or0.b.c(cellDetailsAttachmentDelegate, model, itemView, false, null, 28);
        } else {
            model = data;
            i2 = 0;
        }
        or0.m.a(appCompatImageView);
        appCompatImageView.setOnClickListener(new ip0.k6(model, cellDetailsAttachmentDelegate, model, 0));
        e2 e2Var = new e2(cellDetailsAttachmentDelegate, model);
        nkm.g gVar = new nkm.g(nkm.y.n(ViewGroupKt.getChildren(linearLayout), ip0.j6.f164792a));
        int i6 = i2;
        while (gVar.hasNext()) {
            Object next = gVar.next();
            int i21 = i6 + 1;
            if (i6 < 0) {
                zhm.v.s();
                throw null;
            }
            ms0.i iVar5 = (ms0.i) next;
            iVar5.setListener(e2Var);
            if (model.f51811c.size() > model.f) {
                or0.m.a(iVar5);
                iVar5.setOnClickListener(new ip0.k6(model, cellDetailsAttachmentDelegate, model, 1));
            } else {
                or0.m.a(iVar5);
                iVar5.setOnClickListener(new ip0.l6(model, this, data, i6, 0));
            }
            cellDetailsAttachmentDelegate = this;
            model = data;
            i6 = i21;
        }
        data.getClass();
        or0.u.o(textView);
    }
}
