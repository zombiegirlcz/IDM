package m6f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final alc.n f203058a;

    public e(alc.n portfolio) {
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        this.f203058a = portfolio;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f203058a, ((e) obj2).f203058a);
    }

    public final int hashCode() {
        return this.f203058a.hashCode();
    }
}
