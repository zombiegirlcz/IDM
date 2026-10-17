package lue;

import aue.i;
import aue.j;
import aue.k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import uue.b;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList a(uue.d dto) {
        aue.c cVarValueOf;
        xi0.b bVar;
        String str;
        String str2;
        dj0.d dVar;
        Object iVar;
        Object obj2;
        String str3;
        j jVar;
        j jVar2;
        Object kVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        xi0.a aVar = xi0.b.Companion;
        String limitsBaseCurrency = dto.getLimitsBaseCurrency();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(limitsBaseCurrency);
        String topupCurrency = dto.getTopupCurrency();
        String str4 = null;
        xi0.b bVarA2 = topupCurrency != null ? xi0.a.a(topupCurrency) : null;
        List<uue.b> limits = dto.getLimits();
        ArrayList arrayList = new ArrayList();
        for (uue.b bVar2 : limits) {
            try {
                cVarValueOf = aue.c.valueOf(bVar2.getType());
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, str4, str4, e, h0Var);
                cVarValueOf = str4;
            }
            if (cVarValueOf == 0) {
                String str5 = str4;
                str3 = str5;
                bVar = bVarA2;
                iVar = str5;
            } else {
                switch (c.f200232a[cVarValueOf.ordinal()]) {
                    case 1:
                        bVar = bVarA2;
                        b.C1565b upperBoundLimit = bVar2.getUpperBoundLimit();
                        if (upperBoundLimit == null) {
                            IllegalStateException illegalStateException = new IllegalStateException("Limit of type " + cVarValueOf + " is expected to contain upperBoundLimit");
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                            obj2 = null;
                            str3 = null;
                            iVar = obj2;
                        } else {
                            dj0.d dVar2 = new dj0.d(upperBoundLimit.getTotal(), bVarA);
                            b.a limitInTopupCurrency = upperBoundLimit.getLimitInTopupCurrency();
                            if (limitInTopupCurrency == null) {
                                str = null;
                            } else if (bVar != null) {
                                str2 = null;
                                dVar = new dj0.d(limitInTopupCurrency.getTotal(), bVar);
                                iVar = new i(cVarValueOf, dVar2, dVar);
                                str3 = str2;
                            } else {
                                IllegalStateException illegalStateException2 = new IllegalStateException("Limit in top-up currency was present " + limitInTopupCurrency.getTotal() + ", but topUpCurrency was null: " + bVar);
                                h0 h0Var3 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                str = null;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var3);
                            }
                            dVar = str;
                            str2 = str;
                            iVar = new i(cVarValueOf, dVar2, dVar);
                            str3 = str2;
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        b.C1565b upperBoundLimit2 = bVar2.getUpperBoundLimit();
                        if (upperBoundLimit2 == null) {
                            IllegalStateException illegalStateException3 = new IllegalStateException("Limit of type " + cVarValueOf + " is expected to contain upperBoundLimit");
                            h0 h0Var4 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, str4, str4, illegalStateException3, h0Var4);
                            kVar = str4;
                            bVar = bVarA2;
                        } else {
                            dj0.d dVar3 = new dj0.d(upperBoundLimit2.getTotal(), bVarA);
                            dj0.d dVar4 = new dj0.d(upperBoundLimit2.getUsed(), bVarA);
                            dj0.d dVar5 = new dj0.d(upperBoundLimit2.getTotal() - upperBoundLimit2.getUsed(), bVarA);
                            b.a limitInTopupCurrency2 = upperBoundLimit2.getLimitInTopupCurrency();
                            if (limitInTopupCurrency2 != null) {
                                if (bVarA2 == null) {
                                    long total = limitInTopupCurrency2.getTotal();
                                    long used = limitInTopupCurrency2.getUsed();
                                    StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(total, "Limit in top-up currency was present ", " ");
                                    sbV.append(used);
                                    sbV.append(", but topUpCurrency was null: ");
                                    bVar = bVarA2;
                                    sbV.append(bVar);
                                    IllegalStateException illegalStateException4 = new IllegalStateException(sbV.toString());
                                    h0 h0Var5 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException4, h0Var5);
                                    jVar2 = null;
                                } else {
                                    bVar = bVarA2;
                                    jVar2 = new j(new dj0.d(limitInTopupCurrency2.getTotal(), bVar), new dj0.d(limitInTopupCurrency2.getUsed(), bVar), new dj0.d(limitInTopupCurrency2.getTotal() - limitInTopupCurrency2.getUsed(), bVar));
                                }
                                jVar = jVar2;
                            } else {
                                bVar = bVarA2;
                                jVar = null;
                            }
                            kVar = new k(cVarValueOf, dVar3, dVar4, dVar5, jVar);
                        }
                        obj2 = kVar;
                        str3 = null;
                        iVar = obj2;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            if (iVar != null) {
                arrayList.add(iVar);
            }
            bVarA2 = bVar;
            str4 = str3;
        }
        return arrayList;
    }
}
