package com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntryDetails;
import g5i.c;
import i5i.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l5i.i;
import l5i.j;
import l5i.k;
import l5i.l;
import l5i.m;
import l5i.n;
import l5i.o;
import p4i.b;
import p4i.e;
import p4i.i;
import p4i.s;
import p4i.t;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StackedBreakdownActivityContract$Configuration f97162a;

    public a(StackedBreakdownActivityContract$Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f97162a = config;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        b click = (b) obj2;
        Parcelable screen = (Screen) obj3;
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(screen, "screen");
        int i = i.f232936a[click.f232932a.ordinal()];
        if (i == 1) {
            return Screen.RateExplanation.f97138a;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj4 = click.f232933b;
        e eVar = obj4 instanceof e ? (e) obj4 : null;
        if (eVar instanceof c) {
            if (!(((c) eVar) instanceof g5i.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ChargeEntry chargeEntry = ((g5i.b) eVar).f140792a;
            ChargeEntryDetails chargeEntryDetails = chargeEntry.d;
            String str = chargeEntryDetails != null ? chargeEntryDetails.f104730b : null;
            if (str == null || str.length() == 0) {
                return new Screen.ChargeDescription(chargeEntry);
            }
        } else {
            if (eVar instanceof r5i.c) {
                if (((r5i.c) eVar) instanceof r5i.b) {
                    return new Screen.ChargeDescription(((r5i.b) eVar).f251595a);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (eVar instanceof l5i.i) {
                l5i.i iVar = (l5i.i) eVar;
                boolean z = iVar instanceof k;
                StackedBreakdownActivityContract$Configuration stackedBreakdownActivityContract$Configuration = this.f97162a;
                if (z) {
                    OrderQuoteParamsVariant orderQuoteParamsVariant = stackedBreakdownActivityContract$Configuration.f97160b;
                    if (orderQuoteParamsVariant != null) {
                        k kVar = (k) eVar;
                        ChargeBreakdown chargeBreakdown = kVar.f192285a;
                        c4i.a aVar = stackedBreakdownActivityContract$Configuration.f97161c;
                        xi0.b bVar = kVar.f192286b;
                        t tVar = screen instanceof t ? (t) screen : null;
                        Clause clause = tVar != null ? ((Screen.TransactionBreakdown) tVar).i : null;
                        s sVar = screen instanceof s ? (s) screen : null;
                        return new Screen.FeeBreakdown.Dynamic(chargeBreakdown, orderQuoteParamsVariant, aVar, true, bVar, true, false, clause, false, sVar != null ? sVar.getF97145j() : null);
                    }
                } else {
                    if (iVar instanceof o) {
                        return new Screen.TaxBreakdown(((o) eVar).f192294a);
                    }
                    if (!(iVar instanceof m)) {
                        if (iVar instanceof n) {
                            n nVar = (n) eVar;
                            return new Screen.TransactionPriceDescription(stackedBreakdownActivityContract$Configuration.f97161c, nVar.f192291a, nVar.f192292b, nVar.f192293c, nVar.d);
                        }
                        if (iVar instanceof i.a) {
                            return Screen.CharityDescription.f97108a;
                        }
                        if (iVar instanceof i.b) {
                            return Screen.EffectiveRateDescription.f97109a;
                        }
                        if (iVar instanceof j) {
                            j jVar = (j) eVar;
                            return new Screen.Faq(jVar.f192283a, jVar.f192284b, u.c(Screen.Faq.FaqItem.GotItButton.f97113a));
                        }
                        if (!(iVar instanceof l)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        l lVar = (l) eVar;
                        CreditCardInterest creditCardInterest = lVar.f192287a;
                        return new Screen.InterestBreakdown(new Screen.InterestBreakdown.Interest.InterestApplies(creditCardInterest.f92271a, creditCardInterest.f92272b, creditCardInterest.f92273c, lVar.f192288b));
                    }
                }
            } else {
                if (eVar instanceof i5i.e) {
                    i5i.e eVar2 = (i5i.e) eVar;
                    if (eVar2 instanceof i5i.c) {
                        i5i.c cVar = (i5i.c) eVar;
                        return new Screen.TransactionPriceDescriptionDetails.DirtyPrice(cVar.f158840a, cVar.f158841b);
                    }
                    if (!(eVar2 instanceof d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d dVar = (d) eVar;
                    return new Screen.TransactionPriceDescriptionDetails.Units(dVar.f158842a, dVar.f158843b);
                }
                if (eVar instanceof j5i.b) {
                    j5i.b bVar2 = (j5i.b) eVar;
                    return new Screen.Faq(bVar2.f171646a, bVar2.f171647b, f0.f322471a);
                }
            }
        }
        return null;
    }
}
