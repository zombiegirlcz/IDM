package ps8;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239426a;

    public a(String dapAppUri) {
        Intrinsics.checkNotNullParameter(dapAppUri, "dapAppUri");
        this.f239426a = dapAppUri;
    }

    public final String b() {
        return this.f239426a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f239426a, ((a) obj2).f239426a);
    }

    public final int hashCode() {
        return this.f239426a.hashCode();
    }
}
