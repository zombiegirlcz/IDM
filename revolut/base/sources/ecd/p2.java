package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class p2 {

    @NotNull
    public static final o2 Companion = new o2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124645b;

    public /* synthetic */ p2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(n2.f124624a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124644a = str;
        this.f124645b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.f124644a, p2Var.f124644a) && Intrinsics.f(this.f124645b, p2Var.f124645b);
    }

    public final int hashCode() {
        return this.f124645b.hashCode() + (this.f124644a.hashCode() * 31);
    }

    public p2(String currency, String value) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f124644a = currency;
        this.f124645b = value;
    }
}
