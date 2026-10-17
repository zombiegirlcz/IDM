package g2a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139954a;

    public c(String personalisationId) {
        Intrinsics.checkNotNullParameter(personalisationId, "personalisationId");
        this.f139954a = personalisationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f139954a, ((c) obj2).f139954a);
    }

    public final int hashCode() {
        return this.f139954a.hashCode();
    }
}
