package gh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f143811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f143813c;
    public final boolean d;
    public final f e;
    public final String f;

    public g(d source, int i, boolean z, boolean z3, f errorResolution, String statusCode) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(errorResolution, "errorResolution");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.f143811a = source;
        this.f143812b = i;
        this.f143813c = z;
        this.d = z3;
        this.e = errorResolution;
        this.f = statusCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f143811a == gVar.f143811a && this.f143812b == gVar.f143812b && this.f143813c == gVar.f143813c && this.d == gVar.d && this.e == gVar.e && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + j6.a.c(j6.a.c(j6.a.b(this.f143812b, this.f143811a.hashCode() * 31, 31), 31, this.f143813c), 31, this.d)) * 31);
    }
}
