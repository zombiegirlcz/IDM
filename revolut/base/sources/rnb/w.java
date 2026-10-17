package rnb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import twb.b0;
import vkm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbd.a f255587a;

    public w(lbd.a sharedSavingsVaultInteractor) {
        Intrinsics.checkNotNullParameter(sharedSavingsVaultInteractor, "sharedSavingsVaultInteractor");
        this.f255587a = sharedSavingsVaultInteractor;
    }

    public final Flow a(pcd.e filter, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        eed.h hVar = (eed.h) this.f255587a;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (!hVar.c()) {
            return rd0.e.b(((eed.n) hVar.f125188c).f(loadingStrategy, filter));
        }
        ubd.i iVar = hVar.f125186a;
        lcd.q accountTypeFilter = eed.d.a(filter);
        Intrinsics.checkNotNullParameter(accountTypeFilter, "accountTypeFilter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        return nim.a.u(new eed.g(hVar, continuation, 0), vkm.q.Q(new v1(new b0(iVar, continuation, 9)), new mki.d(continuation, iVar, accountTypeFilter, loadingStrategy, 18)));
    }

    public final Flow b(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        eed.h hVar = (eed.h) this.f255587a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (!hVar.c()) {
            return nim.a.v(rd0.e.b(((eed.n) hVar.f125188c).g(accountId, loadingStrategy)), new ebi.i(hVar, 21));
        }
        ubd.i iVar = hVar.f125186a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        return vkm.q.Q(new v1(new b0(iVar, continuation, 9)), new mki.d(continuation, iVar, accountId, loadingStrategy, 19));
    }

    public final Flow c(String accountId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        eed.h hVar = (eed.h) this.f255587a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (!hVar.c()) {
            return rd0.e.b(((eed.n) hVar.f125188c).g(accountId, loadingStrategy));
        }
        ubd.i iVar = hVar.f125186a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        return nim.a.u(new e8e.w(hVar, continuation, 10), vkm.q.Q(new v1(new b0(iVar, continuation, 9)), new mki.d(continuation, iVar, accountId, loadingStrategy, 19)));
    }

    public final Flow d(pcd.e filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        eed.h hVar = (eed.h) this.f255587a;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (!hVar.c()) {
            return rd0.e.b(((eed.n) hVar.f125188c).h(loadingStrategy, filter));
        }
        ubd.i iVar = hVar.f125186a;
        lcd.q accountTypeFilter = eed.d.a(filter);
        Intrinsics.checkNotNullParameter(accountTypeFilter, "accountTypeFilter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        return nim.a.u(new eed.g(hVar, continuation, 1), vkm.q.Q(new v1(new b0(iVar, continuation, 9)), new sdi.a(continuation, iVar, accountTypeFilter, 15)));
    }

    public final Object e(String str, gim.i iVar) {
        Object objA;
        eed.h hVar = (eed.h) this.f255587a;
        if (hVar.c()) {
            objA = hVar.f125186a.d(str, iVar);
            if (objA != fim.a.COROUTINE_SUSPENDED) {
                objA = Unit.f186387a;
            }
        } else {
            objA = nim.a.a(((eed.n) hVar.f125188c).i(str, false), iVar);
            if (objA != fim.a.COROUTINE_SUSPENDED) {
                objA = Unit.f186387a;
            }
        }
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final Object f(pcd.b bVar, boolean z, gim.c cVar) {
        Object objA;
        eed.h hVar = (eed.h) this.f255587a;
        if (hVar.c()) {
            objA = hVar.f125186a.e(z, cVar);
            if (objA != fim.a.COROUTINE_SUSPENDED) {
                objA = Unit.f186387a;
            }
        } else {
            objA = nim.a.a(((eed.n) hVar.f125188c).j(bVar, z), cVar);
            if (objA != fim.a.COROUTINE_SUSPENDED) {
                objA = Unit.f186387a;
            }
        }
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final Object g(String str, String str2, long j2, Long l2, gim.i iVar) {
        Object objA;
        eed.h hVar = (eed.h) this.f255587a;
        if (hVar.c()) {
            objA = hVar.f125186a.g(str, str2, new Long(j2), l2, iVar);
            if (objA != fim.a.COROUTINE_SUSPENDED) {
                objA = Unit.f186387a;
            }
        } else {
            objA = nim.a.a(((eed.n) hVar.f125188c).d(str, str2, j2, l2), iVar);
            if (objA != fim.a.COROUTINE_SUSPENDED) {
                objA = Unit.f186387a;
            }
        }
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
