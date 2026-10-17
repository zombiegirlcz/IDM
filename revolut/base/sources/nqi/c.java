package nqi;

import dj0.d;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Serializable {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f218470c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f218471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218472b;

    static {
        d.Companion.getClass();
        f218470c = new c(d.d, "");
    }

    public c(d money, String moneyAmountInput) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(moneyAmountInput, "moneyAmountInput");
        this.f218471a = money;
        this.f218472b = moneyAmountInput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f218471a, cVar.f218471a) && Intrinsics.f(this.f218472b, cVar.f218472b);
    }

    public final int hashCode() {
        return this.f218472b.hashCode() + (this.f218471a.hashCode() * 31);
    }
}
