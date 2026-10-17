package o2j;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f221628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f221629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f221630c;
    public final LinkedHashMap d;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f221628a, gVar.f221628a) && Intrinsics.f(this.f221629b, gVar.f221629b) && Intrinsics.f(this.f221630c, gVar.f221630c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r6.b.e(this.f221630c, r6.b.e(this.f221629b, this.f221628a.hashCode() * 31, 31), 31);
    }

    public g(int i) {
        LinkedHashMap jointAccounts = new LinkedHashMap();
        LinkedHashMap jointSubaccounts = new LinkedHashMap();
        LinkedHashMap jointSavings = new LinkedHashMap();
        LinkedHashMap jointInvestments = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(jointAccounts, "jointAccounts");
        Intrinsics.checkNotNullParameter(jointSubaccounts, "jointSubaccounts");
        Intrinsics.checkNotNullParameter(jointSavings, "jointSavings");
        Intrinsics.checkNotNullParameter(jointInvestments, "jointInvestments");
        this.f221628a = jointAccounts;
        this.f221629b = jointSubaccounts;
        this.f221630c = jointSavings;
        this.d = jointInvestments;
    }
}
