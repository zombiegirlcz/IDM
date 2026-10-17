package wxe;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f300910a;

    public o() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f300910a, ((o) obj2).f300910a);
    }

    public final int hashCode() {
        return this.f300910a.hashCode();
    }

    public o(Data detailedStoredMethodData) {
        Intrinsics.checkNotNullParameter(detailedStoredMethodData, "detailedStoredMethodData");
        this.f300910a = detailedStoredMethodData;
    }

    public /* synthetic */ o(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
