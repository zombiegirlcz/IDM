package dr3;

import dx4.a1;
import dx4.e1;
import dx4.y0;
import ht3.e0;
import ht3.f0;
import ht3.g0;
import ht3.h0;
import ht3.i0;
import ht3.j0;
import ht3.k0;
import ht3.l0;
import ht3.m;
import ht3.n;
import ht3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx4.m0;
import nx4.o0;
import nx4.p;
import org.jetbrains.annotations.NotNull;
import st3.a0;
import st3.b0;
import st3.c0;
import st3.q;
import st3.r;
import st3.s;
import st3.t;
import st3.u;
import st3.y;
import st3.z;
import zhm.d0;
import zhm.w;
import znd.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p96.a f117085a;

    public g(a buttonDtoMapper, p96.a itemDtoMapper, h footerDtoMapper) {
        Intrinsics.checkNotNullParameter(buttonDtoMapper, "buttonDtoMapper");
        Intrinsics.checkNotNullParameter(itemDtoMapper, "itemDtoMapper");
        Intrinsics.checkNotNullParameter(footerDtoMapper, "footerDtoMapper");
        this.f117085a = itemDtoMapper;
    }

    public static /* synthetic */ l0 c(g gVar, u uVar, s04.e eVar, s04.e eVar2, int i) {
        Function1 u0Var = eVar;
        if ((i & 2) != 0) {
            u0Var = new u0(12);
        }
        Function1 u0Var2 = eVar2;
        if ((i & 4) != 0) {
            u0Var2 = new u0(12);
        }
        return gVar.b(uVar, u0Var, u0Var2, new u0(12));
    }

    public static ht3.i d(s sVar) {
        a1 a1VarA;
        String text = sVar.getText();
        String icon = sVar.getIcon();
        if (icon != null) {
            a1.Companion.getClass();
            a1VarA = y0.a(icon);
        } else {
            a1VarA = null;
        }
        return new ht3.i(a1VarA, text, sVar.getActionId());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ht3.n e(st3.t r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr3.g.e(st3.t, java.lang.String):ht3.n");
    }

    public static e0 f(st3.b bVar) {
        String strB = bVar.getId();
        r rVarA = bVar.getAction();
        if (rVarA instanceof q) {
            return new e0(strB, new f0(p.c(((q) rVarA).getInfo())));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final l0 a(u dto, Function1 mapActionToDomain) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(mapActionToDomain, "mapActionToDomain");
        return b(dto, mapActionToDomain, mapActionToDomain, mapActionToDomain);
    }

    public final l0 b(u dto, Function1 mapPrimaryActionToDomain, Function1 mapSecondaryActionToDomain, Function1 mapItemActionToDomain) {
        i0 i0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        n nVarA;
        k0 k0Var;
        Object next;
        ArrayList arrayList3;
        ArrayList arrayList4;
        n nVarA2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(mapPrimaryActionToDomain, "mapPrimaryActionToDomain");
        Intrinsics.checkNotNullParameter(mapSecondaryActionToDomain, "mapSecondaryActionToDomain");
        Intrinsics.checkNotNullParameter(mapItemActionToDomain, "mapItemActionToDomain");
        boolean z = dto instanceof st3.f0;
        p96.a aVar = this.f117085a;
        ArrayList arrayList5 = null;
        if (z) {
            st3.f0 f0Var = (st3.f0) dto;
            st3.c cVarW = f0Var.getPrimaryButton();
            ht3.c cVarA = cVarW != null ? a.a(cVarW, mapPrimaryActionToDomain, ht3.b.ACCENT) : null;
            st3.c cVarT = f0Var.getSecondaryButton();
            ht3.c cVarA2 = cVarT != null ? a.a(cVarT, mapSecondaryActionToDomain, ht3.b.FLAT) : null;
            if (ue0.e.n(f0Var.getItems()) && ue0.e.n(f0Var.getContentItems())) {
                String strJ = f0Var.getTitle();
                String strC = f0Var.getDescription();
                if (strC == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                s sVarF = f0Var.getLink();
                ht3.i iVarD = sVarF != null ? d(sVarF) : null;
                t tVarH = f0Var.getMedia();
                if (tVarH != null) {
                    nVarA2 = e(tVarH, f0Var.getAssetId());
                } else {
                    m mVar = n.Companion;
                    String strA = f0Var.getAssetId();
                    if (strA == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    mVar.getClass();
                    nVarA2 = m.a(strA);
                }
                n nVar = nVarA2;
                List listG = f0Var.getLinks();
                if (listG != null) {
                    List list = listG;
                    arrayList5 = new ArrayList(w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList5.add(f((st3.b) it8.next()));
                    }
                }
                return new o(strJ, strC, iVarD, null, nVar, null, null, cVarA, cVarA2, false, arrayList5, 616);
            }
            if (!ue0.e.n(f0Var.getItems()) && !ue0.e.n(f0Var.getContentItems())) {
                throw new UnsupportedOperationException("Only one list of items can persist for one configuration");
            }
            String strJ2 = f0Var.getTitle();
            String strC2 = f0Var.getDescription();
            String strI = f0Var.getSecondDescription();
            s sVarF2 = f0Var.getLink();
            ht3.i iVarD2 = sVarF2 != null ? d(sVarF2) : null;
            String strA2 = f0Var.getAssetId();
            g0 g0Var = strA2 != null ? new g0(strA2) : null;
            String strE = f0Var.getItemsTitle();
            List listD = f0Var.getItems();
            if (listD != null) {
                ArrayList arrayListZ = d0.Z(listD);
                ArrayList arrayList6 = new ArrayList(w.t(arrayListZ, 10));
                Iterator it9 = arrayListZ.iterator();
                while (it9.hasNext()) {
                    arrayList6.add(aVar.k((st3.p) it9.next(), mapItemActionToDomain));
                }
                arrayList3 = arrayList6;
            } else {
                arrayList3 = null;
            }
            List listB = f0Var.getContentItems();
            if (listB != null) {
                ArrayList arrayListZ2 = d0.Z(listB);
                arrayList4 = new ArrayList(w.t(arrayListZ2, 10));
                Iterator it10 = arrayListZ2.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(aVar.k((st3.p) it10.next(), mapItemActionToDomain));
                }
            } else {
                arrayList4 = null;
            }
            List listG2 = f0Var.getLinks();
            if (listG2 != null) {
                List list2 = listG2;
                arrayList5 = new ArrayList(w.t(list2, 10));
                Iterator it11 = list2.iterator();
                while (it11.hasNext()) {
                    arrayList5.add(f((st3.b) it11.next()));
                }
            }
            return new ht3.g(strJ2, strC2, iVarD2, strI, g0Var, strE, arrayList3, arrayList4, null, cVarA, cVarA2, arrayList5, 2048);
        }
        if (dto instanceof st3.e0) {
            st3.e0 e0Var = (st3.e0) dto;
            st3.c cVarW2 = e0Var.getPrimaryButton();
            ht3.c cVarA3 = cVarW2 != null ? a.a(cVarW2, mapPrimaryActionToDomain, ht3.b.ACCENT) : null;
            st3.c cVarT2 = e0Var.getSecondaryButton();
            ht3.c cVarA4 = cVarT2 != null ? a.a(cVarT2, mapSecondaryActionToDomain, ht3.b.FLAT) : null;
            String strI2 = e0Var.getTitle();
            String strB = e0Var.getDescription();
            s sVarD = e0Var.getLink();
            ht3.i iVarD3 = sVarD != null ? d(sVarD) : null;
            t tVarF = e0Var.getMedia();
            if (tVarF != null) {
                nVarA = e(tVarF, e0Var.getAssetId());
            } else {
                m mVar2 = n.Companion;
                String strA3 = e0Var.getAssetId();
                if (strA3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                mVar2.getClass();
                nVarA = m.a(strA3);
            }
            n nVar2 = nVarA;
            Double dG = e0Var.getRevealAnimationDelay();
            String strH = e0Var.getTheme();
            if (strH != null) {
                Iterator<E> it12 = k0.a().iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it12.next();
                    if (Intrinsics.f(((k0) next).name(), strH)) {
                        break;
                    }
                }
                k0Var = (k0) next;
            } else {
                k0Var = null;
            }
            Boolean boolC = e0Var.getHideNavigationIcon();
            boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
            List listE = e0Var.getLinks();
            if (listE != null) {
                List list3 = listE;
                arrayList5 = new ArrayList(w.t(list3, 10));
                Iterator it13 = list3.iterator();
                while (it13.hasNext()) {
                    arrayList5.add(f((st3.b) it13.next()));
                }
            }
            return new o(strI2, strB, iVarD3, null, nVar2, k0Var, dG, cVarA3, cVarA4, zBooleanValue, arrayList5, 8);
        }
        if (dto instanceof st3.d0) {
            st3.d0 d0Var = (st3.d0) dto;
            st3.c cVarW3 = d0Var.getPrimaryButton();
            ht3.c cVarA5 = cVarW3 != null ? a.a(cVarW3, mapPrimaryActionToDomain, ht3.b.ACCENT) : null;
            st3.c cVarT3 = d0Var.getSecondaryButton();
            ht3.c cVarA6 = cVarT3 != null ? a.a(cVarT3, mapSecondaryActionToDomain, ht3.b.FLAT) : null;
            String strG = d0Var.getTitle();
            String strC3 = d0Var.getDescription();
            String strF = d0Var.getSecondDescription();
            s sVarD2 = d0Var.getLink();
            ht3.i iVarD4 = sVarD2 != null ? d(sVarD2) : null;
            String strA4 = d0Var.getAssetId();
            g0 g0Var2 = strA4 != null ? new g0(strA4) : null;
            List listB2 = d0Var.getContentItems();
            if (listB2 != null) {
                ArrayList arrayListZ3 = d0.Z(listB2);
                ArrayList arrayList7 = new ArrayList(w.t(arrayListZ3, 10));
                Iterator it14 = arrayListZ3.iterator();
                while (it14.hasNext()) {
                    arrayList7.add(aVar.k((st3.p) it14.next(), mapItemActionToDomain));
                }
                arrayList2 = arrayList7;
            } else {
                arrayList2 = null;
            }
            List listE2 = d0Var.getLinks();
            if (listE2 != null) {
                List list4 = listE2;
                arrayList5 = new ArrayList(w.t(list4, 10));
                Iterator it15 = list4.iterator();
                while (it15.hasNext()) {
                    arrayList5.add(f((st3.b) it15.next()));
                }
            }
            return new ht3.g(strG, strC3, iVarD4, strF, g0Var2, null, null, arrayList2, null, cVarA5, cVarA6, arrayList5, 2048);
        }
        if (dto instanceof st3.a) {
            st3.a aVar2 = (st3.a) dto;
            st3.c cVarW4 = aVar2.getPrimaryButton();
            ht3.c cVarA7 = cVarW4 != null ? a.a(cVarW4, mapPrimaryActionToDomain, ht3.b.ACCENT) : null;
            st3.c cVarT4 = aVar2.getSecondaryButton();
            ht3.c cVarA8 = cVarT4 != null ? a.a(cVarT4, mapSecondaryActionToDomain, ht3.b.SEMI_ACCENT) : null;
            String strF2 = aVar2.getTitle();
            String strA5 = aVar2.getDescription();
            String strE2 = aVar2.getSecondDescription();
            s sVarC = aVar2.getLink();
            ht3.i iVarD5 = sVarC != null ? d(sVarC) : null;
            ArrayList arrayListZ4 = d0.Z(aVar2.getItems());
            ArrayList arrayList8 = new ArrayList();
            Iterator it16 = arrayListZ4.iterator();
            while (it16.hasNext()) {
                e1 e1VarP = o0.p((m0) it16.next(), arrayListZ4);
                if (e1VarP != null) {
                    arrayList8.add(e1VarP);
                }
            }
            List listD2 = aVar2.getLinks();
            if (listD2 != null) {
                List list5 = listD2;
                arrayList5 = new ArrayList(w.t(list5, 10));
                Iterator it17 = list5.iterator();
                while (it17.hasNext()) {
                    arrayList5.add(f((st3.b) it17.next()));
                }
            }
            return new ht3.e(strF2, strA5, strE2, iVarD5, arrayList8, cVarA7, cVarA8, arrayList5);
        }
        if (!(dto instanceof c0)) {
            throw new NoWhenBranchMatchedException();
        }
        c0 c0Var = (c0) dto;
        st3.c cVarW5 = c0Var.getPrimaryButton();
        ht3.c cVarA9 = cVarW5 != null ? a.a(cVarW5, mapPrimaryActionToDomain, ht3.b.ACCENT) : null;
        st3.c cVarT5 = c0Var.getSecondaryButton();
        ht3.c cVarA10 = cVarT5 != null ? a.a(cVarT5, mapSecondaryActionToDomain, ht3.b.FLAT) : null;
        st3.d dVarC = c0Var.getFooter();
        ht3.k kVarA = dVarC != null ? h.a(dVarC) : null;
        String strF3 = c0Var.getTitle();
        String strB2 = c0Var.getDescription();
        b0 b0VarD = c0Var.getHeader();
        if (b0VarD == null) {
            i0Var = null;
        } else {
            if (!(b0VarD instanceof a0)) {
                throw new NoWhenBranchMatchedException();
            }
            z zVarA = ((a0) b0VarD).getImage();
            if (!(zVarA instanceof y)) {
                throw new NoWhenBranchMatchedException();
            }
            y yVar = (y) zVarA;
            i0Var = new i0(new h0(yVar.getName(), yVar.getPath()));
        }
        List listA = c0Var.getContentItems();
        if (listA != null) {
            ArrayList arrayListZ5 = d0.Z(listA);
            ArrayList arrayList9 = new ArrayList(w.t(arrayListZ5, 10));
            Iterator it18 = arrayListZ5.iterator();
            while (it18.hasNext()) {
                arrayList9.add(aVar.k((st3.p) it18.next(), mapItemActionToDomain));
            }
            arrayList = arrayList9;
        } else {
            arrayList = null;
        }
        List listE3 = c0Var.getLinks();
        if (listE3 != null) {
            List list6 = listE3;
            arrayList5 = new ArrayList(w.t(list6, 10));
            Iterator it19 = list6.iterator();
            while (it19.hasNext()) {
                arrayList5.add(f((st3.b) it19.next()));
            }
        }
        return new j0(strF3, strB2, i0Var, arrayList, kVarA, cVarA9, cVarA10, arrayList5);
    }
}
