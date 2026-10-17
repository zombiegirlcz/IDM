package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0006\u0007\b\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/QrCodeWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/QrCodeWidgetDelegate$Model;", "Lop0/q3;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/widgets/z2", "Model", "op0/p3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QrCodeWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.q3> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/QrCodeWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final QrCodeImage f55213c;
        public final TextClause d;
        public final ResourceImage e;
        public final op0.q f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final nj5.b f55214g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f55215h;
        public op0.r i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final py0.c f55216j;

        public Model(String listId, QrCodeImage image, TextClause actionText, ResourceImage resourceImage, nj5.b bVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            op0.q qVar = op0.q.SMALL;
            op0.r rVar = op0.r.SEEN;
            this.f55212b = listId;
            this.f55213c = image;
            this.d = actionText;
            this.e = resourceImage;
            this.f = qVar;
            this.f55214g = bVar;
            this.f55215h = null;
            this.i = rVar;
            this.f55216j = new py0.c(actionText);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getI() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.i = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getI() {
            return this.f55214g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55212b() {
            return this.f55212b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return this.f55216j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55212b, model.f55212b) && Intrinsics.f(this.f55213c, model.f55213c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f55214g, model.f55214g) && Intrinsics.f(this.f55215h, model.f55215h) && this.i == model.i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55215h() {
            return this.f55215h;
        }

        public final int hashCode() {
            int iB = v7.b((this.f55213c.hashCode() + (this.f55212b.hashCode() * 31)) * 31, 31, this.d);
            ResourceImage resourceImage = this.e;
            int iB2 = okl.m.b(this.f, (iB + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31, 31);
            nj5.b bVar = this.f55214g;
            int iHashCode = (iB2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Parcelable parcelable = this.f55215h;
            return this.i.hashCode() + ((iHashCode + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55215h = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new op0.p3(!Intrinsics.f(r7.f55213c, this.f55213c), !Intrinsics.f(r7.d, this.d), !Intrinsics.f(r7.e, this.e), ((Model) oldItem).f != this.f);
        }
    }

    public QrCodeWidgetDelegate() {
        super(R$layout.internal_delegate_widget_qr_code, new op0.v0(28));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.q3 q3Var = new op0.q3(kotlin.jvm.internal.s.r(parent, this.f54986c));
        p(q3Var, true);
        return q3Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.q3 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        SmallActionButton smallActionButton = holder.k;
        TextClause textClause = data.d;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        for (Object obj2 : payloads) {
            if (obj2 instanceof op0.p3) {
                boolean z = true;
                zN = zN || ((op0.p3) obj2).f227380a;
                zN2 = zN2 || ((op0.p3) obj2).f227381b;
                zN3 = zN3 || ((op0.p3) obj2).f227382c;
                if (!zN4 && !((op0.p3) obj2).d) {
                    z = false;
                }
                zN4 = z;
            }
        }
        if (zN) {
            yy0.f.e(or0.u.k(holder.f227392j).Q(), data.f55213c, holder.f227392j, null, null, 12);
        }
        if (zN2) {
            smallActionButton.setText(textClause);
        }
        if (zN3) {
            smallActionButton.setIcon(data.e);
        }
        if (zN4) {
            holder.F(data.f);
        }
        Intrinsics.i(smallActionButton, "null cannot be cast to non-null type android.view.View");
        py0.c cVar = textClause != null ? new py0.c(textClause) : null;
        or0.m.a(smallActionButton);
        smallActionButton.setOnClickListener(new op0.r3(data, cVar, this, data, 0));
    }
}
