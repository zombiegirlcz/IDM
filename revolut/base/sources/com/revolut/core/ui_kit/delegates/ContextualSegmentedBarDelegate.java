package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.ContextualSegmentedBarView;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ContextualSegmentedBarDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/ContextualSegmentedBarDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/n4;", "<init>", "()V", "Model", "com/revolut/core/ui_kit/delegates/m4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContextualSegmentedBarDelegate extends BaseChatBubbleDelegate<Model, n4> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f52146l = 0;
    public final ihm.f k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ContextualSegmentedBarDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final aw0.c3 f52147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final cam.f f52149c;
        public final ChatBubbleDelegate.c d;
        public final Object e;
        public final Image f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52150g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final gw0.q f52151h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f52152j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52153l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f52154m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52155n;

        public Model(aw0.c3 data, String listId, cam.f position, ChatBubbleDelegate.c style, Object obj2, Image image, boolean z, gw0.q qVar, boolean z3, Parcelable parcelable, int i, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f52147a = data;
            this.f52148b = listId;
            this.f52149c = position;
            this.d = style;
            this.e = obj2;
            this.f = image;
            this.f52150g = z;
            this.f52151h = qVar;
            this.i = z3;
            this.f52152j = parcelable;
            this.k = i;
            this.f52153l = i2;
            this.f52154m = i3;
            this.f52155n = i5;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof Model) {
                return Intrinsics.f(this.f52147a, ((Model) other).f52147a);
            }
            return false;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ContextualSegmentedBarDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getE() {
            return this.e;
        }

        @Override // oq0.b
        public final boolean a2() {
            return true;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52148b() {
            return this.f52148b;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52147a, model.f52147a) && Intrinsics.f(this.f52148b, model.f52148b) && Intrinsics.f(this.f52149c, model.f52149c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f52150g == model.f52150g && Intrinsics.f(this.f52151h, model.f52151h) && this.i == model.i && Intrinsics.f(this.f52152j, model.f52152j) && this.k == model.k && this.f52153l == model.f52153l && this.f52154m == model.f52154m && this.f52155n == model.f52155n;
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
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52152j() {
            return this.f52152j;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF52149c() {
            return this.f52149c;
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
            int iHashCode = (this.d.hashCode() + ip0.v7.e(this.f52149c, p.a.c(this.f52147a.hashCode() * 31, 31, this.f52148b), 31)) * 31;
            Object obj2 = this.e;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Image image = this.f;
            int iC = j6.a.c((iHashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f52150g);
            gw0.q qVar = this.f52151h;
            int iC2 = j6.a.c((iC + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.i);
            Parcelable parcelable = this.f52152j;
            return Integer.hashCode(this.f52155n) + j6.a.b(this.f52154m, j6.a.b(this.f52153l, j6.a.b(this.k, (iC2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getI() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52153l() {
            return this.f52153l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52155n() {
            return this.f52155n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52153l = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF52150g() {
            return this.f52150g;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final gw0.q getF52151h() {
            return this.f52151h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52152j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52154m() {
            return this.f52154m;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getF() {
            return this.f;
        }
    }

    public ContextualSegmentedBarDelegate() {
        super(R$id.internal_contextualSegmentedBarView, new ip0.lb(9));
        this.k = v0.a.d("create(...)");
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final lq0.m p(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, List payloads) {
        aw0.c3 c3Var;
        n4 holder = (n4) aVar;
        Model data = (Model) baseModel;
        Model model = (Model) baseModel2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (Intrinsics.f(data.f52147a.f10256c, (model == null || (c3Var = model.f52147a) == null) ? null : c3Var.f10256c)) {
            return null;
        }
        lq0.v vVar = new lq0.v();
        Iterator it8 = holder.J().iterator();
        while (it8.hasNext()) {
            vVar.a((View) it8.next());
        }
        return vVar;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final boolean q() {
        return false;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final et0.m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        return et0.k0.f129059a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        n4 holder = (n4) aVar;
        Model data = (Model) baseModel;
        Model model = (Model) baseModel2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        aw0.b3 b3Var = null;
        boolean zF = Intrinsics.f(data.f52149c, model != null ? model.f52149c : null);
        int iK = 0;
        if (z) {
            aw0.c3 data2 = data.f52147a;
            ContextualSegmentedBarView contextualSegmentedBarView = holder.o;
            Intrinsics.checkNotNullParameter(data2, "data");
            if (!Intrinsics.f(data2, holder.f54495r)) {
                holder.f54495r = data2;
                String str = data2.f10256c;
                HashMap map = data2.d;
                ArrayList arrayList = data2.f10255b;
                int i = -1;
                if (str != null) {
                    b3Var = (aw0.b3) map.get(str);
                    Iterator it8 = arrayList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        if (Intrinsics.f(((aw0.a3) it8.next()).f10224a, str)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                }
                if (b3Var == null || i < 0) {
                    contextualSegmentedBarView.setHeaderData(data2.f10254a);
                    contextualSegmentedBarView.setItemsData("", arrayList);
                } else {
                    contextualSegmentedBarView.setHeaderData(b3Var.f10243b);
                    contextualSegmentedBarView.setItemsData(i + "_", b3Var.f10244c);
                }
                contextualSegmentedBarView.setChartData(arrayList, !map.isEmpty(), i, data2.e);
            }
        }
        if (!zF) {
            if (!(data.f52149c instanceof gw0.k)) {
                Context context = holder.o.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iK = kli.a.k(context, 12.0f);
            }
            holder.o.setPadding(iK, iK, iK, iK);
        }
        holder.f54494q = this.k;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final com.revolut.core.ui_kit.delegates.chat.a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ContextualSegmentedBarView contextualSegmentedBarView = new ContextualSegmentedBarView(context, null, 6, 0);
        contextualSegmentedBarView.setId(R$id.internal_contextualSegmentedBarView);
        contextualSegmentedBarView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new n4(itemView, contextualSegmentedBarView);
    }
}
