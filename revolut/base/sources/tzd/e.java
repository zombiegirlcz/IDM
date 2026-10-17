package tzd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ayd.a f275925a;

    public e(ayd.a cryptoStatementType) {
        Intrinsics.checkNotNullParameter(cryptoStatementType, "cryptoStatementType");
        this.f275925a = cryptoStatementType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f275925a == ((e) obj2).f275925a;
    }

    public final int hashCode() {
        return this.f275925a.hashCode();
    }
}
