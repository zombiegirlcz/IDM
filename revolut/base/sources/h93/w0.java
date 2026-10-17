package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w0 extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150168a;

    public w0(String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f150168a = pin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w0) && Intrinsics.f(this.f150168a, ((w0) obj2).f150168a);
    }

    public final int hashCode() {
        return this.f150168a.hashCode();
    }
}
