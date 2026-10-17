package d8f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112248a;

    public j(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f112248a = templateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f112248a, ((j) obj2).f112248a);
    }

    public final int hashCode() {
        return this.f112248a.hashCode();
    }
}
