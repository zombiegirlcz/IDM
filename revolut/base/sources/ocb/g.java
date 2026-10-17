package ocb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f224173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f224174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f224175c;
    public final boolean d;
    public final boolean e;
    public final a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f224176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f224177h;
    public final a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f224178j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f224179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rcb.c f224180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f224181n;
    public final j o;

    public g() {
        this(0);
    }

    public static g a(g gVar, Data data, boolean z, a0 a0Var, boolean z3, boolean z4, a0 a0Var2, a0 a0Var3, Boolean bool, a0 a0Var4, boolean z6, boolean z11, boolean z12, rcb.c cVar, boolean z29, i iVar, int i) {
        Data profileType = (i & 1) != 0 ? gVar.f224173a : data;
        boolean z31 = (i & 2) != 0 ? gVar.f224174b : z;
        a0 messagingWithFriendsState = (i & 4) != 0 ? gVar.f224175c : a0Var;
        boolean z41 = (i & 8) != 0 ? gVar.d : z3;
        boolean z49 = (i & 16) != 0 ? gVar.e : z4;
        a0 addingToGroupState = (i & 32) != 0 ? gVar.f : a0Var2;
        a0 creditSharingState = (i & 64) != 0 ? gVar.f224176g : a0Var3;
        Boolean bool2 = (i & 128) != 0 ? gVar.f224177h : bool;
        a0 birthdaySharingState = (i & 256) != 0 ? gVar.i : a0Var4;
        boolean z54 = (i & 512) != 0 ? gVar.f224178j : z6;
        boolean z74 = (i & 1024) != 0 ? gVar.k : z11;
        boolean z83 = (i & 2048) != 0 ? gVar.f224179l : z12;
        rcb.c makeMeDiscoverableFeatures = (i & 4096) != 0 ? gVar.f224180m : cVar;
        boolean z89 = (i & 8192) != 0 ? gVar.f224181n : z29;
        j hideAccountDetailsState = (i & 16384) != 0 ? gVar.o : iVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(profileType, "profileType");
        Intrinsics.checkNotNullParameter(messagingWithFriendsState, "messagingWithFriendsState");
        Intrinsics.checkNotNullParameter(addingToGroupState, "addingToGroupState");
        Intrinsics.checkNotNullParameter(creditSharingState, "creditSharingState");
        Intrinsics.checkNotNullParameter(birthdaySharingState, "birthdaySharingState");
        Intrinsics.checkNotNullParameter(makeMeDiscoverableFeatures, "makeMeDiscoverableFeatures");
        Intrinsics.checkNotNullParameter(hideAccountDetailsState, "hideAccountDetailsState");
        return new g(profileType, z31, messagingWithFriendsState, z41, z49, addingToGroupState, creditSharingState, bool2, birthdaySharingState, z54, z74, z83, makeMeDiscoverableFeatures, z89, hideAccountDetailsState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f224173a, gVar.f224173a) && this.f224174b == gVar.f224174b && Intrinsics.f(this.f224175c, gVar.f224175c) && this.d == gVar.d && this.e == gVar.e && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f224176g, gVar.f224176g) && Intrinsics.f(this.f224177h, gVar.f224177h) && Intrinsics.f(this.i, gVar.i) && this.f224178j == gVar.f224178j && this.k == gVar.k && this.f224179l == gVar.f224179l && Intrinsics.f(this.f224180m, gVar.f224180m) && this.f224181n == gVar.f224181n && Intrinsics.f(this.o, gVar.o);
    }

    public final int hashCode() {
        int iHashCode = (this.f224176g.hashCode() + ((this.f.hashCode() + j6.a.c(j6.a.c((this.f224175c.hashCode() + j6.a.c(this.f224173a.hashCode() * 31, 31, this.f224174b)) * 31, 31, this.d), 31, this.e)) * 31)) * 31;
        Boolean bool = this.f224177h;
        return this.o.hashCode() + j6.a.c((this.f224180m.hashCode() + j6.a.c(j6.a.c(j6.a.c((this.i.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31, 31, this.f224178j), 31, this.k), 31, this.f224179l)) * 31, 31, this.f224181n);
    }

    public g(Data profileType, boolean z, a0 messagingWithFriendsState, boolean z3, boolean z4, a0 addingToGroupState, a0 creditSharingState, Boolean bool, a0 birthdaySharingState, boolean z6, boolean z11, boolean z12, rcb.c makeMeDiscoverableFeatures, boolean z29, j hideAccountDetailsState) {
        Intrinsics.checkNotNullParameter(profileType, "profileType");
        Intrinsics.checkNotNullParameter(messagingWithFriendsState, "messagingWithFriendsState");
        Intrinsics.checkNotNullParameter(addingToGroupState, "addingToGroupState");
        Intrinsics.checkNotNullParameter(creditSharingState, "creditSharingState");
        Intrinsics.checkNotNullParameter(birthdaySharingState, "birthdaySharingState");
        Intrinsics.checkNotNullParameter(makeMeDiscoverableFeatures, "makeMeDiscoverableFeatures");
        Intrinsics.checkNotNullParameter(hideAccountDetailsState, "hideAccountDetailsState");
        this.f224173a = profileType;
        this.f224174b = z;
        this.f224175c = messagingWithFriendsState;
        this.d = z3;
        this.e = z4;
        this.f = addingToGroupState;
        this.f224176g = creditSharingState;
        this.f224177h = bool;
        this.i = birthdaySharingState;
        this.f224178j = z6;
        this.k = z11;
        this.f224179l = z12;
        this.f224180m = makeMeDiscoverableFeatures;
        this.f224181n = z29;
        this.o = hideAccountDetailsState;
    }

    public g(int i) {
        Data data = new Data(null, null, false, 7, null);
        rcb.c.Companion.getClass();
        rcb.c cVar = new rcb.c(false, false);
        h hVar = h.f224182a;
        y yVar = y.f224204a;
        this(data, false, yVar, false, false, yVar, yVar, null, yVar, false, false, false, cVar, false, hVar);
    }
}
