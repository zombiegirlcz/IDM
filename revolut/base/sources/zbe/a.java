package zbe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f320877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f320878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f320879c;

    public a(p subscription, Data transactionsResult, q qVar) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        this.f320877a = subscription;
        this.f320878b = transactionsResult;
        this.f320879c = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f320877a, aVar.f320877a) && Intrinsics.f(this.f320878b, aVar.f320878b) && Intrinsics.f(this.f320879c, aVar.f320879c);
    }

    public final int hashCode() {
        int iC = e.c(this.f320878b, this.f320877a.hashCode() * 31, 31);
        q qVar = this.f320879c;
        return iC + (qVar == null ? 0 : qVar.hashCode());
    }
}
