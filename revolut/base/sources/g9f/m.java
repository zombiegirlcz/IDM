package g9f;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f141564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141565b;

    public /* synthetic */ m(int i, String str, BigDecimal bigDecimal) {
        if (3 != (i & 3)) {
            j1.f(k.f141563a.getDescriptor(), i, 3);
            throw null;
        }
        this.f141564a = bigDecimal;
        this.f141565b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f141564a, mVar.f141564a) && Intrinsics.f(this.f141565b, mVar.f141565b);
    }

    public final int hashCode() {
        return this.f141565b.hashCode() + (this.f141564a.hashCode() * 31);
    }

    public m(String currency, BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f141564a = value;
        this.f141565b = currency;
    }
}
