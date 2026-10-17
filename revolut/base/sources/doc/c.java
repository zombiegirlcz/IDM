package doc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116492a;

    public c(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f116492a = templateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f116492a, ((c) obj2).f116492a);
    }

    public final int hashCode() {
        return this.f116492a.hashCode();
    }
}
