package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ri0;
import ip0.wl0;
import ip0.yl0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TransferAmountPagePreviewDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/TransferAmountPagePreviewDelegate$Model;", "Lip0/yl0;", "<init>", "()V", "Companion", "Model", "ip0/wl0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferAmountPagePreviewDelegate extends BaseRecyclerViewDelegate<Model, yl0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final int d = R$attr.uikit_colorGreyTone10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53556c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TransferAmountPagePreviewDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final aw0.v8 f53558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f53559c;
        public Parcelable d;

        public Model(String listId, aw0.v8 tileModel, P2pPersonalisation p2pPersonalisation, int i) {
            p2pPersonalisation = (i & 4) != 0 ? null : p2pPersonalisation;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(tileModel, "tileModel");
            this.f53557a = listId;
            this.f53558b = tileModel;
            this.f53559c = p2pPersonalisation;
            this.d = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new TransferAmountPagePreviewDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getK() {
            return this.f53559c;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52468a() {
            return this.f53557a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53557a, model.f53557a) && Intrinsics.f(this.f53558b, model.f53558b) && Intrinsics.f(this.f53559c, model.f53559c) && Intrinsics.f(this.d, model.d);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF59195x() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = (this.f53558b.hashCode() + (this.f53557a.hashCode() * 31)) * 31;
            Object obj2 = this.f53559c;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.d;
            return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new wl0(!((Model) oldItem).f53558b.equals(this.f53558b));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.TransferAmountPagePreviewDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TransferAmountPagePreviewDelegate() {
        super(R$id.internal_transfer_amount_page_preview_delegate_type, new ri0(19));
        this.f53556c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        qr0.d dVar = new qr0.d(new ContextThemeWrapper(parent.getContext(), R$style.UiKitTheme_TransparentDayNight), null, 0, 6);
        dVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return new yl0(dVar);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(yl0 holder, Model data, int i, List payloads) {
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
            if (!(payloads.get(i2) instanceof wl0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        if (payloads != null) {
            int size2 = payloads.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zN = zN || ((wl0) payloads.get(i3)).f167049a;
            }
        }
        if (zN) {
            aw0.v8 tileModel = data.f53558b;
            Intrinsics.checkNotNullParameter(tileModel, "tileModel");
            holder.f167336h.a(tileModel, tileModel);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.m.a(itemView);
        itemView.setOnClickListener(new au0.t1(data, 21, this, data));
    }
}
