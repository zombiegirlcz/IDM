package rnd;

import com.revolut.feature.subaccount.api.models.Subaccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subaccount f255609a;

    public f(Subaccount subaccount) {
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        this.f255609a = subaccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f255609a, ((f) obj2).f255609a);
    }

    public final int hashCode() {
        return this.f255609a.hashCode();
    }
}
