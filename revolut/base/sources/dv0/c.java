package dv0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f118016c;

    public c(int i, int i2, a dayPeriod) {
        Intrinsics.checkNotNullParameter(dayPeriod, "dayPeriod");
        this.f118014a = i;
        this.f118015b = i2;
        this.f118016c = dayPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f118014a == cVar.f118014a && this.f118015b == cVar.f118015b && this.f118016c == cVar.f118016c;
    }

    public final int hashCode() {
        return this.f118016c.hashCode() + j6.a.b(this.f118015b, Integer.hashCode(this.f118014a) * 31, 31);
    }
}
