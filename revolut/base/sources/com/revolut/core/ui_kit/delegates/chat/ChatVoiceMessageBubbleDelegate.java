package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import et0.l0;
import et0.m0;
import et0.n0;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import koe.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import v20.s0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatVoiceMessageBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatVoiceMessageBubbleDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/r;", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatVoiceMessageBubbleDelegate extends BaseChatBubbleDelegate<Model, r> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f53926n = 0;
    public final oo0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f53927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f53928m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatVoiceMessageBubbleDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/chat/q", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d70.a f53930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f53931c;
        public final TimeClause d;
        public final Uri e;
        public final ChatBubbleDelegate.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final xo0.a f53932g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f53933h;
        public final gw0.q i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final q f53934j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Image f53935l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final gw0.v f53936m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final cam.f f53937n;
        public final s0 o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Parcelable f53938p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f53939q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f53940r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f53941s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f53942t;

        public Model(String listId, d70.a amplitudes, long j2, TimeClause voiceTimestamp, Uri uri2, ChatBubbleDelegate.c style, xo0.a accessibilitySender, boolean z, gw0.q qVar, q transcriptState, boolean z3, Image image, cam.f position, s0 s0Var, int i, int i2, int i3) {
            gw0.v sideStatusBadge = gw0.v.NONE;
            int i5 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(amplitudes, "amplitudes");
            Intrinsics.checkNotNullParameter(voiceTimestamp, "voiceTimestamp");
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
            Intrinsics.checkNotNullParameter(transcriptState, "transcriptState");
            Intrinsics.checkNotNullParameter(sideStatusBadge, "sideStatusBadge");
            Intrinsics.checkNotNullParameter(position, "position");
            this.f53929a = listId;
            this.f53930b = amplitudes;
            this.f53931c = j2;
            this.d = voiceTimestamp;
            this.e = uri2;
            this.f = style;
            this.f53932g = accessibilitySender;
            this.f53933h = z;
            this.i = qVar;
            this.f53934j = transcriptState;
            this.k = z3;
            this.f53935l = image;
            this.f53936m = sideStatusBadge;
            this.f53937n = position;
            this.o = s0Var;
            this.f53938p = null;
            this.f53939q = i;
            this.f53940r = i2;
            this.f53941s = i3;
            this.f53942t = i5;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return Intrinsics.f(this.f53930b, model.f53930b) && kotlin.time.b.d(this.f53931c, model.f53931c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f53934j, model.f53934j);
        }

        @Override // koi.j
        public final /* bridge */ /* synthetic */ koi.k T1() {
            return null;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF() {
            return this.o;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52781a() {
            return this.f53929a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53929a, model.f53929a) && Intrinsics.f(this.f53930b, model.f53930b) && kotlin.time.b.d(this.f53931c, model.f53931c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53932g, model.f53932g) && this.f53933h == model.f53933h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53934j, model.f53934j) && this.k == model.k && Intrinsics.f(this.f53935l, model.f53935l) && this.f53936m == model.f53936m && Intrinsics.f(this.f53937n, model.f53937n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f53938p, model.f53938p) && this.f53939q == model.f53939q && this.f53940r == model.f53940r && this.f53941s == model.f53941s && this.f53942t == model.f53942t;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52788m() {
            return this.f53939q;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53939q = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52784g() {
            return this.f53938p;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF() {
            return this.f53937n;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: getTimestamp */
        public final Clause getE() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ChatBubbleDelegate.c getF() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = (this.f53930b.hashCode() + (this.f53929a.hashCode() * 31)) * 31;
            b.Companion companion = kotlin.time.b.INSTANCE;
            int iC = j6.a.c((this.f53932g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + h30.l.d(this.d, a0.d.c(iHashCode, 31, this.f53931c), 31)) * 31)) * 31)) * 31, 31, this.f53933h);
            gw0.q qVar = this.i;
            int iC2 = j6.a.c((this.f53934j.hashCode() + ((iC + (qVar == null ? 0 : qVar.hashCode())) * 31)) * 31, 31, this.k);
            Image image = this.f53935l;
            int iE = v7.e(this.f53937n, (this.f53936m.hashCode() + ((iC2 + (image == null ? 0 : image.hashCode())) * 31)) * 31, 31);
            s0 s0Var = this.o;
            int iHashCode2 = (iE + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
            Parcelable parcelable = this.f53938p;
            return Integer.hashCode(this.f53942t) + j6.a.b(this.f53941s, j6.a.b(this.f53940r, j6.a.b(this.f53939q, (iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getK() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final xo0.b k0() {
            return this.f53932g;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52789n() {
            return this.f53940r;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52790p() {
            return this.f53942t;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53940r = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF53933h() {
            return this.f53933h;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: p0, reason: from getter */
        public final gw0.v getF53936m() {
            return this.f53936m;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final gw0.q getI() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53938p = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.f53941s;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getF53935l() {
            return this.f53935l;
        }
    }

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceMessageBubbleDelegate(oo0.d player) {
        super(R$id.internal_chatVoiceMessageBubbleView, new x(18));
        Intrinsics.checkNotNullParameter(player, "player");
        this.k = player;
        this.f53927l = v0.a.d("create(...)");
        this.f53928m = v0.a.d("create(...)");
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: h */
    public final void o(RecyclerView.ViewHolder viewHolder) {
        r holder = (r) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        oo0.d player = this.k;
        Intrinsics.checkNotNullParameter(player, "player");
        if (holder.f53994y) {
            holder.f53994y = false;
            ((oo0.k) player).g(holder);
        }
        RevolutShimmerDrawable revolutShimmerDrawable = holder.B;
        if (revolutShimmerDrawable != null) {
            revolutShimmerDrawable.c();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: k */
    public final void n(RecyclerView.ViewHolder viewHolder) {
        Uri uri2;
        r holder = (r) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        koi.j jVar = holder.e;
        Model model = jVar instanceof Model ? (Model) jVar : null;
        if (model == null || (uri2 = model.e) == null) {
            return;
        }
        holder.N(this.k, uri2);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void n(koi.b bVar) {
        Uri uri2;
        r holder = (r) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        koi.j jVar = holder.e;
        Model model = jVar instanceof Model ? (Model) jVar : null;
        if (model == null || (uri2 = model.e) == null) {
            return;
        }
        holder.N(this.k, uri2);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void o(koi.b bVar) {
        r holder = (r) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        oo0.d player = this.k;
        Intrinsics.checkNotNullParameter(player, "player");
        if (holder.f53994y) {
            holder.f53994y = false;
            ((oo0.k) player).g(holder);
        }
        RevolutShimmerDrawable revolutShimmerDrawable = holder.B;
        if (revolutShimmerDrawable != null) {
            revolutShimmerDrawable.c();
        }
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final lq0.m p(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, List payloads) {
        r holder = (r) aVar;
        Model data = (Model) baseModel;
        Model model = (Model) baseModel2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (Intrinsics.f(data.f53934j, model != null ? model.f53934j : null)) {
            return null;
        }
        lq0.v vVar = new lq0.v();
        vVar.a(holder.v);
        vVar.a(holder.u);
        Iterator it8 = holder.J().iterator();
        while (it8.hasNext()) {
            vVar.a((View) it8.next());
        }
        lq0.f fVar = new lq0.f();
        fVar.a(holder.v);
        lq0.q qVar = new lq0.q();
        qVar.m(vVar);
        qVar.m(fVar);
        return qVar;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        return new l0(486, n0.NINETY_PERCENT);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(com.revolut.core.ui_kit.delegates.chat.a r28, com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel r29, com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.chat.ChatVoiceMessageBubbleDelegate.t(com.revolut.core.ui_kit.delegates.chat.a, com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate$BaseModel, com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate$BaseModel, boolean):void");
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void w(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, ArrayList descriptions) {
        r holder = (r) aVar;
        Model model = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        View view = holder.itemView;
        ty0.c cVarX = h30.l.x(view, "itemView", view);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.chat_bubble_voice_message_accessibility_label, null, null, 14);
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        descriptions.add(ty0.c.a(cVarX, textLocalisedClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        CharSequence text = holder.f53991t.getText();
        if (text != null) {
            descriptions.add(text);
        }
        CharSequence text2 = holder.u.getText();
        if (text2 != null) {
            descriptions.add(text2);
        }
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final com.revolut.core.ui_kit.delegates.chat.a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewInflate = LayoutInflater.from(itemView.getContext()).inflate(R$layout.internal_view_chat_voice_message_content, (ViewGroup) null, false);
        Intrinsics.i(viewInflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        r rVar = new r(itemView, constraintLayout, this.k);
        rVar.f53990s.setProgressTrackingListener(rVar);
        return rVar;
    }
}
