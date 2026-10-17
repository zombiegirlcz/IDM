package crd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f108350a;

    public a(Data spendingCycle) {
        Intrinsics.checkNotNullParameter(spendingCycle, "spendingCycle");
        this.f108350a = spendingCycle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f108350a, ((a) obj2).f108350a);
    }

    public final int hashCode() {
        return this.f108350a.hashCode();
    }
}
