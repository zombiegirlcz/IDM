package l91;

import com.google.crypto.tink.shaded.protobuf.t1;
import gim.i;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u91.k;
import u91.l;
import u91.m;
import u91.n;
import u91.p;
import u91.q;
import u91.r;
import u91.s;
import u91.t;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            case 2:
                return new e(this.v, continuation, 2);
            case 3:
                return new e(this.v, continuation, 3);
            default:
                return new e(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        int i = this.u;
        g gVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k91.b bVar = (k91.b) j6.a.k(k91.b.class, gVar.e, "ACCOUNT_SWITCHING_INTRO_DATA_KEY");
                if (bVar != null) {
                    return j91.a.a(bVar);
                }
                return null;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m91.f fVar = gVar.f193022c;
                List listD = fVar.d();
                List listG = fVar.g();
                List listE = fVar.e();
                List listF = fVar.f();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : listF) {
                    String str = ((n91.c) obj3).f213534b;
                    Object objO = linkedHashMap.get(str);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str);
                    }
                    ((List) objO).add(obj3);
                }
                if (listD.isEmpty() && listG.isEmpty() && listE.isEmpty()) {
                    return null;
                }
                List list = listD;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    n91.a aVar3 = (n91.a) it8.next();
                    List list2 = (List) linkedHashMap.get(aVar3.f213523a);
                    Intrinsics.checkNotNullParameter(aVar3, "<this>");
                    String str2 = aVar3.f213523a;
                    String str3 = aVar3.f213524b;
                    Iterator it9 = it8;
                    long j2 = aVar3.f213525c;
                    xi0.a aVar4 = xi0.b.Companion;
                    String str4 = aVar3.d;
                    aVar4.getClass();
                    dj0.d dVar = new dj0.d(j2, xi0.a.a(str4));
                    LocalDate localDate = LocalDate.parse(aVar3.e);
                    Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                    String str5 = aVar3.f;
                    u91.o oVar = p.Companion;
                    String str6 = aVar3.f213526g;
                    oVar.getClass();
                    p pVarA = u91.o.a(str6);
                    m mVar = n.Companion;
                    String str7 = aVar3.f213527h;
                    mVar.getClass();
                    n nVarA = m.a(str7);
                    String str8 = aVar3.i;
                    LocalDate localDate2 = str8 != null ? LocalDate.parse(str8) : null;
                    if (list2 != null) {
                        List<n91.c> list3 = list2;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (n91.c cVar : list3) {
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            arrayList3.add(new l(cVar.f213533a, cVar.f213535c, cVar.d));
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new u91.i(str2, str3, dVar, localDate, str5, pVarA, nVarA, localDate2, arrayList));
                    it8 = it9;
                }
                List<n91.d> list4 = listG;
                ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                for (n91.d dVar2 : list4) {
                    Intrinsics.checkNotNullParameter(dVar2, "<this>");
                    String str9 = dVar2.f213536a;
                    String str10 = dVar2.f213537b;
                    long j3 = dVar2.f213538c;
                    xi0.a aVar5 = xi0.b.Companion;
                    String str11 = dVar2.d;
                    aVar5.getClass();
                    dj0.d dVar3 = new dj0.d(j3, xi0.a.a(str11));
                    LocalDate localDate3 = LocalDate.parse(dVar2.e);
                    Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
                    String str12 = dVar2.f;
                    r rVar = s.Companion;
                    String str13 = dVar2.f213539g;
                    rVar.getClass();
                    s sVarA = r.a(str13);
                    if (sVarA == null) {
                        sVarA = s.MONTHLY;
                    }
                    s sVar = sVarA;
                    String str14 = dVar2.f213540h;
                    String str15 = dVar2.i;
                    m mVar2 = n.Companion;
                    String str16 = dVar2.f213541j;
                    mVar2.getClass();
                    n nVarA2 = m.a(str16);
                    String str17 = dVar2.k;
                    arrayList4.add(new q(str9, str10, dVar3, localDate3, sVar, str14, str15, str12, nVarA2, str17 != null ? LocalDate.parse(str17) : null));
                }
                List<n91.b> list5 = listE;
                ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
                for (n91.b bVar2 : list5) {
                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                    String str18 = bVar2.f213528a;
                    String str19 = bVar2.f213529b;
                    long j5 = bVar2.f213530c;
                    xi0.a aVar6 = xi0.b.Companion;
                    String str20 = bVar2.d;
                    aVar6.getClass();
                    dj0.d dVar4 = new dj0.d(j5, xi0.a.a(str20));
                    LocalDate localDate4 = LocalDate.parse(bVar2.e, DateTimeFormatter.ISO_LOCAL_DATE);
                    Intrinsics.checkNotNullExpressionValue(localDate4, "parse(...)");
                    String str21 = bVar2.f;
                    u91.o oVar2 = p.Companion;
                    String str22 = bVar2.f213531g;
                    oVar2.getClass();
                    p pVarA2 = u91.o.a(str22);
                    m mVar3 = n.Companion;
                    String str23 = bVar2.f213532h;
                    mVar3.getClass();
                    n nVarA3 = m.a(str23);
                    String str24 = bVar2.i;
                    arrayList5.add(new k(str18, str19, dVar4, localDate4, str21, pVarA2, nVarA3, str24 != null ? LocalDate.parse(str24) : null));
                }
                return new u91.e(arrayList2, arrayList4, arrayList5);
            case 2:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k91.d dVar5 = (k91.d) j6.a.k(k91.d.class, gVar.e, "SWITCHING_STATUS_KEY");
                if (dVar5 != null) {
                    return qk.d.C(dVar5);
                }
                return null;
            case 3:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List<n91.e> listA = gVar.f193021b.a();
                ArrayList arrayList6 = new ArrayList(w.t(listA, 10));
                for (n91.e eVar : listA) {
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    arrayList6.add(new t(eVar.f213542a, eVar.f213543b, eVar.f213544c));
                }
                if (arrayList6.isEmpty()) {
                    return null;
                }
                return arrayList6;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k91.p pVar = (k91.p) j6.a.k(k91.p.class, gVar.e, "ACCOUNT_SWITCHING_SUBMITTED_SWITCH_DATA_KEY");
                if (pVar != null) {
                    return t1.S(pVar);
                }
                return null;
        }
    }
}
