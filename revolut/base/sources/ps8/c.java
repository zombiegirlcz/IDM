package ps8;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239428a;

    public c(String dapAppUri) {
        Intrinsics.checkNotNullParameter(dapAppUri, "dapAppUri");
        this.f239428a = dapAppUri;
    }

    public final String b() {
        return this.f239428a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f239428a, ((c) obj2).f239428a);
    }

    public final int hashCode() {
        return this.f239428a.hashCode();
    }
}
