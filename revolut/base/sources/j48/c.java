package j48;

import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointAccountsPendingState;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointAccountsProductCatalogMigration;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointAccountsPush2Card;
import com.revolut.feature.vaults.api.VaultsApi$Toggles;
import h38.a;
import hx7.e;
import java.util.Iterator;
import java.util.List;
import jla.h;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n38.q;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements p38.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f171317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h38.c f171318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f171319c;

    public c(gte.a featureToggleInteractor, h38.c jointAccountIdProvider, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(jointAccountIdProvider, "jointAccountIdProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f171317a = featureToggleInteractor;
        this.f171318b = jointAccountIdProvider;
        this.f171319c = productCatalogueInteractor;
    }

    public static void d(String str) throws Throwable {
        e.n(new IllegalStateException(p.a.p("JointAccountId must be initialized before checking it associated product feature state [", str, "]")));
    }

    public final Boolean a(String str) {
        Object next;
        h38.a bVar;
        a aVar = (a) this.f171318b;
        List listA = aVar.f171312a.a();
        if (listA == null) {
            bVar = a.C0859a.f149040a;
        } else {
            Iterator it8 = listA.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                n38.a aVar2 = (n38.a) next;
                if (((d) aVar.f171313b).c(JointAccountsApi$Toggles$JointAccountsPendingState.f76458c)) {
                    q qVar = aVar2.f211925c;
                    if (qVar == q.ACTIVE || qVar == q.OFFBOARDING || qVar == q.PENDING) {
                        break;
                    }
                } else {
                    q qVar2 = aVar2.f211925c;
                    if (qVar2 == q.ACTIVE || qVar2 == q.OFFBOARDING) {
                        break;
                    }
                }
            }
            n38.a aVar3 = (n38.a) next;
            String str2 = aVar3 != null ? aVar3.f211923a : null;
            bVar = str2 != null ? new h38.b(str2) : a.b.f149041a;
        }
        if (bVar instanceof h38.b) {
            return Boolean.valueOf(this.f171319c.d(str, ((h38.b) bVar).f149042a) == bla.c.ENABLED);
        }
        if (bVar instanceof a.b) {
            return Boolean.FALSE;
        }
        if (bVar instanceof a.C0859a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean b() throws Throwable {
        JointAccountsApi$Toggles$JointAccountsProductCatalogMigration jointAccountsApi$Toggles$JointAccountsProductCatalogMigration = JointAccountsApi$Toggles$JointAccountsProductCatalogMigration.f76459c;
        gte.a aVar = this.f171317a;
        if (!((d) aVar).c(jointAccountsApi$Toggles$JointAccountsProductCatalogMigration)) {
            return ((d) aVar).c(JointAccountsApi$Toggles$JointAccountsPush2Card.f76460c);
        }
        Boolean boolA = a("TRANSFER.card");
        if (boolA != null) {
            return boolA.booleanValue();
        }
        d("TRANSFER.card");
        return ((d) aVar).c(JointAccountsApi$Toggles$JointAccountsPush2Card.f76460c);
    }

    public final boolean c() {
        JointAccountsApi$Toggles$JointAccountsProductCatalogMigration jointAccountsApi$Toggles$JointAccountsProductCatalogMigration = JointAccountsApi$Toggles$JointAccountsProductCatalogMigration.f76459c;
        gte.a aVar = this.f171317a;
        if (!((d) aVar).c(jointAccountsApi$Toggles$JointAccountsProductCatalogMigration)) {
            return ((d) aVar).c(VaultsApi$Toggles.JointSubaccounts.f94695c);
        }
        Boolean boolA = a("ACCOUNT.pockets");
        if (boolA != null) {
            return boolA.booleanValue();
        }
        d("ACCOUNT.pockets");
        return ((d) aVar).c(VaultsApi$Toggles.JointSubaccounts.f94695c);
    }
}
