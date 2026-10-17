package ix0;

import ix0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a1 extends y0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f169210a;

    public a1(z0 cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f169210a = cause;
    }

    public final z0 a() {
        return this.f169210a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a1) && this.f169210a == ((a1) obj2).f169210a;
    }

    public final int hashCode() {
        return this.f169210a.hashCode();
    }
}
