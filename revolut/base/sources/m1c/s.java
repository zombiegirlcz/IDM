package m1c;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f201451a;

    public s(ArrayList termsToAccept) {
        Intrinsics.checkNotNullParameter(termsToAccept, "termsToAccept");
        this.f201451a = termsToAccept;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f201451a.equals(((s) obj2).f201451a);
    }

    public final int hashCode() {
        return this.f201451a.hashCode();
    }
}
