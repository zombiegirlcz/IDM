package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import bt0.h;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ContextualLineChartDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/ContextualLineChartDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/l4;", "<init>", "()V", "Model", "com/revolut/core/ui_kit/delegates/k4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContextualLineChartDelegate extends BaseChatBubbleDelegate<Model, l4> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f52136l = 0;
    public final ihm.f k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ContextualLineChartDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final aw0.z2 f52137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final cam.f f52139c;
        public final ChatBubbleDelegate.c d;
        public final Image e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final gw0.q f52140g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f52141h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f52142j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52143l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f52144m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52145n;

        public Model(aw0.z2 data, String listId, cam.f position, ChatBubbleDelegate.c style, Image image, boolean z, gw0.q qVar, boolean z3, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f52137a = data;
            this.f52138b = listId;
            this.f52139c = position;
            this.d = style;
            this.e = image;
            this.f = z;
            this.f52140g = qVar;
            this.f52141h = z3;
            this.i = obj2;
            this.f52142j = parcelable;
            this.k = i;
            this.f52143l = i2;
            this.f52144m = i3;
            this.f52145n = i5;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof Model) {
                return Intrinsics.f(this.f52137a, ((Model) other).f52137a);
            }
            return false;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ContextualLineChartDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getI() {
            return this.i;
        }

        @Override // oq0.b
        public final boolean a2() {
            return true;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52138b() {
            return this.f52138b;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52137a, model.f52137a) && Intrinsics.f(this.f52138b, model.f52138b) && Intrinsics.f(this.f52139c, model.f52139c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f52140g, model.f52140g) && this.f52141h == model.f52141h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52142j, model.f52142j) && this.k == model.k && this.f52143l == model.f52143l && this.f52144m == model.f52144m && this.f52145n == model.f52145n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getK() {
            return this.k;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.k = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f52142j;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF52139c() {
            return this.f52139c;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final Clause getTimestamp() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ChatBubbleDelegate.c getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + ip0.v7.e(this.f52139c, p.a.c(this.f52137a.hashCode() * 31, 31, this.f52138b), 31)) * 31;
            Image image = this.e;
            int iC = j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f);
            gw0.q qVar = this.f52140g;
            int iC2 = j6.a.c((iC + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.f52141h);
            Object obj2 = this.i;
            int iHashCode2 = (iC2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52142j;
            return Integer.hashCode(this.f52145n) + j6.a.b(this.f52144m, j6.a.b(this.f52143l, j6.a.b(this.k, (iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getF52141h() {
            return this.f52141h;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52143l() {
            return this.f52143l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52145n() {
            return this.f52145n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52143l = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final gw0.q getF52140g() {
            return this.f52140g;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52142j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52144m() {
            return this.f52144m;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getE() {
            return this.e;
        }
    }

    public ContextualLineChartDelegate() {
        super(R$id.internal_contextualLineChartView, new ip0.lb(8));
        this.k = v0.a.d("create(...)");
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final et0.m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        return et0.k0.f129059a;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        int iK;
        l4 holder = (l4) aVar;
        Model data = (Model) baseModel;
        Model model = (Model) baseModel2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean zF = Intrinsics.f(data.f52139c, model != null ? model.f52139c : null);
        holder.f54419r = data;
        ms0.f0 f0Var = holder.o;
        if (!Intrinsics.f(model != null ? model.f52138b : null, data.f52138b)) {
            holder.u = null;
            f0Var.getChartView$ui_kit_components_release().k.onNext(h.a.f18234a);
        }
        if (z) {
            aw0.z2 data2 = data.f52137a;
            Intrinsics.checkNotNullParameter(data2, "data");
            if (!Intrinsics.f(data2, holder.f54420s)) {
                holder.f54420s = data2;
                f0Var.getHeaderView$ui_kit_components_release().setHeader(data2.f10638a);
                LineChartView chartView$ui_kit_components_release = f0Var.getChartView$ui_kit_components_release();
                chartView$ui_kit_components_release.setChartItems(data2.f10639b);
                chartView$ui_kit_components_release.setXAxis(data2.d);
                chartView$ui_kit_components_release.setYAxis(data2.e);
                chartView$ui_kit_components_release.setColorScheme(data2.f10640c);
                chartView$ui_kit_components_release.setBaseline(null);
                if (chartView$ui_kit_components_release.getDrawingDelegateModel() == null) {
                    f0Var.getChartView$ui_kit_components_release().setDrawingDelegateModel(holder.f54421t);
                }
            }
        }
        if (!zF) {
            if (data.f52139c instanceof gw0.k) {
                iK = 0;
            } else {
                Context context = f0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iK = kli.a.k(context, 12.0f);
            }
            f0Var.setPadding(iK, iK, iK, iK);
        }
        holder.f54418q = this.k;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final com.revolut.core.ui_kit.delegates.chat.a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ms0.f0 f0Var = new ms0.f0(context);
        f0Var.setId(R$id.internal_contextualLineChartView);
        f0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new l4(itemView, f0Var);
    }
}
