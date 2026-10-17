package yb2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f312163b;

    public e(dj0.d amount, String storedMethodId) {
        Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f312162a = storedMethodId;
        this.f312163b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f312162a, eVar.f312162a) && Intrinsics.f(this.f312163b, eVar.f312163b);
    }

    public final int hashCode() {
        return this.f312163b.hashCode() + (this.f312162a.hashCode() * 31);
    }
}
