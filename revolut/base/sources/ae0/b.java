package ae0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f3473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f3474b;

    public b(c90.c uiResources, d currencyLocalizer) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(currencyLocalizer, "currencyLocalizer");
        this.f3473a = uiResources;
        this.f3474b = currencyLocalizer;
    }

    public static xd0.a a(sd0.a config) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(config, "config");
        List listA = config.a();
        ArrayList arrayList2 = new ArrayList(w.t(listA, 10));
        Iterator it8 = listA.iterator();
        while (it8.hasNext()) {
            arrayList2.add(f((sd0.d) it8.next()));
        }
        List listB = config.b();
        if (listB != null) {
            List list = listB;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList.add(f((sd0.d) it9.next()));
            }
        } else {
            arrayList = null;
        }
        return new xd0.a(arrayList2, arrayList);
    }

    public static xd0.b f(sd0.d dVar) {
        String strA = dVar.a();
        String strF = dVar.f();
        Map mapI = dVar.i();
        Map mapJ = dVar.j();
        return new xd0.b(strA, strF, dVar.c(), dVar.m(), dVar.k(), dVar.l(), dVar.g(), dVar.b(), dVar.d(), dVar.e(), mapI, mapJ, dVar.n(), dVar.h());
    }

    public final String b(String str, String str2) {
        StringBuilder sbL = v0.a.l(str, "/");
        String upperCase = str2.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        sbL.append(upperCase);
        sbL.append("-96x96@");
        int iB = this.f3473a.b();
        String str3 = "2x";
        if (iB != 120) {
            if (iB == 160) {
                str3 = "3x";
            } else if (iB == 240) {
                str3 = "4x";
            }
        }
        return v0.a.i(sbL, str3, ".png");
    }

    public final LinkedHashMap c(xd0.a currenciesInfoEntity) {
        Intrinsics.checkNotNullParameter(currenciesInfoEntity, "currenciesInfoEntity");
        LinkedHashMap linkedHashMapE = e(currenciesInfoEntity.getCurrencies(), true);
        List deprecatedCurrencies = currenciesInfoEntity.getDeprecatedCurrencies();
        return r0.p(linkedHashMapE, deprecatedCurrencies != null ? e(deprecatedCurrencies, false) : r0.g());
    }

    public final sd0.d d(wd0.c cVar, wd0.b bVar) {
        wd0.d dVar;
        String lightBaseUrl;
        String darkBaseUrl;
        Object next;
        String overrideDisplayIconCurrencyCode = cVar.getOverrideDisplayIconCurrencyCode();
        if (overrideDisplayIconCurrencyCode == null) {
            overrideDisplayIconCurrencyCode = cVar.getCode();
        }
        if (cVar.getOverrideDisplayIconCurrencyCode() != null) {
            Map iconsConfigMap = bVar.getIconsConfig().getIconsConfigMap();
            String overrideDisplayIconCurrencyCode2 = cVar.getOverrideDisplayIconCurrencyCode();
            Iterator it8 = bVar.getCurrencies().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((wd0.c) next).getCode(), overrideDisplayIconCurrencyCode2)) {
                    break;
                }
            }
            wd0.c cVar2 = (wd0.c) next;
            String type = cVar2 != null ? cVar2.getType() : null;
            if (type == null) {
                type = cVar.getType();
            }
            dVar = (wd0.d) iconsConfigMap.get(type);
        } else {
            dVar = (wd0.d) bVar.getIconsConfig().getIconsConfigMap().get(cVar.getType());
        }
        String code = cVar.getCode();
        String genericLocalizedName = cVar.getGenericLocalizedName();
        Map specificLocalizedNames = cVar.getSpecificLocalizedNames();
        Map specificLocalizedSymbols = cVar.getSpecificLocalizedSymbols();
        int decimals = cVar.getDecimals();
        String type2 = cVar.getType();
        String symbol = cVar.getSymbol();
        String ticker = cVar.getTicker();
        if (ticker == null) {
            ticker = cVar.getCode();
        }
        String str = ticker;
        Integer displayDecimals = cVar.getDisplayDecimals();
        String displayPattern = cVar.getDisplayPattern();
        String str2 = "";
        if (dVar == null || (lightBaseUrl = dVar.getLightBaseUrl()) == null) {
            m70.a.c(t0.f186434a);
            lightBaseUrl = "";
        }
        String strB = b(lightBaseUrl, overrideDisplayIconCurrencyCode);
        if (dVar == null || (darkBaseUrl = dVar.getDarkBaseUrl()) == null) {
            m70.a.c(t0.f186434a);
        } else {
            str2 = darkBaseUrl;
        }
        String strB2 = b(str2, overrideDisplayIconCurrencyCode);
        Boolean isStablecoin = cVar.getIsStablecoin();
        return new sd0.d(code, genericLocalizedName, decimals, type2, symbol, str, strB, strB2, displayDecimals, displayPattern, specificLocalizedNames, specificLocalizedSymbols, Boolean.valueOf(isStablecoin != null ? isStablecoin.booleanValue() : false), cVar.getSettlementDate());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:31:0x0093, B:37:0x00a4, B:41:0x00bd), top: B:74:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap e(java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae0.b.e(java.util.List, boolean):java.util.LinkedHashMap");
    }
}
