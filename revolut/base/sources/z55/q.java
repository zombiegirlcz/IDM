package z55;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f319502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f319503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f319504c;
    public final Data d;
    public final Data e;
    public final od0.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ja5.a f319505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x35.e f319506h;

    public q(Data loan, Data loanDetails, Data loanPaymentSource, Data loanBackupCard, Data agreements, od0.i refinancingRepresentation, ja5.a aVar, x35.e eVar) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Intrinsics.checkNotNullParameter(loanPaymentSource, "loanPaymentSource");
        Intrinsics.checkNotNullParameter(loanBackupCard, "loanBackupCard");
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        Intrinsics.checkNotNullParameter(refinancingRepresentation, "refinancingRepresentation");
        this.f319502a = loan;
        this.f319503b = loanDetails;
        this.f319504c = loanPaymentSource;
        this.d = loanBackupCard;
        this.e = agreements;
        this.f = refinancingRepresentation;
        this.f319505g = aVar;
        this.f319506h = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f319502a, qVar.f319502a) && Intrinsics.f(this.f319503b, qVar.f319503b) && Intrinsics.f(this.f319504c, qVar.f319504c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f319505g, qVar.f319505g) && Intrinsics.f(this.f319506h, qVar.f319506h);
    }

    public final int hashCode() {
        int iF = r6.b.f(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f319504c, kii.e.c(this.f319503b, this.f319502a.hashCode() * 31, 31), 31), 31), 31), 31);
        ja5.a aVar = this.f319505g;
        int iHashCode = (iF + (aVar == null ? 0 : aVar.f172439a.hashCode())) * 31;
        x35.e eVar = this.f319506h;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }
}
