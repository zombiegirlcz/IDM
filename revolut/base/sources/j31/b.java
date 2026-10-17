package j31;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170922a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f170923b;

    public /* synthetic */ b(tje.b bVar, xi0.b bVar2) {
        this.f170923b = bVar2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f170922a) {
            case 0:
                List list = (List) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(list, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (Intrinsics.f(((n71.b) obj5).getCurrency(), this.f170923b.f306286a)) {
                        arrayList.add(obj5);
                    }
                }
                return arrayList;
            case 1:
                List availableCurrencies = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
                ArrayList arrayList2 = null;
                xi0.b bVar = this.f170923b;
                if (bVar != null && availableCurrencies != null) {
                    List<xi0.b> list2 = availableCurrencies;
                    ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                    for (xi0.b bVar2 : list2) {
                        arrayList3.add(new AccountCellItemDelegate.Model(j6.a.q("CRYPTO_DISPLAY_CURRENCY_ROW_", bVar2.f306286a), bVar2.equals(bVar), (Image) new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), (Clause) new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, null, 4), (com.revolut.core.ui_kit.delegates.c) null, false, (Clause) new CurrencyClause(bVar2, CurrencyClause.Format.DisplayName.f57755a, null, 4), (RowDelegate.Model.c.b) null, (ProgressStyle) null, (Object) bVar2, (Parcelable) null, 128944));
                    }
                    yp0.b.k(arrayList3, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 28);
                    arrayList2 = arrayList3;
                }
                return arrayList2 == null ? f0.f322471a : arrayList2;
            default:
                e7l.f config = (e7l.f) obj2;
                Boolean isBrlExchangeAllFiatEnabled = (Boolean) obj3;
                xi0.b baseCurrency = (xi0.b) obj4;
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(isBrlExchangeAllFiatEnabled, "isBrlExchangeAllFiatEnabled");
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                Intrinsics.checkNotNullParameter(config, "config");
                xi0.b bVar3 = config.J0;
                if (bVar3 == null) {
                    bVar3 = x0i.f.f;
                }
                LinkedHashSet<String> linkedHashSet = config.M;
                Set set = config.T;
                xi0.b bVar4 = this.f170923b;
                boolean zF = Intrinsics.f(bVar4, bVar3);
                Set prohibitedCurrencies = config.U;
                Intrinsics.checkNotNullParameter(prohibitedCurrencies, "prohibitedCurrencies");
                boolean zIsEmpty = prohibitedCurrencies.isEmpty();
                boolean zContains = prohibitedCurrencies.contains(bVar4);
                boolean zF2 = Intrinsics.f(bVar4, baseCurrency);
                if (isBrlExchangeAllFiatEnabled.booleanValue() && !zIsEmpty && zContains && zF2) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    xi0.a aVar = xi0.b.Companion;
                    for (String str : linkedHashSet) {
                        aVar.getClass();
                        linkedHashSet2.add(xi0.a.a(str));
                    }
                    LinkedHashSet linkedHashSetL = a1.l(set, linkedHashSet2);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : linkedHashSetL) {
                        if (cp5.d.A((xi0.b) obj6)) {
                            arrayList4.add(obj6);
                        }
                    }
                    return a1.k(d0.i1(arrayList4), a1.k(d0.i1(prohibitedCurrencies), y0.b(baseCurrency)));
                }
                if (zIsEmpty) {
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    xi0.a aVar2 = xi0.b.Companion;
                    for (String str2 : linkedHashSet) {
                        aVar2.getClass();
                        linkedHashSet3.add(xi0.a.a(str2));
                    }
                    return a1.l(linkedHashSet3, set);
                }
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                xi0.a aVar3 = xi0.b.Companion;
                for (String str3 : linkedHashSet) {
                    aVar3.getClass();
                    linkedHashSet4.add(xi0.a.a(str3));
                }
                LinkedHashSet linkedHashSetL2 = a1.l(set, linkedHashSet4);
                if (zF) {
                    return linkedHashSetL2;
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj7 : prohibitedCurrencies) {
                    xi0.b bVar5 = (xi0.b) obj7;
                    if (!isBrlExchangeAllFiatEnabled.booleanValue() || !Intrinsics.f(bVar5, baseCurrency) || !cp5.d.A(bVar4)) {
                        arrayList5.add(obj7);
                    }
                }
                return a1.k(linkedHashSetL2, d0.i1(arrayList5));
        }
    }

    public /* synthetic */ b(xi0.b bVar) {
        this.f170923b = bVar;
    }

    public /* synthetic */ b(xi0.b bVar, x0i.f fVar) {
        this.f170923b = bVar;
    }
}
