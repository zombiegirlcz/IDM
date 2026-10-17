package hbe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f150649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f150650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f150651c;

    public a(p subscription, Data transactionsResult, q qVar) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        this.f150649a = subscription;
        this.f150650b = transactionsResult;
        this.f150651c = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f150649a, aVar.f150649a) && Intrinsics.f(this.f150650b, aVar.f150650b) && Intrinsics.f(this.f150651c, aVar.f150651c);
    }

    public final int hashCode() {
        int iC = e.c(this.f150650b, this.f150649a.hashCode() * 31, 31);
        q qVar = this.f150651c;
        return iC + (qVar == null ? 0 : qVar.hashCode());
    }
}
