package e78;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f123102a;

    public b(d balance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f123102a = balance;
    }

    @Override // e78.c
    public final d a() {
        return this.f123102a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f123102a, ((b) obj2).f123102a);
    }

    public final int hashCode() {
        return this.f123102a.hashCode();
    }
}
