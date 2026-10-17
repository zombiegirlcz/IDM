package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import et0.j0;
import et0.m0;
import et0.n0;
import ip0.v7;
import java.util.ArrayList;
import koe.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatAttachmentBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatAttachmentBubbleDelegate$Model;", "Lkp0/f;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class ChatAttachmentBubbleDelegate extends BaseChatBubbleDelegate<Model, kp0.f> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f53764l = 0;
    public final ihm.f k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatAttachmentBubbleDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f53766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f53767c;
        public final TimeClause d;
        public final ChatBubbleDelegate.c e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final gw0.q f53768g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f53769h;
        public final cam.f i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final n50.t f53770j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f53771l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f53772m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f53773n;
        public final int o;

        public Model(String listId, Image attachmentImage, Image image, TimeClause timeClause, ChatBubbleDelegate.c style, boolean z, gw0.q qVar, boolean z3, cam.f position, n50.t tVar, int i, int i2) {
            BaseChatBubbleDelegate.Companion companion = BaseChatBubbleDelegate.INSTANCE;
            companion.getClass();
            int i3 = BaseChatBubbleDelegate.i;
            companion.getClass();
            int i5 = BaseChatBubbleDelegate.f53762j;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(attachmentImage, "attachmentImage");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(position, "position");
            this.f53765a = listId;
            this.f53766b = attachmentImage;
            this.f53767c = image;
            this.d = timeClause;
            this.e = style;
            this.f = z;
            this.f53768g = qVar;
            this.f53769h = z3;
            this.i = position;
            this.f53770j = tVar;
            this.k = null;
            this.f53771l = i;
            this.f53772m = i2;
            this.f53773n = i3;
            this.o = i5;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof Model) {
                return Intrinsics.f(this.f53766b, ((Model) other).f53766b);
            }
            return false;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatAttachmentBubbleDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF() {
            return this.f53770j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53929a() {
            return this.f53765a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53765a, model.f53765a) && Intrinsics.f(this.f53766b, model.f53766b) && Intrinsics.f(this.f53767c, model.f53767c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f53768g, model.f53768g) && this.f53769h == model.f53769h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53770j, model.f53770j) && Intrinsics.f(this.k, model.k) && this.f53771l == model.f53771l && this.f53772m == model.f53772m && this.f53773n == model.f53773n && this.o == model.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53939q() {
            return this.f53771l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53771l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53938p() {
            return this.k;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53937n() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: getTimestamp */
        public final Clause getE() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ChatBubbleDelegate.c getF() {
            return this.e;
        }

        public final int hashCode() {
            int iC = a10.b.c(this.f53766b, this.f53765a.hashCode() * 31, 31);
            Image image = this.f53767c;
            int iHashCode = (iC + (image == null ? 0 : image.hashCode())) * 31;
            TimeClause timeClause = this.d;
            int iC2 = j6.a.c((this.e.hashCode() + ((iHashCode + (timeClause == null ? 0 : timeClause.hashCode())) * 31)) * 31, 31, this.f);
            gw0.q qVar = this.f53768g;
            int iE = v7.e(this.i, j6.a.c((iC2 + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.f53769h), 31);
            n50.t tVar = this.f53770j;
            int iHashCode2 = (iE + (tVar == null ? 0 : tVar.hashCode())) * 31;
            Parcelable parcelable = this.k;
            return Integer.hashCode(this.o) + j6.a.b(this.f53773n, j6.a.b(this.f53772m, j6.a.b(this.f53771l, (iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getK() {
            return this.f53769h;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53940r() {
            return this.f53772m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53942t() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53772m = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF53933h() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final gw0.q getI() {
            return this.f53768g;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53941s() {
            return this.f53773n;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getF53935l() {
            return this.f53767c;
        }
    }

    public ChatAttachmentBubbleDelegate() {
        super(R$id.chatAttachmentBubble, new x(1));
        this.k = v0.a.d("create(...)");
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        return new j0(486, 0, n0.NINETY_PERCENT);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        kp0.f holder = (kp0.f) aVar;
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (z) {
            zi0.c.g(holder.o, data.f53766b);
        }
        holder.K(true, new kp0.e(this, data, 1));
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void v(a aVar, BaseChatBubbleDelegate.BaseModel baseModel, ArrayList actions) {
        kp0.f holder = (kp0.f) aVar;
        Model model = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actions, "actions");
        actions.add(new gq0.a(16, null, null, new kp0.e(this, model, 0)));
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.h(context);
        int iK = kli.a.k(context, 4.0f);
        int iK2 = kli.a.k(context, 192.0f);
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setId(R$id.chatAttachmentBubble_image);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iK2, iK2);
        marginLayoutParams.setMargins(iK, iK, iK, iK);
        shapeableImageView.setLayoutParams(marginLayoutParams);
        shapeableImageView.setAdjustViewBounds(true);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        shapeableImageView.setShapeAppearanceModel(new ShapeAppearanceModel().withCornerSize(kli.a.k(context, 16.0f)));
        return new kp0.f(itemView, shapeableImageView);
    }
}
