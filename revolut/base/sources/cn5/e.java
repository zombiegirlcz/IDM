package cn5;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25351a;

    public e(String counterpartyName) {
        Intrinsics.checkNotNullParameter(counterpartyName, "counterpartyName");
        this.f25351a = counterpartyName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f25351a, ((e) obj2).f25351a);
    }

    public final int hashCode() {
        return this.f25351a.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e() {
        this("");
        m70.a.c(t0.f186434a);
    }
}
