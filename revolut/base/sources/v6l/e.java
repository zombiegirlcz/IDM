package v6l;

import com.revolut.feature.cards.models.design.CardDesignUnlockRequirement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes12.dex */
public final class e {
    public static c93.j a(n6l.i iVar, n6l.w wVar) {
        c93.l lVar;
        if (wVar != null) {
            return io3.h.v(wVar);
        }
        if (iVar == null) {
            c93.j.Companion.getClass();
            return c93.j.f22287c;
        }
        c93.l lVar2 = new c93.l(mo3.a.o(iVar.getPrice()), mo3.a.o(iVar.getPrice()), null, null);
        jo3.a originalPrice = iVar.getOriginalPrice();
        if (originalPrice != null) {
            lVar = new c93.l(mo3.a.o(originalPrice), mo3.a.o(originalPrice), null, null);
        } else {
            c93.l.Companion.getClass();
            lVar = c93.l.e;
        }
        return new c93.j(lVar2, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0234  */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [e93.e0] */
    /* JADX WARN: Type inference failed for: r10v9, types: [e93.x] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [c93.d] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [e93.u] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r1v12, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [e93.w] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r24v6, types: [e93.m] */
    /* JADX WARN: Type inference failed for: r27v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r4v9, types: [c93.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e93.d b(n6l.u r32) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v6l.e.b(n6l.u):e93.d");
    }

    public static ArrayList c(List designs) {
        Intrinsics.checkNotNullParameter(designs, "designs");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = designs.iterator();
        while (it8.hasNext()) {
            e93.d dVarB = b((n6l.u) it8.next());
            if (dVarB != null) {
                arrayList.add(dVarB);
            }
        }
        return arrayList;
    }

    public static ArrayList d(List designs) {
        Iterator it8;
        n6l.a0 a0Var;
        List list;
        String str;
        ArrayList arrayList;
        e93.e0 e0Var;
        e93.m mVar;
        e93.w wVar;
        e93.w wVar2;
        e93.b bVar;
        CardDesignUnlockRequirement cardDesignUnlockRequirement;
        e93.e eVar;
        dj0.d dVar;
        n6l.q videoBackground;
        n6l.e catalogue;
        n6l.k videoPreview;
        n6l.r colorPicker;
        List limits;
        n6l.y assets;
        Intrinsics.checkNotNullParameter(designs, "designs");
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = designs.iterator();
        while (it9.hasNext()) {
            n6l.a0 a0Var2 = (n6l.a0) it9.next();
            e93.m0 m0Var = a0Var2.getDisposable() ? e93.m0.DISPOSABLE : e93.m0.VIRTUAL;
            String strC = a0Var2.getBrand();
            Locale UK = Locale.UK;
            e93.b bVar2 = (e93.b) u1.v(v0.a.j(UK, "UK", strC, UK, "toUpperCase(...)"), hx7.l.j());
            if (bVar2 == null) {
                it8 = it9;
                eVar = null;
            } else {
                String strF = a0Var2.getCode();
                Intrinsics.checkNotNullExpressionValue(UK, "UK");
                String upperCase = strF.toUpperCase(UK);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                b93.b bVar3 = new b93.b(upperCase);
                String strK = a0Var2.getGroup();
                String str2 = "";
                if (strK == null) {
                    m70.a.c(kotlin.jvm.internal.t0.f186434a);
                    strK = "";
                }
                c93.j jVarA = a(a0Var2.getFee(), a0Var2.getPricing());
                n6l.z zVarA = a0Var2.getAssets();
                List textures = (zVarA == null || (assets = zVarA.getAssets()) == null) ? null : assets.getTextures();
                if (textures == null) {
                    textures = zhm.f0.f322471a;
                }
                e93.k0 k0Var = new e93.k0(textures);
                n6l.o oVarD = a0Var2.getCardLimits();
                if (oVarD == null || (limits = oVarD.getLimits()) == null) {
                    it8 = it9;
                    a0Var = a0Var2;
                    list = zhm.f0.f322471a;
                } else {
                    List<n6l.n> list2 = limits;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                    for (n6l.n nVar : list2) {
                        Intrinsics.checkNotNullParameter(nVar, "<this>");
                        e93.z zVar = e93.a0.Companion;
                        String type = nVar.getType();
                        zVar.getClass();
                        arrayList3.add(new e93.y(e93.z.a(type), nVar.getReached(), nVar.getThreshold(), nVar.getUnblockDate()));
                        a0Var2 = a0Var2;
                        it9 = it9;
                    }
                    it8 = it9;
                    a0Var = a0Var2;
                    list = arrayList3;
                }
                List list3 = list;
                List listI = a0Var.getIb.b.Features java.lang.String();
                ArrayList arrayList4 = new ArrayList(zhm.w.t(listI, 10));
                Iterator it10 = listI.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(new c93.h((String) it10.next()));
                }
                e93.k kVar = e93.l.Companion;
                String strB = a0Var.getAvailabilityStatus();
                kVar.getClass();
                e93.l lVarA = e93.k.a(strB);
                e93.s sVar = e93.t.Companion;
                String strM = a0Var.getLockReason();
                sVar.getClass();
                e93.t tVarA = e93.s.a(strM);
                String strS = a0Var.getUnlockHint();
                String strR = a0Var.getTitle();
                if (strR == null) {
                    m70.a.c(kotlin.jvm.internal.t0.f186434a);
                    str = "";
                } else {
                    str = strR;
                }
                String strG = a0Var.getDescription();
                if (strG == null) {
                    m70.a.c(kotlin.jvm.internal.t0.f186434a);
                } else {
                    str2 = strG;
                }
                String strL = a0Var.getGroupName();
                h93.i0 i0Var = h93.j0.Companion;
                String strP = a0Var.getProductType();
                i0Var.getClass();
                h93.j0 j0VarA = h93.i0.a(strP);
                h93.k0 k0Var2 = h93.l0.Companion;
                String strQ = a0Var.getSubProductType();
                k0Var2.getClass();
                h93.l0 l0VarA = h93.k0.a(strQ);
                n6l.z zVarA2 = a0Var.getAssets();
                if (zVarA2 == null || (colorPicker = zVarA2.getColorPicker()) == null) {
                    arrayList = arrayList4;
                    e0Var = null;
                } else {
                    arrayList = arrayList4;
                    e0Var = new e93.e0(colorPicker.getLightUrl(), colorPicker.getDarkUrl());
                }
                n6l.z zVarA3 = a0Var.getAssets();
                String preview = (zVarA3 == null || (videoPreview = zVarA3.getVideoPreview()) == null) ? null : videoPreview.getPreview();
                n6l.z zVarA4 = a0Var.getAssets();
                if (zVarA4 == null || (catalogue = zVarA4.getCatalogue()) == null) {
                    mVar = null;
                } else {
                    Intrinsics.checkNotNullParameter(catalogue, "<this>");
                    mVar = new e93.m(catalogue.getLight(), catalogue.getDark());
                }
                n6l.z zVarA5 = a0Var.getAssets();
                if (zVarA5 == null || (videoBackground = zVarA5.getVideoBackground()) == null) {
                    wVar = null;
                } else {
                    Intrinsics.checkNotNullParameter(videoBackground, "<this>");
                    wVar = new e93.w(videoBackground.getLightUrl(), videoBackground.getDarkUrl());
                }
                String strE = a0Var.getCardProfileId();
                jo3.a aVarN = a0Var.getMonthlyFee();
                dj0.d dVarO = aVarN != null ? mo3.a.o(aVarN) : null;
                n6l.x xVarT = a0Var.getUnlockRequirement();
                if (xVarT != null) {
                    Intrinsics.checkNotNullParameter(xVarT, "<this>");
                    e93.t tVarA2 = e93.s.a(xVarT.getLockReason());
                    String unlockHint = xVarT.getUnlockHint();
                    wVar2 = wVar;
                    String productId = xVarT.getProductId();
                    jo3.a price = xVarT.getPrice();
                    if (price != null) {
                        dj0.d dVarO2 = mo3.a.o(price);
                        bVar = bVar2;
                        dVar = dVarO2;
                    } else {
                        bVar = bVar2;
                        dVar = null;
                    }
                    cardDesignUnlockRequirement = new CardDesignUnlockRequirement(tVarA2, unlockHint, productId, dVar);
                } else {
                    wVar2 = wVar;
                    bVar = bVar2;
                    cardDesignUnlockRequirement = null;
                }
                eVar = new e93.e(bVar, bVar3, strK, jVarA, m0Var, k0Var, list3, arrayList, lVarA, tVarA, strS, str, str2, strL, j0VarA, l0VarA, e0Var, wVar2, mVar, preview, strE, dVarO, cardDesignUnlockRequirement);
            }
            if (eVar != null) {
                arrayList2.add(eVar);
            }
            it9 = it8;
        }
        return arrayList2;
    }
}
