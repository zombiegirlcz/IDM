package g18;

import e18.e;
import e18.h;
import e18.l;
import gim.i;
import j18.o;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n14.k;
import ne0.j;
import r10.q;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f139563w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139563w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f139563w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f139563w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        o oVar = (o) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(oVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List listC;
        x08.c cVar;
        Instant instant;
        String str;
        x08.b bVar;
        x08.a aVar;
        int i = this.u;
        q qVar = this.f139563w;
        switch (i) {
            case 0:
                c18.a aVar2 = (c18.a) qVar.d;
                o oVar = (o) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str2 = oVar.e;
                List list = oVar.f170149a;
                Instant instant2 = oVar.f170151c;
                int i2 = oVar.f170150b;
                if (str2 != null) {
                    listC = aVar2.d(i2, str2, instant2);
                } else {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(k.G((l2l.a) it8.next()));
                    }
                    listC = aVar2.c(i2, instant2, arrayList, list.isEmpty());
                }
                Intrinsics.checkNotNullParameter(listC, "<this>");
                List<e> list3 = listC;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                for (e eVar : list3) {
                    String str3 = eVar.f121912a;
                    int i3 = h18.b.f148475a[eVar.f121914c.ordinal()];
                    if (i3 == 1) {
                        cVar = x08.c.REV_INSIGHT;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = x08.c.PRICE_ALERT;
                    }
                    Instant instant3 = eVar.f121913b;
                    String str4 = eVar.d;
                    String str5 = eVar.e;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = eVar.f;
                    l lVar = eVar.f121916h;
                    if (lVar != null) {
                        Intrinsics.checkNotNullParameter(lVar, "<this>");
                        ej0.b bVar2 = lVar.f121920b;
                        BigDecimal bigDecimal = lVar.f121921c;
                        Integer num = lVar.d;
                        h hVar = lVar.f121919a;
                        Intrinsics.checkNotNullParameter(hVar, "<this>");
                        int i5 = h18.a.f148474b[hVar.ordinal()];
                        if (i5 == 1) {
                            aVar = x08.a.PENDING;
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = x08.a.ATTRIBUTED;
                        }
                        x08.b bVar3 = new x08.b(aVar, bVar2, bigDecimal, num, lVar.e);
                        instant = instant3;
                        str = str5;
                        bVar = bVar3;
                    } else {
                        instant = instant3;
                        str = str5;
                        bVar = null;
                    }
                    arrayList2.add(new o18.d(str3, cVar, instant, str4, str, str6, bVar));
                }
                o18.e eVar2 = new o18.e(arrayList2);
                if (arrayList2.isEmpty()) {
                    return null;
                }
                return eVar2;
            default:
                o oVar2 = (o) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j) qVar.f250850c).remove(oVar2);
                return Unit.f186387a;
        }
    }
}
