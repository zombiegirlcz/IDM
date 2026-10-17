package x26;

import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.feature.defi.common.models.domain.DeFiQuoteAmountLimitError;
import ej0.b;
import i26.l;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.serialization.json.Json;
import nkm.g;
import nkm.y;
import rd0.c;
import v26.d;
import w26.k;
import w26.o;
import x1.n;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f302510a;

    public a(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f302510a = json;
    }

    public final DeFiQuoteAmountLimitError a(Throwable error) {
        DeFiQuoteAmountLimitError.UsageLimit usageLimit;
        Object next;
        o oVar;
        v26.a aVar;
        b bVarA;
        b bVarA2;
        d dVar;
        com.revolut.feature.defi.common.models.domain.a aVar2;
        Intrinsics.checkNotNullParameter(error, "error");
        g gVar = new g(y.z(l.i(error), new n(29)));
        while (true) {
            usageLimit = null;
            if (!gVar.hasNext()) {
                next = null;
                break;
            }
            next = gVar.next();
            if (((ServerErrorException) next).f.f51362a == 29032) {
                break;
            }
        }
        ServerErrorException serverErrorException = (ServerErrorException) next;
        if (serverErrorException != null) {
            String str = serverErrorException.f51368g;
            if (str == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(c.ERROR, "DeFiQuoteErrorParser", "Amount limit error 29032 without error body", null, h0Var);
                return null;
            }
            try {
                oVar = (o) this.f302510a.b(o.Companion.serializer(), str);
            } catch (Exception e) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(c.ERROR, null, null, e, h0Var2);
                oVar = null;
            }
            if (oVar != null) {
                w26.n nVar = oVar.f293967a;
                if (nVar == null) {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(c.ERROR, "DeFiQuoteErrorParser", "Amount limit error 29032 without params", null, h0Var3);
                    return null;
                }
                Intrinsics.checkNotNullParameter(nVar, "<this>");
                String str2 = nVar.f293964a;
                int i = 0;
                if (str2 != null) {
                    v26.a[] aVarArrValues = v26.a.values();
                    int length = aVarArrValues.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        aVar = aVarArrValues[i2];
                        if (a0.z(aVar.name(), str2, true)) {
                            break;
                        }
                    }
                    aVar = null;
                } else {
                    aVar = null;
                }
                int i3 = aVar == null ? -1 : v26.b.f285673a[aVar.ordinal()];
                if (i3 == -1) {
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.b(c.WARNING, "DeFiQuoteErrorMapper", j6.a.q("Unrecognised quote error reason: ", str2), null, null, 16);
                    return null;
                }
                if (i3 == 1) {
                    w26.d dVar2 = nVar.f293965b;
                    if (dVar2 != null && (bVarA = v26.c.a(dVar2)) != null) {
                        return new DeFiQuoteAmountLimitError.BelowMinimum(bVarA);
                    }
                    h0 h0Var4 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                    rd0.d.a(c.ERROR, "DeFiQuoteErrorMapper", p.a.p("Quote error reason ", str2, " without minimumTradeAmount"), null, h0Var4);
                    return null;
                }
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                w26.d dVar3 = nVar.f293966c;
                if (dVar3 == null || (bVarA2 = v26.c.a(dVar3)) == null) {
                    h0 h0Var5 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
                    rd0.d.a(c.ERROR, "DeFiQuoteErrorMapper", p.a.p("Quote error reason ", str2, " without maximumTradeAmount"), null, h0Var5);
                    return null;
                }
                k kVar = nVar.e;
                if (kVar != null) {
                    String str3 = kVar.f293960a;
                    jo3.a aVar3 = nVar.d;
                    if (aVar3 != null) {
                        d[] dVarArrValues = d.values();
                        int length2 = dVarArrValues.length;
                        while (true) {
                            if (i >= length2) {
                                dVar = null;
                                break;
                            }
                            dVar = dVarArrValues[i];
                            if (a0.z(dVar.name(), str3, true)) {
                                break;
                            }
                            i++;
                        }
                        int i5 = dVar == null ? -1 : v26.b.f285674b[dVar.ordinal()];
                        if (i5 != -1) {
                            if (i5 == 1) {
                                aVar2 = com.revolut.feature.defi.common.models.domain.a.DAILY;
                            } else {
                                if (i5 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2 = com.revolut.feature.defi.common.models.domain.a.MONTHLY;
                            }
                            usageLimit = new DeFiQuoteAmountLimitError.UsageLimit(aVar2, mo3.a.o(aVar3), mo3.a.o(kVar.f293961b), mo3.a.o(kVar.f293962c));
                        } else {
                            CopyOnWriteArrayList copyOnWriteArrayList7 = rd0.d.f253311a;
                            rd0.d.b(c.WARNING, "DeFiQuoteErrorMapper", j6.a.q("Unrecognised quote usage limit type: ", str3), null, null, 16);
                        }
                    }
                }
                return new DeFiQuoteAmountLimitError.AboveMaximum(bVarA2, usageLimit);
            }
        }
        return null;
    }
}
