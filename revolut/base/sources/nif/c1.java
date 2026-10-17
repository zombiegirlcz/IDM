package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215726a;

    public c1(String counterpartyPocketId) {
        Intrinsics.checkNotNullParameter(counterpartyPocketId, "counterpartyPocketId");
        this.f215726a = counterpartyPocketId;
    }

    public final String a() {
        return this.f215726a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c1) && Intrinsics.f(this.f215726a, ((c1) obj2).f215726a);
    }

    public final int hashCode() {
        return this.f215726a.hashCode();
    }
}
