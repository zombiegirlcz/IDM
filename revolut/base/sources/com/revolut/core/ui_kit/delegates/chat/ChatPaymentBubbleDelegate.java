package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aw0.i3;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.v7;
import ix0.l1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kp0.p0;
import kp0.q0;
import kp0.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0005\u0006\u0007\b\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatPaymentBubbleDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatPaymentBubbleDelegate$Model;", "Lkp0/s0;", "Companion", "Model", "kp0/q0", "kp0/p0", "a", "Lcom/revolut/core/ui_kit/delegates/chat/DefaultModeChatPaymentBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/TransparentModeChatPaymentBubbleDelegate;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChatPaymentBubbleDelegate extends BaseRecyclerViewDelegate<Model, s0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final int k = R$layout.internal_delegate_chat_payment_bubble;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f53863c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f53864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f53865h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f53866j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatPaymentBubbleDelegate$Model;", "Loq0/b;", "Lqv0/o;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements oq0.b, qv0.o, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53869c;
        public final p0 d;
        public final ChatBubbleDelegate.ButtonModel e;
        public final ChatBubbleDelegate.ButtonModel f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ChatBubbleDelegate.c f53870g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TimeClause f53871h;
        public final List i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final kp0.t f53872j;
        public final gw0.u k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final xo0.b f53873l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final i3 f53874m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Image f53875n;
        public final cam.f o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Object f53876p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Parcelable f53877q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f53878r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f53879s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f53880t;
        public final int u;

        public Model(String listId, Clause clause, Clause clause2, p0 p0Var, ChatBubbleDelegate.ButtonModel buttonModel, ChatBubbleDelegate.ButtonModel buttonModel2, ChatBubbleDelegate.c style, TimeClause timeClause, List overlappedIcons, kp0.t tVar, gw0.u uVar, xo0.b accessibilitySender, i3 i3Var, Image image, cam.f position, Object obj2, int i, int i2, int i3, int i5) {
            i3 i3Var2 = (i5 & 4096) != 0 ? null : i3Var;
            int i6 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(overlappedIcons, "overlappedIcons");
            Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
            Intrinsics.checkNotNullParameter(position, "position");
            this.f53867a = listId;
            this.f53868b = clause;
            this.f53869c = clause2;
            this.d = p0Var;
            this.e = buttonModel;
            this.f = buttonModel2;
            this.f53870g = style;
            this.f53871h = timeClause;
            this.i = overlappedIcons;
            this.f53872j = tVar;
            this.k = uVar;
            this.f53873l = accessibilitySender;
            this.f53874m = i3Var2;
            this.f53875n = image;
            this.o = position;
            this.f53876p = obj2;
            this.f53877q = null;
            this.f53878r = i;
            this.f53879s = i2;
            this.f53880t = i3;
            this.u = i6;
        }

        @Override // koi.j
        public final /* bridge */ /* synthetic */ koi.k T1() {
            return null;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53559c() {
            return this.f53876p;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53557a() {
            return this.f53867a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53867a, model.f53867a) && Intrinsics.f(this.f53868b, model.f53868b) && Intrinsics.f(this.f53869c, model.f53869c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f53870g.equals(model.f53870g) && this.f53871h.equals(model.f53871h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53872j, model.f53872j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53873l, model.f53873l) && Intrinsics.f(this.f53874m, model.f53874m) && Intrinsics.f(this.f53875n, model.f53875n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f53876p, model.f53876p) && Intrinsics.f(this.f53877q, model.f53877q) && this.f53878r == model.f53878r && this.f53879s == model.f53879s && this.f53880t == model.f53880t && this.u == model.u;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51989l() {
            return this.f53878r;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53878r = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f53877q;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53855c() {
            return this.o;
        }

        public final int hashCode() {
            int iHashCode = this.f53867a.hashCode() * 31;
            Clause clause = this.f53868b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f53869c;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            p0 p0Var = this.d;
            int iHashCode4 = (iHashCode3 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
            ChatBubbleDelegate.ButtonModel buttonModel = this.e;
            int iHashCode5 = (iHashCode4 + (buttonModel == null ? 0 : buttonModel.hashCode())) * 31;
            ChatBubbleDelegate.ButtonModel buttonModel2 = this.f;
            int iD = p.a.d(h30.l.d(this.f53871h, (this.f53870g.hashCode() + ((iHashCode5 + (buttonModel2 == null ? 0 : buttonModel2.hashCode())) * 31)) * 31, 31), 31, this.i);
            kp0.t tVar = this.f53872j;
            int iHashCode6 = (iD + (tVar == null ? 0 : tVar.hashCode())) * 31;
            gw0.u uVar = this.k;
            int iHashCode7 = (this.f53873l.hashCode() + ((iHashCode6 + (uVar == null ? 0 : uVar.hashCode())) * 31)) * 31;
            i3 i3Var = this.f53874m;
            int iC = j6.a.c((iHashCode7 + (i3Var == null ? 0 : i3Var.f10352a.hashCode())) * 31, 31, false);
            Image image = this.f53875n;
            int iE = v7.e(this.o, (iC + (image == null ? 0 : image.hashCode())) * 31, 31);
            Object obj2 = this.f53876p;
            int iHashCode8 = (iE + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f53877q;
            return Integer.hashCode(this.u) + j6.a.b(this.f53880t, j6.a.b(this.f53879s, j6.a.b(this.f53878r, (iHashCode8 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51990m() {
            return this.f53879s;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.u;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53879s = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53877q = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51991n() {
            return this.f53880t;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getD() {
            return this.f53875n;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new q0(!Intrinsics.f(model.f53868b, this.f53868b), !Intrinsics.f(model.f53869c, this.f53869c), !model.f53871h.equals(this.f53871h), !Intrinsics.f(model.e, this.e), !Intrinsics.f(model.f, this.f), !model.f53870g.equals(this.f53870g), !Intrinsics.f(model.o, this.o), !Intrinsics.f(model.k, this.k), !Intrinsics.f(model.i, this.i), !Intrinsics.f(model.f53875n, this.f53875n), !Intrinsics.f(model.f53872j, this.f53872j), !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.f53874m, this.f53874m), false);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.chat.ChatPaymentBubbleDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ChatPaymentBubbleDelegate(int i, Function2 function2, Integer num) {
        super(i, function2);
        this.f53863c = num;
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f53864g = v0.a.d("create(...)");
        this.f53865h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        this.f53866j = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = k;
        Integer num = this.f53863c;
        if (num == null) {
            return new s0(kotlin.jvm.internal.s.r(parent, i));
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        View viewInflate = LayoutInflater.from(l1.a(context, context2, num.intValue())).inflate(i, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new s0(viewInflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04e5  */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [xo0.a] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Style, gq0.n, java.util.List, py0.d] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(kp0.s0 r53, final com.revolut.core.ui_kit.delegates.chat.ChatPaymentBubbleDelegate.Model r54, int r55, java.util.List r56) {
        /*
            Method dump skipped, instruction units count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.chat.ChatPaymentBubbleDelegate.p(kp0.s0, com.revolut.core.ui_kit.delegates.chat.ChatPaymentBubbleDelegate$Model, int, java.util.List):void");
    }
}
