package lu5;

import com.revolut.feature.crypto.gift.asset.api.CryptoGiftAssetApi$Toggles$CryptoGiftAsset;
import com.revolut.feature.crypto_investments.api.CryptoInvestmentsApi$Toggles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i7;
import tof.v6;
import tof.va;
import tof.y6;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements ft5.b {

    @NotNull
    public static final q Companion = new q();
    public static final List e = v.k(io3.l.CURRENT, io3.l.STAKING, io3.l.REVX_FIAT, io3.l.CRYPTO_EXCHANGE);
    public static final List f = v.k(io3.k.ACTIVE, io3.k.INACTIVE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f200039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.b f200040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f200041c;
    public final Lazy d;

    public r(gte.a featureToggleInteractor, m revXTransactionsFiltersProvider, a cryptoToCryptoTransactionsFiltersProvider, wsg.b walletInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revXTransactionsFiltersProvider, "revXTransactionsFiltersProvider");
        Intrinsics.checkNotNullParameter(cryptoToCryptoTransactionsFiltersProvider, "cryptoToCryptoTransactionsFiltersProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f200039a = featureToggleInteractor;
        this.f200040b = walletInteractor;
        final int i = 0;
        this.f200041c = yhm.j.b(new Function0(this) { // from class: lu5.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f200038b;

            {
                this.f200038b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = ((jte.d) this.f200038b.f200039a).c(CryptoInvestmentsApi$Toggles.UpdateStablecoinsFilters.f71372c);
                        break;
                    default:
                        zC = ((jte.d) this.f200038b.f200039a).c(CryptoGiftAssetApi$Toggles$CryptoGiftAsset.f70860c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.d = yhm.j.b(new Function0(this) { // from class: lu5.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f200038b;

            {
                this.f200038b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = ((jte.d) this.f200038b.f200039a).c(CryptoInvestmentsApi$Toggles.UpdateStablecoinsFilters.f71372c);
                        break;
                    default:
                        zC = ((jte.d) this.f200038b.f200039a).c(CryptoGiftAssetApi$Toggles$CryptoGiftAsset.f70860c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }

    public static aim.e b(List list, List list2) {
        aim.e eVarB = u.b();
        List list3 = list;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        Iterator it8 = list3.iterator();
        while (it8.hasNext()) {
            arrayList.add(((io3.d) it8.next()).f163145a);
        }
        eVarB.add(new va(d0.i1(arrayList)));
        i7.c cVar = i7.Companion;
        y6[] y6VarArr = {y6.REVX_EXCHANGE};
        cVar.getClass();
        eVarB.add(i7.c.d(y6VarArr));
        eVarB.add(i7.c.c(v6.COMPLETED));
        eVarB.addAll(list2);
        return u.a(eVarB);
    }
}
