package vdl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.InstrumentDetailsService;
import hcl.a2;
import hcl.b2;
import hcl.c2;
import hcl.d2;
import hcl.f2;
import hcl.g2;
import hcl.h2;
import hcl.j2;
import hcl.k2;
import hcl.l2;
import hcl.m2;
import hcl.n2;
import hcl.o2;
import hcl.s;
import hcl.s2;
import hcl.t2;
import hcl.w;
import hcl.w2;
import hcl.x;
import hcl.y;
import hcl.y1;
import hcl.z;
import hcl.z1;
import hcl.z2;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jel.b3;
import jel.e2;
import jel.i2;
import jel.v2;
import jel.x1;
import jel.x2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements xbl.a {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final DateTimeFormatter f288008r = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f288009s = "governance_";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f288010t = "summary_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentDetailsService f288011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dcl.i0 f288012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dcl.w f288013c;
    public final dcl.r d;
    public final dcl.g e;
    public final dcl.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dcl.e f288014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dcl.k f288015h;
    public final dcl.p0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dcl.r0 f288016j;
    public final dcl.y k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ne0.j f288017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CoroutineScope f288018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w4l.f f288019n;
    public final w4l.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w4l.f f288020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x4l.c f288021q;

    public o(InstrumentDetailsService service, dcl.i0 instrumentsDetailsDao, dcl.w instrumentRecommendationsDao, dcl.r instrumentGovernanceDao, dcl.q instrumentDrawdownDao, dcl.g etfDetailsDao, dcl.a bondDetailsDao, dcl.e cfdDetailsDao, dcl.k fundDetailsDao, dcl.p0 mutualFundDetailsDao, dcl.r0 noteDetailsDao, dcl.y instrumentSummaryDao, ne0.j memoryCache, CoroutineScope appCoroutineScope, b80.c connectivityRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(instrumentsDetailsDao, "instrumentsDetailsDao");
        Intrinsics.checkNotNullParameter(instrumentRecommendationsDao, "instrumentRecommendationsDao");
        Intrinsics.checkNotNullParameter(instrumentGovernanceDao, "instrumentGovernanceDao");
        Intrinsics.checkNotNullParameter(instrumentDrawdownDao, "instrumentDrawdownDao");
        Intrinsics.checkNotNullParameter(etfDetailsDao, "etfDetailsDao");
        Intrinsics.checkNotNullParameter(bondDetailsDao, "bondDetailsDao");
        Intrinsics.checkNotNullParameter(cfdDetailsDao, "cfdDetailsDao");
        Intrinsics.checkNotNullParameter(fundDetailsDao, "fundDetailsDao");
        Intrinsics.checkNotNullParameter(mutualFundDetailsDao, "mutualFundDetailsDao");
        Intrinsics.checkNotNullParameter(noteDetailsDao, "noteDetailsDao");
        Intrinsics.checkNotNullParameter(instrumentSummaryDao, "instrumentSummaryDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        this.f288011a = service;
        this.f288012b = instrumentsDetailsDao;
        this.f288013c = instrumentRecommendationsDao;
        this.d = instrumentGovernanceDao;
        this.e = etfDetailsDao;
        this.f = bondDetailsDao;
        this.f288014g = cfdDetailsDao;
        this.f288015h = fundDetailsDao;
        this.i = mutualFundDetailsDao;
        this.f288016j = noteDetailsDao;
        this.k = instrumentSummaryDao;
        this.f288017l = memoryCache;
        this.f288018m = appCoroutineScope;
        final int i = 7;
        final int i2 = 2;
        final int i3 = 2;
        final int i5 = 3;
        final int i6 = 3;
        this.f288019n = new w4l.f(te0.w.k0(connectivityRepository, new Function1(this) { // from class: vdl.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287980b;

            {
                this.f287980b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:435:0x09b7  */
            /* JADX WARN: Removed duplicated region for block: B:443:0x09de  */
            /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r42) {
                /*
                    Method dump skipped, instruction units count: 3680
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vdl.i.invoke(java.lang.Object):java.lang.Object");
            }
        }), new Function1(this) { // from class: vdl.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287980b;

            {
                this.f287980b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:435:0x09b7  */
            /* JADX WARN: Removed duplicated region for block: B:443:0x09de  */
            /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r42) {
                /*
                    Method dump skipped, instruction units count: 3680
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vdl.i.invoke(java.lang.Object):java.lang.Object");
            }
        }, new Function2(this) { // from class: vdl.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287983b;

            {
                this.f287983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                y1 y1Var;
                b2 b2Var;
                z1 z1Var;
                a2 a2Var;
                c2 c2Var;
                f2 f2Var;
                k2 k2Var;
                Iterator it8;
                String str;
                n2 n2Var;
                dj0.d dVar;
                hcl.w wVar;
                hcl.y yVar;
                hcl.z zVar;
                hcl.u uVar;
                String str2;
                hcl.x xVar;
                hcl.v vVar;
                hcl.v vVar2;
                hcl.s sVar;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                x.a aVar;
                x.c cVar;
                x.b bVar;
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                ArrayList arrayList7;
                ArrayList arrayList8;
                ArrayList arrayList9;
                hcl.h hVar;
                hcl.c cVar2;
                hcl.o0 o0Var;
                hcl.b bVar2;
                ArrayList arrayList10;
                z2 z2Var;
                w2 w2Var;
                hcl.o oVar;
                hcl.n nVar;
                ArrayList arrayList11;
                ArrayList arrayList12;
                ArrayList arrayList13;
                ArrayList arrayList14;
                int i21 = i3;
                o oVar2 = this.f287983b;
                switch (i21) {
                    case 0:
                        String ref2 = (String) obj2;
                        jel.l1 targetMarket = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket, "targetMarket");
                        dcl.r rVar = oVar2.d;
                        Object obj4 = tcl.j.f269888a;
                        Intrinsics.checkNotNullParameter(targetMarket, "<this>");
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        rVar.b(new hcl.q0(ref2, le.u1.g(targetMarket, tcl.j.f269888a)));
                        return Unit.f186387a;
                    case 1:
                        String ref3 = (String) obj2;
                        nel.w summary = (nel.w) obj3;
                        Intrinsics.checkNotNullParameter(ref3, "ref");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        oVar2.f288017l.f(o.f288010t + ref3, summary);
                        return Unit.f186387a;
                    case 2:
                        String ref4 = (String) obj2;
                        jel.c instrumentDetails = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter(ref4, "ref");
                        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
                        oVar2.f288017l.f(ref4, instrumentDetails);
                        return Unit.f186387a;
                    case 3:
                        jel.c details = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(details, "details");
                        if (details instanceof jel.q) {
                            dcl.g gVar = oVar2.e;
                            jel.q qVar = (jel.q) details;
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            String str3 = qVar.f173541b;
                            String str4 = qVar.f173540a;
                            jel.s sVar2 = qVar.e;
                            if (sVar2 != null) {
                                dj0.d dVar2 = sVar2.f173561a;
                                jo3.b bVarA = dVar2 != null ? hx7.a.A(dVar2) : null;
                                dj0.d dVar3 = sVar2.f173562b;
                                oVar = new hcl.o(bVarA, dVar3 != null ? hx7.a.A(dVar3) : null, sVar2.f173563c, sVar2.d, sVar2.e, sVar2.f);
                            } else {
                                oVar = null;
                            }
                            jel.r rVar2 = qVar.f;
                            if (rVar2 != null) {
                                List list = rVar2.f173551a;
                                if (list != null) {
                                    arrayList12 = new ArrayList();
                                    Iterator it9 = list.iterator();
                                    while (it9.hasNext()) {
                                        hcl.a aVarV = zh9.u0.V((jel.p) it9.next());
                                        hcl.l lVar = aVarV instanceof hcl.l ? (hcl.l) aVarV : null;
                                        if (lVar != null) {
                                            arrayList12.add(lVar);
                                        }
                                    }
                                } else {
                                    arrayList12 = null;
                                }
                                List list2 = rVar2.f173552b;
                                if (list2 != null) {
                                    arrayList13 = new ArrayList();
                                    Iterator it10 = list2.iterator();
                                    while (it10.hasNext()) {
                                        hcl.a aVarV2 = zh9.u0.V((b3) it10.next());
                                        hcl.b3 b3Var = aVarV2 instanceof hcl.b3 ? (hcl.b3) aVarV2 : null;
                                        if (b3Var != null) {
                                            arrayList13.add(b3Var);
                                        }
                                    }
                                } else {
                                    arrayList13 = null;
                                }
                                List list3 = rVar2.f173553c;
                                if (list3 != null) {
                                    arrayList14 = new ArrayList();
                                    Iterator it11 = list3.iterator();
                                    while (it11.hasNext()) {
                                        hcl.a aVarV3 = zh9.u0.V((jel.g1) it11.next());
                                        hcl.h0 h0Var = aVarV3 instanceof hcl.h0 ? (hcl.h0) aVarV3 : null;
                                        if (h0Var != null) {
                                            arrayList14.add(h0Var);
                                        }
                                    }
                                } else {
                                    arrayList14 = null;
                                }
                                nVar = new hcl.n(arrayList12, arrayList13, arrayList14);
                            } else {
                                nVar = null;
                            }
                            String str5 = qVar.f173542c;
                            String str6 = qVar.d;
                            String str7 = qVar.f173543g;
                            String str8 = qVar.f173544h;
                            List list4 = qVar.i;
                            if (list4 != null) {
                                List<jel.k1> list5 = list4;
                                ArrayList arrayList15 = new ArrayList(zhm.w.t(list5, 10));
                                for (jel.k1 k1Var : list5) {
                                    Intrinsics.checkNotNullParameter(k1Var, "<this>");
                                    arrayList15.add(new hcl.p0(k1Var.f173490a, k1Var.f173491b));
                                }
                                arrayList11 = arrayList15;
                            } else {
                                arrayList11 = null;
                            }
                            gVar.b(new hcl.m(str3, str4, str5, str6, oVar, nVar, str7, str8, arrayList11));
                        } else if (details instanceof jel.h1) {
                            dcl.i0 i0Var = oVar2.f288012b;
                            jel.h1 h1Var = (jel.h1) details;
                            Object obj5 = tcl.g.f269882a;
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            String str9 = h1Var.f173461a;
                            String str10 = h1Var.f173462b;
                            jel.j1 j1Var = h1Var.e;
                            if (j1Var != null) {
                                Intrinsics.checkNotNullParameter(j1Var, "<this>");
                                dj0.d dVar4 = j1Var.f173485a;
                                jo3.b bVarA2 = dVar4 != null ? hx7.a.A(dVar4) : null;
                                Double d = j1Var.f173486b;
                                Double d5 = j1Var.f173487c;
                                dj0.d dVar5 = j1Var.d;
                                jo3.b bVarA3 = dVar5 != null ? hx7.a.A(dVar5) : null;
                                dj0.d dVar6 = j1Var.e;
                                jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                                dj0.d dVar7 = j1Var.f;
                                o0Var = new hcl.o0(bVarA2, d, d5, bVarA3, bVarA4, dVar7 != null ? hx7.a.A(dVar7) : null, j1Var.f173488g, j1Var.f173489h, j1Var.i);
                            } else {
                                o0Var = null;
                            }
                            String str11 = h1Var.f173463c;
                            String str12 = h1Var.d;
                            String strH = le.u1.h(h1Var.f, tcl.g.f269882a);
                            if (strH == null) {
                                strH = "";
                            }
                            String str13 = strH;
                            String strB = tbl.a.b(h1Var.f173465h);
                            jel.b bVar3 = h1Var.f173464g;
                            if (bVar3 != null) {
                                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                                jel.z2 z2Var2 = bVar3.f173409a;
                                if (z2Var2 != null) {
                                    Intrinsics.checkNotNullParameter(z2Var2, "<this>");
                                    z2Var = new z2(le.u1.g(z2Var2.d, tcl.g.f269883b), z2Var2.f173617a, z2Var2.f173618b, z2Var2.f173619c, z2Var2.e);
                                } else {
                                    z2Var = null;
                                }
                                x2 x2Var = bVar3.f173410b;
                                if (x2Var != null) {
                                    Intrinsics.checkNotNullParameter(x2Var, "<this>");
                                    w2Var = new w2(hx7.a.A(x2Var.f173604a), hx7.a.A(x2Var.f173605b), hx7.a.A(x2Var.f173606c), x2Var.d, x2Var.e);
                                } else {
                                    w2Var = null;
                                }
                                bVar2 = new hcl.b(z2Var, w2Var);
                            } else {
                                bVar2 = null;
                            }
                            List list6 = h1Var.i;
                            if (list6 != null) {
                                List<jel.k1> list7 = list6;
                                ArrayList arrayList16 = new ArrayList(zhm.w.t(list7, 10));
                                for (jel.k1 k1Var2 : list7) {
                                    Intrinsics.checkNotNullParameter(k1Var2, "<this>");
                                    arrayList16.add(new hcl.p0(k1Var2.f173490a, k1Var2.f173491b));
                                }
                                arrayList10 = arrayList16;
                            } else {
                                arrayList10 = null;
                            }
                            i0Var.b(new hcl.i0(str10, str9, str11, str12, o0Var, str13, strB, bVar2, arrayList10));
                        } else if (details instanceof jel.m) {
                            dcl.a aVar2 = oVar2.f;
                            jel.m mVar = (jel.m) details;
                            Object obj6 = tcl.b.f269876a;
                            Intrinsics.checkNotNullParameter(mVar, "<this>");
                            String str14 = mVar.f173499b;
                            String str15 = mVar.f173498a;
                            String str16 = mVar.f173500c;
                            jel.h hVar2 = mVar.d;
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            LocalDate localDate = hVar2.f173452a;
                            dj0.d dVar8 = hVar2.f173453b;
                            jo3.b bVarA5 = dVar8 != null ? hx7.a.A(dVar8) : null;
                            LocalDate localDate2 = hVar2.f173454c;
                            dj0.d dVar9 = hVar2.d;
                            jo3.b bVarA6 = dVar9 != null ? hx7.a.A(dVar9) : null;
                            dj0.d dVar10 = hVar2.e;
                            hcl.e eVar = new hcl.e(localDate, bVarA5, localDate2, bVarA6, dVar10 != null ? hx7.a.A(dVar10) : null);
                            jel.i iVar = mVar.e;
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            hcl.f fVar = new hcl.f(iVar.f173469a, iVar.f173470b, iVar.f173471c);
                            jel.e eVar2 = mVar.f;
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            BigDecimal bigDecimal3 = eVar2.f173436a;
                            jel.g gVar2 = eVar2.f173437b;
                            String strH2 = gVar2 != null ? le.u1.h(gVar2, tcl.b.f269876a) : null;
                            LocalDate localDate3 = eVar2.f173438c;
                            jel.f fVar2 = eVar2.d;
                            hcl.d dVar11 = new hcl.d(bigDecimal3, strH2, localDate3, fVar2 != null ? le.u1.h(fVar2, tcl.b.f269877b) : null);
                            jel.j jVar = mVar.f173501g;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            ej0.b bVar4 = jVar.f173479a;
                            ko3.b bVarM = bVar4 != null ? cp5.c.M(bVar4) : null;
                            ej0.b bVar5 = jVar.f173480b;
                            ko3.b bVarM2 = bVar5 != null ? cp5.c.M(bVar5) : null;
                            ej0.b bVar6 = jVar.f173481c;
                            hcl.g gVar3 = new hcl.g(bVarM, bVarM2, bVar6 != null ? cp5.c.M(bVar6) : null, jVar.d, jVar.e);
                            jel.l lVar2 = mVar.f173502h;
                            if (lVar2 != null) {
                                Intrinsics.checkNotNullParameter(lVar2, "<this>");
                                int i22 = lVar2.f173493a;
                                yel.b bVar7 = lVar2.f173494b;
                                hVar = new hcl.h(i22, bVar7 != null ? xcl.a.c(bVar7) : null, lVar2.f173495c);
                            } else {
                                hVar = null;
                            }
                            jel.d dVar12 = mVar.i;
                            if (dVar12 != null) {
                                Intrinsics.checkNotNullParameter(dVar12, "<this>");
                                boolean z = dVar12.f173427a;
                                LocalDate localDate4 = dVar12.f173428b;
                                dj0.d dVar13 = dVar12.f173429c;
                                cVar2 = new hcl.c(z, localDate4, dVar13 != null ? hx7.a.A(dVar13) : null, dVar12.d);
                            } else {
                                cVar2 = null;
                            }
                            aVar2.b(new hcl.i(str14, str15, str16, eVar, fVar, dVar11, gVar3, hVar, cVar2));
                        } else if (details instanceof jel.n) {
                            dcl.e eVar3 = oVar2.f288014g;
                            jel.n nVar2 = (jel.n) details;
                            Intrinsics.checkNotNullParameter(nVar2, "<this>");
                            eVar3.b(new hcl.k(nVar2.f173513b, nVar2.f173512a, nVar2.f173514c, nVar2.d, nVar2.e));
                        } else if (details instanceof jel.b0) {
                            dcl.k kVar = oVar2.f288015h;
                            jel.b0 b0Var = (jel.b0) details;
                            Intrinsics.checkNotNullParameter(b0Var, "<this>");
                            String str17 = b0Var.f173411a;
                            String str18 = b0Var.f173412b;
                            String str19 = b0Var.f173413c;
                            jel.h0 h0Var2 = b0Var.d;
                            if (h0Var2 != null) {
                                Intrinsics.checkNotNullParameter(h0Var2, "<this>");
                                jel.k0 k0Var = h0Var2.f173455a;
                                String strName = k0Var != null ? k0Var.name() : null;
                                String str20 = h0Var2.f173456b;
                                String str21 = h0Var2.f173457c;
                                LocalDate localDate5 = h0Var2.d;
                                List list8 = h0Var2.e;
                                if (list8 != null) {
                                    List<jel.g0> list9 = list8;
                                    ArrayList arrayList17 = new ArrayList(zhm.w.t(list9, 10));
                                    for (jel.g0 g0Var : list9) {
                                        Intrinsics.checkNotNullParameter(g0Var, "<this>");
                                        arrayList17.add(new w.a(g0Var.f173445a, g0Var.f173446b, g0Var.f173447c));
                                    }
                                    arrayList9 = arrayList17;
                                } else {
                                    arrayList9 = null;
                                }
                                dj0.d dVar14 = h0Var2.f;
                                jo3.b bVarA7 = dVar14 != null ? hx7.a.A(dVar14) : null;
                                jel.e1 e1Var = h0Var2.f173458g;
                                String strName2 = e1Var != null ? e1Var.name() : null;
                                jel.a0 a0Var = h0Var2.f173459h;
                                String strName3 = a0Var != null ? a0Var.name() : null;
                                jel.y yVar2 = h0Var2.i;
                                wVar = new hcl.w(strName, str20, str21, localDate5, arrayList9, bVarA7, strName2, strName3, yVar2 != null ? yVar2.name() : null, h0Var2.f173460j);
                            } else {
                                wVar = null;
                            }
                            jel.m0 m0Var = b0Var.e;
                            if (m0Var != null) {
                                Intrinsics.checkNotNullParameter(m0Var, "<this>");
                                String str22 = m0Var.f173503a;
                                String str23 = m0Var.f173504b;
                                dj0.d dVar15 = m0Var.f173505c;
                                jo3.b bVarA8 = dVar15 != null ? hx7.a.A(dVar15) : null;
                                LocalDate localDate6 = m0Var.d;
                                List list10 = m0Var.e;
                                if (list10 != null) {
                                    List list11 = list10;
                                    ArrayList arrayList18 = new ArrayList(zhm.w.t(list11, 10));
                                    Iterator it12 = list11.iterator();
                                    while (it12.hasNext()) {
                                        jel.z zVar2 = (jel.z) it12.next();
                                        Intrinsics.checkNotNullParameter(zVar2, "<this>");
                                        arrayList18.add(new y.a(zVar2.f173612a, zVar2.f173613b, zVar2.f173614c, zVar2.d));
                                        it12 = it12;
                                        localDate6 = localDate6;
                                    }
                                    arrayList8 = arrayList18;
                                } else {
                                    arrayList8 = null;
                                }
                                yVar = new hcl.y(str22, str23, bVarA8, localDate6, arrayList8);
                            } else {
                                yVar = null;
                            }
                            jel.n0 n0Var = b0Var.f;
                            if (n0Var != null) {
                                Intrinsics.checkNotNullParameter(n0Var, "<this>");
                                BigDecimal bigDecimal4 = n0Var.f173515a;
                                BigDecimal bigDecimal5 = n0Var.f173516b;
                                BigDecimal bigDecimal6 = n0Var.f173517c;
                                BigDecimal bigDecimal7 = n0Var.d;
                                BigDecimal bigDecimal8 = n0Var.e;
                                Integer num = n0Var.f;
                                List list12 = n0Var.f173518g;
                                if (list12 != null) {
                                    List list13 = list12;
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    ArrayList arrayList19 = new ArrayList(zhm.w.t(list13, 10));
                                    Iterator it13 = list13.iterator();
                                    while (it13.hasNext()) {
                                        jel.p0 p0Var = (jel.p0) it13.next();
                                        Iterator it14 = it13;
                                        jel.q0 q0Var = p0Var.f173532a;
                                        arrayList19.add(new z.a(q0Var != null ? q0Var.name() : null, p0Var.f173533b));
                                        it13 = it14;
                                    }
                                    arrayList7 = arrayList19;
                                } else {
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    arrayList7 = null;
                                }
                                zVar = new hcl.z(bigDecimal4, bigDecimal5, bigDecimal, bigDecimal2, bigDecimal8, num, arrayList7);
                            } else {
                                zVar = null;
                            }
                            jel.c0 c0Var = b0Var.f173414g;
                            if (c0Var != null) {
                                Intrinsics.checkNotNullParameter(c0Var, "<this>");
                                uVar = new hcl.u(c0Var.f173422a, c0Var.f173423b, c0Var.f173424c, c0Var.d, c0Var.e, c0Var.f);
                            } else {
                                uVar = null;
                            }
                            jel.j0 j0Var = b0Var.f173415h;
                            if (j0Var != null) {
                                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                                jel.o0 o0Var2 = j0Var.f173482a;
                                if (o0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(o0Var2, "<this>");
                                    aVar = new x.a(o0Var2.f173525a, o0Var2.f173526b);
                                } else {
                                    aVar = null;
                                }
                                jel.d1 d1Var = j0Var.f173483b;
                                if (d1Var != null) {
                                    Intrinsics.checkNotNullParameter(d1Var, "<this>");
                                    jel.f0 f0Var = d1Var.f173433a;
                                    cVar = new x.c(f0Var != null ? f0Var.name() : null);
                                } else {
                                    cVar = null;
                                }
                                jel.r0 r0Var = j0Var.f173484c;
                                if (r0Var != null) {
                                    Intrinsics.checkNotNullParameter(r0Var, "<this>");
                                    jel.f0 f0Var2 = r0Var.f173554a;
                                    str2 = str18;
                                    bVar = new x.b(f0Var2 != null ? f0Var2.name() : null, r0Var.f173555b, r0Var.f173556c);
                                } else {
                                    str2 = str18;
                                    bVar = null;
                                }
                                xVar = new hcl.x(aVar, cVar, bVar);
                            } else {
                                str2 = str18;
                                xVar = null;
                            }
                            jel.d0 d0Var = b0Var.i;
                            if (d0Var != null) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                List list14 = d0Var.f173430a;
                                if (list14 != null) {
                                    arrayList3 = new ArrayList();
                                    Iterator it15 = list14.iterator();
                                    while (it15.hasNext()) {
                                        hcl.q qVarC = tcl.d.c((jel.x0) it15.next());
                                        hcl.d0 d0Var2 = qVarC instanceof hcl.d0 ? (hcl.d0) qVarC : null;
                                        if (d0Var2 != null) {
                                            arrayList3.add(d0Var2);
                                        }
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                List list15 = d0Var.f173431b;
                                if (list15 != null) {
                                    arrayList4 = new ArrayList();
                                    Iterator it16 = list15.iterator();
                                    while (it16.hasNext()) {
                                        hcl.q qVarC2 = tcl.d.c((jel.v0) it16.next());
                                        hcl.b0 b0Var2 = qVarC2 instanceof hcl.b0 ? (hcl.b0) qVarC2 : null;
                                        if (b0Var2 != null) {
                                            arrayList4.add(b0Var2);
                                        }
                                    }
                                } else {
                                    arrayList4 = null;
                                }
                                List list16 = d0Var.f173432c;
                                if (list16 != null) {
                                    arrayList5 = new ArrayList();
                                    Iterator it17 = list16.iterator();
                                    while (it17.hasNext()) {
                                        hcl.q qVarC3 = tcl.d.c((jel.t0) it17.next());
                                        Iterator it18 = it17;
                                        hcl.a0 a0Var2 = qVarC3 instanceof hcl.a0 ? (hcl.a0) qVarC3 : null;
                                        if (a0Var2 != null) {
                                            arrayList5.add(a0Var2);
                                        }
                                        it17 = it18;
                                    }
                                } else {
                                    arrayList5 = null;
                                }
                                List list17 = d0Var.d;
                                if (list17 != null) {
                                    arrayList6 = new ArrayList();
                                    Iterator it19 = list17.iterator();
                                    while (it19.hasNext()) {
                                        hcl.q qVarC4 = tcl.d.c((jel.u) it19.next());
                                        Iterator it20 = it19;
                                        hcl.r rVar3 = qVarC4 instanceof hcl.r ? (hcl.r) qVarC4 : null;
                                        if (rVar3 != null) {
                                            arrayList6.add(rVar3);
                                        }
                                        it19 = it20;
                                    }
                                } else {
                                    arrayList6 = null;
                                }
                                vVar = new hcl.v(arrayList3, arrayList4, arrayList5, arrayList6);
                            } else {
                                vVar = null;
                            }
                            jel.x xVar2 = b0Var.f173416j;
                            if (xVar2 != null) {
                                Intrinsics.checkNotNullParameter(xVar2, "<this>");
                                List list18 = xVar2.f173597a;
                                if (list18 != null) {
                                    List<jel.i0> list19 = list18;
                                    arrayList = new ArrayList(zhm.w.t(list19, 10));
                                    for (jel.i0 i0Var2 : list19) {
                                        Intrinsics.checkNotNullParameter(i0Var2, "<this>");
                                        String str24 = i0Var2.f173472a;
                                        BigDecimal bigDecimal9 = i0Var2.f173473b;
                                        hcl.v vVar3 = vVar;
                                        String str25 = i0Var2.f173474c;
                                        String str26 = i0Var2.d;
                                        xi0.b bVar8 = i0Var2.e;
                                        arrayList.add(new s.a(str24, str25, str26, bVar8 != null ? bVar8.f306286a : null, bigDecimal9));
                                        vVar = vVar3;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                vVar2 = vVar;
                                List list20 = xVar2.f173598b;
                                if (list20 != null) {
                                    List list21 = list20;
                                    arrayList2 = new ArrayList(zhm.w.t(list21, 10));
                                    for (Iterator it21 = list21.iterator(); it21.hasNext(); it21 = it21) {
                                        jel.f1 f1Var = (jel.f1) it21.next();
                                        Intrinsics.checkNotNullParameter(f1Var, "<this>");
                                        arrayList2.add(new s.b(f1Var.f173439a, f1Var.f173440b, f1Var.d, f1Var.e, f1Var.f, f1Var.f173442g, f1Var.f173441c));
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                sVar = new hcl.s(arrayList, arrayList2);
                            } else {
                                vVar2 = vVar;
                                sVar = null;
                            }
                            kVar.b(new hcl.t(str2, str17, str19, wVar, yVar, zVar, uVar, xVar, vVar2, sVar));
                        } else if (details instanceof jel.w2) {
                            dcl.r0 r0Var2 = oVar2.f288016j;
                            jel.w2 w2Var2 = (jel.w2) details;
                            Intrinsics.checkNotNullParameter(w2Var2, "<this>");
                            String str27 = w2Var2.f173586b;
                            String str28 = w2Var2.f173585a;
                            String str29 = w2Var2.f173587c;
                            String str30 = w2Var2.d;
                            jel.y1 y1Var2 = w2Var2.e;
                            h2 h2Var = new h2(y1Var2.f173609a, y1Var2.f173610b, y1Var2.f173611c, y1Var2.d, y1Var2.e, y1Var2.f);
                            jel.r1 r1Var = w2Var2.f;
                            if (r1Var != null) {
                                BigDecimal bigDecimal10 = r1Var.f173557a;
                                jel.u1 u1Var = r1Var.f173558b;
                                String strName4 = u1Var != null ? u1Var.name() : null;
                                jel.s1 s1Var = r1Var.f173559c;
                                String strName5 = s1Var != null ? s1Var.name() : null;
                                BigDecimal bigDecimal11 = r1Var.d;
                                LocalDate localDate7 = r1Var.e;
                                e2 e2Var = r1Var.f;
                                b2Var = new b2(bigDecimal10, strName4, strName5, bigDecimal11, localDate7, e2Var != null ? e2Var.name() : null);
                            } else {
                                b2Var = null;
                            }
                            jel.p1 p1Var = w2Var2.f173588g;
                            if (p1Var != null) {
                                BigDecimal bigDecimal12 = p1Var.f173534a;
                                BigDecimal bigDecimal13 = p1Var.f173535b;
                                jel.u1 u1Var2 = p1Var.f173536c;
                                String strName6 = u1Var2 != null ? u1Var2.name() : null;
                                BigDecimal bigDecimal14 = p1Var.d;
                                LocalDate localDate8 = p1Var.e;
                                e2 e2Var2 = p1Var.f;
                                z1Var = new z1(bigDecimal12, bigDecimal13, strName6, bigDecimal14, localDate8, e2Var2 != null ? e2Var2.name() : null);
                            } else {
                                z1Var = null;
                            }
                            jel.q1 q1Var = w2Var2.f173589h;
                            if (q1Var != null) {
                                BigDecimal bigDecimal15 = q1Var.f173545a;
                                BigDecimal bigDecimal16 = q1Var.f173546b;
                                BigDecimal bigDecimal17 = q1Var.f173547c;
                                e2 e2Var3 = q1Var.d;
                                a2Var = new a2(bigDecimal15, bigDecimal16, bigDecimal17, e2Var3 != null ? e2Var3.name() : null);
                            } else {
                                a2Var = null;
                            }
                            jel.t1 t1Var = w2Var2.i;
                            if (t1Var != null) {
                                BigDecimal bigDecimal18 = t1Var.f173566a;
                                BigDecimal bigDecimal19 = t1Var.f173567b;
                                BigDecimal bigDecimal20 = t1Var.f173568c;
                                BigDecimal bigDecimal21 = t1Var.d;
                                e2 e2Var4 = t1Var.e;
                                c2Var = new c2(e2Var4 != null ? e2Var4.name() : null, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21);
                            } else {
                                c2Var = null;
                            }
                            ArrayList<x1> arrayList20 = w2Var2.f173590j;
                            ArrayList arrayList21 = new ArrayList(zhm.w.t(arrayList20, 10));
                            for (x1 x1Var : arrayList20) {
                                arrayList21.add(new g2(x1Var.f173602a, x1Var.f173603b));
                            }
                            ArrayList<v2> arrayList22 = w2Var2.k;
                            ArrayList arrayList23 = new ArrayList(zhm.w.t(arrayList22, 10));
                            for (v2 v2Var : arrayList22) {
                                String str31 = v2Var.f173579a;
                                String str32 = v2Var.f173580b;
                                String str33 = v2Var.f173581c;
                                jel.g2 g2Var = v2Var.d;
                                jo3.b bVarA9 = (g2Var == null || (dVar = g2Var.f173451a) == null) ? null : hx7.a.A(dVar);
                                ej0.b bVar9 = v2Var.e;
                                arrayList23.add(new s2(str31, str32, str33, bVarA9, bVar9 != null ? cp5.c.M(bVar9) : null));
                            }
                            jel.w1 w1Var = w2Var2.f173591l;
                            String str34 = w1Var.f173582a;
                            String str35 = w1Var.f173583b;
                            jel.k2 k2Var2 = w1Var.f173584c;
                            if (k2Var2 != null) {
                                yel.b bVar10 = k2Var2.f173492a;
                                f2Var = new f2(bVar10 != null ? xcl.a.c(bVar10) : null);
                            } else {
                                f2Var = null;
                            }
                            jel.v1 v1Var = w1Var.d;
                            d2 d2Var = new d2(str34, str35, f2Var, v1Var != null ? new hcl.e2(v1Var.f173578b, v1Var.f173577a) : null);
                            List list22 = w2Var2.f173592m;
                            ArrayList arrayList24 = new ArrayList(zhm.w.t(list22, 10));
                            Iterator it22 = list22.iterator();
                            while (it22.hasNext()) {
                                arrayList24.add(((jel.o1) it22.next()).name());
                            }
                            ArrayList arrayList25 = w2Var2.f173593n;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            Iterator it23 = arrayList25.iterator();
                            while (it23.hasNext()) {
                                jel.a2 a2Var2 = (jel.a2) it23.next();
                                String str36 = a2Var2.f173405a;
                                String str37 = a2Var2.f173406b;
                                String str38 = str27;
                                String str39 = a2Var2.f173407c;
                                ArrayList arrayList27 = a2Var2.d;
                                String str40 = str28;
                                String str41 = str29;
                                String str42 = str30;
                                ArrayList arrayList28 = new ArrayList(zhm.w.t(arrayList27, 10));
                                Iterator it24 = arrayList27.iterator();
                                while (it24.hasNext()) {
                                    jel.h2 h2Var2 = (jel.h2) it24.next();
                                    BigDecimal bigDecimal22 = h2Var2.f173466a;
                                    Iterator it25 = it24;
                                    BigDecimal bigDecimal23 = h2Var2.f173467b;
                                    String strName7 = h2Var2.f173468c.name();
                                    String str43 = h2Var2.d;
                                    i2 i2Var = h2Var2.e;
                                    if (i2Var != null) {
                                        str = str43;
                                        it8 = it23;
                                        n2Var = new n2(i2Var.f173477a, i2Var.f173478b);
                                    } else {
                                        it8 = it23;
                                        str = str43;
                                        n2Var = null;
                                    }
                                    arrayList28.add(new m2(bigDecimal22, bigDecimal23, strName7, str, n2Var));
                                    it24 = it25;
                                    it23 = it8;
                                }
                                arrayList26.add(new j2(str36, str37, str39, arrayList28));
                                str27 = str38;
                                str28 = str40;
                                str29 = str41;
                                str30 = str42;
                            }
                            String str44 = str27;
                            String str45 = str28;
                            String str46 = str29;
                            String str47 = str30;
                            jel.d2 d2Var2 = w2Var2.o;
                            if (d2Var2 != null) {
                                ArrayList<jel.b2> arrayList29 = d2Var2.f173434a;
                                ArrayList arrayList30 = new ArrayList(zhm.w.t(arrayList29, 10));
                                for (jel.b2 b2Var2 : arrayList29) {
                                    BigDecimal bigDecimal24 = b2Var2.f173417a;
                                    BigDecimal bigDecimal25 = b2Var2.f173418b;
                                    boolean z3 = b2Var2.f173419c;
                                    jel.c2 c2Var2 = b2Var2.d;
                                    arrayList30.add(new k2.a(bigDecimal24, bigDecimal25, z3, c2Var2 != null ? c2Var2.name() : null));
                                }
                                k2Var = new k2(arrayList30, d2Var2.f173435b);
                            } else {
                                k2Var = null;
                            }
                            ArrayList<jel.f2> arrayList31 = w2Var2.f173594p;
                            ArrayList arrayList32 = new ArrayList(zhm.w.t(arrayList31, 10));
                            for (jel.f2 f2Var2 : arrayList31) {
                                arrayList32.add(new l2(tcl.n.c(f2Var2.f173443a), tcl.n.c(f2Var2.f173444b)));
                            }
                            jel.z1 z1Var2 = w2Var2.f173595q;
                            hcl.i2 i2Var2 = z1Var2 != null ? new hcl.i2(z1Var2.f173616b, z1Var2.f173615a) : null;
                            jel.l2 l2Var = w2Var2.f173596r;
                            r0Var2.b(new t2(str44, str45, str46, str47, h2Var, b2Var, z1Var, a2Var, c2Var, arrayList21, arrayList23, d2Var, arrayList24, arrayList26, k2Var, arrayList32, i2Var2, l2Var != null ? new o2(l2Var.f173497b, l2Var.f173496a) : null));
                        } else {
                            if (!(details instanceof jel.m1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dcl.p0 p0Var2 = oVar2.i;
                            jel.m1 m1Var = (jel.m1) details;
                            Intrinsics.checkNotNullParameter(m1Var, "<this>");
                            String str48 = m1Var.f173506a;
                            String str49 = m1Var.f173507b;
                            String str50 = m1Var.f173508c;
                            jel.n1 n1Var = m1Var.d;
                            if (n1Var != null) {
                                Intrinsics.checkNotNullParameter(n1Var, "<this>");
                                y1Var = new y1(n1Var.f173519a, n1Var.f173520b, n1Var.f173521c, n1Var.d, n1Var.e, n1Var.f);
                            } else {
                                y1Var = null;
                            }
                            p0Var2.b(new hcl.x1(str49, str48, str50, y1Var));
                        }
                        return Unit.f186387a;
                    case 4:
                        l params = (l) obj2;
                        jel.i1 recommendations = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
                        oVar2.f288017l.f(params.a(), recommendations);
                        return Unit.f186387a;
                    case 5:
                        jel.i1 recommendations2 = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter((l) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recommendations2, "recommendations");
                        dcl.w wVar2 = oVar2.f288013c;
                        Object obj7 = tcl.g.f269882a;
                        Intrinsics.checkNotNullParameter(recommendations2, "<this>");
                        String str51 = recommendations2.f173475a;
                        ArrayList<jel.z2> arrayList33 = recommendations2.f173476b;
                        ArrayList arrayList34 = new ArrayList(zhm.w.t(arrayList33, 10));
                        for (jel.z2 z2Var3 : arrayList33) {
                            Intrinsics.checkNotNullParameter(z2Var3, "<this>");
                            arrayList34.add(new z2(le.u1.g(z2Var3.d, tcl.g.f269883b), z2Var3.f173617a, z2Var3.f173618b, z2Var3.f173619c, z2Var3.e));
                        }
                        wVar2.b(new hcl.m0(str51, arrayList34));
                        return Unit.f186387a;
                    default:
                        String ref5 = (String) obj2;
                        jel.l1 targetMarket2 = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref5, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket2, "targetMarket");
                        oVar2.f288017l.f(o.f288009s + ref5, targetMarket2);
                        return Unit.f186387a;
                }
            }
        }, new Function1(this) { // from class: vdl.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287980b;

            {
                this.f287980b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:435:0x09b7  */
            /* JADX WARN: Removed duplicated region for block: B:443:0x09de  */
            /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r42) {
                /*
                    Method dump skipped, instruction units count: 3680
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vdl.i.invoke(java.lang.Object):java.lang.Object");
            }
        }, new Function2(this) { // from class: vdl.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287983b;

            {
                this.f287983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                y1 y1Var;
                b2 b2Var;
                z1 z1Var;
                a2 a2Var;
                c2 c2Var;
                f2 f2Var;
                k2 k2Var;
                Iterator it8;
                String str;
                n2 n2Var;
                dj0.d dVar;
                hcl.w wVar;
                hcl.y yVar;
                hcl.z zVar;
                hcl.u uVar;
                String str2;
                hcl.x xVar;
                hcl.v vVar;
                hcl.v vVar2;
                hcl.s sVar;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                x.a aVar;
                x.c cVar;
                x.b bVar;
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                ArrayList arrayList7;
                ArrayList arrayList8;
                ArrayList arrayList9;
                hcl.h hVar;
                hcl.c cVar2;
                hcl.o0 o0Var;
                hcl.b bVar2;
                ArrayList arrayList10;
                z2 z2Var;
                w2 w2Var;
                hcl.o oVar;
                hcl.n nVar;
                ArrayList arrayList11;
                ArrayList arrayList12;
                ArrayList arrayList13;
                ArrayList arrayList14;
                int i21 = i6;
                o oVar2 = this.f287983b;
                switch (i21) {
                    case 0:
                        String ref2 = (String) obj2;
                        jel.l1 targetMarket = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket, "targetMarket");
                        dcl.r rVar = oVar2.d;
                        Object obj4 = tcl.j.f269888a;
                        Intrinsics.checkNotNullParameter(targetMarket, "<this>");
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        rVar.b(new hcl.q0(ref2, le.u1.g(targetMarket, tcl.j.f269888a)));
                        return Unit.f186387a;
                    case 1:
                        String ref3 = (String) obj2;
                        nel.w summary = (nel.w) obj3;
                        Intrinsics.checkNotNullParameter(ref3, "ref");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        oVar2.f288017l.f(o.f288010t + ref3, summary);
                        return Unit.f186387a;
                    case 2:
                        String ref4 = (String) obj2;
                        jel.c instrumentDetails = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter(ref4, "ref");
                        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
                        oVar2.f288017l.f(ref4, instrumentDetails);
                        return Unit.f186387a;
                    case 3:
                        jel.c details = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(details, "details");
                        if (details instanceof jel.q) {
                            dcl.g gVar = oVar2.e;
                            jel.q qVar = (jel.q) details;
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            String str3 = qVar.f173541b;
                            String str4 = qVar.f173540a;
                            jel.s sVar2 = qVar.e;
                            if (sVar2 != null) {
                                dj0.d dVar2 = sVar2.f173561a;
                                jo3.b bVarA = dVar2 != null ? hx7.a.A(dVar2) : null;
                                dj0.d dVar3 = sVar2.f173562b;
                                oVar = new hcl.o(bVarA, dVar3 != null ? hx7.a.A(dVar3) : null, sVar2.f173563c, sVar2.d, sVar2.e, sVar2.f);
                            } else {
                                oVar = null;
                            }
                            jel.r rVar2 = qVar.f;
                            if (rVar2 != null) {
                                List list = rVar2.f173551a;
                                if (list != null) {
                                    arrayList12 = new ArrayList();
                                    Iterator it9 = list.iterator();
                                    while (it9.hasNext()) {
                                        hcl.a aVarV = zh9.u0.V((jel.p) it9.next());
                                        hcl.l lVar = aVarV instanceof hcl.l ? (hcl.l) aVarV : null;
                                        if (lVar != null) {
                                            arrayList12.add(lVar);
                                        }
                                    }
                                } else {
                                    arrayList12 = null;
                                }
                                List list2 = rVar2.f173552b;
                                if (list2 != null) {
                                    arrayList13 = new ArrayList();
                                    Iterator it10 = list2.iterator();
                                    while (it10.hasNext()) {
                                        hcl.a aVarV2 = zh9.u0.V((b3) it10.next());
                                        hcl.b3 b3Var = aVarV2 instanceof hcl.b3 ? (hcl.b3) aVarV2 : null;
                                        if (b3Var != null) {
                                            arrayList13.add(b3Var);
                                        }
                                    }
                                } else {
                                    arrayList13 = null;
                                }
                                List list3 = rVar2.f173553c;
                                if (list3 != null) {
                                    arrayList14 = new ArrayList();
                                    Iterator it11 = list3.iterator();
                                    while (it11.hasNext()) {
                                        hcl.a aVarV3 = zh9.u0.V((jel.g1) it11.next());
                                        hcl.h0 h0Var = aVarV3 instanceof hcl.h0 ? (hcl.h0) aVarV3 : null;
                                        if (h0Var != null) {
                                            arrayList14.add(h0Var);
                                        }
                                    }
                                } else {
                                    arrayList14 = null;
                                }
                                nVar = new hcl.n(arrayList12, arrayList13, arrayList14);
                            } else {
                                nVar = null;
                            }
                            String str5 = qVar.f173542c;
                            String str6 = qVar.d;
                            String str7 = qVar.f173543g;
                            String str8 = qVar.f173544h;
                            List list4 = qVar.i;
                            if (list4 != null) {
                                List<jel.k1> list5 = list4;
                                ArrayList arrayList15 = new ArrayList(zhm.w.t(list5, 10));
                                for (jel.k1 k1Var : list5) {
                                    Intrinsics.checkNotNullParameter(k1Var, "<this>");
                                    arrayList15.add(new hcl.p0(k1Var.f173490a, k1Var.f173491b));
                                }
                                arrayList11 = arrayList15;
                            } else {
                                arrayList11 = null;
                            }
                            gVar.b(new hcl.m(str3, str4, str5, str6, oVar, nVar, str7, str8, arrayList11));
                        } else if (details instanceof jel.h1) {
                            dcl.i0 i0Var = oVar2.f288012b;
                            jel.h1 h1Var = (jel.h1) details;
                            Object obj5 = tcl.g.f269882a;
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            String str9 = h1Var.f173461a;
                            String str10 = h1Var.f173462b;
                            jel.j1 j1Var = h1Var.e;
                            if (j1Var != null) {
                                Intrinsics.checkNotNullParameter(j1Var, "<this>");
                                dj0.d dVar4 = j1Var.f173485a;
                                jo3.b bVarA2 = dVar4 != null ? hx7.a.A(dVar4) : null;
                                Double d = j1Var.f173486b;
                                Double d5 = j1Var.f173487c;
                                dj0.d dVar5 = j1Var.d;
                                jo3.b bVarA3 = dVar5 != null ? hx7.a.A(dVar5) : null;
                                dj0.d dVar6 = j1Var.e;
                                jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                                dj0.d dVar7 = j1Var.f;
                                o0Var = new hcl.o0(bVarA2, d, d5, bVarA3, bVarA4, dVar7 != null ? hx7.a.A(dVar7) : null, j1Var.f173488g, j1Var.f173489h, j1Var.i);
                            } else {
                                o0Var = null;
                            }
                            String str11 = h1Var.f173463c;
                            String str12 = h1Var.d;
                            String strH = le.u1.h(h1Var.f, tcl.g.f269882a);
                            if (strH == null) {
                                strH = "";
                            }
                            String str13 = strH;
                            String strB = tbl.a.b(h1Var.f173465h);
                            jel.b bVar3 = h1Var.f173464g;
                            if (bVar3 != null) {
                                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                                jel.z2 z2Var2 = bVar3.f173409a;
                                if (z2Var2 != null) {
                                    Intrinsics.checkNotNullParameter(z2Var2, "<this>");
                                    z2Var = new z2(le.u1.g(z2Var2.d, tcl.g.f269883b), z2Var2.f173617a, z2Var2.f173618b, z2Var2.f173619c, z2Var2.e);
                                } else {
                                    z2Var = null;
                                }
                                x2 x2Var = bVar3.f173410b;
                                if (x2Var != null) {
                                    Intrinsics.checkNotNullParameter(x2Var, "<this>");
                                    w2Var = new w2(hx7.a.A(x2Var.f173604a), hx7.a.A(x2Var.f173605b), hx7.a.A(x2Var.f173606c), x2Var.d, x2Var.e);
                                } else {
                                    w2Var = null;
                                }
                                bVar2 = new hcl.b(z2Var, w2Var);
                            } else {
                                bVar2 = null;
                            }
                            List list6 = h1Var.i;
                            if (list6 != null) {
                                List<jel.k1> list7 = list6;
                                ArrayList arrayList16 = new ArrayList(zhm.w.t(list7, 10));
                                for (jel.k1 k1Var2 : list7) {
                                    Intrinsics.checkNotNullParameter(k1Var2, "<this>");
                                    arrayList16.add(new hcl.p0(k1Var2.f173490a, k1Var2.f173491b));
                                }
                                arrayList10 = arrayList16;
                            } else {
                                arrayList10 = null;
                            }
                            i0Var.b(new hcl.i0(str10, str9, str11, str12, o0Var, str13, strB, bVar2, arrayList10));
                        } else if (details instanceof jel.m) {
                            dcl.a aVar2 = oVar2.f;
                            jel.m mVar = (jel.m) details;
                            Object obj6 = tcl.b.f269876a;
                            Intrinsics.checkNotNullParameter(mVar, "<this>");
                            String str14 = mVar.f173499b;
                            String str15 = mVar.f173498a;
                            String str16 = mVar.f173500c;
                            jel.h hVar2 = mVar.d;
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            LocalDate localDate = hVar2.f173452a;
                            dj0.d dVar8 = hVar2.f173453b;
                            jo3.b bVarA5 = dVar8 != null ? hx7.a.A(dVar8) : null;
                            LocalDate localDate2 = hVar2.f173454c;
                            dj0.d dVar9 = hVar2.d;
                            jo3.b bVarA6 = dVar9 != null ? hx7.a.A(dVar9) : null;
                            dj0.d dVar10 = hVar2.e;
                            hcl.e eVar = new hcl.e(localDate, bVarA5, localDate2, bVarA6, dVar10 != null ? hx7.a.A(dVar10) : null);
                            jel.i iVar = mVar.e;
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            hcl.f fVar = new hcl.f(iVar.f173469a, iVar.f173470b, iVar.f173471c);
                            jel.e eVar2 = mVar.f;
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            BigDecimal bigDecimal3 = eVar2.f173436a;
                            jel.g gVar2 = eVar2.f173437b;
                            String strH2 = gVar2 != null ? le.u1.h(gVar2, tcl.b.f269876a) : null;
                            LocalDate localDate3 = eVar2.f173438c;
                            jel.f fVar2 = eVar2.d;
                            hcl.d dVar11 = new hcl.d(bigDecimal3, strH2, localDate3, fVar2 != null ? le.u1.h(fVar2, tcl.b.f269877b) : null);
                            jel.j jVar = mVar.f173501g;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            ej0.b bVar4 = jVar.f173479a;
                            ko3.b bVarM = bVar4 != null ? cp5.c.M(bVar4) : null;
                            ej0.b bVar5 = jVar.f173480b;
                            ko3.b bVarM2 = bVar5 != null ? cp5.c.M(bVar5) : null;
                            ej0.b bVar6 = jVar.f173481c;
                            hcl.g gVar3 = new hcl.g(bVarM, bVarM2, bVar6 != null ? cp5.c.M(bVar6) : null, jVar.d, jVar.e);
                            jel.l lVar2 = mVar.f173502h;
                            if (lVar2 != null) {
                                Intrinsics.checkNotNullParameter(lVar2, "<this>");
                                int i22 = lVar2.f173493a;
                                yel.b bVar7 = lVar2.f173494b;
                                hVar = new hcl.h(i22, bVar7 != null ? xcl.a.c(bVar7) : null, lVar2.f173495c);
                            } else {
                                hVar = null;
                            }
                            jel.d dVar12 = mVar.i;
                            if (dVar12 != null) {
                                Intrinsics.checkNotNullParameter(dVar12, "<this>");
                                boolean z = dVar12.f173427a;
                                LocalDate localDate4 = dVar12.f173428b;
                                dj0.d dVar13 = dVar12.f173429c;
                                cVar2 = new hcl.c(z, localDate4, dVar13 != null ? hx7.a.A(dVar13) : null, dVar12.d);
                            } else {
                                cVar2 = null;
                            }
                            aVar2.b(new hcl.i(str14, str15, str16, eVar, fVar, dVar11, gVar3, hVar, cVar2));
                        } else if (details instanceof jel.n) {
                            dcl.e eVar3 = oVar2.f288014g;
                            jel.n nVar2 = (jel.n) details;
                            Intrinsics.checkNotNullParameter(nVar2, "<this>");
                            eVar3.b(new hcl.k(nVar2.f173513b, nVar2.f173512a, nVar2.f173514c, nVar2.d, nVar2.e));
                        } else if (details instanceof jel.b0) {
                            dcl.k kVar = oVar2.f288015h;
                            jel.b0 b0Var = (jel.b0) details;
                            Intrinsics.checkNotNullParameter(b0Var, "<this>");
                            String str17 = b0Var.f173411a;
                            String str18 = b0Var.f173412b;
                            String str19 = b0Var.f173413c;
                            jel.h0 h0Var2 = b0Var.d;
                            if (h0Var2 != null) {
                                Intrinsics.checkNotNullParameter(h0Var2, "<this>");
                                jel.k0 k0Var = h0Var2.f173455a;
                                String strName = k0Var != null ? k0Var.name() : null;
                                String str20 = h0Var2.f173456b;
                                String str21 = h0Var2.f173457c;
                                LocalDate localDate5 = h0Var2.d;
                                List list8 = h0Var2.e;
                                if (list8 != null) {
                                    List<jel.g0> list9 = list8;
                                    ArrayList arrayList17 = new ArrayList(zhm.w.t(list9, 10));
                                    for (jel.g0 g0Var : list9) {
                                        Intrinsics.checkNotNullParameter(g0Var, "<this>");
                                        arrayList17.add(new w.a(g0Var.f173445a, g0Var.f173446b, g0Var.f173447c));
                                    }
                                    arrayList9 = arrayList17;
                                } else {
                                    arrayList9 = null;
                                }
                                dj0.d dVar14 = h0Var2.f;
                                jo3.b bVarA7 = dVar14 != null ? hx7.a.A(dVar14) : null;
                                jel.e1 e1Var = h0Var2.f173458g;
                                String strName2 = e1Var != null ? e1Var.name() : null;
                                jel.a0 a0Var = h0Var2.f173459h;
                                String strName3 = a0Var != null ? a0Var.name() : null;
                                jel.y yVar2 = h0Var2.i;
                                wVar = new hcl.w(strName, str20, str21, localDate5, arrayList9, bVarA7, strName2, strName3, yVar2 != null ? yVar2.name() : null, h0Var2.f173460j);
                            } else {
                                wVar = null;
                            }
                            jel.m0 m0Var = b0Var.e;
                            if (m0Var != null) {
                                Intrinsics.checkNotNullParameter(m0Var, "<this>");
                                String str22 = m0Var.f173503a;
                                String str23 = m0Var.f173504b;
                                dj0.d dVar15 = m0Var.f173505c;
                                jo3.b bVarA8 = dVar15 != null ? hx7.a.A(dVar15) : null;
                                LocalDate localDate6 = m0Var.d;
                                List list10 = m0Var.e;
                                if (list10 != null) {
                                    List list11 = list10;
                                    ArrayList arrayList18 = new ArrayList(zhm.w.t(list11, 10));
                                    Iterator it12 = list11.iterator();
                                    while (it12.hasNext()) {
                                        jel.z zVar2 = (jel.z) it12.next();
                                        Intrinsics.checkNotNullParameter(zVar2, "<this>");
                                        arrayList18.add(new y.a(zVar2.f173612a, zVar2.f173613b, zVar2.f173614c, zVar2.d));
                                        it12 = it12;
                                        localDate6 = localDate6;
                                    }
                                    arrayList8 = arrayList18;
                                } else {
                                    arrayList8 = null;
                                }
                                yVar = new hcl.y(str22, str23, bVarA8, localDate6, arrayList8);
                            } else {
                                yVar = null;
                            }
                            jel.n0 n0Var = b0Var.f;
                            if (n0Var != null) {
                                Intrinsics.checkNotNullParameter(n0Var, "<this>");
                                BigDecimal bigDecimal4 = n0Var.f173515a;
                                BigDecimal bigDecimal5 = n0Var.f173516b;
                                BigDecimal bigDecimal6 = n0Var.f173517c;
                                BigDecimal bigDecimal7 = n0Var.d;
                                BigDecimal bigDecimal8 = n0Var.e;
                                Integer num = n0Var.f;
                                List list12 = n0Var.f173518g;
                                if (list12 != null) {
                                    List list13 = list12;
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    ArrayList arrayList19 = new ArrayList(zhm.w.t(list13, 10));
                                    Iterator it13 = list13.iterator();
                                    while (it13.hasNext()) {
                                        jel.p0 p0Var = (jel.p0) it13.next();
                                        Iterator it14 = it13;
                                        jel.q0 q0Var = p0Var.f173532a;
                                        arrayList19.add(new z.a(q0Var != null ? q0Var.name() : null, p0Var.f173533b));
                                        it13 = it14;
                                    }
                                    arrayList7 = arrayList19;
                                } else {
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    arrayList7 = null;
                                }
                                zVar = new hcl.z(bigDecimal4, bigDecimal5, bigDecimal, bigDecimal2, bigDecimal8, num, arrayList7);
                            } else {
                                zVar = null;
                            }
                            jel.c0 c0Var = b0Var.f173414g;
                            if (c0Var != null) {
                                Intrinsics.checkNotNullParameter(c0Var, "<this>");
                                uVar = new hcl.u(c0Var.f173422a, c0Var.f173423b, c0Var.f173424c, c0Var.d, c0Var.e, c0Var.f);
                            } else {
                                uVar = null;
                            }
                            jel.j0 j0Var = b0Var.f173415h;
                            if (j0Var != null) {
                                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                                jel.o0 o0Var2 = j0Var.f173482a;
                                if (o0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(o0Var2, "<this>");
                                    aVar = new x.a(o0Var2.f173525a, o0Var2.f173526b);
                                } else {
                                    aVar = null;
                                }
                                jel.d1 d1Var = j0Var.f173483b;
                                if (d1Var != null) {
                                    Intrinsics.checkNotNullParameter(d1Var, "<this>");
                                    jel.f0 f0Var = d1Var.f173433a;
                                    cVar = new x.c(f0Var != null ? f0Var.name() : null);
                                } else {
                                    cVar = null;
                                }
                                jel.r0 r0Var = j0Var.f173484c;
                                if (r0Var != null) {
                                    Intrinsics.checkNotNullParameter(r0Var, "<this>");
                                    jel.f0 f0Var2 = r0Var.f173554a;
                                    str2 = str18;
                                    bVar = new x.b(f0Var2 != null ? f0Var2.name() : null, r0Var.f173555b, r0Var.f173556c);
                                } else {
                                    str2 = str18;
                                    bVar = null;
                                }
                                xVar = new hcl.x(aVar, cVar, bVar);
                            } else {
                                str2 = str18;
                                xVar = null;
                            }
                            jel.d0 d0Var = b0Var.i;
                            if (d0Var != null) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                List list14 = d0Var.f173430a;
                                if (list14 != null) {
                                    arrayList3 = new ArrayList();
                                    Iterator it15 = list14.iterator();
                                    while (it15.hasNext()) {
                                        hcl.q qVarC = tcl.d.c((jel.x0) it15.next());
                                        hcl.d0 d0Var2 = qVarC instanceof hcl.d0 ? (hcl.d0) qVarC : null;
                                        if (d0Var2 != null) {
                                            arrayList3.add(d0Var2);
                                        }
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                List list15 = d0Var.f173431b;
                                if (list15 != null) {
                                    arrayList4 = new ArrayList();
                                    Iterator it16 = list15.iterator();
                                    while (it16.hasNext()) {
                                        hcl.q qVarC2 = tcl.d.c((jel.v0) it16.next());
                                        hcl.b0 b0Var2 = qVarC2 instanceof hcl.b0 ? (hcl.b0) qVarC2 : null;
                                        if (b0Var2 != null) {
                                            arrayList4.add(b0Var2);
                                        }
                                    }
                                } else {
                                    arrayList4 = null;
                                }
                                List list16 = d0Var.f173432c;
                                if (list16 != null) {
                                    arrayList5 = new ArrayList();
                                    Iterator it17 = list16.iterator();
                                    while (it17.hasNext()) {
                                        hcl.q qVarC3 = tcl.d.c((jel.t0) it17.next());
                                        Iterator it18 = it17;
                                        hcl.a0 a0Var2 = qVarC3 instanceof hcl.a0 ? (hcl.a0) qVarC3 : null;
                                        if (a0Var2 != null) {
                                            arrayList5.add(a0Var2);
                                        }
                                        it17 = it18;
                                    }
                                } else {
                                    arrayList5 = null;
                                }
                                List list17 = d0Var.d;
                                if (list17 != null) {
                                    arrayList6 = new ArrayList();
                                    Iterator it19 = list17.iterator();
                                    while (it19.hasNext()) {
                                        hcl.q qVarC4 = tcl.d.c((jel.u) it19.next());
                                        Iterator it20 = it19;
                                        hcl.r rVar3 = qVarC4 instanceof hcl.r ? (hcl.r) qVarC4 : null;
                                        if (rVar3 != null) {
                                            arrayList6.add(rVar3);
                                        }
                                        it19 = it20;
                                    }
                                } else {
                                    arrayList6 = null;
                                }
                                vVar = new hcl.v(arrayList3, arrayList4, arrayList5, arrayList6);
                            } else {
                                vVar = null;
                            }
                            jel.x xVar2 = b0Var.f173416j;
                            if (xVar2 != null) {
                                Intrinsics.checkNotNullParameter(xVar2, "<this>");
                                List list18 = xVar2.f173597a;
                                if (list18 != null) {
                                    List<jel.i0> list19 = list18;
                                    arrayList = new ArrayList(zhm.w.t(list19, 10));
                                    for (jel.i0 i0Var2 : list19) {
                                        Intrinsics.checkNotNullParameter(i0Var2, "<this>");
                                        String str24 = i0Var2.f173472a;
                                        BigDecimal bigDecimal9 = i0Var2.f173473b;
                                        hcl.v vVar3 = vVar;
                                        String str25 = i0Var2.f173474c;
                                        String str26 = i0Var2.d;
                                        xi0.b bVar8 = i0Var2.e;
                                        arrayList.add(new s.a(str24, str25, str26, bVar8 != null ? bVar8.f306286a : null, bigDecimal9));
                                        vVar = vVar3;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                vVar2 = vVar;
                                List list20 = xVar2.f173598b;
                                if (list20 != null) {
                                    List list21 = list20;
                                    arrayList2 = new ArrayList(zhm.w.t(list21, 10));
                                    for (Iterator it21 = list21.iterator(); it21.hasNext(); it21 = it21) {
                                        jel.f1 f1Var = (jel.f1) it21.next();
                                        Intrinsics.checkNotNullParameter(f1Var, "<this>");
                                        arrayList2.add(new s.b(f1Var.f173439a, f1Var.f173440b, f1Var.d, f1Var.e, f1Var.f, f1Var.f173442g, f1Var.f173441c));
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                sVar = new hcl.s(arrayList, arrayList2);
                            } else {
                                vVar2 = vVar;
                                sVar = null;
                            }
                            kVar.b(new hcl.t(str2, str17, str19, wVar, yVar, zVar, uVar, xVar, vVar2, sVar));
                        } else if (details instanceof jel.w2) {
                            dcl.r0 r0Var2 = oVar2.f288016j;
                            jel.w2 w2Var2 = (jel.w2) details;
                            Intrinsics.checkNotNullParameter(w2Var2, "<this>");
                            String str27 = w2Var2.f173586b;
                            String str28 = w2Var2.f173585a;
                            String str29 = w2Var2.f173587c;
                            String str30 = w2Var2.d;
                            jel.y1 y1Var2 = w2Var2.e;
                            h2 h2Var = new h2(y1Var2.f173609a, y1Var2.f173610b, y1Var2.f173611c, y1Var2.d, y1Var2.e, y1Var2.f);
                            jel.r1 r1Var = w2Var2.f;
                            if (r1Var != null) {
                                BigDecimal bigDecimal10 = r1Var.f173557a;
                                jel.u1 u1Var = r1Var.f173558b;
                                String strName4 = u1Var != null ? u1Var.name() : null;
                                jel.s1 s1Var = r1Var.f173559c;
                                String strName5 = s1Var != null ? s1Var.name() : null;
                                BigDecimal bigDecimal11 = r1Var.d;
                                LocalDate localDate7 = r1Var.e;
                                e2 e2Var = r1Var.f;
                                b2Var = new b2(bigDecimal10, strName4, strName5, bigDecimal11, localDate7, e2Var != null ? e2Var.name() : null);
                            } else {
                                b2Var = null;
                            }
                            jel.p1 p1Var = w2Var2.f173588g;
                            if (p1Var != null) {
                                BigDecimal bigDecimal12 = p1Var.f173534a;
                                BigDecimal bigDecimal13 = p1Var.f173535b;
                                jel.u1 u1Var2 = p1Var.f173536c;
                                String strName6 = u1Var2 != null ? u1Var2.name() : null;
                                BigDecimal bigDecimal14 = p1Var.d;
                                LocalDate localDate8 = p1Var.e;
                                e2 e2Var2 = p1Var.f;
                                z1Var = new z1(bigDecimal12, bigDecimal13, strName6, bigDecimal14, localDate8, e2Var2 != null ? e2Var2.name() : null);
                            } else {
                                z1Var = null;
                            }
                            jel.q1 q1Var = w2Var2.f173589h;
                            if (q1Var != null) {
                                BigDecimal bigDecimal15 = q1Var.f173545a;
                                BigDecimal bigDecimal16 = q1Var.f173546b;
                                BigDecimal bigDecimal17 = q1Var.f173547c;
                                e2 e2Var3 = q1Var.d;
                                a2Var = new a2(bigDecimal15, bigDecimal16, bigDecimal17, e2Var3 != null ? e2Var3.name() : null);
                            } else {
                                a2Var = null;
                            }
                            jel.t1 t1Var = w2Var2.i;
                            if (t1Var != null) {
                                BigDecimal bigDecimal18 = t1Var.f173566a;
                                BigDecimal bigDecimal19 = t1Var.f173567b;
                                BigDecimal bigDecimal20 = t1Var.f173568c;
                                BigDecimal bigDecimal21 = t1Var.d;
                                e2 e2Var4 = t1Var.e;
                                c2Var = new c2(e2Var4 != null ? e2Var4.name() : null, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21);
                            } else {
                                c2Var = null;
                            }
                            ArrayList<x1> arrayList20 = w2Var2.f173590j;
                            ArrayList arrayList21 = new ArrayList(zhm.w.t(arrayList20, 10));
                            for (x1 x1Var : arrayList20) {
                                arrayList21.add(new g2(x1Var.f173602a, x1Var.f173603b));
                            }
                            ArrayList<v2> arrayList22 = w2Var2.k;
                            ArrayList arrayList23 = new ArrayList(zhm.w.t(arrayList22, 10));
                            for (v2 v2Var : arrayList22) {
                                String str31 = v2Var.f173579a;
                                String str32 = v2Var.f173580b;
                                String str33 = v2Var.f173581c;
                                jel.g2 g2Var = v2Var.d;
                                jo3.b bVarA9 = (g2Var == null || (dVar = g2Var.f173451a) == null) ? null : hx7.a.A(dVar);
                                ej0.b bVar9 = v2Var.e;
                                arrayList23.add(new s2(str31, str32, str33, bVarA9, bVar9 != null ? cp5.c.M(bVar9) : null));
                            }
                            jel.w1 w1Var = w2Var2.f173591l;
                            String str34 = w1Var.f173582a;
                            String str35 = w1Var.f173583b;
                            jel.k2 k2Var2 = w1Var.f173584c;
                            if (k2Var2 != null) {
                                yel.b bVar10 = k2Var2.f173492a;
                                f2Var = new f2(bVar10 != null ? xcl.a.c(bVar10) : null);
                            } else {
                                f2Var = null;
                            }
                            jel.v1 v1Var = w1Var.d;
                            d2 d2Var = new d2(str34, str35, f2Var, v1Var != null ? new hcl.e2(v1Var.f173578b, v1Var.f173577a) : null);
                            List list22 = w2Var2.f173592m;
                            ArrayList arrayList24 = new ArrayList(zhm.w.t(list22, 10));
                            Iterator it22 = list22.iterator();
                            while (it22.hasNext()) {
                                arrayList24.add(((jel.o1) it22.next()).name());
                            }
                            ArrayList arrayList25 = w2Var2.f173593n;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            Iterator it23 = arrayList25.iterator();
                            while (it23.hasNext()) {
                                jel.a2 a2Var2 = (jel.a2) it23.next();
                                String str36 = a2Var2.f173405a;
                                String str37 = a2Var2.f173406b;
                                String str38 = str27;
                                String str39 = a2Var2.f173407c;
                                ArrayList arrayList27 = a2Var2.d;
                                String str40 = str28;
                                String str41 = str29;
                                String str42 = str30;
                                ArrayList arrayList28 = new ArrayList(zhm.w.t(arrayList27, 10));
                                Iterator it24 = arrayList27.iterator();
                                while (it24.hasNext()) {
                                    jel.h2 h2Var2 = (jel.h2) it24.next();
                                    BigDecimal bigDecimal22 = h2Var2.f173466a;
                                    Iterator it25 = it24;
                                    BigDecimal bigDecimal23 = h2Var2.f173467b;
                                    String strName7 = h2Var2.f173468c.name();
                                    String str43 = h2Var2.d;
                                    i2 i2Var = h2Var2.e;
                                    if (i2Var != null) {
                                        str = str43;
                                        it8 = it23;
                                        n2Var = new n2(i2Var.f173477a, i2Var.f173478b);
                                    } else {
                                        it8 = it23;
                                        str = str43;
                                        n2Var = null;
                                    }
                                    arrayList28.add(new m2(bigDecimal22, bigDecimal23, strName7, str, n2Var));
                                    it24 = it25;
                                    it23 = it8;
                                }
                                arrayList26.add(new j2(str36, str37, str39, arrayList28));
                                str27 = str38;
                                str28 = str40;
                                str29 = str41;
                                str30 = str42;
                            }
                            String str44 = str27;
                            String str45 = str28;
                            String str46 = str29;
                            String str47 = str30;
                            jel.d2 d2Var2 = w2Var2.o;
                            if (d2Var2 != null) {
                                ArrayList<jel.b2> arrayList29 = d2Var2.f173434a;
                                ArrayList arrayList30 = new ArrayList(zhm.w.t(arrayList29, 10));
                                for (jel.b2 b2Var2 : arrayList29) {
                                    BigDecimal bigDecimal24 = b2Var2.f173417a;
                                    BigDecimal bigDecimal25 = b2Var2.f173418b;
                                    boolean z3 = b2Var2.f173419c;
                                    jel.c2 c2Var2 = b2Var2.d;
                                    arrayList30.add(new k2.a(bigDecimal24, bigDecimal25, z3, c2Var2 != null ? c2Var2.name() : null));
                                }
                                k2Var = new k2(arrayList30, d2Var2.f173435b);
                            } else {
                                k2Var = null;
                            }
                            ArrayList<jel.f2> arrayList31 = w2Var2.f173594p;
                            ArrayList arrayList32 = new ArrayList(zhm.w.t(arrayList31, 10));
                            for (jel.f2 f2Var2 : arrayList31) {
                                arrayList32.add(new l2(tcl.n.c(f2Var2.f173443a), tcl.n.c(f2Var2.f173444b)));
                            }
                            jel.z1 z1Var2 = w2Var2.f173595q;
                            hcl.i2 i2Var2 = z1Var2 != null ? new hcl.i2(z1Var2.f173616b, z1Var2.f173615a) : null;
                            jel.l2 l2Var = w2Var2.f173596r;
                            r0Var2.b(new t2(str44, str45, str46, str47, h2Var, b2Var, z1Var, a2Var, c2Var, arrayList21, arrayList23, d2Var, arrayList24, arrayList26, k2Var, arrayList32, i2Var2, l2Var != null ? new o2(l2Var.f173497b, l2Var.f173496a) : null));
                        } else {
                            if (!(details instanceof jel.m1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dcl.p0 p0Var2 = oVar2.i;
                            jel.m1 m1Var = (jel.m1) details;
                            Intrinsics.checkNotNullParameter(m1Var, "<this>");
                            String str48 = m1Var.f173506a;
                            String str49 = m1Var.f173507b;
                            String str50 = m1Var.f173508c;
                            jel.n1 n1Var = m1Var.d;
                            if (n1Var != null) {
                                Intrinsics.checkNotNullParameter(n1Var, "<this>");
                                y1Var = new y1(n1Var.f173519a, n1Var.f173520b, n1Var.f173521c, n1Var.d, n1Var.e, n1Var.f);
                            } else {
                                y1Var = null;
                            }
                            p0Var2.b(new hcl.x1(str49, str48, str50, y1Var));
                        }
                        return Unit.f186387a;
                    case 4:
                        l params = (l) obj2;
                        jel.i1 recommendations = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
                        oVar2.f288017l.f(params.a(), recommendations);
                        return Unit.f186387a;
                    case 5:
                        jel.i1 recommendations2 = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter((l) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recommendations2, "recommendations");
                        dcl.w wVar2 = oVar2.f288013c;
                        Object obj7 = tcl.g.f269882a;
                        Intrinsics.checkNotNullParameter(recommendations2, "<this>");
                        String str51 = recommendations2.f173475a;
                        ArrayList<jel.z2> arrayList33 = recommendations2.f173476b;
                        ArrayList arrayList34 = new ArrayList(zhm.w.t(arrayList33, 10));
                        for (jel.z2 z2Var3 : arrayList33) {
                            Intrinsics.checkNotNullParameter(z2Var3, "<this>");
                            arrayList34.add(new z2(le.u1.g(z2Var3.d, tcl.g.f269883b), z2Var3.f173617a, z2Var3.f173618b, z2Var3.f173619c, z2Var3.e));
                        }
                        wVar2.b(new hcl.m0(str51, arrayList34));
                        return Unit.f186387a;
                    default:
                        String ref5 = (String) obj2;
                        jel.l1 targetMarket2 = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref5, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket2, "targetMarket");
                        oVar2.f288017l.f(o.f288009s + ref5, targetMarket2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 4;
        final int i22 = 5;
        final int i32 = 4;
        final int i33 = 6;
        final int i43 = 5;
        this.o = new w4l.f(te0.w.k0(connectivityRepository, new Function1(this) { // from class: vdl.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287980b;

            {
                this.f287980b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:435:0x09b7  */
            /* JADX WARN: Removed duplicated region for block: B:443:0x09de  */
            /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r42) {
                /*
                    Method dump skipped, instruction units count: 3680
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vdl.i.invoke(java.lang.Object):java.lang.Object");
            }
        }), new Function1(this) { // from class: vdl.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287980b;

            {
                this.f287980b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:435:0x09b7  */
            /* JADX WARN: Removed duplicated region for block: B:443:0x09de  */
            /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r42) {
                /*
                    Method dump skipped, instruction units count: 3680
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vdl.i.invoke(java.lang.Object):java.lang.Object");
            }
        }, new Function2(this) { // from class: vdl.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287983b;

            {
                this.f287983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                y1 y1Var;
                b2 b2Var;
                z1 z1Var;
                a2 a2Var;
                c2 c2Var;
                f2 f2Var;
                k2 k2Var;
                Iterator it8;
                String str;
                n2 n2Var;
                dj0.d dVar;
                hcl.w wVar;
                hcl.y yVar;
                hcl.z zVar;
                hcl.u uVar;
                String str2;
                hcl.x xVar;
                hcl.v vVar;
                hcl.v vVar2;
                hcl.s sVar;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                x.a aVar;
                x.c cVar;
                x.b bVar;
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                ArrayList arrayList7;
                ArrayList arrayList8;
                ArrayList arrayList9;
                hcl.h hVar;
                hcl.c cVar2;
                hcl.o0 o0Var;
                hcl.b bVar2;
                ArrayList arrayList10;
                z2 z2Var;
                w2 w2Var;
                hcl.o oVar;
                hcl.n nVar;
                ArrayList arrayList11;
                ArrayList arrayList12;
                ArrayList arrayList13;
                ArrayList arrayList14;
                int i212 = i32;
                o oVar2 = this.f287983b;
                switch (i212) {
                    case 0:
                        String ref2 = (String) obj2;
                        jel.l1 targetMarket = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket, "targetMarket");
                        dcl.r rVar = oVar2.d;
                        Object obj4 = tcl.j.f269888a;
                        Intrinsics.checkNotNullParameter(targetMarket, "<this>");
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        rVar.b(new hcl.q0(ref2, le.u1.g(targetMarket, tcl.j.f269888a)));
                        return Unit.f186387a;
                    case 1:
                        String ref3 = (String) obj2;
                        nel.w summary = (nel.w) obj3;
                        Intrinsics.checkNotNullParameter(ref3, "ref");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        oVar2.f288017l.f(o.f288010t + ref3, summary);
                        return Unit.f186387a;
                    case 2:
                        String ref4 = (String) obj2;
                        jel.c instrumentDetails = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter(ref4, "ref");
                        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
                        oVar2.f288017l.f(ref4, instrumentDetails);
                        return Unit.f186387a;
                    case 3:
                        jel.c details = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(details, "details");
                        if (details instanceof jel.q) {
                            dcl.g gVar = oVar2.e;
                            jel.q qVar = (jel.q) details;
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            String str3 = qVar.f173541b;
                            String str4 = qVar.f173540a;
                            jel.s sVar2 = qVar.e;
                            if (sVar2 != null) {
                                dj0.d dVar2 = sVar2.f173561a;
                                jo3.b bVarA = dVar2 != null ? hx7.a.A(dVar2) : null;
                                dj0.d dVar3 = sVar2.f173562b;
                                oVar = new hcl.o(bVarA, dVar3 != null ? hx7.a.A(dVar3) : null, sVar2.f173563c, sVar2.d, sVar2.e, sVar2.f);
                            } else {
                                oVar = null;
                            }
                            jel.r rVar2 = qVar.f;
                            if (rVar2 != null) {
                                List list = rVar2.f173551a;
                                if (list != null) {
                                    arrayList12 = new ArrayList();
                                    Iterator it9 = list.iterator();
                                    while (it9.hasNext()) {
                                        hcl.a aVarV = zh9.u0.V((jel.p) it9.next());
                                        hcl.l lVar = aVarV instanceof hcl.l ? (hcl.l) aVarV : null;
                                        if (lVar != null) {
                                            arrayList12.add(lVar);
                                        }
                                    }
                                } else {
                                    arrayList12 = null;
                                }
                                List list2 = rVar2.f173552b;
                                if (list2 != null) {
                                    arrayList13 = new ArrayList();
                                    Iterator it10 = list2.iterator();
                                    while (it10.hasNext()) {
                                        hcl.a aVarV2 = zh9.u0.V((b3) it10.next());
                                        hcl.b3 b3Var = aVarV2 instanceof hcl.b3 ? (hcl.b3) aVarV2 : null;
                                        if (b3Var != null) {
                                            arrayList13.add(b3Var);
                                        }
                                    }
                                } else {
                                    arrayList13 = null;
                                }
                                List list3 = rVar2.f173553c;
                                if (list3 != null) {
                                    arrayList14 = new ArrayList();
                                    Iterator it11 = list3.iterator();
                                    while (it11.hasNext()) {
                                        hcl.a aVarV3 = zh9.u0.V((jel.g1) it11.next());
                                        hcl.h0 h0Var = aVarV3 instanceof hcl.h0 ? (hcl.h0) aVarV3 : null;
                                        if (h0Var != null) {
                                            arrayList14.add(h0Var);
                                        }
                                    }
                                } else {
                                    arrayList14 = null;
                                }
                                nVar = new hcl.n(arrayList12, arrayList13, arrayList14);
                            } else {
                                nVar = null;
                            }
                            String str5 = qVar.f173542c;
                            String str6 = qVar.d;
                            String str7 = qVar.f173543g;
                            String str8 = qVar.f173544h;
                            List list4 = qVar.i;
                            if (list4 != null) {
                                List<jel.k1> list5 = list4;
                                ArrayList arrayList15 = new ArrayList(zhm.w.t(list5, 10));
                                for (jel.k1 k1Var : list5) {
                                    Intrinsics.checkNotNullParameter(k1Var, "<this>");
                                    arrayList15.add(new hcl.p0(k1Var.f173490a, k1Var.f173491b));
                                }
                                arrayList11 = arrayList15;
                            } else {
                                arrayList11 = null;
                            }
                            gVar.b(new hcl.m(str3, str4, str5, str6, oVar, nVar, str7, str8, arrayList11));
                        } else if (details instanceof jel.h1) {
                            dcl.i0 i0Var = oVar2.f288012b;
                            jel.h1 h1Var = (jel.h1) details;
                            Object obj5 = tcl.g.f269882a;
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            String str9 = h1Var.f173461a;
                            String str10 = h1Var.f173462b;
                            jel.j1 j1Var = h1Var.e;
                            if (j1Var != null) {
                                Intrinsics.checkNotNullParameter(j1Var, "<this>");
                                dj0.d dVar4 = j1Var.f173485a;
                                jo3.b bVarA2 = dVar4 != null ? hx7.a.A(dVar4) : null;
                                Double d = j1Var.f173486b;
                                Double d5 = j1Var.f173487c;
                                dj0.d dVar5 = j1Var.d;
                                jo3.b bVarA3 = dVar5 != null ? hx7.a.A(dVar5) : null;
                                dj0.d dVar6 = j1Var.e;
                                jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                                dj0.d dVar7 = j1Var.f;
                                o0Var = new hcl.o0(bVarA2, d, d5, bVarA3, bVarA4, dVar7 != null ? hx7.a.A(dVar7) : null, j1Var.f173488g, j1Var.f173489h, j1Var.i);
                            } else {
                                o0Var = null;
                            }
                            String str11 = h1Var.f173463c;
                            String str12 = h1Var.d;
                            String strH = le.u1.h(h1Var.f, tcl.g.f269882a);
                            if (strH == null) {
                                strH = "";
                            }
                            String str13 = strH;
                            String strB = tbl.a.b(h1Var.f173465h);
                            jel.b bVar3 = h1Var.f173464g;
                            if (bVar3 != null) {
                                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                                jel.z2 z2Var2 = bVar3.f173409a;
                                if (z2Var2 != null) {
                                    Intrinsics.checkNotNullParameter(z2Var2, "<this>");
                                    z2Var = new z2(le.u1.g(z2Var2.d, tcl.g.f269883b), z2Var2.f173617a, z2Var2.f173618b, z2Var2.f173619c, z2Var2.e);
                                } else {
                                    z2Var = null;
                                }
                                x2 x2Var = bVar3.f173410b;
                                if (x2Var != null) {
                                    Intrinsics.checkNotNullParameter(x2Var, "<this>");
                                    w2Var = new w2(hx7.a.A(x2Var.f173604a), hx7.a.A(x2Var.f173605b), hx7.a.A(x2Var.f173606c), x2Var.d, x2Var.e);
                                } else {
                                    w2Var = null;
                                }
                                bVar2 = new hcl.b(z2Var, w2Var);
                            } else {
                                bVar2 = null;
                            }
                            List list6 = h1Var.i;
                            if (list6 != null) {
                                List<jel.k1> list7 = list6;
                                ArrayList arrayList16 = new ArrayList(zhm.w.t(list7, 10));
                                for (jel.k1 k1Var2 : list7) {
                                    Intrinsics.checkNotNullParameter(k1Var2, "<this>");
                                    arrayList16.add(new hcl.p0(k1Var2.f173490a, k1Var2.f173491b));
                                }
                                arrayList10 = arrayList16;
                            } else {
                                arrayList10 = null;
                            }
                            i0Var.b(new hcl.i0(str10, str9, str11, str12, o0Var, str13, strB, bVar2, arrayList10));
                        } else if (details instanceof jel.m) {
                            dcl.a aVar2 = oVar2.f;
                            jel.m mVar = (jel.m) details;
                            Object obj6 = tcl.b.f269876a;
                            Intrinsics.checkNotNullParameter(mVar, "<this>");
                            String str14 = mVar.f173499b;
                            String str15 = mVar.f173498a;
                            String str16 = mVar.f173500c;
                            jel.h hVar2 = mVar.d;
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            LocalDate localDate = hVar2.f173452a;
                            dj0.d dVar8 = hVar2.f173453b;
                            jo3.b bVarA5 = dVar8 != null ? hx7.a.A(dVar8) : null;
                            LocalDate localDate2 = hVar2.f173454c;
                            dj0.d dVar9 = hVar2.d;
                            jo3.b bVarA6 = dVar9 != null ? hx7.a.A(dVar9) : null;
                            dj0.d dVar10 = hVar2.e;
                            hcl.e eVar = new hcl.e(localDate, bVarA5, localDate2, bVarA6, dVar10 != null ? hx7.a.A(dVar10) : null);
                            jel.i iVar = mVar.e;
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            hcl.f fVar = new hcl.f(iVar.f173469a, iVar.f173470b, iVar.f173471c);
                            jel.e eVar2 = mVar.f;
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            BigDecimal bigDecimal3 = eVar2.f173436a;
                            jel.g gVar2 = eVar2.f173437b;
                            String strH2 = gVar2 != null ? le.u1.h(gVar2, tcl.b.f269876a) : null;
                            LocalDate localDate3 = eVar2.f173438c;
                            jel.f fVar2 = eVar2.d;
                            hcl.d dVar11 = new hcl.d(bigDecimal3, strH2, localDate3, fVar2 != null ? le.u1.h(fVar2, tcl.b.f269877b) : null);
                            jel.j jVar = mVar.f173501g;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            ej0.b bVar4 = jVar.f173479a;
                            ko3.b bVarM = bVar4 != null ? cp5.c.M(bVar4) : null;
                            ej0.b bVar5 = jVar.f173480b;
                            ko3.b bVarM2 = bVar5 != null ? cp5.c.M(bVar5) : null;
                            ej0.b bVar6 = jVar.f173481c;
                            hcl.g gVar3 = new hcl.g(bVarM, bVarM2, bVar6 != null ? cp5.c.M(bVar6) : null, jVar.d, jVar.e);
                            jel.l lVar2 = mVar.f173502h;
                            if (lVar2 != null) {
                                Intrinsics.checkNotNullParameter(lVar2, "<this>");
                                int i222 = lVar2.f173493a;
                                yel.b bVar7 = lVar2.f173494b;
                                hVar = new hcl.h(i222, bVar7 != null ? xcl.a.c(bVar7) : null, lVar2.f173495c);
                            } else {
                                hVar = null;
                            }
                            jel.d dVar12 = mVar.i;
                            if (dVar12 != null) {
                                Intrinsics.checkNotNullParameter(dVar12, "<this>");
                                boolean z = dVar12.f173427a;
                                LocalDate localDate4 = dVar12.f173428b;
                                dj0.d dVar13 = dVar12.f173429c;
                                cVar2 = new hcl.c(z, localDate4, dVar13 != null ? hx7.a.A(dVar13) : null, dVar12.d);
                            } else {
                                cVar2 = null;
                            }
                            aVar2.b(new hcl.i(str14, str15, str16, eVar, fVar, dVar11, gVar3, hVar, cVar2));
                        } else if (details instanceof jel.n) {
                            dcl.e eVar3 = oVar2.f288014g;
                            jel.n nVar2 = (jel.n) details;
                            Intrinsics.checkNotNullParameter(nVar2, "<this>");
                            eVar3.b(new hcl.k(nVar2.f173513b, nVar2.f173512a, nVar2.f173514c, nVar2.d, nVar2.e));
                        } else if (details instanceof jel.b0) {
                            dcl.k kVar = oVar2.f288015h;
                            jel.b0 b0Var = (jel.b0) details;
                            Intrinsics.checkNotNullParameter(b0Var, "<this>");
                            String str17 = b0Var.f173411a;
                            String str18 = b0Var.f173412b;
                            String str19 = b0Var.f173413c;
                            jel.h0 h0Var2 = b0Var.d;
                            if (h0Var2 != null) {
                                Intrinsics.checkNotNullParameter(h0Var2, "<this>");
                                jel.k0 k0Var = h0Var2.f173455a;
                                String strName = k0Var != null ? k0Var.name() : null;
                                String str20 = h0Var2.f173456b;
                                String str21 = h0Var2.f173457c;
                                LocalDate localDate5 = h0Var2.d;
                                List list8 = h0Var2.e;
                                if (list8 != null) {
                                    List<jel.g0> list9 = list8;
                                    ArrayList arrayList17 = new ArrayList(zhm.w.t(list9, 10));
                                    for (jel.g0 g0Var : list9) {
                                        Intrinsics.checkNotNullParameter(g0Var, "<this>");
                                        arrayList17.add(new w.a(g0Var.f173445a, g0Var.f173446b, g0Var.f173447c));
                                    }
                                    arrayList9 = arrayList17;
                                } else {
                                    arrayList9 = null;
                                }
                                dj0.d dVar14 = h0Var2.f;
                                jo3.b bVarA7 = dVar14 != null ? hx7.a.A(dVar14) : null;
                                jel.e1 e1Var = h0Var2.f173458g;
                                String strName2 = e1Var != null ? e1Var.name() : null;
                                jel.a0 a0Var = h0Var2.f173459h;
                                String strName3 = a0Var != null ? a0Var.name() : null;
                                jel.y yVar2 = h0Var2.i;
                                wVar = new hcl.w(strName, str20, str21, localDate5, arrayList9, bVarA7, strName2, strName3, yVar2 != null ? yVar2.name() : null, h0Var2.f173460j);
                            } else {
                                wVar = null;
                            }
                            jel.m0 m0Var = b0Var.e;
                            if (m0Var != null) {
                                Intrinsics.checkNotNullParameter(m0Var, "<this>");
                                String str22 = m0Var.f173503a;
                                String str23 = m0Var.f173504b;
                                dj0.d dVar15 = m0Var.f173505c;
                                jo3.b bVarA8 = dVar15 != null ? hx7.a.A(dVar15) : null;
                                LocalDate localDate6 = m0Var.d;
                                List list10 = m0Var.e;
                                if (list10 != null) {
                                    List list11 = list10;
                                    ArrayList arrayList18 = new ArrayList(zhm.w.t(list11, 10));
                                    Iterator it12 = list11.iterator();
                                    while (it12.hasNext()) {
                                        jel.z zVar2 = (jel.z) it12.next();
                                        Intrinsics.checkNotNullParameter(zVar2, "<this>");
                                        arrayList18.add(new y.a(zVar2.f173612a, zVar2.f173613b, zVar2.f173614c, zVar2.d));
                                        it12 = it12;
                                        localDate6 = localDate6;
                                    }
                                    arrayList8 = arrayList18;
                                } else {
                                    arrayList8 = null;
                                }
                                yVar = new hcl.y(str22, str23, bVarA8, localDate6, arrayList8);
                            } else {
                                yVar = null;
                            }
                            jel.n0 n0Var = b0Var.f;
                            if (n0Var != null) {
                                Intrinsics.checkNotNullParameter(n0Var, "<this>");
                                BigDecimal bigDecimal4 = n0Var.f173515a;
                                BigDecimal bigDecimal5 = n0Var.f173516b;
                                BigDecimal bigDecimal6 = n0Var.f173517c;
                                BigDecimal bigDecimal7 = n0Var.d;
                                BigDecimal bigDecimal8 = n0Var.e;
                                Integer num = n0Var.f;
                                List list12 = n0Var.f173518g;
                                if (list12 != null) {
                                    List list13 = list12;
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    ArrayList arrayList19 = new ArrayList(zhm.w.t(list13, 10));
                                    Iterator it13 = list13.iterator();
                                    while (it13.hasNext()) {
                                        jel.p0 p0Var = (jel.p0) it13.next();
                                        Iterator it14 = it13;
                                        jel.q0 q0Var = p0Var.f173532a;
                                        arrayList19.add(new z.a(q0Var != null ? q0Var.name() : null, p0Var.f173533b));
                                        it13 = it14;
                                    }
                                    arrayList7 = arrayList19;
                                } else {
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    arrayList7 = null;
                                }
                                zVar = new hcl.z(bigDecimal4, bigDecimal5, bigDecimal, bigDecimal2, bigDecimal8, num, arrayList7);
                            } else {
                                zVar = null;
                            }
                            jel.c0 c0Var = b0Var.f173414g;
                            if (c0Var != null) {
                                Intrinsics.checkNotNullParameter(c0Var, "<this>");
                                uVar = new hcl.u(c0Var.f173422a, c0Var.f173423b, c0Var.f173424c, c0Var.d, c0Var.e, c0Var.f);
                            } else {
                                uVar = null;
                            }
                            jel.j0 j0Var = b0Var.f173415h;
                            if (j0Var != null) {
                                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                                jel.o0 o0Var2 = j0Var.f173482a;
                                if (o0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(o0Var2, "<this>");
                                    aVar = new x.a(o0Var2.f173525a, o0Var2.f173526b);
                                } else {
                                    aVar = null;
                                }
                                jel.d1 d1Var = j0Var.f173483b;
                                if (d1Var != null) {
                                    Intrinsics.checkNotNullParameter(d1Var, "<this>");
                                    jel.f0 f0Var = d1Var.f173433a;
                                    cVar = new x.c(f0Var != null ? f0Var.name() : null);
                                } else {
                                    cVar = null;
                                }
                                jel.r0 r0Var = j0Var.f173484c;
                                if (r0Var != null) {
                                    Intrinsics.checkNotNullParameter(r0Var, "<this>");
                                    jel.f0 f0Var2 = r0Var.f173554a;
                                    str2 = str18;
                                    bVar = new x.b(f0Var2 != null ? f0Var2.name() : null, r0Var.f173555b, r0Var.f173556c);
                                } else {
                                    str2 = str18;
                                    bVar = null;
                                }
                                xVar = new hcl.x(aVar, cVar, bVar);
                            } else {
                                str2 = str18;
                                xVar = null;
                            }
                            jel.d0 d0Var = b0Var.i;
                            if (d0Var != null) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                List list14 = d0Var.f173430a;
                                if (list14 != null) {
                                    arrayList3 = new ArrayList();
                                    Iterator it15 = list14.iterator();
                                    while (it15.hasNext()) {
                                        hcl.q qVarC = tcl.d.c((jel.x0) it15.next());
                                        hcl.d0 d0Var2 = qVarC instanceof hcl.d0 ? (hcl.d0) qVarC : null;
                                        if (d0Var2 != null) {
                                            arrayList3.add(d0Var2);
                                        }
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                List list15 = d0Var.f173431b;
                                if (list15 != null) {
                                    arrayList4 = new ArrayList();
                                    Iterator it16 = list15.iterator();
                                    while (it16.hasNext()) {
                                        hcl.q qVarC2 = tcl.d.c((jel.v0) it16.next());
                                        hcl.b0 b0Var2 = qVarC2 instanceof hcl.b0 ? (hcl.b0) qVarC2 : null;
                                        if (b0Var2 != null) {
                                            arrayList4.add(b0Var2);
                                        }
                                    }
                                } else {
                                    arrayList4 = null;
                                }
                                List list16 = d0Var.f173432c;
                                if (list16 != null) {
                                    arrayList5 = new ArrayList();
                                    Iterator it17 = list16.iterator();
                                    while (it17.hasNext()) {
                                        hcl.q qVarC3 = tcl.d.c((jel.t0) it17.next());
                                        Iterator it18 = it17;
                                        hcl.a0 a0Var2 = qVarC3 instanceof hcl.a0 ? (hcl.a0) qVarC3 : null;
                                        if (a0Var2 != null) {
                                            arrayList5.add(a0Var2);
                                        }
                                        it17 = it18;
                                    }
                                } else {
                                    arrayList5 = null;
                                }
                                List list17 = d0Var.d;
                                if (list17 != null) {
                                    arrayList6 = new ArrayList();
                                    Iterator it19 = list17.iterator();
                                    while (it19.hasNext()) {
                                        hcl.q qVarC4 = tcl.d.c((jel.u) it19.next());
                                        Iterator it20 = it19;
                                        hcl.r rVar3 = qVarC4 instanceof hcl.r ? (hcl.r) qVarC4 : null;
                                        if (rVar3 != null) {
                                            arrayList6.add(rVar3);
                                        }
                                        it19 = it20;
                                    }
                                } else {
                                    arrayList6 = null;
                                }
                                vVar = new hcl.v(arrayList3, arrayList4, arrayList5, arrayList6);
                            } else {
                                vVar = null;
                            }
                            jel.x xVar2 = b0Var.f173416j;
                            if (xVar2 != null) {
                                Intrinsics.checkNotNullParameter(xVar2, "<this>");
                                List list18 = xVar2.f173597a;
                                if (list18 != null) {
                                    List<jel.i0> list19 = list18;
                                    arrayList = new ArrayList(zhm.w.t(list19, 10));
                                    for (jel.i0 i0Var2 : list19) {
                                        Intrinsics.checkNotNullParameter(i0Var2, "<this>");
                                        String str24 = i0Var2.f173472a;
                                        BigDecimal bigDecimal9 = i0Var2.f173473b;
                                        hcl.v vVar3 = vVar;
                                        String str25 = i0Var2.f173474c;
                                        String str26 = i0Var2.d;
                                        xi0.b bVar8 = i0Var2.e;
                                        arrayList.add(new s.a(str24, str25, str26, bVar8 != null ? bVar8.f306286a : null, bigDecimal9));
                                        vVar = vVar3;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                vVar2 = vVar;
                                List list20 = xVar2.f173598b;
                                if (list20 != null) {
                                    List list21 = list20;
                                    arrayList2 = new ArrayList(zhm.w.t(list21, 10));
                                    for (Iterator it21 = list21.iterator(); it21.hasNext(); it21 = it21) {
                                        jel.f1 f1Var = (jel.f1) it21.next();
                                        Intrinsics.checkNotNullParameter(f1Var, "<this>");
                                        arrayList2.add(new s.b(f1Var.f173439a, f1Var.f173440b, f1Var.d, f1Var.e, f1Var.f, f1Var.f173442g, f1Var.f173441c));
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                sVar = new hcl.s(arrayList, arrayList2);
                            } else {
                                vVar2 = vVar;
                                sVar = null;
                            }
                            kVar.b(new hcl.t(str2, str17, str19, wVar, yVar, zVar, uVar, xVar, vVar2, sVar));
                        } else if (details instanceof jel.w2) {
                            dcl.r0 r0Var2 = oVar2.f288016j;
                            jel.w2 w2Var2 = (jel.w2) details;
                            Intrinsics.checkNotNullParameter(w2Var2, "<this>");
                            String str27 = w2Var2.f173586b;
                            String str28 = w2Var2.f173585a;
                            String str29 = w2Var2.f173587c;
                            String str30 = w2Var2.d;
                            jel.y1 y1Var2 = w2Var2.e;
                            h2 h2Var = new h2(y1Var2.f173609a, y1Var2.f173610b, y1Var2.f173611c, y1Var2.d, y1Var2.e, y1Var2.f);
                            jel.r1 r1Var = w2Var2.f;
                            if (r1Var != null) {
                                BigDecimal bigDecimal10 = r1Var.f173557a;
                                jel.u1 u1Var = r1Var.f173558b;
                                String strName4 = u1Var != null ? u1Var.name() : null;
                                jel.s1 s1Var = r1Var.f173559c;
                                String strName5 = s1Var != null ? s1Var.name() : null;
                                BigDecimal bigDecimal11 = r1Var.d;
                                LocalDate localDate7 = r1Var.e;
                                e2 e2Var = r1Var.f;
                                b2Var = new b2(bigDecimal10, strName4, strName5, bigDecimal11, localDate7, e2Var != null ? e2Var.name() : null);
                            } else {
                                b2Var = null;
                            }
                            jel.p1 p1Var = w2Var2.f173588g;
                            if (p1Var != null) {
                                BigDecimal bigDecimal12 = p1Var.f173534a;
                                BigDecimal bigDecimal13 = p1Var.f173535b;
                                jel.u1 u1Var2 = p1Var.f173536c;
                                String strName6 = u1Var2 != null ? u1Var2.name() : null;
                                BigDecimal bigDecimal14 = p1Var.d;
                                LocalDate localDate8 = p1Var.e;
                                e2 e2Var2 = p1Var.f;
                                z1Var = new z1(bigDecimal12, bigDecimal13, strName6, bigDecimal14, localDate8, e2Var2 != null ? e2Var2.name() : null);
                            } else {
                                z1Var = null;
                            }
                            jel.q1 q1Var = w2Var2.f173589h;
                            if (q1Var != null) {
                                BigDecimal bigDecimal15 = q1Var.f173545a;
                                BigDecimal bigDecimal16 = q1Var.f173546b;
                                BigDecimal bigDecimal17 = q1Var.f173547c;
                                e2 e2Var3 = q1Var.d;
                                a2Var = new a2(bigDecimal15, bigDecimal16, bigDecimal17, e2Var3 != null ? e2Var3.name() : null);
                            } else {
                                a2Var = null;
                            }
                            jel.t1 t1Var = w2Var2.i;
                            if (t1Var != null) {
                                BigDecimal bigDecimal18 = t1Var.f173566a;
                                BigDecimal bigDecimal19 = t1Var.f173567b;
                                BigDecimal bigDecimal20 = t1Var.f173568c;
                                BigDecimal bigDecimal21 = t1Var.d;
                                e2 e2Var4 = t1Var.e;
                                c2Var = new c2(e2Var4 != null ? e2Var4.name() : null, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21);
                            } else {
                                c2Var = null;
                            }
                            ArrayList<x1> arrayList20 = w2Var2.f173590j;
                            ArrayList arrayList21 = new ArrayList(zhm.w.t(arrayList20, 10));
                            for (x1 x1Var : arrayList20) {
                                arrayList21.add(new g2(x1Var.f173602a, x1Var.f173603b));
                            }
                            ArrayList<v2> arrayList22 = w2Var2.k;
                            ArrayList arrayList23 = new ArrayList(zhm.w.t(arrayList22, 10));
                            for (v2 v2Var : arrayList22) {
                                String str31 = v2Var.f173579a;
                                String str32 = v2Var.f173580b;
                                String str33 = v2Var.f173581c;
                                jel.g2 g2Var = v2Var.d;
                                jo3.b bVarA9 = (g2Var == null || (dVar = g2Var.f173451a) == null) ? null : hx7.a.A(dVar);
                                ej0.b bVar9 = v2Var.e;
                                arrayList23.add(new s2(str31, str32, str33, bVarA9, bVar9 != null ? cp5.c.M(bVar9) : null));
                            }
                            jel.w1 w1Var = w2Var2.f173591l;
                            String str34 = w1Var.f173582a;
                            String str35 = w1Var.f173583b;
                            jel.k2 k2Var2 = w1Var.f173584c;
                            if (k2Var2 != null) {
                                yel.b bVar10 = k2Var2.f173492a;
                                f2Var = new f2(bVar10 != null ? xcl.a.c(bVar10) : null);
                            } else {
                                f2Var = null;
                            }
                            jel.v1 v1Var = w1Var.d;
                            d2 d2Var = new d2(str34, str35, f2Var, v1Var != null ? new hcl.e2(v1Var.f173578b, v1Var.f173577a) : null);
                            List list22 = w2Var2.f173592m;
                            ArrayList arrayList24 = new ArrayList(zhm.w.t(list22, 10));
                            Iterator it22 = list22.iterator();
                            while (it22.hasNext()) {
                                arrayList24.add(((jel.o1) it22.next()).name());
                            }
                            ArrayList arrayList25 = w2Var2.f173593n;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            Iterator it23 = arrayList25.iterator();
                            while (it23.hasNext()) {
                                jel.a2 a2Var2 = (jel.a2) it23.next();
                                String str36 = a2Var2.f173405a;
                                String str37 = a2Var2.f173406b;
                                String str38 = str27;
                                String str39 = a2Var2.f173407c;
                                ArrayList arrayList27 = a2Var2.d;
                                String str40 = str28;
                                String str41 = str29;
                                String str42 = str30;
                                ArrayList arrayList28 = new ArrayList(zhm.w.t(arrayList27, 10));
                                Iterator it24 = arrayList27.iterator();
                                while (it24.hasNext()) {
                                    jel.h2 h2Var2 = (jel.h2) it24.next();
                                    BigDecimal bigDecimal22 = h2Var2.f173466a;
                                    Iterator it25 = it24;
                                    BigDecimal bigDecimal23 = h2Var2.f173467b;
                                    String strName7 = h2Var2.f173468c.name();
                                    String str43 = h2Var2.d;
                                    i2 i2Var = h2Var2.e;
                                    if (i2Var != null) {
                                        str = str43;
                                        it8 = it23;
                                        n2Var = new n2(i2Var.f173477a, i2Var.f173478b);
                                    } else {
                                        it8 = it23;
                                        str = str43;
                                        n2Var = null;
                                    }
                                    arrayList28.add(new m2(bigDecimal22, bigDecimal23, strName7, str, n2Var));
                                    it24 = it25;
                                    it23 = it8;
                                }
                                arrayList26.add(new j2(str36, str37, str39, arrayList28));
                                str27 = str38;
                                str28 = str40;
                                str29 = str41;
                                str30 = str42;
                            }
                            String str44 = str27;
                            String str45 = str28;
                            String str46 = str29;
                            String str47 = str30;
                            jel.d2 d2Var2 = w2Var2.o;
                            if (d2Var2 != null) {
                                ArrayList<jel.b2> arrayList29 = d2Var2.f173434a;
                                ArrayList arrayList30 = new ArrayList(zhm.w.t(arrayList29, 10));
                                for (jel.b2 b2Var2 : arrayList29) {
                                    BigDecimal bigDecimal24 = b2Var2.f173417a;
                                    BigDecimal bigDecimal25 = b2Var2.f173418b;
                                    boolean z3 = b2Var2.f173419c;
                                    jel.c2 c2Var2 = b2Var2.d;
                                    arrayList30.add(new k2.a(bigDecimal24, bigDecimal25, z3, c2Var2 != null ? c2Var2.name() : null));
                                }
                                k2Var = new k2(arrayList30, d2Var2.f173435b);
                            } else {
                                k2Var = null;
                            }
                            ArrayList<jel.f2> arrayList31 = w2Var2.f173594p;
                            ArrayList arrayList32 = new ArrayList(zhm.w.t(arrayList31, 10));
                            for (jel.f2 f2Var2 : arrayList31) {
                                arrayList32.add(new l2(tcl.n.c(f2Var2.f173443a), tcl.n.c(f2Var2.f173444b)));
                            }
                            jel.z1 z1Var2 = w2Var2.f173595q;
                            hcl.i2 i2Var2 = z1Var2 != null ? new hcl.i2(z1Var2.f173616b, z1Var2.f173615a) : null;
                            jel.l2 l2Var = w2Var2.f173596r;
                            r0Var2.b(new t2(str44, str45, str46, str47, h2Var, b2Var, z1Var, a2Var, c2Var, arrayList21, arrayList23, d2Var, arrayList24, arrayList26, k2Var, arrayList32, i2Var2, l2Var != null ? new o2(l2Var.f173497b, l2Var.f173496a) : null));
                        } else {
                            if (!(details instanceof jel.m1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dcl.p0 p0Var2 = oVar2.i;
                            jel.m1 m1Var = (jel.m1) details;
                            Intrinsics.checkNotNullParameter(m1Var, "<this>");
                            String str48 = m1Var.f173506a;
                            String str49 = m1Var.f173507b;
                            String str50 = m1Var.f173508c;
                            jel.n1 n1Var = m1Var.d;
                            if (n1Var != null) {
                                Intrinsics.checkNotNullParameter(n1Var, "<this>");
                                y1Var = new y1(n1Var.f173519a, n1Var.f173520b, n1Var.f173521c, n1Var.d, n1Var.e, n1Var.f);
                            } else {
                                y1Var = null;
                            }
                            p0Var2.b(new hcl.x1(str49, str48, str50, y1Var));
                        }
                        return Unit.f186387a;
                    case 4:
                        l params = (l) obj2;
                        jel.i1 recommendations = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
                        oVar2.f288017l.f(params.a(), recommendations);
                        return Unit.f186387a;
                    case 5:
                        jel.i1 recommendations2 = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter((l) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recommendations2, "recommendations");
                        dcl.w wVar2 = oVar2.f288013c;
                        Object obj7 = tcl.g.f269882a;
                        Intrinsics.checkNotNullParameter(recommendations2, "<this>");
                        String str51 = recommendations2.f173475a;
                        ArrayList<jel.z2> arrayList33 = recommendations2.f173476b;
                        ArrayList arrayList34 = new ArrayList(zhm.w.t(arrayList33, 10));
                        for (jel.z2 z2Var3 : arrayList33) {
                            Intrinsics.checkNotNullParameter(z2Var3, "<this>");
                            arrayList34.add(new z2(le.u1.g(z2Var3.d, tcl.g.f269883b), z2Var3.f173617a, z2Var3.f173618b, z2Var3.f173619c, z2Var3.e));
                        }
                        wVar2.b(new hcl.m0(str51, arrayList34));
                        return Unit.f186387a;
                    default:
                        String ref5 = (String) obj2;
                        jel.l1 targetMarket2 = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref5, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket2, "targetMarket");
                        oVar2.f288017l.f(o.f288009s + ref5, targetMarket2);
                        return Unit.f186387a;
                }
            }
        }, new Function1(this) { // from class: vdl.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287980b;

            {
                this.f287980b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:435:0x09b7  */
            /* JADX WARN: Removed duplicated region for block: B:443:0x09de  */
            /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r42) {
                /*
                    Method dump skipped, instruction units count: 3680
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vdl.i.invoke(java.lang.Object):java.lang.Object");
            }
        }, new Function2(this) { // from class: vdl.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287983b;

            {
                this.f287983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                y1 y1Var;
                b2 b2Var;
                z1 z1Var;
                a2 a2Var;
                c2 c2Var;
                f2 f2Var;
                k2 k2Var;
                Iterator it8;
                String str;
                n2 n2Var;
                dj0.d dVar;
                hcl.w wVar;
                hcl.y yVar;
                hcl.z zVar;
                hcl.u uVar;
                String str2;
                hcl.x xVar;
                hcl.v vVar;
                hcl.v vVar2;
                hcl.s sVar;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                x.a aVar;
                x.c cVar;
                x.b bVar;
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                ArrayList arrayList7;
                ArrayList arrayList8;
                ArrayList arrayList9;
                hcl.h hVar;
                hcl.c cVar2;
                hcl.o0 o0Var;
                hcl.b bVar2;
                ArrayList arrayList10;
                z2 z2Var;
                w2 w2Var;
                hcl.o oVar;
                hcl.n nVar;
                ArrayList arrayList11;
                ArrayList arrayList12;
                ArrayList arrayList13;
                ArrayList arrayList14;
                int i212 = i43;
                o oVar2 = this.f287983b;
                switch (i212) {
                    case 0:
                        String ref2 = (String) obj2;
                        jel.l1 targetMarket = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket, "targetMarket");
                        dcl.r rVar = oVar2.d;
                        Object obj4 = tcl.j.f269888a;
                        Intrinsics.checkNotNullParameter(targetMarket, "<this>");
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        rVar.b(new hcl.q0(ref2, le.u1.g(targetMarket, tcl.j.f269888a)));
                        return Unit.f186387a;
                    case 1:
                        String ref3 = (String) obj2;
                        nel.w summary = (nel.w) obj3;
                        Intrinsics.checkNotNullParameter(ref3, "ref");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        oVar2.f288017l.f(o.f288010t + ref3, summary);
                        return Unit.f186387a;
                    case 2:
                        String ref4 = (String) obj2;
                        jel.c instrumentDetails = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter(ref4, "ref");
                        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
                        oVar2.f288017l.f(ref4, instrumentDetails);
                        return Unit.f186387a;
                    case 3:
                        jel.c details = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(details, "details");
                        if (details instanceof jel.q) {
                            dcl.g gVar = oVar2.e;
                            jel.q qVar = (jel.q) details;
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            String str3 = qVar.f173541b;
                            String str4 = qVar.f173540a;
                            jel.s sVar2 = qVar.e;
                            if (sVar2 != null) {
                                dj0.d dVar2 = sVar2.f173561a;
                                jo3.b bVarA = dVar2 != null ? hx7.a.A(dVar2) : null;
                                dj0.d dVar3 = sVar2.f173562b;
                                oVar = new hcl.o(bVarA, dVar3 != null ? hx7.a.A(dVar3) : null, sVar2.f173563c, sVar2.d, sVar2.e, sVar2.f);
                            } else {
                                oVar = null;
                            }
                            jel.r rVar2 = qVar.f;
                            if (rVar2 != null) {
                                List list = rVar2.f173551a;
                                if (list != null) {
                                    arrayList12 = new ArrayList();
                                    Iterator it9 = list.iterator();
                                    while (it9.hasNext()) {
                                        hcl.a aVarV = zh9.u0.V((jel.p) it9.next());
                                        hcl.l lVar = aVarV instanceof hcl.l ? (hcl.l) aVarV : null;
                                        if (lVar != null) {
                                            arrayList12.add(lVar);
                                        }
                                    }
                                } else {
                                    arrayList12 = null;
                                }
                                List list2 = rVar2.f173552b;
                                if (list2 != null) {
                                    arrayList13 = new ArrayList();
                                    Iterator it10 = list2.iterator();
                                    while (it10.hasNext()) {
                                        hcl.a aVarV2 = zh9.u0.V((b3) it10.next());
                                        hcl.b3 b3Var = aVarV2 instanceof hcl.b3 ? (hcl.b3) aVarV2 : null;
                                        if (b3Var != null) {
                                            arrayList13.add(b3Var);
                                        }
                                    }
                                } else {
                                    arrayList13 = null;
                                }
                                List list3 = rVar2.f173553c;
                                if (list3 != null) {
                                    arrayList14 = new ArrayList();
                                    Iterator it11 = list3.iterator();
                                    while (it11.hasNext()) {
                                        hcl.a aVarV3 = zh9.u0.V((jel.g1) it11.next());
                                        hcl.h0 h0Var = aVarV3 instanceof hcl.h0 ? (hcl.h0) aVarV3 : null;
                                        if (h0Var != null) {
                                            arrayList14.add(h0Var);
                                        }
                                    }
                                } else {
                                    arrayList14 = null;
                                }
                                nVar = new hcl.n(arrayList12, arrayList13, arrayList14);
                            } else {
                                nVar = null;
                            }
                            String str5 = qVar.f173542c;
                            String str6 = qVar.d;
                            String str7 = qVar.f173543g;
                            String str8 = qVar.f173544h;
                            List list4 = qVar.i;
                            if (list4 != null) {
                                List<jel.k1> list5 = list4;
                                ArrayList arrayList15 = new ArrayList(zhm.w.t(list5, 10));
                                for (jel.k1 k1Var : list5) {
                                    Intrinsics.checkNotNullParameter(k1Var, "<this>");
                                    arrayList15.add(new hcl.p0(k1Var.f173490a, k1Var.f173491b));
                                }
                                arrayList11 = arrayList15;
                            } else {
                                arrayList11 = null;
                            }
                            gVar.b(new hcl.m(str3, str4, str5, str6, oVar, nVar, str7, str8, arrayList11));
                        } else if (details instanceof jel.h1) {
                            dcl.i0 i0Var = oVar2.f288012b;
                            jel.h1 h1Var = (jel.h1) details;
                            Object obj5 = tcl.g.f269882a;
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            String str9 = h1Var.f173461a;
                            String str10 = h1Var.f173462b;
                            jel.j1 j1Var = h1Var.e;
                            if (j1Var != null) {
                                Intrinsics.checkNotNullParameter(j1Var, "<this>");
                                dj0.d dVar4 = j1Var.f173485a;
                                jo3.b bVarA2 = dVar4 != null ? hx7.a.A(dVar4) : null;
                                Double d = j1Var.f173486b;
                                Double d5 = j1Var.f173487c;
                                dj0.d dVar5 = j1Var.d;
                                jo3.b bVarA3 = dVar5 != null ? hx7.a.A(dVar5) : null;
                                dj0.d dVar6 = j1Var.e;
                                jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                                dj0.d dVar7 = j1Var.f;
                                o0Var = new hcl.o0(bVarA2, d, d5, bVarA3, bVarA4, dVar7 != null ? hx7.a.A(dVar7) : null, j1Var.f173488g, j1Var.f173489h, j1Var.i);
                            } else {
                                o0Var = null;
                            }
                            String str11 = h1Var.f173463c;
                            String str12 = h1Var.d;
                            String strH = le.u1.h(h1Var.f, tcl.g.f269882a);
                            if (strH == null) {
                                strH = "";
                            }
                            String str13 = strH;
                            String strB = tbl.a.b(h1Var.f173465h);
                            jel.b bVar3 = h1Var.f173464g;
                            if (bVar3 != null) {
                                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                                jel.z2 z2Var2 = bVar3.f173409a;
                                if (z2Var2 != null) {
                                    Intrinsics.checkNotNullParameter(z2Var2, "<this>");
                                    z2Var = new z2(le.u1.g(z2Var2.d, tcl.g.f269883b), z2Var2.f173617a, z2Var2.f173618b, z2Var2.f173619c, z2Var2.e);
                                } else {
                                    z2Var = null;
                                }
                                x2 x2Var = bVar3.f173410b;
                                if (x2Var != null) {
                                    Intrinsics.checkNotNullParameter(x2Var, "<this>");
                                    w2Var = new w2(hx7.a.A(x2Var.f173604a), hx7.a.A(x2Var.f173605b), hx7.a.A(x2Var.f173606c), x2Var.d, x2Var.e);
                                } else {
                                    w2Var = null;
                                }
                                bVar2 = new hcl.b(z2Var, w2Var);
                            } else {
                                bVar2 = null;
                            }
                            List list6 = h1Var.i;
                            if (list6 != null) {
                                List<jel.k1> list7 = list6;
                                ArrayList arrayList16 = new ArrayList(zhm.w.t(list7, 10));
                                for (jel.k1 k1Var2 : list7) {
                                    Intrinsics.checkNotNullParameter(k1Var2, "<this>");
                                    arrayList16.add(new hcl.p0(k1Var2.f173490a, k1Var2.f173491b));
                                }
                                arrayList10 = arrayList16;
                            } else {
                                arrayList10 = null;
                            }
                            i0Var.b(new hcl.i0(str10, str9, str11, str12, o0Var, str13, strB, bVar2, arrayList10));
                        } else if (details instanceof jel.m) {
                            dcl.a aVar2 = oVar2.f;
                            jel.m mVar = (jel.m) details;
                            Object obj6 = tcl.b.f269876a;
                            Intrinsics.checkNotNullParameter(mVar, "<this>");
                            String str14 = mVar.f173499b;
                            String str15 = mVar.f173498a;
                            String str16 = mVar.f173500c;
                            jel.h hVar2 = mVar.d;
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            LocalDate localDate = hVar2.f173452a;
                            dj0.d dVar8 = hVar2.f173453b;
                            jo3.b bVarA5 = dVar8 != null ? hx7.a.A(dVar8) : null;
                            LocalDate localDate2 = hVar2.f173454c;
                            dj0.d dVar9 = hVar2.d;
                            jo3.b bVarA6 = dVar9 != null ? hx7.a.A(dVar9) : null;
                            dj0.d dVar10 = hVar2.e;
                            hcl.e eVar = new hcl.e(localDate, bVarA5, localDate2, bVarA6, dVar10 != null ? hx7.a.A(dVar10) : null);
                            jel.i iVar = mVar.e;
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            hcl.f fVar = new hcl.f(iVar.f173469a, iVar.f173470b, iVar.f173471c);
                            jel.e eVar2 = mVar.f;
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            BigDecimal bigDecimal3 = eVar2.f173436a;
                            jel.g gVar2 = eVar2.f173437b;
                            String strH2 = gVar2 != null ? le.u1.h(gVar2, tcl.b.f269876a) : null;
                            LocalDate localDate3 = eVar2.f173438c;
                            jel.f fVar2 = eVar2.d;
                            hcl.d dVar11 = new hcl.d(bigDecimal3, strH2, localDate3, fVar2 != null ? le.u1.h(fVar2, tcl.b.f269877b) : null);
                            jel.j jVar = mVar.f173501g;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            ej0.b bVar4 = jVar.f173479a;
                            ko3.b bVarM = bVar4 != null ? cp5.c.M(bVar4) : null;
                            ej0.b bVar5 = jVar.f173480b;
                            ko3.b bVarM2 = bVar5 != null ? cp5.c.M(bVar5) : null;
                            ej0.b bVar6 = jVar.f173481c;
                            hcl.g gVar3 = new hcl.g(bVarM, bVarM2, bVar6 != null ? cp5.c.M(bVar6) : null, jVar.d, jVar.e);
                            jel.l lVar2 = mVar.f173502h;
                            if (lVar2 != null) {
                                Intrinsics.checkNotNullParameter(lVar2, "<this>");
                                int i222 = lVar2.f173493a;
                                yel.b bVar7 = lVar2.f173494b;
                                hVar = new hcl.h(i222, bVar7 != null ? xcl.a.c(bVar7) : null, lVar2.f173495c);
                            } else {
                                hVar = null;
                            }
                            jel.d dVar12 = mVar.i;
                            if (dVar12 != null) {
                                Intrinsics.checkNotNullParameter(dVar12, "<this>");
                                boolean z = dVar12.f173427a;
                                LocalDate localDate4 = dVar12.f173428b;
                                dj0.d dVar13 = dVar12.f173429c;
                                cVar2 = new hcl.c(z, localDate4, dVar13 != null ? hx7.a.A(dVar13) : null, dVar12.d);
                            } else {
                                cVar2 = null;
                            }
                            aVar2.b(new hcl.i(str14, str15, str16, eVar, fVar, dVar11, gVar3, hVar, cVar2));
                        } else if (details instanceof jel.n) {
                            dcl.e eVar3 = oVar2.f288014g;
                            jel.n nVar2 = (jel.n) details;
                            Intrinsics.checkNotNullParameter(nVar2, "<this>");
                            eVar3.b(new hcl.k(nVar2.f173513b, nVar2.f173512a, nVar2.f173514c, nVar2.d, nVar2.e));
                        } else if (details instanceof jel.b0) {
                            dcl.k kVar = oVar2.f288015h;
                            jel.b0 b0Var = (jel.b0) details;
                            Intrinsics.checkNotNullParameter(b0Var, "<this>");
                            String str17 = b0Var.f173411a;
                            String str18 = b0Var.f173412b;
                            String str19 = b0Var.f173413c;
                            jel.h0 h0Var2 = b0Var.d;
                            if (h0Var2 != null) {
                                Intrinsics.checkNotNullParameter(h0Var2, "<this>");
                                jel.k0 k0Var = h0Var2.f173455a;
                                String strName = k0Var != null ? k0Var.name() : null;
                                String str20 = h0Var2.f173456b;
                                String str21 = h0Var2.f173457c;
                                LocalDate localDate5 = h0Var2.d;
                                List list8 = h0Var2.e;
                                if (list8 != null) {
                                    List<jel.g0> list9 = list8;
                                    ArrayList arrayList17 = new ArrayList(zhm.w.t(list9, 10));
                                    for (jel.g0 g0Var : list9) {
                                        Intrinsics.checkNotNullParameter(g0Var, "<this>");
                                        arrayList17.add(new w.a(g0Var.f173445a, g0Var.f173446b, g0Var.f173447c));
                                    }
                                    arrayList9 = arrayList17;
                                } else {
                                    arrayList9 = null;
                                }
                                dj0.d dVar14 = h0Var2.f;
                                jo3.b bVarA7 = dVar14 != null ? hx7.a.A(dVar14) : null;
                                jel.e1 e1Var = h0Var2.f173458g;
                                String strName2 = e1Var != null ? e1Var.name() : null;
                                jel.a0 a0Var = h0Var2.f173459h;
                                String strName3 = a0Var != null ? a0Var.name() : null;
                                jel.y yVar2 = h0Var2.i;
                                wVar = new hcl.w(strName, str20, str21, localDate5, arrayList9, bVarA7, strName2, strName3, yVar2 != null ? yVar2.name() : null, h0Var2.f173460j);
                            } else {
                                wVar = null;
                            }
                            jel.m0 m0Var = b0Var.e;
                            if (m0Var != null) {
                                Intrinsics.checkNotNullParameter(m0Var, "<this>");
                                String str22 = m0Var.f173503a;
                                String str23 = m0Var.f173504b;
                                dj0.d dVar15 = m0Var.f173505c;
                                jo3.b bVarA8 = dVar15 != null ? hx7.a.A(dVar15) : null;
                                LocalDate localDate6 = m0Var.d;
                                List list10 = m0Var.e;
                                if (list10 != null) {
                                    List list11 = list10;
                                    ArrayList arrayList18 = new ArrayList(zhm.w.t(list11, 10));
                                    Iterator it12 = list11.iterator();
                                    while (it12.hasNext()) {
                                        jel.z zVar2 = (jel.z) it12.next();
                                        Intrinsics.checkNotNullParameter(zVar2, "<this>");
                                        arrayList18.add(new y.a(zVar2.f173612a, zVar2.f173613b, zVar2.f173614c, zVar2.d));
                                        it12 = it12;
                                        localDate6 = localDate6;
                                    }
                                    arrayList8 = arrayList18;
                                } else {
                                    arrayList8 = null;
                                }
                                yVar = new hcl.y(str22, str23, bVarA8, localDate6, arrayList8);
                            } else {
                                yVar = null;
                            }
                            jel.n0 n0Var = b0Var.f;
                            if (n0Var != null) {
                                Intrinsics.checkNotNullParameter(n0Var, "<this>");
                                BigDecimal bigDecimal4 = n0Var.f173515a;
                                BigDecimal bigDecimal5 = n0Var.f173516b;
                                BigDecimal bigDecimal6 = n0Var.f173517c;
                                BigDecimal bigDecimal7 = n0Var.d;
                                BigDecimal bigDecimal8 = n0Var.e;
                                Integer num = n0Var.f;
                                List list12 = n0Var.f173518g;
                                if (list12 != null) {
                                    List list13 = list12;
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    ArrayList arrayList19 = new ArrayList(zhm.w.t(list13, 10));
                                    Iterator it13 = list13.iterator();
                                    while (it13.hasNext()) {
                                        jel.p0 p0Var = (jel.p0) it13.next();
                                        Iterator it14 = it13;
                                        jel.q0 q0Var = p0Var.f173532a;
                                        arrayList19.add(new z.a(q0Var != null ? q0Var.name() : null, p0Var.f173533b));
                                        it13 = it14;
                                    }
                                    arrayList7 = arrayList19;
                                } else {
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    arrayList7 = null;
                                }
                                zVar = new hcl.z(bigDecimal4, bigDecimal5, bigDecimal, bigDecimal2, bigDecimal8, num, arrayList7);
                            } else {
                                zVar = null;
                            }
                            jel.c0 c0Var = b0Var.f173414g;
                            if (c0Var != null) {
                                Intrinsics.checkNotNullParameter(c0Var, "<this>");
                                uVar = new hcl.u(c0Var.f173422a, c0Var.f173423b, c0Var.f173424c, c0Var.d, c0Var.e, c0Var.f);
                            } else {
                                uVar = null;
                            }
                            jel.j0 j0Var = b0Var.f173415h;
                            if (j0Var != null) {
                                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                                jel.o0 o0Var2 = j0Var.f173482a;
                                if (o0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(o0Var2, "<this>");
                                    aVar = new x.a(o0Var2.f173525a, o0Var2.f173526b);
                                } else {
                                    aVar = null;
                                }
                                jel.d1 d1Var = j0Var.f173483b;
                                if (d1Var != null) {
                                    Intrinsics.checkNotNullParameter(d1Var, "<this>");
                                    jel.f0 f0Var = d1Var.f173433a;
                                    cVar = new x.c(f0Var != null ? f0Var.name() : null);
                                } else {
                                    cVar = null;
                                }
                                jel.r0 r0Var = j0Var.f173484c;
                                if (r0Var != null) {
                                    Intrinsics.checkNotNullParameter(r0Var, "<this>");
                                    jel.f0 f0Var2 = r0Var.f173554a;
                                    str2 = str18;
                                    bVar = new x.b(f0Var2 != null ? f0Var2.name() : null, r0Var.f173555b, r0Var.f173556c);
                                } else {
                                    str2 = str18;
                                    bVar = null;
                                }
                                xVar = new hcl.x(aVar, cVar, bVar);
                            } else {
                                str2 = str18;
                                xVar = null;
                            }
                            jel.d0 d0Var = b0Var.i;
                            if (d0Var != null) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                List list14 = d0Var.f173430a;
                                if (list14 != null) {
                                    arrayList3 = new ArrayList();
                                    Iterator it15 = list14.iterator();
                                    while (it15.hasNext()) {
                                        hcl.q qVarC = tcl.d.c((jel.x0) it15.next());
                                        hcl.d0 d0Var2 = qVarC instanceof hcl.d0 ? (hcl.d0) qVarC : null;
                                        if (d0Var2 != null) {
                                            arrayList3.add(d0Var2);
                                        }
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                List list15 = d0Var.f173431b;
                                if (list15 != null) {
                                    arrayList4 = new ArrayList();
                                    Iterator it16 = list15.iterator();
                                    while (it16.hasNext()) {
                                        hcl.q qVarC2 = tcl.d.c((jel.v0) it16.next());
                                        hcl.b0 b0Var2 = qVarC2 instanceof hcl.b0 ? (hcl.b0) qVarC2 : null;
                                        if (b0Var2 != null) {
                                            arrayList4.add(b0Var2);
                                        }
                                    }
                                } else {
                                    arrayList4 = null;
                                }
                                List list16 = d0Var.f173432c;
                                if (list16 != null) {
                                    arrayList5 = new ArrayList();
                                    Iterator it17 = list16.iterator();
                                    while (it17.hasNext()) {
                                        hcl.q qVarC3 = tcl.d.c((jel.t0) it17.next());
                                        Iterator it18 = it17;
                                        hcl.a0 a0Var2 = qVarC3 instanceof hcl.a0 ? (hcl.a0) qVarC3 : null;
                                        if (a0Var2 != null) {
                                            arrayList5.add(a0Var2);
                                        }
                                        it17 = it18;
                                    }
                                } else {
                                    arrayList5 = null;
                                }
                                List list17 = d0Var.d;
                                if (list17 != null) {
                                    arrayList6 = new ArrayList();
                                    Iterator it19 = list17.iterator();
                                    while (it19.hasNext()) {
                                        hcl.q qVarC4 = tcl.d.c((jel.u) it19.next());
                                        Iterator it20 = it19;
                                        hcl.r rVar3 = qVarC4 instanceof hcl.r ? (hcl.r) qVarC4 : null;
                                        if (rVar3 != null) {
                                            arrayList6.add(rVar3);
                                        }
                                        it19 = it20;
                                    }
                                } else {
                                    arrayList6 = null;
                                }
                                vVar = new hcl.v(arrayList3, arrayList4, arrayList5, arrayList6);
                            } else {
                                vVar = null;
                            }
                            jel.x xVar2 = b0Var.f173416j;
                            if (xVar2 != null) {
                                Intrinsics.checkNotNullParameter(xVar2, "<this>");
                                List list18 = xVar2.f173597a;
                                if (list18 != null) {
                                    List<jel.i0> list19 = list18;
                                    arrayList = new ArrayList(zhm.w.t(list19, 10));
                                    for (jel.i0 i0Var2 : list19) {
                                        Intrinsics.checkNotNullParameter(i0Var2, "<this>");
                                        String str24 = i0Var2.f173472a;
                                        BigDecimal bigDecimal9 = i0Var2.f173473b;
                                        hcl.v vVar3 = vVar;
                                        String str25 = i0Var2.f173474c;
                                        String str26 = i0Var2.d;
                                        xi0.b bVar8 = i0Var2.e;
                                        arrayList.add(new s.a(str24, str25, str26, bVar8 != null ? bVar8.f306286a : null, bigDecimal9));
                                        vVar = vVar3;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                vVar2 = vVar;
                                List list20 = xVar2.f173598b;
                                if (list20 != null) {
                                    List list21 = list20;
                                    arrayList2 = new ArrayList(zhm.w.t(list21, 10));
                                    for (Iterator it21 = list21.iterator(); it21.hasNext(); it21 = it21) {
                                        jel.f1 f1Var = (jel.f1) it21.next();
                                        Intrinsics.checkNotNullParameter(f1Var, "<this>");
                                        arrayList2.add(new s.b(f1Var.f173439a, f1Var.f173440b, f1Var.d, f1Var.e, f1Var.f, f1Var.f173442g, f1Var.f173441c));
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                sVar = new hcl.s(arrayList, arrayList2);
                            } else {
                                vVar2 = vVar;
                                sVar = null;
                            }
                            kVar.b(new hcl.t(str2, str17, str19, wVar, yVar, zVar, uVar, xVar, vVar2, sVar));
                        } else if (details instanceof jel.w2) {
                            dcl.r0 r0Var2 = oVar2.f288016j;
                            jel.w2 w2Var2 = (jel.w2) details;
                            Intrinsics.checkNotNullParameter(w2Var2, "<this>");
                            String str27 = w2Var2.f173586b;
                            String str28 = w2Var2.f173585a;
                            String str29 = w2Var2.f173587c;
                            String str30 = w2Var2.d;
                            jel.y1 y1Var2 = w2Var2.e;
                            h2 h2Var = new h2(y1Var2.f173609a, y1Var2.f173610b, y1Var2.f173611c, y1Var2.d, y1Var2.e, y1Var2.f);
                            jel.r1 r1Var = w2Var2.f;
                            if (r1Var != null) {
                                BigDecimal bigDecimal10 = r1Var.f173557a;
                                jel.u1 u1Var = r1Var.f173558b;
                                String strName4 = u1Var != null ? u1Var.name() : null;
                                jel.s1 s1Var = r1Var.f173559c;
                                String strName5 = s1Var != null ? s1Var.name() : null;
                                BigDecimal bigDecimal11 = r1Var.d;
                                LocalDate localDate7 = r1Var.e;
                                e2 e2Var = r1Var.f;
                                b2Var = new b2(bigDecimal10, strName4, strName5, bigDecimal11, localDate7, e2Var != null ? e2Var.name() : null);
                            } else {
                                b2Var = null;
                            }
                            jel.p1 p1Var = w2Var2.f173588g;
                            if (p1Var != null) {
                                BigDecimal bigDecimal12 = p1Var.f173534a;
                                BigDecimal bigDecimal13 = p1Var.f173535b;
                                jel.u1 u1Var2 = p1Var.f173536c;
                                String strName6 = u1Var2 != null ? u1Var2.name() : null;
                                BigDecimal bigDecimal14 = p1Var.d;
                                LocalDate localDate8 = p1Var.e;
                                e2 e2Var2 = p1Var.f;
                                z1Var = new z1(bigDecimal12, bigDecimal13, strName6, bigDecimal14, localDate8, e2Var2 != null ? e2Var2.name() : null);
                            } else {
                                z1Var = null;
                            }
                            jel.q1 q1Var = w2Var2.f173589h;
                            if (q1Var != null) {
                                BigDecimal bigDecimal15 = q1Var.f173545a;
                                BigDecimal bigDecimal16 = q1Var.f173546b;
                                BigDecimal bigDecimal17 = q1Var.f173547c;
                                e2 e2Var3 = q1Var.d;
                                a2Var = new a2(bigDecimal15, bigDecimal16, bigDecimal17, e2Var3 != null ? e2Var3.name() : null);
                            } else {
                                a2Var = null;
                            }
                            jel.t1 t1Var = w2Var2.i;
                            if (t1Var != null) {
                                BigDecimal bigDecimal18 = t1Var.f173566a;
                                BigDecimal bigDecimal19 = t1Var.f173567b;
                                BigDecimal bigDecimal20 = t1Var.f173568c;
                                BigDecimal bigDecimal21 = t1Var.d;
                                e2 e2Var4 = t1Var.e;
                                c2Var = new c2(e2Var4 != null ? e2Var4.name() : null, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21);
                            } else {
                                c2Var = null;
                            }
                            ArrayList<x1> arrayList20 = w2Var2.f173590j;
                            ArrayList arrayList21 = new ArrayList(zhm.w.t(arrayList20, 10));
                            for (x1 x1Var : arrayList20) {
                                arrayList21.add(new g2(x1Var.f173602a, x1Var.f173603b));
                            }
                            ArrayList<v2> arrayList22 = w2Var2.k;
                            ArrayList arrayList23 = new ArrayList(zhm.w.t(arrayList22, 10));
                            for (v2 v2Var : arrayList22) {
                                String str31 = v2Var.f173579a;
                                String str32 = v2Var.f173580b;
                                String str33 = v2Var.f173581c;
                                jel.g2 g2Var = v2Var.d;
                                jo3.b bVarA9 = (g2Var == null || (dVar = g2Var.f173451a) == null) ? null : hx7.a.A(dVar);
                                ej0.b bVar9 = v2Var.e;
                                arrayList23.add(new s2(str31, str32, str33, bVarA9, bVar9 != null ? cp5.c.M(bVar9) : null));
                            }
                            jel.w1 w1Var = w2Var2.f173591l;
                            String str34 = w1Var.f173582a;
                            String str35 = w1Var.f173583b;
                            jel.k2 k2Var2 = w1Var.f173584c;
                            if (k2Var2 != null) {
                                yel.b bVar10 = k2Var2.f173492a;
                                f2Var = new f2(bVar10 != null ? xcl.a.c(bVar10) : null);
                            } else {
                                f2Var = null;
                            }
                            jel.v1 v1Var = w1Var.d;
                            d2 d2Var = new d2(str34, str35, f2Var, v1Var != null ? new hcl.e2(v1Var.f173578b, v1Var.f173577a) : null);
                            List list22 = w2Var2.f173592m;
                            ArrayList arrayList24 = new ArrayList(zhm.w.t(list22, 10));
                            Iterator it22 = list22.iterator();
                            while (it22.hasNext()) {
                                arrayList24.add(((jel.o1) it22.next()).name());
                            }
                            ArrayList arrayList25 = w2Var2.f173593n;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            Iterator it23 = arrayList25.iterator();
                            while (it23.hasNext()) {
                                jel.a2 a2Var2 = (jel.a2) it23.next();
                                String str36 = a2Var2.f173405a;
                                String str37 = a2Var2.f173406b;
                                String str38 = str27;
                                String str39 = a2Var2.f173407c;
                                ArrayList arrayList27 = a2Var2.d;
                                String str40 = str28;
                                String str41 = str29;
                                String str42 = str30;
                                ArrayList arrayList28 = new ArrayList(zhm.w.t(arrayList27, 10));
                                Iterator it24 = arrayList27.iterator();
                                while (it24.hasNext()) {
                                    jel.h2 h2Var2 = (jel.h2) it24.next();
                                    BigDecimal bigDecimal22 = h2Var2.f173466a;
                                    Iterator it25 = it24;
                                    BigDecimal bigDecimal23 = h2Var2.f173467b;
                                    String strName7 = h2Var2.f173468c.name();
                                    String str43 = h2Var2.d;
                                    i2 i2Var = h2Var2.e;
                                    if (i2Var != null) {
                                        str = str43;
                                        it8 = it23;
                                        n2Var = new n2(i2Var.f173477a, i2Var.f173478b);
                                    } else {
                                        it8 = it23;
                                        str = str43;
                                        n2Var = null;
                                    }
                                    arrayList28.add(new m2(bigDecimal22, bigDecimal23, strName7, str, n2Var));
                                    it24 = it25;
                                    it23 = it8;
                                }
                                arrayList26.add(new j2(str36, str37, str39, arrayList28));
                                str27 = str38;
                                str28 = str40;
                                str29 = str41;
                                str30 = str42;
                            }
                            String str44 = str27;
                            String str45 = str28;
                            String str46 = str29;
                            String str47 = str30;
                            jel.d2 d2Var2 = w2Var2.o;
                            if (d2Var2 != null) {
                                ArrayList<jel.b2> arrayList29 = d2Var2.f173434a;
                                ArrayList arrayList30 = new ArrayList(zhm.w.t(arrayList29, 10));
                                for (jel.b2 b2Var2 : arrayList29) {
                                    BigDecimal bigDecimal24 = b2Var2.f173417a;
                                    BigDecimal bigDecimal25 = b2Var2.f173418b;
                                    boolean z3 = b2Var2.f173419c;
                                    jel.c2 c2Var2 = b2Var2.d;
                                    arrayList30.add(new k2.a(bigDecimal24, bigDecimal25, z3, c2Var2 != null ? c2Var2.name() : null));
                                }
                                k2Var = new k2(arrayList30, d2Var2.f173435b);
                            } else {
                                k2Var = null;
                            }
                            ArrayList<jel.f2> arrayList31 = w2Var2.f173594p;
                            ArrayList arrayList32 = new ArrayList(zhm.w.t(arrayList31, 10));
                            for (jel.f2 f2Var2 : arrayList31) {
                                arrayList32.add(new l2(tcl.n.c(f2Var2.f173443a), tcl.n.c(f2Var2.f173444b)));
                            }
                            jel.z1 z1Var2 = w2Var2.f173595q;
                            hcl.i2 i2Var2 = z1Var2 != null ? new hcl.i2(z1Var2.f173616b, z1Var2.f173615a) : null;
                            jel.l2 l2Var = w2Var2.f173596r;
                            r0Var2.b(new t2(str44, str45, str46, str47, h2Var, b2Var, z1Var, a2Var, c2Var, arrayList21, arrayList23, d2Var, arrayList24, arrayList26, k2Var, arrayList32, i2Var2, l2Var != null ? new o2(l2Var.f173497b, l2Var.f173496a) : null));
                        } else {
                            if (!(details instanceof jel.m1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dcl.p0 p0Var2 = oVar2.i;
                            jel.m1 m1Var = (jel.m1) details;
                            Intrinsics.checkNotNullParameter(m1Var, "<this>");
                            String str48 = m1Var.f173506a;
                            String str49 = m1Var.f173507b;
                            String str50 = m1Var.f173508c;
                            jel.n1 n1Var = m1Var.d;
                            if (n1Var != null) {
                                Intrinsics.checkNotNullParameter(n1Var, "<this>");
                                y1Var = new y1(n1Var.f173519a, n1Var.f173520b, n1Var.f173521c, n1Var.d, n1Var.e, n1Var.f);
                            } else {
                                y1Var = null;
                            }
                            p0Var2.b(new hcl.x1(str49, str48, str50, y1Var));
                        }
                        return Unit.f186387a;
                    case 4:
                        l params = (l) obj2;
                        jel.i1 recommendations = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
                        oVar2.f288017l.f(params.a(), recommendations);
                        return Unit.f186387a;
                    case 5:
                        jel.i1 recommendations2 = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter((l) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recommendations2, "recommendations");
                        dcl.w wVar2 = oVar2.f288013c;
                        Object obj7 = tcl.g.f269882a;
                        Intrinsics.checkNotNullParameter(recommendations2, "<this>");
                        String str51 = recommendations2.f173475a;
                        ArrayList<jel.z2> arrayList33 = recommendations2.f173476b;
                        ArrayList arrayList34 = new ArrayList(zhm.w.t(arrayList33, 10));
                        for (jel.z2 z2Var3 : arrayList33) {
                            Intrinsics.checkNotNullParameter(z2Var3, "<this>");
                            arrayList34.add(new z2(le.u1.g(z2Var3.d, tcl.g.f269883b), z2Var3.f173617a, z2Var3.f173618b, z2Var3.f173619c, z2Var3.e));
                        }
                        wVar2.b(new hcl.m0(str51, arrayList34));
                        return Unit.f186387a;
                    default:
                        String ref5 = (String) obj2;
                        jel.l1 targetMarket2 = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref5, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket2, "targetMarket");
                        oVar2.f288017l.f(o.f288009s + ref5, targetMarket2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i59 = 8;
        final int i66 = 9;
        final int i74 = 6;
        final int i92 = 0;
        final int i96 = 0;
        this.f288020p = new w4l.f(te0.w.k0(connectivityRepository, new Function1(this) { // from class: vdl.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287980b;

            {
                this.f287980b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:435:0x09b7  */
            /* JADX WARN: Removed duplicated region for block: B:443:0x09de  */
            /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r42) {
                /*
                    Method dump skipped, instruction units count: 3680
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vdl.i.invoke(java.lang.Object):java.lang.Object");
            }
        }), new Function1(this) { // from class: vdl.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287980b;

            {
                this.f287980b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:435:0x09b7  */
            /* JADX WARN: Removed duplicated region for block: B:443:0x09de  */
            /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r42) {
                /*
                    Method dump skipped, instruction units count: 3680
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vdl.i.invoke(java.lang.Object):java.lang.Object");
            }
        }, new Function2(this) { // from class: vdl.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287983b;

            {
                this.f287983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                y1 y1Var;
                b2 b2Var;
                z1 z1Var;
                a2 a2Var;
                c2 c2Var;
                f2 f2Var;
                k2 k2Var;
                Iterator it8;
                String str;
                n2 n2Var;
                dj0.d dVar;
                hcl.w wVar;
                hcl.y yVar;
                hcl.z zVar;
                hcl.u uVar;
                String str2;
                hcl.x xVar;
                hcl.v vVar;
                hcl.v vVar2;
                hcl.s sVar;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                x.a aVar;
                x.c cVar;
                x.b bVar;
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                ArrayList arrayList7;
                ArrayList arrayList8;
                ArrayList arrayList9;
                hcl.h hVar;
                hcl.c cVar2;
                hcl.o0 o0Var;
                hcl.b bVar2;
                ArrayList arrayList10;
                z2 z2Var;
                w2 w2Var;
                hcl.o oVar;
                hcl.n nVar;
                ArrayList arrayList11;
                ArrayList arrayList12;
                ArrayList arrayList13;
                ArrayList arrayList14;
                int i212 = i74;
                o oVar2 = this.f287983b;
                switch (i212) {
                    case 0:
                        String ref2 = (String) obj2;
                        jel.l1 targetMarket = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket, "targetMarket");
                        dcl.r rVar = oVar2.d;
                        Object obj4 = tcl.j.f269888a;
                        Intrinsics.checkNotNullParameter(targetMarket, "<this>");
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        rVar.b(new hcl.q0(ref2, le.u1.g(targetMarket, tcl.j.f269888a)));
                        return Unit.f186387a;
                    case 1:
                        String ref3 = (String) obj2;
                        nel.w summary = (nel.w) obj3;
                        Intrinsics.checkNotNullParameter(ref3, "ref");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        oVar2.f288017l.f(o.f288010t + ref3, summary);
                        return Unit.f186387a;
                    case 2:
                        String ref4 = (String) obj2;
                        jel.c instrumentDetails = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter(ref4, "ref");
                        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
                        oVar2.f288017l.f(ref4, instrumentDetails);
                        return Unit.f186387a;
                    case 3:
                        jel.c details = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(details, "details");
                        if (details instanceof jel.q) {
                            dcl.g gVar = oVar2.e;
                            jel.q qVar = (jel.q) details;
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            String str3 = qVar.f173541b;
                            String str4 = qVar.f173540a;
                            jel.s sVar2 = qVar.e;
                            if (sVar2 != null) {
                                dj0.d dVar2 = sVar2.f173561a;
                                jo3.b bVarA = dVar2 != null ? hx7.a.A(dVar2) : null;
                                dj0.d dVar3 = sVar2.f173562b;
                                oVar = new hcl.o(bVarA, dVar3 != null ? hx7.a.A(dVar3) : null, sVar2.f173563c, sVar2.d, sVar2.e, sVar2.f);
                            } else {
                                oVar = null;
                            }
                            jel.r rVar2 = qVar.f;
                            if (rVar2 != null) {
                                List list = rVar2.f173551a;
                                if (list != null) {
                                    arrayList12 = new ArrayList();
                                    Iterator it9 = list.iterator();
                                    while (it9.hasNext()) {
                                        hcl.a aVarV = zh9.u0.V((jel.p) it9.next());
                                        hcl.l lVar = aVarV instanceof hcl.l ? (hcl.l) aVarV : null;
                                        if (lVar != null) {
                                            arrayList12.add(lVar);
                                        }
                                    }
                                } else {
                                    arrayList12 = null;
                                }
                                List list2 = rVar2.f173552b;
                                if (list2 != null) {
                                    arrayList13 = new ArrayList();
                                    Iterator it10 = list2.iterator();
                                    while (it10.hasNext()) {
                                        hcl.a aVarV2 = zh9.u0.V((b3) it10.next());
                                        hcl.b3 b3Var = aVarV2 instanceof hcl.b3 ? (hcl.b3) aVarV2 : null;
                                        if (b3Var != null) {
                                            arrayList13.add(b3Var);
                                        }
                                    }
                                } else {
                                    arrayList13 = null;
                                }
                                List list3 = rVar2.f173553c;
                                if (list3 != null) {
                                    arrayList14 = new ArrayList();
                                    Iterator it11 = list3.iterator();
                                    while (it11.hasNext()) {
                                        hcl.a aVarV3 = zh9.u0.V((jel.g1) it11.next());
                                        hcl.h0 h0Var = aVarV3 instanceof hcl.h0 ? (hcl.h0) aVarV3 : null;
                                        if (h0Var != null) {
                                            arrayList14.add(h0Var);
                                        }
                                    }
                                } else {
                                    arrayList14 = null;
                                }
                                nVar = new hcl.n(arrayList12, arrayList13, arrayList14);
                            } else {
                                nVar = null;
                            }
                            String str5 = qVar.f173542c;
                            String str6 = qVar.d;
                            String str7 = qVar.f173543g;
                            String str8 = qVar.f173544h;
                            List list4 = qVar.i;
                            if (list4 != null) {
                                List<jel.k1> list5 = list4;
                                ArrayList arrayList15 = new ArrayList(zhm.w.t(list5, 10));
                                for (jel.k1 k1Var : list5) {
                                    Intrinsics.checkNotNullParameter(k1Var, "<this>");
                                    arrayList15.add(new hcl.p0(k1Var.f173490a, k1Var.f173491b));
                                }
                                arrayList11 = arrayList15;
                            } else {
                                arrayList11 = null;
                            }
                            gVar.b(new hcl.m(str3, str4, str5, str6, oVar, nVar, str7, str8, arrayList11));
                        } else if (details instanceof jel.h1) {
                            dcl.i0 i0Var = oVar2.f288012b;
                            jel.h1 h1Var = (jel.h1) details;
                            Object obj5 = tcl.g.f269882a;
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            String str9 = h1Var.f173461a;
                            String str10 = h1Var.f173462b;
                            jel.j1 j1Var = h1Var.e;
                            if (j1Var != null) {
                                Intrinsics.checkNotNullParameter(j1Var, "<this>");
                                dj0.d dVar4 = j1Var.f173485a;
                                jo3.b bVarA2 = dVar4 != null ? hx7.a.A(dVar4) : null;
                                Double d = j1Var.f173486b;
                                Double d5 = j1Var.f173487c;
                                dj0.d dVar5 = j1Var.d;
                                jo3.b bVarA3 = dVar5 != null ? hx7.a.A(dVar5) : null;
                                dj0.d dVar6 = j1Var.e;
                                jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                                dj0.d dVar7 = j1Var.f;
                                o0Var = new hcl.o0(bVarA2, d, d5, bVarA3, bVarA4, dVar7 != null ? hx7.a.A(dVar7) : null, j1Var.f173488g, j1Var.f173489h, j1Var.i);
                            } else {
                                o0Var = null;
                            }
                            String str11 = h1Var.f173463c;
                            String str12 = h1Var.d;
                            String strH = le.u1.h(h1Var.f, tcl.g.f269882a);
                            if (strH == null) {
                                strH = "";
                            }
                            String str13 = strH;
                            String strB = tbl.a.b(h1Var.f173465h);
                            jel.b bVar3 = h1Var.f173464g;
                            if (bVar3 != null) {
                                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                                jel.z2 z2Var2 = bVar3.f173409a;
                                if (z2Var2 != null) {
                                    Intrinsics.checkNotNullParameter(z2Var2, "<this>");
                                    z2Var = new z2(le.u1.g(z2Var2.d, tcl.g.f269883b), z2Var2.f173617a, z2Var2.f173618b, z2Var2.f173619c, z2Var2.e);
                                } else {
                                    z2Var = null;
                                }
                                x2 x2Var = bVar3.f173410b;
                                if (x2Var != null) {
                                    Intrinsics.checkNotNullParameter(x2Var, "<this>");
                                    w2Var = new w2(hx7.a.A(x2Var.f173604a), hx7.a.A(x2Var.f173605b), hx7.a.A(x2Var.f173606c), x2Var.d, x2Var.e);
                                } else {
                                    w2Var = null;
                                }
                                bVar2 = new hcl.b(z2Var, w2Var);
                            } else {
                                bVar2 = null;
                            }
                            List list6 = h1Var.i;
                            if (list6 != null) {
                                List<jel.k1> list7 = list6;
                                ArrayList arrayList16 = new ArrayList(zhm.w.t(list7, 10));
                                for (jel.k1 k1Var2 : list7) {
                                    Intrinsics.checkNotNullParameter(k1Var2, "<this>");
                                    arrayList16.add(new hcl.p0(k1Var2.f173490a, k1Var2.f173491b));
                                }
                                arrayList10 = arrayList16;
                            } else {
                                arrayList10 = null;
                            }
                            i0Var.b(new hcl.i0(str10, str9, str11, str12, o0Var, str13, strB, bVar2, arrayList10));
                        } else if (details instanceof jel.m) {
                            dcl.a aVar2 = oVar2.f;
                            jel.m mVar = (jel.m) details;
                            Object obj6 = tcl.b.f269876a;
                            Intrinsics.checkNotNullParameter(mVar, "<this>");
                            String str14 = mVar.f173499b;
                            String str15 = mVar.f173498a;
                            String str16 = mVar.f173500c;
                            jel.h hVar2 = mVar.d;
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            LocalDate localDate = hVar2.f173452a;
                            dj0.d dVar8 = hVar2.f173453b;
                            jo3.b bVarA5 = dVar8 != null ? hx7.a.A(dVar8) : null;
                            LocalDate localDate2 = hVar2.f173454c;
                            dj0.d dVar9 = hVar2.d;
                            jo3.b bVarA6 = dVar9 != null ? hx7.a.A(dVar9) : null;
                            dj0.d dVar10 = hVar2.e;
                            hcl.e eVar = new hcl.e(localDate, bVarA5, localDate2, bVarA6, dVar10 != null ? hx7.a.A(dVar10) : null);
                            jel.i iVar = mVar.e;
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            hcl.f fVar = new hcl.f(iVar.f173469a, iVar.f173470b, iVar.f173471c);
                            jel.e eVar2 = mVar.f;
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            BigDecimal bigDecimal3 = eVar2.f173436a;
                            jel.g gVar2 = eVar2.f173437b;
                            String strH2 = gVar2 != null ? le.u1.h(gVar2, tcl.b.f269876a) : null;
                            LocalDate localDate3 = eVar2.f173438c;
                            jel.f fVar2 = eVar2.d;
                            hcl.d dVar11 = new hcl.d(bigDecimal3, strH2, localDate3, fVar2 != null ? le.u1.h(fVar2, tcl.b.f269877b) : null);
                            jel.j jVar = mVar.f173501g;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            ej0.b bVar4 = jVar.f173479a;
                            ko3.b bVarM = bVar4 != null ? cp5.c.M(bVar4) : null;
                            ej0.b bVar5 = jVar.f173480b;
                            ko3.b bVarM2 = bVar5 != null ? cp5.c.M(bVar5) : null;
                            ej0.b bVar6 = jVar.f173481c;
                            hcl.g gVar3 = new hcl.g(bVarM, bVarM2, bVar6 != null ? cp5.c.M(bVar6) : null, jVar.d, jVar.e);
                            jel.l lVar2 = mVar.f173502h;
                            if (lVar2 != null) {
                                Intrinsics.checkNotNullParameter(lVar2, "<this>");
                                int i222 = lVar2.f173493a;
                                yel.b bVar7 = lVar2.f173494b;
                                hVar = new hcl.h(i222, bVar7 != null ? xcl.a.c(bVar7) : null, lVar2.f173495c);
                            } else {
                                hVar = null;
                            }
                            jel.d dVar12 = mVar.i;
                            if (dVar12 != null) {
                                Intrinsics.checkNotNullParameter(dVar12, "<this>");
                                boolean z = dVar12.f173427a;
                                LocalDate localDate4 = dVar12.f173428b;
                                dj0.d dVar13 = dVar12.f173429c;
                                cVar2 = new hcl.c(z, localDate4, dVar13 != null ? hx7.a.A(dVar13) : null, dVar12.d);
                            } else {
                                cVar2 = null;
                            }
                            aVar2.b(new hcl.i(str14, str15, str16, eVar, fVar, dVar11, gVar3, hVar, cVar2));
                        } else if (details instanceof jel.n) {
                            dcl.e eVar3 = oVar2.f288014g;
                            jel.n nVar2 = (jel.n) details;
                            Intrinsics.checkNotNullParameter(nVar2, "<this>");
                            eVar3.b(new hcl.k(nVar2.f173513b, nVar2.f173512a, nVar2.f173514c, nVar2.d, nVar2.e));
                        } else if (details instanceof jel.b0) {
                            dcl.k kVar = oVar2.f288015h;
                            jel.b0 b0Var = (jel.b0) details;
                            Intrinsics.checkNotNullParameter(b0Var, "<this>");
                            String str17 = b0Var.f173411a;
                            String str18 = b0Var.f173412b;
                            String str19 = b0Var.f173413c;
                            jel.h0 h0Var2 = b0Var.d;
                            if (h0Var2 != null) {
                                Intrinsics.checkNotNullParameter(h0Var2, "<this>");
                                jel.k0 k0Var = h0Var2.f173455a;
                                String strName = k0Var != null ? k0Var.name() : null;
                                String str20 = h0Var2.f173456b;
                                String str21 = h0Var2.f173457c;
                                LocalDate localDate5 = h0Var2.d;
                                List list8 = h0Var2.e;
                                if (list8 != null) {
                                    List<jel.g0> list9 = list8;
                                    ArrayList arrayList17 = new ArrayList(zhm.w.t(list9, 10));
                                    for (jel.g0 g0Var : list9) {
                                        Intrinsics.checkNotNullParameter(g0Var, "<this>");
                                        arrayList17.add(new w.a(g0Var.f173445a, g0Var.f173446b, g0Var.f173447c));
                                    }
                                    arrayList9 = arrayList17;
                                } else {
                                    arrayList9 = null;
                                }
                                dj0.d dVar14 = h0Var2.f;
                                jo3.b bVarA7 = dVar14 != null ? hx7.a.A(dVar14) : null;
                                jel.e1 e1Var = h0Var2.f173458g;
                                String strName2 = e1Var != null ? e1Var.name() : null;
                                jel.a0 a0Var = h0Var2.f173459h;
                                String strName3 = a0Var != null ? a0Var.name() : null;
                                jel.y yVar2 = h0Var2.i;
                                wVar = new hcl.w(strName, str20, str21, localDate5, arrayList9, bVarA7, strName2, strName3, yVar2 != null ? yVar2.name() : null, h0Var2.f173460j);
                            } else {
                                wVar = null;
                            }
                            jel.m0 m0Var = b0Var.e;
                            if (m0Var != null) {
                                Intrinsics.checkNotNullParameter(m0Var, "<this>");
                                String str22 = m0Var.f173503a;
                                String str23 = m0Var.f173504b;
                                dj0.d dVar15 = m0Var.f173505c;
                                jo3.b bVarA8 = dVar15 != null ? hx7.a.A(dVar15) : null;
                                LocalDate localDate6 = m0Var.d;
                                List list10 = m0Var.e;
                                if (list10 != null) {
                                    List list11 = list10;
                                    ArrayList arrayList18 = new ArrayList(zhm.w.t(list11, 10));
                                    Iterator it12 = list11.iterator();
                                    while (it12.hasNext()) {
                                        jel.z zVar2 = (jel.z) it12.next();
                                        Intrinsics.checkNotNullParameter(zVar2, "<this>");
                                        arrayList18.add(new y.a(zVar2.f173612a, zVar2.f173613b, zVar2.f173614c, zVar2.d));
                                        it12 = it12;
                                        localDate6 = localDate6;
                                    }
                                    arrayList8 = arrayList18;
                                } else {
                                    arrayList8 = null;
                                }
                                yVar = new hcl.y(str22, str23, bVarA8, localDate6, arrayList8);
                            } else {
                                yVar = null;
                            }
                            jel.n0 n0Var = b0Var.f;
                            if (n0Var != null) {
                                Intrinsics.checkNotNullParameter(n0Var, "<this>");
                                BigDecimal bigDecimal4 = n0Var.f173515a;
                                BigDecimal bigDecimal5 = n0Var.f173516b;
                                BigDecimal bigDecimal6 = n0Var.f173517c;
                                BigDecimal bigDecimal7 = n0Var.d;
                                BigDecimal bigDecimal8 = n0Var.e;
                                Integer num = n0Var.f;
                                List list12 = n0Var.f173518g;
                                if (list12 != null) {
                                    List list13 = list12;
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    ArrayList arrayList19 = new ArrayList(zhm.w.t(list13, 10));
                                    Iterator it13 = list13.iterator();
                                    while (it13.hasNext()) {
                                        jel.p0 p0Var = (jel.p0) it13.next();
                                        Iterator it14 = it13;
                                        jel.q0 q0Var = p0Var.f173532a;
                                        arrayList19.add(new z.a(q0Var != null ? q0Var.name() : null, p0Var.f173533b));
                                        it13 = it14;
                                    }
                                    arrayList7 = arrayList19;
                                } else {
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    arrayList7 = null;
                                }
                                zVar = new hcl.z(bigDecimal4, bigDecimal5, bigDecimal, bigDecimal2, bigDecimal8, num, arrayList7);
                            } else {
                                zVar = null;
                            }
                            jel.c0 c0Var = b0Var.f173414g;
                            if (c0Var != null) {
                                Intrinsics.checkNotNullParameter(c0Var, "<this>");
                                uVar = new hcl.u(c0Var.f173422a, c0Var.f173423b, c0Var.f173424c, c0Var.d, c0Var.e, c0Var.f);
                            } else {
                                uVar = null;
                            }
                            jel.j0 j0Var = b0Var.f173415h;
                            if (j0Var != null) {
                                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                                jel.o0 o0Var2 = j0Var.f173482a;
                                if (o0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(o0Var2, "<this>");
                                    aVar = new x.a(o0Var2.f173525a, o0Var2.f173526b);
                                } else {
                                    aVar = null;
                                }
                                jel.d1 d1Var = j0Var.f173483b;
                                if (d1Var != null) {
                                    Intrinsics.checkNotNullParameter(d1Var, "<this>");
                                    jel.f0 f0Var = d1Var.f173433a;
                                    cVar = new x.c(f0Var != null ? f0Var.name() : null);
                                } else {
                                    cVar = null;
                                }
                                jel.r0 r0Var = j0Var.f173484c;
                                if (r0Var != null) {
                                    Intrinsics.checkNotNullParameter(r0Var, "<this>");
                                    jel.f0 f0Var2 = r0Var.f173554a;
                                    str2 = str18;
                                    bVar = new x.b(f0Var2 != null ? f0Var2.name() : null, r0Var.f173555b, r0Var.f173556c);
                                } else {
                                    str2 = str18;
                                    bVar = null;
                                }
                                xVar = new hcl.x(aVar, cVar, bVar);
                            } else {
                                str2 = str18;
                                xVar = null;
                            }
                            jel.d0 d0Var = b0Var.i;
                            if (d0Var != null) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                List list14 = d0Var.f173430a;
                                if (list14 != null) {
                                    arrayList3 = new ArrayList();
                                    Iterator it15 = list14.iterator();
                                    while (it15.hasNext()) {
                                        hcl.q qVarC = tcl.d.c((jel.x0) it15.next());
                                        hcl.d0 d0Var2 = qVarC instanceof hcl.d0 ? (hcl.d0) qVarC : null;
                                        if (d0Var2 != null) {
                                            arrayList3.add(d0Var2);
                                        }
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                List list15 = d0Var.f173431b;
                                if (list15 != null) {
                                    arrayList4 = new ArrayList();
                                    Iterator it16 = list15.iterator();
                                    while (it16.hasNext()) {
                                        hcl.q qVarC2 = tcl.d.c((jel.v0) it16.next());
                                        hcl.b0 b0Var2 = qVarC2 instanceof hcl.b0 ? (hcl.b0) qVarC2 : null;
                                        if (b0Var2 != null) {
                                            arrayList4.add(b0Var2);
                                        }
                                    }
                                } else {
                                    arrayList4 = null;
                                }
                                List list16 = d0Var.f173432c;
                                if (list16 != null) {
                                    arrayList5 = new ArrayList();
                                    Iterator it17 = list16.iterator();
                                    while (it17.hasNext()) {
                                        hcl.q qVarC3 = tcl.d.c((jel.t0) it17.next());
                                        Iterator it18 = it17;
                                        hcl.a0 a0Var2 = qVarC3 instanceof hcl.a0 ? (hcl.a0) qVarC3 : null;
                                        if (a0Var2 != null) {
                                            arrayList5.add(a0Var2);
                                        }
                                        it17 = it18;
                                    }
                                } else {
                                    arrayList5 = null;
                                }
                                List list17 = d0Var.d;
                                if (list17 != null) {
                                    arrayList6 = new ArrayList();
                                    Iterator it19 = list17.iterator();
                                    while (it19.hasNext()) {
                                        hcl.q qVarC4 = tcl.d.c((jel.u) it19.next());
                                        Iterator it20 = it19;
                                        hcl.r rVar3 = qVarC4 instanceof hcl.r ? (hcl.r) qVarC4 : null;
                                        if (rVar3 != null) {
                                            arrayList6.add(rVar3);
                                        }
                                        it19 = it20;
                                    }
                                } else {
                                    arrayList6 = null;
                                }
                                vVar = new hcl.v(arrayList3, arrayList4, arrayList5, arrayList6);
                            } else {
                                vVar = null;
                            }
                            jel.x xVar2 = b0Var.f173416j;
                            if (xVar2 != null) {
                                Intrinsics.checkNotNullParameter(xVar2, "<this>");
                                List list18 = xVar2.f173597a;
                                if (list18 != null) {
                                    List<jel.i0> list19 = list18;
                                    arrayList = new ArrayList(zhm.w.t(list19, 10));
                                    for (jel.i0 i0Var2 : list19) {
                                        Intrinsics.checkNotNullParameter(i0Var2, "<this>");
                                        String str24 = i0Var2.f173472a;
                                        BigDecimal bigDecimal9 = i0Var2.f173473b;
                                        hcl.v vVar3 = vVar;
                                        String str25 = i0Var2.f173474c;
                                        String str26 = i0Var2.d;
                                        xi0.b bVar8 = i0Var2.e;
                                        arrayList.add(new s.a(str24, str25, str26, bVar8 != null ? bVar8.f306286a : null, bigDecimal9));
                                        vVar = vVar3;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                vVar2 = vVar;
                                List list20 = xVar2.f173598b;
                                if (list20 != null) {
                                    List list21 = list20;
                                    arrayList2 = new ArrayList(zhm.w.t(list21, 10));
                                    for (Iterator it21 = list21.iterator(); it21.hasNext(); it21 = it21) {
                                        jel.f1 f1Var = (jel.f1) it21.next();
                                        Intrinsics.checkNotNullParameter(f1Var, "<this>");
                                        arrayList2.add(new s.b(f1Var.f173439a, f1Var.f173440b, f1Var.d, f1Var.e, f1Var.f, f1Var.f173442g, f1Var.f173441c));
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                sVar = new hcl.s(arrayList, arrayList2);
                            } else {
                                vVar2 = vVar;
                                sVar = null;
                            }
                            kVar.b(new hcl.t(str2, str17, str19, wVar, yVar, zVar, uVar, xVar, vVar2, sVar));
                        } else if (details instanceof jel.w2) {
                            dcl.r0 r0Var2 = oVar2.f288016j;
                            jel.w2 w2Var2 = (jel.w2) details;
                            Intrinsics.checkNotNullParameter(w2Var2, "<this>");
                            String str27 = w2Var2.f173586b;
                            String str28 = w2Var2.f173585a;
                            String str29 = w2Var2.f173587c;
                            String str30 = w2Var2.d;
                            jel.y1 y1Var2 = w2Var2.e;
                            h2 h2Var = new h2(y1Var2.f173609a, y1Var2.f173610b, y1Var2.f173611c, y1Var2.d, y1Var2.e, y1Var2.f);
                            jel.r1 r1Var = w2Var2.f;
                            if (r1Var != null) {
                                BigDecimal bigDecimal10 = r1Var.f173557a;
                                jel.u1 u1Var = r1Var.f173558b;
                                String strName4 = u1Var != null ? u1Var.name() : null;
                                jel.s1 s1Var = r1Var.f173559c;
                                String strName5 = s1Var != null ? s1Var.name() : null;
                                BigDecimal bigDecimal11 = r1Var.d;
                                LocalDate localDate7 = r1Var.e;
                                e2 e2Var = r1Var.f;
                                b2Var = new b2(bigDecimal10, strName4, strName5, bigDecimal11, localDate7, e2Var != null ? e2Var.name() : null);
                            } else {
                                b2Var = null;
                            }
                            jel.p1 p1Var = w2Var2.f173588g;
                            if (p1Var != null) {
                                BigDecimal bigDecimal12 = p1Var.f173534a;
                                BigDecimal bigDecimal13 = p1Var.f173535b;
                                jel.u1 u1Var2 = p1Var.f173536c;
                                String strName6 = u1Var2 != null ? u1Var2.name() : null;
                                BigDecimal bigDecimal14 = p1Var.d;
                                LocalDate localDate8 = p1Var.e;
                                e2 e2Var2 = p1Var.f;
                                z1Var = new z1(bigDecimal12, bigDecimal13, strName6, bigDecimal14, localDate8, e2Var2 != null ? e2Var2.name() : null);
                            } else {
                                z1Var = null;
                            }
                            jel.q1 q1Var = w2Var2.f173589h;
                            if (q1Var != null) {
                                BigDecimal bigDecimal15 = q1Var.f173545a;
                                BigDecimal bigDecimal16 = q1Var.f173546b;
                                BigDecimal bigDecimal17 = q1Var.f173547c;
                                e2 e2Var3 = q1Var.d;
                                a2Var = new a2(bigDecimal15, bigDecimal16, bigDecimal17, e2Var3 != null ? e2Var3.name() : null);
                            } else {
                                a2Var = null;
                            }
                            jel.t1 t1Var = w2Var2.i;
                            if (t1Var != null) {
                                BigDecimal bigDecimal18 = t1Var.f173566a;
                                BigDecimal bigDecimal19 = t1Var.f173567b;
                                BigDecimal bigDecimal20 = t1Var.f173568c;
                                BigDecimal bigDecimal21 = t1Var.d;
                                e2 e2Var4 = t1Var.e;
                                c2Var = new c2(e2Var4 != null ? e2Var4.name() : null, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21);
                            } else {
                                c2Var = null;
                            }
                            ArrayList<x1> arrayList20 = w2Var2.f173590j;
                            ArrayList arrayList21 = new ArrayList(zhm.w.t(arrayList20, 10));
                            for (x1 x1Var : arrayList20) {
                                arrayList21.add(new g2(x1Var.f173602a, x1Var.f173603b));
                            }
                            ArrayList<v2> arrayList22 = w2Var2.k;
                            ArrayList arrayList23 = new ArrayList(zhm.w.t(arrayList22, 10));
                            for (v2 v2Var : arrayList22) {
                                String str31 = v2Var.f173579a;
                                String str32 = v2Var.f173580b;
                                String str33 = v2Var.f173581c;
                                jel.g2 g2Var = v2Var.d;
                                jo3.b bVarA9 = (g2Var == null || (dVar = g2Var.f173451a) == null) ? null : hx7.a.A(dVar);
                                ej0.b bVar9 = v2Var.e;
                                arrayList23.add(new s2(str31, str32, str33, bVarA9, bVar9 != null ? cp5.c.M(bVar9) : null));
                            }
                            jel.w1 w1Var = w2Var2.f173591l;
                            String str34 = w1Var.f173582a;
                            String str35 = w1Var.f173583b;
                            jel.k2 k2Var2 = w1Var.f173584c;
                            if (k2Var2 != null) {
                                yel.b bVar10 = k2Var2.f173492a;
                                f2Var = new f2(bVar10 != null ? xcl.a.c(bVar10) : null);
                            } else {
                                f2Var = null;
                            }
                            jel.v1 v1Var = w1Var.d;
                            d2 d2Var = new d2(str34, str35, f2Var, v1Var != null ? new hcl.e2(v1Var.f173578b, v1Var.f173577a) : null);
                            List list22 = w2Var2.f173592m;
                            ArrayList arrayList24 = new ArrayList(zhm.w.t(list22, 10));
                            Iterator it22 = list22.iterator();
                            while (it22.hasNext()) {
                                arrayList24.add(((jel.o1) it22.next()).name());
                            }
                            ArrayList arrayList25 = w2Var2.f173593n;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            Iterator it23 = arrayList25.iterator();
                            while (it23.hasNext()) {
                                jel.a2 a2Var2 = (jel.a2) it23.next();
                                String str36 = a2Var2.f173405a;
                                String str37 = a2Var2.f173406b;
                                String str38 = str27;
                                String str39 = a2Var2.f173407c;
                                ArrayList arrayList27 = a2Var2.d;
                                String str40 = str28;
                                String str41 = str29;
                                String str42 = str30;
                                ArrayList arrayList28 = new ArrayList(zhm.w.t(arrayList27, 10));
                                Iterator it24 = arrayList27.iterator();
                                while (it24.hasNext()) {
                                    jel.h2 h2Var2 = (jel.h2) it24.next();
                                    BigDecimal bigDecimal22 = h2Var2.f173466a;
                                    Iterator it25 = it24;
                                    BigDecimal bigDecimal23 = h2Var2.f173467b;
                                    String strName7 = h2Var2.f173468c.name();
                                    String str43 = h2Var2.d;
                                    i2 i2Var = h2Var2.e;
                                    if (i2Var != null) {
                                        str = str43;
                                        it8 = it23;
                                        n2Var = new n2(i2Var.f173477a, i2Var.f173478b);
                                    } else {
                                        it8 = it23;
                                        str = str43;
                                        n2Var = null;
                                    }
                                    arrayList28.add(new m2(bigDecimal22, bigDecimal23, strName7, str, n2Var));
                                    it24 = it25;
                                    it23 = it8;
                                }
                                arrayList26.add(new j2(str36, str37, str39, arrayList28));
                                str27 = str38;
                                str28 = str40;
                                str29 = str41;
                                str30 = str42;
                            }
                            String str44 = str27;
                            String str45 = str28;
                            String str46 = str29;
                            String str47 = str30;
                            jel.d2 d2Var2 = w2Var2.o;
                            if (d2Var2 != null) {
                                ArrayList<jel.b2> arrayList29 = d2Var2.f173434a;
                                ArrayList arrayList30 = new ArrayList(zhm.w.t(arrayList29, 10));
                                for (jel.b2 b2Var2 : arrayList29) {
                                    BigDecimal bigDecimal24 = b2Var2.f173417a;
                                    BigDecimal bigDecimal25 = b2Var2.f173418b;
                                    boolean z3 = b2Var2.f173419c;
                                    jel.c2 c2Var2 = b2Var2.d;
                                    arrayList30.add(new k2.a(bigDecimal24, bigDecimal25, z3, c2Var2 != null ? c2Var2.name() : null));
                                }
                                k2Var = new k2(arrayList30, d2Var2.f173435b);
                            } else {
                                k2Var = null;
                            }
                            ArrayList<jel.f2> arrayList31 = w2Var2.f173594p;
                            ArrayList arrayList32 = new ArrayList(zhm.w.t(arrayList31, 10));
                            for (jel.f2 f2Var2 : arrayList31) {
                                arrayList32.add(new l2(tcl.n.c(f2Var2.f173443a), tcl.n.c(f2Var2.f173444b)));
                            }
                            jel.z1 z1Var2 = w2Var2.f173595q;
                            hcl.i2 i2Var2 = z1Var2 != null ? new hcl.i2(z1Var2.f173616b, z1Var2.f173615a) : null;
                            jel.l2 l2Var = w2Var2.f173596r;
                            r0Var2.b(new t2(str44, str45, str46, str47, h2Var, b2Var, z1Var, a2Var, c2Var, arrayList21, arrayList23, d2Var, arrayList24, arrayList26, k2Var, arrayList32, i2Var2, l2Var != null ? new o2(l2Var.f173497b, l2Var.f173496a) : null));
                        } else {
                            if (!(details instanceof jel.m1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dcl.p0 p0Var2 = oVar2.i;
                            jel.m1 m1Var = (jel.m1) details;
                            Intrinsics.checkNotNullParameter(m1Var, "<this>");
                            String str48 = m1Var.f173506a;
                            String str49 = m1Var.f173507b;
                            String str50 = m1Var.f173508c;
                            jel.n1 n1Var = m1Var.d;
                            if (n1Var != null) {
                                Intrinsics.checkNotNullParameter(n1Var, "<this>");
                                y1Var = new y1(n1Var.f173519a, n1Var.f173520b, n1Var.f173521c, n1Var.d, n1Var.e, n1Var.f);
                            } else {
                                y1Var = null;
                            }
                            p0Var2.b(new hcl.x1(str49, str48, str50, y1Var));
                        }
                        return Unit.f186387a;
                    case 4:
                        l params = (l) obj2;
                        jel.i1 recommendations = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
                        oVar2.f288017l.f(params.a(), recommendations);
                        return Unit.f186387a;
                    case 5:
                        jel.i1 recommendations2 = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter((l) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recommendations2, "recommendations");
                        dcl.w wVar2 = oVar2.f288013c;
                        Object obj7 = tcl.g.f269882a;
                        Intrinsics.checkNotNullParameter(recommendations2, "<this>");
                        String str51 = recommendations2.f173475a;
                        ArrayList<jel.z2> arrayList33 = recommendations2.f173476b;
                        ArrayList arrayList34 = new ArrayList(zhm.w.t(arrayList33, 10));
                        for (jel.z2 z2Var3 : arrayList33) {
                            Intrinsics.checkNotNullParameter(z2Var3, "<this>");
                            arrayList34.add(new z2(le.u1.g(z2Var3.d, tcl.g.f269883b), z2Var3.f173617a, z2Var3.f173618b, z2Var3.f173619c, z2Var3.e));
                        }
                        wVar2.b(new hcl.m0(str51, arrayList34));
                        return Unit.f186387a;
                    default:
                        String ref5 = (String) obj2;
                        jel.l1 targetMarket2 = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref5, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket2, "targetMarket");
                        oVar2.f288017l.f(o.f288009s + ref5, targetMarket2);
                        return Unit.f186387a;
                }
            }
        }, new Function1(this) { // from class: vdl.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287980b;

            {
                this.f287980b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:435:0x09b7  */
            /* JADX WARN: Removed duplicated region for block: B:443:0x09de  */
            /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r42) {
                /*
                    Method dump skipped, instruction units count: 3680
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vdl.i.invoke(java.lang.Object):java.lang.Object");
            }
        }, new Function2(this) { // from class: vdl.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287983b;

            {
                this.f287983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                y1 y1Var;
                b2 b2Var;
                z1 z1Var;
                a2 a2Var;
                c2 c2Var;
                f2 f2Var;
                k2 k2Var;
                Iterator it8;
                String str;
                n2 n2Var;
                dj0.d dVar;
                hcl.w wVar;
                hcl.y yVar;
                hcl.z zVar;
                hcl.u uVar;
                String str2;
                hcl.x xVar;
                hcl.v vVar;
                hcl.v vVar2;
                hcl.s sVar;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                x.a aVar;
                x.c cVar;
                x.b bVar;
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                ArrayList arrayList7;
                ArrayList arrayList8;
                ArrayList arrayList9;
                hcl.h hVar;
                hcl.c cVar2;
                hcl.o0 o0Var;
                hcl.b bVar2;
                ArrayList arrayList10;
                z2 z2Var;
                w2 w2Var;
                hcl.o oVar;
                hcl.n nVar;
                ArrayList arrayList11;
                ArrayList arrayList12;
                ArrayList arrayList13;
                ArrayList arrayList14;
                int i212 = i96;
                o oVar2 = this.f287983b;
                switch (i212) {
                    case 0:
                        String ref2 = (String) obj2;
                        jel.l1 targetMarket = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket, "targetMarket");
                        dcl.r rVar = oVar2.d;
                        Object obj4 = tcl.j.f269888a;
                        Intrinsics.checkNotNullParameter(targetMarket, "<this>");
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        rVar.b(new hcl.q0(ref2, le.u1.g(targetMarket, tcl.j.f269888a)));
                        return Unit.f186387a;
                    case 1:
                        String ref3 = (String) obj2;
                        nel.w summary = (nel.w) obj3;
                        Intrinsics.checkNotNullParameter(ref3, "ref");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        oVar2.f288017l.f(o.f288010t + ref3, summary);
                        return Unit.f186387a;
                    case 2:
                        String ref4 = (String) obj2;
                        jel.c instrumentDetails = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter(ref4, "ref");
                        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
                        oVar2.f288017l.f(ref4, instrumentDetails);
                        return Unit.f186387a;
                    case 3:
                        jel.c details = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(details, "details");
                        if (details instanceof jel.q) {
                            dcl.g gVar = oVar2.e;
                            jel.q qVar = (jel.q) details;
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            String str3 = qVar.f173541b;
                            String str4 = qVar.f173540a;
                            jel.s sVar2 = qVar.e;
                            if (sVar2 != null) {
                                dj0.d dVar2 = sVar2.f173561a;
                                jo3.b bVarA = dVar2 != null ? hx7.a.A(dVar2) : null;
                                dj0.d dVar3 = sVar2.f173562b;
                                oVar = new hcl.o(bVarA, dVar3 != null ? hx7.a.A(dVar3) : null, sVar2.f173563c, sVar2.d, sVar2.e, sVar2.f);
                            } else {
                                oVar = null;
                            }
                            jel.r rVar2 = qVar.f;
                            if (rVar2 != null) {
                                List list = rVar2.f173551a;
                                if (list != null) {
                                    arrayList12 = new ArrayList();
                                    Iterator it9 = list.iterator();
                                    while (it9.hasNext()) {
                                        hcl.a aVarV = zh9.u0.V((jel.p) it9.next());
                                        hcl.l lVar = aVarV instanceof hcl.l ? (hcl.l) aVarV : null;
                                        if (lVar != null) {
                                            arrayList12.add(lVar);
                                        }
                                    }
                                } else {
                                    arrayList12 = null;
                                }
                                List list2 = rVar2.f173552b;
                                if (list2 != null) {
                                    arrayList13 = new ArrayList();
                                    Iterator it10 = list2.iterator();
                                    while (it10.hasNext()) {
                                        hcl.a aVarV2 = zh9.u0.V((b3) it10.next());
                                        hcl.b3 b3Var = aVarV2 instanceof hcl.b3 ? (hcl.b3) aVarV2 : null;
                                        if (b3Var != null) {
                                            arrayList13.add(b3Var);
                                        }
                                    }
                                } else {
                                    arrayList13 = null;
                                }
                                List list3 = rVar2.f173553c;
                                if (list3 != null) {
                                    arrayList14 = new ArrayList();
                                    Iterator it11 = list3.iterator();
                                    while (it11.hasNext()) {
                                        hcl.a aVarV3 = zh9.u0.V((jel.g1) it11.next());
                                        hcl.h0 h0Var = aVarV3 instanceof hcl.h0 ? (hcl.h0) aVarV3 : null;
                                        if (h0Var != null) {
                                            arrayList14.add(h0Var);
                                        }
                                    }
                                } else {
                                    arrayList14 = null;
                                }
                                nVar = new hcl.n(arrayList12, arrayList13, arrayList14);
                            } else {
                                nVar = null;
                            }
                            String str5 = qVar.f173542c;
                            String str6 = qVar.d;
                            String str7 = qVar.f173543g;
                            String str8 = qVar.f173544h;
                            List list4 = qVar.i;
                            if (list4 != null) {
                                List<jel.k1> list5 = list4;
                                ArrayList arrayList15 = new ArrayList(zhm.w.t(list5, 10));
                                for (jel.k1 k1Var : list5) {
                                    Intrinsics.checkNotNullParameter(k1Var, "<this>");
                                    arrayList15.add(new hcl.p0(k1Var.f173490a, k1Var.f173491b));
                                }
                                arrayList11 = arrayList15;
                            } else {
                                arrayList11 = null;
                            }
                            gVar.b(new hcl.m(str3, str4, str5, str6, oVar, nVar, str7, str8, arrayList11));
                        } else if (details instanceof jel.h1) {
                            dcl.i0 i0Var = oVar2.f288012b;
                            jel.h1 h1Var = (jel.h1) details;
                            Object obj5 = tcl.g.f269882a;
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            String str9 = h1Var.f173461a;
                            String str10 = h1Var.f173462b;
                            jel.j1 j1Var = h1Var.e;
                            if (j1Var != null) {
                                Intrinsics.checkNotNullParameter(j1Var, "<this>");
                                dj0.d dVar4 = j1Var.f173485a;
                                jo3.b bVarA2 = dVar4 != null ? hx7.a.A(dVar4) : null;
                                Double d = j1Var.f173486b;
                                Double d5 = j1Var.f173487c;
                                dj0.d dVar5 = j1Var.d;
                                jo3.b bVarA3 = dVar5 != null ? hx7.a.A(dVar5) : null;
                                dj0.d dVar6 = j1Var.e;
                                jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                                dj0.d dVar7 = j1Var.f;
                                o0Var = new hcl.o0(bVarA2, d, d5, bVarA3, bVarA4, dVar7 != null ? hx7.a.A(dVar7) : null, j1Var.f173488g, j1Var.f173489h, j1Var.i);
                            } else {
                                o0Var = null;
                            }
                            String str11 = h1Var.f173463c;
                            String str12 = h1Var.d;
                            String strH = le.u1.h(h1Var.f, tcl.g.f269882a);
                            if (strH == null) {
                                strH = "";
                            }
                            String str13 = strH;
                            String strB = tbl.a.b(h1Var.f173465h);
                            jel.b bVar3 = h1Var.f173464g;
                            if (bVar3 != null) {
                                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                                jel.z2 z2Var2 = bVar3.f173409a;
                                if (z2Var2 != null) {
                                    Intrinsics.checkNotNullParameter(z2Var2, "<this>");
                                    z2Var = new z2(le.u1.g(z2Var2.d, tcl.g.f269883b), z2Var2.f173617a, z2Var2.f173618b, z2Var2.f173619c, z2Var2.e);
                                } else {
                                    z2Var = null;
                                }
                                x2 x2Var = bVar3.f173410b;
                                if (x2Var != null) {
                                    Intrinsics.checkNotNullParameter(x2Var, "<this>");
                                    w2Var = new w2(hx7.a.A(x2Var.f173604a), hx7.a.A(x2Var.f173605b), hx7.a.A(x2Var.f173606c), x2Var.d, x2Var.e);
                                } else {
                                    w2Var = null;
                                }
                                bVar2 = new hcl.b(z2Var, w2Var);
                            } else {
                                bVar2 = null;
                            }
                            List list6 = h1Var.i;
                            if (list6 != null) {
                                List<jel.k1> list7 = list6;
                                ArrayList arrayList16 = new ArrayList(zhm.w.t(list7, 10));
                                for (jel.k1 k1Var2 : list7) {
                                    Intrinsics.checkNotNullParameter(k1Var2, "<this>");
                                    arrayList16.add(new hcl.p0(k1Var2.f173490a, k1Var2.f173491b));
                                }
                                arrayList10 = arrayList16;
                            } else {
                                arrayList10 = null;
                            }
                            i0Var.b(new hcl.i0(str10, str9, str11, str12, o0Var, str13, strB, bVar2, arrayList10));
                        } else if (details instanceof jel.m) {
                            dcl.a aVar2 = oVar2.f;
                            jel.m mVar = (jel.m) details;
                            Object obj6 = tcl.b.f269876a;
                            Intrinsics.checkNotNullParameter(mVar, "<this>");
                            String str14 = mVar.f173499b;
                            String str15 = mVar.f173498a;
                            String str16 = mVar.f173500c;
                            jel.h hVar2 = mVar.d;
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            LocalDate localDate = hVar2.f173452a;
                            dj0.d dVar8 = hVar2.f173453b;
                            jo3.b bVarA5 = dVar8 != null ? hx7.a.A(dVar8) : null;
                            LocalDate localDate2 = hVar2.f173454c;
                            dj0.d dVar9 = hVar2.d;
                            jo3.b bVarA6 = dVar9 != null ? hx7.a.A(dVar9) : null;
                            dj0.d dVar10 = hVar2.e;
                            hcl.e eVar = new hcl.e(localDate, bVarA5, localDate2, bVarA6, dVar10 != null ? hx7.a.A(dVar10) : null);
                            jel.i iVar = mVar.e;
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            hcl.f fVar = new hcl.f(iVar.f173469a, iVar.f173470b, iVar.f173471c);
                            jel.e eVar2 = mVar.f;
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            BigDecimal bigDecimal3 = eVar2.f173436a;
                            jel.g gVar2 = eVar2.f173437b;
                            String strH2 = gVar2 != null ? le.u1.h(gVar2, tcl.b.f269876a) : null;
                            LocalDate localDate3 = eVar2.f173438c;
                            jel.f fVar2 = eVar2.d;
                            hcl.d dVar11 = new hcl.d(bigDecimal3, strH2, localDate3, fVar2 != null ? le.u1.h(fVar2, tcl.b.f269877b) : null);
                            jel.j jVar = mVar.f173501g;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            ej0.b bVar4 = jVar.f173479a;
                            ko3.b bVarM = bVar4 != null ? cp5.c.M(bVar4) : null;
                            ej0.b bVar5 = jVar.f173480b;
                            ko3.b bVarM2 = bVar5 != null ? cp5.c.M(bVar5) : null;
                            ej0.b bVar6 = jVar.f173481c;
                            hcl.g gVar3 = new hcl.g(bVarM, bVarM2, bVar6 != null ? cp5.c.M(bVar6) : null, jVar.d, jVar.e);
                            jel.l lVar2 = mVar.f173502h;
                            if (lVar2 != null) {
                                Intrinsics.checkNotNullParameter(lVar2, "<this>");
                                int i222 = lVar2.f173493a;
                                yel.b bVar7 = lVar2.f173494b;
                                hVar = new hcl.h(i222, bVar7 != null ? xcl.a.c(bVar7) : null, lVar2.f173495c);
                            } else {
                                hVar = null;
                            }
                            jel.d dVar12 = mVar.i;
                            if (dVar12 != null) {
                                Intrinsics.checkNotNullParameter(dVar12, "<this>");
                                boolean z = dVar12.f173427a;
                                LocalDate localDate4 = dVar12.f173428b;
                                dj0.d dVar13 = dVar12.f173429c;
                                cVar2 = new hcl.c(z, localDate4, dVar13 != null ? hx7.a.A(dVar13) : null, dVar12.d);
                            } else {
                                cVar2 = null;
                            }
                            aVar2.b(new hcl.i(str14, str15, str16, eVar, fVar, dVar11, gVar3, hVar, cVar2));
                        } else if (details instanceof jel.n) {
                            dcl.e eVar3 = oVar2.f288014g;
                            jel.n nVar2 = (jel.n) details;
                            Intrinsics.checkNotNullParameter(nVar2, "<this>");
                            eVar3.b(new hcl.k(nVar2.f173513b, nVar2.f173512a, nVar2.f173514c, nVar2.d, nVar2.e));
                        } else if (details instanceof jel.b0) {
                            dcl.k kVar = oVar2.f288015h;
                            jel.b0 b0Var = (jel.b0) details;
                            Intrinsics.checkNotNullParameter(b0Var, "<this>");
                            String str17 = b0Var.f173411a;
                            String str18 = b0Var.f173412b;
                            String str19 = b0Var.f173413c;
                            jel.h0 h0Var2 = b0Var.d;
                            if (h0Var2 != null) {
                                Intrinsics.checkNotNullParameter(h0Var2, "<this>");
                                jel.k0 k0Var = h0Var2.f173455a;
                                String strName = k0Var != null ? k0Var.name() : null;
                                String str20 = h0Var2.f173456b;
                                String str21 = h0Var2.f173457c;
                                LocalDate localDate5 = h0Var2.d;
                                List list8 = h0Var2.e;
                                if (list8 != null) {
                                    List<jel.g0> list9 = list8;
                                    ArrayList arrayList17 = new ArrayList(zhm.w.t(list9, 10));
                                    for (jel.g0 g0Var : list9) {
                                        Intrinsics.checkNotNullParameter(g0Var, "<this>");
                                        arrayList17.add(new w.a(g0Var.f173445a, g0Var.f173446b, g0Var.f173447c));
                                    }
                                    arrayList9 = arrayList17;
                                } else {
                                    arrayList9 = null;
                                }
                                dj0.d dVar14 = h0Var2.f;
                                jo3.b bVarA7 = dVar14 != null ? hx7.a.A(dVar14) : null;
                                jel.e1 e1Var = h0Var2.f173458g;
                                String strName2 = e1Var != null ? e1Var.name() : null;
                                jel.a0 a0Var = h0Var2.f173459h;
                                String strName3 = a0Var != null ? a0Var.name() : null;
                                jel.y yVar2 = h0Var2.i;
                                wVar = new hcl.w(strName, str20, str21, localDate5, arrayList9, bVarA7, strName2, strName3, yVar2 != null ? yVar2.name() : null, h0Var2.f173460j);
                            } else {
                                wVar = null;
                            }
                            jel.m0 m0Var = b0Var.e;
                            if (m0Var != null) {
                                Intrinsics.checkNotNullParameter(m0Var, "<this>");
                                String str22 = m0Var.f173503a;
                                String str23 = m0Var.f173504b;
                                dj0.d dVar15 = m0Var.f173505c;
                                jo3.b bVarA8 = dVar15 != null ? hx7.a.A(dVar15) : null;
                                LocalDate localDate6 = m0Var.d;
                                List list10 = m0Var.e;
                                if (list10 != null) {
                                    List list11 = list10;
                                    ArrayList arrayList18 = new ArrayList(zhm.w.t(list11, 10));
                                    Iterator it12 = list11.iterator();
                                    while (it12.hasNext()) {
                                        jel.z zVar2 = (jel.z) it12.next();
                                        Intrinsics.checkNotNullParameter(zVar2, "<this>");
                                        arrayList18.add(new y.a(zVar2.f173612a, zVar2.f173613b, zVar2.f173614c, zVar2.d));
                                        it12 = it12;
                                        localDate6 = localDate6;
                                    }
                                    arrayList8 = arrayList18;
                                } else {
                                    arrayList8 = null;
                                }
                                yVar = new hcl.y(str22, str23, bVarA8, localDate6, arrayList8);
                            } else {
                                yVar = null;
                            }
                            jel.n0 n0Var = b0Var.f;
                            if (n0Var != null) {
                                Intrinsics.checkNotNullParameter(n0Var, "<this>");
                                BigDecimal bigDecimal4 = n0Var.f173515a;
                                BigDecimal bigDecimal5 = n0Var.f173516b;
                                BigDecimal bigDecimal6 = n0Var.f173517c;
                                BigDecimal bigDecimal7 = n0Var.d;
                                BigDecimal bigDecimal8 = n0Var.e;
                                Integer num = n0Var.f;
                                List list12 = n0Var.f173518g;
                                if (list12 != null) {
                                    List list13 = list12;
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    ArrayList arrayList19 = new ArrayList(zhm.w.t(list13, 10));
                                    Iterator it13 = list13.iterator();
                                    while (it13.hasNext()) {
                                        jel.p0 p0Var = (jel.p0) it13.next();
                                        Iterator it14 = it13;
                                        jel.q0 q0Var = p0Var.f173532a;
                                        arrayList19.add(new z.a(q0Var != null ? q0Var.name() : null, p0Var.f173533b));
                                        it13 = it14;
                                    }
                                    arrayList7 = arrayList19;
                                } else {
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    arrayList7 = null;
                                }
                                zVar = new hcl.z(bigDecimal4, bigDecimal5, bigDecimal, bigDecimal2, bigDecimal8, num, arrayList7);
                            } else {
                                zVar = null;
                            }
                            jel.c0 c0Var = b0Var.f173414g;
                            if (c0Var != null) {
                                Intrinsics.checkNotNullParameter(c0Var, "<this>");
                                uVar = new hcl.u(c0Var.f173422a, c0Var.f173423b, c0Var.f173424c, c0Var.d, c0Var.e, c0Var.f);
                            } else {
                                uVar = null;
                            }
                            jel.j0 j0Var = b0Var.f173415h;
                            if (j0Var != null) {
                                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                                jel.o0 o0Var2 = j0Var.f173482a;
                                if (o0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(o0Var2, "<this>");
                                    aVar = new x.a(o0Var2.f173525a, o0Var2.f173526b);
                                } else {
                                    aVar = null;
                                }
                                jel.d1 d1Var = j0Var.f173483b;
                                if (d1Var != null) {
                                    Intrinsics.checkNotNullParameter(d1Var, "<this>");
                                    jel.f0 f0Var = d1Var.f173433a;
                                    cVar = new x.c(f0Var != null ? f0Var.name() : null);
                                } else {
                                    cVar = null;
                                }
                                jel.r0 r0Var = j0Var.f173484c;
                                if (r0Var != null) {
                                    Intrinsics.checkNotNullParameter(r0Var, "<this>");
                                    jel.f0 f0Var2 = r0Var.f173554a;
                                    str2 = str18;
                                    bVar = new x.b(f0Var2 != null ? f0Var2.name() : null, r0Var.f173555b, r0Var.f173556c);
                                } else {
                                    str2 = str18;
                                    bVar = null;
                                }
                                xVar = new hcl.x(aVar, cVar, bVar);
                            } else {
                                str2 = str18;
                                xVar = null;
                            }
                            jel.d0 d0Var = b0Var.i;
                            if (d0Var != null) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                List list14 = d0Var.f173430a;
                                if (list14 != null) {
                                    arrayList3 = new ArrayList();
                                    Iterator it15 = list14.iterator();
                                    while (it15.hasNext()) {
                                        hcl.q qVarC = tcl.d.c((jel.x0) it15.next());
                                        hcl.d0 d0Var2 = qVarC instanceof hcl.d0 ? (hcl.d0) qVarC : null;
                                        if (d0Var2 != null) {
                                            arrayList3.add(d0Var2);
                                        }
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                List list15 = d0Var.f173431b;
                                if (list15 != null) {
                                    arrayList4 = new ArrayList();
                                    Iterator it16 = list15.iterator();
                                    while (it16.hasNext()) {
                                        hcl.q qVarC2 = tcl.d.c((jel.v0) it16.next());
                                        hcl.b0 b0Var2 = qVarC2 instanceof hcl.b0 ? (hcl.b0) qVarC2 : null;
                                        if (b0Var2 != null) {
                                            arrayList4.add(b0Var2);
                                        }
                                    }
                                } else {
                                    arrayList4 = null;
                                }
                                List list16 = d0Var.f173432c;
                                if (list16 != null) {
                                    arrayList5 = new ArrayList();
                                    Iterator it17 = list16.iterator();
                                    while (it17.hasNext()) {
                                        hcl.q qVarC3 = tcl.d.c((jel.t0) it17.next());
                                        Iterator it18 = it17;
                                        hcl.a0 a0Var2 = qVarC3 instanceof hcl.a0 ? (hcl.a0) qVarC3 : null;
                                        if (a0Var2 != null) {
                                            arrayList5.add(a0Var2);
                                        }
                                        it17 = it18;
                                    }
                                } else {
                                    arrayList5 = null;
                                }
                                List list17 = d0Var.d;
                                if (list17 != null) {
                                    arrayList6 = new ArrayList();
                                    Iterator it19 = list17.iterator();
                                    while (it19.hasNext()) {
                                        hcl.q qVarC4 = tcl.d.c((jel.u) it19.next());
                                        Iterator it20 = it19;
                                        hcl.r rVar3 = qVarC4 instanceof hcl.r ? (hcl.r) qVarC4 : null;
                                        if (rVar3 != null) {
                                            arrayList6.add(rVar3);
                                        }
                                        it19 = it20;
                                    }
                                } else {
                                    arrayList6 = null;
                                }
                                vVar = new hcl.v(arrayList3, arrayList4, arrayList5, arrayList6);
                            } else {
                                vVar = null;
                            }
                            jel.x xVar2 = b0Var.f173416j;
                            if (xVar2 != null) {
                                Intrinsics.checkNotNullParameter(xVar2, "<this>");
                                List list18 = xVar2.f173597a;
                                if (list18 != null) {
                                    List<jel.i0> list19 = list18;
                                    arrayList = new ArrayList(zhm.w.t(list19, 10));
                                    for (jel.i0 i0Var2 : list19) {
                                        Intrinsics.checkNotNullParameter(i0Var2, "<this>");
                                        String str24 = i0Var2.f173472a;
                                        BigDecimal bigDecimal9 = i0Var2.f173473b;
                                        hcl.v vVar3 = vVar;
                                        String str25 = i0Var2.f173474c;
                                        String str26 = i0Var2.d;
                                        xi0.b bVar8 = i0Var2.e;
                                        arrayList.add(new s.a(str24, str25, str26, bVar8 != null ? bVar8.f306286a : null, bigDecimal9));
                                        vVar = vVar3;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                vVar2 = vVar;
                                List list20 = xVar2.f173598b;
                                if (list20 != null) {
                                    List list21 = list20;
                                    arrayList2 = new ArrayList(zhm.w.t(list21, 10));
                                    for (Iterator it21 = list21.iterator(); it21.hasNext(); it21 = it21) {
                                        jel.f1 f1Var = (jel.f1) it21.next();
                                        Intrinsics.checkNotNullParameter(f1Var, "<this>");
                                        arrayList2.add(new s.b(f1Var.f173439a, f1Var.f173440b, f1Var.d, f1Var.e, f1Var.f, f1Var.f173442g, f1Var.f173441c));
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                sVar = new hcl.s(arrayList, arrayList2);
                            } else {
                                vVar2 = vVar;
                                sVar = null;
                            }
                            kVar.b(new hcl.t(str2, str17, str19, wVar, yVar, zVar, uVar, xVar, vVar2, sVar));
                        } else if (details instanceof jel.w2) {
                            dcl.r0 r0Var2 = oVar2.f288016j;
                            jel.w2 w2Var2 = (jel.w2) details;
                            Intrinsics.checkNotNullParameter(w2Var2, "<this>");
                            String str27 = w2Var2.f173586b;
                            String str28 = w2Var2.f173585a;
                            String str29 = w2Var2.f173587c;
                            String str30 = w2Var2.d;
                            jel.y1 y1Var2 = w2Var2.e;
                            h2 h2Var = new h2(y1Var2.f173609a, y1Var2.f173610b, y1Var2.f173611c, y1Var2.d, y1Var2.e, y1Var2.f);
                            jel.r1 r1Var = w2Var2.f;
                            if (r1Var != null) {
                                BigDecimal bigDecimal10 = r1Var.f173557a;
                                jel.u1 u1Var = r1Var.f173558b;
                                String strName4 = u1Var != null ? u1Var.name() : null;
                                jel.s1 s1Var = r1Var.f173559c;
                                String strName5 = s1Var != null ? s1Var.name() : null;
                                BigDecimal bigDecimal11 = r1Var.d;
                                LocalDate localDate7 = r1Var.e;
                                e2 e2Var = r1Var.f;
                                b2Var = new b2(bigDecimal10, strName4, strName5, bigDecimal11, localDate7, e2Var != null ? e2Var.name() : null);
                            } else {
                                b2Var = null;
                            }
                            jel.p1 p1Var = w2Var2.f173588g;
                            if (p1Var != null) {
                                BigDecimal bigDecimal12 = p1Var.f173534a;
                                BigDecimal bigDecimal13 = p1Var.f173535b;
                                jel.u1 u1Var2 = p1Var.f173536c;
                                String strName6 = u1Var2 != null ? u1Var2.name() : null;
                                BigDecimal bigDecimal14 = p1Var.d;
                                LocalDate localDate8 = p1Var.e;
                                e2 e2Var2 = p1Var.f;
                                z1Var = new z1(bigDecimal12, bigDecimal13, strName6, bigDecimal14, localDate8, e2Var2 != null ? e2Var2.name() : null);
                            } else {
                                z1Var = null;
                            }
                            jel.q1 q1Var = w2Var2.f173589h;
                            if (q1Var != null) {
                                BigDecimal bigDecimal15 = q1Var.f173545a;
                                BigDecimal bigDecimal16 = q1Var.f173546b;
                                BigDecimal bigDecimal17 = q1Var.f173547c;
                                e2 e2Var3 = q1Var.d;
                                a2Var = new a2(bigDecimal15, bigDecimal16, bigDecimal17, e2Var3 != null ? e2Var3.name() : null);
                            } else {
                                a2Var = null;
                            }
                            jel.t1 t1Var = w2Var2.i;
                            if (t1Var != null) {
                                BigDecimal bigDecimal18 = t1Var.f173566a;
                                BigDecimal bigDecimal19 = t1Var.f173567b;
                                BigDecimal bigDecimal20 = t1Var.f173568c;
                                BigDecimal bigDecimal21 = t1Var.d;
                                e2 e2Var4 = t1Var.e;
                                c2Var = new c2(e2Var4 != null ? e2Var4.name() : null, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21);
                            } else {
                                c2Var = null;
                            }
                            ArrayList<x1> arrayList20 = w2Var2.f173590j;
                            ArrayList arrayList21 = new ArrayList(zhm.w.t(arrayList20, 10));
                            for (x1 x1Var : arrayList20) {
                                arrayList21.add(new g2(x1Var.f173602a, x1Var.f173603b));
                            }
                            ArrayList<v2> arrayList22 = w2Var2.k;
                            ArrayList arrayList23 = new ArrayList(zhm.w.t(arrayList22, 10));
                            for (v2 v2Var : arrayList22) {
                                String str31 = v2Var.f173579a;
                                String str32 = v2Var.f173580b;
                                String str33 = v2Var.f173581c;
                                jel.g2 g2Var = v2Var.d;
                                jo3.b bVarA9 = (g2Var == null || (dVar = g2Var.f173451a) == null) ? null : hx7.a.A(dVar);
                                ej0.b bVar9 = v2Var.e;
                                arrayList23.add(new s2(str31, str32, str33, bVarA9, bVar9 != null ? cp5.c.M(bVar9) : null));
                            }
                            jel.w1 w1Var = w2Var2.f173591l;
                            String str34 = w1Var.f173582a;
                            String str35 = w1Var.f173583b;
                            jel.k2 k2Var2 = w1Var.f173584c;
                            if (k2Var2 != null) {
                                yel.b bVar10 = k2Var2.f173492a;
                                f2Var = new f2(bVar10 != null ? xcl.a.c(bVar10) : null);
                            } else {
                                f2Var = null;
                            }
                            jel.v1 v1Var = w1Var.d;
                            d2 d2Var = new d2(str34, str35, f2Var, v1Var != null ? new hcl.e2(v1Var.f173578b, v1Var.f173577a) : null);
                            List list22 = w2Var2.f173592m;
                            ArrayList arrayList24 = new ArrayList(zhm.w.t(list22, 10));
                            Iterator it22 = list22.iterator();
                            while (it22.hasNext()) {
                                arrayList24.add(((jel.o1) it22.next()).name());
                            }
                            ArrayList arrayList25 = w2Var2.f173593n;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            Iterator it23 = arrayList25.iterator();
                            while (it23.hasNext()) {
                                jel.a2 a2Var2 = (jel.a2) it23.next();
                                String str36 = a2Var2.f173405a;
                                String str37 = a2Var2.f173406b;
                                String str38 = str27;
                                String str39 = a2Var2.f173407c;
                                ArrayList arrayList27 = a2Var2.d;
                                String str40 = str28;
                                String str41 = str29;
                                String str42 = str30;
                                ArrayList arrayList28 = new ArrayList(zhm.w.t(arrayList27, 10));
                                Iterator it24 = arrayList27.iterator();
                                while (it24.hasNext()) {
                                    jel.h2 h2Var2 = (jel.h2) it24.next();
                                    BigDecimal bigDecimal22 = h2Var2.f173466a;
                                    Iterator it25 = it24;
                                    BigDecimal bigDecimal23 = h2Var2.f173467b;
                                    String strName7 = h2Var2.f173468c.name();
                                    String str43 = h2Var2.d;
                                    i2 i2Var = h2Var2.e;
                                    if (i2Var != null) {
                                        str = str43;
                                        it8 = it23;
                                        n2Var = new n2(i2Var.f173477a, i2Var.f173478b);
                                    } else {
                                        it8 = it23;
                                        str = str43;
                                        n2Var = null;
                                    }
                                    arrayList28.add(new m2(bigDecimal22, bigDecimal23, strName7, str, n2Var));
                                    it24 = it25;
                                    it23 = it8;
                                }
                                arrayList26.add(new j2(str36, str37, str39, arrayList28));
                                str27 = str38;
                                str28 = str40;
                                str29 = str41;
                                str30 = str42;
                            }
                            String str44 = str27;
                            String str45 = str28;
                            String str46 = str29;
                            String str47 = str30;
                            jel.d2 d2Var2 = w2Var2.o;
                            if (d2Var2 != null) {
                                ArrayList<jel.b2> arrayList29 = d2Var2.f173434a;
                                ArrayList arrayList30 = new ArrayList(zhm.w.t(arrayList29, 10));
                                for (jel.b2 b2Var2 : arrayList29) {
                                    BigDecimal bigDecimal24 = b2Var2.f173417a;
                                    BigDecimal bigDecimal25 = b2Var2.f173418b;
                                    boolean z3 = b2Var2.f173419c;
                                    jel.c2 c2Var2 = b2Var2.d;
                                    arrayList30.add(new k2.a(bigDecimal24, bigDecimal25, z3, c2Var2 != null ? c2Var2.name() : null));
                                }
                                k2Var = new k2(arrayList30, d2Var2.f173435b);
                            } else {
                                k2Var = null;
                            }
                            ArrayList<jel.f2> arrayList31 = w2Var2.f173594p;
                            ArrayList arrayList32 = new ArrayList(zhm.w.t(arrayList31, 10));
                            for (jel.f2 f2Var2 : arrayList31) {
                                arrayList32.add(new l2(tcl.n.c(f2Var2.f173443a), tcl.n.c(f2Var2.f173444b)));
                            }
                            jel.z1 z1Var2 = w2Var2.f173595q;
                            hcl.i2 i2Var2 = z1Var2 != null ? new hcl.i2(z1Var2.f173616b, z1Var2.f173615a) : null;
                            jel.l2 l2Var = w2Var2.f173596r;
                            r0Var2.b(new t2(str44, str45, str46, str47, h2Var, b2Var, z1Var, a2Var, c2Var, arrayList21, arrayList23, d2Var, arrayList24, arrayList26, k2Var, arrayList32, i2Var2, l2Var != null ? new o2(l2Var.f173497b, l2Var.f173496a) : null));
                        } else {
                            if (!(details instanceof jel.m1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dcl.p0 p0Var2 = oVar2.i;
                            jel.m1 m1Var = (jel.m1) details;
                            Intrinsics.checkNotNullParameter(m1Var, "<this>");
                            String str48 = m1Var.f173506a;
                            String str49 = m1Var.f173507b;
                            String str50 = m1Var.f173508c;
                            jel.n1 n1Var = m1Var.d;
                            if (n1Var != null) {
                                Intrinsics.checkNotNullParameter(n1Var, "<this>");
                                y1Var = new y1(n1Var.f173519a, n1Var.f173520b, n1Var.f173521c, n1Var.d, n1Var.e, n1Var.f);
                            } else {
                                y1Var = null;
                            }
                            p0Var2.b(new hcl.x1(str49, str48, str50, y1Var));
                        }
                        return Unit.f186387a;
                    case 4:
                        l params = (l) obj2;
                        jel.i1 recommendations = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
                        oVar2.f288017l.f(params.a(), recommendations);
                        return Unit.f186387a;
                    case 5:
                        jel.i1 recommendations2 = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter((l) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recommendations2, "recommendations");
                        dcl.w wVar2 = oVar2.f288013c;
                        Object obj7 = tcl.g.f269882a;
                        Intrinsics.checkNotNullParameter(recommendations2, "<this>");
                        String str51 = recommendations2.f173475a;
                        ArrayList<jel.z2> arrayList33 = recommendations2.f173476b;
                        ArrayList arrayList34 = new ArrayList(zhm.w.t(arrayList33, 10));
                        for (jel.z2 z2Var3 : arrayList33) {
                            Intrinsics.checkNotNullParameter(z2Var3, "<this>");
                            arrayList34.add(new z2(le.u1.g(z2Var3.d, tcl.g.f269883b), z2Var3.f173617a, z2Var3.f173618b, z2Var3.f173619c, z2Var3.e));
                        }
                        wVar2.b(new hcl.m0(str51, arrayList34));
                        return Unit.f186387a;
                    default:
                        String ref5 = (String) obj2;
                        jel.l1 targetMarket2 = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref5, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket2, "targetMarket");
                        oVar2.f288017l.f(o.f288009s + ref5, targetMarket2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        Continuation continuation = null;
        new x4l.c(new m(this, continuation, 0), new vch.h0(this, 12), new v78.d(this, 24), new n(this, continuation, 0), new m(this, continuation, 1));
        final int i99 = 1;
        final int i100 = 1;
        x4l.c dod2 = new x4l.c(new uec.d(this, connectivityRepository, continuation, 25), new Function1(this) { // from class: vdl.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287980b;

            {
                this.f287980b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:435:0x09b7  */
            /* JADX WARN: Removed duplicated region for block: B:443:0x09de  */
            /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r42) {
                /*
                    Method dump skipped, instruction units count: 3680
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: vdl.i.invoke(java.lang.Object):java.lang.Object");
            }
        }, new Function2(this) { // from class: vdl.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f287983b;

            {
                this.f287983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                y1 y1Var;
                b2 b2Var;
                z1 z1Var;
                a2 a2Var;
                c2 c2Var;
                f2 f2Var;
                k2 k2Var;
                Iterator it8;
                String str;
                n2 n2Var;
                dj0.d dVar;
                hcl.w wVar;
                hcl.y yVar;
                hcl.z zVar;
                hcl.u uVar;
                String str2;
                hcl.x xVar;
                hcl.v vVar;
                hcl.v vVar2;
                hcl.s sVar;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                x.a aVar;
                x.c cVar;
                x.b bVar;
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                ArrayList arrayList7;
                ArrayList arrayList8;
                ArrayList arrayList9;
                hcl.h hVar;
                hcl.c cVar2;
                hcl.o0 o0Var;
                hcl.b bVar2;
                ArrayList arrayList10;
                z2 z2Var;
                w2 w2Var;
                hcl.o oVar;
                hcl.n nVar;
                ArrayList arrayList11;
                ArrayList arrayList12;
                ArrayList arrayList13;
                ArrayList arrayList14;
                int i212 = i100;
                o oVar2 = this.f287983b;
                switch (i212) {
                    case 0:
                        String ref2 = (String) obj2;
                        jel.l1 targetMarket = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket, "targetMarket");
                        dcl.r rVar = oVar2.d;
                        Object obj4 = tcl.j.f269888a;
                        Intrinsics.checkNotNullParameter(targetMarket, "<this>");
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        rVar.b(new hcl.q0(ref2, le.u1.g(targetMarket, tcl.j.f269888a)));
                        return Unit.f186387a;
                    case 1:
                        String ref3 = (String) obj2;
                        nel.w summary = (nel.w) obj3;
                        Intrinsics.checkNotNullParameter(ref3, "ref");
                        Intrinsics.checkNotNullParameter(summary, "summary");
                        oVar2.f288017l.f(o.f288010t + ref3, summary);
                        return Unit.f186387a;
                    case 2:
                        String ref4 = (String) obj2;
                        jel.c instrumentDetails = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter(ref4, "ref");
                        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
                        oVar2.f288017l.f(ref4, instrumentDetails);
                        return Unit.f186387a;
                    case 3:
                        jel.c details = (jel.c) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(details, "details");
                        if (details instanceof jel.q) {
                            dcl.g gVar = oVar2.e;
                            jel.q qVar = (jel.q) details;
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            String str3 = qVar.f173541b;
                            String str4 = qVar.f173540a;
                            jel.s sVar2 = qVar.e;
                            if (sVar2 != null) {
                                dj0.d dVar2 = sVar2.f173561a;
                                jo3.b bVarA = dVar2 != null ? hx7.a.A(dVar2) : null;
                                dj0.d dVar3 = sVar2.f173562b;
                                oVar = new hcl.o(bVarA, dVar3 != null ? hx7.a.A(dVar3) : null, sVar2.f173563c, sVar2.d, sVar2.e, sVar2.f);
                            } else {
                                oVar = null;
                            }
                            jel.r rVar2 = qVar.f;
                            if (rVar2 != null) {
                                List list = rVar2.f173551a;
                                if (list != null) {
                                    arrayList12 = new ArrayList();
                                    Iterator it9 = list.iterator();
                                    while (it9.hasNext()) {
                                        hcl.a aVarV = zh9.u0.V((jel.p) it9.next());
                                        hcl.l lVar = aVarV instanceof hcl.l ? (hcl.l) aVarV : null;
                                        if (lVar != null) {
                                            arrayList12.add(lVar);
                                        }
                                    }
                                } else {
                                    arrayList12 = null;
                                }
                                List list2 = rVar2.f173552b;
                                if (list2 != null) {
                                    arrayList13 = new ArrayList();
                                    Iterator it10 = list2.iterator();
                                    while (it10.hasNext()) {
                                        hcl.a aVarV2 = zh9.u0.V((b3) it10.next());
                                        hcl.b3 b3Var = aVarV2 instanceof hcl.b3 ? (hcl.b3) aVarV2 : null;
                                        if (b3Var != null) {
                                            arrayList13.add(b3Var);
                                        }
                                    }
                                } else {
                                    arrayList13 = null;
                                }
                                List list3 = rVar2.f173553c;
                                if (list3 != null) {
                                    arrayList14 = new ArrayList();
                                    Iterator it11 = list3.iterator();
                                    while (it11.hasNext()) {
                                        hcl.a aVarV3 = zh9.u0.V((jel.g1) it11.next());
                                        hcl.h0 h0Var = aVarV3 instanceof hcl.h0 ? (hcl.h0) aVarV3 : null;
                                        if (h0Var != null) {
                                            arrayList14.add(h0Var);
                                        }
                                    }
                                } else {
                                    arrayList14 = null;
                                }
                                nVar = new hcl.n(arrayList12, arrayList13, arrayList14);
                            } else {
                                nVar = null;
                            }
                            String str5 = qVar.f173542c;
                            String str6 = qVar.d;
                            String str7 = qVar.f173543g;
                            String str8 = qVar.f173544h;
                            List list4 = qVar.i;
                            if (list4 != null) {
                                List<jel.k1> list5 = list4;
                                ArrayList arrayList15 = new ArrayList(zhm.w.t(list5, 10));
                                for (jel.k1 k1Var : list5) {
                                    Intrinsics.checkNotNullParameter(k1Var, "<this>");
                                    arrayList15.add(new hcl.p0(k1Var.f173490a, k1Var.f173491b));
                                }
                                arrayList11 = arrayList15;
                            } else {
                                arrayList11 = null;
                            }
                            gVar.b(new hcl.m(str3, str4, str5, str6, oVar, nVar, str7, str8, arrayList11));
                        } else if (details instanceof jel.h1) {
                            dcl.i0 i0Var = oVar2.f288012b;
                            jel.h1 h1Var = (jel.h1) details;
                            Object obj5 = tcl.g.f269882a;
                            Intrinsics.checkNotNullParameter(h1Var, "<this>");
                            String str9 = h1Var.f173461a;
                            String str10 = h1Var.f173462b;
                            jel.j1 j1Var = h1Var.e;
                            if (j1Var != null) {
                                Intrinsics.checkNotNullParameter(j1Var, "<this>");
                                dj0.d dVar4 = j1Var.f173485a;
                                jo3.b bVarA2 = dVar4 != null ? hx7.a.A(dVar4) : null;
                                Double d = j1Var.f173486b;
                                Double d5 = j1Var.f173487c;
                                dj0.d dVar5 = j1Var.d;
                                jo3.b bVarA3 = dVar5 != null ? hx7.a.A(dVar5) : null;
                                dj0.d dVar6 = j1Var.e;
                                jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                                dj0.d dVar7 = j1Var.f;
                                o0Var = new hcl.o0(bVarA2, d, d5, bVarA3, bVarA4, dVar7 != null ? hx7.a.A(dVar7) : null, j1Var.f173488g, j1Var.f173489h, j1Var.i);
                            } else {
                                o0Var = null;
                            }
                            String str11 = h1Var.f173463c;
                            String str12 = h1Var.d;
                            String strH = le.u1.h(h1Var.f, tcl.g.f269882a);
                            if (strH == null) {
                                strH = "";
                            }
                            String str13 = strH;
                            String strB = tbl.a.b(h1Var.f173465h);
                            jel.b bVar3 = h1Var.f173464g;
                            if (bVar3 != null) {
                                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                                jel.z2 z2Var2 = bVar3.f173409a;
                                if (z2Var2 != null) {
                                    Intrinsics.checkNotNullParameter(z2Var2, "<this>");
                                    z2Var = new z2(le.u1.g(z2Var2.d, tcl.g.f269883b), z2Var2.f173617a, z2Var2.f173618b, z2Var2.f173619c, z2Var2.e);
                                } else {
                                    z2Var = null;
                                }
                                x2 x2Var = bVar3.f173410b;
                                if (x2Var != null) {
                                    Intrinsics.checkNotNullParameter(x2Var, "<this>");
                                    w2Var = new w2(hx7.a.A(x2Var.f173604a), hx7.a.A(x2Var.f173605b), hx7.a.A(x2Var.f173606c), x2Var.d, x2Var.e);
                                } else {
                                    w2Var = null;
                                }
                                bVar2 = new hcl.b(z2Var, w2Var);
                            } else {
                                bVar2 = null;
                            }
                            List list6 = h1Var.i;
                            if (list6 != null) {
                                List<jel.k1> list7 = list6;
                                ArrayList arrayList16 = new ArrayList(zhm.w.t(list7, 10));
                                for (jel.k1 k1Var2 : list7) {
                                    Intrinsics.checkNotNullParameter(k1Var2, "<this>");
                                    arrayList16.add(new hcl.p0(k1Var2.f173490a, k1Var2.f173491b));
                                }
                                arrayList10 = arrayList16;
                            } else {
                                arrayList10 = null;
                            }
                            i0Var.b(new hcl.i0(str10, str9, str11, str12, o0Var, str13, strB, bVar2, arrayList10));
                        } else if (details instanceof jel.m) {
                            dcl.a aVar2 = oVar2.f;
                            jel.m mVar = (jel.m) details;
                            Object obj6 = tcl.b.f269876a;
                            Intrinsics.checkNotNullParameter(mVar, "<this>");
                            String str14 = mVar.f173499b;
                            String str15 = mVar.f173498a;
                            String str16 = mVar.f173500c;
                            jel.h hVar2 = mVar.d;
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            LocalDate localDate = hVar2.f173452a;
                            dj0.d dVar8 = hVar2.f173453b;
                            jo3.b bVarA5 = dVar8 != null ? hx7.a.A(dVar8) : null;
                            LocalDate localDate2 = hVar2.f173454c;
                            dj0.d dVar9 = hVar2.d;
                            jo3.b bVarA6 = dVar9 != null ? hx7.a.A(dVar9) : null;
                            dj0.d dVar10 = hVar2.e;
                            hcl.e eVar = new hcl.e(localDate, bVarA5, localDate2, bVarA6, dVar10 != null ? hx7.a.A(dVar10) : null);
                            jel.i iVar = mVar.e;
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            hcl.f fVar = new hcl.f(iVar.f173469a, iVar.f173470b, iVar.f173471c);
                            jel.e eVar2 = mVar.f;
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            BigDecimal bigDecimal3 = eVar2.f173436a;
                            jel.g gVar2 = eVar2.f173437b;
                            String strH2 = gVar2 != null ? le.u1.h(gVar2, tcl.b.f269876a) : null;
                            LocalDate localDate3 = eVar2.f173438c;
                            jel.f fVar2 = eVar2.d;
                            hcl.d dVar11 = new hcl.d(bigDecimal3, strH2, localDate3, fVar2 != null ? le.u1.h(fVar2, tcl.b.f269877b) : null);
                            jel.j jVar = mVar.f173501g;
                            Intrinsics.checkNotNullParameter(jVar, "<this>");
                            ej0.b bVar4 = jVar.f173479a;
                            ko3.b bVarM = bVar4 != null ? cp5.c.M(bVar4) : null;
                            ej0.b bVar5 = jVar.f173480b;
                            ko3.b bVarM2 = bVar5 != null ? cp5.c.M(bVar5) : null;
                            ej0.b bVar6 = jVar.f173481c;
                            hcl.g gVar3 = new hcl.g(bVarM, bVarM2, bVar6 != null ? cp5.c.M(bVar6) : null, jVar.d, jVar.e);
                            jel.l lVar2 = mVar.f173502h;
                            if (lVar2 != null) {
                                Intrinsics.checkNotNullParameter(lVar2, "<this>");
                                int i222 = lVar2.f173493a;
                                yel.b bVar7 = lVar2.f173494b;
                                hVar = new hcl.h(i222, bVar7 != null ? xcl.a.c(bVar7) : null, lVar2.f173495c);
                            } else {
                                hVar = null;
                            }
                            jel.d dVar12 = mVar.i;
                            if (dVar12 != null) {
                                Intrinsics.checkNotNullParameter(dVar12, "<this>");
                                boolean z = dVar12.f173427a;
                                LocalDate localDate4 = dVar12.f173428b;
                                dj0.d dVar13 = dVar12.f173429c;
                                cVar2 = new hcl.c(z, localDate4, dVar13 != null ? hx7.a.A(dVar13) : null, dVar12.d);
                            } else {
                                cVar2 = null;
                            }
                            aVar2.b(new hcl.i(str14, str15, str16, eVar, fVar, dVar11, gVar3, hVar, cVar2));
                        } else if (details instanceof jel.n) {
                            dcl.e eVar3 = oVar2.f288014g;
                            jel.n nVar2 = (jel.n) details;
                            Intrinsics.checkNotNullParameter(nVar2, "<this>");
                            eVar3.b(new hcl.k(nVar2.f173513b, nVar2.f173512a, nVar2.f173514c, nVar2.d, nVar2.e));
                        } else if (details instanceof jel.b0) {
                            dcl.k kVar = oVar2.f288015h;
                            jel.b0 b0Var = (jel.b0) details;
                            Intrinsics.checkNotNullParameter(b0Var, "<this>");
                            String str17 = b0Var.f173411a;
                            String str18 = b0Var.f173412b;
                            String str19 = b0Var.f173413c;
                            jel.h0 h0Var2 = b0Var.d;
                            if (h0Var2 != null) {
                                Intrinsics.checkNotNullParameter(h0Var2, "<this>");
                                jel.k0 k0Var = h0Var2.f173455a;
                                String strName = k0Var != null ? k0Var.name() : null;
                                String str20 = h0Var2.f173456b;
                                String str21 = h0Var2.f173457c;
                                LocalDate localDate5 = h0Var2.d;
                                List list8 = h0Var2.e;
                                if (list8 != null) {
                                    List<jel.g0> list9 = list8;
                                    ArrayList arrayList17 = new ArrayList(zhm.w.t(list9, 10));
                                    for (jel.g0 g0Var : list9) {
                                        Intrinsics.checkNotNullParameter(g0Var, "<this>");
                                        arrayList17.add(new w.a(g0Var.f173445a, g0Var.f173446b, g0Var.f173447c));
                                    }
                                    arrayList9 = arrayList17;
                                } else {
                                    arrayList9 = null;
                                }
                                dj0.d dVar14 = h0Var2.f;
                                jo3.b bVarA7 = dVar14 != null ? hx7.a.A(dVar14) : null;
                                jel.e1 e1Var = h0Var2.f173458g;
                                String strName2 = e1Var != null ? e1Var.name() : null;
                                jel.a0 a0Var = h0Var2.f173459h;
                                String strName3 = a0Var != null ? a0Var.name() : null;
                                jel.y yVar2 = h0Var2.i;
                                wVar = new hcl.w(strName, str20, str21, localDate5, arrayList9, bVarA7, strName2, strName3, yVar2 != null ? yVar2.name() : null, h0Var2.f173460j);
                            } else {
                                wVar = null;
                            }
                            jel.m0 m0Var = b0Var.e;
                            if (m0Var != null) {
                                Intrinsics.checkNotNullParameter(m0Var, "<this>");
                                String str22 = m0Var.f173503a;
                                String str23 = m0Var.f173504b;
                                dj0.d dVar15 = m0Var.f173505c;
                                jo3.b bVarA8 = dVar15 != null ? hx7.a.A(dVar15) : null;
                                LocalDate localDate6 = m0Var.d;
                                List list10 = m0Var.e;
                                if (list10 != null) {
                                    List list11 = list10;
                                    ArrayList arrayList18 = new ArrayList(zhm.w.t(list11, 10));
                                    Iterator it12 = list11.iterator();
                                    while (it12.hasNext()) {
                                        jel.z zVar2 = (jel.z) it12.next();
                                        Intrinsics.checkNotNullParameter(zVar2, "<this>");
                                        arrayList18.add(new y.a(zVar2.f173612a, zVar2.f173613b, zVar2.f173614c, zVar2.d));
                                        it12 = it12;
                                        localDate6 = localDate6;
                                    }
                                    arrayList8 = arrayList18;
                                } else {
                                    arrayList8 = null;
                                }
                                yVar = new hcl.y(str22, str23, bVarA8, localDate6, arrayList8);
                            } else {
                                yVar = null;
                            }
                            jel.n0 n0Var = b0Var.f;
                            if (n0Var != null) {
                                Intrinsics.checkNotNullParameter(n0Var, "<this>");
                                BigDecimal bigDecimal4 = n0Var.f173515a;
                                BigDecimal bigDecimal5 = n0Var.f173516b;
                                BigDecimal bigDecimal6 = n0Var.f173517c;
                                BigDecimal bigDecimal7 = n0Var.d;
                                BigDecimal bigDecimal8 = n0Var.e;
                                Integer num = n0Var.f;
                                List list12 = n0Var.f173518g;
                                if (list12 != null) {
                                    List list13 = list12;
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    ArrayList arrayList19 = new ArrayList(zhm.w.t(list13, 10));
                                    Iterator it13 = list13.iterator();
                                    while (it13.hasNext()) {
                                        jel.p0 p0Var = (jel.p0) it13.next();
                                        Iterator it14 = it13;
                                        jel.q0 q0Var = p0Var.f173532a;
                                        arrayList19.add(new z.a(q0Var != null ? q0Var.name() : null, p0Var.f173533b));
                                        it13 = it14;
                                    }
                                    arrayList7 = arrayList19;
                                } else {
                                    bigDecimal = bigDecimal6;
                                    bigDecimal2 = bigDecimal7;
                                    arrayList7 = null;
                                }
                                zVar = new hcl.z(bigDecimal4, bigDecimal5, bigDecimal, bigDecimal2, bigDecimal8, num, arrayList7);
                            } else {
                                zVar = null;
                            }
                            jel.c0 c0Var = b0Var.f173414g;
                            if (c0Var != null) {
                                Intrinsics.checkNotNullParameter(c0Var, "<this>");
                                uVar = new hcl.u(c0Var.f173422a, c0Var.f173423b, c0Var.f173424c, c0Var.d, c0Var.e, c0Var.f);
                            } else {
                                uVar = null;
                            }
                            jel.j0 j0Var = b0Var.f173415h;
                            if (j0Var != null) {
                                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                                jel.o0 o0Var2 = j0Var.f173482a;
                                if (o0Var2 != null) {
                                    Intrinsics.checkNotNullParameter(o0Var2, "<this>");
                                    aVar = new x.a(o0Var2.f173525a, o0Var2.f173526b);
                                } else {
                                    aVar = null;
                                }
                                jel.d1 d1Var = j0Var.f173483b;
                                if (d1Var != null) {
                                    Intrinsics.checkNotNullParameter(d1Var, "<this>");
                                    jel.f0 f0Var = d1Var.f173433a;
                                    cVar = new x.c(f0Var != null ? f0Var.name() : null);
                                } else {
                                    cVar = null;
                                }
                                jel.r0 r0Var = j0Var.f173484c;
                                if (r0Var != null) {
                                    Intrinsics.checkNotNullParameter(r0Var, "<this>");
                                    jel.f0 f0Var2 = r0Var.f173554a;
                                    str2 = str18;
                                    bVar = new x.b(f0Var2 != null ? f0Var2.name() : null, r0Var.f173555b, r0Var.f173556c);
                                } else {
                                    str2 = str18;
                                    bVar = null;
                                }
                                xVar = new hcl.x(aVar, cVar, bVar);
                            } else {
                                str2 = str18;
                                xVar = null;
                            }
                            jel.d0 d0Var = b0Var.i;
                            if (d0Var != null) {
                                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                List list14 = d0Var.f173430a;
                                if (list14 != null) {
                                    arrayList3 = new ArrayList();
                                    Iterator it15 = list14.iterator();
                                    while (it15.hasNext()) {
                                        hcl.q qVarC = tcl.d.c((jel.x0) it15.next());
                                        hcl.d0 d0Var2 = qVarC instanceof hcl.d0 ? (hcl.d0) qVarC : null;
                                        if (d0Var2 != null) {
                                            arrayList3.add(d0Var2);
                                        }
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                List list15 = d0Var.f173431b;
                                if (list15 != null) {
                                    arrayList4 = new ArrayList();
                                    Iterator it16 = list15.iterator();
                                    while (it16.hasNext()) {
                                        hcl.q qVarC2 = tcl.d.c((jel.v0) it16.next());
                                        hcl.b0 b0Var2 = qVarC2 instanceof hcl.b0 ? (hcl.b0) qVarC2 : null;
                                        if (b0Var2 != null) {
                                            arrayList4.add(b0Var2);
                                        }
                                    }
                                } else {
                                    arrayList4 = null;
                                }
                                List list16 = d0Var.f173432c;
                                if (list16 != null) {
                                    arrayList5 = new ArrayList();
                                    Iterator it17 = list16.iterator();
                                    while (it17.hasNext()) {
                                        hcl.q qVarC3 = tcl.d.c((jel.t0) it17.next());
                                        Iterator it18 = it17;
                                        hcl.a0 a0Var2 = qVarC3 instanceof hcl.a0 ? (hcl.a0) qVarC3 : null;
                                        if (a0Var2 != null) {
                                            arrayList5.add(a0Var2);
                                        }
                                        it17 = it18;
                                    }
                                } else {
                                    arrayList5 = null;
                                }
                                List list17 = d0Var.d;
                                if (list17 != null) {
                                    arrayList6 = new ArrayList();
                                    Iterator it19 = list17.iterator();
                                    while (it19.hasNext()) {
                                        hcl.q qVarC4 = tcl.d.c((jel.u) it19.next());
                                        Iterator it20 = it19;
                                        hcl.r rVar3 = qVarC4 instanceof hcl.r ? (hcl.r) qVarC4 : null;
                                        if (rVar3 != null) {
                                            arrayList6.add(rVar3);
                                        }
                                        it19 = it20;
                                    }
                                } else {
                                    arrayList6 = null;
                                }
                                vVar = new hcl.v(arrayList3, arrayList4, arrayList5, arrayList6);
                            } else {
                                vVar = null;
                            }
                            jel.x xVar2 = b0Var.f173416j;
                            if (xVar2 != null) {
                                Intrinsics.checkNotNullParameter(xVar2, "<this>");
                                List list18 = xVar2.f173597a;
                                if (list18 != null) {
                                    List<jel.i0> list19 = list18;
                                    arrayList = new ArrayList(zhm.w.t(list19, 10));
                                    for (jel.i0 i0Var2 : list19) {
                                        Intrinsics.checkNotNullParameter(i0Var2, "<this>");
                                        String str24 = i0Var2.f173472a;
                                        BigDecimal bigDecimal9 = i0Var2.f173473b;
                                        hcl.v vVar3 = vVar;
                                        String str25 = i0Var2.f173474c;
                                        String str26 = i0Var2.d;
                                        xi0.b bVar8 = i0Var2.e;
                                        arrayList.add(new s.a(str24, str25, str26, bVar8 != null ? bVar8.f306286a : null, bigDecimal9));
                                        vVar = vVar3;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                vVar2 = vVar;
                                List list20 = xVar2.f173598b;
                                if (list20 != null) {
                                    List list21 = list20;
                                    arrayList2 = new ArrayList(zhm.w.t(list21, 10));
                                    for (Iterator it21 = list21.iterator(); it21.hasNext(); it21 = it21) {
                                        jel.f1 f1Var = (jel.f1) it21.next();
                                        Intrinsics.checkNotNullParameter(f1Var, "<this>");
                                        arrayList2.add(new s.b(f1Var.f173439a, f1Var.f173440b, f1Var.d, f1Var.e, f1Var.f, f1Var.f173442g, f1Var.f173441c));
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                sVar = new hcl.s(arrayList, arrayList2);
                            } else {
                                vVar2 = vVar;
                                sVar = null;
                            }
                            kVar.b(new hcl.t(str2, str17, str19, wVar, yVar, zVar, uVar, xVar, vVar2, sVar));
                        } else if (details instanceof jel.w2) {
                            dcl.r0 r0Var2 = oVar2.f288016j;
                            jel.w2 w2Var2 = (jel.w2) details;
                            Intrinsics.checkNotNullParameter(w2Var2, "<this>");
                            String str27 = w2Var2.f173586b;
                            String str28 = w2Var2.f173585a;
                            String str29 = w2Var2.f173587c;
                            String str30 = w2Var2.d;
                            jel.y1 y1Var2 = w2Var2.e;
                            h2 h2Var = new h2(y1Var2.f173609a, y1Var2.f173610b, y1Var2.f173611c, y1Var2.d, y1Var2.e, y1Var2.f);
                            jel.r1 r1Var = w2Var2.f;
                            if (r1Var != null) {
                                BigDecimal bigDecimal10 = r1Var.f173557a;
                                jel.u1 u1Var = r1Var.f173558b;
                                String strName4 = u1Var != null ? u1Var.name() : null;
                                jel.s1 s1Var = r1Var.f173559c;
                                String strName5 = s1Var != null ? s1Var.name() : null;
                                BigDecimal bigDecimal11 = r1Var.d;
                                LocalDate localDate7 = r1Var.e;
                                e2 e2Var = r1Var.f;
                                b2Var = new b2(bigDecimal10, strName4, strName5, bigDecimal11, localDate7, e2Var != null ? e2Var.name() : null);
                            } else {
                                b2Var = null;
                            }
                            jel.p1 p1Var = w2Var2.f173588g;
                            if (p1Var != null) {
                                BigDecimal bigDecimal12 = p1Var.f173534a;
                                BigDecimal bigDecimal13 = p1Var.f173535b;
                                jel.u1 u1Var2 = p1Var.f173536c;
                                String strName6 = u1Var2 != null ? u1Var2.name() : null;
                                BigDecimal bigDecimal14 = p1Var.d;
                                LocalDate localDate8 = p1Var.e;
                                e2 e2Var2 = p1Var.f;
                                z1Var = new z1(bigDecimal12, bigDecimal13, strName6, bigDecimal14, localDate8, e2Var2 != null ? e2Var2.name() : null);
                            } else {
                                z1Var = null;
                            }
                            jel.q1 q1Var = w2Var2.f173589h;
                            if (q1Var != null) {
                                BigDecimal bigDecimal15 = q1Var.f173545a;
                                BigDecimal bigDecimal16 = q1Var.f173546b;
                                BigDecimal bigDecimal17 = q1Var.f173547c;
                                e2 e2Var3 = q1Var.d;
                                a2Var = new a2(bigDecimal15, bigDecimal16, bigDecimal17, e2Var3 != null ? e2Var3.name() : null);
                            } else {
                                a2Var = null;
                            }
                            jel.t1 t1Var = w2Var2.i;
                            if (t1Var != null) {
                                BigDecimal bigDecimal18 = t1Var.f173566a;
                                BigDecimal bigDecimal19 = t1Var.f173567b;
                                BigDecimal bigDecimal20 = t1Var.f173568c;
                                BigDecimal bigDecimal21 = t1Var.d;
                                e2 e2Var4 = t1Var.e;
                                c2Var = new c2(e2Var4 != null ? e2Var4.name() : null, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21);
                            } else {
                                c2Var = null;
                            }
                            ArrayList<x1> arrayList20 = w2Var2.f173590j;
                            ArrayList arrayList21 = new ArrayList(zhm.w.t(arrayList20, 10));
                            for (x1 x1Var : arrayList20) {
                                arrayList21.add(new g2(x1Var.f173602a, x1Var.f173603b));
                            }
                            ArrayList<v2> arrayList22 = w2Var2.k;
                            ArrayList arrayList23 = new ArrayList(zhm.w.t(arrayList22, 10));
                            for (v2 v2Var : arrayList22) {
                                String str31 = v2Var.f173579a;
                                String str32 = v2Var.f173580b;
                                String str33 = v2Var.f173581c;
                                jel.g2 g2Var = v2Var.d;
                                jo3.b bVarA9 = (g2Var == null || (dVar = g2Var.f173451a) == null) ? null : hx7.a.A(dVar);
                                ej0.b bVar9 = v2Var.e;
                                arrayList23.add(new s2(str31, str32, str33, bVarA9, bVar9 != null ? cp5.c.M(bVar9) : null));
                            }
                            jel.w1 w1Var = w2Var2.f173591l;
                            String str34 = w1Var.f173582a;
                            String str35 = w1Var.f173583b;
                            jel.k2 k2Var2 = w1Var.f173584c;
                            if (k2Var2 != null) {
                                yel.b bVar10 = k2Var2.f173492a;
                                f2Var = new f2(bVar10 != null ? xcl.a.c(bVar10) : null);
                            } else {
                                f2Var = null;
                            }
                            jel.v1 v1Var = w1Var.d;
                            d2 d2Var = new d2(str34, str35, f2Var, v1Var != null ? new hcl.e2(v1Var.f173578b, v1Var.f173577a) : null);
                            List list22 = w2Var2.f173592m;
                            ArrayList arrayList24 = new ArrayList(zhm.w.t(list22, 10));
                            Iterator it22 = list22.iterator();
                            while (it22.hasNext()) {
                                arrayList24.add(((jel.o1) it22.next()).name());
                            }
                            ArrayList arrayList25 = w2Var2.f173593n;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            Iterator it23 = arrayList25.iterator();
                            while (it23.hasNext()) {
                                jel.a2 a2Var2 = (jel.a2) it23.next();
                                String str36 = a2Var2.f173405a;
                                String str37 = a2Var2.f173406b;
                                String str38 = str27;
                                String str39 = a2Var2.f173407c;
                                ArrayList arrayList27 = a2Var2.d;
                                String str40 = str28;
                                String str41 = str29;
                                String str42 = str30;
                                ArrayList arrayList28 = new ArrayList(zhm.w.t(arrayList27, 10));
                                Iterator it24 = arrayList27.iterator();
                                while (it24.hasNext()) {
                                    jel.h2 h2Var2 = (jel.h2) it24.next();
                                    BigDecimal bigDecimal22 = h2Var2.f173466a;
                                    Iterator it25 = it24;
                                    BigDecimal bigDecimal23 = h2Var2.f173467b;
                                    String strName7 = h2Var2.f173468c.name();
                                    String str43 = h2Var2.d;
                                    i2 i2Var = h2Var2.e;
                                    if (i2Var != null) {
                                        str = str43;
                                        it8 = it23;
                                        n2Var = new n2(i2Var.f173477a, i2Var.f173478b);
                                    } else {
                                        it8 = it23;
                                        str = str43;
                                        n2Var = null;
                                    }
                                    arrayList28.add(new m2(bigDecimal22, bigDecimal23, strName7, str, n2Var));
                                    it24 = it25;
                                    it23 = it8;
                                }
                                arrayList26.add(new j2(str36, str37, str39, arrayList28));
                                str27 = str38;
                                str28 = str40;
                                str29 = str41;
                                str30 = str42;
                            }
                            String str44 = str27;
                            String str45 = str28;
                            String str46 = str29;
                            String str47 = str30;
                            jel.d2 d2Var2 = w2Var2.o;
                            if (d2Var2 != null) {
                                ArrayList<jel.b2> arrayList29 = d2Var2.f173434a;
                                ArrayList arrayList30 = new ArrayList(zhm.w.t(arrayList29, 10));
                                for (jel.b2 b2Var2 : arrayList29) {
                                    BigDecimal bigDecimal24 = b2Var2.f173417a;
                                    BigDecimal bigDecimal25 = b2Var2.f173418b;
                                    boolean z3 = b2Var2.f173419c;
                                    jel.c2 c2Var2 = b2Var2.d;
                                    arrayList30.add(new k2.a(bigDecimal24, bigDecimal25, z3, c2Var2 != null ? c2Var2.name() : null));
                                }
                                k2Var = new k2(arrayList30, d2Var2.f173435b);
                            } else {
                                k2Var = null;
                            }
                            ArrayList<jel.f2> arrayList31 = w2Var2.f173594p;
                            ArrayList arrayList32 = new ArrayList(zhm.w.t(arrayList31, 10));
                            for (jel.f2 f2Var2 : arrayList31) {
                                arrayList32.add(new l2(tcl.n.c(f2Var2.f173443a), tcl.n.c(f2Var2.f173444b)));
                            }
                            jel.z1 z1Var2 = w2Var2.f173595q;
                            hcl.i2 i2Var2 = z1Var2 != null ? new hcl.i2(z1Var2.f173616b, z1Var2.f173615a) : null;
                            jel.l2 l2Var = w2Var2.f173596r;
                            r0Var2.b(new t2(str44, str45, str46, str47, h2Var, b2Var, z1Var, a2Var, c2Var, arrayList21, arrayList23, d2Var, arrayList24, arrayList26, k2Var, arrayList32, i2Var2, l2Var != null ? new o2(l2Var.f173497b, l2Var.f173496a) : null));
                        } else {
                            if (!(details instanceof jel.m1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dcl.p0 p0Var2 = oVar2.i;
                            jel.m1 m1Var = (jel.m1) details;
                            Intrinsics.checkNotNullParameter(m1Var, "<this>");
                            String str48 = m1Var.f173506a;
                            String str49 = m1Var.f173507b;
                            String str50 = m1Var.f173508c;
                            jel.n1 n1Var = m1Var.d;
                            if (n1Var != null) {
                                Intrinsics.checkNotNullParameter(n1Var, "<this>");
                                y1Var = new y1(n1Var.f173519a, n1Var.f173520b, n1Var.f173521c, n1Var.d, n1Var.e, n1Var.f);
                            } else {
                                y1Var = null;
                            }
                            p0Var2.b(new hcl.x1(str49, str48, str50, y1Var));
                        }
                        return Unit.f186387a;
                    case 4:
                        l params = (l) obj2;
                        jel.i1 recommendations = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
                        oVar2.f288017l.f(params.a(), recommendations);
                        return Unit.f186387a;
                    case 5:
                        jel.i1 recommendations2 = (jel.i1) obj3;
                        Intrinsics.checkNotNullParameter((l) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(recommendations2, "recommendations");
                        dcl.w wVar2 = oVar2.f288013c;
                        Object obj7 = tcl.g.f269882a;
                        Intrinsics.checkNotNullParameter(recommendations2, "<this>");
                        String str51 = recommendations2.f173475a;
                        ArrayList<jel.z2> arrayList33 = recommendations2.f173476b;
                        ArrayList arrayList34 = new ArrayList(zhm.w.t(arrayList33, 10));
                        for (jel.z2 z2Var3 : arrayList33) {
                            Intrinsics.checkNotNullParameter(z2Var3, "<this>");
                            arrayList34.add(new z2(le.u1.g(z2Var3.d, tcl.g.f269883b), z2Var3.f173617a, z2Var3.f173618b, z2Var3.f173619c, z2Var3.e));
                        }
                        wVar2.b(new hcl.m0(str51, arrayList34));
                        return Unit.f186387a;
                    default:
                        String ref5 = (String) obj2;
                        jel.l1 targetMarket2 = (jel.l1) obj3;
                        Intrinsics.checkNotNullParameter(ref5, "ref");
                        Intrinsics.checkNotNullParameter(targetMarket2, "targetMarket");
                        oVar2.f288017l.f(o.f288009s + ref5, targetMarket2);
                        return Unit.f186387a;
                }
            }
        }, new n(this, continuation, 1), new sne.e(this, continuation, 20));
        this.f288021q = dod2;
        Intrinsics.checkNotNullParameter(dod2, "dod");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        new LinkedHashMap();
        new LinkedHashMap();
    }
}
