package yk5;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f314572a;

    public c(ArrayList breakdown) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f314572a = breakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f314572a.equals(((c) obj2).f314572a);
    }

    public final int hashCode() {
        return this.f314572a.hashCode();
    }
}
