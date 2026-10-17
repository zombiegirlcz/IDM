package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.IdDocumentView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ao;
import ip0.dk;
import ip0.vp;
import ip0.wp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/IdDocumentDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/IdDocumentDelegate$Model;", "Lip0/wp;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdDocumentDelegate extends BaseRecyclerViewDelegate<Model, wp> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52507c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/IdDocumentDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f52509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CountryImage f52510c;
        public final Clause d;
        public final mx0.o7 e;
        public final CdnImage f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final mx0.l7 f52511g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final mx0.l7 f52512h;
        public final mx0.l7 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final mx0.l7 f52513j;
        public final vpl.b k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f52514l;

        public Model(String listId, Image background, CountryImage documentCountryIcon, Clause documentType, mx0.o7 tag2, CdnImage photo, mx0.l7 l7Var, mx0.l7 documentNumber, mx0.l7 l7Var2, mx0.l7 l7Var3, vpl.b bVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(documentCountryIcon, "documentCountryIcon");
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            Intrinsics.checkNotNullParameter(tag2, "tag");
            Intrinsics.checkNotNullParameter(photo, "photo");
            Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
            this.f52508a = listId;
            this.f52509b = background;
            this.f52510c = documentCountryIcon;
            this.d = documentType;
            this.e = tag2;
            this.f = photo;
            this.f52511g = l7Var;
            this.f52512h = documentNumber;
            this.i = l7Var2;
            this.f52513j = l7Var3;
            this.k = bVar;
            this.f52514l = null;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF51698j() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51693a() {
            return this.f52508a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52508a, model.f52508a) && this.f52509b.equals(model.f52509b) && this.f52510c.equals(model.f52510c) && Intrinsics.f(this.d, model.d) && this.e.equals(model.e) && this.f.equals(model.f) && Intrinsics.f(this.f52511g, model.f52511g) && this.f52512h.equals(model.f52512h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52513j, model.f52513j) && this.k.equals(model.k) && Intrinsics.f(this.f52514l, model.f52514l);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getK() {
            return this.f52514l;
        }

        public final int hashCode() {
            int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + p.a.a((this.f52510c.hashCode() + a10.b.c(this.f52509b, this.f52508a.hashCode() * 31, 31)) * 31, 31, this.d)) * 31)) * 31;
            mx0.l7 l7Var = this.f52511g;
            int iHashCode2 = (this.f52512h.hashCode() + ((iHashCode + (l7Var == null ? 0 : l7Var.hashCode())) * 31)) * 31;
            mx0.l7 l7Var2 = this.i;
            int iHashCode3 = (iHashCode2 + (l7Var2 == null ? 0 : l7Var2.hashCode())) * 31;
            mx0.l7 l7Var3 = this.f52513j;
            int iHashCode4 = (this.k.hashCode() + ((iHashCode3 + (l7Var3 == null ? 0 : l7Var3.hashCode())) * 31)) * 31;
            Parcelable parcelable = this.f52514l;
            return iHashCode4 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52514l = parcelable;
        }
    }

    public IdDocumentDelegate() {
        super(R$layout.internal_delegate_id_document, new dk(25));
        this.f52507c = new e01.a();
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = kotlin.jvm.internal.s.r(parent, this.f98535a);
        IdDocumentView idDocumentView = (IdDocumentView) viewR.findViewById(R$id.internalDelegateIdDocument_view);
        IdDocumentView.INSTANCE.getClass();
        idDocumentView.setAspectRatioConfig(IdDocumentView.E);
        return new wp(viewR);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(wp holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        IdDocumentView idDocumentView = holder.f;
        idDocumentView.setModel(new mx0.p7(data.f52509b, data.f52510c, data.d, data.e, data.f, data.f52511g, data.f52512h, data.i, data.f52513j));
        efm.r map = idDocumentView.f58635h.map(new ao(2, new vp(data, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52507c.a(map, holder);
        efm.r map2 = idDocumentView.i.map(new ao(3, new vp(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        efm.r map3 = idDocumentView.f58636j.map(new ao(4, new vp(data, 2)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        this.e.a(map3, holder);
        efm.r map4 = idDocumentView.k.map(new ao(5, new vp(data, 3)));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        this.f.a(map4, holder);
    }
}
