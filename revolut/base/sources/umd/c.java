package umd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f281286a;

    public c(Data budgetData) {
        Intrinsics.checkNotNullParameter(budgetData, "budgetData");
        this.f281286a = budgetData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f281286a, ((c) obj2).f281286a);
    }

    public final int hashCode() {
        return this.f281286a.hashCode();
    }
}
