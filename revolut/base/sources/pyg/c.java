package pyg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240831a;

    public c(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f240831a = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f240831a, ((c) obj2).f240831a);
    }

    public final int hashCode() {
        return this.f240831a.hashCode();
    }
}
