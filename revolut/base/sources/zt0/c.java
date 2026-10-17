package zt0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f325004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f325005c;

    public c(String title, List fractions, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fractions, "fractions");
        this.f325003a = title;
        this.f325004b = fractions;
        this.f325005c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f325003a, cVar.f325003a) && Intrinsics.f(this.f325004b, cVar.f325004b) && this.f325005c == cVar.f325005c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f325005c) + p.a.d(this.f325003a.hashCode() * 29791, 31, this.f325004b);
    }
}
