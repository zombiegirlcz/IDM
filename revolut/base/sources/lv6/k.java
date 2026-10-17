package lv6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f200329a;

    public k(Data cashbackBoosterDetails) {
        Intrinsics.checkNotNullParameter(cashbackBoosterDetails, "cashbackBoosterDetails");
        this.f200329a = cashbackBoosterDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f200329a, ((k) obj2).f200329a);
    }

    public final int hashCode() {
        return this.f200329a.hashCode();
    }
}
