package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/EmojiDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/EmojiDelegate$Model;", "Lip0/lf;", "<init>", "()V", "Model", "ip0/kf", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmojiDelegate extends BaseRecyclerViewDelegate<Model, ip0.lf> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52217c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/EmojiDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f52219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f52220c;
        public final TextLocalisedClause d;
        public Parcelable e;

        public Model(int i, TextLocalisedClause textLocalisedClause, Integer num, String listId) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            this.f52218a = listId;
            this.f52219b = i;
            this.f52220c = num;
            this.d = textLocalisedClause;
            this.e = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new EmojiDelegate();
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51902a() {
            return this.f52218a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52218a, model.f52218a) && this.f52219b == model.f52219b && this.f52220c.equals(model.f52220c) && this.d.equals(model.d) && Intrinsics.f(this.e, model.e);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF51905g() {
            return this.e;
        }

        public final int hashCode() {
            int iA = t61.a.a((this.f52220c.hashCode() + j6.a.b(this.f52219b, this.f52218a.hashCode() * 31, 31)) * 31, 31, this.d);
            Parcelable parcelable = this.e;
            return iA + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new ip0.kf(((Model) oldItem).f52219b != this.f52219b);
            }
            return null;
        }
    }

    public EmojiDelegate() {
        super(R$layout.internal_delegate_emoji, new ip0.lb(26));
        this.f52217c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.lf(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_emoji));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.lf holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f;
        if (payloads.isEmpty()) {
            yy0.f.e(or0.u.k(imageView).Q(), new ResourceImage(data.f52219b, (Integer) null, (Integer) null, data.f52220c, (List) null, (ImageTransformations) null, (Clause) null, 246), holder.f, null, null, 12);
        } else {
            List list = payloads;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.EmojiDelegate.Payload");
                arrayList.add((ip0.kf) obj2);
            }
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (((ip0.kf) it8.next()).f165005a) {
                    yy0.f.e(or0.u.k(imageView).Q(), new ResourceImage(data.f52219b, (Integer) null, (Integer) null, data.f52220c, (List) null, (ImageTransformations) null, (Clause) null, 246), holder.f, null, null, 12);
                }
            }
        }
        holder.itemView.setOnClickListener(new ip0.j5(this, 3, holder, data));
        holder.itemView.setOnTouchListener(new j01.e(new View[]{imageView}));
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        pd.b.p(itemView, data.d);
    }
}
