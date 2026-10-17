package eel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f125217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f125218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f125219c;

    public a(List candlesSticks, long j2, long j3) {
        Intrinsics.checkNotNullParameter(candlesSticks, "candlesSticks");
        this.f125217a = j2;
        this.f125218b = j3;
        this.f125219c = candlesSticks;
    }

    public static a a(a aVar, long j2, ArrayList candlesSticks, int i) {
        if ((i & 1) != 0) {
            j2 = aVar.f125217a;
        }
        long j3 = aVar.f125218b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(candlesSticks, "candlesSticks");
        return new a(candlesSticks, j2, j3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f125217a == aVar.f125217a && this.f125218b == aVar.f125218b && Intrinsics.f(this.f125219c, aVar.f125219c);
    }

    public final int hashCode() {
        return this.f125219c.hashCode() + a0.d.c(Long.hashCode(this.f125217a) * 31, 31, this.f125218b);
    }
}
