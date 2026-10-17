package m1b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f201327a;

    public a(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f201327a = exception;
    }

    public final Exception a() {
        return this.f201327a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f201327a, ((a) obj2).f201327a);
    }

    public final int hashCode() {
        return this.f201327a.hashCode();
    }
}
