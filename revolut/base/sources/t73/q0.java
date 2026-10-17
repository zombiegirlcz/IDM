package t73;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class q0 implements cli.j {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f268506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od0.i f268507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardScreenAction f268508c;
    public final od0.i d;
    public final od0.i e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b93.d f268509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o5l.g f268510h;
    public final AccountId i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f268511j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f268512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f268513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f268514n;
    public final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f268515p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s63.e f268516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s63.a f268517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s63.b f268518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h93.f0 f268519t;
    public final b9.u u;
    public final Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final do3.n f268520w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f268521x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f268522y;

    public q0(Data state, od0.i walletId, CardScreenAction action, od0.i selectedCard, od0.i visibleCardDetails, String str, b93.d cardScope, o5l.g screenDensity, AccountId accountId, Data jointAccountId, Data juniorConsentData, boolean z, boolean z3, Set set, Set set2, Set set3, s63.e eVar, s63.a aVar, s63.b bVar, h93.f0 f0Var, b9.u uVar, Data legalContext, do3.n nVar, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(selectedCard, "selectedCard");
        Intrinsics.checkNotNullParameter(visibleCardDetails, "visibleCardDetails");
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
        Intrinsics.checkNotNullParameter(juniorConsentData, "juniorConsentData");
        Intrinsics.checkNotNullParameter(legalContext, "legalContext");
        this.f268506a = state;
        this.f268507b = walletId;
        this.f268508c = action;
        this.d = selectedCard;
        this.e = visibleCardDetails;
        this.f = str;
        this.f268509g = cardScope;
        this.f268510h = screenDensity;
        this.i = accountId;
        this.f268511j = jointAccountId;
        this.k = juniorConsentData;
        this.f268512l = z;
        this.f268513m = z3;
        this.f268514n = set;
        this.o = set2;
        this.f268515p = set3;
        this.f268516q = eVar;
        this.f268517r = aVar;
        this.f268518s = bVar;
        this.f268519t = f0Var;
        this.u = uVar;
        this.v = legalContext;
        this.f268520w = nVar;
        this.f268521x = z4;
        this.f268522y = z6;
    }

    public static q0 a(q0 q0Var, Data data, od0.i iVar, od0.i iVar2, String str, Data data2, Data data3, Set set, Set set2, Set set3, s63.e eVar, s63.a aVar, s63.b bVar, h93.f0 f0Var, b9.u uVar, Data data4, do3.n nVar, boolean z, int i) {
        Data state = (i & 1) != 0 ? q0Var.f268506a : data;
        od0.i walletId = q0Var.f268507b;
        CardScreenAction action = (i & 4) != 0 ? q0Var.f268508c : CardScreenAction.Idle.f65329a;
        od0.i selectedCard = (i & 8) != 0 ? q0Var.d : iVar;
        od0.i visibleCardDetails = (i & 16) != 0 ? q0Var.e : iVar2;
        String str2 = (i & 32) != 0 ? q0Var.f : str;
        b93.d cardScope = q0Var.f268509g;
        o5l.g screenDensity = q0Var.f268510h;
        AccountId accountId = q0Var.i;
        Data jointAccountId = (i & 512) != 0 ? q0Var.f268511j : data2;
        Data juniorConsentData = (i & 1024) != 0 ? q0Var.k : data3;
        boolean z3 = q0Var.f268512l;
        boolean z4 = (i & 4096) != 0 ? q0Var.f268513m : true;
        Set set4 = (i & 8192) != 0 ? q0Var.f268514n : set;
        Set set5 = (i & 16384) != 0 ? q0Var.o : set2;
        Set set6 = (32768 & i) != 0 ? q0Var.f268515p : set3;
        s63.e eVar2 = (65536 & i) != 0 ? q0Var.f268516q : eVar;
        s63.a aVar2 = (131072 & i) != 0 ? q0Var.f268517r : aVar;
        s63.b bVar2 = (262144 & i) != 0 ? q0Var.f268518s : bVar;
        h93.f0 f0Var2 = (524288 & i) != 0 ? q0Var.f268519t : f0Var;
        b9.u uVar2 = (1048576 & i) != 0 ? q0Var.u : uVar;
        Data legalContext = (2097152 & i) != 0 ? q0Var.v : data4;
        do3.n nVar2 = (4194304 & i) != 0 ? q0Var.f268520w : nVar;
        boolean z6 = (i & 8388608) != 0 ? q0Var.f268521x : z;
        boolean z11 = q0Var.f268522y;
        q0Var.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(selectedCard, "selectedCard");
        Intrinsics.checkNotNullParameter(visibleCardDetails, "visibleCardDetails");
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
        Intrinsics.checkNotNullParameter(juniorConsentData, "juniorConsentData");
        Intrinsics.checkNotNullParameter(legalContext, "legalContext");
        return new q0(state, walletId, action, selectedCard, visibleCardDetails, str2, cardScope, screenDensity, accountId, jointAccountId, juniorConsentData, z3, z4, set4, set5, set6, eVar2, aVar2, bVar2, f0Var2, uVar2, legalContext, nVar2, z6, z11);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f268506a, q0Var.f268506a) && Intrinsics.f(this.f268507b, q0Var.f268507b) && Intrinsics.f(this.f268508c, q0Var.f268508c) && Intrinsics.f(this.d, q0Var.d) && Intrinsics.f(this.e, q0Var.e) && Intrinsics.f(this.f, q0Var.f) && this.f268509g == q0Var.f268509g && this.f268510h == q0Var.f268510h && Intrinsics.f(this.i, q0Var.i) && Intrinsics.f(this.f268511j, q0Var.f268511j) && Intrinsics.f(this.k, q0Var.k) && this.f268512l == q0Var.f268512l && this.f268513m == q0Var.f268513m && Intrinsics.f(this.f268514n, q0Var.f268514n) && Intrinsics.f(this.o, q0Var.o) && Intrinsics.f(this.f268515p, q0Var.f268515p) && Intrinsics.f(this.f268516q, q0Var.f268516q) && Intrinsics.f(this.f268517r, q0Var.f268517r) && Intrinsics.f(this.f268518s, q0Var.f268518s) && Intrinsics.f(this.f268519t, q0Var.f268519t) && Intrinsics.f(this.u, q0Var.u) && Intrinsics.f(this.v, q0Var.v) && Intrinsics.f(this.f268520w, q0Var.f268520w) && this.f268521x == q0Var.f268521x && this.f268522y == q0Var.f268522y;
    }

    public final int hashCode() {
        int iF = r6.b.f(this.e, r6.b.f(this.d, (this.f268508c.hashCode() + r6.b.f(this.f268507b, this.f268506a.hashCode() * 31, 31)) * 31, 31), 31);
        String str = this.f;
        int iC = j6.a.c(j6.a.c(kii.e.c(this.k, kii.e.c(this.f268511j, h30.l.b(this.i, (this.f268510h.hashCode() + ((this.f268509g.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31), 31), 31), 31, this.f268512l), 31, this.f268513m);
        Set set = this.f268514n;
        int iHashCode = (iC + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.o;
        int iHashCode2 = (iHashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.f268515p;
        int iHashCode3 = (iHashCode2 + (set3 == null ? 0 : set3.hashCode())) * 31;
        s63.e eVar = this.f268516q;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        s63.a aVar = this.f268517r;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        s63.b bVar = this.f268518s;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        h93.f0 f0Var = this.f268519t;
        int iHashCode7 = (iHashCode6 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        b9.u uVar = this.u;
        int iC2 = kii.e.c(this.v, (iHashCode7 + (uVar == null ? 0 : uVar.hashCode())) * 31, 31);
        do3.n nVar = this.f268520w;
        return Boolean.hashCode(this.f268522y) + j6.a.c((iC2 + (nVar != null ? nVar.hashCode() : 0)) * 31, 31, this.f268521x);
    }
}
