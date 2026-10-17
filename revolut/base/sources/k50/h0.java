package k50;

import aw0.l8;
import com.revolut.chat.domain.model.ChatMode;
import com.revolut.data.model.Data;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 implements cli.j {
    public final a1 A;
    public final boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f181079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f181080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f181081c;
    public final m1 d;
    public final o0 e;
    public final v30.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1 f181082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v30.c0 f181083h;
    public final ChatMode i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v30.s f181084j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f181085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f181086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f181087n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t0 f181088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l1 f181089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b1 f181090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0 f181091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f181092t;
    public final l8 u;
    public final l8 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l8 f181093w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v0 f181094x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l8 f181095y;
    public final Map z;

    public h0(UUID uuid, Data detailedChat, Data assignedAgent, m1 messagesData, o0 composerState, v30.i bottomContainerData, f1 f1Var, v30.c0 feedType, ChatMode chatMode, v30.s pricingPlan, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, t0 t0Var, l1 l1Var, b1 suggestionsState, c0 c0Var, boolean z12, l8 l8Var, l8 l8Var2, l8 l8Var3, v0 pane, l8 l8Var4, Map actionFeedbackState, a1 searchState, boolean z29) {
        Intrinsics.checkNotNullParameter(detailedChat, "detailedChat");
        Intrinsics.checkNotNullParameter(assignedAgent, "assignedAgent");
        Intrinsics.checkNotNullParameter(messagesData, "messagesData");
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(bottomContainerData, "bottomContainerData");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(suggestionsState, "suggestionsState");
        Intrinsics.checkNotNullParameter(pane, "pane");
        Intrinsics.checkNotNullParameter(actionFeedbackState, "actionFeedbackState");
        Intrinsics.checkNotNullParameter(searchState, "searchState");
        this.f181079a = uuid;
        this.f181080b = detailedChat;
        this.f181081c = assignedAgent;
        this.d = messagesData;
        this.e = composerState;
        this.f = bottomContainerData;
        this.f181082g = f1Var;
        this.f181083h = feedType;
        this.i = chatMode;
        this.f181084j = pricingPlan;
        this.k = z;
        this.f181085l = z3;
        this.f181086m = z4;
        this.f181087n = z6;
        this.o = z11;
        this.f181088p = t0Var;
        this.f181089q = l1Var;
        this.f181090r = suggestionsState;
        this.f181091s = c0Var;
        this.f181092t = z12;
        this.u = l8Var;
        this.v = l8Var2;
        this.f181093w = l8Var3;
        this.f181094x = pane;
        this.f181095y = l8Var4;
        this.z = actionFeedbackState;
        this.A = searchState;
        this.B = z29;
    }

    public static h0 a(h0 h0Var, UUID uuid, Data data, Data data2, m1 m1Var, o0 o0Var, v30.i iVar, f1 f1Var, v30.c0 c0Var, ChatMode chatMode, v30.s sVar, boolean z, boolean z3, t0 t0Var, l1 l1Var, b1 b1Var, c0 c0Var2, boolean z4, l8 l8Var, l8 l8Var2, l8 l8Var3, v0 v0Var, l8 l8Var4, Map map, a1 a1Var, int i) {
        boolean z6;
        c0 c0Var3;
        boolean z11;
        l8 l8Var5;
        UUID uuid2 = (i & 1) != 0 ? h0Var.f181079a : uuid;
        Data detailedChat = (i & 2) != 0 ? h0Var.f181080b : data;
        Data assignedAgent = (i & 4) != 0 ? h0Var.f181081c : data2;
        m1 messagesData = (i & 8) != 0 ? h0Var.d : m1Var;
        o0 composerState = (i & 16) != 0 ? h0Var.e : o0Var;
        v30.i bottomContainerData = (i & 32) != 0 ? h0Var.f : iVar;
        f1 f1Var2 = (i & 64) != 0 ? h0Var.f181082g : f1Var;
        v30.c0 feedType = (i & 128) != 0 ? h0Var.f181083h : c0Var;
        ChatMode chatMode2 = (i & 256) != 0 ? h0Var.i : chatMode;
        v30.s pricingPlan = (i & 512) != 0 ? h0Var.f181084j : sVar;
        boolean z12 = (i & 1024) != 0 ? h0Var.k : z;
        boolean z29 = (i & 2048) != 0 ? h0Var.f181085l : z3;
        boolean z31 = h0Var.f181086m;
        boolean z41 = h0Var.f181087n;
        boolean z49 = h0Var.o;
        t0 t0Var2 = (i & 32768) != 0 ? h0Var.f181088p : t0Var;
        l1 l1Var2 = (i & 65536) != 0 ? h0Var.f181089q : l1Var;
        b1 suggestionsState = (i & 131072) != 0 ? h0Var.f181090r : b1Var;
        if ((i & 262144) != 0) {
            z6 = z31;
            c0Var3 = h0Var.f181091s;
        } else {
            z6 = z31;
            c0Var3 = c0Var2;
        }
        boolean z54 = (i & 524288) != 0 ? h0Var.f181092t : z4;
        l8 l8Var6 = (i & PKIFailureInfo.badCertTemplate) != 0 ? h0Var.u : l8Var;
        l8 l8Var7 = (i & PKIFailureInfo.badSenderNonce) != 0 ? h0Var.v : l8Var2;
        l8 l8Var8 = (i & 4194304) != 0 ? h0Var.f181093w : l8Var3;
        v0 pane = (i & 8388608) != 0 ? h0Var.f181094x : v0Var;
        if ((i & 16777216) != 0) {
            z11 = z41;
            l8Var5 = h0Var.f181095y;
        } else {
            z11 = z41;
            l8Var5 = l8Var4;
        }
        Map actionFeedbackState = (i & 33554432) != 0 ? h0Var.z : map;
        UUID uuid3 = uuid2;
        a1 searchState = (i & 67108864) != 0 ? h0Var.A : a1Var;
        f1 f1Var3 = f1Var2;
        boolean z74 = h0Var.B;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(detailedChat, "detailedChat");
        Intrinsics.checkNotNullParameter(assignedAgent, "assignedAgent");
        Intrinsics.checkNotNullParameter(messagesData, "messagesData");
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(bottomContainerData, "bottomContainerData");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(suggestionsState, "suggestionsState");
        Intrinsics.checkNotNullParameter(pane, "pane");
        Intrinsics.checkNotNullParameter(actionFeedbackState, "actionFeedbackState");
        Intrinsics.checkNotNullParameter(searchState, "searchState");
        return new h0(uuid3, detailedChat, assignedAgent, messagesData, composerState, bottomContainerData, f1Var3, feedType, chatMode2, pricingPlan, z12, z29, z6, z11, z49, t0Var2, l1Var2, suggestionsState, c0Var3, z54, l8Var6, l8Var7, l8Var8, pane, l8Var5, actionFeedbackState, searchState, z74);
    }

    public final boolean c(j30.c chatFeatureToggles) {
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        int i = g0.f181072a[this.f181083h.ordinal()];
        if (i == 1) {
            chatFeatureToggles.getClass();
            return true;
        }
        if (i == 2) {
            chatFeatureToggles.getClass();
            return true;
        }
        if (i == 3) {
            return !this.f.e;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f181079a, h0Var.f181079a) && Intrinsics.f(this.f181080b, h0Var.f181080b) && Intrinsics.f(this.f181081c, h0Var.f181081c) && Intrinsics.f(this.d, h0Var.d) && Intrinsics.f(this.e, h0Var.e) && Intrinsics.f(this.f, h0Var.f) && Intrinsics.f(this.f181082g, h0Var.f181082g) && this.f181083h == h0Var.f181083h && Intrinsics.f(this.i, h0Var.i) && this.f181084j == h0Var.f181084j && this.k == h0Var.k && this.f181085l == h0Var.f181085l && this.f181086m == h0Var.f181086m && this.f181087n == h0Var.f181087n && this.o == h0Var.o && Intrinsics.f(this.f181088p, h0Var.f181088p) && Intrinsics.f(this.f181089q, h0Var.f181089q) && Intrinsics.f(this.f181090r, h0Var.f181090r) && Intrinsics.f(this.f181091s, h0Var.f181091s) && this.f181092t == h0Var.f181092t && Intrinsics.f(this.u, h0Var.u) && Intrinsics.f(this.v, h0Var.v) && Intrinsics.f(this.f181093w, h0Var.f181093w) && this.f181094x == h0Var.f181094x && Intrinsics.f(this.f181095y, h0Var.f181095y) && Intrinsics.f(this.z, h0Var.z) && Intrinsics.f(this.A, h0Var.A) && this.B == h0Var.B;
    }

    public final int hashCode() {
        UUID uuid = this.f181079a;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + kii.e.c(this.f181081c, kii.e.c(this.f181080b, (uuid == null ? 0 : uuid.hashCode()) * 31, 31), 31)) * 31)) * 31)) * 31;
        f1 f1Var = this.f181082g;
        int iHashCode2 = (this.f181083h.hashCode() + ((iHashCode + (f1Var == null ? 0 : f1Var.hashCode())) * 31)) * 31;
        ChatMode chatMode = this.i;
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.f181084j.hashCode() + ((iHashCode2 + (chatMode == null ? 0 : chatMode.hashCode())) * 31)) * 31, 31, this.k), 31, this.f181085l), 31, this.f181086m), 31, this.f181087n), 31, this.o);
        t0 t0Var = this.f181088p;
        int iHashCode3 = (iC + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        l1 l1Var = this.f181089q;
        int iHashCode4 = (this.f181090r.hashCode() + ((iHashCode3 + (l1Var == null ? 0 : l1Var.hashCode())) * 31)) * 31;
        c0 c0Var = this.f181091s;
        int iC2 = j6.a.c((iHashCode4 + (c0Var == null ? 0 : c0Var.hashCode())) * 31, 31, this.f181092t);
        l8 l8Var = this.u;
        int iHashCode5 = (iC2 + (l8Var == null ? 0 : l8Var.hashCode())) * 31;
        l8 l8Var2 = this.v;
        int iHashCode6 = (iHashCode5 + (l8Var2 == null ? 0 : l8Var2.hashCode())) * 31;
        l8 l8Var3 = this.f181093w;
        int iHashCode7 = (this.f181094x.hashCode() + ((iHashCode6 + (l8Var3 == null ? 0 : l8Var3.hashCode())) * 31)) * 31;
        l8 l8Var4 = this.f181095y;
        return Boolean.hashCode(this.B) + ((this.A.hashCode() + p.a.e((iHashCode7 + (l8Var4 != null ? l8Var4.hashCode() : 0)) * 31, 31, this.z)) * 31);
    }
}
