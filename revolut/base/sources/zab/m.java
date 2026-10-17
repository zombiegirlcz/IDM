package zab;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f320616b;

    public m(String scope, String smsCode) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(smsCode, "smsCode");
        this.f320615a = scope;
        this.f320616b = smsCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f320615a, mVar.f320615a) && Intrinsics.f(this.f320616b, mVar.f320616b);
    }

    public final int hashCode() {
        return this.f320616b.hashCode() + (this.f320615a.hashCode() * 31);
    }
}
