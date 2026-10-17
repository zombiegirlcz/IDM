package j8f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172200a;

    public k(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f172200a = templateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f172200a, ((k) obj2).f172200a);
    }

    public final int hashCode() {
        return this.f172200a.hashCode();
    }
}
