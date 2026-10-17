package wbe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f296135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f296136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f296137c;

    public a(p subscription, Data transactionsResult, q qVar) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        this.f296135a = subscription;
        this.f296136b = transactionsResult;
        this.f296137c = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f296135a, aVar.f296135a) && Intrinsics.f(this.f296136b, aVar.f296136b) && Intrinsics.f(this.f296137c, aVar.f296137c);
    }

    public final int hashCode() {
        int iC = e.c(this.f296136b, this.f296135a.hashCode() * 31, 31);
        q qVar = this.f296137c;
        return iC + (qVar == null ? 0 : qVar.hashCode());
    }
}
