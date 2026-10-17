package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133710a;

    public l(String subaccountName) {
        Intrinsics.checkNotNullParameter(subaccountName, "subaccountName");
        this.f133710a = subaccountName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f133710a, ((l) obj2).f133710a);
    }

    public final int hashCode() {
        return this.f133710a.hashCode();
    }
}
