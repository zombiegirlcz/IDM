package au6;

import androidx.room.util.DBUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w3 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ y3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(y3 y3Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = y3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w3(this.v, continuation, 0);
            default:
                return new w3(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w3) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fs6.a aVar;
        fs6.b bVar;
        int i = this.u;
        y3 y3Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                du6.m mVar = (du6.m) wp5.y.t(du6.m.class, y3Var.f9669c, "STORAGE_CACHE_KEY_VAT_REMINDER_OPTIONS");
                if (mVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(mVar, "<this>");
                List<String> assessmentPeriods = mVar.getAssessmentPeriods();
                ArrayList arrayList = new ArrayList();
                for (String str : assessmentPeriods) {
                    fs6.b[] bVarArrValues = fs6.b.values();
                    int length = bVarArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            bVar = bVarArrValues[i2];
                            if (!kotlin.text.a0.z(bVar.name(), str, true)) {
                                i2++;
                            }
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar != null) {
                        arrayList.add(bVar);
                    }
                }
                Set setI1 = zhm.d0.i1(arrayList);
                fs6.b bVarA = bu6.h.a(mVar.getDefaultAssessmentPeriod());
                List<String> additionalOptions = mVar.getAdditionalOptions();
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : additionalOptions) {
                    fs6.a[] aVarArrValues = fs6.a.values();
                    int length2 = aVarArrValues.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            aVar = aVarArrValues[i3];
                            if (!kotlin.text.a0.z(aVar.name(), str2, true)) {
                                i3++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar != null) {
                        arrayList2.add(aVar);
                    }
                }
                return new fs6.e(setI1, bVarA, zhm.d0.i1(arrayList2));
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) DBUtil.performBlocking(y3Var.d.f229249a, true, false, new or4.h(24));
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(bu6.h.b((ps6.j) it8.next()));
                }
                return arrayList3;
        }
    }
}
