package mel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f204761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f204762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f204763c;

    public k(long j2, long j3, ArrayList rates) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f204761a = j2;
        this.f204762b = j3;
        this.f204763c = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f204761a == kVar.f204761a && this.f204762b == kVar.f204762b && this.f204763c.equals(kVar.f204763c);
    }

    public final int hashCode() {
        return this.f204763c.hashCode() + a0.d.c(Long.hashCode(this.f204761a) * 31, 31, this.f204762b);
    }
}
