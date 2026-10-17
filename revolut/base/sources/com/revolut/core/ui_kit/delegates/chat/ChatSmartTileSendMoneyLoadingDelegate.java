package com.revolut.core.ui_kit.delegates.chat;

import android.os.Parcelable;
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
import kp0.z0;
import tw0.y;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatSmartTileSendMoneyLoadingDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatSmartTileSendMoneyLoadingDelegate$Model;", "Lkp0/z0;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatSmartTileSendMoneyLoadingDelegate extends BaseChatBubbleDelegate<Model, z0> {
    public static final /* synthetic */ int k = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatSmartTileSendMoneyLoadingDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "Ltw0/y;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel, y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final cam.f f53901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ChatBubbleDelegate.c f53902c;
        public final Object d;
        public Parcelable e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f53903g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f53904h;
        public final int i;

        public Model(String listId, cam.f position, ChatBubbleDelegate.c style, Object obj2, Parcelable parcelable, int i, int i2) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f53900a = listId;
            this.f53901b = position;
            this.f53902c = style;
            this.d = obj2;
            this.e = parcelable;
            this.f = i;
            this.f53903g = i2;
            BaseChatBubbleDelegate.Companion companion = BaseChatBubbleDelegate.INSTANCE;
            companion.getClass();
            this.f53904h = BaseChatBubbleDelegate.i;
            companion.getClass();
            this.i = BaseChatBubbleDelegate.f53762j;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return other instanceof Model;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatSmartTileSendMoneyLoadingDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF() {
            return this.d;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF58195a() {
            return this.f53900a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53900a, model.f53900a) && Intrinsics.f(this.f53901b, model.f53901b) && Intrinsics.f(this.f53902c, model.f53902c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f53903g == model.f53903g;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52788m() {
            return this.f;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF58207s() {
            return this.e;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53896c() {
            return this.f53901b;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: getTimestamp */
        public final Clause getE() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ChatBubbleDelegate.c getD() {
            return this.f53902c;
        }

        public final int hashCode() {
            int iHashCode = (this.f53902c.hashCode() + v7.e(this.f53901b, this.f53900a.hashCode() * 31, 31)) * 31;
            Object obj2 = this.d;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.e;
            return Integer.hashCode(this.f53903g) + j6.a.b(this.f, (iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable */
        public final boolean getI() {
            return false;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52789n() {
            return this.f53903g;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52790p() {
            return this.i;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53903g = i;
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
            this.e = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.f53904h;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v */
        public final Image getV() {
            return null;
        }
    }

    public ChatSmartTileSendMoneyLoadingDelegate() {
        super(R$id.chatSmartTileSendMoneyLoadingDelegate, new x(15));
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

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        z0 holder = (z0) aVar;
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new z0(itemView);
    }
}
