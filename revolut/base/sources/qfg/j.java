package qfg;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f245336c;
    public final jo3.b d;
    public final i e;

    public j(String accountId, String currency, double d, jo3.b fee2, i display) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(display, "display");
        this.f245334a = accountId;
        this.f245335b = currency;
        this.f245336c = d;
        this.d = fee2;
        this.e = display;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f245334a, jVar.f245334a) && Intrinsics.f(this.f245335b, jVar.f245335b) && Double.compare(this.f245336c, jVar.f245336c) == 0 && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + y.e(this.d, m72.b.c(p.a.c(this.f245334a.hashCode() * 31, 31, this.f245335b), this.f245336c, 31), 31);
    }
}
