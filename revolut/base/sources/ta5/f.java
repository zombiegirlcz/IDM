package ta5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f269105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269106b;

    public /* synthetic */ f(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(d.f269104a.getDescriptor(), i, 3);
            throw null;
        }
        this.f269105a = j2;
        this.f269106b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f269105a == fVar.f269105a && Intrinsics.f(this.f269106b, fVar.f269106b);
    }

    public final int hashCode() {
        return this.f269106b.hashCode() + (Long.hashCode(this.f269105a) * 31);
    }

    public f(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f269105a = j2;
        this.f269106b = currency;
    }
}
