package djb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ejb.a f115276a;

    public c(ejb.a details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f115276a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f115276a, ((c) obj2).f115276a);
    }

    public final int hashCode() {
        return this.f115276a.hashCode();
    }
}
