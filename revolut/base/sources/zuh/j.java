package zuh;

import com.revolut.feature.workflow.engine.shared.data.WorkflowService;
import com.revolut.shared.feature.workflow.engine.api.models.DataPoint;
import com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep;
import com.revolut.shared.feature.workflow.engine.api.models.eligibility.exceptions.UnrecognisedContractException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f325472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ pil.b f325473x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(o oVar, pil.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f325472w = oVar;
        this.f325473x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f325472w, this.f325473x, continuation, 0);
            default:
                return new j(this.f325472w, this.f325473x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object workflowSteps;
        ?? arrayList;
        Object workflowSteps2;
        ril.c cVar;
        ?? arrayList2;
        int i = this.u;
        pil.b bVar = this.f325473x;
        int i2 = 10;
        o oVar = this.f325472w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    WorkflowService workflowService = oVar.f325482c;
                    String str = bVar.f236617a;
                    Set<ril.b> set = bVar.f236618b;
                    ArrayList arrayList3 = new ArrayList(w.t(set, 10));
                    for (ril.b bVar2 : set) {
                        Object obj3 = cvh.f.f109460a;
                        Intrinsics.checkNotNullParameter(bVar2, "<this>");
                        arrayList3.add(bVar2.name());
                    }
                    Set<String> setI1 = d0.i1(arrayList3);
                    this.v = 1;
                    workflowSteps = workflowService.getWorkflowSteps(str, setI1, this);
                    if (workflowSteps == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    workflowSteps = obj2;
                }
                List<cvh.d> steps = ((cvh.e) workflowSteps).getSteps();
                cvh.b bVar3 = oVar.e;
                ArrayList arrayList4 = new ArrayList(w.t(steps, 10));
                for (cvh.d value : steps) {
                    cvh.c cVar2 = (cvh.c) bVar3;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(value, "value");
                    ril.b bVarA = cvh.f.a(value.getName());
                    String reason = value.getReason();
                    List dataPoints = value.getDataPoints();
                    if (dataPoints != null) {
                        List<cvh.a> list = dataPoints;
                        arrayList = new ArrayList(w.t(list, 10));
                        for (cvh.a aVar2 : list) {
                            arrayList.add(new DataPoint(cVar2.f109455a.a(aVar2.getName()), aVar2.getScope()));
                        }
                    } else {
                        arrayList = f0.f322471a;
                    }
                    arrayList4.add(new EligibilityStep.Eligibility(bVarA, reason, arrayList, false, false, value.getWorkflowId()));
                }
                return arrayList4;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    WorkflowService workflowService2 = oVar.f325482c;
                    String str2 = bVar.f236617a;
                    Set<ril.b> set2 = bVar.f236618b;
                    ArrayList arrayList5 = new ArrayList(w.t(set2, 10));
                    for (ril.b bVar4 : set2) {
                        Object obj4 = cvh.f.f109460a;
                        Intrinsics.checkNotNullParameter(bVar4, "<this>");
                        arrayList5.add(bVar4.name());
                    }
                    Set<String> setI12 = d0.i1(arrayList5);
                    this.v = 1;
                    workflowSteps2 = workflowService2.getWorkflowSteps(str2, setI12, this);
                    if (workflowSteps2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    workflowSteps2 = obj2;
                }
                List<cvh.d> steps2 = ((cvh.e) workflowSteps2).getSteps();
                cvh.b bVar5 = oVar.e;
                ArrayList arrayList6 = new ArrayList(w.t(steps2, 10));
                for (cvh.d value2 : steps2) {
                    cvh.c cVar3 = (cvh.c) bVar5;
                    cVar3.getClass();
                    Intrinsics.checkNotNullParameter(value2, "value");
                    String name = value2.getName();
                    ril.c[] cVarArrValues = ril.c.values();
                    int length = cVarArrValues.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            cVar = cVarArrValues[i6];
                            if (!a0.z(cVar.name(), name, true)) {
                                i6++;
                            }
                        } else {
                            cVar = null;
                        }
                    }
                    if (cVar == null) {
                        throw new UnrecognisedContractException(j6.a.q("Unknown StepName: ", value2.getName()));
                    }
                    String reason2 = value2.getReason();
                    List dataPoints2 = value2.getDataPoints();
                    if (dataPoints2 != null) {
                        List<cvh.a> list2 = dataPoints2;
                        arrayList2 = new ArrayList(w.t(list2, i2));
                        for (cvh.a aVar4 : list2) {
                            arrayList2.add(new DataPoint(cVar3.f109455a.a(aVar4.getName()), aVar4.getScope()));
                        }
                    } else {
                        arrayList2 = f0.f322471a;
                    }
                    arrayList6.add(new ril.d(cVar, reason2, arrayList2, value2.getWorkflowId()));
                    i2 = 10;
                }
                return arrayList6;
        }
    }
}
