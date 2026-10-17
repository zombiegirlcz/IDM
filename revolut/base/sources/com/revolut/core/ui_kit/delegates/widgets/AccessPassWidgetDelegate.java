package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0006\u0003\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/AccessPassWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/AccessPassWidgetDelegate$Model;", "Lop0/b;", "<init>", "()V", "a", "Model", "op0/a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccessPassWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.b> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\bJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/AccessPassWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/widgets/d", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p, TrackableItem {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f54939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f54940c;
        public final Object d;
        public final AvatarModel.Default e;
        public final d f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f54941g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final op0.q f54942h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final zn.d f54943j;
        public op0.r k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f54944l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final py0.c f54945m;

        public Model(String listId, TextLocalisedClause title, Clause content, AvatarModel.Default r62, d descriptions, AnalyticsContext analyticsContext, zn.d dVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(descriptions, "descriptions");
            CompositeClause compositeClauseA = yh5.b.a(title);
            op0.q qVar = op0.q.MEDIUM;
            op0.r rVar = op0.r.SEEN;
            this.f54939b = listId;
            this.f54940c = compositeClauseA;
            this.d = content;
            this.e = r62;
            this.f = descriptions;
            this.f54941g = true;
            this.f54942h = qVar;
            this.i = analyticsContext;
            this.f54943j = dVar;
            this.k = rVar;
            this.f54944l = true;
            this.f54945m = new py0.c(compositeClauseA);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: B, reason: from getter */
        public final boolean getF54944l() {
            return this.f54944l;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getK() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.k = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getI() {
            return this.f54943j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF54939b() {
            return this.f54939b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF55228j() {
            return this.f54945m;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f54939b, model.f54939b) && Intrinsics.f(this.f54940c, model.f54940c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f54941g == model.f54941g && this.f54942h == model.f54942h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f54943j, model.f54943j) && this.k == model.k && this.f54944l == model.f54944l;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.i;
        }

        public final int hashCode() {
            int iB = p.a.b(p.a.b(this.f54939b.hashCode() * 31, 31, this.f54940c), 31, this.d);
            AvatarModel.Default r3 = this.e;
            int iB2 = okl.m.b(this.f54942h, j6.a.c((this.f.hashCode() + ((iB + (r3 == null ? 0 : r3.hashCode())) * 31)) * 31, 31, this.f54941g), 31);
            Parcelable parcelable = this.i;
            int iHashCode = (iB2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            zn.d dVar = this.f54943j;
            return Boolean.hashCode(this.f54944l) + okl.m.c(this.k, (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31, 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF54942h() {
            return this.f54942h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF54941g() {
            return this.f54941g;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.a(!Intrinsics.f(this.f54940c, model.f54940c), !Intrinsics.f(this.d, model.d), !Intrinsics.f(this.e, model.e), !Intrinsics.f(this.f, model.f), this.f54941g != model.f54941g);
            }
            return null;
        }
    }

    public static abstract class a extends BaseDraggableWidgetDelegate.a {
        private a() {
        }
    }

    public AccessPassWidgetDelegate() {
        super(R$layout.internal_delegate_widget_access_pass, new ood.g0(9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.revolut.core.ui_kit.models.Clause] */
    public static void s(op0.b bVar, LabelView labelView, AppCompatTextView appCompatTextView, c cVar, Model model) {
        LabelView.setText$default(labelView, cVar != null ? cVar.f55307a : null, 0, 2, null);
        labelView.setEndIcon(null);
        Context context = bVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        labelView.setTextColor(kli.a.u(R$attr.uikit_colorForeground, context));
        or0.u.c(labelView, cVar != null ? cVar.f55307a : null);
        kli.a.d(appCompatTextView, cVar != null ? cVar.f55308b : 0, model, null, 12);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.b bVar = new op0.b(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_access_pass));
        p(bVar, true);
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void p(op0.b holder, Model data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        LabelView labelView = holder.f227176p;
        LabelView labelView2 = holder.f227175n;
        LabelView labelView3 = holder.f227173l;
        TextView textView = holder.k;
        AvatarView avatarView = holder.f227178r;
        d dVar = data.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.a)) {
                payloads = null;
                break;
            }
            i2++;
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
        int i3 = 0;
        while (i3 < size2) {
            op0.a aVar = (op0.a) payloads.get(i3);
            z = z || aVar.f227152a;
            z3 = z3 || aVar.f227153b;
            List list2 = payloads;
            z4 = z4 || aVar.f227154c;
            z6 = z6 || aVar.d;
            zIsEmpty = zIsEmpty || aVar.e;
            i3++;
            payloads = list2;
        }
        if (zIsEmpty) {
            p(holder, data.f54941g);
        }
        if (z) {
            kli.a.b(holder.f227172j, data.f54940c, ty0.f.f275450a);
        }
        if (z3) {
            kli.a.b(textView, data.d, ty0.f.f275450a);
        }
        if (z4) {
            AvatarModel.Default r3 = data.e;
            if (r3 != null) {
                avatarView.setDefaultAvatarStyle$ui_kit_components_release(mx0.i1.SIZE_40_40);
                avatarView.setModel(r3);
            }
            avatarView.setVisibility(r3 != null ? 0 : 8);
        }
        if (z6) {
            s(holder, labelView3, holder.f227174m, dVar.f55319a, data);
            s(holder, labelView2, holder.o, dVar.f55320b, data);
            s(holder, labelView, holder.f227177q, null, data);
            textView.setMaxLines(2);
        }
        holder.F(data.f54942h);
        Object obj2 = 0;
        c cVar = dVar.f55319a;
        or0.m.a(labelView3);
        or0.u.o(labelView3);
        boolean zEquals = obj2.equals(obj2);
        or0.m.a(labelView2);
        if (zEquals) {
            or0.u.o(labelView2);
        } else {
            labelView2.setOnClickListener(new op0.c(data, this, data, 0));
        }
        boolean zEquals2 = obj2.equals(obj2);
        or0.m.a(labelView);
        if (zEquals2) {
            or0.u.o(labelView);
        } else {
            labelView.setOnClickListener(new op0.c(data, this, data, 1));
        }
    }
}
