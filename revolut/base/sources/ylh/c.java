package ylh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f314712a;

    public c(w selectedByDefault) {
        Intrinsics.checkNotNullParameter(selectedByDefault, "selectedByDefault");
        this.f314712a = selectedByDefault;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f314712a == ((c) obj2).f314712a;
    }

    public final int hashCode() {
        return this.f314712a.hashCode();
    }
}
