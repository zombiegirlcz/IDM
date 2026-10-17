package gb0;

import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import ga9.v;
import hb0.j;
import hb0.k;
import j7b.l;
import java.util.List;
import java.util.Set;
import jb0.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lk0.g;
import skm.a2;
import vkm.q;
import vkm.z1;
import yji.n;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final db0.a f142208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l80.e f142209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yk0.d f142210n;
    public final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f142211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j f142212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f142213r;

    public f(BackendEntityItem item, db0.a interactor, l80.e dateProvider, yk0.d schedulerProvider) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        this.f142208l = interactor;
        this.f142209m = dateProvider;
        this.f142210n = schedulerProvider;
        EntitiesSelectionItem entitiesSelectionItem = item instanceof EntitiesSelectionItem ? (EntitiesSelectionItem) item : null;
        Set set = entitiesSelectionItem != null ? entitiesSelectionItem.f63426g : null;
        this.o = set == null ? h0.f322473a : set;
        this.f142211p = q.b(0, 7, null);
    }

    @Override // yji.n
    public final void E2() {
        this.f142212q = null;
    }

    public final void Z2() {
        List list;
        j jVar = this.f142212q;
        if (jVar == null) {
            throw new IllegalArgumentException("PagedDataStorage should be initialized first");
        }
        g gVarA = jVar.a();
        lk0.e eVar = (gVarA == null || (list = gVarA.f196174a) == null) ? null : (lk0.e) d0.m0(list);
        if ((eVar != null ? eVar.e : null) == null) {
            T2(new c(this, null), new yi5.b(27));
        }
    }

    public final void b3(String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        j jVar = this.f142212q;
        if (jVar == null) {
            throw new IllegalArgumentException("PagedDataStorage should be initialized first");
        }
        switch (jVar.f150543a) {
            case 0:
                k kVar = (k) jVar.f150544b;
                kVar.H2(kVar.f150546q, new ha1.k(27));
                break;
            default:
                i iVar = (i) jVar.f150544b;
                iVar.H2(iVar.u, new l(16));
                break;
        }
        a2 a2Var = this.f142213r;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f142213r = T2(new v(this, searchQuery, continuation, 10), new yi5.b(27));
    }
}
