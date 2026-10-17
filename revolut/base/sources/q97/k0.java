package q97;

import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_screen.api.navigation.CardListPreSelectedVariant;
import com.revolut.feature.card_screen.api.navigation.CardsListDestination;
import com.revolut.feature.globalsearch.api.GlobalSearchApi$Toggles$CryptoRevolutStablecoins;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f243722b;

    public /* synthetic */ k0(n0 n0Var, int i) {
        this.f243721a = i;
        this.f243722b = n0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b bVar;
        switch (this.f243721a) {
            case 0:
                pd5.d config = (pd5.d) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                ArrayList arrayList = config.f235097c;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((pd5.g) it8.next()).f235102a);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (cp5.d.D((xi0.b) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                xi0.b.Companion.getClass();
                xi0.b bVar2 = xi0.b.O;
                xi0.b bVar3 = xi0.b.R;
                return (((jte.d) this.f243722b.f243749h).c(GlobalSearchApi$Toggles$CryptoRevolutStablecoins.f74613c) && arrayList3.contains(bVar3)) ? bVar3 : (arrayList3.contains(bVar2) || (bVar = (xi0.b) zhm.d0.d0(arrayList3)) == null) ? bVar2 : bVar;
            case 1:
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                return xh5.a.a(this.f243722b.f243747c, naviCommand);
            default:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (!it9.isEmpty()) {
                    ufm.b bVarM = efm.d0.m(new o97.d(new CardsListDestination(new CardListPreSelectedVariant.Tab(n63.c.CRYPTO), b93.d.CRYPTO, 1)));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                ufm.b bVarM2 = efm.d0.m(gc0.c.f(new CardOrderNewFeatureConfig(SelectedTab.CRYPTO, null, null, null, null, false, null, null, null, null, null, null, 16382)));
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                n0 n0Var = this.f243722b;
                return new ufm.i(n0Var.d(bVarM2), new j0(new h(n0Var, 11), 3), 1);
        }
    }
}
