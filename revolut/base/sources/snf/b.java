package snf;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f264571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f264572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f264573c;
    public final a0 d;
    public final w e;

    public b(u accountType, f0 wallet, NaviCommand naviCommand, a0 a0Var, w visibility) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f264571a = accountType;
        this.f264572b = wallet;
        this.f264573c = naviCommand;
        this.d = a0Var;
        this.e = visibility;
    }

    public final String a() {
        StringBuilder sb6 = new StringBuilder("AccountInfo(accountType=");
        sb6.append(this.f264571a.a());
        sb6.append(", wallet=");
        sb6.append(this.f264572b.a());
        sb6.append(", navigation=");
        String str = null;
        NaviCommand naviCommand = this.f264573c;
        sb6.append(naviCommand != null ? naviCommand.getClass().getSimpleName() : null);
        sb6.append(", countryProfile=");
        a0 a0Var = this.d;
        if (a0Var != null) {
            str = "CountryProfile(countryCode=" + a0Var.f264569a.f297794a + ", isSelected=" + a0Var.f264570b + ")";
        }
        sb6.append(str);
        sb6.append(", hidden=");
        sb6.append(this.e);
        sb6.append(")");
        return sb6.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f264571a, bVar.f264571a) && Intrinsics.f(this.f264572b, bVar.f264572b) && Intrinsics.f(this.f264573c, bVar.f264573c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f264572b.hashCode() + (this.f264571a.hashCode() * 31)) * 31;
        NaviCommand naviCommand = this.f264573c;
        int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        a0 a0Var = this.d;
        return this.e.hashCode() + ((iHashCode2 + (a0Var != null ? a0Var.hashCode() : 0)) * 31);
    }
}
