package huh;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.workflow.engine.rfi.api.interactor.UploadState;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import fi7.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import qt8.n;
import vkm.q;
import vkm.q0;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f155655w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f155655w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, this.f155655w, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (list.isEmpty()) {
            return new go.g(UploadState.Completed.f96511a, 2);
        }
        m mVar = this.v;
        mVar.getClass();
        List<Answer.Documents> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Answer.Documents documents : list2) {
            ?? r56 = documents.f96518b;
            ArrayList arrayList2 = new ArrayList(r56.size());
            Iterator it8 = r56.entrySet().iterator();
            while (it8.hasNext()) {
                File document = (File) ((Map.Entry) it8.next()).getKey();
                atb.a aVar2 = mVar.f155666a;
                av.a scanType = av.a.FRONT;
                String checkId = this.f155655w;
                Intrinsics.checkNotNullParameter(checkId, "checkId");
                Intrinsics.checkNotNullParameter(scanType, "scanType");
                Intrinsics.checkNotNullParameter(document, "document");
                qt8.d dVar = (qt8.d) aVar2.f9020a;
                Intrinsics.checkNotNullParameter(checkId, "checkId");
                Intrinsics.checkNotNullParameter(scanType, "scanType");
                Intrinsics.checkNotNullParameter(document, "document");
                qt8.o oVar = dVar.d;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(checkId, "checkId");
                Intrinsics.checkNotNullParameter(scanType, "scanType");
                Intrinsics.checkNotNullParameter(document, "document");
                arrayList2.add(new g0c.e(t1.E(q.k(new n(document, oVar, checkId, scanType, null))), documents, document, 23));
            }
            arrayList.add(q.I(arrayList2));
        }
        q0 q0Var = new q0(q.I(arrayList), new s(2, mVar.f155668c, MutableSharedFlow.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15), 1);
        Iterator it9 = list2.iterator();
        int size = 0;
        while (it9.hasNext()) {
            size += ((Answer.Documents) it9.next()).f96518b.size();
        }
        return q.q(new j(new t38.e(new a(size), 23, q0Var, k.f155664a), 0));
    }
}
