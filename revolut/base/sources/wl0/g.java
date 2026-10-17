package wl0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f298354c;

    public g(String title, String negativeAction, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(negativeAction, "negativeAction");
        this.f298352a = title;
        this.f298353b = negativeAction;
        this.f298354c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f298352a, gVar.f298352a) && Intrinsics.f(this.f298353b, gVar.f298353b) && this.f298354c == gVar.f298354c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f298354c) + p.a.c(this.f298352a.hashCode() * 31, 31, this.f298353b);
    }
}
