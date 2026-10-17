package w30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294076a;

    public a0(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f294076a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f294076a, ((a0) obj2).f294076a);
    }

    public final int hashCode() {
        return this.f294076a.hashCode();
    }
}
