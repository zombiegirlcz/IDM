package jgg;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f174040a;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f174040a, ((b) obj2).f174040a);
    }

    public final int hashCode() {
        return this.f174040a.hashCode();
    }

    public b(Data revPointsAccountStatus) {
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        this.f174040a = revPointsAccountStatus;
    }

    public /* synthetic */ b(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
