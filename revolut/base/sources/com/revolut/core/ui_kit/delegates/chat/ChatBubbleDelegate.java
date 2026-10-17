package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleTitleStyle;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView;
import com.revolut.core.ui_kit.internal.views.chat.ChatParentLayout;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.v7;
import java.util.List;
import koe.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\t\b\t\n\u000b\f\r\u000e\u0003\u000fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatBubbleDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatBubbleDelegate$Model;", "Lkp0/u;", "Lkp0/d;", "<init>", "()V", "Companion", "Model", "kp0/s", "kp0/r", "ButtonModel", "kp0/t", "a", "c", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatBubbleDelegate extends BaseRecyclerViewDelegate<Model, kp0.u> implements kp0.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53806c;
    public final e01.a d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f53807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f53808h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f53809j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f53810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f53811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.f f53812n;
    public final ihm.f o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatBubbleDelegate$ButtonModel;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ButtonModel implements TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f53815c;
        public final Object d;
        public Parcelable e;

        public ButtonModel(String id10, Clause text, Object obj2, int i) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f53813a = id10;
            this.f53814b = text;
            this.f53815c = null;
            this.d = obj2;
            this.e = null;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ButtonModel)) {
                return false;
            }
            ButtonModel buttonModel = (ButtonModel) obj2;
            return Intrinsics.f(this.f53813a, buttonModel.f53813a) && Intrinsics.f(this.f53814b, buttonModel.f53814b) && Intrinsics.f(this.f53815c, buttonModel.f53815c) && Intrinsics.f(this.d, buttonModel.d) && Intrinsics.f(this.e, buttonModel.e);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.e;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f53813a.hashCode() * 31, 31, this.f53814b);
            Image image = this.f53815c;
            int iHashCode = (iA + (image == null ? 0 : image.hashCode())) * 31;
            Object obj2 = this.d;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.e;
            return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatBubbleDelegate$Model;", "Loq0/b;", "Lqv0/o;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements oq0.b, qv0.o, TrackableItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public int A;
        public int B;
        public final int C;
        public final int D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53818c;
        public final Clause d;
        public final Clause e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a f53819g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final kp0.r f53820h;
        public final ButtonModel i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final c f53821j;
        public final Image k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Clause f53822l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Clause f53823m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List f53824n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final gw0.q f53825p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final gw0.a f53826q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final gw0.l f53827r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final kp0.t f53828s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final xo0.b f53829t;
        public final boolean u;
        public final Image v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final gw0.v f53830w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final cam.f f53831x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final Object f53832y;
        public Parcelable z;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, Clause clause, TextClause textClause, Clause clause2, a aVar, ButtonModel buttonModel, c style, ResourceImage resourceImage, Clause clause3, TimeClause timeClause, kp0.t tVar, Image image, boolean z, gw0.q qVar, cam.f position, Object obj2, gw0.a aVar2, xo0.b accessibilitySender, gw0.v vVar, int i, int i2, int i3, int i5) {
                Clause clause4 = (i5 & 4) != 0 ? null : clause;
                TextClause textClause2 = (i5 & 8) != 0 ? null : textClause;
                a aVar3 = (i5 & 64) != 0 ? null : aVar;
                ButtonModel buttonModel2 = (i5 & 256) != 0 ? null : buttonModel;
                ResourceImage resourceImage2 = (i5 & 2048) != 0 ? null : resourceImage;
                Clause clause5 = (i5 & 4096) != 0 ? null : clause3;
                TimeClause timeClause2 = (i5 & 8192) != 0 ? null : timeClause;
                kp0.t tVar2 = (32768 & i5) != 0 ? null : tVar;
                f0 overlappedIcons = f0.f322471a;
                Image image2 = (131072 & i5) != 0 ? null : image;
                boolean z3 = (262144 & i5) != 0 ? false : z;
                gw0.q qVar2 = (524288 & i5) != 0 ? null : qVar;
                Object obj3 = (4194304 & i5) != 0 ? null : obj2;
                gw0.a chatBubbleButtonOrientation = (16777216 & i5) != 0 ? gw0.a.HORIZONTAL : aVar2;
                gw0.v sideStatusBadge = (67108864 & i5) != 0 ? gw0.v.NONE : vVar;
                int i6 = (i5 & PKIFailureInfo.duplicateCertReq) != 0 ? R$attr.uikit_dp16 : i3;
                int i21 = R$attr.uikit_dp16;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(overlappedIcons, "overlappedIcons");
                Intrinsics.checkNotNullParameter(position, "position");
                Intrinsics.checkNotNullParameter(chatBubbleButtonOrientation, "chatBubbleButtonOrientation");
                Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
                Intrinsics.checkNotNullParameter(sideStatusBadge, "sideStatusBadge");
                return new Model(listId, null, clause4, textClause2, clause2, null, aVar3, null, buttonModel2, style, resourceImage2, clause5, timeClause2, overlappedIcons, z3, qVar2, chatBubbleButtonOrientation, gw0.l.NORMAL, tVar2, accessibilitySender, true, image2, sideStatusBadge, position, obj3, null, i, i2, i6, i21);
            }

            public static Model b(Companion companion, String listId, CompositeClause compositeClause, kp0.r rVar, ButtonModel buttonModel, gw0.i position, g79.a aVar, AnalyticsContext analyticsContext, gw0.a chatBubbleButtonOrientation, gw0.l size, xo0.a accessibilitySender, int i, int i2) {
                f0 overlappedIcons = f0.f322471a;
                gw0.v sideStatusBadge = gw0.v.NONE;
                int i3 = R$attr.uikit_dp16;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                c.C0431c style = c.C0431c.f53835a;
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(overlappedIcons, "overlappedIcons");
                Intrinsics.checkNotNullParameter(position, "position");
                Intrinsics.checkNotNullParameter(chatBubbleButtonOrientation, "chatBubbleButtonOrientation");
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
                Intrinsics.checkNotNullParameter(sideStatusBadge, "sideStatusBadge");
                return new Model(listId, null, null, null, compositeClause, null, null, rVar, buttonModel, style, null, null, null, overlappedIcons, false, null, chatBubbleButtonOrientation, size, null, accessibilitySender, false, null, sideStatusBadge, position, aVar, analyticsContext, i, i2, i3, i3);
            }
        }

        public Model(String str, Clause clause, Clause clause2, Clause clause3, Clause clause4, Clause clause5, a aVar, kp0.r rVar, ButtonModel buttonModel, c cVar, Image image, Clause clause6, Clause clause7, List list, boolean z, gw0.q qVar, gw0.a aVar2, gw0.l lVar, kp0.t tVar, xo0.b bVar, boolean z3, Image image2, gw0.v vVar, cam.f fVar, Object obj2, AnalyticsContext analyticsContext, int i, int i2, int i3, int i5) {
            this.f53816a = str;
            this.f53817b = clause;
            this.f53818c = clause2;
            this.d = clause3;
            this.e = clause4;
            this.f = clause5;
            this.f53819g = aVar;
            this.f53820h = rVar;
            this.i = buttonModel;
            this.f53821j = cVar;
            this.k = image;
            this.f53822l = clause6;
            this.f53823m = clause7;
            this.f53824n = list;
            this.o = z;
            this.f53825p = qVar;
            this.f53826q = aVar2;
            this.f53827r = lVar;
            this.f53828s = tVar;
            this.f53829t = bVar;
            this.u = z3;
            this.v = image2;
            this.f53830w = vVar;
            this.f53831x = fVar;
            this.f53832y = obj2;
            this.z = analyticsContext;
            this.A = i;
            this.B = i2;
            this.C = i3;
            this.D = i5;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatBubbleDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53559c() {
            return this.f53832y;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53557a() {
            return this.f53816a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53816a, model.f53816a) && Intrinsics.f(this.f53817b, model.f53817b) && Intrinsics.f(this.f53818c, model.f53818c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53819g, model.f53819g) && Intrinsics.f(this.f53820h, model.f53820h) && Intrinsics.f(this.i, model.i) && this.f53821j.equals(model.f53821j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53822l, model.f53822l) && Intrinsics.f(this.f53823m, model.f53823m) && Intrinsics.f(this.f53824n, model.f53824n) && this.o == model.o && Intrinsics.f(this.f53825p, model.f53825p) && this.f53826q == model.f53826q && this.f53827r == model.f53827r && Intrinsics.f(this.f53828s, model.f53828s) && this.f53829t.equals(model.f53829t) && this.u == model.u && Intrinsics.f(this.v, model.v) && this.f53830w == model.f53830w && this.f53831x.equals(model.f53831x) && Intrinsics.f(this.f53832y, model.f53832y) && Intrinsics.f(this.z, model.z) && this.A == model.A && this.B == model.B && this.C == model.C && this.D == model.D;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51989l() {
            return this.A;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.A = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.z;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53855c() {
            return this.f53831x;
        }

        public final int hashCode() {
            int iHashCode = this.f53816a.hashCode() * 31;
            Clause clause = this.f53817b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f53818c;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.d;
            int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            Clause clause4 = this.e;
            int iHashCode5 = (iHashCode4 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
            Clause clause5 = this.f;
            int iHashCode6 = (iHashCode5 + (clause5 == null ? 0 : clause5.hashCode())) * 31;
            a aVar = this.f53819g;
            int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            kp0.r rVar = this.f53820h;
            int iHashCode8 = (iHashCode7 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            ButtonModel buttonModel = this.i;
            int iHashCode9 = (this.f53821j.hashCode() + ((iHashCode8 + (buttonModel == null ? 0 : buttonModel.hashCode())) * 961)) * 31;
            Image image = this.k;
            int iHashCode10 = (iHashCode9 + (image == null ? 0 : image.hashCode())) * 31;
            Clause clause6 = this.f53822l;
            int iHashCode11 = (iHashCode10 + (clause6 == null ? 0 : clause6.hashCode())) * 31;
            Clause clause7 = this.f53823m;
            int iC = j6.a.c(j6.a.c(p.a.d((iHashCode11 + (clause7 == null ? 0 : clause7.hashCode())) * 961, 31, this.f53824n), 31, false), 31, this.o);
            gw0.q qVar = this.f53825p;
            int iHashCode12 = (this.f53827r.hashCode() + ((this.f53826q.hashCode() + ((iC + (qVar == null ? 0 : qVar.hashCode())) * 31)) * 31)) * 31;
            kp0.t tVar = this.f53828s;
            int iC2 = j6.a.c((this.f53829t.hashCode() + ((iHashCode12 + (tVar == null ? 0 : tVar.hashCode())) * 31)) * 31, 31, this.u);
            Image image2 = this.v;
            int iE = v7.e(this.f53831x, (this.f53830w.hashCode() + ((iC2 + (image2 == null ? 0 : image2.hashCode())) * 31)) * 31, 31);
            Object obj2 = this.f53832y;
            int iHashCode13 = (iE + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.z;
            return Integer.hashCode(this.D) + j6.a.b(this.C, j6.a.b(this.B, j6.a.b(this.A, (iHashCode13 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51990m() {
            return this.B;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.D;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.B = i;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: p0, reason: from getter */
        public final gw0.v getF53830w() {
            return this.f53830w;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.z = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51991n() {
            return this.C;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getD() {
            return this.v;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z = !Intrinsics.f(model.f53817b, this.f53817b);
            boolean z3 = !Intrinsics.f(model.f53818c, this.f53818c);
            boolean z4 = !Intrinsics.f(model.d, this.d);
            boolean z6 = !Intrinsics.f(model.e, this.e);
            boolean z11 = !Intrinsics.f(model.f, this.f);
            boolean z12 = !Intrinsics.f(model.f53823m, this.f53823m);
            boolean z29 = !Intrinsics.f(model.f53819g, this.f53819g);
            boolean z31 = !Intrinsics.f(model.f53820h, this.f53820h);
            boolean z41 = !Intrinsics.f(model.i, this.i);
            boolean z49 = !true;
            boolean z54 = !model.f53821j.equals(this.f53821j);
            boolean z74 = !Intrinsics.f(model.k, this.k);
            boolean z83 = false;
            if (model.f53830w != this.f53830w) {
                z83 = true;
            }
            return new kp0.s(z, z3, z4, z6, z11, z12, z29, z31, z41, z49, z54, z74, z83, !Intrinsics.f(model.f53822l, this.f53822l), !model.f53831x.equals(this.f53831x), !true, !Intrinsics.f(model.f53824n, this.f53824n), !Intrinsics.f(model.v, this.v), false, model.o != this.o, !Intrinsics.f(model.f53825p, this.f53825p), model.f53826q != this.f53826q, model.f53827r != this.f53827r, !Intrinsics.f(model.f53828s, this.f53828s), !model.f53829t.equals(this.f53829t), model.u != this.u);
        }
    }

    public static abstract class a {
        private a() {
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f53833a = new a();

            private a() {
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int a() {
                return R$attr.uikit_colorGreyTone20;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int b() {
                return R$attr.uikit_colorAccentNeutral;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final ChatBubbleStyle c() {
                return ChatBubbleStyle.Grey.f56808a;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final ChatBubbleTitleStyle d() {
                return ChatBubbleTitleStyle.Blue.f56814a;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final h4 e() {
                return h4.ACCENT;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final h4 f() {
                return h4.SEMIACCENT;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int g() {
                return R$attr.uikit_colorForeground;
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate$c$c, reason: collision with other inner class name */
        public static final class C0431c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0431c f53835a = new C0431c();

            private C0431c() {
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int a() {
                return R$attr.uikit_colorGreyTone20;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int b() {
                return R$attr.uikit_colorAccentNeutral;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final ChatBubbleStyle c() {
                return ChatBubbleStyle.Light.f56809a;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final ChatBubbleTitleStyle d() {
                return ChatBubbleTitleStyle.Foreground.f56816a;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final h4 e() {
                return h4.ACCENT;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final h4 f() {
                return h4.SEMIACCENT;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int g() {
                return R$attr.uikit_colorForeground;
            }
        }

        public static final class e extends c {
            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int a() {
                return R$attr.uikit_colorGreyTone20;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int b() {
                return R$attr.uikit_colorAccentNeutral;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final ChatBubbleStyle c() {
                return ChatBubbleStyle.Uncontained.f56811a;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final ChatBubbleTitleStyle d() {
                return ChatBubbleTitleStyle.Foreground.f56816a;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final h4 e() {
                return h4.ACCENT;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof e);
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final h4 f() {
                return h4.SEMIACCENT;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int g() {
                return R$attr.uikit_colorForeground;
            }

            public final int hashCode() {
                return 0;
            }
        }

        private c() {
        }

        public abstract int a();

        public abstract int b();

        public abstract ChatBubbleStyle c();

        public abstract ChatBubbleTitleStyle d();

        public abstract h4 e();

        public abstract h4 f();

        public abstract int g();

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f53834a;

            public b(Integer num) {
                this.f53834a = num;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int a() {
                return R$attr.uikit_colorGreyTone20;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int b() {
                return R$attr.uikit_colorAccentNeutral;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final ChatBubbleStyle c() {
                return ChatBubbleStyle.Light.f56809a;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final ChatBubbleTitleStyle d() {
                Integer num = this.f53834a;
                return num != null ? new ChatBubbleTitleStyle.Custom(num.intValue()) : ChatBubbleTitleStyle.Foreground.f56816a;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final h4 e() {
                return h4.ACCENT;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f53834a, ((b) obj2).f53834a);
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final h4 f() {
                return h4.SEMIACCENT;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int g() {
                return R$attr.uikit_colorForeground;
            }

            public final int hashCode() {
                Integer num = this.f53834a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public b() {
                this(null);
            }
        }

        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f53836a;

            public d(Integer num) {
                this.f53836a = num;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int a() {
                return R$attr.uikit_colorGreyTone20;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int b() {
                return R$attr.uikit_colorAccentNeutral;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final ChatBubbleStyle c() {
                return ChatBubbleStyle.Grey.f56808a;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final ChatBubbleTitleStyle d() {
                Integer num = this.f53836a;
                return num != null ? new ChatBubbleTitleStyle.Custom(num.intValue()) : ChatBubbleTitleStyle.Foreground.f56816a;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final h4 e() {
                return h4.ACCENT;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.f53836a, ((d) obj2).f53836a);
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final h4 f() {
                return h4.SEMIACCENT;
            }

            @Override // com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.c
            public final int g() {
                return R$attr.uikit_colorForeground;
            }

            public final int hashCode() {
                Integer num = this.f53836a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public d() {
                this(null);
            }
        }
    }

    public ChatBubbleDelegate() {
        super(R$id.chatBubbleDelegate_root, new x(5));
        this.f53806c = v0.a.d("create(...)");
        this.d = new e01.a();
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f53807g = v0.a.d("create(...)");
        this.f53808h = new e01.a();
        this.i = v0.a.d("create(...)");
        this.f53809j = v0.a.d("create(...)");
        this.k = v0.a.d("create(...)");
        this.f53810l = v0.a.d("create(...)");
        this.f53811m = v0.a.d("create(...)");
        this.f53812n = v0.a.d("create(...)");
        this.o = v0.a.d("create(...)");
    }

    @Override // kp0.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ihm.f getD() {
        return this.e;
    }

    @Override // kp0.d
    public final efm.r c() {
        return this.f53808h.f121375b;
    }

    @Override // kp0.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ihm.f getE() {
        return this.f53807g;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.h(context);
        AttributeSet attributeSet = null;
        int i = 6;
        int i2 = 0;
        ChatBubbleView chatBubbleView = new ChatBubbleView(context, attributeSet, i, i2);
        chatBubbleView.setId(R$id.chatBubbleDelegate_bubbleView);
        chatBubbleView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.chatBubbleDelegate_contentLayout);
        linearLayout.setOrientation(1);
        linearLayout.addView(chatBubbleView);
        ChatParentLayout chatParentLayout = new ChatParentLayout(context, attributeSet, i, i2);
        chatParentLayout.setId(R$id.chatBubbleDelegate_chatParentLayout);
        chatParentLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        chatParentLayout.addView(linearLayout, new ViewGroup.LayoutParams(-2, -2));
        ChatSwipeToReplyLayout chatSwipeToReplyLayout = new ChatSwipeToReplyLayout(context, attributeSet, i, i2);
        chatSwipeToReplyLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        chatSwipeToReplyLayout.addView(chatParentLayout);
        chatSwipeToReplyLayout.setAnchorViewId(Integer.valueOf(R$id.chatBubbleDelegate_chatParentLayout));
        kp0.u uVar = new kp0.u(chatSwipeToReplyLayout, chatParentLayout, linearLayout, chatBubbleView);
        chatParentLayout.setBottomAnchorView(chatBubbleView);
        chatBubbleView.getGiftPlayer().setLayoutTransition(null);
        return uVar;
    }

    @Override // kp0.d
    public final efm.r i() {
        return this.f53810l;
    }

    /* JADX WARN: Removed duplicated region for block: B:305:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07e1  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(kp0.u r72, com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.Model r73, int r74, java.util.List r75) {
        /*
            Method dump skipped, instruction units count: 2023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate.p(kp0.u, com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate$Model, int, java.util.List):void");
    }
}
