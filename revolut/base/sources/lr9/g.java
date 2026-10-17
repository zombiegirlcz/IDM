package lr9;

import ar9.v;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import efm.d0;
import er9.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k37.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import pfm.z;
import qfm.d1;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f199449b;

    public /* synthetic */ g(j jVar, int i) {
        this.f199448a = i;
        this.f199449b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f199448a) {
            case 0:
                Long it8 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                j jVar = this.f199449b;
                x xVar = (x) jVar.f199452b;
                sfm.b bVarG = xVar.f128606q.g(Unit.f186387a, true).g(xVar.g(true));
                Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                efm.r rVarSwitchMapSingle = m70.a.g(mo3.a.n(bVarG), null, null, 3).switchMapSingle(new b(13, new g(jVar, 2)));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
                return w.f0(rVarSwitchMapSingle).toFlowable(efm.a.DROP);
            case 1:
                List groupBills = (List) obj2;
                Intrinsics.checkNotNullParameter(groupBills, "groupBills");
                List list = groupBills;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(((ar9.j) it9.next()).f8550b);
                }
                return new ufm.i(this.f199449b.a(arrayList), new b(12, new t(groupBills, 27)), 1);
            case 2:
                j jVar2 = this.f199449b;
                r rVar = jVar2.f199454g;
                List groups = (List) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                ArrayList<PaymentGroup> arrayList2 = new ArrayList();
                for (Object obj3 : groups) {
                    PaymentGroup paymentGroup = (PaymentGroup) obj3;
                    if (paymentGroup.f79289h.getMillis() > r.a(rVar, paymentGroup.f79285a)) {
                        arrayList2.add(obj3);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return d0.m(Unit.f186387a);
                }
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                for (PaymentGroup paymentGroup2 : arrayList2) {
                    String str = paymentGroup2.f79285a;
                    long jMin = Long.min(DateTime.now().getMillis(), r.a(rVar, str));
                    e eVar = jVar2.f199451a;
                    z zVarA = eVar.a(jMin, str);
                    z zVarC = eVar.c(jMin, str);
                    z zVarD = new pfm.a(jVar2.i.f(false), new b(18, new llh.j(jVar2, str, 20)), 4).D(Unit.f186387a);
                    Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                    ufm.i iVar = new ufm.i(w.I0(zVarA, zVarC, zVarD), new b(15, new csl.a(jVar2, paymentGroup2, jMin, 9)), 0);
                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                    arrayList3.add(iVar);
                }
                pfm.x xVarH = efm.i.h(arrayList3);
                ufm.l lVar = ufm.l.INSTANCE;
                int i = efm.i.f125385a;
                mfm.f.b(lVar, "mapper is null");
                mfm.f.e(i, "maxConcurrency");
                mfm.f.e(i, "prefetch");
                return new d1(new qfm.k(xVarH, lVar, i, i, zfm.f.IMMEDIATE)).D(Unit.f186387a);
            case 3:
                List groupsMembers = (List) obj2;
                Intrinsics.checkNotNullParameter(groupsMembers, "groupsMembers");
                return this.f199449b.f199455h.j0(zi0.c.S(groupsMembers));
            default:
                List groupSettlements = (List) obj2;
                Intrinsics.checkNotNullParameter(groupSettlements, "groupSettlements");
                List list2 = groupSettlements;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(((v) it10.next()).f8587b);
                }
                return new ufm.i(this.f199449b.a(arrayList4), new b(11, new t(groupSettlements, 26)), 1);
        }
    }
}
