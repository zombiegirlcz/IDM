package jtj;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import com.revolut.retail.feature.impl.income_sorter.network.IncomeSorterService;
import ix6.l0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsj.e f178521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f178522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncomeSorterService f178523c;
    public final x4l.c d;

    public n(wsj.e dao, ne0.d memoryCache, IncomeSorterService service) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f178521a = dao;
        this.f178522b = memoryCache;
        this.f178523c = service;
        Continuation continuation = null;
        this.d = new x4l.c(new ghl.l(this, continuation, 24), new jlh.g(this, 26), new jnf.d(this, 13), new m(this, null, 1), new j40.d(this, continuation, 7));
    }

    public final Object a(String str, String str2, hzi.c cVar, List list, hzi.a aVar, IncomeSorterDestinationId incomeSorterDestinationId, boolean z, etj.c cVar2) throws Throwable {
        akl.i iVar = new akl.i(list, this, cVar, aVar, incomeSorterDestinationId, str, str2, z, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, iVar, cVar2);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    public final Object b(String str, String str2, etj.e eVar) throws Throwable {
        l0 l0Var = new l0(this, str2, str, (Continuation) null, 23);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, l0Var, eVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    public final Object c(String str, String str2, List list, Boolean bool, hzi.a aVar, IncomeSorterDestinationId incomeSorterDestinationId, etj.n nVar) throws Throwable {
        if (list == null && bool == null && aVar == null && incomeSorterDestinationId == null) {
            throw new IllegalArgumentException("Unable to submit with empty changes");
        }
        ac8.h hVar = new ac8.h(bool, this, str2, list, aVar, incomeSorterDestinationId, str, null, 13);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, hVar, nVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // od0.e
    public final void clear() {
        this.f178521a.c();
        this.f178522b.clear();
    }
}
