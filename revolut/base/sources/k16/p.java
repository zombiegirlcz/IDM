package k16;

import java.math.BigInteger;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f180122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigInteger f180124c;
    public final Instant d;
    public final Instant e;
    public final m f;

    public /* synthetic */ p(int i, j jVar, String str, BigInteger bigInteger, Instant instant, Instant instant2, m mVar) {
        if (63 != (i & 63)) {
            j1.f(n.f180121a.getDescriptor(), i, 63);
            throw null;
        }
        this.f180122a = jVar;
        this.f180123b = str;
        this.f180124c = bigInteger;
        this.d = instant;
        this.e = instant2;
        this.f = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f180122a, pVar.f180122a) && Intrinsics.f(this.f180123b, pVar.f180123b) && Intrinsics.f(this.f180124c, pVar.f180124c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iC = r6.b.c(r6.b.c((this.f180124c.hashCode() + p.a.c(this.f180122a.hashCode() * 31, 31, this.f180123b)) * 31, 31, this.d), 31, this.e);
        m mVar = this.f;
        return iC + (mVar == null ? 0 : mVar.hashCode());
    }
}
