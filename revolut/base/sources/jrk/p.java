package jrk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class p {

    @NotNull
    public static final l Companion = new l();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new jp9.l(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f178070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f178071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f178072c;

    public p(long j2, long j3, ArrayList rates) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f178070a = j2;
        this.f178071b = j3;
        this.f178072c = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f178070a == pVar.f178070a && this.f178071b == pVar.f178071b && Intrinsics.f(this.f178072c, pVar.f178072c);
    }

    public final int hashCode() {
        return this.f178072c.hashCode() + a0.d.c(Long.hashCode(this.f178070a) * 31, 31, this.f178071b);
    }

    public /* synthetic */ p(List list, long j2, long j3, int i) {
        if (7 != (i & 7)) {
            j1.f(k.f178065a.getDescriptor(), i, 7);
            throw null;
        }
        this.f178070a = j2;
        this.f178071b = j3;
        this.f178072c = list;
    }
}
