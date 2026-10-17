package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import et0.l0;
import et0.m0;
import et0.n0;
import ip0.v7;
import java.util.ArrayList;
import koe.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import tw0.a0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatAttachmentListBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatAttachmentListBubbleDelegate$Model;", "Lkp0/k;", "<init>", "()V", "Companion", "AttachmentItem", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatAttachmentListBubbleDelegate extends BaseChatBubbleDelegate<Model, kp0.k> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f53787m = 0;
    public final ChatAttachmentListItemDelegate k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView.RecycledViewPool f53788l;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatAttachmentListBubbleDelegate$AttachmentItem;", "Lkoi/j;", "Lqv0/o;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AttachmentItem implements koi.j, qv0.o, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f53790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53791c;
        public final TextClause d;
        public final n50.m e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f53792g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f53793h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f53794j;
        public final MutableStateFlow k;

        public AttachmentItem(String listId, Image image, Clause title, TextClause textClause, n50.m mVar, MutableStateFlow mutableStateFlow) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            int i = R$attr.uikit_dp8;
            int i2 = R$attr.uikit_dp16;
            this.f53789a = listId;
            this.f53790b = image;
            this.f53791c = title;
            this.d = textClause;
            this.e = mVar;
            this.f = null;
            this.f53792g = i;
            this.f53793h = i;
            this.i = i2;
            this.f53794j = i2;
            this.k = mutableStateFlow;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF() {
            return this.e;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53929a() {
            return this.f53789a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AttachmentItem)) {
                return false;
            }
            AttachmentItem attachmentItem = (AttachmentItem) obj2;
            return Intrinsics.f(this.f53789a, attachmentItem.f53789a) && this.f53790b.equals(attachmentItem.f53790b) && Intrinsics.f(this.f53791c, attachmentItem.f53791c) && this.d.equals(attachmentItem.d) && this.e.equals(attachmentItem.e) && Intrinsics.f(this.f, attachmentItem.f) && this.f53792g == attachmentItem.f53792g && this.f53793h == attachmentItem.f53793h && this.i == attachmentItem.i && this.f53794j == attachmentItem.f53794j;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53939q() {
            return this.f53792g;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53792g = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53938p() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + v7.b(p.a.a(a10.b.c(this.f53790b, this.f53789a.hashCode() * 31, 31), 31, this.f53791c), 961, this.d)) * 31;
            Parcelable parcelable = this.f;
            return Integer.hashCode(this.f53794j) + j6.a.b(this.i, j6.a.b(this.f53793h, j6.a.b(this.f53792g, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53940r() {
            return this.f53793h;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53942t() {
            return this.f53794j;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53793h = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53941s() {
            return this.i;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof AttachmentItem)) {
                return null;
            }
            AttachmentItem attachmentItem = (AttachmentItem) oldItem;
            return new kp0.o(!this.f53790b.equals(attachmentItem.f53790b), !Intrinsics.f(this.f53791c, attachmentItem.f53791c), !this.d.equals(attachmentItem.d), !true);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatAttachmentListBubbleDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f53796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53797c;
        public final Image d;
        public final TimeClause e;
        public final ChatBubbleDelegate.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f53798g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final gw0.q f53799h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final cam.f f53800j;
        public final v20.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f53801l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f53802m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f53803n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f53804p;

        public Model(String listId, ArrayList attachments, Clause clause, Image image, TimeClause timeClause, ChatBubbleDelegate.c style, boolean z, gw0.q qVar, boolean z3, cam.f position, v20.c cVar, int i, int i2, int i3) {
            BaseChatBubbleDelegate.INSTANCE.getClass();
            int i5 = BaseChatBubbleDelegate.f53762j;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(attachments, "attachments");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(position, "position");
            this.f53795a = listId;
            this.f53796b = attachments;
            this.f53797c = clause;
            this.d = image;
            this.e = timeClause;
            this.f = style;
            this.f53798g = z;
            this.f53799h = qVar;
            this.i = z3;
            this.f53800j = position;
            this.k = cVar;
            this.f53801l = null;
            this.f53802m = i;
            this.f53803n = i2;
            this.o = i3;
            this.f53804p = i5;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return Intrinsics.f(this.f53796b, model.f53796b) && Intrinsics.f(this.f53797c, model.f53797c);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatAttachmentListBubbleDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53929a() {
            return this.f53795a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53795a, model.f53795a) && Intrinsics.f(this.f53796b, model.f53796b) && Intrinsics.f(this.f53797c, model.f53797c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f53798g == model.f53798g && Intrinsics.f(this.f53799h, model.f53799h) && this.i == model.i && Intrinsics.f(this.f53800j, model.f53800j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53801l, model.f53801l) && this.f53802m == model.f53802m && this.f53803n == model.f53803n && this.o == model.o && this.f53804p == model.f53804p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53939q() {
            return this.f53802m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53802m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53938p() {
            return this.f53801l;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53937n() {
            return this.f53800j;
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
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f53796b, this.f53795a.hashCode() * 31, 31);
            Clause clause = this.f53797c;
            int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
            Image image = this.d;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            TimeClause timeClause = this.e;
            int iC = j6.a.c((this.f.hashCode() + ((iHashCode2 + (timeClause == null ? 0 : timeClause.hashCode())) * 31)) * 31, 31, this.f53798g);
            gw0.q qVar = this.f53799h;
            int iE = v7.e(this.f53800j, j6.a.c((iC + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.i), 31);
            v20.c cVar = this.k;
            int iHashCode3 = (iE + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Parcelable parcelable = this.f53801l;
            return Integer.hashCode(this.f53804p) + j6.a.b(this.o, j6.a.b(this.f53803n, j6.a.b(this.f53802m, (iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getK() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53940r() {
            return this.f53803n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53942t() {
            return this.f53804p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53803n = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF53933h() {
            return this.f53798g;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final gw0.q getI() {
            return this.f53799h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53801l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53941s() {
            return this.o;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getF53935l() {
            return this.d;
        }
    }

    public static final class a {
        private a() {
        }
    }

    public ChatAttachmentListBubbleDelegate() {
        super(R$id.chatAttachmentListBubble, new x(3));
        this.k = new ChatAttachmentListItemDelegate();
        this.f53788l = new RecyclerView.RecycledViewPool();
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        return new l0(486, n0.NINETY_PERCENT);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        kp0.k holder = (kp0.k) aVar;
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (z) {
            z4l.j jVar = holder.f188028p;
            UIKitTextView uIKitTextView = holder.f188029q;
            jVar.c(data.f53796b);
            kli.a.b(uIKitTextView, data.f53797c, ty0.f.f275450a);
            data.f.c().b(uIKitTextView);
        }
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final com.revolut.core.ui_kit.delegates.chat.a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.h(context);
        int iK = kli.a.k(context, 12.0f);
        int iK2 = kli.a.k(context, 8.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.chatAttachmentListBubble_items);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        int iK3 = kli.a.k(context, 2.0f);
        recyclerView.setPadding(0, iK3, 0, iK3);
        int iK4 = kli.a.k(context, 2.0f);
        recyclerView.addItemDecoration(new a0(0, 0, iK4, iK4));
        recyclerView.setRecycledViewPool(this.f53788l);
        recyclerView.setHasFixedSize(true);
        linearLayout.addView(recyclerView, new LinearLayout.LayoutParams(-1, -2));
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, R$attr.internal_textAppearanceBody1);
        uIKitTextView.setId(R$id.chatAttachmentListBubble_captionText);
        uIKitTextView.setTextAlignment(5);
        uIKitTextView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(iK);
        layoutParams.setMarginEnd(iK);
        layoutParams.bottomMargin = iK2;
        Unit unit = Unit.f186387a;
        linearLayout.addView(uIKitTextView, layoutParams);
        z4l.j jVar = new z4l.j(7, zhm.u.c(this.k), false);
        recyclerView.setAdapter(jVar);
        return new kp0.k(itemView, linearLayout, jVar, uIKitTextView);
    }
}
