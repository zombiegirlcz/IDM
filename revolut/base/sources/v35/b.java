package v35;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import x35.e;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f285853a;

    public b(e account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f285853a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f285853a, ((b) obj2).f285853a);
    }

    public final int hashCode() {
        return this.f285853a.hashCode();
    }
}
