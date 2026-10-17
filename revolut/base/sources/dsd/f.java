package dsd;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f117294b = v.k(nzi.f.CASH, nzi.f.SAVINGS, nzi.f.LINKED_BANK_CASH, nzi.f.LINKED_BANK_SAVINGS, nzi.f.CRYPTO, nzi.f.INVESTMENTS, nzi.f.LINKED_INVESTMENTS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f117295c = v.k(nzi.f.LINKED_BANK_CREDIT, nzi.f.LOANS, nzi.f.INSTALMENTS, nzi.f.CREDIT_CARDS);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tsj.g f117296a;

    public f(tsj.g customAssetsInteractor) {
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        this.f117296a = customAssetsInteractor;
    }

    public final List a(amd.b groupType) {
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        switch (e.f117292a[groupType.ordinal()]) {
            case 1:
                return u.c(nzi.f.CASH);
            case 2:
                return u.c(nzi.f.SAVINGS);
            case 3:
                return u.c(nzi.f.INVESTMENTS);
            case 4:
                return u.c(nzi.f.CRYPTO);
            case 5:
                return v.k(nzi.f.LINKED_BANK_CASH, nzi.f.LINKED_BANK_SAVINGS, nzi.f.LINKED_INVESTMENTS);
            case 6:
                return u.c(nzi.f.LINKED_BANK_CREDIT);
            case 7:
                return u.c(nzi.f.CREDIT_CARDS);
            case 8:
                return u.c(nzi.f.LOANS);
            case 9:
                return u.c(nzi.f.INSTALMENTS);
            case 10:
                return v.k(nzi.f.LINKED_BANK_CASH, nzi.f.LINKED_BANK_SAVINGS, nzi.f.LINKED_BANK_CREDIT, nzi.f.LINKED_INVESTMENTS);
            case 11:
                return v.k(nzi.f.CREDIT_CARDS, nzi.f.LOANS, nzi.f.INSTALMENTS);
            case 12:
                return f0.f322471a;
            case 13:
                return u.c(nzi.f.OTHER_ASSETS);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final List b(yld.g netWorthType) {
        Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
        int i = e.f117293b[netWorthType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return f117295c;
            }
            throw new NoWhenBranchMatchedException();
        }
        aim.e eVarB = u.b();
        eVarB.addAll(f117294b);
        if (this.f117296a.d()) {
            eVarB.add(nzi.f.OTHER_ASSETS);
        }
        return u.a(eVarB);
    }
}
