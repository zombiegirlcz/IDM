package iqg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f167838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f167839b;

    public g(Data data, Integer num) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f167838a = data;
        this.f167839b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f167838a, gVar.f167838a) && Intrinsics.f(this.f167839b, gVar.f167839b);
    }

    public final int hashCode() {
        int iHashCode = this.f167838a.hashCode() * 31;
        Integer num = this.f167839b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
