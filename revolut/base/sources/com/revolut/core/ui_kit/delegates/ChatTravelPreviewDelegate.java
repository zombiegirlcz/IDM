package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChatTravelPreviewDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/ChatTravelPreviewDelegate$Model;", "Lip0/xa;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/s3", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatTravelPreviewDelegate extends BaseChatBubbleDelegate<Model, ip0.xa> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f52077l = 0;
    public final e01.a k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChatTravelPreviewDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/u3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u3 f52078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final cam.f f52080c;
        public final Image d;
        public final Clause e;
        public final ChatBubbleDelegate.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52081g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final gw0.q f52082h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f52083j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52084l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52085m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52086n;
        public final int o;

        public Model(u3 items, String listId, cam.f position, Image image, Clause clause, ChatBubbleDelegate.c style, boolean z, gw0.q qVar, boolean z3, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f52078a = items;
            this.f52079b = listId;
            this.f52080c = position;
            this.d = image;
            this.e = clause;
            this.f = style;
            this.f52081g = z;
            this.f52082h = qVar;
            this.i = z3;
            this.f52083j = obj2;
            this.k = parcelable;
            this.f52084l = i;
            this.f52085m = i2;
            this.f52086n = i3;
            this.o = i5;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof Model) {
                return Intrinsics.f(this.f52078a, ((Model) other).f52078a);
            }
            return false;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatTravelPreviewDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53388p() {
            return this.f52083j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51997a() {
            return this.f52079b;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52078a, model.f52078a) && Intrinsics.f(this.f52079b, model.f52079b) && Intrinsics.f(this.f52080c, model.f52080c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f52081g == model.f52081g && Intrinsics.f(this.f52082h, model.f52082h) && this.i == model.i && Intrinsics.f(this.f52083j, model.f52083j) && Intrinsics.f(this.k, model.k) && this.f52084l == model.f52084l && this.f52085m == model.f52085m && this.f52086n == model.f52086n && this.o == model.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52003l() {
            return this.f52084l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52084l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52006p() {
            return this.k;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53800j() {
            return this.f52080c;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: getTimestamp, reason: from getter */
        public final Clause getE() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ChatBubbleDelegate.c getF() {
            return this.f;
        }

        public final int hashCode() {
            int iE = ip0.v7.e(this.f52080c, p.a.c(this.f52078a.hashCode() * 31, 31, this.f52079b), 31);
            Image image = this.d;
            int iHashCode = (iE + (image == null ? 0 : image.hashCode())) * 31;
            Clause clause = this.e;
            int iC = j6.a.c((this.f.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31, this.f52081g);
            gw0.q qVar = this.f52082h;
            int iC2 = j6.a.c((iC + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.i);
            Object obj2 = this.f52083j;
            int iHashCode2 = (iC2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.k;
            return Integer.hashCode(this.o) + j6.a.b(this.f52086n, j6.a.b(this.f52085m, j6.a.b(this.f52084l, (iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getI() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52004m() {
            return this.f52085m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52085m = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF53798g() {
            return this.f52081g;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final gw0.q getF53799h() {
            return this.f52082h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52005n() {
            return this.f52086n;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getD() {
            return this.d;
        }
    }

    public ChatTravelPreviewDelegate() {
        super(R$id.chatTravelPreviewDelegate, new ip0.h8(23));
        this.k = new e01.a();
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

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        ip0.xa holder = (ip0.xa) aVar;
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (z) {
            u3 u3Var = data.f52078a;
            String str = data.f52079b;
            if (!(u3Var instanceof t3)) {
                throw new NoWhenBranchMatchedException();
            }
            aim.e eVarB = zhm.u.b();
            t3 t3Var = (t3) u3Var;
            eVarB.add(new ve(a0.d.r(str, "_roomPreview"), t3Var.d, t3Var.f54737a, t3Var.f54738b, t3Var.f54739c, null, null, null, null, null, 1048544));
            ms0.h4 h4VarF = data.f.f();
            TextLocalisedClause textLocalisedClause = t3Var.e;
            int i = R$attr.uikit_dp16;
            eVarB.add(new SmallActionButtonDelegate.Model(str + "_actionButton", h4VarF, null, null, false, textLocalisedClause, null, ms0.j4.f208300a, null, null, c.C1364c.f249512a, 0, i, i, i, 128856));
            holder.o.c(zhm.u.a(eVarB));
            efm.r map = holder.f167118q.f53336c.f121375b.map(new ip0.a9(new ii4.b(data, 28), 13));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            this.k.a(map, holder);
        }
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final com.revolut.core.ui_kit.delegates.chat.a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        RecyclerView recyclerView = new RecyclerView(itemView.getContext());
        recyclerView.setId(R$id.chatTravelPreviewDelegate_recyclerView);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        z4l.j jVar = new z4l.j(7, (List) zhm.f0.f322471a, false);
        yp0.y.h(recyclerView, jVar, new LinearLayoutManager(recyclerView.getContext()));
        hoi.j jVar2 = new hoi.j(null, 7);
        jVar2.f154304b = true;
        jVar2.f154305c = true;
        jVar2.d = true;
        jVar2.setAddDuration(250L);
        jVar2.setRemoveDuration(250L);
        jVar2.setChangeDuration(250L);
        recyclerView.setItemAnimator(jVar2);
        return new ip0.xa(itemView, jVar, recyclerView);
    }
}
