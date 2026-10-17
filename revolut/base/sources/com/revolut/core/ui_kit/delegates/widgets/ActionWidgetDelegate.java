package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ActionWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/ActionWidgetDelegate$Model;", "Lop0/e;", "<init>", "()V", "Model", "op0/d", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.e> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ActionWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f54946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final op0.q f54947c;
        public final LayeredImage d;
        public final TextLocalisedClause e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public op0.r f54948g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final py0.c f54949h;

        public Model(String listId, LayeredImage image, TextLocalisedClause title) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            op0.q qVar = op0.q.SMALL;
            op0.r rVar = op0.r.SEEN;
            this.f54946b = listId;
            this.f54947c = qVar;
            this.d = image;
            this.e = title;
            this.f = null;
            this.f54948g = rVar;
            this.f54949h = new py0.c(title);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getK() {
            return this.f54948g;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f54948g = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52781a() {
            return this.f54946b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f54949h;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f54946b, model.f54946b) && this.f54947c == model.f54947c && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f54948g == model.f54948g;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52784g() {
            return this.f;
        }

        public final int hashCode() {
            int iA = t61.a.a(h30.l.e(this.d, okl.m.b(this.f54947c, this.f54946b.hashCode() * 961, 31), 31), 31, this.e);
            Parcelable parcelable = this.f;
            return this.f54948g.hashCode() + ((iA + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55161n() {
            return this.f54947c;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.d(!Intrinsics.f(model.d, this.d), !Intrinsics.f(model.e, this.e), model.f54947c != this.f54947c);
            }
            return null;
        }
    }

    public ActionWidgetDelegate() {
        super(R$layout.internal_delegate_action_draggable_widget, new ood.g0(10));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.e eVar = new op0.e(kotlin.jvm.internal.s.r(parent, this.f54986c));
        p(eVar, true);
        return eVar;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.e holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        ArrayList<op0.d> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            op0.d dVar = obj2 instanceof op0.d ? (op0.d) obj2 : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        for (op0.d dVar2 : arrayList) {
            zN = zN || dVar2.f227215a;
            zN2 = zN2 || dVar2.f227216b;
            zN3 = zN3 || dVar2.f227217c;
        }
        if (zN) {
            ImageView imageView = holder.f227231j;
            Intrinsics.checkNotNullExpressionValue(imageView, "<get-image>(...)");
            zi0.c.g(imageView, data.d);
        }
        if (zN2) {
            TextView textView = holder.k;
            Intrinsics.checkNotNullExpressionValue(textView, "<get-title>(...)");
            kli.a.b(textView, data.e, ty0.f.f275450a);
        }
        if (zN3) {
            holder.F(data.f54947c);
        }
    }
}
