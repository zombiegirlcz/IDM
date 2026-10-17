package t61;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268136c;

    public f(String statusTitle, String summary, String message) {
        Intrinsics.checkNotNullParameter(statusTitle, "statusTitle");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f268134a = statusTitle;
        this.f268135b = summary;
        this.f268136c = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f268134a, fVar.f268134a) && Intrinsics.f(this.f268135b, fVar.f268135b) && Intrinsics.f(this.f268136c, fVar.f268136c);
    }

    public final int hashCode() {
        return this.f268136c.hashCode() + p.a.c(this.f268134a.hashCode() * 31, 31, this.f268135b);
    }
}
