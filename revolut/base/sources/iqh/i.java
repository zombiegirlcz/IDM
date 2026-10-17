package iqh;

import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerFilter$Options f167858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f167859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f167860c;

    public i(ScreenerFilter$Options filter, Set selectedOptions, Set initialOptions) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        Intrinsics.checkNotNullParameter(initialOptions, "initialOptions");
        this.f167858a = filter;
        this.f167859b = selectedOptions;
        this.f167860c = initialOptions;
    }

    public static i a(i iVar, Set selectedOptions) {
        ScreenerFilter$Options filter = iVar.f167858a;
        Set initialOptions = iVar.f167860c;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        Intrinsics.checkNotNullParameter(initialOptions, "initialOptions");
        return new i(filter, selectedOptions, initialOptions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f167858a, iVar.f167858a) && Intrinsics.f(this.f167859b, iVar.f167859b) && Intrinsics.f(this.f167860c, iVar.f167860c);
    }

    public final int hashCode() {
        return this.f167860c.hashCode() + p.a.f(this.f167858a.hashCode() * 31, 31, this.f167859b);
    }
}
