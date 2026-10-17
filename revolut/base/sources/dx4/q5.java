package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f120729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f120731c;

    public q5(long j2, String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f120729a = j2;
        this.f120730b = text;
        this.f120731c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj2;
        return this.f120729a == q5Var.f120729a && Intrinsics.f(this.f120730b, q5Var.f120730b) && this.f120731c == q5Var.f120731c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120731c) + p.a.c(Long.hashCode(this.f120729a) * 31, 31, this.f120730b);
    }
}
