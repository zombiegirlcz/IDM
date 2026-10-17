package aa7;

import aw0.u6;
import aw0.w6;
import aw0.x6;
import aw0.y6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.options.OptionWithTicker;
import ip0.ck0;
import ip0.yf0;
import ip0.yj0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class j implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InstrumentTicker f2777b;

    public /* synthetic */ j(InstrumentTicker instrumentTicker) {
        this.f2776a = 1;
        this.f2777b = instrumentTicker;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        eel.h hVar;
        BigDecimal bigDecimalY;
        switch (this.f2776a) {
            case 0:
                eel.e content = (eel.e) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                List list = content.f125227a;
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                int i5 = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        InstrumentTicker instrumentTicker = this.f2777b;
                        if (instrumentTicker.d == z.BOND) {
                            i = R$attr.uikit_colorPerformancePositive;
                            i2 = R$attr.uikit_colorPerformancePositive_30;
                            i3 = R$attr.uikit_colorPerformancePositive_10;
                        } else {
                            BigDecimal bigDecimalN = jb3.l.N(instrumentTicker);
                            int iD = bigDecimalN != null ? xqi.a.d(bigDecimalN, true, RoundingMode.HALF_EVEN) : 0;
                            if (iD < 0) {
                                i = R$attr.uikit_colorPerformanceNegative;
                                i2 = R$attr.uikit_colorPerformanceNegative_30;
                                i3 = R$attr.uikit_colorPerformanceNegative_10;
                            } else if (iD > 0) {
                                i = R$attr.uikit_colorPerformancePositive;
                                i2 = R$attr.uikit_colorPerformancePositive_30;
                                i3 = R$attr.uikit_colorPerformancePositive_10;
                            } else {
                                i = R$attr.uikit_colorGreyTone50;
                                i2 = R$attr.uikit_colorGreyTone50_30;
                                i3 = R$attr.uikit_colorGreyTone50_10;
                            }
                        }
                        x6 x6Var = new x6(u.c(new w6(i, i2, i3, BitmapDescriptorFactory.HUE_RED, 1.0f, false, 64)));
                        eel.l lVar = (eel.l) d0.d0(list);
                        Float fValueOf = (lVar == null || (hVar = lVar.f125239c) == null) ? null : Float.valueOf(hVar.a());
                        return new yf0(arrayList, x6Var, fValueOf != null ? new u6(fValueOf.floatValue(), null, 14) : null);
                    }
                    Object next = it8.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList.add(new y6(i5 / list.size(), ((eel.l) next).f125239c.a()));
                    i5 = i6;
                }
                break;
            case 1:
                TradingLegalEntityInformation content2 = (TradingLegalEntityInformation) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                hel.b bVar = content2.f105106a;
                if (bVar == null) {
                    return null;
                }
                InstrumentTicker instrumentTicker2 = this.f2777b;
                z zVar = instrumentTicker2.d;
                boolean z = instrumentTicker2.f105116j;
                if (zVar == z.BOND) {
                    return null;
                }
                if ((v.k(hel.b.EEA, hel.b.AU).contains(bVar) && !z) || bVar == hel.b.GB) {
                    return null;
                }
                return new TextDelegate.Model(z ? "DELAYED_MARKET_DATA_ID" : "MARKET_DATA_DISCLAIMER", new TextLocalisedClause(z ? R$string.wealth_stock_details_delayed_data : R$string.wealth_stock_details_disclaimer, null, null, 14), false, new ck0(yj0.START), null, null, 0, R$attr.uikit_dp16, 0, 0, 1780);
            default:
                teh.d optionsChain = (teh.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(optionsChain, "optionsChain");
                InstrumentTicker instrumentTicker3 = this.f2777b;
                ej0.b bVar2 = instrumentTicker3.f;
                if (bVar2 == null || (bigDecimalY = bVar2.f126703a) == null) {
                    bigDecimalY = pyd.c.Y(instrumentTicker3.e);
                }
                ArrayList arrayList2 = optionsChain.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : arrayList2) {
                    if (((OptionWithTicker) obj5).f105142a.f105139b.f126703a.compareTo(bigDecimalY) <= 0) {
                        arrayList3.add(obj5);
                    } else {
                        arrayList4.add(obj5);
                    }
                }
                aim.e eVarB = u.b();
                ArrayList arrayList5 = new ArrayList(w.t(arrayList3, 10));
                int i21 = 0;
                int i22 = 0;
                for (Object obj6 : arrayList3) {
                    int i32 = i22 + 1;
                    if (i22 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList5.add(veh.n.b((OptionWithTicker) obj6, "LOWER_OPTION_LIST_ID_" + ((arrayList3.size() - i22) - 1), instrumentTicker3));
                    i22 = i32;
                }
                yp0.b.k(arrayList5, 0, R$attr.uikit_dp0, 0, 0, 29);
                eVarB.addAll(arrayList5);
                eVarB.add(veh.n.d(instrumentTicker3));
                ArrayList arrayList6 = new ArrayList(w.t(arrayList4, 10));
                for (Object obj7 : arrayList4) {
                    int i33 = i21 + 1;
                    if (i21 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList6.add(veh.n.b((OptionWithTicker) obj7, "HIGHER_OPTION_LIST_ID_" + i21, instrumentTicker3));
                    i21 = i33;
                }
                yp0.b.k(arrayList6, R$attr.uikit_dp0, 0, 0, 0, 30);
                eVarB.addAll(arrayList6);
                return u.a(eVarB);
        }
    }

    public /* synthetic */ j(Object obj2, InstrumentTicker instrumentTicker, int i) {
        this.f2776a = i;
        this.f2777b = instrumentTicker;
    }
}
