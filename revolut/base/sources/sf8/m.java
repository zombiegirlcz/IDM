package sf8;

import ip0.v7;
import java.time.LocalDate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f262362c;
    public final String d;
    public final h e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io3.d f262363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f262364h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f262365j;
    public final LocalDate k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f262366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ij8.h f262367m;

    public m(String walletId, String ownerId, String firstName, String lastName, h accountUiState, dj0.d balance, io3.d dVar, Set availableActions, boolean z, boolean z3, LocalDate birthDate, String code, ij8.h profileState) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(accountUiState, "accountUiState");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(availableActions, "availableActions");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(profileState, "profileState");
        this.f262360a = walletId;
        this.f262361b = ownerId;
        this.f262362c = firstName;
        this.d = lastName;
        this.e = accountUiState;
        this.f = balance;
        this.f262363g = dVar;
        this.f262364h = availableActions;
        this.i = z;
        this.f262365j = z3;
        this.k = birthDate;
        this.f262366l = code;
        this.f262367m = profileState;
    }

    public final dj0.d a() {
        io3.d dVar = this.f262363g;
        if (dVar == null) {
            return null;
        }
        long j2 = dVar.i;
        xi0.a aVar = xi0.b.Companion;
        String str = dVar.f163147c;
        aVar.getClass();
        return new dj0.d(j2, xi0.a.a(str));
    }

    public final String b() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.f262362c, " ", this.d);
    }

    public final String c() {
        return this.f262361b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f262360a, mVar.f262360a) && Intrinsics.f(this.f262361b, mVar.f262361b) && Intrinsics.f(this.f262362c, mVar.f262362c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f262363g, mVar.f262363g) && Intrinsics.f(this.f262364h, mVar.f262364h) && this.i == mVar.i && this.f262365j == mVar.f262365j && Intrinsics.f(this.k, mVar.k) && Intrinsics.f(this.f262366l, mVar.f262366l) && this.f262367m == mVar.f262367m;
    }

    public final int hashCode() {
        int iC = v7.c((this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f262360a.hashCode() * 31, 31, this.f262361b), 31, this.f262362c), 31, this.d)) * 31, 31, this.f);
        io3.d dVar = this.f262363g;
        return this.f262367m.hashCode() + p.a.c(y.a(j6.a.c(j6.a.c(p.a.f((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f262364h), 31, this.i), 31, this.f262365j), 31, this.k), 31, this.f262366l);
    }
}
