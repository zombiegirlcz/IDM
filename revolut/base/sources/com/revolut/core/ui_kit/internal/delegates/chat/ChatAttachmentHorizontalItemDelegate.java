package com.revolut.core.ui_kit.internal.delegates.chat;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CutoutShapeableImageView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import et0.n;
import et0.o;
import h30.l;
import j6.a;
import java.util.List;
import koi.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import or0.m;
import or0.u;
import qv0.c;
import qv0.i;
import qv0.p;
import rnd.d0;
import rq0.b;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/chat/ChatAttachmentHorizontalItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/internal/delegates/chat/ChatAttachmentHorizontalItemDelegate$Model;", "Lrq0/b;", "<init>", "()V", "Model", "rq0/a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatAttachmentHorizontalItemDelegate extends BaseRecyclerViewDelegate<Model, b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f55850c;
    public o d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/chat/ChatAttachmentHorizontalItemDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements i, p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f55851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final gw0.b f55852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f55853c;
        public Parcelable d;
        public c e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f55854g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f55855h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f55856j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f55857l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f55858m;

        public Model(gw0.b fileAttachment) {
            Intrinsics.checkNotNullParameter(fileAttachment, "fileAttachment");
            String str = fileAttachment.f147232a;
            Object obj2 = fileAttachment.e;
            int i = R$attr.uikit_dp12;
            int i2 = R$attr.uikit_dp0;
            int i3 = R$attr.uikit_dp8;
            this.f55851a = str;
            this.f55852b = fileAttachment;
            this.f55853c = obj2;
            this.d = null;
            this.e = c.d.f249513a;
            this.f = i;
            this.f55854g = i;
            this.f55855h = i2;
            this.i = i3;
            this.f55856j = null;
            this.k = null;
            this.f55857l = null;
            this.f55858m = null;
        }

        @Override // koi.j
        public final k T1() {
            return new ChatAttachmentHorizontalItemDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55853c() {
            return this.f55853c;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55851a() {
            return this.f55851a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55851a, model.f55851a) && Intrinsics.f(this.f55852b, model.f55852b) && Intrinsics.f(this.f55853c, model.f55853c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f55854g == model.f55854g && this.f55855h == model.f55855h && this.i == model.i && Intrinsics.f(this.f55856j, model.f55856j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f55857l, model.f55857l) && Intrinsics.f(this.f55858m, model.f55858m);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF() {
            return this.f;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = (this.f55852b.hashCode() + (this.f55851a.hashCode() * 31)) * 31;
            Object obj2 = this.f55853c;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.d;
            int iB = a.b(this.i, a.b(this.f55855h, a.b(this.f55854g, a.b(this.f, l.i(this.e, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f55856j;
            int iHashCode3 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f55857l;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f55858m;
            return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF55856j() {
            return this.f55856j;
        }

        @Override // qv0.i
        public final void j(c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.e = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f55857l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF55854g() {
            return this.f55854g;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getI() {
            return this.i;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f55854g = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final c getE() {
            return this.e;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF55858m() {
            return this.f55858m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF55857l() {
            return this.f55857l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f55856j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF55855h() {
            return this.f55855h;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f55858m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            return new rq0.a(!this.f55852b.equals(((Model) oldItem).f55852b), or0.b.l(this, (i) oldItem));
        }
    }

    public ChatAttachmentHorizontalItemDelegate() {
        super(R$id.chatAttachmentHorizontalItemDelegate, new d0(7));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.h(context);
        int iK = kli.a.k(context, 4.0f);
        n nVar = new n(context, null, 6, 0);
        nVar.setId(View.generateViewId());
        nVar.setPaddingRelative(nVar.getPaddingStart(), iK, nVar.getPaddingEnd(), iK);
        CutoutShapeableImageView cutoutShapeableImageView = new CutoutShapeableImageView(context, null, 6, 0);
        cutoutShapeableImageView.setId(View.generateViewId());
        cutoutShapeableImageView.setDuplicateParentStateEnabled(true);
        cutoutShapeableImageView.setImportantForAccessibility(2);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        cutoutShapeableImageView.setForeground(ContextCompat.getDrawable(context, typedValue.resourceId));
        CircleBadgeView circleBadgeView = new CircleBadgeView(context, null, 0, null, 14);
        circleBadgeView.setId(View.generateViewId());
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        constraintLayout.setClipChildren(false);
        constraintLayout.setClipToPadding(false);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams.topToTop = nVar.getId();
        layoutParams.bottomToBottom = nVar.getId();
        layoutParams.startToStart = nVar.getId();
        layoutParams.endToEnd = nVar.getId();
        Unit unit = Unit.f186387a;
        constraintLayout.addView(cutoutShapeableImageView, layoutParams);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams((int) kli.a.l(context, 240.0f), -2);
        layoutParams2.topToTop = 0;
        layoutParams2.bottomToBottom = 0;
        layoutParams2.startToStart = 0;
        layoutParams2.endToEnd = 0;
        constraintLayout.addView(nVar, layoutParams2);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams3.topToTop = cutoutShapeableImageView.getId();
        layoutParams3.bottomToBottom = -1;
        layoutParams3.startToStart = -1;
        layoutParams3.endToEnd = cutoutShapeableImageView.getId();
        constraintLayout.addView(circleBadgeView, layoutParams3);
        return new b(constraintLayout, cutoutShapeableImageView, nVar, circleBadgeView);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(b holder, Model data, int i, List payloads) {
        List list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                list = payloads;
                break;
            } else {
                if (!(payloads.get(i2) instanceof rq0.a)) {
                    list = null;
                    break;
                }
                i2++;
            }
        }
        if (list == null) {
            list = f0.f322471a;
        }
        boolean zIsEmpty = list.isEmpty();
        int size2 = list.size();
        boolean z = zIsEmpty;
        for (int i3 = 0; i3 < size2; i3++) {
            rq0.a aVar = (rq0.a) list.get(i3);
            z = z || aVar.f256431a;
            zIsEmpty = zIsEmpty || aVar.f256432b;
        }
        if (zIsEmpty) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        ConstraintLayout constraintLayout = holder.f;
        boolean z3 = this.f55850c != null;
        m.a(constraintLayout);
        if (z3) {
            constraintLayout.setOnClickListener(new rq0.c(data, this, data, 0));
        } else {
            u.o(constraintLayout);
        }
        CircleBadgeView circleBadgeView = holder.f256434h;
        boolean z4 = this.d != null;
        m.a(circleBadgeView);
        if (z4) {
            circleBadgeView.setOnClickListener(new rq0.c(data, this, data, 1));
        } else {
            u.o(circleBadgeView);
        }
        if (z) {
            n nVar = holder.f256433g;
            gw0.b bVar = data.f55852b;
            nVar.setModel(new et0.m(bVar.f147233b, bVar.f147234c, bVar.d, null, null));
        }
    }
}
