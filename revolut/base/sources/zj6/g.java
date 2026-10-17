package zj6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f322764a;

    public g(Data linkedAccountsGroupData) {
        Intrinsics.checkNotNullParameter(linkedAccountsGroupData, "linkedAccountsGroupData");
        this.f322764a = linkedAccountsGroupData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f322764a, ((g) obj2).f322764a);
    }

    public final int hashCode() {
        return this.f322764a.hashCode();
    }
}
