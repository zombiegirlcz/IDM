package hce;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f150883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f150884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f150885c;

    public b(p subscription, Data transactionsResult, q qVar) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        this.f150883a = subscription;
        this.f150884b = transactionsResult;
        this.f150885c = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f150883a, bVar.f150883a) && Intrinsics.f(this.f150884b, bVar.f150884b) && Intrinsics.f(this.f150885c, bVar.f150885c);
    }

    public final int hashCode() {
        int iC = e.c(this.f150884b, this.f150883a.hashCode() * 31, 31);
        q qVar = this.f150885c;
        return iC + (qVar == null ? 0 : qVar.hashCode());
    }
}
