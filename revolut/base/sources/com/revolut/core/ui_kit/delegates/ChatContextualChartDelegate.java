package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import ip0.hm0;
import ip0.jm0;
import ip0.ul;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0007\b\t\n\u0003\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChatContextualChartDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/ChatContextualChartDelegate$Model;", "Lip0/ka;", "<init>", "()V", "Companion", "Model", "com/revolut/core/ui_kit/delegates/h3", "com/revolut/core/ui_kit/delegates/f3", "com/revolut/core/ui_kit/delegates/g3", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatContextualChartDelegate extends BaseChatBubbleDelegate<Model, ip0.ka> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f52025n = R$attr.uikit_dp12;
    public final e01.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e01.a f52026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e01.a f52027m;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ChatContextualChartDelegate() {
        super(R$id.chatContextualChartDelegate, new ip0.h8(16));
        this.k = new e01.a();
        this.f52026l = new e01.a();
        this.f52027m = new e01.a();
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final et0.m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        return et0.k0.f129059a;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void s(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel) {
        com.revolut.core.ui_kit.delegates.chat.a holder = (ip0.ka) aVar;
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.f52041t instanceof gw0.k) {
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
        ip0.ka holder = (ip0.ka) aVar;
        Model data = (Model) baseModel;
        Model model = (Model) baseModel2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean zF = Intrinsics.f(data.f52041t, model != null ? model.f52041t : null);
        if (z || !zF) {
            cam.f fVar = data.f52041t;
            int i5 = data.E;
            int i6 = data.D;
            boolean z3 = fVar instanceof gw0.k;
            aim.e eVarB = zhm.u.b();
            HeaderDelegate.Model model2 = new HeaderDelegate.Model("HeaderChartTabsDelegate_header", data.f52029b, data.f52028a, null, data.f52030c, data.d, null, HeaderDelegate.a.C0407a.f52418a, null, data.e, z3 ? HeaderDelegate.Model.b.c.f52417a : HeaderDelegate.Model.b.a.f52415a, 29400);
            int i21 = f52025n;
            if (z3) {
                i = data.B;
                i3 = i5;
                i2 = i6;
            } else {
                i = model2.f52411w;
                i2 = i21;
                i3 = i2;
            }
            model2.f52411w = i;
            model2.f52413y = i2;
            model2.z = i3;
            model2.A = true;
            c.C1364c c1364c = c.C1364c.f249512a;
            Intrinsics.checkNotNullParameter(c1364c, "<set-?>");
            model2.f52408r = c1364c;
            eVarB.add(model2);
            jm0 jm0Var = new jm0("HeaderChartTabsDelegate_chart", data.f52031g, data.f, data.f52032h, data.i, null, data.f52037p, data.f52033j, Constants.TAG_SUPPORTED_LOCALE_LIST, data.k, data.f52034l, false, data.o, null, data.f52035m, data.f52036n, null, null, null, null, 0, 0, 0, 0, -55264);
            int i22 = z3 ? R$attr.uikit_dp0 : i21;
            int i32 = i22;
            jm0Var.C = i22;
            jm0Var.D = i32;
            jm0Var.A = R$attr.uikit_dp8;
            jm0Var.B = R$attr.uikit_dp0;
            eVarB.add(jm0Var);
            FixedTabsDelegate.Model model3 = new FixedTabsDelegate.Model("HeaderChartTabsDelegate_tabs", data.f52038q, data.f52039r, false, null, SyslogConstants.LOG_CLOCK);
            if (z3) {
                i21 = data.C;
            } else {
                i5 = i21;
                i6 = i5;
            }
            model3.f52348l = i6;
            model3.f52349m = i5;
            model3.k = i21;
            eVarB.add(model3);
            holder.o.c(zhm.u.a(eVarB));
        }
        efm.r map = holder.f164984s.f52339c.f121375b.map(new ip0.a9(new ip0.ja(data, 0), 4));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.k.a(map, holder);
        efm.r map2 = holder.f164983r.r().map(new ip0.a9(new ip0.ja(data, 1), 5));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.f52026l.a(map2, holder);
        efm.r map3 = holder.f164982q.f52395j.map(new ip0.a9(new ip0.ja(data, 2), 6));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        this.f52027m.a(map3, holder);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final com.revolut.core.ui_kit.delegates.chat.a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        RecyclerView recyclerView = new RecyclerView(itemView.getContext());
        recyclerView.setId(R$id.chatContextualChartDelegate_recyclerView);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        z4l.j jVar = new z4l.j(7, (List) zhm.f0.f322471a, false);
        yp0.y.h(recyclerView, jVar, new LinearLayoutManager(recyclerView.getContext()));
        return new ip0.ka(itemView, jVar, recyclerView);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChatContextualChartDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {
        public Parcelable A;
        public int B;
        public int C;
        public final int D;
        public final int E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final aw0.s2 f52028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ul f52029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52030c;
        public final Clause d;
        public final tx0.k0 e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final aw0.cb f52031g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f52032h;
        public final hw0.x i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f52033j;
        public final Pair k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f52034l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final aw0.l1 f52035m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final hm0 f52036n;
        public final hw0.z o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f52037p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final List f52038q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final String f52039r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final String f52040s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final cam.f f52041t;
        public final Image u;
        public final ChatBubbleDelegate.c v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f52042w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final gw0.q f52043x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final boolean f52044y;
        public final Object z;

        public Model(aw0.s2 complexTitle, ul ulVar, Clause clause, Clause clause2, tx0.k0 titleStyle, List list, aw0.cb chartColorScheme, boolean z, hw0.x xVar, boolean z3, Pair pair, boolean z4, aw0.l1 chartInterpolation, hm0 chartLineStyle, hw0.z zVar, int i, List tabs, String str, String listId, cam.f position, Image image, ChatBubbleDelegate.c style, boolean z6, gw0.q qVar, boolean z11, Object obj2, Parcelable parcelable, int i2, int i3, int i5, int i6) {
            Intrinsics.checkNotNullParameter(complexTitle, "complexTitle");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            Intrinsics.checkNotNullParameter(chartColorScheme, "chartColorScheme");
            Intrinsics.checkNotNullParameter(chartInterpolation, "chartInterpolation");
            Intrinsics.checkNotNullParameter(chartLineStyle, "chartLineStyle");
            Intrinsics.checkNotNullParameter(tabs, "tabs");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f52028a = complexTitle;
            this.f52029b = ulVar;
            this.f52030c = clause;
            this.d = clause2;
            this.e = titleStyle;
            this.f = list;
            this.f52031g = chartColorScheme;
            this.f52032h = z;
            this.i = xVar;
            this.f52033j = z3;
            this.k = pair;
            this.f52034l = z4;
            this.f52035m = chartInterpolation;
            this.f52036n = chartLineStyle;
            this.o = zVar;
            this.f52037p = i;
            this.f52038q = tabs;
            this.f52039r = str;
            this.f52040s = listId;
            this.f52041t = position;
            this.u = image;
            this.v = style;
            this.f52042w = z6;
            this.f52043x = qVar;
            this.f52044y = z11;
            this.z = obj2;
            this.A = parcelable;
            this.B = i2;
            this.C = i3;
            this.D = i5;
            this.E = i6;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return Intrinsics.f(this.f52028a, model.f52028a) && Intrinsics.f(this.f52029b, model.f52029b) && Intrinsics.f(this.f52030c, model.f52030c) && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52031g, model.f52031g) && this.f52032h == model.f52032h && Intrinsics.f(this.i, model.i) && this.f52033j == model.f52033j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.o, model.o) && this.f52037p == model.f52037p && Intrinsics.f(this.f52038q, model.f52038q) && Intrinsics.f(this.f52039r, model.f52039r) && this.B == model.B && this.C == model.C && this.D == model.D && this.E == model.E;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatContextualChartDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getZ() {
            return this.z;
        }

        @Override // oq0.b
        public final boolean a2() {
            return true;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52040s() {
            return this.f52040s;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52028a, model.f52028a) && Intrinsics.f(this.f52029b, model.f52029b) && Intrinsics.f(this.f52030c, model.f52030c) && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52031g, model.f52031g) && this.f52032h == model.f52032h && Intrinsics.f(this.i, model.i) && this.f52033j == model.f52033j && Intrinsics.f(this.k, model.k) && this.f52034l == model.f52034l && Intrinsics.f(this.f52035m, model.f52035m) && this.f52036n == model.f52036n && Intrinsics.f(this.o, model.o) && this.f52037p == model.f52037p && Intrinsics.f(this.f52038q, model.f52038q) && Intrinsics.f(this.f52039r, model.f52039r) && Intrinsics.f(this.f52040s, model.f52040s) && Intrinsics.f(this.f52041t, model.f52041t) && Intrinsics.f(this.u, model.u) && Intrinsics.f(this.v, model.v) && this.f52042w == model.f52042w && Intrinsics.f(this.f52043x, model.f52043x) && this.f52044y == model.f52044y && Intrinsics.f(this.z, model.z) && Intrinsics.f(this.A, model.A) && this.B == model.B && this.C == model.C && this.D == model.D && this.E == model.E;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getB() {
            return this.B;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.B = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getA() {
            return this.A;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF52041t() {
            return this.f52041t;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final Clause getTimestamp() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ChatBubbleDelegate.c getV() {
            return this.v;
        }

        public final int hashCode() {
            int iHashCode = this.f52028a.hashCode() * 31;
            ul ulVar = this.f52029b;
            int iHashCode2 = (iHashCode + (ulVar == null ? 0 : ulVar.hashCode())) * 31;
            Clause clause = this.f52030c;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31;
            List list = this.f;
            int iC = j6.a.c((this.f52031g.hashCode() + ((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.f52032h);
            hw0.x xVar = this.i;
            int iC2 = j6.a.c((iC + (xVar == null ? 0 : xVar.hashCode())) * 31, 31, this.f52033j);
            Pair pair = this.k;
            int iHashCode5 = (this.f52036n.hashCode() + ((this.f52035m.hashCode() + j6.a.c((iC2 + (pair == null ? 0 : pair.hashCode())) * 31, 31, this.f52034l)) * 31)) * 31;
            hw0.z zVar = this.o;
            int iD = p.a.d(j6.a.b(this.f52037p, (iHashCode5 + (zVar == null ? 0 : zVar.hashCode())) * 31, 31), 31, this.f52038q);
            String str = this.f52039r;
            int iE = ip0.v7.e(this.f52041t, p.a.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f52040s), 31);
            Image image = this.u;
            int iC3 = j6.a.c((this.v.hashCode() + ((iE + (image == null ? 0 : image.hashCode())) * 31)) * 31, 31, this.f52042w);
            gw0.q qVar = this.f52043x;
            int iC4 = j6.a.c((iC3 + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.f52044y);
            Object obj2 = this.z;
            int iHashCode6 = (iC4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.A;
            return Integer.hashCode(this.E) + j6.a.b(this.D, j6.a.b(this.C, j6.a.b(this.B, (iHashCode6 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getF52044y() {
            return this.f52044y;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getC() {
            return this.C;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getE() {
            return this.E;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.C = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF53780g() {
            return this.f52042w;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final gw0.q getF53781h() {
            return this.f52043x;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.A = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.D;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getD() {
            return this.u;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Model(aw0.r2 r2Var, ul ulVar, Clause clause, Clause clause2, tx0.k0 k0Var, List list, aw0.cb cbVar, boolean z, hw0.x xVar, boolean z3, Pair pair, boolean z4, aw0.l1 l1Var, hm0 hm0Var, hw0.z zVar, int i, List list2, String str, String str2, cam.f fVar) {
            int i2 = R$attr.uikit_dp12;
            int i3 = R$attr.uikit_dp16;
            this(r2Var, ulVar, clause, clause2, k0Var, list, cbVar, z, xVar, z3, pair, z4, l1Var, hm0Var, zVar, i, list2, str, str2, fVar, null, ChatBubbleDelegate.c.a.f53833a, false, null, false, null, null, i2, i2, i3, i3);
        }
    }
}
