package p6f;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f233262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f233263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f233264c;
    public final dj0.d d;
    public final ArrayList e;

    public f(long j2, long j3, dj0.d netTopUp, dj0.d totalReturn, ArrayList points) {
        Intrinsics.checkNotNullParameter(netTopUp, "netTopUp");
        Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f233262a = j2;
        this.f233263b = j3;
        this.f233264c = netTopUp;
        this.d = totalReturn;
        this.e = points;
    }

    @Override // p6f.g
    public final List a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f233262a == fVar.f233262a && this.f233263b == fVar.f233263b && Intrinsics.f(this.f233264c, fVar.f233264c) && Intrinsics.f(this.d, fVar.d) && this.e.equals(fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(a0.d.c(Long.hashCode(this.f233262a) * 31, 31, this.f233263b), 31, this.f233264c), 31, this.d);
    }
}
