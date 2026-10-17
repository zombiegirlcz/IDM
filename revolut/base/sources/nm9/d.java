package nm9;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f217217a;

    public d(Set recipients) {
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        this.f217217a = recipients;
    }

    @Override // nm9.f
    public final Set a() {
        return this.f217217a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f217217a, ((d) obj2).f217217a);
    }

    public final int hashCode() {
        return this.f217217a.hashCode();
    }
}
