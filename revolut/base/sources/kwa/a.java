package kwa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190313a;

    public a(String enteredCode) {
        Intrinsics.checkNotNullParameter(enteredCode, "enteredCode");
        this.f190313a = enteredCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f190313a, ((a) obj2).f190313a);
    }

    public final int hashCode() {
        return this.f190313a.hashCode();
    }
}
