package kg2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183911a;

    public j(String amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f183911a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f183911a, ((j) obj2).f183911a);
    }

    public final int hashCode() {
        return this.f183911a.hashCode();
    }
}
