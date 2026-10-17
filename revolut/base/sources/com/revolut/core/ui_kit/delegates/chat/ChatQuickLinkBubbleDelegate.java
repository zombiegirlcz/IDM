package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.chat.ChatParentLayout;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import et0.j0;
import et0.l0;
import et0.m0;
import et0.n0;
import ip0.v7;
import java.util.ArrayList;
import koe.x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kp0.t0;
import kp0.u0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatQuickLinkBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatQuickLinkBubbleDelegate$Model;", "Lkp0/t0;", "<init>", "()V", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatQuickLinkBubbleDelegate extends BaseChatBubbleDelegate<Model, t0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final ihm.f k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatQuickLinkBubbleDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53883c;
        public final gw0.l d;
        public final Image e;
        public final ChatBubbleDelegate.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f53884g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f53885h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final cam.f f53886j;
        public final v20.n k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f53887l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f53888m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f53889n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f53890p;

        public Model(String listId, Clause title, Clause description, gw0.l size, Image image, ChatBubbleDelegate.c style, boolean z, boolean z3, cam.f position, v20.n nVar, int i, int i2, int i3, int i5) {
            boolean z4 = (i5 & 64) != 0;
            int i6 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(position, "position");
            this.f53881a = listId;
            this.f53882b = title;
            this.f53883c = description;
            this.d = size;
            this.e = image;
            this.f = style;
            this.f53884g = z4;
            this.f53885h = z;
            this.i = z3;
            this.f53886j = position;
            this.k = nVar;
            this.f53887l = null;
            this.f53888m = i;
            this.f53889n = i2;
            this.o = i3;
            this.f53890p = i6;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return Intrinsics.f(this.f53882b, model.f53882b) && Intrinsics.f(this.f53883c, model.f53883c) && this.f53884g == model.f53884g && this.d == model.d;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatQuickLinkBubbleDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55191g() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55277b() {
            return this.f53881a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53881a, model.f53881a) && Intrinsics.f(this.f53882b, model.f53882b) && Intrinsics.f(this.f53883c, model.f53883c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f53884g == model.f53884g && this.f53885h == model.f53885h && this.i == model.i && Intrinsics.f(this.f53886j, model.f53886j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53887l, model.f53887l) && this.f53888m == model.f53888m && this.f53889n == model.f53889n && this.o == model.o && this.f53890p == model.f53890p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52304c() {
            return this.f53888m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53888m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55278c() {
            return this.f53887l;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53838b() {
            return this.f53886j;
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
            int iHashCode = (this.d.hashCode() + p.a.a(p.a.a(this.f53881a.hashCode() * 31, 31, this.f53882b), 31, this.f53883c)) * 31;
            Image image = this.e;
            int iE = v7.e(this.f53886j, j6.a.c(j6.a.c(j6.a.c((this.f.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31)) * 31, 31, this.f53884g), 31, this.f53885h), 961, this.i), 31);
            v20.n nVar = this.k;
            int iHashCode2 = (iE + (nVar == null ? 0 : nVar.hashCode())) * 31;
            Parcelable parcelable = this.f53887l;
            return Integer.hashCode(this.f53890p) + j6.a.b(this.o, j6.a.b(this.f53889n, j6.a.b(this.f53888m, (iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isEnabled, reason: from getter */
        public final boolean getF53840g() {
            return this.f53884g;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getK() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getD() {
            return this.f53889n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF() {
            return this.f53890p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53889n = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF53933h() {
            return this.f53885h;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1 */
        public final gw0.q getI() {
            return null;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53887l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getE() {
            return this.o;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getF53935l() {
            return this.e;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.chat.ChatQuickLinkBubbleDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ChatQuickLinkBubbleDelegate() {
        super(R$id.internal_chatQuickLinkBubbleView, new x(11));
        this.k = v0.a.d("create(...)");
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        int i = u0.f188105a[data.d.ordinal()];
        if (i == 1) {
            return new j0(486, 200, n0.NINETY_PERCENT);
        }
        if (i == 2) {
            return new l0(486, n0.FULL);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        t0 holder = (t0) aVar;
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (z) {
            UIKitTextView uIKitTextView = holder.f188096p;
            UIKitTextView uIKitTextView2 = holder.f188097q;
            kli.a.b(uIKitTextView, data.f53882b, ty0.f.f275450a);
            kli.a.b(uIKitTextView2, data.f53883c, ty0.f.f275450a);
            ChatBubbleDelegate.c cVar = data.f;
            cVar.d().a(holder.f188096p);
            cVar.c().b(uIKitTextView2);
            float f = data.f53884g ? 1.0f : 0.4f;
            ChatParentLayout chatParentLayout = holder.f53953h;
            int childCount = chatParentLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                chatParentLayout.getChildAt(i).setAlpha(f);
            }
        }
        holder.K(data.f53884g, new a2.a(holder, 28, this, data));
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void v(a aVar, BaseChatBubbleDelegate.BaseModel baseModel, ArrayList actions) {
        t0 holder = (t0) aVar;
        Model model = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actions, "actions");
        if (model.f53884g) {
            actions.add(new gq0.a(16, null, null, new k8e.a(this, model, 24)));
        }
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void w(a aVar, BaseChatBubbleDelegate.BaseModel baseModel, ArrayList descriptions) {
        t0 holder = (t0) aVar;
        Model model = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        CharSequence text = holder.f188096p.getText();
        if (text != null) {
            descriptions.add(text);
        }
        CharSequence text2 = holder.f188097q.getText();
        if (text2 != null) {
            descriptions.add(text2);
        }
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.h(context);
        int iK = kli.a.k(context, 16.0f);
        int iK2 = kli.a.k(context, 12.0f);
        int iK3 = kli.a.k(context, 12.0f);
        int iK4 = kli.a.k(context, 12.0f);
        int iK5 = kli.a.k(context, 24.0f);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, R$attr.internal_textAppearanceEmphasis1);
        uIKitTextView.setId(R$id.chatQuickLinkBubble_title);
        uIKitTextView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        uIKitTextView.setEllipsize(truncateAt);
        uIKitTextView.setTextAlignment(5);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.topToTop = 0;
        layoutParams.startToStart = 0;
        layoutParams.endToStart = R$id.chatQuickLinkBubble_icon;
        layoutParams.bottomToTop = R$id.chatQuickLinkBubble_description;
        layoutParams.horizontalBias = BitmapDescriptorFactory.HUE_RED;
        layoutParams.constrainedWidth = true;
        layoutParams.setMarginStart(iK);
        layoutParams.setMarginEnd(iK);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iK2;
        uIKitTextView.setLayoutParams(layoutParams);
        UIKitTextView uIKitTextView2 = new UIKitTextView(context, null, R$attr.internal_textAppearanceBody2);
        uIKitTextView2.setId(R$id.chatQuickLinkBubble_description);
        uIKitTextView2.setMaxLines(1);
        uIKitTextView2.setEllipsize(truncateAt);
        uIKitTextView2.setTextAlignment(5);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams2.startToStart = 0;
        layoutParams2.endToStart = R$id.chatQuickLinkBubble_icon;
        layoutParams2.topToBottom = R$id.chatQuickLinkBubble_title;
        layoutParams2.bottomToBottom = 0;
        layoutParams2.horizontalBias = BitmapDescriptorFactory.HUE_RED;
        layoutParams2.constrainedWidth = true;
        layoutParams2.setMarginStart(iK);
        layoutParams2.setMarginEnd(iK);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iK3;
        uIKitTextView2.setLayoutParams(layoutParams2);
        UIKitImageView uIKitImageView = new UIKitImageView(context, null, 6, 0);
        uIKitImageView.setId(R$id.chatQuickLinkBubble_icon);
        uIKitImageView.setImageResource(R$drawable.uikit_icn_24_chevron_right);
        uIKitImageView.setImageTintList(kli.a.u(R$attr.uikit_colorGreyTone10, context));
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(iK5, iK5);
        layoutParams3.endToEnd = 0;
        layoutParams3.topToTop = 0;
        layoutParams3.bottomToBottom = 0;
        layoutParams3.setMarginEnd(iK4);
        uIKitImageView.setLayoutParams(layoutParams3);
        constraintLayout.addView(uIKitTextView);
        constraintLayout.addView(uIKitTextView2);
        constraintLayout.addView(uIKitImageView);
        return new t0(itemView, constraintLayout, uIKitTextView, uIKitTextView2, uIKitImageView);
    }
}
