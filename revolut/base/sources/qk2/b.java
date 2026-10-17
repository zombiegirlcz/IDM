package qk2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f246951a;

    public b(Data exceptionalLimitEligibility) {
        Intrinsics.checkNotNullParameter(exceptionalLimitEligibility, "exceptionalLimitEligibility");
        this.f246951a = exceptionalLimitEligibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f246951a, ((b) obj2).f246951a);
    }

    public final int hashCode() {
        return this.f246951a.hashCode();
    }
}
