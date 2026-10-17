package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f222045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f222046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222047c;

    public /* synthetic */ f(long j2, long j3, int i, String str) {
        if (7 != (i & 7)) {
            qlm.j1.f(d.f222036a.getDescriptor(), i, 7);
            throw null;
        }
        this.f222045a = j2;
        this.f222046b = j3;
        this.f222047c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f222045a == fVar.f222045a && this.f222046b == fVar.f222046b && Intrinsics.f(this.f222047c, fVar.f222047c);
    }

    public final int hashCode() {
        return this.f222047c.hashCode() + a0.d.c(Long.hashCode(this.f222045a) * 31, 31, this.f222046b);
    }

    public f(long j2, long j3, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f222045a = j2;
        this.f222046b = j3;
        this.f222047c = text;
    }
}
