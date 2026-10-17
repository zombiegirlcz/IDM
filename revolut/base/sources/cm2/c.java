package cm2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25110a;

    public c(List scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f25110a = scopes;
    }

    public final List b() {
        return this.f25110a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f25110a, ((c) obj2).f25110a);
    }

    public final int hashCode() {
        return this.f25110a.hashCode();
    }
}
