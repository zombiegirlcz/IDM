package com.revolut.core.ui_kit.delegates.chat;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import et0.j0;
import et0.m0;
import et0.n0;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import koe.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ShimmeringTextBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ShimmeringTextBubbleDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/v;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShimmeringTextBubbleDelegate extends BaseChatBubbleDelegate<Model, v> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f53944l = 0;
    public final ihm.f k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ShimmeringTextBubbleDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/chat/u", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f53945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ChatBubbleDelegate.c f53947c;
        public final xo0.a d;
        public final Image e;
        public final cam.f f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f53948g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f53949h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f53950j;
        public final int k;

        public Model(u mode, Clause clause, ChatBubbleDelegate.c style, xo0.a accessibilitySender, Image image, cam.f position, int i, int i2) {
            Intrinsics.checkNotNullParameter("LIST_ID_TYPING_MESSAGE", "listId");
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
            Intrinsics.checkNotNullParameter(position, "position");
            int i3 = R$attr.uikit_dp16;
            this.f53945a = mode;
            this.f53946b = clause;
            this.f53947c = style;
            this.d = accessibilitySender;
            this.e = image;
            this.f = position;
            this.f53948g = null;
            this.f53949h = i2;
            this.i = i;
            this.f53950j = i3;
            this.k = i3;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return Intrinsics.f(this.f53945a, model.f53945a) && Intrinsics.f(this.f53946b, model.f53946b);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ShimmeringTextBubbleDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55191g() {
            return null;
        }

        @Override // oq0.b
        public final boolean a2() {
            return true;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b */
        public final String getF52222a() {
            return "LIST_ID_TYPING_MESSAGE";
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f53945a.equals(model.f53945a) && Intrinsics.f(this.f53946b, model.f53946b) && Intrinsics.f(this.f53947c, model.f53947c) && this.d.equals(model.d) && Intrinsics.f(this.e, model.e) && this.f.equals(model.f) && Intrinsics.f(this.f53948g, model.f53948g) && this.f53949h == model.f53949h && this.i == model.i && this.f53950j == model.f53950j && this.k == model.k;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53949h() {
            return this.f53949h;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53949h = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53948g() {
            return this.f53948g;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: getTimestamp */
        public final Clause getE() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ChatBubbleDelegate.c getF53947c() {
            return this.f53947c;
        }

        public final int hashCode() {
            int iHashCode = (this.f53945a.hashCode() - 287124258) * 31;
            Clause clause = this.f53946b;
            int iC = j6.a.c((this.d.hashCode() + ((this.f53947c.hashCode() + j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, true)) * 31)) * 31, 31, false);
            Image image = this.e;
            int iE = v7.e(this.f, (iC + (image == null ? 0 : image.hashCode())) * 31, 961);
            Parcelable parcelable = this.f53948g;
            return Integer.hashCode(this.k) + j6.a.b(this.f53950j, j6.a.b(this.i, j6.a.b(this.f53949h, j6.a.c(j6.a.c((iE + (parcelable == null ? 0 : parcelable.hashCode())) * 29791, 31, false), 31, true), 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isEnabled */
        public final boolean getF53840g() {
            return true;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable */
        public final boolean getK() {
            return false;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final xo0.b k0() {
            return this.d;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getI() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getK() {
            return this.k;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.i = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1 */
        public final boolean getF53933h() {
            return false;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1 */
        public final gw0.q getI() {
            return null;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53948g = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53950j() {
            return this.f53950j;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getE() {
            return this.e;
        }
    }

    public ShimmeringTextBubbleDelegate() {
        super(R$id.internal_shimmeringTextBubbleView, new x(20));
        this.k = v0.a.d("create(...)");
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final lq0.m p(a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, List payloads) {
        v holder = (v) aVar;
        Model data = (Model) baseModel;
        Model model = (Model) baseModel2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if ((model != null ? model.f53945a : null) == null || model.f53945a.equals(data.f53945a)) {
            return null;
        }
        lq0.v vVar = new lq0.v();
        vVar.a(holder.f53998q);
        vVar.a(holder.f53999r);
        Iterator it8 = holder.J().iterator();
        while (it8.hasNext()) {
            vVar.a((View) it8.next());
        }
        lq0.f fVar = new lq0.f();
        lq0.k kVar = new lq0.k();
        kVar.a(holder.f54000s);
        lq0.q qVar = new lq0.q();
        qVar.m(vVar);
        qVar.m(fVar);
        qVar.m(kVar);
        return qVar;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        return new j0(486, 0, n0.NINETY_PERCENT);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(com.revolut.core.ui_kit.delegates.chat.a r20, com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel r21, com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.chat.ShimmeringTextBubbleDelegate.t(com.revolut.core.ui_kit.delegates.chat.a, com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate$BaseModel, com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate$BaseModel, boolean):void");
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void v(a aVar, BaseChatBubbleDelegate.BaseModel baseModel, ArrayList actions) {
        v holder = (v) aVar;
        Model model = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Clause clause = model.f53946b;
        if (clause != null) {
            actions.add(new gq0.a(R$id.internal_accessibility_title_small, clause, new gq0.n(model, new py0.c(clause)), new k8e.a(this, model, 28)));
        }
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewInflate = LayoutInflater.from(itemView.getContext()).inflate(R$layout.internal_view_shimmering_text_bubble_content, (ViewGroup) null, false);
        Intrinsics.i(viewInflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new v(itemView, constraintLayout);
    }
}
