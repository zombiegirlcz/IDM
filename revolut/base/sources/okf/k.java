package okf;

import com.revolut.feature.credit.card.api.navigation.CreditCardPostPurchaseInstalmentDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardPrePurchaseInstalmentDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardStatementFinancingDestination;
import elf.s0;
import klf.g1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends yji.n implements s0 {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g1 f226019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vlf.b f226020m;

    public k(g1 instalmentsDataSource, vlf.b commonUiMapper) {
        Intrinsics.checkNotNullParameter(instalmentsDataSource, "instalmentsDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        this.f226019l = instalmentsDataSource;
        this.f226020m = commonUiMapper;
    }

    public final cmf.p Z2() {
        return new cmf.p(new oi3.g((SharedFlow) this.f226019l.f.getValue(), this, 4), new ok7.b(5), zhm.u.c(this), "CreditCardInstalment");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        aii.u creditCardPrePurchaseInstalmentDestination;
        if (obj2 instanceof cm4.e) {
            cm4.e eVar = (cm4.e) obj2;
            if (eVar instanceof cm4.b) {
                cm4.b bVar = (cm4.b) eVar;
                creditCardPrePurchaseInstalmentDestination = new CreditCardPostPurchaseInstalmentDestination(bVar.f25118a, bVar.f25119b);
            } else if (eVar instanceof cm4.d) {
                cm4.d dVar = (cm4.d) eVar;
                creditCardPrePurchaseInstalmentDestination = new CreditCardStatementFinancingDestination(dVar.f25122a, dVar.f25123b);
            } else {
                if (!(eVar instanceof cm4.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                cm4.c cVar = (cm4.c) eVar;
                creditCardPrePurchaseInstalmentDestination = new CreditCardPrePurchaseInstalmentDestination(cVar.f25120a, cVar.f25121b);
            }
            A2(creditCardPrePurchaseInstalmentDestination);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
