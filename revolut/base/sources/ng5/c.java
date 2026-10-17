package ng5;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f215116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f215117c;

    public c(String currency, long j2, long j3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f215115a = currency;
        this.f215116b = j2;
        this.f215117c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f215115a, cVar.f215115a) && this.f215116b == cVar.f215116b && this.f215117c == cVar.f215117c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f215117c) + d.c(this.f215115a.hashCode() * 31, 31, this.f215116b);
    }
}
