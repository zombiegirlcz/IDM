package noc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217975a;

    public b(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f217975a = templateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f217975a, ((b) obj2).f217975a);
    }

    public final int hashCode() {
        return this.f217975a.hashCode();
    }
}
