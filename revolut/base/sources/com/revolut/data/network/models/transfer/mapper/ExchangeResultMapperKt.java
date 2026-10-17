package com.revolut.data.network.models.transfer.mapper;

import a0.d;
import i0k.f;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v0.a;
import xhf.d1;
import xhf.z0;
import y71.b;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a9\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000e\u001a9\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0011\u001a-\u0010\n\u001a\u00020\t*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u00020\u0005*\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0015\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"", "Lxhf/d1;", "Lxi0/b;", "fromCcy", "toCcy", "", "walletId", "", "isExchangeModeBuy", "Ly71/b;", "toExchangeResult", "(Ljava/util/List;Lxi0/b;Lxi0/b;Ljava/lang/String;Z)Ly71/b;", "fromPocketId", "toPocketId", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ly71/b;", "transactionFrom", "transactionTo", "(Ljava/util/List;Lxhf/d1;Lxhf/d1;Ljava/lang/String;Z)Ly71/b;", "transactionFromLegId", "cryptoLegId", "(Lxhf/d1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ly71/b;", "toExchangeLogString", "(Lxhf/d1;)Ljava/lang/String;", "(Ljava/util/List;)Ljava/lang/String;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ExchangeResultMapperKt {
    private static final String toExchangeLogString(d1 d1Var) {
        z0 counterpart = d1Var.getCounterpart();
        String id10 = d1Var.getId();
        String legId = d1Var.getLegId();
        String id11 = d1Var.getAccount().getId();
        String currency = d1Var.getCurrency();
        long amount = d1Var.getAmount();
        Long lValueOf = counterpart != null ? Long.valueOf(counterpart.getAmount()) : null;
        String currency2 = counterpart != null ? counterpart.getCurrency() : null;
        Double rate = d1Var.getRate();
        StringBuilder sbM = a.m("groupId=", id10, ", legId=", legId, ", accountId=");
        j6.a.D(sbM, id11, ", currency=", currency, ", amount=");
        sbM.append(amount);
        sbM.append(", counterPartyAmount=");
        sbM.append(lValueOf);
        sbM.append(", counterPartyCurrency=");
        sbM.append(currency2);
        sbM.append(", rate=");
        sbM.append(rate);
        return sbM.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toExchangeLogString$lambda$0(d1 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return toExchangeLogString(transaction);
    }

    @NotNull
    public static final b toExchangeResult(@NotNull List<d1> list, @NotNull xi0.b fromCcy, @NotNull xi0.b toCcy, @NotNull String walletId, boolean z) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fromCcy, "fromCcy");
        Intrinsics.checkNotNullParameter(toCcy, "toCcy");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        List<d1> list2 = list;
        Iterator<T> it8 = list2.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            d1 d1Var = (d1) next;
            if (Intrinsics.f(d1Var.getCurrency(), fromCcy.f306286a) && d1Var.getCounterpart() != null) {
                break;
            }
        }
        d1 d1Var2 = (d1) next;
        if (d1Var2 == null) {
            throw new IllegalStateException(d.u(a.m("Can't find transaction in response: fromCcy=", fromCcy.f306286a, ", toCcy=", toCcy.f306286a, ", walletId="), walletId, ", transactions=", toExchangeLogString(list)));
        }
        Iterator<T> it9 = list2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            d1 d1Var3 = (d1) next2;
            if (Intrinsics.f(d1Var3.getCurrency(), toCcy.f306286a) && d1Var3.getCounterpart() != null) {
                obj2 = next2;
                break;
            }
        }
        d1 d1Var4 = (d1) obj2;
        if (d1Var4 != null) {
            return toExchangeResult(list, d1Var2, d1Var4, walletId, z);
        }
        throw new IllegalStateException(d.u(a.m("Can't find transaction in response: fromCcy=", fromCcy.f306286a, ", toCcy=", toCcy.f306286a, ", walletId="), walletId, ", transactions=", toExchangeLogString(list)));
    }

    private static final String toExchangeLogString(List<d1> list) {
        return d0.k0(list, null, "[", "]", 0, new f(18), 25);
    }

    @NotNull
    public static final b toExchangeResult(@NotNull List<d1> list, @NotNull String fromPocketId, @NotNull String toPocketId, @NotNull String walletId, boolean z) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fromPocketId, "fromPocketId");
        Intrinsics.checkNotNullParameter(toPocketId, "toPocketId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        List<d1> list2 = list;
        Iterator<T> it8 = list2.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((d1) next).getAccount().getId(), fromPocketId)) {
                break;
            }
        }
        d1 d1Var = (d1) next;
        if (d1Var != null) {
            Iterator<T> it9 = list2.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next2 = it9.next();
                if (Intrinsics.f(((d1) next2).getAccount().getId(), toPocketId)) {
                    obj2 = next2;
                    break;
                }
            }
            d1 d1Var2 = (d1) obj2;
            if (d1Var2 == null) {
                d1Var2 = d1Var;
            }
            return toExchangeResult(list, d1Var, d1Var2, walletId, z);
        }
        throw new IllegalStateException(d.u(a.m("Can't find transaction in response: fromPocketId=", fromPocketId, ", toPocketId=", toPocketId, ", walletId="), walletId, ", transactions=", toExchangeLogString(list)));
    }

    private static final b toExchangeResult(List<d1> list, d1 d1Var, d1 d1Var2, String str, boolean z) {
        xi0.a aVar = xi0.b.Companion;
        String currency = d1Var.getCurrency();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        xi0.b bVarA2 = xi0.a.a(d1Var2.getCurrency());
        d1 d1Var3 = ((cp5.d.z(bVarA) || cp5.d.z(bVarA2)) && ((cp5.d.z(bVarA) && !cp5.d.z(bVarA2)) || ((cp5.d.z(bVarA) || !cp5.d.z(bVarA2)) && z))) ? d1Var2 : d1Var;
        if (!cp5.d.z(bVarA) && !cp5.d.z(bVarA2)) {
            d1Var2 = null;
        } else if ((!cp5.d.z(bVarA2) || cp5.d.z(bVarA)) && ((!cp5.d.z(bVarA2) && cp5.d.z(bVarA)) || !z)) {
            d1Var2 = d1Var;
        }
        return toExchangeResult(d1Var, d1Var3.getLegId(), d1Var2 != null ? d1Var2.getLegId() : null, str);
    }

    private static final b toExchangeResult(d1 d1Var, String str, String str2, String str3) {
        String currency;
        z0 counterpart = d1Var.getCounterpart();
        if (counterpart != null) {
            long amount = counterpart.getAmount();
            z0 counterpart2 = d1Var.getCounterpart();
            if (counterpart2 != null && (currency = counterpart2.getCurrency()) != null) {
                long amount2 = d1Var.getAmount();
                xi0.a aVar = xi0.b.Companion;
                String currency2 = d1Var.getCurrency();
                aVar.getClass();
                dj0.d dVar = new dj0.d(amount2, xi0.a.a(currency2));
                dj0.d dVar2 = new dj0.d(amount, xi0.a.a(currency));
                Double rate = d1Var.getRate();
                if (rate != null) {
                    return new b(dVar, dVar2, rate.doubleValue(), d1Var.getId(), str, str2, str3);
                }
                throw new IllegalStateException(j6.a.q("Transaction must have rate: ", toExchangeLogString(d1Var)));
            }
            throw new IllegalStateException(j6.a.q("Transaction must have a counter party: ", toExchangeLogString(d1Var)));
        }
        throw new IllegalStateException(j6.a.q("Transaction must have a counter party: ", toExchangeLogString(d1Var)));
    }
}
