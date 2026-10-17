package v6l;

import com.revolut.feature.cards.models.design.CardDesignUnlockRequirement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.DateTime;
import s6l.b;

/* JADX INFO: loaded from: classes12.dex */
public final class f {
    public static s6l.m a(e93.d domain) {
        s6l.e eVar;
        s6l.b bVar;
        s6l.f fVar;
        ArrayList arrayList;
        s6l.d dVar;
        String str;
        s6l.d dVar2;
        String str2;
        s6l.h hVar;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String strG = u1.g(domain.f123826b, hx7.l.j());
        String str3 = domain.f123827c.f13615a;
        s6l.o oVarJ = jb3.l.J(domain.e);
        String str4 = domain.d;
        List<e93.y> list = domain.f123833n;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        for (e93.y yVar : list) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
            arrayList2.add(new s6l.i(yVar.f123901c, yVar.d, yVar.f123899a.a(), yVar.f123900b));
        }
        ArrayList arrayList3 = domain.f123828g;
        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
        Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            arrayList4.add(((c93.h) it8.next()).f22286a);
        }
        String strG2 = u1.g(domain.f, zhm.r0.k(new Pair("PLASTIC", e93.b0.PLASTIC), new Pair("METAL", e93.b0.METAL)));
        e93.j jVar = domain.f123829h;
        e93.h hVar2 = jVar.f123873a;
        b.C1443b c1443b = hVar2 != null ? new b.C1443b(hVar2.f123868a, hVar2.f123869b, hVar2.f123870c, hVar2.d, hVar2.e, hVar2.f, hVar2.f123871g, hVar2.f123872h) : null;
        e93.g gVar = jVar.f123874b;
        b.a aVar = gVar != null ? new b.a(gVar.f123862a, gVar.f123863b, gVar.f123864c) : null;
        e93.e0 e0Var = jVar.f123875c;
        s6l.b bVar2 = new s6l.b(c1443b, aVar, e0Var != null ? new s6l.k(e0Var.f123857a, e0Var.f123858b) : null);
        e93.n nVar = domain.i;
        if (nVar != null) {
            List<e93.a> list2 = nVar.f123882a;
            ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
            for (e93.a aVar2 : list2) {
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                arrayList5.add(new s6l.a(aVar2.f123822a, aVar2.f123823b));
            }
            eVar = new s6l.e(arrayList5, nVar.f123883b, nVar.f123884c, jb3.l.J(nVar.d));
        } else {
            eVar = null;
        }
        c93.d dVar3 = domain.k;
        s6l.c cVar = dVar3 != null ? new s6l.c(hx7.a.A(dVar3.f22271a), hx7.a.A(dVar3.f22272b)) : null;
        c93.j jVar2 = domain.f123831l;
        s6l.o oVarJ2 = jVar2 != null ? jb3.l.J(jVar2) : null;
        e93.u uVar = domain.f123832m;
        if (uVar != null) {
            bVar = bVar2;
            fVar = new s6l.f(hx7.a.A(uVar.f123892a), uVar.f123893b.getMillis());
        } else {
            bVar = bVar2;
            fVar = null;
        }
        e93.w wVar = domain.f123839w;
        s6l.g gVar2 = wVar != null ? new s6l.g(wVar.f123894a, wVar.f123895b) : null;
        String strName = domain.o.name();
        e93.t tVar = domain.f123834p;
        String strName2 = tVar != null ? tVar.name() : null;
        String str5 = domain.f123835q;
        String str6 = domain.f123836r;
        String str7 = domain.f123837s;
        String str8 = domain.f123838t;
        h93.j0 j0Var = domain.u;
        String strName3 = j0Var != null ? j0Var.name() : null;
        h93.l0 l0Var = domain.v;
        String strName4 = l0Var != null ? l0Var.name() : null;
        String str9 = domain.f123841y;
        e93.m mVar = domain.f123840x;
        s6l.g gVar3 = gVar2;
        if (mVar != null) {
            arrayList = arrayList4;
            dVar = new s6l.d(mVar.f123880a, mVar.f123881b);
        } else {
            arrayList = arrayList4;
            dVar = null;
        }
        String str10 = domain.z;
        e93.x xVar = domain.f123830j;
        if (xVar != null) {
            Intrinsics.checkNotNullParameter(xVar, "<this>");
            str = str10;
            dVar2 = dVar;
            e93.a aVar3 = xVar.f123896a;
            Intrinsics.checkNotNullParameter(aVar3, "<this>");
            str2 = strG;
            hVar = new s6l.h(new s6l.a(aVar3.f123822a, aVar3.f123823b), xVar.f123897b, xVar.f123898c.name(), xVar.d);
        } else {
            str = str10;
            dVar2 = dVar;
            str2 = strG;
            hVar = null;
        }
        List list3 = domain.A;
        ArrayList arrayList6 = new ArrayList(zhm.w.t(list3, 10));
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            arrayList6.add(((wi0.b) it9.next()).f297794a);
        }
        dj0.d dVar4 = domain.B;
        return new s6l.m(str2, str3, str4, oVarJ, arrayList2, arrayList, strG2, bVar, eVar, cVar, oVarJ2, fVar, gVar3, strName, strName2, str5, str6, str7, str8, strName3, strName4, dVar2, str9, str, hVar, arrayList6, dVar4 != null ? hx7.a.A(dVar4) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    public static e93.d b(s6l.m entity) {
        ?? arrayList;
        e93.n nVar;
        ArrayList arrayList2;
        e93.b bVar;
        e93.u uVar;
        e93.t tVar;
        e93.b bVar2;
        e93.m mVar;
        b93.b bVar3;
        e93.x xVar;
        String backgroundUrl;
        Intrinsics.checkNotNullParameter(entity, "entity");
        b93.b bVar4 = new b93.b(entity.getCode());
        e93.b bVar5 = (e93.b) u1.u(entity.getBrand(), hx7.l.j());
        String strQ = entity.getGroupId();
        c93.j jVarY = jb3.l.y(entity.getPricing());
        List listI = entity.getCardLimits();
        if (listI != null) {
            List<s6l.i> list = listI;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            for (s6l.i iVar : list) {
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                e93.z zVar = e93.a0.Companion;
                String type = iVar.getType();
                zVar.getClass();
                arrayList.add(new e93.y(e93.z.a(type), iVar.getReached(), iVar.getThreshold(), iVar.getUnblockDate()));
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        ?? r142 = arrayList;
        List listP = entity.getIb.b.Features java.lang.String();
        ArrayList arrayList3 = new ArrayList(zhm.w.t(listP, 10));
        Iterator it8 = listP.iterator();
        while (it8.hasNext()) {
            arrayList3.add(new c93.h((String) it8.next()));
        }
        b.C1443b assets3d = entity.getAssets().getAssets3d();
        e93.h hVar = assets3d != null ? new e93.h(assets3d.getNormalLightUrl(), assets3d.getColorLightUrl(), assets3d.getRoughnessLightUrl(), assets3d.getMetallicLightUrl(), assets3d.getNormalDarkUrl(), assets3d.getColorDarkUrl(), assets3d.getRoughnessDarkUrl(), assets3d.getMetallicDarkUrl()) : null;
        b.a assets2d = entity.getAssets().getAssets2d();
        e93.g gVar = assets2d != null ? new e93.g(assets2d.getFrontUrl(), assets2d.getBackUrl(), assets2d.getBackSideOverlayUrl()) : null;
        s6l.k colorPicker = entity.getAssets().getColorPicker();
        e93.j jVar = new e93.j(hVar, gVar, colorPicker != null ? new e93.e0(colorPicker.getLightUrl(), colorPicker.getDarkUrl()) : null);
        s6l.e eVarM = entity.getCustomisation();
        if (eVarM != null) {
            List<s6l.a> area = eVarM.getArea();
            ArrayList arrayList4 = new ArrayList(zhm.w.t(area, 10));
            for (s6l.a aVar : area) {
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                arrayList4.add(new e93.a(aVar.getX(), aVar.getY()));
            }
            String color = eVarM.getColor();
            s6l.d dVarF = entity.getCardDesignCatalogueAssets();
            if (dVarF == null || (backgroundUrl = dVarF.getLight()) == null) {
                backgroundUrl = eVarM.getBackgroundUrl();
            }
            nVar = new e93.n(arrayList4, color, backgroundUrl, jb3.l.y(eVarM.getPricing()));
        } else {
            nVar = null;
        }
        e93.b0 b0Var = (e93.b0) u1.u(entity.getCardMaterial(), zhm.r0.k(new Pair("PLASTIC", e93.b0.PLASTIC), new Pair("METAL", e93.b0.METAL)));
        s6l.c cVarB = entity.getAssumedDeliveryFee();
        c93.d dVar = cVarB != null ? new c93.d(hx7.a.v(cVarB.getPrice()), hx7.a.v(cVarB.getOriginalPrice())) : null;
        s6l.o oVarC = entity.getAssumedDeliveryPrice();
        c93.j jVarY2 = oVarC != null ? jb3.l.y(oVarC) : null;
        s6l.f fVarW = entity.getPromoInfo();
        if (fVarW != null) {
            arrayList2 = arrayList3;
            bVar = bVar5;
            uVar = new e93.u(hx7.a.v(fVarW.getPromoPrice()), new DateTime(fVarW.getEndTime()));
        } else {
            arrayList2 = arrayList3;
            bVar = bVar5;
            uVar = null;
        }
        s6l.g gVarG = entity.getCardDesignVideoBackground();
        e93.w wVar = gVarG != null ? new e93.w(gVarG.getUrl(), gVarG.getUrlDark()) : null;
        e93.k kVar = e93.l.Companion;
        String strD = entity.getAvailabilityStatus();
        kVar.getClass();
        e93.l lVarA = e93.k.a(strD);
        e93.s sVar = e93.t.Companion;
        String strS = entity.getLockReason();
        sVar.getClass();
        e93.t tVarA = e93.s.a(strS);
        ArrayList arrayList5 = arrayList2;
        String strZ = entity.getUnlockHint();
        String strY = entity.getTitle();
        e93.b bVar6 = bVar;
        String strO = entity.getDescription();
        String strR = entity.getGroupName();
        h93.i0 i0Var = h93.j0.Companion;
        String strV = entity.getProductType();
        i0Var.getClass();
        h93.j0 j0VarA = h93.i0.a(strV);
        h93.k0 k0Var = h93.l0.Companion;
        String strX = entity.getSubProductType();
        k0Var.getClass();
        h93.l0 l0VarA = h93.k0.a(strX);
        String strA = entity.getVideoPreview();
        s6l.d dVarF2 = entity.getCardDesignCatalogueAssets();
        if (dVarF2 != null) {
            tVar = tVarA;
            bVar2 = bVar6;
            mVar = new e93.m(dVarF2.getLight(), dVarF2.getDark());
        } else {
            tVar = tVarA;
            bVar2 = bVar6;
            mVar = null;
        }
        String strK = entity.getCardProfileId();
        s6l.h hVarH = entity.getCardHolderName();
        if (hVarH != null) {
            Intrinsics.checkNotNullParameter(hVarH, "<this>");
            s6l.a position = hVarH.getPosition();
            Intrinsics.checkNotNullParameter(position, "<this>");
            e93.a aVar2 = new e93.a(position.getX(), position.getY());
            String color2 = hVarH.getColor();
            e93.c0 c0Var = e93.d0.Companion;
            String side = hVarH.getSide();
            c0Var.getClass();
            e93.d0 d0VarA = e93.c0.a(side);
            bVar3 = bVar4;
            xVar = new e93.x(aVar2, color2, d0VarA, hVarH.getDefaultCardholderName());
        } else {
            bVar3 = bVar4;
            xVar = null;
        }
        List listN = entity.getDeliveryCountries();
        ArrayList arrayList6 = new ArrayList(zhm.w.t(listN, 10));
        Iterator it9 = listN.iterator();
        while (it9.hasNext()) {
            arrayList6.add(com.bumptech.glide.d.c((String) it9.next()));
        }
        jo3.b bVarT = entity.getMonthlyFee();
        return new e93.d(bVar2, bVar3, strQ, jVarY, b0Var, arrayList5, jVar, nVar, xVar, dVar, jVarY2, uVar, r142, lVarA, tVar, strZ, strY, strO, strR, j0VarA, l0VarA, wVar, mVar, strA, strK, arrayList6, bVarT != null ? hx7.a.v(bVarT) : null);
    }

    public static s6l.q c(e93.e domain) {
        ArrayList arrayList;
        s6l.k kVar;
        s6l.k kVar2;
        s6l.d dVar;
        s6l.d dVar2;
        s6l.g gVar;
        String str;
        s6l.g gVar2;
        s6l.p pVar;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String strG = u1.g(domain.f123842b, hx7.l.j());
        String str2 = domain.f123843c.f13615a;
        boolean z = domain.f == e93.m0.DISPOSABLE;
        s6l.o oVarJ = jb3.l.J(domain.e);
        String str3 = domain.d;
        List list = domain.f123844g.f123879a;
        List<e93.y> list2 = domain.f123845h;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        for (e93.y yVar : list2) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
            arrayList2.add(new s6l.i(yVar.f123901c, yVar.d, yVar.f123899a.a(), yVar.f123900b));
        }
        ArrayList arrayList3 = domain.i;
        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
        Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            arrayList4.add(((c93.h) it8.next()).f22286a);
        }
        String strName = domain.f123846j.name();
        e93.t tVar = domain.k;
        String strName2 = tVar != null ? tVar.name() : null;
        String str4 = domain.f123847l;
        String str5 = domain.f123848m;
        String str6 = domain.f123849n;
        String str7 = domain.o;
        h93.j0 j0Var = domain.f123850p;
        String strName3 = j0Var != null ? j0Var.name() : null;
        h93.l0 l0Var = domain.f123851q;
        String strName4 = l0Var != null ? l0Var.name() : null;
        e93.e0 e0Var = domain.f123852r;
        if (e0Var != null) {
            arrayList = arrayList4;
            kVar = new s6l.k(e0Var.f123857a, e0Var.f123858b);
        } else {
            arrayList = arrayList4;
            kVar = null;
        }
        String str8 = domain.u;
        e93.m mVar = domain.f123854t;
        if (mVar != null) {
            kVar2 = kVar;
            dVar = new s6l.d(mVar.f123880a, mVar.f123881b);
        } else {
            kVar2 = kVar;
            dVar = null;
        }
        e93.w wVar = domain.f123853s;
        if (wVar != null) {
            dVar2 = dVar;
            gVar = new s6l.g(wVar.f123894a, wVar.f123895b);
        } else {
            dVar2 = dVar;
            gVar = null;
        }
        String str9 = domain.v;
        dj0.d dVar3 = domain.f123855w;
        jo3.b bVarA = dVar3 != null ? hx7.a.A(dVar3) : null;
        CardDesignUnlockRequirement cardDesignUnlockRequirement = domain.f123856x;
        if (cardDesignUnlockRequirement != null) {
            Intrinsics.checkNotNullParameter(cardDesignUnlockRequirement, "<this>");
            e93.t tVar2 = cardDesignUnlockRequirement.f65536a;
            String strName5 = tVar2 != null ? tVar2.name() : null;
            str = str9;
            String str10 = cardDesignUnlockRequirement.f65537b;
            gVar2 = gVar;
            String str11 = cardDesignUnlockRequirement.f65538c;
            dj0.d dVar4 = cardDesignUnlockRequirement.d;
            pVar = new s6l.p(strName5, str10, str11, dVar4 != null ? hx7.a.A(dVar4) : null);
        } else {
            str = str9;
            gVar2 = gVar;
            pVar = null;
        }
        return new s6l.q(strG, str2, str3, z, oVarJ, list, arrayList2, arrayList, strName, strName2, str4, str5, str6, str7, strName3, strName4, kVar2, dVar2, str8, gVar2, str, bVarA, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r24v2, types: [com.revolut.feature.cards.models.design.CardDesignUnlockRequirement] */
    /* JADX WARN: Type inference failed for: r3v2, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    public static e93.e d(s6l.q entity) {
        ?? arrayList;
        e93.e0 e0Var;
        e93.b bVar;
        e93.m mVar;
        e93.m mVar2;
        e93.w wVar;
        dj0.d dVar;
        e93.w wVar2;
        b93.b bVar2;
        Intrinsics.checkNotNullParameter(entity, "entity");
        b93.b bVar3 = new b93.b(entity.getCode());
        e93.b bVar4 = (e93.b) u1.u(entity.getBrand(), hx7.l.j());
        String strM = entity.getGroupId();
        c93.j jVarY = jb3.l.y(entity.getPricing());
        e93.m0 m0Var = entity.getDisposable() ? e93.m0.DISPOSABLE : e93.m0.VIRTUAL;
        e93.k0 k0Var = new e93.k0(entity.getAssets3dTextures());
        List listF = entity.getCardLimits();
        if (listF != null) {
            List<s6l.i> list = listF;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            for (s6l.i iVar : list) {
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                e93.z zVar = e93.a0.Companion;
                String type = iVar.getType();
                zVar.getClass();
                arrayList.add(new e93.y(e93.z.a(type), iVar.getReached(), iVar.getThreshold(), iVar.getUnblockDate()));
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        List listL = entity.getIb.b.Features java.lang.String();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listL, 10));
        Iterator it8 = listL.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new c93.h((String) it8.next()));
        }
        e93.k kVar = e93.l.Companion;
        String strB = entity.getAvailabilityStatus();
        kVar.getClass();
        e93.l lVarA = e93.k.a(strB);
        e93.s sVar = e93.t.Companion;
        String strO = entity.getLockReason();
        sVar.getClass();
        e93.t tVarA = e93.s.a(strO);
        String strU = entity.getUnlockHint();
        String strT = entity.getTitle();
        String strJ = entity.getDescription();
        String strN = entity.getGroupName();
        h93.i0 i0Var = h93.j0.Companion;
        String strR = entity.getProductType();
        i0Var.getClass();
        h93.j0 j0VarA = h93.i0.a(strR);
        h93.k0 k0Var2 = h93.l0.Companion;
        String strS = entity.getSubProductType();
        k0Var2.getClass();
        h93.l0 l0VarA = h93.k0.a(strS);
        s6l.k kVarI = entity.getColorPicker();
        if (kVarI != null) {
            e0Var = new e93.e0(kVarI.getLightUrl(), kVarI.getDarkUrl());
            bVar4 = bVar4;
        } else {
            e0Var = null;
        }
        String strW = entity.getVideoPreview();
        s6l.d dVarD = entity.getCardDesignCatalogueAssets();
        if (dVarD != null) {
            bVar = bVar4;
            mVar = new e93.m(dVarD.getLight(), dVarD.getDark());
        } else {
            bVar = bVar4;
            mVar = null;
        }
        s6l.g gVarE = entity.getCardDesignVideoBackground();
        if (gVarE != null) {
            mVar2 = mVar;
            wVar = new e93.w(gVarE.getUrl(), gVarE.getUrlDark());
        } else {
            mVar2 = mVar;
            wVar = null;
        }
        String strG = entity.getCardProfileId();
        jo3.b bVarP = entity.getMonthlyFee();
        dj0.d dVarV = bVarP != null ? hx7.a.v(bVarP) : null;
        s6l.p pVarV = entity.getUnlockRequirement();
        if (pVarV != null) {
            Intrinsics.checkNotNullParameter(pVarV, "<this>");
            dVar = dVarV;
            e93.t tVarA2 = e93.s.a(pVarV.getLockReason());
            String unlockHint = pVarV.getUnlockHint();
            wVar2 = wVar;
            String productId = pVarV.getProductId();
            jo3.b price = pVarV.getPrice();
            objV = price != null ? hx7.a.v(price) : null;
            bVar2 = bVar3;
            objV = new CardDesignUnlockRequirement(tVarA2, unlockHint, productId, objV);
        } else {
            dVar = dVarV;
            wVar2 = wVar;
            bVar2 = bVar3;
        }
        return new e93.e(bVar, bVar2, strM, jVarY, m0Var, k0Var, arrayList, arrayList2, lVarA, tVarA, strU, strT, strJ, strN, j0VarA, l0VarA, e0Var, wVar2, mVar2, strW, strG, dVar, objV);
    }
}
