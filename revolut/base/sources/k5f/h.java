package k5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181504a;

    public h(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f181504a = templateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f181504a, ((h) obj2).f181504a);
    }

    public final int hashCode() {
        return this.f181504a.hashCode();
    }
}
