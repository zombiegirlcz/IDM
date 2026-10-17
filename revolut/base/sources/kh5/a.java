package kh5;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f184065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f184066b;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f184065a, aVar.f184065a) && Intrinsics.f(this.f184066b, aVar.f184066b);
    }

    public final int hashCode() {
        return this.f184066b.hashCode() + (this.f184065a.hashCode() * 31);
    }

    public a(Data lockedBalances, Data rates) {
        Intrinsics.checkNotNullParameter(lockedBalances, "lockedBalances");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f184065a = lockedBalances;
        this.f184066b = rates;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
