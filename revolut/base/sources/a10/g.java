package a10;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes16.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f454c;
    public final a d;

    public g(LocalDate dateOfBirth, LocalDate cardExpiryYear, String securityCode, a dateType) {
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(cardExpiryYear, "cardExpiryYear");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        Intrinsics.checkNotNullParameter(dateType, "dateType");
        this.f452a = dateOfBirth;
        this.f453b = cardExpiryYear;
        this.f454c = securityCode;
        this.d = dateType;
    }

    @Override // xv.q
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f452a, gVar.f452a) && Intrinsics.f(this.f453b, gVar.f453b) && Intrinsics.f(this.f454c, gVar.f454c) && this.d == gVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(y.a(this.f452a.hashCode() * 31, 31, this.f453b), 31, this.f454c);
    }
}
