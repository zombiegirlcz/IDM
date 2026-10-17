package kbe;

import com.revolut.data.model.Data;
import ip0.v7;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tua.a f182574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f182575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f182576c;
    public final Data d;
    public final q e;
    public final boolean f;

    public a(tua.a type, dj0.d amount, p subscription, Data transactionsResult, q qVar, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        this.f182574a = type;
        this.f182575b = amount;
        this.f182576c = subscription;
        this.d = transactionsResult;
        this.e = qVar;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f182574a == aVar.f182574a && Intrinsics.f(this.f182575b, aVar.f182575b) && Intrinsics.f(this.f182576c, aVar.f182576c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        int iC = e.c(this.d, (this.f182576c.hashCode() + v7.c(this.f182574a.hashCode() * 31, 31, this.f182575b)) * 31, 31);
        q qVar = this.e;
        return Boolean.hashCode(this.f) + ((iC + (qVar == null ? 0 : qVar.hashCode())) * 31);
    }
}
