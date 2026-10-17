package l5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192254a;

    public b(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f192254a = templateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f192254a, ((b) obj2).f192254a);
    }

    public final int hashCode() {
        return this.f192254a.hashCode();
    }
}
