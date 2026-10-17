package com.revolut.core.ui_kit.delegates.chat;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import et0.j0;
import et0.l0;
import et0.m0;
import et0.n0;
import ip0.v7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kp0.w;
import kp0.x;
import org.jetbrains.annotations.NotNull;
import tw0.y;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatBubbleLoadingDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatBubbleLoadingDelegate$Model;", "Lkp0/x;", "<init>", "()V", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatBubbleLoadingDelegate extends BaseChatBubbleDelegate<Model, x> {

    @NotNull
    private static final a Companion = new a();
    public static final /* synthetic */ int k = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatBubbleLoadingDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "Ltw0/y;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel, y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final cam.f f53838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final gw0.l f53839c;
        public final ChatBubbleDelegate.c.C0431c d;
        public final Object e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f53840g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f53841h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f53842j;
        public final int k;

        public Model(String listId, cam.f position, gw0.l size, g79.a aVar, int i) {
            size = (i & 4) != 0 ? gw0.l.NORMAL : size;
            aVar = (i & 16) != 0 ? null : aVar;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(size, "size");
            int i2 = R$attr.uikit_dp8;
            int i3 = R$attr.uikit_dp16;
            this.f53837a = listId;
            this.f53838b = position;
            this.f53839c = size;
            this.d = ChatBubbleDelegate.c.C0431c.f53835a;
            this.e = aVar;
            this.f = null;
            this.f53840g = true;
            this.f53841h = i2;
            this.i = i2;
            this.f53842j = i3;
            this.k = i3;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof Model) {
                return this.f53839c == ((Model) other).f53839c;
            }
            return false;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatBubbleLoadingDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55862c() {
            return this.e;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55277b() {
            return this.f53837a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53837a, model.f53837a) && Intrinsics.f(this.f53838b, model.f53838b) && this.f53839c == model.f53839c && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f53840g == model.f53840g && this.f53841h == model.f53841h && this.i == model.i && this.f53842j == model.f53842j && this.k == model.k;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getI() {
            return this.f53841h;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53841h = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53937n() {
            return this.f53838b;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: getTimestamp */
        public final Clause getE() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h */
        public final ChatBubbleDelegate.c getF() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + j6.a.c((this.f53839c.hashCode() + v7.e(this.f53838b, this.f53837a.hashCode() * 31, 31)) * 31, 31, false)) * 961;
            Object obj2 = this.e;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f;
            return Integer.hashCode(this.k) + j6.a.b(this.f53842j, j6.a.b(this.i, j6.a.b(this.f53841h, j6.a.c(j6.a.c((iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 29791, 31, false), 31, this.f53840g), 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isEnabled, reason: from getter */
        public final boolean getF53884g() {
            return this.f53840g;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable */
        public final boolean getK() {
            return false;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52316j() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52317l() {
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
            this.f = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getK() {
            return this.f53842j;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v */
        public final Image getF53935l() {
            return null;
        }
    }

    public static final class a {
        private a() {
        }
    }

    public ChatBubbleLoadingDelegate() {
        super(R$id.internal_chatBubbleLoadingView, new koe.x(6));
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        int i = kp0.y.f188114a[data.f53839c.ordinal()];
        if (i == 1) {
            return new l0(486, n0.FULL);
        }
        if (i == 2) {
            return new j0(486, 0, n0.NINETY_PERCENT);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        int iA;
        int iA2;
        int i;
        boolean z3;
        int iA3;
        int iA4;
        x holder = (x) aVar;
        Model data = (Model) baseModel;
        Model model = (Model) baseModel2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (!z) {
            if ((model != null ? model.f53839c : null) == data.f53839c) {
                return;
            }
        }
        gw0.l size = data.f53839c;
        holder.getClass();
        Intrinsics.checkNotNullParameter(size, "size");
        if (holder.f188108p == size) {
            return;
        }
        holder.f188108p = size;
        int i2 = w.f188107a[size.ordinal()];
        if (i2 == 1) {
            iA = -1;
            iA2 = -1;
            i = -1;
            z3 = true;
            iA3 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 280.0f);
            iA4 = -1;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iA4 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 230.0f);
            iA3 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 151.0f);
            i = -2;
            iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 96.0f);
            iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 140.0f);
            z3 = false;
        }
        ShimmerConstraintLayout shimmerConstraintLayout = holder.o;
        ViewGroup.LayoutParams layoutParams = shimmerConstraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = i;
        shimmerConstraintLayout.setLayoutParams(marginLayoutParams);
        AppCompatImageView appCompatImageView = holder.f188109q;
        ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.width = iA4;
        marginLayoutParams2.height = iA3;
        appCompatImageView.setLayoutParams(marginLayoutParams2);
        View view = holder.f188110r;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.width = iA2;
        view.setLayoutParams(marginLayoutParams3);
        View view2 = holder.f188111s;
        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams4.width = iA;
        view2.setLayoutParams(marginLayoutParams4);
        holder.f188112t.setVisibility(z3 ? 0 : 8);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final com.revolut.core.ui_kit.delegates.chat.a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewInflate = LayoutInflater.from(itemView.getContext()).inflate(R$layout.internal_delegate_chat_bubble_loading, (ViewGroup) null, false);
        Intrinsics.i(viewInflate, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerConstraintLayout");
        ShimmerConstraintLayout shimmerConstraintLayout = (ShimmerConstraintLayout) viewInflate;
        shimmerConstraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new x(itemView, shimmerConstraintLayout);
    }
}
