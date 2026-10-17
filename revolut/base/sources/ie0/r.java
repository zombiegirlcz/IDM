package ie0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f160618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160619b;

    public /* synthetic */ r(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(p.f160617a.getDescriptor(), i, 3);
            throw null;
        }
        this.f160618a = j2;
        this.f160619b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f160618a == rVar.f160618a && Intrinsics.f(this.f160619b, rVar.f160619b);
    }

    public final int hashCode() {
        return this.f160619b.hashCode() + (Long.hashCode(this.f160618a) * 31);
    }

    public r(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f160618a = j2;
        this.f160619b = currency;
    }
}
