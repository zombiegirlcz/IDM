package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0007\b\t\u0003\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChatTilesCollectionDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/ChatTilesCollectionDelegate$Model;", "Lip0/ra;", "<init>", "()V", "Companion", "com/revolut/core/ui_kit/delegates/r3", "com/revolut/core/ui_kit/delegates/o3", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatTilesCollectionDelegate extends BaseChatBubbleDelegate<Model, ip0.ra> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final e01.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e01.a f52058l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChatTilesCollectionDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/q3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q3 f52059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final cam.f f52061c;
        public final Image d;
        public final Clause e;
        public final ChatBubbleDelegate.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52062g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final gw0.q f52063h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f52064j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52065l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52066m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52067n;
        public final int o;

        public Model(q3 items, String listId, cam.f position, Image image, Clause clause, ChatBubbleDelegate.c style, boolean z, gw0.q qVar, boolean z3, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f52059a = items;
            this.f52060b = listId;
            this.f52061c = position;
            this.d = image;
            this.e = clause;
            this.f = style;
            this.f52062g = z;
            this.f52063h = qVar;
            this.i = z3;
            this.f52064j = obj2;
            this.k = parcelable;
            this.f52065l = i;
            this.f52066m = i2;
            this.f52067n = i3;
            this.o = i5;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return Intrinsics.f(this.f52059a, model.f52059a) && this.f52065l == model.f52065l && this.f52066m == model.f52066m && this.f52067n == model.f52067n && this.o == model.o;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatTilesCollectionDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52064j() {
            return this.f52064j;
        }

        @Override // oq0.b
        public final boolean a2() {
            return true;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52060b() {
            return this.f52060b;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52059a, model.f52059a) && Intrinsics.f(this.f52060b, model.f52060b) && Intrinsics.f(this.f52061c, model.f52061c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f52062g == model.f52062g && Intrinsics.f(this.f52063h, model.f52063h) && this.i == model.i && Intrinsics.f(this.f52064j, model.f52064j) && Intrinsics.f(this.k, model.k) && this.f52065l == model.f52065l && this.f52066m == model.f52066m && this.f52067n == model.f52067n && this.o == model.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52065l() {
            return this.f52065l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52065l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getK() {
            return this.k;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF52061c() {
            return this.f52061c;
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
            int iE = ip0.v7.e(this.f52061c, p.a.c(this.f52059a.hashCode() * 31, 31, this.f52060b), 31);
            Image image = this.d;
            int iHashCode = (iE + (image == null ? 0 : image.hashCode())) * 31;
            Clause clause = this.e;
            int iC = j6.a.c((this.f.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31, this.f52062g);
            gw0.q qVar = this.f52063h;
            int iC2 = j6.a.c((iC + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.i);
            Object obj2 = this.f52064j;
            int iHashCode2 = (iC2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.k;
            return Integer.hashCode(this.o) + j6.a.b(this.f52067n, j6.a.b(this.f52066m, j6.a.b(this.f52065l, (iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getI() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52066m() {
            return this.f52066m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52066m = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF52062g() {
            return this.f52062g;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final gw0.q getF52063h() {
            return this.f52063h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52067n() {
            return this.f52067n;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getD() {
            return this.d;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ChatTilesCollectionDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ChatTilesCollectionDelegate() {
        super(R$id.chatTilesCollectionDelegate, new ip0.h8(20));
        this.k = new e01.a();
        this.f52058l = new e01.a();
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
    public final void s(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel) {
        com.revolut.core.ui_kit.delegates.chat.a holder = (ip0.ra) aVar;
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.f52061c instanceof gw0.k) {
            holder.f53953h.setPaddingRelative(0, 0, 0, 0);
        } else {
            super.s(holder, data);
        }
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        int i;
        int i2;
        int i3;
        ip0.ra holder = (ip0.ra) aVar;
        Model data = (Model) baseModel;
        Model model = (Model) baseModel2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        cam.f fVar = data.f52061c;
        String str = data.f52060b;
        boolean zF = Intrinsics.f(fVar, model != null ? model.f52061c : null);
        if (z || !zF) {
            boolean z3 = data.f52061c instanceof gw0.k;
            q3 q3Var = data.f52059a;
            if (!(q3Var instanceof p3)) {
                throw new NoWhenBranchMatchedException();
            }
            aim.e eVarB = zhm.u.b();
            p3 p3Var = (p3) q3Var;
            ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model(a0.d.r(str, "_title"), null, p3Var.f54571a, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, ListSubheaderDelegate.Model.a.C0411a.f52724a, null, false, false, null, null, 0, 0, 0, 0, 16744178);
            if (z3) {
                i = data.f52065l;
                i2 = data.f52067n;
                i3 = data.o;
            } else {
                ListSubheaderDelegate.INSTANCE.getClass();
                i = ListSubheaderDelegate.i;
                i2 = model2.f52722w;
                i3 = model2.f52723x;
            }
            model2.u = i;
            model2.f52722w = i2;
            model2.f52723x = i3;
            ListSubheaderDelegate.INSTANCE.getClass();
            model2.v = ListSubheaderDelegate.i;
            c.C1364c c1364c = c.C1364c.f249512a;
            Intrinsics.checkNotNullParameter(c1364c, "<set-?>");
            model2.f52717p = c1364c;
            eVarB.add(model2);
            eVarB.add(new hg(a0.d.r(str, "_scroller"), p3Var.f54572b, 2, new aw0.v4(257.0f), null, new gg.c(0), false, false, null, null, 0, z3 ? data.f52066m : R$attr.uikit_dp16, 0, 0, 28624));
            holder.o.c(zhm.u.a(eVarB));
        }
        efm.r map = holder.f166152q.f.map(new ip0.a9(new ip0.qa(data, 0), 11));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.k.a(map, holder);
        efm.r map2 = holder.f166153r.f53608c.map(new ip0.a9(new ip0.qa(data, 1), 12));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.f52058l.a(map2, holder);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final com.revolut.core.ui_kit.delegates.chat.a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        RecyclerView recyclerView = new RecyclerView(itemView.getContext());
        recyclerView.setId(R$id.chatTilesCollectionDelegate_recyclerView);
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
        return new ip0.ra(itemView, jVar, recyclerView);
    }
}
