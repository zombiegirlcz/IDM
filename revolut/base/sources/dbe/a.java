package dbe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f112735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f112736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f112737c;

    public a(p subscription, Data transactionsResult, q qVar) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        this.f112735a = subscription;
        this.f112736b = transactionsResult;
        this.f112737c = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f112735a, aVar.f112735a) && Intrinsics.f(this.f112736b, aVar.f112736b) && Intrinsics.f(this.f112737c, aVar.f112737c);
    }

    public final int hashCode() {
        int iC = e.c(this.f112736b, this.f112735a.hashCode() * 31, 31);
        q qVar = this.f112737c;
        return iC + (qVar == null ? 0 : qVar.hashCode());
    }
}
