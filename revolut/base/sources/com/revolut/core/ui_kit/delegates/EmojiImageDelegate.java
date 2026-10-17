package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.EmojiImage;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/EmojiImageDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/EmojiImageDelegate$Model;", "Lip0/nf;", "<init>", "()V", "Model", "ip0/mf", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmojiImageDelegate extends BaseRecyclerViewDelegate<Model, ip0.nf> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52221c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/EmojiImageDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EmojiImage f52223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f52224c;
        public Parcelable d;

        public Model(String listId, EmojiImage emojiImage, boolean z, int i) {
            z = (i & 4) != 0 ? false : z;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(emojiImage, "emojiImage");
            this.f52222a = listId;
            this.f52223b = emojiImage;
            this.f52224c = z;
            this.d = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new EmojiImageDelegate();
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55254b() {
            return this.f52222a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52222a, model.f52222a) && Intrinsics.f(this.f52223b, model.f52223b) && this.f52224c == model.f52224c && Intrinsics.f(this.d, model.d);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.d;
        }

        public final int hashCode() {
            int iC = j6.a.c((this.f52223b.hashCode() + (this.f52222a.hashCode() * 31)) * 31, 31, this.f52224c);
            Parcelable parcelable = this.d;
            return iC + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new ip0.mf(!r5.f52223b.equals(this.f52223b), ((Model) oldItem).f52224c != this.f52224c);
        }
    }

    public EmojiImageDelegate() {
        super(R$id.internal_emoji_view_type, new ip0.lb(27));
        this.f52221c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ImageView imageView = new ImageView(parent.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(foh.i.j(48), foh.i.j(48));
        int iJ = foh.i.j(8);
        imageView.setPadding(iJ, iJ, iJ, iJ);
        imageView.setLayoutParams(marginLayoutParams);
        return new ip0.nf(imageView);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.nf holder, Model data, int i, List payloads) {
        RoundedBackgroundDrawable roundedBackgroundDrawable;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof ip0.mf) {
                zN = zN || ((ip0.mf) next).f165369a;
                zN2 = zN2 || ((ip0.mf) next).f165370b;
            }
        }
        if (zN) {
            yy0.f.e(or0.u.k(imageView).Q(), data.f52223b, imageView, null, null, 12);
        }
        if (zN2) {
            if (data.f52224c) {
                Context context = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, 0, 6);
            } else {
                roundedBackgroundDrawable = null;
            }
            imageView.setBackground(roundedBackgroundDrawable);
        }
        holder.itemView.setOnClickListener(new ap0.f(this, data, 23));
    }
}
