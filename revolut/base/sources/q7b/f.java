package q7b;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f242796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f242797b;

    public f(Data transactionsTabData, Data transactionsData) {
        Intrinsics.checkNotNullParameter(transactionsTabData, "transactionsTabData");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        this.f242796a = transactionsTabData;
        this.f242797b = transactionsData;
    }

    public static f a(f fVar, Data transactionsTabData, Data transactionsData, int i) {
        if ((i & 1) != 0) {
            transactionsTabData = fVar.f242796a;
        }
        if ((i & 2) != 0) {
            transactionsData = fVar.f242797b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(transactionsTabData, "transactionsTabData");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        return new f(transactionsTabData, transactionsData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f242796a, fVar.f242796a) && Intrinsics.f(this.f242797b, fVar.f242797b);
    }

    public final int hashCode() {
        return this.f242797b.hashCode() + (this.f242796a.hashCode() * 31);
    }
}
