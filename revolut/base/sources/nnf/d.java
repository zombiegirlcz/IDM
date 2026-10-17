package nnf;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f217615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f217616b;

    public d() {
        this(0);
    }

    public static d a(d dVar, Data transaction, Data transactionRecallable, int i) {
        if ((i & 1) != 0) {
            transaction = dVar.f217615a;
        }
        if ((i & 2) != 0) {
            transactionRecallable = dVar.f217616b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionRecallable, "transactionRecallable");
        return new d(transaction, transactionRecallable);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f217615a, dVar.f217615a) && Intrinsics.f(this.f217616b, dVar.f217616b);
    }

    public final int hashCode() {
        return this.f217616b.hashCode() + (this.f217615a.hashCode() * 31);
    }

    public d(Data transaction, Data transactionRecallable) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionRecallable, "transactionRecallable");
        this.f217615a = transaction;
        this.f217616b = transactionRecallable;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
