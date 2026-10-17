package h9g;

import aw0.db;
import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.feature_travel_hotels_models.property.OverallPrice;
import com.revolut.feature_travel_hotels_models.property.PriceFee;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract class m {
    public static final ArrayList a(Pricing pricing) {
        Intrinsics.checkNotNullParameter(pricing, "<this>");
        List listB = b(pricing);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listB) {
            if (((PriceFee) obj2).f98063a == ufi.b.EXTRA_PERSON_FEE) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final List b(Pricing pricing) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(pricing, "<this>");
        OverallPrice overallPrice = pricing.d;
        if (overallPrice != null) {
            ArrayList arrayList2 = overallPrice.d;
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((PriceFee) obj2).f98065c) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }

    public static final List c(Pricing pricing) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(pricing, "<this>");
        OverallPrice overallPrice = pricing.d;
        if (overallPrice != null) {
            ArrayList arrayList2 = overallPrice.d;
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (!((PriceFee) obj2).f98065c) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }

    public static final dj0.d d(Pricing pricing) {
        Intrinsics.checkNotNullParameter(pricing, "<this>");
        OverallPrice overallPrice = pricing.d;
        if (overallPrice != null) {
            ArrayList arrayList = overallPrice.d;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!((PriceFee) obj2).f98065c) {
                    arrayList2.add(obj2);
                }
            }
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            int i = 0;
            for (Object obj3 : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i == 0 ? ((PriceFee) obj3).d : pyd.c.O(dVarO, ((PriceFee) obj3).d);
                i = i2;
            }
            if (dVarO != null) {
                return dVarO;
            }
        }
        return new dj0.d(0L, pricing.f98068c.f98058b.f115083b);
    }

    public static final dj0.d e(Pricing pricing, cgi.e ratesType) {
        Intrinsics.checkNotNullParameter(pricing, "<this>");
        Intrinsics.checkNotNullParameter(ratesType, "ratesType");
        int i = l.f150255a[ratesType.ordinal()];
        if (i == 1) {
            return pyd.c.O(boh.f.g(pricing), d(pricing));
        }
        if (i == 2) {
            return d(pricing);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final dj0.d f(Pricing pricing, cgi.e ratesType) {
        Intrinsics.checkNotNullParameter(pricing, "<this>");
        Intrinsics.checkNotNullParameter(ratesType, "ratesType");
        int i = l.f150255a[ratesType.ordinal()];
        int i2 = 0;
        if (i == 1) {
            dj0.d dVar = pricing.f98068c.f98058b;
            Intrinsics.checkNotNullParameter(pricing, "<this>");
            Intrinsics.checkNotNullParameter(pricing, "<this>");
            ArrayList arrayList = pricing.f98068c.d;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!((PriceFee) obj2).f98065c) {
                    arrayList2.add(obj2);
                }
            }
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            for (Object obj3 : arrayList2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i2 == 0 ? ((PriceFee) obj3).d : pyd.c.O(dVarO, ((PriceFee) obj3).d);
                i2 = i3;
            }
            return pyd.c.O(dVar, dVarO);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = pricing.f98068c.d;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList3) {
            PriceFee priceFee = (PriceFee) obj4;
            if (!priceFee.f98065c && !Intrinsics.f(priceFee.d.f115083b, pricing.f98068c.f98058b.f115083b)) {
                arrayList4.add(obj4);
            }
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO2 = dj0.d.e;
        for (Object obj5 : arrayList4) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            dVarO2 = i2 == 0 ? ((PriceFee) obj5).d : pyd.c.O(dVarO2, ((PriceFee) obj5).d);
            i2 = i5;
        }
        return dVarO2;
    }

    public static final dj0.d g(Pricing pricing, cgi.e ratesType) {
        Intrinsics.checkNotNullParameter(pricing, "<this>");
        Intrinsics.checkNotNullParameter(ratesType, "ratesType");
        int i = l.f150255a[ratesType.ordinal()];
        if (i == 1) {
            return new dj0.d(0L, pricing.f98068c.f98058b.f115083b);
        }
        if (i == 2) {
            return boh.f.g(pricing);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.travel.hotels.impl.model.points.Points h(com.revolut.feature_travel_hotels_models.property.Pricing r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.List r1 = r10.f
            r2 = 0
            if (r1 == 0) goto L55
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L1b
            r3 = r2
            goto L44
        L1b:
            java.lang.Object r3 = r1.next()
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L26
            goto L44
        L26:
            r4 = r3
            com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption r4 = (com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption) r4
            dj0.d r4 = r4.f97977c
            long r4 = r4.f115082a
        L2d:
            java.lang.Object r6 = r1.next()
            r7 = r6
            com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption r7 = (com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption) r7
            dj0.d r7 = r7.f97977c
            long r7 = r7.f115082a
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 >= 0) goto L3e
            r3 = r6
            r4 = r7
        L3e:
            boolean r6 = r1.hasNext()
            if (r6 != 0) goto L2d
        L44:
            com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption r3 = (com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption) r3
            if (r3 == 0) goto L55
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.revolut.feature.travel.hotels.impl.model.points.Points r0 = new com.revolut.feature.travel.hotels.impl.model.points.Points
            dj0.d r1 = r3.f97977c
            com.revolut.feature.rev_points.models.RevPoints r3 = r3.d
            r0.<init>(r3, r1)
            goto L56
        L55:
            r0 = r2
        L56:
            if (r0 != 0) goto L5f
            com.revolut.feature.travel.hotels.impl.model.points.Points r0 = new com.revolut.feature.travel.hotels.impl.model.points.Points
            com.revolut.feature.rev_points.models.RevPoints r10 = r10.f98069g
            r0.<init>(r10, r2)
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h9g.m.h(com.revolut.feature_travel_hotels_models.property.Pricing):com.revolut.feature.travel.hotels.impl.model.points.Points");
    }

    public static final MoneyClause i(Pricing pricing, int i, db dbVar) {
        dj0.d dVarJ = j(pricing);
        if (dVarJ != null) {
            return new MoneyClause(dVarJ, new MoneyClause.Format.Shorts(false, 51), new Custom(Integer.valueOf(i), true, dbVar, false, null, Constants.TAG_FULL_SVPP_IDENTIFICATION), o9.NON_SENSITIVE);
        }
        return null;
    }

    public static final dj0.d j(Pricing pricing) {
        OverallPrice overallPrice;
        dj0.d dVar;
        if (pricing == null || (overallPrice = pricing.d) == null || (dVar = overallPrice.f98059c) == null) {
            return null;
        }
        return pyd.c.O(dVar, d(pricing));
    }

    public static final ArrayList k(Pricing pricing) {
        Intrinsics.checkNotNullParameter(pricing, "<this>");
        List listB = b(pricing);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listB) {
            if (((PriceFee) obj2).f98063a != ufi.b.EXTRA_PERSON_FEE) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
