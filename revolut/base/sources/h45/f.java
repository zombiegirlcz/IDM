package h45;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x35.h f149316a;

    public f(x35.h iban) {
        Intrinsics.checkNotNullParameter(iban, "iban");
        this.f149316a = iban;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f149316a, ((f) obj2).f149316a);
    }

    public final int hashCode() {
        return this.f149316a.f302658a.hashCode();
    }
}
