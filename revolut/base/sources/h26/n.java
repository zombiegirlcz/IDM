package h26;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148733b;

    public /* synthetic */ n(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(l.f148731a.getDescriptor(), i, 3);
            throw null;
        }
        this.f148732a = str;
        this.f148733b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f148732a, nVar.f148732a) && Intrinsics.f(this.f148733b, nVar.f148733b);
    }

    public final int hashCode() {
        return this.f148733b.hashCode() + (this.f148732a.hashCode() * 31);
    }

    public n(String amount, String currency) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f148732a = amount;
        this.f148733b = currency;
    }
}
