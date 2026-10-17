package cbe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f22781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f22782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f22783c;

    public a(p subscription, Data transactionsResult, q qVar) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        this.f22781a = subscription;
        this.f22782b = transactionsResult;
        this.f22783c = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f22781a, aVar.f22781a) && Intrinsics.f(this.f22782b, aVar.f22782b) && Intrinsics.f(this.f22783c, aVar.f22783c);
    }

    public final int hashCode() {
        int iC = e.c(this.f22782b, this.f22781a.hashCode() * 31, 31);
        q qVar = this.f22783c;
        return iC + (qVar == null ? 0 : qVar.hashCode());
    }
}
