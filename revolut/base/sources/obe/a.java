package obe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f223927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f223928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f223929c;

    public a(p subscription, Data transactionsResult, q qVar) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        this.f223927a = subscription;
        this.f223928b = transactionsResult;
        this.f223929c = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f223927a, aVar.f223927a) && Intrinsics.f(this.f223928b, aVar.f223928b) && Intrinsics.f(this.f223929c, aVar.f223929c);
    }

    public final int hashCode() {
        int iC = e.c(this.f223928b, this.f223927a.hashCode() * 31, 31);
        q qVar = this.f223929c;
        return iC + (qVar == null ? 0 : qVar.hashCode());
    }
}
