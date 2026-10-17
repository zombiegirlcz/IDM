package huh;

import com.revolut.feature.workflow.engine.rfi.api.interactor.UploadState;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f155656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f155657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f155658y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, ArrayList arrayList, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f155656w = arrayList;
        this.f155657x = str;
        this.f155658y = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, this.f155656w, this.f155657x, this.f155658y, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str = (String) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVar = this.v;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = this.f155656w.iterator();
        while (true) {
            if (!it8.hasNext()) {
                return q.B(new a9h.c(2, this.v, this.f155657x, str, this.f155658y, (Continuation) null), q.B(new e(mVar, str, null), new go.g(arrayList, 2)));
            }
            Answer.Documents documents = (Answer.Documents) it8.next();
            ?? r4 = documents.f96518b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : r4.entrySet()) {
                UploadState uploadState = (UploadState) entry.getValue();
                if (!(uploadState instanceof UploadState.Completed)) {
                    if (!(uploadState instanceof UploadState.InProgress) && !(uploadState instanceof UploadState.Error) && uploadState != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Answer.Documents documentsB = linkedHashMap.isEmpty() ? null : Answer.Documents.b(documents, linkedHashMap);
            if (documentsB != null) {
                arrayList.add(documentsB);
            }
        }
    }
}
