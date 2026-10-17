package up9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.payments.bills_chooser.api.navigation.LimitedCurrenciesConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f281920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f281921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f281922c;
    public final xi0.b d;
    public final boolean e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LimitedCurrenciesConfig f281923g;

    public b(Clause title, String name, long j2, xi0.b currency, boolean z, int i, LimitedCurrenciesConfig limitedCurrenciesConfig) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(limitedCurrenciesConfig, "limitedCurrenciesConfig");
        this.f281920a = title;
        this.f281921b = name;
        this.f281922c = j2;
        this.d = currency;
        this.e = z;
        this.f = i;
        this.f281923g = limitedCurrenciesConfig;
    }

    public static b a(b bVar, String str, long j2, xi0.b bVar2, int i, int i2) {
        Clause title = bVar.f281920a;
        if ((i2 & 2) != 0) {
            str = bVar.f281921b;
        }
        String name = str;
        if ((i2 & 4) != 0) {
            j2 = bVar.f281922c;
        }
        long j3 = j2;
        if ((i2 & 8) != 0) {
            bVar2 = bVar.d;
        }
        xi0.b currency = bVar2;
        boolean z = bVar.e;
        if ((i2 & 32) != 0) {
            i = bVar.f;
        }
        LimitedCurrenciesConfig limitedCurrenciesConfig = bVar.f281923g;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(limitedCurrenciesConfig, "limitedCurrenciesConfig");
        return new b(title, name, j3, currency, z, i, limitedCurrenciesConfig);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f281920a, bVar.f281920a) && Intrinsics.f(this.f281921b, bVar.f281921b) && this.f281922c == bVar.f281922c && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && Intrinsics.f(this.f281923g, bVar.f281923g);
    }

    public final int hashCode() {
        return this.f281923g.hashCode() + j6.a.b(this.f, j6.a.c(h30.l.j(this.d, a0.d.c(p.a.c(this.f281920a.hashCode() * 31, 31, this.f281921b), 31, this.f281922c), 31), 31, this.e), 31);
    }
}
