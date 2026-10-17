package d9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.BlackCircleBadge;
import com.revolut.core.ui_kit.models.badge.BusinessBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit.models.badge.SuccessCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityItem;
import com.revolut.feature.insurance_car.impl.data.model.Payment;
import com.revolut.feature.insurance_car.impl.data.model.PaymentBreakdownCategory;
import com.revolut.feature.insurance_car.impl.data.model.PriceWithLabel;
import com.revolut.feature.robo.api.model.Benchmark;
import com.revolut.feature.store.api.model.StoreCampaignAvailability;
import com.revolut.feature.store.api.model.StoreCampaignAvailabilityInterval;
import com.revolut.feature.store.api.model.StoreCampaignBadge;
import com.revolut.feature.store.api.model.StoreCampaignCategory;
import com.revolut.feature.store.api.model.StoreCampaignEarningRate;
import com.revolut.feature.store.api.model.StoreCampaignInstalmentOption;
import com.revolut.feature.store.api.model.StoreCampaignLocation;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import com.revolut.feature.store.api.model.StoreCampaignOutlet;
import com.revolut.feature.store.api.model.StoreInstructionList;
import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import dx4.h1;
import dx4.i1;
import dx4.j1;
import dx4.k1;
import f2e.a2;
import hl7.f7;
import hl7.k6;
import hl7.n6;
import hl7.q9;
import hl7.x7;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kl7.d2;
import kl7.f1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader$Cache;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import le.u1;
import yhm.m;
import zh9.r1;
import zh9.s1;

/* JADX INFO: loaded from: classes16.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Java16RecordComponentsLoader$Cache f112318a;

    public static final f2e.x A(StoreCampaignOffer storeCampaignOffer) {
        String strName;
        String str;
        f2e.a0 a0Var;
        boolean z;
        f2e.u uVar;
        f2e.u uVar2;
        String str2;
        List list;
        List list2;
        String str3;
        String str4;
        String str5;
        String str6;
        f2e.j0 j0Var;
        boolean z3;
        String str7;
        Intrinsics.checkNotNullParameter(storeCampaignOffer, "<this>");
        String str8 = storeCampaignOffer.f88447a;
        String str9 = storeCampaignOffer.f88448b;
        String str10 = storeCampaignOffer.f88449c;
        String str11 = storeCampaignOffer.d;
        String str12 = storeCampaignOffer.e;
        String str13 = storeCampaignOffer.f;
        boolean zF = Intrinsics.f(storeCampaignOffer.f88450g, Boolean.TRUE);
        t1e.b bVar = storeCampaignOffer.f88451h;
        if (bVar == null || (strName = bVar.name()) == null) {
            strName = "ACTIVATED";
        }
        String str14 = strName;
        String str15 = storeCampaignOffer.i;
        String str16 = storeCampaignOffer.f88452j;
        BigDecimal bigDecimal = storeCampaignOffer.k;
        Double dValueOf = bigDecimal != null ? Double.valueOf(bigDecimal.doubleValue()) : null;
        Double d = storeCampaignOffer.f88453l;
        StoreCampaignEarningRate storeCampaignEarningRate = storeCampaignOffer.f88454m;
        if (storeCampaignEarningRate != null) {
            str = str8;
            a0Var = new f2e.a0(storeCampaignEarningRate.f88440a.J(), mo3.a.p(storeCampaignEarningRate.f88441b));
        } else {
            str = str8;
            a0Var = null;
        }
        StoreCampaignBadge storeCampaignBadge = storeCampaignOffer.f88455n;
        f2e.r rVar = storeCampaignBadge != null ? new f2e.r(storeCampaignBadge.f88436a.name(), storeCampaignBadge.f88437b) : null;
        boolean z4 = storeCampaignOffer.o;
        boolean z6 = storeCampaignOffer.f88456p;
        boolean z11 = storeCampaignOffer.f88457q;
        StoreCampaignCategory storeCampaignCategory = storeCampaignOffer.f88458r;
        f2e.r rVar2 = rVar;
        if (storeCampaignCategory != null) {
            z = z6;
            uVar = new f2e.u(storeCampaignCategory.f88438a, storeCampaignCategory.f88439b);
        } else {
            z = z6;
            uVar = null;
        }
        String str17 = storeCampaignOffer.f88459s;
        String str18 = storeCampaignOffer.f88460t;
        List list3 = storeCampaignOffer.v;
        if (list3 != null) {
            List list4 = list3;
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                f2e.u uVar3 = uVar;
                int i = d2e.a.f110796a[((t1e.m) it8.next()).ordinal()];
                String str19 = str18;
                if (i == 1) {
                    str7 = "CARD";
                } else if (i == 2) {
                    str7 = "REVPAY";
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str7 = null;
                }
                if (str7 != null) {
                    arrayList.add(str7);
                }
                str18 = str19;
                uVar = uVar3;
            }
            uVar2 = uVar;
            str2 = str18;
            list = arrayList;
        } else {
            uVar2 = uVar;
            str2 = str18;
            list = zhm.f0.f322471a;
        }
        List list5 = list;
        List list6 = storeCampaignOffer.f88461w;
        StoreCampaignOutlet storeCampaignOutlet = storeCampaignOffer.f88462x;
        if (storeCampaignOutlet != null) {
            String str20 = storeCampaignOutlet.f88464a;
            list2 = list6;
            String str21 = storeCampaignOutlet.f88465b;
            StoreCampaignLocation storeCampaignLocation = storeCampaignOutlet.d;
            str3 = str9;
            str4 = str10;
            str5 = str11;
            str6 = str12;
            f2e.g0 g0Var = new f2e.g0(storeCampaignLocation.f88445a, storeCampaignLocation.f88446b);
            Integer num = storeCampaignOutlet.e;
            String str22 = storeCampaignOutlet.f88466c;
            ArrayList arrayList2 = storeCampaignOutlet.f;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
            Iterator it9 = arrayList2.iterator();
            while (it9.hasNext()) {
                StoreCampaignAvailability storeCampaignAvailability = (StoreCampaignAvailability) it9.next();
                List list7 = storeCampaignAvailability.f88431a;
                ArrayList arrayList4 = storeCampaignAvailability.f88432b;
                Integer num2 = num;
                Iterator it10 = it9;
                f2e.g0 g0Var2 = g0Var;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                Iterator it11 = arrayList4.iterator();
                while (it11.hasNext()) {
                    StoreCampaignAvailabilityInterval storeCampaignAvailabilityInterval = (StoreCampaignAvailabilityInterval) it11.next();
                    arrayList5.add(new f2e.o(storeCampaignAvailabilityInterval.f88433a, storeCampaignAvailabilityInterval.f88434b, storeCampaignAvailabilityInterval.f88435c));
                    it11 = it11;
                    str22 = str22;
                    arrayList4 = arrayList4;
                }
                String str23 = str22;
                ArrayList arrayList6 = arrayList4;
                if (arrayList6.isEmpty()) {
                    z3 = true;
                } else {
                    Iterator it12 = arrayList6.iterator();
                    while (it12.hasNext()) {
                        if (!((StoreCampaignAvailabilityInterval) it12.next()).f88435c) {
                            z3 = false;
                            break;
                        }
                    }
                    z3 = true;
                }
                arrayList3.add(new f2e.l(arrayList5, list7, z3));
                g0Var = g0Var2;
                it9 = it10;
                num = num2;
                str22 = str23;
            }
            j0Var = new f2e.j0(str20, str21, g0Var, num, str22, arrayList3);
        } else {
            list2 = list6;
            str3 = str9;
            str4 = str10;
            str5 = str11;
            str6 = str12;
            j0Var = null;
        }
        Instant instant = storeCampaignOffer.f88463y;
        StoreCampaignInstalmentOption storeCampaignInstalmentOption = storeCampaignOffer.A;
        f2e.d0 d0Var = storeCampaignInstalmentOption != null ? new f2e.d0(storeCampaignInstalmentOption.f88442a.name(), storeCampaignInstalmentOption.f88443b, storeCampaignInstalmentOption.f88444c, mo3.a.p(storeCampaignInstalmentOption.d)) : null;
        StoreInstructionList storeInstructionList = storeCampaignOffer.B;
        return new f2e.x(str, str3, str4, str5, str6, str13, zF, str14, str15, str16, dValueOf, d, a0Var, rVar2, z4, z, z11, uVar2, str17, str2, list5, list2, j0Var, instant, d0Var, storeInstructionList != null ? new a2(storeInstructionList.f88528a, storeInstructionList.f88529b) : null);
    }

    public static final ed8.a B(xc8.c cVar) {
        return new ed8.a(oi0.d.R(cVar.e), cVar.f304101a, u1.g(cVar.f304102b, zhm.r0.k(new Pair("FIRST_PARTY_MARKETING", v6d.a.FIRST_PARTY_MARKETING), new Pair("THIRD_PARTY_MARKETING", v6d.a.THIRD_PARTY_MARKETING), new Pair("PERSONAL_DATA_PROCESSING", v6d.a.PERSONAL_DATA_PROCESSING), new Pair("PAYMENT_LINKS", v6d.a.PAYMENT_LINKS), new Pair("FIRST_PARTY_NFC_PAYMENTS", v6d.a.FIRST_PARTY_NFC_PAYMENTS))), u1.g(cVar.f304103c, zhm.r0.k(new Pair("GUARDIAN_CONSENT", xc8.b.GUARDIAN_CONSENT), new Pair("YOUTH_CONSENT", xc8.b.YOUTH_CONSENT))), u1.g(cVar.d, zhm.r0.k(new Pair("GIVEN", xc8.a.GIVEN), new Pair("NOT_GIVEN", xc8.a.NOT_GIVEN))));
    }

    public static final ed8.d C(xc8.g gVar) {
        String str = gVar.f304107a;
        Map map = gVar.f304108b;
        xc8.c cVar = (xc8.c) map.get(v6d.a.FIRST_PARTY_MARKETING);
        ed8.a aVarB = cVar != null ? B(cVar) : null;
        xc8.c cVar2 = (xc8.c) map.get(v6d.a.THIRD_PARTY_MARKETING);
        ed8.a aVarB2 = cVar2 != null ? B(cVar2) : null;
        xc8.c cVar3 = (xc8.c) map.get(v6d.a.PERSONAL_DATA_PROCESSING);
        ed8.a aVarB3 = cVar3 != null ? B(cVar3) : null;
        xc8.c cVar4 = (xc8.c) map.get(v6d.a.PAYMENT_LINKS);
        ed8.a aVarB4 = cVar4 != null ? B(cVar4) : null;
        xc8.c cVar5 = (xc8.c) map.get(v6d.a.FIRST_PARTY_NFC_PAYMENTS);
        return new ed8.d(str, aVarB, aVarB2, aVarB3, aVarB4, cVar5 != null ? B(cVar5) : null);
    }

    public static final dj0.d D(ej0.b bVar, nel.n nVar) {
        Integer num;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (nVar != null && (num = nVar.f214603n) != null) {
            return mif.a.P(bVar, num.intValue(), 2);
        }
        int iScale = bVar.f126703a.scale();
        if (iScale == 1) {
            iScale = 2;
        }
        return mif.a.P(bVar, iScale, 2);
    }

    public static final OrderQuoteParams E(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        xi0.b bVar = orderQuote.f104754c.f104718b.f104721c;
        xi0.b bVar2 = orderQuote.e.f104718b.f104721c;
        f8l.e eVar = orderQuote.k;
        BigDecimal bigDecimal = e1.u(orderQuote).f104717a;
        f8l.b bVar3 = f8l.b.TO;
        f8l.b bVar4 = orderQuote.f104753b;
        BigDecimal bigDecimal2 = orderQuote.f104758l;
        f8l.e eVar2 = orderQuote.k;
        Intrinsics.checkNotNullParameter(eVar2, "<this>");
        return new OrderQuoteParams(bVar, bVar2, eVar, bigDecimal, bVar3, bVar4, bigDecimal2, eVar2 == f8l.e.RECURRING, null, f8l.f.TRADING, null, null, null, null, 15616);
    }

    public static final w1m.h F(w2m.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new w1m.h(aVar.n1());
    }

    public static final TextLocalisedClause G(Clause clause, int i) {
        Intrinsics.checkNotNullParameter(clause, "<this>");
        return new TextLocalisedClause(i, zhm.u.c(clause), null, 12);
    }

    public static final void a(Throwable th10, Class ownerClass, Class calledClass, String functionName) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        Intrinsics.checkNotNullParameter(ownerClass, "ownerClass");
        Intrinsics.checkNotNullParameter(calledClass, "calledClass");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        try {
            String name = ownerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String name2 = calledClass.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            yhm.f.a(th10, new rd0.f(new rd0.a(name, name2, functionName, string)));
        } catch (Throwable unused) {
        }
    }

    public static String b(Constructor constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        StringBuilder sb6 = new StringBuilder("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        for (Class<?> cls : parameterTypes) {
            Intrinsics.h(cls);
            sb6.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb6.append(")V");
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static String c(Field field) {
        Intrinsics.checkNotNullParameter(field, "field");
        Class<?> type = field.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return ReflectClassUtilKt.getDesc(type);
    }

    public static final MtaAvailabilityItem d(MtaAvailabilityContainer mtaAvailabilityContainer, kl7.a1 a1Var) {
        Object next;
        Iterator it8 = mtaAvailabilityContainer.f75235a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            MtaAvailabilityItem mtaAvailabilityItem = (MtaAvailabilityItem) next;
            if (mtaAvailabilityItem.f75240a == a1Var && mtaAvailabilityItem.f75241b) {
                break;
            }
        }
        return (MtaAvailabilityItem) next;
    }

    public static final BigInteger e(FundingSource fundingSource) {
        Intrinsics.checkNotNullParameter(fundingSource, "<this>");
        if (fundingSource instanceof DeFiBalanceSource) {
            BigInteger bigIntegerUnscaledValue = ((DeFiBalanceSource) fundingSource).f92238h.f126703a.unscaledValue();
            Intrinsics.checkNotNullExpressionValue(bigIntegerUnscaledValue, "unscaledValue(...)");
            return bigIntegerUnscaledValue;
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(fundingSource.getF92243g().f115082a);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }

    public static final int f(FundingSource fundingSource) {
        Intrinsics.checkNotNullParameter(fundingSource, "<this>");
        return fundingSource instanceof DeFiBalanceSource ? ((DeFiBalanceSource) fundingSource).f92238h.f126703a.scale() : fundingSource.f92241b.c();
    }

    public static final Map g() {
        return zhm.r0.k(new Pair("ADD", z3d.f.ADD), new Pair("REMOVE", z3d.f.REMOVE), new Pair("SYNCED", z3d.f.SYNCED));
    }

    public static final r1 h(zh9.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        zh9.h hVar = iVar.f;
        zh9.c cVar = iVar.f322282c;
        zh9.e eVar = hVar != null ? hVar.o : null;
        int i = eVar == null ? -1 : s1.f322345b[eVar.ordinal()];
        if (i == -1) {
            int i2 = s1.f322344a[cVar.ordinal()];
            if (i2 == 1) {
                return r1.Healthy;
            }
            if (i2 == 2) {
                return r1.Outstanding;
            }
            if (i2 == 3) {
                return r1.Overdue;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i == 1) {
            int i3 = s1.f322344a[cVar.ordinal()];
            if (i3 == 1) {
                return r1.Healthy;
            }
            if (i3 == 2) {
                return r1.Outstanding;
            }
            if (i3 == 3) {
                return r1.Overdue;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i == 2) {
            int i5 = s1.f322344a[cVar.ordinal()];
            if (i5 == 1) {
                return iVar.e.k() ? r1.CancelledPendingClosure : cp5.c.C(iVar.f) ? r1.CancelledAndWithdrawal : r1.Cancelled;
            }
            if (i5 == 2) {
                return r1.CancelledAndOutstanding;
            }
            if (i5 == 3) {
                return r1.CancelledAndOverdue;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = s1.f322344a[cVar.ordinal()];
        if (i6 == 1) {
            return r1.TerminatedPendingClosure;
        }
        if (i6 != 2 && i6 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return r1.TerminatedAndOverdue;
    }

    public static final boolean i(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() > 1;
    }

    public static skm.r0 j(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return skm.f0.f263977a.j(j2, runnable, coroutineContext);
    }

    public static boolean k(MtaAvailabilityContainer mtaAvailabilityContainer, kl7.a1 mtaType) {
        Intrinsics.checkNotNullParameter(mtaAvailabilityContainer, "<this>");
        Intrinsics.checkNotNullParameter(mtaType, "mtaType");
        return d(mtaAvailabilityContainer, mtaType) != null;
    }

    public static final boolean l(zm3.f fVar, zm3.f fVar2) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return Intrinsics.f(hx7.q.q(fVar), fVar2 != null ? hx7.q.q(fVar2) : null) && Intrinsics.f(fVar.f323347c, fVar2.f323347c);
    }

    public static final boolean m(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return kotlin.text.a0.z(lim.o.n(file), "pdf", true);
    }

    public static String n(Method method) {
        Intrinsics.checkNotNullParameter(method, "method");
        StringBuilder sb6 = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        for (Class<?> cls : parameterTypes) {
            Intrinsics.h(cls);
            sb6.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb6.append(")");
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb6.append(ReflectClassUtilKt.getDesc(returnType));
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final Amount o(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        ChargeBreakdown chargeBreakdown = orderQuote.f104755g.f104731a;
        Amount amount = chargeBreakdown.f104724c;
        if (amount != null) {
            return amount;
        }
        Amount amount2 = chargeBreakdown.f104722a;
        xi0.b bVar = amount2.f104718b.f104721c;
        Amount amount3 = orderQuote.e;
        if (Intrinsics.f(bVar, amount3.f104718b.f104721c)) {
            return amount2;
        }
        BigDecimal bigDecimalMultiply = amount2.f104717a.multiply(orderQuote.f104757j.f104793b);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new Amount(bigDecimalMultiply, amount3.f104718b);
    }

    public static final CircleBadgeModel p(j1 j1Var) {
        dw0.a aVar;
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        if (!(j1Var instanceof h1)) {
            if (j1Var == i1.RETAIL) {
                return RetailBadge.f58066a;
            }
            if (j1Var == i1.BUSINESS) {
                return BusinessBadge.f58051a;
            }
            throw new NoWhenBranchMatchedException();
        }
        h1 h1Var = (h1) j1Var;
        switch (k1.f120647b[h1Var.f120611a.ordinal()]) {
            case 1:
                aVar = dw0.a.Alert;
                break;
            case 2:
                aVar = dw0.a.Awaiting;
                break;
            case 3:
                aVar = dw0.a.Bank;
                break;
            case 4:
                aVar = dw0.a.Boost;
                break;
            case 5:
                aVar = dw0.a.CalendarDate;
                break;
            case 6:
                aVar = dw0.a.Camera;
                break;
            case 7:
                aVar = dw0.a.Cancelled;
                break;
            case 8:
                aVar = dw0.a.Card;
                break;
            case 9:
                aVar = dw0.a.Checked;
                break;
            case 10:
                aVar = dw0.a.Cleaning;
                break;
            case 11:
                aVar = dw0.a.Contrast;
                break;
            case 12:
                aVar = dw0.a.Dislike;
                break;
            case 13:
                aVar = dw0.a.Edit;
                break;
            case 14:
                aVar = dw0.a.Error;
                break;
            case 15:
                aVar = dw0.a.Favourites;
                break;
            case 16:
                aVar = dw0.a.Frozen;
                break;
            case 17:
                aVar = dw0.a.Image;
                break;
            case 18:
                aVar = dw0.a.Income;
                break;
            case 19:
                aVar = dw0.a.Info;
                break;
            case 20:
                aVar = dw0.a.Like;
                break;
            case 21:
                aVar = dw0.a.Lightning;
                break;
            case 22:
                aVar = dw0.a.Link;
                break;
            case 23:
                aVar = dw0.a.Locked;
                break;
            case 24:
                aVar = dw0.a.NoBoost;
                break;
            case 25:
                aVar = dw0.a.OrderDownwards;
                break;
            case 26:
                aVar = dw0.a.OrderUpwards;
                break;
            case 27:
                aVar = dw0.a.Outgoing;
                break;
            case 28:
                aVar = dw0.a.Paused;
                break;
            case 29:
                aVar = dw0.a.Pending;
                break;
            case 30:
                aVar = dw0.a.Phone;
                break;
            case 31:
                aVar = dw0.a.Premium;
                break;
            case 32:
                aVar = dw0.a.Question;
                break;
            case 33:
                aVar = dw0.a.Recurring;
                break;
            case 34:
                aVar = dw0.a.Refund;
                break;
            case 35:
                aVar = dw0.a.Revert;
                break;
            case 36:
                aVar = dw0.a.Sending;
                break;
            case 37:
                aVar = dw0.a.Shield;
                break;
            case 38:
                aVar = dw0.a.SpareChange;
                break;
            case 39:
                aVar = dw0.a.Suspicious;
                break;
            case 40:
                aVar = dw0.a.TopUp;
                break;
            case 41:
                aVar = dw0.a.Wealth;
                break;
            case 42:
                aVar = dw0.a.Travel;
                break;
            case 43:
                aVar = dw0.a.Cashback;
                break;
            case 44:
                aVar = dw0.a.PriceTag;
                break;
            case 45:
                aVar = dw0.a.RevPoints;
                break;
            case 46:
                aVar = dw0.a.ArrowExchange;
                break;
            case 47:
                aVar = dw0.a.ArrowSplit;
                break;
            case 48:
                aVar = dw0.a.Fees;
                break;
            case 49:
                aVar = dw0.a.Merge;
                break;
            case 50:
                aVar = dw0.a.SymbolChange;
                break;
            case 51:
                aVar = dw0.a.Megaphone;
                break;
            case 52:
                aVar = dw0.a.Moon;
                break;
            case 53:
                aVar = dw0.a.More;
                break;
            case 54:
                aVar = dw0.a.Titan;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (k1.f120646a[h1Var.f120612b.ordinal()]) {
            case 1:
                return new AccentCircleBadge(aVar);
            case 2:
                return new SuccessCircleBadge(aVar);
            case 3:
                return new WarningCircleBadge(aVar);
            case 4:
                return new DangerCircleBadge(aVar);
            case 5:
                return new InactiveCircleBadge(aVar);
            case 6:
                return new WhiteCircleBadge(aVar);
            case 7:
                return new BlackCircleBadge(aVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final DeFiBalanceSource q(DeFiBalance deFiBalance) {
        Intrinsics.checkNotNullParameter(deFiBalance, "<this>");
        xi0.b currency = deFiBalance.getCurrency();
        return new DeFiBalanceSource(deFiBalance.f71638g, cp5.d.e(currency), deFiBalance.f71639h, cp5.d.t(xi0.b.Companion, currency.f306286a), deFiBalance.a(), null);
    }

    public static final zm3.f r(zm3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof zm3.f) {
            return (zm3.f) aVar;
        }
        if (aVar instanceof zm3.i) {
            return ((zm3.i) aVar).e;
        }
        if (!(aVar instanceof zm3.o)) {
            if ((aVar instanceof zm3.e) || (aVar instanceof zm3.n) || (aVar instanceof zm3.j)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        zm3.o oVar = (zm3.o) aVar;
        String str = oVar.f323376a;
        kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return new zm3.f(str, 0L, "", "", "", null, oVar.f323377b, oVar.f323378c);
    }

    public static final cqc.a s(fqc.i iVar) {
        cqc.d dVar;
        cqc.c cVar;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str = iVar.f137246a;
        String str2 = iVar.f137247b;
        cqc.d[] dVarArrValues = cqc.d.values();
        int length = dVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrValues[i2];
            if (kotlin.text.a0.z(dVar.name(), str2, true)) {
                break;
            }
            i2++;
        }
        if (dVar == null) {
            dVar = cqc.d.UNKNOWN;
        }
        cqc.d dVar2 = dVar;
        String str3 = iVar.f137248c;
        cqc.c[] cVarArrValues = cqc.c.values();
        int length2 = cVarArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i3];
            if (kotlin.text.a0.z(cVar.name(), str3, true)) {
                break;
            }
            i3++;
        }
        if (cVar == null) {
            cVar = cqc.c.UNKNOWN;
        }
        cqc.b bVar = null;
        long j2 = iVar.d;
        Long l2 = iVar.e;
        String str4 = iVar.f;
        String str5 = iVar.f137249g;
        if (str5 != null) {
            cqc.b[] bVarArrValues = cqc.b.values();
            int length3 = bVarArrValues.length;
            while (true) {
                if (i >= length3) {
                    break;
                }
                cqc.b bVar2 = bVarArrValues[i];
                if (kotlin.text.a0.z(bVar2.name(), str5, true)) {
                    bVar = bVar2;
                    break;
                }
                i++;
            }
            if (bVar == null) {
                bVar = cqc.b.UNKNOWN;
            }
        }
        return new cqc.a(str, dVar2, cVar, j2, l2, str4, bVar, iVar.f137250h, iVar.i);
    }

    public static final dj0.d t(m2k.k kVar) {
        if ((kVar != null ? kVar.getAmount() : null) == null || kVar.getCurrency() == null) {
            return null;
        }
        long jLongValue = kVar.getAmount().longValue();
        xi0.a aVar = xi0.b.Companion;
        String strB = kVar.getCurrency();
        aVar.getClass();
        return new dj0.d(jLongValue, xi0.a.a(strB));
    }

    public static final ArrayList u(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<tlc.a> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (tlc.a aVar : list2) {
            arrayList.add(new Benchmark(aVar.getShortDescription(), aVar.getDescription(), aVar.getLongDescription(), aVar.getName(), aVar.getRef()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    public static final d2 v(q9 q9Var, String baseUrl) {
        Intrinsics.checkNotNullParameter(q9Var, "<this>");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        String str = q9Var.f153273a;
        String str2 = q9Var.f153274b;
        Intrinsics.checkNotNullParameter(str2, "<this>");
        LocalDate localDate = LocalDate.parse(str2);
        Intrinsics.checkNotNullExpressionValue(localDate, "toDate(...)");
        List list = q9Var.f153275c;
        boolean z = q9Var.d;
        n6 n6Var = q9Var.e;
        Intrinsics.checkNotNullParameter(n6Var, "<this>");
        String str3 = n6Var.f153227a;
        Object obj2 = jl7.j.f175628a;
        Intrinsics.checkNotNullParameter(str3, "<this>");
        f1 f1Var = (f1) u1.v(str3, jl7.j.f175628a);
        if (f1Var == null) {
            throw new IllegalStateException("frequency can not be null");
        }
        x7 x7Var = n6Var.f153228b;
        Intrinsics.checkNotNullParameter(x7Var, "<this>");
        PriceWithLabel priceWithLabel = new PriceWithLabel(x7Var.f153368b, x7Var.f153367a);
        x7 x7Var2 = n6Var.f153229c;
        Intrinsics.checkNotNullParameter(x7Var2, "<this>");
        PriceWithLabel priceWithLabel2 = new PriceWithLabel(x7Var2.f153368b, x7Var2.f153367a);
        List list2 = n6Var.d;
        int i = 10;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            k6 k6Var = (k6) it8.next();
            Intrinsics.checkNotNullParameter(k6Var, "<this>");
            String str4 = k6Var.f153172a;
            List list3 = k6Var.f153173b;
            Iterator it9 = it8;
            String str5 = str;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, i));
            Iterator it10 = list3.iterator();
            while (it10.hasNext()) {
                x7 x7Var3 = (x7) it10.next();
                Intrinsics.checkNotNullParameter(x7Var3, "<this>");
                Iterator it11 = it10;
                arrayList2.add(new PriceWithLabel(x7Var3.f153368b, x7Var3.f153367a));
                it10 = it11;
            }
            arrayList.add(new PaymentBreakdownCategory(str4, arrayList2));
            it8 = it9;
            str = str5;
            i = 10;
        }
        String str6 = str;
        Payment payment = new Payment(f1Var, priceWithLabel, priceWithLabel2, arrayList);
        f7 f7Var = q9Var.f;
        Intrinsics.checkNotNullParameter(f7Var, "<this>");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        String str7 = f7Var.f153101a;
        String str8 = f7Var.f153102b;
        String str9 = f7Var.f153103c;
        List list4 = f7Var.d;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
        Iterator it12 = list4.iterator();
        while (it12.hasNext()) {
            arrayList3.add(jl7.d.b((hl7.l) it12.next(), baseUrl));
        }
        kl7.i1 i1Var = new kl7.i1(str7, str8, str9, arrayList3);
        List list5 = q9Var.f153276g;
        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
        Iterator it13 = list5.iterator();
        while (it13.hasNext()) {
            arrayList4.add(mr7.a.c((kr7.b) it13.next(), baseUrl));
        }
        return new d2(str6, localDate, list, z, payment, i1Var, arrayList4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kq2.a w(m2k.e r16) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.t0.w(m2k.e):kq2.a");
    }

    public static final xc8.c x(ed8.a aVar) {
        return new xc8.c(aVar.getId(), v6d.a.valueOf(aVar.getCode()), (xc8.b) u1.u(aVar.getType(), zhm.r0.k(new Pair("GUARDIAN_CONSENT", xc8.b.GUARDIAN_CONSENT), new Pair("YOUTH_CONSENT", xc8.b.YOUTH_CONSENT))), (xc8.a) u1.u(aVar.getState(), zhm.r0.k(new Pair("GIVEN", xc8.a.GIVEN), new Pair("NOT_GIVEN", xc8.a.NOT_GIVEN))), oi0.d.Y(aVar.getCreatedDate()));
    }

    public static final xc8.g y(ed8.d dVar) throws Throwable {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        Object objA5;
        String strC = dVar.getJuniorId();
        v6d.a aVar = v6d.a.FIRST_PARTY_MARKETING;
        try {
            m.Companion aVar2 = yhm.m.INSTANCE;
            ed8.a aVarA = dVar.getFirstPartyMarketing();
            objA = aVarA != null ? x(aVarA) : null;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion aVar3 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        Pair pair = new Pair(aVar, objA);
        v6d.a aVar4 = v6d.a.THIRD_PARTY_MARKETING;
        try {
            ed8.a aVarF = dVar.getThirdPartyMarketing();
            objA2 = aVarF != null ? x(aVarF) : null;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th11) {
            m.Companion aVar5 = yhm.m.INSTANCE;
            objA2 = yhm.o.a(th11);
        }
        Throwable thA2 = yhm.m.a(objA2);
        if (thA2 != null) {
            hx7.e.n(thA2);
        }
        if (objA2 instanceof yhm.n) {
            objA2 = null;
        }
        Pair pair2 = new Pair(aVar4, objA2);
        v6d.a aVar6 = v6d.a.PERSONAL_DATA_PROCESSING;
        try {
            ed8.a aVarE = dVar.getPersonalDataProcessing();
            objA3 = aVarE != null ? x(aVarE) : null;
        } catch (CancellationException e4) {
            throw e4;
        } catch (Throwable th12) {
            m.Companion aVar7 = yhm.m.INSTANCE;
            objA3 = yhm.o.a(th12);
        }
        Throwable thA3 = yhm.m.a(objA3);
        if (thA3 != null) {
            hx7.e.n(thA3);
        }
        if (objA3 instanceof yhm.n) {
            objA3 = null;
        }
        Pair pair3 = new Pair(aVar6, objA3);
        v6d.a aVar8 = v6d.a.PAYMENT_LINKS;
        try {
            ed8.a aVarD = dVar.getPaymentLinks();
            objA4 = aVarD != null ? x(aVarD) : null;
        } catch (CancellationException e5) {
            throw e5;
        } catch (Throwable th13) {
            m.Companion aVar9 = yhm.m.INSTANCE;
            objA4 = yhm.o.a(th13);
        }
        Throwable thA4 = yhm.m.a(objA4);
        if (thA4 != null) {
            hx7.e.n(thA4);
        }
        if (objA4 instanceof yhm.n) {
            objA4 = null;
        }
        Pair pair4 = new Pair(aVar8, objA4);
        v6d.a aVar10 = v6d.a.FIRST_PARTY_NFC_PAYMENTS;
        try {
            ed8.a aVarB = dVar.getFirstPartyNfcPayments();
            objA5 = aVarB != null ? x(aVarB) : null;
        } catch (CancellationException e6) {
            throw e6;
        } catch (Throwable th14) {
            m.Companion aVar11 = yhm.m.INSTANCE;
            objA5 = yhm.o.a(th14);
        }
        Throwable thA5 = yhm.m.a(objA5);
        if (thA5 != null) {
            hx7.e.n(thA5);
        }
        return new xc8.g(strC, foh.i.q(pair, pair2, pair3, pair4, new Pair(aVar10, objA5 instanceof yhm.n ? null : objA5)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.feature.store.api.model.StoreCampaignOffer z(f2e.x r39, java.lang.String r40) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.t0.z(f2e.x, java.lang.String):com.revolut.feature.store.api.model.StoreCampaignOffer");
    }
}
