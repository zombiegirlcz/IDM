package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v20.i1 f181263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f181264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181265c;

    public v4(v20.i1 message, long j2, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f181263a = message;
        this.f181264b = j2;
        this.f181265c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj2;
        return Intrinsics.f(this.f181263a, v4Var.f181263a) && this.f181264b == v4Var.f181264b && Intrinsics.f(this.f181265c, v4Var.f181265c);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f181263a.hashCode() * 31, 31, this.f181264b);
        String str = this.f181265c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
