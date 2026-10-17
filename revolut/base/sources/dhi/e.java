package dhi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wgi.a f114817a;

    public e(wgi.a day) {
        Intrinsics.checkNotNullParameter(day, "day");
        this.f114817a = day;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f114817a == ((e) obj2).f114817a;
    }

    public final int hashCode() {
        return this.f114817a.hashCode();
    }
}
