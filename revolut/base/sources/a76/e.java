package a76;

import a5g.h;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import efm.c0;
import efm.r;
import gim.i;
import hhm.f;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lk0.g;
import wfm.j;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u66.b f1773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f1774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f1775c;

    public e(u66.b defiAssetsRepository) {
        Intrinsics.checkNotNullParameter(defiAssetsRepository, "defiAssetsRepository");
        this.f1773a = defiAssetsRepository;
        this.f1775c = j6.a.h("create(...)");
    }

    public final Object a(r rVar, SortingType sortingType, String str, xi0.b bVar, Set set, wk5.a aVar, i iVar) {
        q66.c cVar = new q66.c(100, 0, bVar, sortingType, str, set, aVar);
        this.f1774b = null;
        a09.b bVar2 = new a09.b(this, 18);
        h hVar = new h(13);
        c cVar2 = new c(0, this, e.class, "getPagedData", "getPagedData()Lio/reactivex/Maybe;", 0, 0);
        a08.e eVar = new a08.e(1, this, e.class, "storePagedData", "storePagedData(Lcom/revolut/core/pagination/PagedData;)Lio/reactivex/Completable;", 0, 8);
        h hVar2 = new h(12);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        c0 c0Var = f.f152429a;
        j jVar = new j(executorServiceNewSingleThreadExecutor);
        Intrinsics.checkNotNullExpressionValue(jVar, "from(...)");
        Object objA = nim.a.a(new lk0.d(bVar2, cVar2, eVar, cVar, hVar, hVar2, jVar).b(rVar), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
