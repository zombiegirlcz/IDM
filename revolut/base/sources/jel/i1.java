package jel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f173476b;

    public i1(String ref2, ArrayList recommendations) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
        this.f173475a = ref2;
        this.f173476b = recommendations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.f173475a, i1Var.f173475a) && this.f173476b.equals(i1Var.f173476b);
    }

    public final int hashCode() {
        return this.f173476b.hashCode() + (this.f173475a.hashCode() * 31);
    }
}
