package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit.views.LabelButtonView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ao;
import ip0.hq;
import ip0.yr;
import ip0.zr;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LabelButtonDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/LabelButtonDelegate$Model;", "Lip0/zr;", "<init>", "()V", "Model", "ip0/yr", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LabelButtonDelegate extends BaseGroupRecyclerViewDelegate<Model, zr> {
    public final e01.a d;

    public LabelButtonDelegate() {
        super(R$layout.internal_delegate_label_button, new hq(7));
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new zr(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_label_button));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List payloads) {
        zr holder = (zr) bVar;
        Model data = (Model) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        LabelButtonView labelButtonView = holder.f;
        Object objO0 = zhm.d0.o0(payloads);
        yr yrVar = objO0 instanceof yr ? (yr) objO0 : null;
        if (yrVar == null) {
            labelButtonView.setText(data.f52604b);
            labelButtonView.setStartIcon(data.f52605c);
            labelButtonView.setEndIcon(data.d);
        } else {
            if (yrVar.f167346a) {
                labelButtonView.setText(data.f52604b);
            }
            if (yrVar.f167347b) {
                labelButtonView.setStartIcon(data.f52605c);
            }
            if (yrVar.f167348c) {
                labelButtonView.setEndIcon(data.d);
            }
        }
        labelButtonView.setAnalyticsContext(data.f);
        efm.r map = labelButtonView.d.map(new ao(22, new ip0.ad(data, 15)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.d.a(map, holder);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LabelButtonDelegate$Model;", "Lqv0/l;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f52605c;
        public final Image d;
        public final Object e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f52606g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f52607h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f52608j;
        public qv0.k k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public qv0.c f52609l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52610m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52611n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52612p;

        public Model(String listId, Clause title, Image image, Image image2, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5, qv0.k positionInGroup) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            this.f52603a = listId;
            this.f52604b = title;
            this.f52605c = image;
            this.d = image2;
            this.e = obj2;
            this.f = parcelable;
            this.f52606g = i;
            this.f52607h = i2;
            this.i = i3;
            this.f52608j = i5;
            this.k = positionInGroup;
            this.f52609l = c.d.f249513a;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1 */
        public final boolean getE() {
            return false;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.k = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new LabelButtonDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52406p() {
            return this.e;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52397a() {
            return this.f52603a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52603a, model.f52603a) && Intrinsics.f(this.f52604b, model.f52604b) && Intrinsics.f(this.f52605c, model.f52605c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f52606g == model.f52606g && this.f52607h == model.f52607h && this.i == model.i && this.f52608j == model.f52608j && this.k == model.k;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52411w() {
            return this.f52606g;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getF52254q() {
            return this.k;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52606g = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52407q() {
            return this.f;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f52603a.hashCode() * 31, 31, this.f52604b);
            Image image = this.f52605c;
            int iHashCode = (iA + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.d;
            int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
            Object obj2 = this.e;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f;
            return this.k.hashCode() + j6.a.b(this.f52608j, j6.a.b(this.i, j6.a.b(this.f52607h, j6.a.b(this.f52606g, (iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52409s() {
            return this.f52610m;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52609l = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52410t() {
            return this.f52611n;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52412x() {
            return this.f52607h;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getZ() {
            return this.f52608j;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52607h = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52408r() {
            return this.f52609l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getV() {
            return this.f52612p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getU() {
            return this.o;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52610m = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52413y() {
            return this.i;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52611n = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52612p = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new yr(!Intrinsics.f(model.f52604b, this.f52604b), !Intrinsics.f(model.f52605c, this.f52605c), !Intrinsics.f(model.d, this.d), or0.b.m(this, (qv0.l) oldItem));
        }

        public /* synthetic */ Model(String str, Clause clause, ResourceImage resourceImage, ResourceImage resourceImage2, Object obj2, int i, int i2, int i3, int i5) {
            this(str, clause, (i5 & 4) != 0 ? null : resourceImage, (i5 & 8) != 0 ? null : resourceImage2, (i5 & 16) != 0 ? null : obj2, null, (i5 & 64) != 0 ? R$attr.uikit_dp16 : i, (i5 & 128) != 0 ? R$attr.uikit_dp16 : i2, (i5 & 256) != 0 ? R$attr.uikit_dp16 : i3, R$attr.uikit_dp16, qv0.k.OutOfGroup);
        }
    }
}
