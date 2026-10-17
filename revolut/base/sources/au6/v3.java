package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerVatReminderService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v3 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y3 f9646w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(y3 y3Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f9646w = y3Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new v3(this.f9646w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new v3(this.f9646w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [fim.a] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fs6.a aVar;
        switch (this.u) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FreelancerVatReminderService freelancerVatReminderService = this.f9646w.f9667a;
                    this.v = 1;
                    obj2 = freelancerVatReminderService.getVatReminderOptions(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yt6.e eVar = (yt6.e) obj2;
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                List assessmentPeriods = eVar.getAssessmentPeriods();
                ArrayList arrayList = new ArrayList();
                Iterator it8 = assessmentPeriods.iterator();
                while (true) {
                    fs6.b bVar = null;
                    int i2 = 0;
                    if (!it8.hasNext()) {
                        Set setI1 = zhm.d0.i1(arrayList);
                        fs6.b bVarA = bu6.h.a(eVar.getDefaultAssessmentPeriod());
                        List<String> additionalOptions = eVar.getAdditionalOptions();
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : additionalOptions) {
                            fs6.a[] aVarArrValues = fs6.a.values();
                            int length = aVarArrValues.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    aVar = aVarArrValues[i3];
                                    if (!kotlin.text.a0.z(aVar.name(), str, true)) {
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
                    }
                    String str2 = (String) it8.next();
                    fs6.b[] bVarArrValues = fs6.b.values();
                    int length2 = bVarArrValues.length;
                    while (true) {
                        if (i2 < length2) {
                            fs6.b bVar2 = bVarArrValues[i2];
                            if (kotlin.text.a0.z(bVar2.name(), str2, true)) {
                                bVar = bVar2;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (bVar != null) {
                        arrayList.add(bVar);
                    }
                }
                break;
            default:
                Object arrayList3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FreelancerVatReminderService freelancerVatReminderService2 = this.f9646w.f9667a;
                    this.v = 1;
                    obj2 = freelancerVatReminderService2.getVatReminders(this);
                    if (obj2 != arrayList3) {
                    }
                    return arrayList3;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Iterable iterable = (Iterable) obj2;
                arrayList3 = new ArrayList(zhm.w.t(iterable, 10));
                Iterator it9 = iterable.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(bu6.h.c((yt6.b) it9.next()));
                }
                return arrayList3;
        }
    }
}
