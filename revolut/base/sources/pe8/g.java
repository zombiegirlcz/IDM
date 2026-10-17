package pe8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f235342a;

    public g(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f235342a = exception;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f235342a, ((g) obj2).f235342a);
    }

    @Override // pe8.h
    public final Exception getException() {
        return this.f235342a;
    }

    public final int hashCode() {
        return this.f235342a.hashCode();
    }
}
