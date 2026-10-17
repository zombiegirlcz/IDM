package nuh;

import com.revolut.feature.workflow.engine.rfi.api.interactor.UploadState;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.flow.ScreeningFlowContract$State;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import no.e0;
import vkm.j2;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((zth.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        zth.a aVar = (zth.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String questionId = aVar.f325165a;
        File file = aVar.f325166b;
        UploadState uploadState = aVar.f325167c;
        com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a aVar3 = this.v;
        qki.d dVar = aVar3.v;
        List list = ((ScreeningFlowContract$State) ((j2) dVar.f22677a).getValue()).f96554b;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Answer) next).getF96537a(), questionId)) {
                break;
            }
        }
        Answer.Documents documents = (Answer.Documents) (next instanceof Answer ? (Answer) next : null);
        if (documents == null) {
            return Unit.f186387a;
        }
        LinkedHashMap linkedHashMapZ = r0.z(documents.f96518b);
        linkedHashMapZ.put(file, uploadState);
        aVar3.H2(dVar, new e0(documents, linkedHashMapZ, 20));
        return Unit.f186387a;
    }
}
