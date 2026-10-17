package qq9;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import oq9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f248511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f248512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f248513c;
    public final d d;
    public final qk.d e;
    public final krf.c f;

    public e(o payee, o payer, dj0.d amount, d method, qk.d dVar, krf.c cVar) {
        Intrinsics.checkNotNullParameter(payee, "payee");
        Intrinsics.checkNotNullParameter(payer, "payer");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(method, "method");
        this.f248511a = payee;
        this.f248512b = payer;
        this.f248513c = amount;
        this.d = method;
        this.e = dVar;
        this.f = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f248511a, eVar.f248511a) && Intrinsics.f(this.f248512b, eVar.f248512b) && Intrinsics.f(this.f248513c, eVar.f248513c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + v7.c(m.d(this.f248512b, this.f248511a.hashCode() * 31, 31), 31, this.f248513c)) * 31;
        qk.d dVar = this.e;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        krf.c cVar = this.f;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
