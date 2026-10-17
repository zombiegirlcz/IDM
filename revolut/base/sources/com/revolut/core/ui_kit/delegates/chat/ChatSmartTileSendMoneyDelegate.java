package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import aw0.v9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import et0.k0;
import et0.m0;
import ip0.v7;
import koe.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp0.y0;
import ms0.r4;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatSmartTileSendMoneyDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatSmartTileSendMoneyDelegate$Model;", "Lkp0/y0;", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatSmartTileSendMoneyDelegate extends BaseChatBubbleDelegate<Model, y0> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f53892m = 0;
    public final e01.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e01.a f53893l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatSmartTileSendMoneyDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9 f53895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final cam.f f53896c;
        public final ChatBubbleDelegate.c d;
        public final Object e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f53897g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f53898h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f53899j;

        public Model(String listId, v9 content, cam.f position, ChatBubbleDelegate.c style, Object obj2, int i, int i2) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f53894a = listId;
            this.f53895b = content;
            this.f53896c = position;
            this.d = style;
            this.e = obj2;
            this.f = i;
            this.f53897g = i2;
            BaseChatBubbleDelegate.Companion companion = BaseChatBubbleDelegate.INSTANCE;
            companion.getClass();
            this.f53898h = BaseChatBubbleDelegate.i;
            companion.getClass();
            this.i = BaseChatBubbleDelegate.f53762j;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof Model) {
                return Intrinsics.f(this.f53895b, ((Model) other).f53895b);
            }
            return false;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatSmartTileSendMoneyDelegate(0);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55158j() {
            return this.e;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55154b() {
            return this.f53894a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53894a, model.f53894a) && Intrinsics.f(this.f53895b, model.f53895b) && Intrinsics.f(this.f53896c, model.f53896c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f53897g == model.f53897g;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51854j() {
            return this.f;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.f53899j;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53901b() {
            return this.f53896c;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: getTimestamp */
        public final Clause getE() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ChatBubbleDelegate.c getF53902c() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + v7.e(this.f53896c, (this.f53895b.hashCode() + (this.f53894a.hashCode() * 31)) * 31, 31)) * 31;
            Object obj2 = this.e;
            return Integer.hashCode(this.f53897g) + j6.a.b(this.f, (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable */
        public final boolean getI() {
            return false;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getK() {
            return this.f53897g;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51856m() {
            return this.i;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53897g = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1 */
        public final boolean getF52081g() {
            return false;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1 */
        public final gw0.q getF52082h() {
            return null;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53899j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51855l() {
            return this.f53898h;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v */
        public final Image getV() {
            return null;
        }
    }

    public ChatSmartTileSendMoneyDelegate() {
        this(0);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final boolean q() {
        return false;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        return k0.f129059a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        y0 holder = (y0) aVar;
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        holder.o.setMaskBinder(new x(this, data));
        r4 r4Var = holder.o;
        r4Var.setRecipientClickListener$ui_kit_components_release(data, data.f53895b.f10578a.f10565a, new k8e.a(this, data, 25));
        if (z) {
            r4Var.setModel(data.f53895b);
        }
        efm.r map = r4Var.f208402j.o.map(new km2.b(18, new kog.k(data, 5)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f53893l.a(map, holder);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        r4 r4Var = new r4(context, null, 6, 0);
        r4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new y0(itemView, r4Var);
    }

    public ChatSmartTileSendMoneyDelegate(int i) {
        super(R$id.chatSmartTileSendMoneyDelegate, new x(13));
        this.k = new e01.a();
        this.f53893l = new e01.a();
    }
}
