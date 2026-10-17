package lbj;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f193696a;

    public d(ArrayList breakdown) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f193696a = breakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f193696a.equals(((d) obj2).f193696a);
    }

    public final int hashCode() {
        return this.f193696a.hashCode();
    }
}
