package atg;

import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.wallets.api.module.WalletLimit;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f9059b;

    public /* synthetic */ m(v vVar, int i) {
        this.f9058a = i;
        this.f9059b = vVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Parcelable transactionLimit;
        com.revolut.feature.wallets.api.module.c cVar;
        com.revolut.feature.wallets.api.module.a aVar;
        com.revolut.feature.wallets.api.module.b bVar;
        int i = this.f9058a;
        ArrayList arrayList = null;
        v vVar = this.f9059b;
        switch (i) {
            case 0:
                String walletId = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                h hVar = (h) vVar.e;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                return hVar.f9053g.g(walletId, true);
            case 1:
                String registeredIdentityId = (String) obj2;
                Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                return (List) vVar.f9078b.get(r.a(v.Companion, registeredIdentityId));
            case 2:
                String registeredIdentityId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                List list = (List) vVar.f9079c.T2(r.a(v.Companion, registeredIdentityId2), v.f9076n);
                if (list != null) {
                    List<ysg.b> list2 = list;
                    arrayList = new ArrayList(w.t(list2, 10));
                    for (ysg.b bVar2 : list2) {
                        Object obj3 = xsg.c.f308488a;
                        Intrinsics.checkNotNullParameter(bVar2, "<this>");
                        arrayList.add(new psg.a(bVar2.getId(), bVar2.getOwnerId(), (fo3.e) u1.u(bVar2.getState(), xsg.c.f308489b), (psg.b) u1.u(bVar2.getRole(), xsg.c.f308488a)));
                    }
                }
                return arrayList;
            case 3:
                AccountId accountId = (AccountId) obj2;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                ne0.d dVar = vVar.f9078b;
                v.Companion.getClass();
                return (List) dVar.get(r.b(accountId, "CACHE_KEY_WALLET_LIMITS"));
            case 4:
                AccountId accountId2 = (AccountId) obj2;
                Intrinsics.checkNotNullParameter(accountId2, "accountId");
                xe0.e eVar = vVar.f9079c;
                v.Companion.getClass();
                List list3 = (List) eVar.T2(r.b(accountId2, "CACHE_KEY_WALLET_LIMITS"), v.f9074l);
                if (list3 == null) {
                    return null;
                }
                List<ysg.a> list4 = list3;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                for (ysg.a aVar2 : list4) {
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    xi0.a aVar3 = xi0.b.Companion;
                    String currency = aVar2.getCurrency();
                    aVar3.getClass();
                    xi0.b bVarA = xi0.a.a(currency);
                    String type = aVar2.getType();
                    if (Intrinsics.f(type, "counter")) {
                        String name = aVar2.getName();
                        com.revolut.feature.wallets.api.module.a[] aVarArrValues = com.revolut.feature.wallets.api.module.a.values();
                        int length = aVarArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                com.revolut.feature.wallets.api.module.a aVar4 = aVarArrValues[i2];
                                if (Intrinsics.f(aVar4.a(), name)) {
                                    aVar = aVar4;
                                } else {
                                    i2++;
                                }
                            } else {
                                aVar = null;
                            }
                        }
                        if (aVar == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        String counterType = aVar2.getCounterType();
                        com.revolut.feature.wallets.api.module.b[] bVarArrValues = com.revolut.feature.wallets.api.module.b.values();
                        int length2 = bVarArrValues.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                com.revolut.feature.wallets.api.module.b bVar3 = bVarArrValues[i3];
                                if (Intrinsics.f(bVar3.a(), counterType)) {
                                    bVar = bVar3;
                                } else {
                                    i3++;
                                }
                            } else {
                                bVar = null;
                            }
                        }
                        if (bVar == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        dj0.d dVar2 = new dj0.d(aVar2.getCurrentValue(), bVarA);
                        Long minValue = aVar2.getMinValue();
                        transactionLimit = new WalletLimit.CounterLimit(aVar, bVar, dVar2, minValue != null ? new dj0.d(minValue.longValue(), bVarA) : null, new dj0.d(aVar2.getMaxValue(), bVarA));
                    } else {
                        if (!Intrinsics.f(type, "transaction")) {
                            throw new IllegalStateException(j6.a.q("limit type unknown: ", aVar2.getType()));
                        }
                        String name2 = aVar2.getName();
                        com.revolut.feature.wallets.api.module.c[] cVarArrValues = com.revolut.feature.wallets.api.module.c.values();
                        int length3 = cVarArrValues.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length3) {
                                cVar = cVarArrValues[i5];
                                if (!Intrinsics.f(cVar.a(), name2)) {
                                    i5++;
                                }
                            } else {
                                cVar = null;
                            }
                        }
                        if (cVar == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        transactionLimit = new WalletLimit.TransactionLimit(cVar, new dj0.d(aVar2.getMaxValue(), bVarA));
                    }
                    arrayList2.add(transactionLimit);
                }
                return arrayList2;
            default:
                String walletId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId2, "walletId");
                h hVar2 = (h) vVar.e;
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(walletId2, "walletId");
                return hVar2.f9053g.g(walletId2, false);
        }
    }
}
