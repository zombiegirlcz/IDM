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
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import et0.j0;
import et0.m0;
import et0.n0;
import ip0.v7;
import java.util.ArrayList;
import koe.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp0.a0;
import kp0.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatCallBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatCallBubbleDelegate$Model;", "Lkp0/a0;", "<init>", "()V", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatCallBubbleDelegate extends BaseChatBubbleDelegate<Model, a0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final ihm.f k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatCallBubbleDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53845c;
        public final LayeredImage d;
        public final TimeClause e;
        public final ChatBubbleDelegate.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f53846g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f53847h;
        public final cam.f i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final v20.n f53848j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f53849l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f53850m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f53851n;
        public final int o;

        public Model(String listId, Clause title, Clause clause, LayeredImage icon, TimeClause timeClause, ChatBubbleDelegate.c style, boolean z, boolean z3, cam.f position, v20.n nVar, int i, int i2, int i3) {
            z = (i3 & 128) != 0 ? false : z;
            z3 = (i3 & 256) != 0 ? false : z3;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(position, "position");
            int i5 = R$attr.uikit_dp16;
            this.f53843a = listId;
            this.f53844b = title;
            this.f53845c = clause;
            this.d = icon;
            this.e = timeClause;
            this.f = style;
            this.f53846g = z;
            this.f53847h = z3;
            this.i = position;
            this.f53848j = nVar;
            this.k = null;
            this.f53849l = i;
            this.f53850m = i2;
            this.f53851n = i5;
            this.o = i5;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return Intrinsics.f(this.f53844b, model.f53844b) && Intrinsics.f(this.f53845c, model.f53845c) && this.d.equals(model.d);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatCallBubbleDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF54982q() {
            return this.f53848j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52302a() {
            return this.f53843a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53843a, model.f53843a) && Intrinsics.f(this.f53844b, model.f53844b) && Intrinsics.f(this.f53845c, model.f53845c) && this.d.equals(model.d) && this.e.equals(model.e) && this.f.equals(model.f) && this.f53846g == model.f53846g && this.f53847h == model.f53847h && this.i.equals(model.i) && this.f53848j.equals(model.f53848j) && Intrinsics.f(this.k, model.k) && this.f53849l == model.f53849l && this.f53850m == model.f53850m && this.f53851n == model.f53851n && this.o == model.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52304c() {
            return this.f53849l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53849l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52303b() {
            return this.k;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53838b() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: getTimestamp */
        public final Clause getE() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ChatBubbleDelegate.c getF() {
            return this.f;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f53843a.hashCode() * 31, 31, this.f53844b);
            Clause clause = this.f53845c;
            int iHashCode = (this.f53848j.hashCode() + v7.e(this.i, j6.a.c(j6.a.c((this.f.hashCode() + h30.l.d(this.e, h30.l.e(this.d, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 961), 31)) * 31, 31, this.f53846g), 961, this.f53847h), 31)) * 31;
            Parcelable parcelable = this.k;
            return Integer.hashCode(this.o) + j6.a.b(this.f53851n, j6.a.b(this.f53850m, j6.a.b(this.f53849l, (iHashCode + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getK() {
            return this.f53847h;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getD() {
            return this.f53850m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53850m = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF53933h() {
            return this.f53846g;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1 */
        public final gw0.q getI() {
            return null;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getE() {
            return this.f53851n;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v */
        public final Image getF53935l() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.chat.ChatCallBubbleDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ChatCallBubbleDelegate() {
        super(R$id.internal_chatCallBubbleView, new x(7));
        this.k = v0.a.d("create(...)");
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        return new j0(486, Constants.TAG_FULL_SVPP_IDENTIFICATION, n0.NINETY_PERCENT);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        a0 holder = (a0) aVar;
        Model data = (Model) baseModel;
        Model model = (Model) baseModel2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (z) {
            kli.a.b(holder.f187962q, data.f53844b, ty0.f.f275450a);
            kli.a.b(holder.f187963r, data.f53845c, ty0.f.f275450a);
            zi0.c.g(holder.f187961p, data.d);
        }
        if (!Intrinsics.f(model != null ? model.f : null, data.f)) {
            data.f.d().a(holder.f187962q);
        }
        holder.K(true, new z(this, data, 1));
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void v(a aVar, BaseChatBubbleDelegate.BaseModel baseModel, ArrayList actions) {
        a0 holder = (a0) aVar;
        Model model = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actions, "actions");
        actions.add(new gq0.a(16, null, null, new z(this, model, 0)));
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void w(a aVar, BaseChatBubbleDelegate.BaseModel baseModel, ArrayList descriptions) {
        a0 holder = (a0) aVar;
        Model model = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        CharSequence text = holder.f187962q.getText();
        if (text != null) {
            descriptions.add(text);
        }
        CharSequence text2 = holder.f187963r.getText();
        if (text2 != null) {
            descriptions.add(text2);
        }
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewInflate = LayoutInflater.from(itemView.getContext()).inflate(R$layout.internal_view_chat_call_bubble_content, (ViewGroup) null, false);
        Intrinsics.i(viewInflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a0(itemView, constraintLayout);
    }
}
