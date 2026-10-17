package n0c;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f210981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f210982b;

    public h(Data revPointsTransactionDetailContent, List list) {
        Intrinsics.checkNotNullParameter(revPointsTransactionDetailContent, "revPointsTransactionDetailContent");
        this.f210981a = revPointsTransactionDetailContent;
        this.f210982b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f210981a, hVar.f210981a) && Intrinsics.f(this.f210982b, hVar.f210982b);
    }

    public final int hashCode() {
        int iHashCode = this.f210981a.hashCode() * 31;
        List list = this.f210982b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
