package qrk;

import efm.r;
import iyi.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lrk.i;
import uqk.e;
import uqk.l;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f248736a;

    public b(i repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f248736a = repository;
    }

    public final r a(String ref2, e period) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(period, "period");
        wrk.a params = new wrk.a(ref2, period);
        i iVar = this.f248736a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        return iVar.f199534c.f(params, false);
    }

    public final r b(String ref2, l statementType, e period) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        Intrinsics.checkNotNullParameter(period, "period");
        wrk.b params = new wrk.b(ref2, statementType, period);
        i iVar = this.f248736a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        return iVar.d.f(params, false);
    }

    public final Object c(String str, e eVar, j jVar) {
        Object objA = nim.a.a(this.f248736a.f199534c.g(new wrk.a(str, eVar), false), jVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objA != aVar) {
            objA = Unit.f186387a;
        }
        return objA == aVar ? objA : Unit.f186387a;
    }
}
