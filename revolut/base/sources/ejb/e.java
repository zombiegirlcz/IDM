package ejb;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f126841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f126842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f126843c;
    public final List d;

    public e(dj0.d totalMoneyIn, dj0.d totalMoneyOut, dj0.d totalInterest, List dailyBreakdownItems) {
        Intrinsics.checkNotNullParameter(totalMoneyIn, "totalMoneyIn");
        Intrinsics.checkNotNullParameter(totalMoneyOut, "totalMoneyOut");
        Intrinsics.checkNotNullParameter(totalInterest, "totalInterest");
        Intrinsics.checkNotNullParameter(dailyBreakdownItems, "dailyBreakdownItems");
        this.f126841a = totalMoneyIn;
        this.f126842b = totalMoneyOut;
        this.f126843c = totalInterest;
        this.d = dailyBreakdownItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f126841a, eVar.f126841a) && Intrinsics.f(this.f126842b, eVar.f126842b) && Intrinsics.f(this.f126843c, eVar.f126843c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f126841a.hashCode() * 31, 31, this.f126842b), 31, this.f126843c);
    }
}
