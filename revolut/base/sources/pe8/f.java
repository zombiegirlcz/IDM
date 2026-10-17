package pe8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f235341a;

    public f(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f235341a = exception;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f235341a, ((f) obj2).f235341a);
    }

    @Override // pe8.h
    public final Exception getException() {
        return this.f235341a;
    }

    public final int hashCode() {
        return this.f235341a.hashCode();
    }
}
