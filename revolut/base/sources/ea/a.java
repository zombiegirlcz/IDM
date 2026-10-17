package ea;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124041a;

    public a(String stepId) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        this.f124041a = stepId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f124041a, ((a) obj2).f124041a);
    }

    public final int hashCode() {
        return this.f124041a.hashCode();
    }

    public final String toString() {
        return p.a.p("NavigationHubDescriptor(stepId=", this.f124041a, ")");
    }
}
