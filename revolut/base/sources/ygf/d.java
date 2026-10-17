package ygf;

import com.revolut.data.model.Data;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f313648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f313649b;

    public d(Data recurringPaymentsContent, q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(recurringPaymentsContent, "recurringPaymentsContent");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f313648a = recurringPaymentsContent;
        this.f313649b = transactionsExtraData;
    }

    public static d a(d dVar, Data recurringPaymentsContent, q transactionsExtraData, int i) {
        if ((i & 1) != 0) {
            recurringPaymentsContent = dVar.f313648a;
        }
        if ((i & 2) != 0) {
            transactionsExtraData = dVar.f313649b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(recurringPaymentsContent, "recurringPaymentsContent");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        return new d(recurringPaymentsContent, transactionsExtraData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f313648a, dVar.f313648a) && Intrinsics.f(this.f313649b, dVar.f313649b);
    }

    public final int hashCode() {
        return this.f313649b.hashCode() + (this.f313648a.hashCode() * 31);
    }
}
