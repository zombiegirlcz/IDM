package qbd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f244201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f244202c;

    public /* synthetic */ q(int i, String str, String str2, long j2) {
        if (7 != (i & 7)) {
            j1.f(o.f244199a.getDescriptor(), i, 7);
            throw null;
        }
        this.f244200a = str;
        this.f244201b = j2;
        this.f244202c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f244200a, qVar.f244200a) && this.f244201b == qVar.f244201b && Intrinsics.f(this.f244202c, qVar.f244202c);
    }

    public final int hashCode() {
        return this.f244202c.hashCode() + a0.d.c(this.f244200a.hashCode() * 31, 31, this.f244201b);
    }

    public q(String period, long j2, String explanationDeeplink) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(explanationDeeplink, "explanationDeeplink");
        this.f244200a = period;
        this.f244201b = j2;
        this.f244202c = explanationDeeplink;
    }
}
