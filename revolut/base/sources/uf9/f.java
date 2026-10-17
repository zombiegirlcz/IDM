package uf9;

import cli.j;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f279633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f279634b;

    public f() {
        this(0);
    }

    public static f a(f fVar, Biller biller, String accountNumber, int i) {
        if ((i & 1) != 0) {
            biller = fVar.f279633a;
        }
        if ((i & 2) != 0) {
            accountNumber = fVar.f279634b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new f(biller, accountNumber);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f279633a, fVar.f279633a) && Intrinsics.f(this.f279634b, fVar.f279634b);
    }

    public final int hashCode() {
        Biller biller = this.f279633a;
        return this.f279634b.hashCode() + ((biller == null ? 0 : biller.hashCode()) * 31);
    }

    public f(Biller biller, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.f279633a = biller;
        this.f279634b = accountNumber;
    }

    public /* synthetic */ f(int i) {
        this(null, "");
    }
}
