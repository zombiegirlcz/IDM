package fvl;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f138489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f138490b;

    public c(Set currencies, Set suggestedCurrencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(suggestedCurrencies, "suggestedCurrencies");
        this.f138489a = currencies;
        this.f138490b = suggestedCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f138489a, cVar.f138489a) && Intrinsics.f(this.f138490b, cVar.f138490b);
    }

    public final int hashCode() {
        return this.f138490b.hashCode() + (this.f138489a.hashCode() * 31);
    }
}
