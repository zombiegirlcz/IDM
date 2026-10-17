package r39;

import c97.m;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto_investments.api.model.CombinedPocketsBalance;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPosition;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.retail.wealth.resources.R$string;
import fag.t0;
import igm.g;
import igm.o;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import ip0.jl0;
import j9.i;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import jb3.l;
import kfm.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mel.i0;
import mel.j0;
import mel.q;
import o97.s;
import vel.d;
import vel.e;
import vel.f;
import zh9.u0;
import zhm.f0;
import zjh.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements bi.b, o, g, p {
    public /* synthetic */ a(Object obj2) {
    }

    public static final BigDecimal a(a aVar, CombinedPocketsBalance combinedPocketsBalance, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        aVar.getClass();
        xi0.b bVar = combinedPocketsBalance.f71373a.f115083b;
        CryptoCommodityPosition cryptoCommodityPosition = (CryptoCommodityPosition) linkedHashMap.get(new Pair(bVar, combinedPocketsBalance.e));
        Double d = (Double) linkedHashMap2.get(bVar);
        if (cryptoCommodityPosition == null) {
            return null;
        }
        ej0.b bVar2 = cryptoCommodityPosition.d;
        if (d == null) {
            return null;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return wt5.a.b(new ej0.b(bigDecimalValueOf, bVar2.f126704b), bVar2);
    }

    public static String b(StringBuilder sb6) {
        int length = sb6.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (sb6.charAt(0) << 18) + ((length >= 2 ? sb6.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb6.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb6.charAt(3) : (char) 0);
        char c2 = (char) ((iCharAt >> 16) & 255);
        char c3 = (char) ((iCharAt >> 8) & 255);
        char c5 = (char) (iCharAt & 255);
        StringBuilder sb9 = new StringBuilder(3);
        sb9.append(c2);
        if (length >= 2) {
            sb9.append(c3);
        }
        if (length >= 3) {
            sb9.append(c5);
        }
        return sb9.toString();
    }

    public static a c(i[] iVarArr) {
        if (iVarArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", iVarArr[0].getClass().getName(), Integer.valueOf(iVarArr.length)));
        }
        for (i iVar : iVarArr) {
            if (iVar.a()) {
                iVar.getMask();
            }
        }
        return new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017 A[PHI: r2
      0x0017: PHI (r2v11 java.lang.Integer) = (r2v3 java.lang.Integer), (r2v7 java.lang.Integer) binds: [B:11:0x0015, B:21:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051 A[PHI: r4
      0x0051: PHI (r4v5 java.lang.Boolean) = (r4v1 java.lang.Boolean), (r4v7 java.lang.Boolean) binds: [B:41:0x005e, B:36:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o97.s f(c97.a r6, c97.a r7) {
        /*
            o97.s r0 = new o97.s
            r1 = 0
            if (r6 == 0) goto La
            java.lang.Integer r2 = r6.getMinQueryLength()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 == 0) goto L14
            int r3 = r2.intValue()
            if (r3 < 0) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L1c
        L17:
            int r2 = r2.intValue()
            goto L32
        L1c:
            if (r7 == 0) goto L23
            java.lang.Integer r2 = r7.getMinQueryLength()
            goto L24
        L23:
            r2 = r1
        L24:
            if (r2 == 0) goto L2d
            int r3 = r2.intValue()
            if (r3 < 0) goto L2d
            goto L2e
        L2d:
            r2 = r1
        L2e:
            if (r2 == 0) goto L31
            goto L17
        L31:
            r2 = 2
        L32:
            if (r6 == 0) goto L39
            c97.h r6 = r6.getReorderByPrefix()
            goto L3a
        L39:
            r6 = r1
        L3a:
            if (r7 == 0) goto L41
            c97.h r7 = r7.getReorderByPrefix()
            goto L42
        L41:
            r7 = r1
        L42:
            if (r6 != 0) goto L47
            if (r7 != 0) goto L47
            goto L8c
        L47:
            o97.p r3 = new o97.p
            if (r6 == 0) goto L56
            java.lang.Boolean r4 = r6.getEnabled()
            if (r4 == 0) goto L56
        L51:
            boolean r4 = r4.booleanValue()
            goto L62
        L56:
            if (r7 == 0) goto L5d
            java.lang.Boolean r4 = r7.getEnabled()
            goto L5e
        L5d:
            r4 = r1
        L5e:
            if (r4 == 0) goto L61
            goto L51
        L61:
            r4 = 0
        L62:
            if (r6 == 0) goto L69
            java.lang.Integer r6 = r6.getMaxQueryLength()
            goto L6a
        L69:
            r6 = r1
        L6a:
            if (r6 == 0) goto L73
            int r5 = r6.intValue()
            if (r5 < 0) goto L73
            goto L74
        L73:
            r6 = r1
        L74:
            if (r6 != 0) goto L88
            if (r7 == 0) goto L7d
            java.lang.Integer r6 = r7.getMaxQueryLength()
            goto L7e
        L7d:
            r6 = r1
        L7e:
            if (r6 == 0) goto L87
            int r7 = r6.intValue()
            if (r7 < 0) goto L87
            r1 = r6
        L87:
            r6 = r1
        L88:
            r3.<init>(r4, r6)
            r1 = r3
        L8c:
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r39.a.f(c97.a, c97.a):o97.s");
    }

    public static s h(m mVar) {
        int iIntValue = mVar.f22334a.intValue();
        c97.o oVar = mVar.f22335b;
        return new s(iIntValue, oVar != null ? new o97.p(oVar.f22338a, oVar.f22339b) : null);
    }

    @Override // igm.g
    public void accept(Object obj2) {
        Throwable nullPointerException = (Throwable) obj2;
        String strU = v1.c.u("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ", nullPointerException);
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException();
        }
        l.v(new OnErrorNotImplementedException(strU, nullPointerException));
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        Object[] objArr = (Object[]) obj2;
        if (objArr.length != 8) {
            throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
        }
        Object obj3 = objArr[0];
        Object obj4 = objArr[1];
        Object obj5 = objArr[2];
        Object obj6 = objArr[3];
        Object obj7 = objArr[4];
        Object obj8 = objArr[5];
        Object obj9 = objArr[6];
        Object obj10 = objArr[7];
        throw null;
    }

    public ParcelableDestination d(f asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        if (asset instanceof e) {
            return new AssetDetailsDestination(asset.a(), null, false, "GlobalSearch", null, null, 54);
        }
        if (asset instanceof d) {
            return u0.c(new CryptoCommodityDetailsFeatureConfig(((d) asset).f288352a, null, null, null, 62));
        }
        if ((asset instanceof vel.c) || (asset instanceof vel.b)) {
            return g9h.c.a(asset);
        }
        throw new NoWhenBranchMatchedException();
    }

    public jl0 e(j0 j0Var, i0 i0Var) {
        int i;
        int i2;
        if (j0Var == null || i0Var == null) {
            return null;
        }
        q qVar = i0Var.f204755a;
        int i3 = htk.i.f155459b[j0Var.ordinal()];
        if (i3 == 1 || i3 == 2) {
            int i5 = htk.i.f155458a[qVar.ordinal()];
            if (i5 == 1 || i5 == 2) {
                return null;
            }
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_arrow_rates;
            i2 = R$string.wealth_details_section_suggestion_sentiment_upward_trend;
        } else if (i3 == 3) {
            int i6 = htk.i.f155458a[qVar.ordinal()];
            if (i6 != 1) {
                if (i6 == 2 || i6 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_arrow_top_down;
            i2 = R$string.wealth_details_section_suggestion_sentiment_sideway_trend;
        } else {
            if (i3 != 4 && i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            int i21 = htk.i.f155458a[qVar.ordinal()];
            if (i21 == 1) {
                return null;
            }
            if (i21 != 2) {
                if (i21 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_arrow_rates_down;
            i2 = R$string.wealth_details_section_suggestion_sentiment_downward_trend;
        }
        return htk.l.a(i, i2, "suggestions_widget_item_technicals", f0.f322471a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        ksj.b.n(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        throw null;
     */
    @Override // bi.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(bi.c r12) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r39.a.g(bi.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[PHI: r2
      0x007a: PHI (r2v18 dj0.d) = (r2v4 dj0.d), (r2v6 dj0.d) binds: [B:43:0x0078, B:50:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public myh.i i(com.revolut.feature.exchange.models.ExchangeOrderInfo r21, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r22) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r39.a.i(com.revolut.feature.exchange.models.ExchangeOrderInfo, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote):myh.i");
    }

    @Override // kfm.p
    public boolean test(Object obj2) {
        throw null;
    }

    public a(fah.c networkConnectionErrorStatusDialogMapper, n60.a keyboardControllerExtension) {
        Intrinsics.checkNotNullParameter(networkConnectionErrorStatusDialogMapper, "networkConnectionErrorStatusDialogMapper");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
    }

    public a(j keyStatsProvider) {
        Intrinsics.checkNotNullParameter(keyStatsProvider, "keyStatsProvider");
    }

    public a(t0 travelHotelsRepository) {
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
    }

    public a(a09.c repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
    }

    public a(g9h.c assetDetailsNotAvailableProvider) {
        Intrinsics.checkNotNullParameter(assetDetailsNotAvailableProvider, "assetDetailsNotAvailableProvider");
    }

    public a(kg.o gson, ae0.b mapper, by5.a configFileProvider) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(configFileProvider, "configFileProvider");
    }

    public a(l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
    }

    public a() {
    }
}
