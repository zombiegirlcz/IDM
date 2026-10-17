package j83;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f172106b;

    public f() {
        this(0);
    }

    public static f a(f fVar, List transactionIds, Data transactionsContentData, int i) {
        if ((i & 1) != 0) {
            transactionIds = fVar.f172105a;
        }
        if ((i & 2) != 0) {
            transactionsContentData = fVar.f172106b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(transactionsContentData, "transactionsContentData");
        return new f(transactionsContentData, transactionIds);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f172105a, fVar.f172105a) && Intrinsics.f(this.f172106b, fVar.f172106b);
    }

    public final int hashCode() {
        return this.f172106b.hashCode() + (this.f172105a.hashCode() * 31);
    }

    public f(Data transactionsContentData, List transactionIds) {
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(transactionsContentData, "transactionsContentData");
        this.f172105a = transactionIds;
        this.f172106b = transactionsContentData;
    }

    public f(int i) {
        this(new Data(null, null, true, 3, null), f0.f322471a);
    }
}
