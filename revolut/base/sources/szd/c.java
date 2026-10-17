package szd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ayd.a f266800a;

    public c(ayd.a cryptoStatementType) {
        Intrinsics.checkNotNullParameter(cryptoStatementType, "cryptoStatementType");
        this.f266800a = cryptoStatementType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f266800a == ((c) obj2).f266800a;
    }

    public final int hashCode() {
        return this.f266800a.hashCode();
    }
}
