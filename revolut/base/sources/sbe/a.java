package sbe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f261583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f261584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f261585c;
    public final q d;

    public a(Data transactionsResult, Data authorisation, q qVar, p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        Intrinsics.checkNotNullParameter(authorisation, "authorisation");
        this.f261583a = subscription;
        this.f261584b = transactionsResult;
        this.f261585c = authorisation;
        this.d = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f261583a, aVar.f261583a) && Intrinsics.f(this.f261584b, aVar.f261584b) && Intrinsics.f(this.f261585c, aVar.f261585c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = e.c(this.f261585c, e.c(this.f261584b, this.f261583a.hashCode() * 31, 31), 31);
        q qVar = this.d;
        return iC + (qVar == null ? 0 : qVar.hashCode());
    }
}
