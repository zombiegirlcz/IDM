package nv6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f219521a;

    public l() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f219521a, ((l) obj2).f219521a);
    }

    public final int hashCode() {
        return this.f219521a.hashCode();
    }

    public l(Data cashbackDetailsData) {
        Intrinsics.checkNotNullParameter(cashbackDetailsData, "cashbackDetailsData");
        this.f219521a = cashbackDetailsData;
    }

    public /* synthetic */ l(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
