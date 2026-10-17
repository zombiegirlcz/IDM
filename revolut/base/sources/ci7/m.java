package ci7;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class m implements t {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f24413a;

    public /* synthetic */ m(int i, BigDecimal bigDecimal) {
        if (1 == (i & 1)) {
            this.f24413a = bigDecimal;
        } else {
            j1.f(k.f24412a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f24413a, ((m) obj2).f24413a);
    }

    public final int hashCode() {
        return this.f24413a.hashCode();
    }

    public m(BigDecimal dividendYield) {
        Intrinsics.checkNotNullParameter(dividendYield, "dividendYield");
        this.f24413a = dividendYield;
    }
}
