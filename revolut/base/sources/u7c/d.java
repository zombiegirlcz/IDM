package u7c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f277733a;

    public d(c errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f277733a = errorCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f277733a == ((d) obj2).f277733a;
    }

    public final int hashCode() {
        return this.f277733a.hashCode();
    }
}
