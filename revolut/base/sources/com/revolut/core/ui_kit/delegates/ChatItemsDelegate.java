package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.nb0;
import ip0.pb0;
import ip0.zj;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\u0003\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChatItemsDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/ChatItemsDelegate$Model;", "Lip0/ma;", "<init>", "()V", "Companion", "Model", "com/revolut/core/ui_kit/delegates/i3", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatItemsDelegate extends BaseChatBubbleDelegate<Model, ip0.ma> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final e01.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e01.a f52045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e01.a f52046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e01.a f52047n;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ChatItemsDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ChatItemsDelegate() {
        super(R$id.chatItemsDelegate, new ip0.h8(17));
        this.k = new e01.a();
        this.f52045l = new e01.a();
        this.f52046m = new e01.a();
        this.f52047n = new e01.a();
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final lq0.m p(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, List payloads) {
        ip0.ma holder = (ip0.ma) aVar;
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        lq0.v vVar = new lq0.v();
        Iterator it8 = holder.J().iterator();
        while (it8.hasNext()) {
            vVar.a((View) it8.next());
        }
        return vVar;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final boolean q() {
        return false;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final et0.m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        et0.n0 n0Var;
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        int i = ip0.na.f165477a[data.e.ordinal()];
        if (i == 1) {
            n0Var = et0.n0.NINETY_PERCENT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            n0Var = et0.n0.FULL;
        }
        return new et0.l0(486, n0Var);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        ip0.ma holder = (ip0.ma) aVar;
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (z) {
            aim.e eVarB = zhm.u.b();
            Clause clause = data.d;
            if (clause != null) {
                ListSubheaderDelegate.INSTANCE.getClass();
                int i = ListSubheaderDelegate.i;
                eVarB.add(new ListSubheaderDelegate.Model("ChatItemsDelegate_title", null, clause, null, null, null, null, null, null, false, false, null, null, i, i, 0, 0, 13598714));
            }
            m3 m3Var = data.f52048a;
            int i2 = 0;
            if (m3Var instanceof j3) {
                j3 j3Var = (j3) m3Var;
                List list = j3Var.f54317a;
                int size = list.size();
                if (size > 3) {
                    size = 3;
                }
                while (i2 < size) {
                    RowDelegate.Model model = (RowDelegate.Model) list.get(i2);
                    model.getClass();
                    c.C1364c c1364c = c.C1364c.f249512a;
                    Intrinsics.checkNotNullParameter(c1364c, "<set-?>");
                    model.v = c1364c;
                    model.f53242w = null;
                    model.f53243x = null;
                    model.f53244y = null;
                    model.z = null;
                    eVarB.add(model);
                    i2++;
                }
                LargeActionButtonDelegate.Model model2 = j3Var.f54318b;
                if (model2 != null) {
                    eVarB.add(model2);
                }
            } else if (m3Var instanceof k3) {
                k3 k3Var = (k3) m3Var;
                eVarB.add(new FullScreenStateDelegate.Model("ChatItemsDelegate_error", k3Var.f54364a, k3Var.d, k3Var.f54366c, zj.REGULAR, k3Var.f54365b, false, null, k3Var.e, false, 0, 0, 31168));
            } else {
                if (!(m3Var instanceof l3)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = ((l3) m3Var).f54416a;
                while (i2 < i3) {
                    eVarB.add(nb0.b(pb0.Companion, a0.d.h(i2, "_ChatItemsDelegate_loading"), false, 0, false, 30));
                    i2++;
                }
            }
            holder.o.c(zhm.u.a(eVarB));
        }
        FullScreenStateDelegate fullScreenStateDelegate = holder.f165341q;
        RowDelegate rowDelegate = holder.f165343s;
        efm.r map = fullScreenStateDelegate.f52371h.f121375b.map(new ip0.a9(new ip0.la(data, 0), 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52047n.a(map, holder);
        efm.r map2 = holder.f165342r.d.f121375b.map(new ip0.a9(new ip0.la(data, 1), 8));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.k.a(map2, holder);
        efm.r map3 = rowDelegate.f53218h.map(new ip0.a9(new ip0.la(data, 2), 9));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        this.f52045l.a(map3, holder);
        efm.r map4 = rowDelegate.f53220l.map(new ip0.a9(new ip0.la(data, 3), 10));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        this.f52046m.a(map4, holder);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final com.revolut.core.ui_kit.delegates.chat.a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        RecyclerView recyclerView = new RecyclerView(itemView.getContext());
        recyclerView.setId(R$id.chatItemsDelegate_recyclerView);
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
        return new ip0.ma(itemView, jVar, recyclerView);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChatItemsDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/m3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m3 f52048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final cam.f f52050c;
        public final Clause d;
        public final gw0.l e;
        public final Image f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ChatBubbleDelegate.c f52051g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f52052h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f52053j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52054l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52055m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52056n;
        public final int o;

        public Model(m3 items, String listId, cam.f position, Clause clause, gw0.l size, Image image, ChatBubbleDelegate.c style, boolean z, boolean z3, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f52048a = items;
            this.f52049b = listId;
            this.f52050c = position;
            this.d = clause;
            this.e = size;
            this.f = image;
            this.f52051g = style;
            this.f52052h = z;
            this.i = z3;
            this.f52053j = obj2;
            this.k = parcelable;
            this.f52054l = i;
            this.f52055m = i2;
            this.f52056n = i3;
            this.o = i5;
        }

        public static Model e(Model model, m3 m3Var, cam.f fVar, TextClause textClause, gw0.l lVar, Image image, ChatBubbleDelegate.c cVar, boolean z, int i, int i2, int i3) {
            m3 items = (i3 & 1) != 0 ? model.f52048a : m3Var;
            String listId = model.f52049b;
            cam.f position = (i3 & 4) != 0 ? model.f52050c : fVar;
            Clause clause = (i3 & 8) != 0 ? model.d : textClause;
            gw0.l size = (i3 & 16) != 0 ? model.e : lVar;
            Image image2 = (i3 & 32) != 0 ? model.f : image;
            ChatBubbleDelegate.c style = (i3 & 128) != 0 ? model.f52051g : cVar;
            boolean z3 = (i3 & 256) != 0 ? model.f52052h : z;
            boolean z4 = (i3 & 1024) != 0 ? model.i : true;
            Object obj2 = model.f52053j;
            Parcelable parcelable = model.k;
            int i5 = (i3 & 8192) != 0 ? model.f52054l : i;
            int i6 = (i3 & 16384) != 0 ? model.f52055m : i2;
            int i21 = model.f52056n;
            int i22 = model.o;
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(style, "style");
            return new Model(items, listId, position, clause, size, image2, style, z3, z4, obj2, parcelable, i5, i6, i21, i22);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return Intrinsics.f(this.f52048a, model.f52048a) && Intrinsics.f(this.d, model.d) && this.e == model.e;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatItemsDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52053j() {
            return this.f52053j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52049b() {
            return this.f52049b;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52048a, model.f52048a) && Intrinsics.f(this.f52049b, model.f52049b) && Intrinsics.f(this.f52050c, model.f52050c) && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52051g, model.f52051g) && this.f52052h == model.f52052h && this.i == model.i && Intrinsics.f(this.f52053j, model.f52053j) && Intrinsics.f(this.k, model.k) && this.f52054l == model.f52054l && this.f52055m == model.f52055m && this.f52056n == model.f52056n && this.o == model.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52054l() {
            return this.f52054l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52054l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getK() {
            return this.k;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF52050c() {
            return this.f52050c;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: getTimestamp */
        public final Clause getE() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ChatBubbleDelegate.c getF52051g() {
            return this.f52051g;
        }

        public final int hashCode() {
            int iE = ip0.v7.e(this.f52050c, p.a.c(this.f52048a.hashCode() * 31, 31, this.f52049b), 31);
            Clause clause = this.d;
            int iHashCode = (this.e.hashCode() + ((iE + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
            Image image = this.f;
            int iC = j6.a.c(j6.a.c((this.f52051g.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 961)) * 31, 961, this.f52052h), 31, this.i);
            Object obj2 = this.f52053j;
            int iHashCode2 = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.k;
            return Integer.hashCode(this.o) + j6.a.b(this.f52056n, j6.a.b(this.f52055m, j6.a.b(this.f52054l, (iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getI() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52055m() {
            return this.f52055m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52055m = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF52052h() {
            return this.f52052h;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1 */
        public final gw0.q getF52063h() {
            return null;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52056n() {
            return this.f52056n;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getF() {
            return this.f;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Model(m3 m3Var, String str, cam.f fVar, Clause clause, gw0.l lVar, ChatBubbleDelegate.c.b bVar, Object obj2, int i) {
            Clause clause2 = (i & 8) != 0 ? null : clause;
            gw0.l lVar2 = (i & 16) != 0 ? gw0.l.NORMAL : lVar;
            ChatBubbleDelegate.c cVar = (i & 128) != 0 ? ChatBubbleDelegate.c.a.f53833a : bVar;
            Object obj3 = (i & 2048) != 0 ? null : obj2;
            int i2 = R$attr.uikit_dp8;
            int i3 = R$attr.uikit_dp16;
            this(m3Var, str, fVar, clause2, lVar2, null, cVar, false, false, obj3, null, i2, i2, i3, i3);
        }
    }
}
