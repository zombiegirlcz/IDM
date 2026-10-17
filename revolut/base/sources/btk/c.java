package btk;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f18625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f18626c;
    public final dj0.d d;

    public c(String instrumentRef, TradingAccount account, ArrayList dataPoints, dj0.d monthlyInvestment) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        Intrinsics.checkNotNullParameter(monthlyInvestment, "monthlyInvestment");
        this.f18624a = instrumentRef;
        this.f18625b = account;
        this.f18626c = dataPoints;
        this.d = monthlyInvestment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f18624a, cVar.f18624a) && Intrinsics.f(this.f18625b, cVar.f18625b) && this.f18626c.equals(cVar.f18626c) && this.d.equals(cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f18626c, prk.o.b(this.f18625b, this.f18624a.hashCode() * 31, 31), 31);
    }
}
