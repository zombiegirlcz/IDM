package fb7;

import com.revolut.feature.hidden_accounts.api.domain.HiddenAccountsConfig;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f133482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HiddenAccountsConfig f133483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na7.b f133484c;
    public final boolean d;
    public final Set e;
    public final a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f133485g;

    public j(n data, HiddenAccountsConfig config, na7.b accountType, boolean z, Set selectedAccountIds, a0 a0Var, boolean z3) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(selectedAccountIds, "selectedAccountIds");
        this.f133482a = data;
        this.f133483b = config;
        this.f133484c = accountType;
        this.d = z;
        this.e = selectedAccountIds;
        this.f = a0Var;
        this.f133485g = z3;
    }

    public static j a(j jVar, n nVar, boolean z, Set set, a0 a0Var, boolean z3, int i) {
        if ((i & 1) != 0) {
            nVar = jVar.f133482a;
        }
        n data = nVar;
        HiddenAccountsConfig config = jVar.f133483b;
        na7.b accountType = jVar.f133484c;
        if ((i & 8) != 0) {
            z = jVar.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            set = jVar.e;
        }
        Set selectedAccountIds = set;
        if ((i & 32) != 0) {
            a0Var = jVar.f;
        }
        a0 a0Var2 = a0Var;
        if ((i & 64) != 0) {
            z3 = jVar.f133485g;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(selectedAccountIds, "selectedAccountIds");
        return new j(data, config, accountType, z4, selectedAccountIds, a0Var2, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f133482a, jVar.f133482a) && Intrinsics.f(this.f133483b, jVar.f133483b) && this.f133484c == jVar.f133484c && this.d == jVar.d && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && this.f133485g == jVar.f133485g;
    }

    public final int hashCode() {
        int iF = p.a.f(j6.a.c((this.f133484c.hashCode() + ((this.f133483b.hashCode() + (this.f133482a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        a0 a0Var = this.f;
        return Boolean.hashCode(this.f133485g) + ((iF + (a0Var == null ? 0 : a0Var.hashCode())) * 31);
    }
}
