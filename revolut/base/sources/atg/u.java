package atg;

import android.os.Parcelable;
import com.revolut.feature.wallets.api.module.WalletLimit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.q implements Function1 {
    public static final u f = new u();

    public u() {
        super(1, xsg.b.class, "toDomain", "toDomain(Lcom/revolut/feature/wallets/impl/network/dto/WalletLimitsDto;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b currency;
        com.revolut.feature.wallets.api.module.c cVar;
        com.revolut.feature.wallets.api.module.b bVar;
        com.revolut.feature.wallets.api.module.a aVar;
        long jLongValue;
        com.revolut.feature.wallets.api.module.b bVar2;
        zsg.c p0 = (zsg.c) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        xi0.a aVar2 = xi0.b.Companion;
        String baseCurrency = p0.getBaseCurrency();
        aVar2.getClass();
        xi0.b bVarA = xi0.a.a(baseCurrency);
        List<zsg.b> limits = p0.getLimits();
        ArrayList arrayList = new ArrayList();
        for (zsg.b bVar3 : limits) {
            if (bVar3.getCurrency() != null) {
                xi0.a aVar3 = xi0.b.Companion;
                String currency2 = bVar3.getCurrency();
                aVar3.getClass();
                currency = xi0.a.a(currency2);
            } else {
                currency = bVarA;
            }
            Intrinsics.checkNotNullParameter(bVar3, "<this>");
            Intrinsics.checkNotNullParameter(currency, "currency");
            String type = bVar3.getType();
            int i = 0;
            Parcelable transactionLimit = null;
            if (Intrinsics.f(type, "counter")) {
                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                Intrinsics.checkNotNullParameter(currency, "currency");
                String counterType = bVar3.getCounterType();
                if (counterType != null) {
                    com.revolut.feature.wallets.api.module.b[] bVarArrValues = com.revolut.feature.wallets.api.module.b.values();
                    int length = bVarArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            bVar2 = null;
                            break;
                        }
                        bVar2 = bVarArrValues[i2];
                        if (Intrinsics.f(bVar2.a(), counterType)) {
                            break;
                        }
                        i2++;
                    }
                    bVar = bVar2;
                } else {
                    bVar = null;
                }
                String name = bVar3.getName();
                com.revolut.feature.wallets.api.module.a[] aVarArrValues = com.revolut.feature.wallets.api.module.a.values();
                int length2 = aVarArrValues.length;
                while (true) {
                    if (i >= length2) {
                        aVar = null;
                        break;
                    }
                    com.revolut.feature.wallets.api.module.a aVar4 = aVarArrValues[i];
                    if (Intrinsics.f(aVar4.a(), name)) {
                        aVar = aVar4;
                        break;
                    }
                    i++;
                }
                Long currentValue = bVar3.getCurrentValue();
                if (aVar == null || bVar == null || currentValue == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("limit type counter should have: name(" + aVar + "), counterType(" + bVar + "), currentValue(" + currentValue + ")");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    int i3 = xsg.a.f308487a[bVar.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Long maxValue = bVar3.getMaxValue();
                        jLongValue = maxValue != null ? maxValue.longValue() : -1L;
                    } else if (bVar3.getMaxValue() == null) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("limit type counter debit should have: maxValue(" + bVar3.getMaxValue() + ")");
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                    } else {
                        jLongValue = bVar3.getMaxValue().longValue();
                    }
                    dj0.d dVar = new dj0.d(currentValue.longValue(), currency);
                    Long minValue = bVar3.getMinValue();
                    transactionLimit = new WalletLimit.CounterLimit(aVar, bVar, dVar, minValue != null ? new dj0.d(minValue.longValue(), currency) : null, new dj0.d(jLongValue, currency));
                }
            } else if (Intrinsics.f(type, "transaction")) {
                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                Intrinsics.checkNotNullParameter(currency, "currency");
                String name2 = bVar3.getName();
                com.revolut.feature.wallets.api.module.c[] cVarArrValues = com.revolut.feature.wallets.api.module.c.values();
                int length3 = cVarArrValues.length;
                while (true) {
                    if (i >= length3) {
                        cVar = null;
                        break;
                    }
                    cVar = cVarArrValues[i];
                    if (Intrinsics.f(cVar.a(), name2)) {
                        break;
                    }
                    i++;
                }
                Long maxValue2 = bVar3.getMaxValue();
                if (cVar == null || maxValue2 == null) {
                    IllegalStateException illegalStateException3 = new IllegalStateException("limit type transaction should have: name(" + cVar + ") and maxValue(" + maxValue2 + ")");
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                } else {
                    transactionLimit = new WalletLimit.TransactionLimit(cVar, new dj0.d(maxValue2.longValue(), currency));
                }
            } else {
                IllegalStateException illegalStateException4 = new IllegalStateException(j6.a.q("limit type unknown: ", bVar3.getType()));
                h0 h0Var4 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException4, h0Var4);
            }
            if (transactionLimit != null) {
                arrayList.add(transactionLimit);
            }
        }
        return arrayList;
    }
}
