package q1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f241442a;

    public b(a dateTimeFormat) {
        Intrinsics.checkNotNullParameter(dateTimeFormat, "dateTimeFormat");
        this.f241442a = dateTimeFormat;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f241442a == ((b) obj2).f241442a;
    }

    public final int hashCode() {
        return this.f241442a.hashCode();
    }
}
