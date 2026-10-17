package q02;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aef.a f241055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f241056b;

    public a(aef.a state, Instant updatedDate) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        this.f241055a = state;
        this.f241056b = updatedDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f241055a == aVar.f241055a && Intrinsics.f(this.f241056b, aVar.f241056b);
    }

    public final int hashCode() {
        return this.f241056b.hashCode() + (this.f241055a.hashCode() * 31);
    }
}
