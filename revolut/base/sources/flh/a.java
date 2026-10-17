package flh;

import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f135988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qih.a f135989c;

    public a(Clause title, List cashHoldings, qih.a cashDisplayAmountType) {
        Intrinsics.checkNotNullParameter(cashHoldings, "cashHoldings");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cashDisplayAmountType, "cashDisplayAmountType");
        this.f135987a = cashHoldings;
        this.f135988b = title;
        this.f135989c = cashDisplayAmountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f135987a, aVar.f135987a) && Intrinsics.f(this.f135988b, aVar.f135988b) && this.f135989c == aVar.f135989c;
    }

    public final int hashCode() {
        return this.f135989c.hashCode() + p.a.a(this.f135987a.hashCode() * 31, 31, this.f135988b);
    }
}
