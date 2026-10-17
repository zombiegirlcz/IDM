package mek;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f204702c;
    public final h d;
    public final LocalDate e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f204703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f204704h;

    public g(String firstName, String lastName, String email, h emailValidationResult, LocalDate localDate, boolean z, f buttonState, String idempotencyKey) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(emailValidationResult, "emailValidationResult");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f204700a = firstName;
        this.f204701b = lastName;
        this.f204702c = email;
        this.d = emailValidationResult;
        this.e = localDate;
        this.f = z;
        this.f204703g = buttonState;
        this.f204704h = idempotencyKey;
    }

    public static g a(g gVar, String str, String str2, String str3, h hVar, LocalDate localDate, boolean z, f fVar, int i) {
        if ((i & 1) != 0) {
            str = gVar.f204700a;
        }
        String firstName = str;
        if ((i & 2) != 0) {
            str2 = gVar.f204701b;
        }
        String lastName = str2;
        if ((i & 4) != 0) {
            str3 = gVar.f204702c;
        }
        String email = str3;
        if ((i & 8) != 0) {
            hVar = gVar.d;
        }
        h emailValidationResult = hVar;
        if ((i & 16) != 0) {
            localDate = gVar.e;
        }
        LocalDate localDate2 = localDate;
        if ((i & 32) != 0) {
            z = gVar.f;
        }
        boolean z3 = z;
        f buttonState = (i & 64) != 0 ? gVar.f204703g : fVar;
        String idempotencyKey = gVar.f204704h;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(emailValidationResult, "emailValidationResult");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        return new g(firstName, lastName, email, emailValidationResult, localDate2, z3, buttonState, idempotencyKey);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f204700a, gVar.f204700a) && Intrinsics.f(this.f204701b, gVar.f204701b) && Intrinsics.f(this.f204702c, gVar.f204702c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && Intrinsics.f(this.f204703g, gVar.f204703g) && Intrinsics.f(this.f204704h, gVar.f204704h);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f204700a.hashCode() * 31, 31, this.f204701b), 31, this.f204702c)) * 31;
        LocalDate localDate = this.e;
        return this.f204704h.hashCode() + j6.a.c(j6.a.c((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.f), 31, this.f204703g.f204699a);
    }
}
