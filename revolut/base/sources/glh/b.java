package glh;

import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f144692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthDisclaimersContract$Disclaimer$Investment f144693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kel.b f144694c;

    public b(Clause title, WealthDisclaimersContract$Disclaimer$Investment disclaimersData, kel.b cashHolding) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        this.f144692a = title;
        this.f144693b = disclaimersData;
        this.f144694c = cashHolding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f144692a, bVar.f144692a) && Intrinsics.f(this.f144693b, bVar.f144693b) && Intrinsics.f(this.f144694c, bVar.f144694c);
    }

    public final int hashCode() {
        return this.f144694c.hashCode() + ((this.f144693b.hashCode() + (this.f144692a.hashCode() * 31)) * 31);
    }
}
