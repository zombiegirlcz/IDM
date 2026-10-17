package jh3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import zg3.r;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements hh3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f174140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f174141b;

    public b(r transactionsBlock, Data transactionsData) {
        Intrinsics.checkNotNullParameter(transactionsBlock, "transactionsBlock");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        this.f174140a = transactionsBlock;
        this.f174141b = transactionsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f174140a, bVar.f174140a) && Intrinsics.f(this.f174141b, bVar.f174141b);
    }

    public final int hashCode() {
        return this.f174141b.hashCode() + (this.f174140a.hashCode() * 31);
    }
}
