package mbe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f204201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f204202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f204203c;

    public a(p subscription, Data transactionsResult, q qVar) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        this.f204201a = subscription;
        this.f204202b = transactionsResult;
        this.f204203c = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f204201a, aVar.f204201a) && Intrinsics.f(this.f204202b, aVar.f204202b) && Intrinsics.f(this.f204203c, aVar.f204203c);
    }

    public final int hashCode() {
        int iC = e.c(this.f204202b, this.f204201a.hashCode() * 31, 31);
        q qVar = this.f204203c;
        return iC + (qVar == null ? 0 : qVar.hashCode());
    }
}
