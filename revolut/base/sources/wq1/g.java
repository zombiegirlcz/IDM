package wq1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mq1.a f299388c;
    public final String d;

    public g() {
        this(0);
    }

    public static g a(g gVar, String noticeNumber, String fiscalCode, mq1.a aVar, String licencePlate, int i) {
        if ((i & 1) != 0) {
            noticeNumber = gVar.f299386a;
        }
        if ((i & 2) != 0) {
            fiscalCode = gVar.f299387b;
        }
        if ((i & 4) != 0) {
            aVar = gVar.f299388c;
        }
        if ((i & 8) != 0) {
            licencePlate = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(noticeNumber, "noticeNumber");
        Intrinsics.checkNotNullParameter(fiscalCode, "fiscalCode");
        Intrinsics.checkNotNullParameter(licencePlate, "licencePlate");
        return new g(noticeNumber, fiscalCode, aVar, licencePlate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f299386a, gVar.f299386a) && Intrinsics.f(this.f299387b, gVar.f299387b) && this.f299388c == gVar.f299388c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f299386a.hashCode() * 31, 31, this.f299387b);
        mq1.a aVar = this.f299388c;
        return this.d.hashCode() + ((iC + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public g(String noticeNumber, String fiscalCode, mq1.a aVar, String licencePlate) {
        Intrinsics.checkNotNullParameter(noticeNumber, "noticeNumber");
        Intrinsics.checkNotNullParameter(fiscalCode, "fiscalCode");
        Intrinsics.checkNotNullParameter(licencePlate, "licencePlate");
        this.f299386a = noticeNumber;
        this.f299387b = fiscalCode;
        this.f299388c = aVar;
        this.d = licencePlate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i) {
        this("", "", null, "");
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        m70.a.c(t0Var);
        m70.a.c(t0Var);
    }
}
