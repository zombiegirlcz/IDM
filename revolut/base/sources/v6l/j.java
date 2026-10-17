package v6l;

import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f286456b;

    public /* synthetic */ j(s sVar, int i) {
        this.f286455a = i;
        this.f286456b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f286455a) {
            case 0:
                qe0.s sVar = this.f286456b.f;
                Unit unit = Unit.f186387a;
                sVar.f(unit);
                return unit;
            case 1:
                qe0.s sVar2 = this.f286456b.f286498g;
                Unit unit2 = Unit.f186387a;
                sVar2.f(unit2);
                return unit2;
            case 2:
                n params = (n) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (List) this.f286456b.f286496b.get(s.n(params));
            case 3:
                n params2 = (n) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                List list = (List) this.f286456b.f286497c.T2(s.n(params2), t.f286503b);
                if (list == null) {
                    return null;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(f.b((s6l.m) it8.next()));
                }
                return arrayList;
            case 4:
                o params3 = (o) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (List) this.f286456b.f286496b.get(s.o(params3));
            case 5:
                o params4 = (o) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                List list3 = (List) this.f286456b.f286497c.T2(s.o(params4), t.f286502a);
                if (list3 == null) {
                    return null;
                }
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(f.d((s6l.q) it9.next()));
                }
                return arrayList2;
            case 6:
                p params5 = (p) obj2;
                Intrinsics.checkNotNullParameter(params5, "params");
                return (List) this.f286456b.f286496b.get(s.l(params5));
            case 7:
                String cardId = (String) obj2;
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                return (List) v7.r("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId, this.f286456b.f286496b);
            case 8:
                p params6 = (p) obj2;
                Intrinsics.checkNotNullParameter(params6, "params");
                List list5 = (List) this.f286456b.f286497c.T2(s.l(params6), t.f286503b);
                if (list5 == null) {
                    return null;
                }
                List list6 = list5;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list6, 10));
                Iterator it10 = list6.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(f.b((s6l.m) it10.next()));
                }
                return arrayList3;
            case 9:
                q params7 = (q) obj2;
                Intrinsics.checkNotNullParameter(params7, "params");
                return (List) this.f286456b.f286496b.get(s.m(params7));
            case 10:
                q params8 = (q) obj2;
                Intrinsics.checkNotNullParameter(params8, "params");
                List list7 = (List) this.f286456b.f286497c.T2(s.m(params8), t.f286502a);
                if (list7 == null) {
                    return null;
                }
                List list8 = list7;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list8, 10));
                Iterator it11 = list8.iterator();
                while (it11.hasNext()) {
                    arrayList4.add(f.d((s6l.q) it11.next()));
                }
                return arrayList4;
            case 11:
                qe0.s sVar3 = this.f286456b.f286498g;
                Unit unit3 = Unit.f186387a;
                sVar3.f(unit3);
                return unit3;
            default:
                qe0.s sVar4 = this.f286456b.f;
                Unit unit4 = Unit.f186387a;
                sVar4.f(unit4);
                return unit4;
        }
    }
}
