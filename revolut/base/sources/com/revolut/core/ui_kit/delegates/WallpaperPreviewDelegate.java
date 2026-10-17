package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.kt;
import ip0.qn0;
import ip0.vn;
import ip0.vo0;
import ip0.wo0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/WallpaperPreviewDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/WallpaperPreviewDelegate$Model;", "Lip0/wo0;", "<init>", "()V", "Model", "ip0/vo0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WallpaperPreviewDelegate extends BaseRecyclerViewDelegate<Model, wo0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53633c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/WallpaperPreviewDelegate$Model;", "Lip0/vn;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements vn, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f53636c;
        public final em2.i d;
        public Parcelable e;

        public Model(String listId, Clause title, Image image, em2.i iVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f53634a = listId;
            this.f53635b = title;
            this.f53636c = image;
            this.d = iVar;
            this.e = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new WallpaperPreviewDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getE() {
            return this.d;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52792a() {
            return this.f53634a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53634a, model.f53634a) && Intrinsics.f(this.f53635b, model.f53635b) && Intrinsics.f(this.f53636c, model.f53636c) && this.d.equals(model.d) && Intrinsics.f(this.e, model.e);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.e;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f53634a.hashCode() * 31, 31, this.f53635b);
            Image image = this.f53636c;
            int iHashCode = (this.d.hashCode() + ((iA + (image == null ? 0 : image.hashCode())) * 31)) * 31;
            Parcelable parcelable = this.e;
            return iHashCode + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new vo0(!Intrinsics.f(model.f53635b, this.f53635b), !Intrinsics.f(model.f53636c, this.f53636c));
        }
    }

    public WallpaperPreviewDelegate() {
        super(R$layout.internal_delegate_wallpaper_preview, new qn0(7));
        this.f53633c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new wo0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_wallpaper_preview));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(wo0 holder, Model data, int i, List payloads) {
        boolean z;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof vo0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        if (payloads != null) {
            int size2 = payloads.size();
            z = zN;
            for (int i3 = 0; i3 < size2; i3++) {
                vo0 vo0Var = (vo0) payloads.get(i3);
                zN = zN || vo0Var.f166862a;
                z = z || vo0Var.f166863b;
            }
        } else {
            z = zN;
        }
        if (zN) {
            kli.a.b(holder.f167053g, data.f53635b, ty0.f.f275450a);
        }
        if (z) {
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            yy0.f.e(jh.d.f(context).Q(), data.f53636c, holder.f, null, null, 12);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        py0.c cVar = new py0.c(data.f53635b);
        or0.m.a(itemView);
        itemView.setOnClickListener(new kt(data, cVar, this, data, 27));
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        pd.b.h(itemView2, true);
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        pd.b.p(itemView3, new TextLocalisedClause(R$string.theme_customisation_preview_accessibility_hint, null, null, 14));
    }
}
