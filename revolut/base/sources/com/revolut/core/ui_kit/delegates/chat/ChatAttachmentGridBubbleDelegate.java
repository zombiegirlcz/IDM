package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$plurals;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentGridBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import et0.l0;
import et0.m0;
import et0.n0;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import koe.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0007\u0003\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatAttachmentGridBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatAttachmentGridBubbleDelegate$Model;", "Lkp0/j;", "<init>", "()V", "Companion", "Model", "com/revolut/core/ui_kit/delegates/chat/b", "kp0/i", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatAttachmentGridBubbleDelegate extends BaseChatBubbleDelegate<Model, kp0.j> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f53774n = 0;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f53775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f53776m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatAttachmentGridBubbleDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f53778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53779c;
        public final Image d;
        public final TimeClause e;
        public final ChatBubbleDelegate.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f53780g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final gw0.q f53781h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final cam.f f53782j;
        public final v20.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f53783l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f53784m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f53785n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f53786p;

        public Model(String listId, ArrayList attachmentImages, Clause clause, Image image, TimeClause timeClause, ChatBubbleDelegate.c style, boolean z, gw0.q qVar, boolean z3, cam.f position, v20.c cVar, int i, int i2, int i3) {
            BaseChatBubbleDelegate.INSTANCE.getClass();
            int i5 = BaseChatBubbleDelegate.f53762j;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(attachmentImages, "attachmentImages");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(position, "position");
            this.f53777a = listId;
            this.f53778b = attachmentImages;
            this.f53779c = clause;
            this.d = image;
            this.e = timeClause;
            this.f = style;
            this.f53780g = z;
            this.f53781h = qVar;
            this.i = z3;
            this.f53782j = position;
            this.k = cVar;
            this.f53783l = null;
            this.f53784m = i;
            this.f53785n = i2;
            this.o = i3;
            this.f53786p = i5;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return Intrinsics.f(this.f53778b, model.f53778b) && Intrinsics.f(this.f53779c, model.f53779c);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatAttachmentGridBubbleDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getI() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53777a() {
            return this.f53777a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53777a, model.f53777a) && Intrinsics.f(this.f53778b, model.f53778b) && Intrinsics.f(this.f53779c, model.f53779c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f53780g == model.f53780g && Intrinsics.f(this.f53781h, model.f53781h) && this.i == model.i && Intrinsics.f(this.f53782j, model.f53782j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53783l, model.f53783l) && this.f53784m == model.f53784m && this.f53785n == model.f53785n && this.o == model.o && this.f53786p == model.f53786p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53784m() {
            return this.f53784m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53784m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f53783l;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53782j() {
            return this.f53782j;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final Clause getTimestamp() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ChatBubbleDelegate.c getV() {
            return this.f;
        }

        public final int hashCode() {
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f53778b, this.f53777a.hashCode() * 31, 31);
            Clause clause = this.f53779c;
            int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
            Image image = this.d;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            TimeClause timeClause = this.e;
            int iC = j6.a.c((this.f.hashCode() + ((iHashCode2 + (timeClause == null ? 0 : timeClause.hashCode())) * 31)) * 31, 31, this.f53780g);
            gw0.q qVar = this.f53781h;
            int iE = v7.e(this.f53782j, j6.a.c((iC + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.i), 31);
            v20.c cVar = this.k;
            int iHashCode3 = (iE + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Parcelable parcelable = this.f53783l;
            return Integer.hashCode(this.f53786p) + j6.a.b(this.o, j6.a.b(this.f53785n, j6.a.b(this.f53784m, (iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getF52044y() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getC() {
            return this.f53785n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getE() {
            return this.f53786p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53785n = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF52042w() {
            return this.f53780g;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final gw0.q getF52043x() {
            return this.f53781h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53783l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getD() {
            return this.o;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getU() {
            return this.d;
        }
    }

    public static final class a {
        private a() {
        }
    }

    public ChatAttachmentGridBubbleDelegate() {
        super(R$id.chatAttachmentGridBubble, new x(2));
        this.k = v0.a.d("create(...)");
        this.f53775l = v0.a.d("create(...)");
        this.f53776m = v0.a.d("create(...)");
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        return new l0(300, n0.EIGHTY_PERCENT);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        kp0.j holder = (kp0.j) aVar;
        final Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        int i = 0;
        if (z) {
            et0.l lVar = holder.f188021p;
            UIKitTextView uIKitTextView = holder.f188022q;
            ArrayList arrayList = data.f53778b;
            Clause clause = data.f53779c;
            lVar.setImages(arrayList);
            kli.a.b(uIKitTextView, clause, ty0.f.f275450a);
            data.f.c().b(uIKitTextView);
            holder.f53956m = clause == null;
            holder.H();
        }
        et0.l lVar2 = holder.f188021p;
        final int i2 = 0;
        lVar2.setOnImageClickListener(new Function1(this) { // from class: kp0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatAttachmentGridBubbleDelegate f188011b;

            {
                this.f188011b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i2;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i3) {
                    case 0:
                        this.f188011b.k.onNext(new com.revolut.core.ui_kit.delegates.chat.b(data, iIntValue));
                        break;
                    default:
                        this.f188011b.f53775l.onNext(new com.revolut.core.ui_kit.delegates.chat.b(data, iIntValue));
                        break;
                }
                return Unit.f186387a;
            }
        });
        final int i3 = 1;
        lVar2.setOnCancelImageClickListener(new Function1(this) { // from class: kp0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatAttachmentGridBubbleDelegate f188011b;

            {
                this.f188011b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i32 = i3;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i32) {
                    case 0:
                        this.f188011b.k.onNext(new com.revolut.core.ui_kit.delegates.chat.b(data, iIntValue));
                        break;
                    default:
                        this.f188011b.f53775l.onNext(new com.revolut.core.ui_kit.delegates.chat.b(data, iIntValue));
                        break;
                }
                return Unit.f186387a;
            }
        });
        lVar2.setOnGalleryClickListener(new kp0.g(this, data, 1));
        Iterator it8 = data.f53778b.iterator();
        int i5 = 0;
        while (true) {
            Float f = null;
            if (!it8.hasNext()) {
                ArrayList arrayList2 = data.f53778b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    int i6 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    MutableStateFlow mutableStateFlow = ((kp0.i) obj2).f188017b;
                    Pair pair = mutableStateFlow != null ? new Pair(Integer.valueOf(i), mutableStateFlow) : null;
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                    i = i6;
                }
                a5h.g gVar = holder.f188023r;
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    arrayList4.add((StateFlow) ((Pair) it9.next()).f186386b);
                }
                gVar.O(new fb.c(holder, arrayList3, 29), arrayList4);
                return;
            }
            Object next = it8.next();
            int i21 = i5 + 1;
            if (i5 < 0) {
                zhm.v.s();
                throw null;
            }
            MutableStateFlow mutableStateFlow2 = ((kp0.i) next).f188017b;
            if (mutableStateFlow2 != null) {
                f = (Float) mutableStateFlow2.getValue();
            }
            lVar2.a(i5, f);
            i5 = i21;
        }
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void v(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, ArrayList actions) {
        gq0.a aVar2;
        kp0.j holder = (kp0.j) aVar;
        Model model = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actions, "actions");
        List listV0 = d0.V0(model.f53778b, 4);
        ArrayList arrayList = model.f53778b;
        int i = 0;
        boolean z = arrayList.size() > 4;
        for (Object obj2 : listV0) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            kp0.i iVar = (kp0.i) obj2;
            if (z && i == 3) {
                aVar2 = new gq0.a(R$id.internal_accessibility_open_gallery, new TextLocalisedQuantityClause(R$plurals.chat_bubble_open_gallery_accessibility_label, Integer.valueOf(arrayList.size()), zhm.u.c(Integer.valueOf(arrayList.size())), (Style) null, 24), null, new kp0.g(this, model, 0));
            } else {
                int i3 = i != 0 ? i != 1 ? i != 2 ? R$id.internal_accessibility_attachment_3 : R$id.internal_accessibility_attachment_2 : R$id.internal_accessibility_attachment_1 : R$id.internal_accessibility_attachment_0;
                Clause f59810c = iVar.f188016a.getF59810c();
                if (f59810c == null) {
                    f59810c = new TextLocalisedClause(R$string.chat_bubble_attachment_image_accessibility_label, zhm.u.c(Integer.valueOf(i2)), null, 12);
                }
                aVar2 = new gq0.a(i3, f59810c, null, new cli.b(this, model, i, 2));
            }
            actions.add(aVar2);
            i = i2;
        }
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final com.revolut.core.ui_kit.delegates.chat.a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.h(context);
        int iK = kli.a.k(context, 4.0f);
        int iK2 = kli.a.k(context, 12.0f);
        int iK3 = kli.a.k(context, 8.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        et0.l lVar = new et0.l(context, null, 6, 0);
        lVar.setId(R$id.chatAttachmentGridBubble_imagesGridView);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(iK, iK, iK, iK);
        Unit unit = Unit.f186387a;
        linearLayout.addView(lVar, marginLayoutParams);
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, R$attr.internal_textAppearanceBody1);
        uIKitTextView.setId(R$id.chatAttachmentGridBubble_captionText);
        uIKitTextView.setTextAlignment(5);
        uIKitTextView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(iK2);
        layoutParams.setMarginEnd(iK2);
        layoutParams.bottomMargin = iK3;
        linearLayout.addView(uIKitTextView, layoutParams);
        return new kp0.j(itemView, linearLayout, lVar, uIKitTextView);
    }
}
