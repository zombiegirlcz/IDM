package ym5;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314861a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f314861a, ((e) obj2).f314861a);
    }

    public final int hashCode() {
        return this.f314861a.hashCode();
    }

    public e(String legalEntityId) {
        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
        this.f314861a = legalEntityId;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i) {
        this("");
        m70.a.c(t0.f186434a);
    }
}
