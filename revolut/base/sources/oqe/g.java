package oqe;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f227890a;

    public g(Data teenProfile) {
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        this.f227890a = teenProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f227890a, ((g) obj2).f227890a);
    }

    public final int hashCode() {
        return this.f227890a.hashCode();
    }
}
