package i6e;

import dj0.d;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f158906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158907b;

    static {
        d.Companion.getClass();
        new b(d.d, "");
    }

    public b(d money, String moneyAmountInput) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(moneyAmountInput, "moneyAmountInput");
        this.f158906a = money;
        this.f158907b = moneyAmountInput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f158906a, bVar.f158906a) && Intrinsics.f(this.f158907b, bVar.f158907b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + p.a.c(this.f158906a.hashCode() * 31, 31, this.f158907b);
    }
}
