package snf;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public interface u {
    default String a() {
        if (this instanceof f) {
            return p.a.p("Current(currency=", ((f) this).f264579a.f306286a, ")");
        }
        if (this instanceof l) {
            l lVar = (l) this;
            return j6.a.s("Pocket(name=", lVar.f264591a, ", vaultId=", lVar.f264592b, ")");
        }
        if (this instanceof d) {
            return p.a.p("CreditCard(pocketId=", ((d) this).f264575a, ")");
        }
        if (this instanceof t) {
            t tVar = (t) this;
            return j6.a.s("Savings(name=", tVar.f264602a, ", vaultId=", tVar.f264603b, ")");
        }
        if (this instanceof n) {
            return p.a.p("Pro(currency=", ((n) this).f264598a.f306286a, ")");
        }
        if (this instanceof p) {
            p pVar = (p) this;
            return j6.a.s("ProPocket(name=", pVar.f264599a, ", vaultId=", pVar.f264600b, ")");
        }
        if (this instanceof j) {
            xi0.b bVar = ((j) this).f264589a;
            return p.a.p("Invest(currency=", bVar != null ? bVar.f306286a : null, ")");
        }
        if (this instanceof r) {
            return p.a.p("RevXFiat(currency=", ((r) this).f264601a.f306286a, ")");
        }
        if (this instanceof h) {
            return p.a.p("DeFi(currency=", ((h) this).f264583a.f306286a, ")");
        }
        throw new NoWhenBranchMatchedException();
    }
}
