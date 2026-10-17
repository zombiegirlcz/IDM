package w85;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f295585a;

    public d(Data statementDocuments) {
        Intrinsics.checkNotNullParameter(statementDocuments, "statementDocuments");
        this.f295585a = statementDocuments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f295585a, ((d) obj2).f295585a);
    }

    public final int hashCode() {
        return this.f295585a.hashCode();
    }
}
