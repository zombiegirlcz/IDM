package fc0;

import akg.n;
import com.revolut.feature.backend_flow.domain.models.BackendFlowEntitiesPage;
import com.revolut.feature.backend_flow.domain.models.EntityType;
import f23.y;
import fag.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import w4l.k;
import xl2.o;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oc0.i f133600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9l.g f133601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f133602c;
    public final l80.e d;

    public f(oc0.i repository, t9l.g sharedTransactionInteractor, g backendFlowToEntityDefaultMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(sharedTransactionInteractor, "sharedTransactionInteractor");
        Intrinsics.checkNotNullParameter(backendFlowToEntityDefaultMapper, "backendFlowToEntityDefaultMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f133600a = repository;
        this.f133601b = sharedTransactionInteractor;
        this.f133602c = backendFlowToEntityDefaultMapper;
        this.d = dateProvider;
    }

    public static n b(f fVar, String formId, String itemId, Map queries, int i, EntityType entityType) {
        fVar.getClass();
        Intrinsics.checkNotNullParameter(formId, "formId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(queries, "queries");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(fVar.d(xam.a.h(new e(i, fVar, formId, itemId, queries, (Continuation) null), fVar.f133600a.a(formId, itemId, queries, ((l80.f) fVar.d).b().toEpochMilli(), null, oc0.g.REGULAR, loadingStrategy)), entityType, loadingStrategy), new o0(22));
    }

    public static o c(BackendFlowEntitiesPage backendFlowEntitiesPage, Function1 function1) {
        boolean z = backendFlowEntitiesPage.f63269a;
        long j2 = backendFlowEntitiesPage.f63270b;
        List list = backendFlowEntitiesPage.f63271c;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Object objInvoke = function1.invoke(it8.next());
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return new o(j2, arrayList, z);
    }

    public final Flow a(String str, String str2, Map map, long j2, String str3, a aVar, k kVar) {
        oc0.g gVar;
        int i = b.f133591a[aVar.ordinal()];
        if (i == 1) {
            gVar = oc0.g.REGULAR;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = oc0.g.PRESELECTION;
        }
        return xam.a.h(new c(this, str, str2, map, str3, aVar, kVar, null), this.f133600a.a(str, str2, map, j2, str3, gVar, kVar));
    }

    public final Flow d(Flow flow, EntityType entityType, k kVar) {
        if (entityType instanceof EntityType.Transaction) {
            return xam.a.h(new y(this, kVar, (Continuation) null, 1), flow);
        }
        if ((entityType instanceof EntityType.Card) || (entityType instanceof EntityType.Device) || (entityType instanceof EntityType.Default)) {
            return nim.a.v(flow, new f0m.c(this, 28));
        }
        throw new NoWhenBranchMatchedException();
    }
}
