package bo8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xc8.c f17319a;

    public j(xc8.c consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        this.f17319a = consent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f17319a, ((j) obj2).f17319a);
    }

    public final int hashCode() {
        return this.f17319a.hashCode();
    }
}
