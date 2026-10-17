package xbe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f304061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f304062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f304063c;

    public a(p subscription, Data transactionsResult, q qVar) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        this.f304061a = subscription;
        this.f304062b = transactionsResult;
        this.f304063c = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f304061a, aVar.f304061a) && Intrinsics.f(this.f304062b, aVar.f304062b) && Intrinsics.f(this.f304063c, aVar.f304063c);
    }

    public final int hashCode() {
        int iC = e.c(this.f304062b, this.f304061a.hashCode() * 31, 31);
        q qVar = this.f304063c;
        return iC + (qVar == null ? 0 : qVar.hashCode());
    }
}
