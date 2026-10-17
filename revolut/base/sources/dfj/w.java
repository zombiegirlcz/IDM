package dfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfj.k f114137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f114138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cej.b f114139c;
    public final i1 d;

    public w(nfj.k repository, k0 esimInstallationStateInteractor, cej.b mobilePlansFeatureAvailabilityInteractor, i1 phoneNumberInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(phoneNumberInteractor, "phoneNumberInteractor");
        this.f114137a = repository;
        this.f114138b = esimInstallationStateInteractor;
        this.f114139c = mobilePlansFeatureAvailabilityInteractor;
        this.d = phoneNumberInteractor;
    }

    public static Object e(w wVar, gim.i iVar) {
        Object objB = ((nfj.p) wVar.f114137a).b(iVar, null, true);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    public final wkm.d a(String str, String str2, String str3, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (!((efj.d) this.f114139c).a()) {
            return nfj.k.a(this.f114137a, loadingStrategy, null, null, null, str2, str3, 14);
        }
        return vkm.q.Q(this.f114138b.d(loadingStrategy), new v(0, str3, this, loadingStrategy, str, str2, null));
    }

    public final akg.n c(String dataPlanId, String str) {
        Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((efj.d) this.f114139c).a() ? nim.a.v(vkm.q.Q(this.f114138b.d(loadingStrategy), new a67.c((Continuation) null, this, dataPlanId, str, 13)), new d7a.p(dataPlanId, 12)) : nim.a.v(nfj.k.a(this.f114137a, loadingStrategy, null, null, null, null, str, 30), new d7a.p(dataPlanId, 13));
    }

    public final akg.n d(List mobilePlanIds, String str, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(mobilePlanIds, "mobilePlanIds");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        List<String> list = mobilePlanIds;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (String mobilePlanId : list) {
            i1 i1Var = this.d;
            i1Var.getClass();
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            nfj.u0 u0Var = (nfj.u0) i1Var.f113996a;
            u0Var.getClass();
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            arrayList.add(u0Var.f215055g.b(new nfj.o0(mobilePlanId, str), loadingStrategy));
        }
        return nim.a.v(hb9.b.x(zh9.u0.k(arrayList), zhm.f0.f322471a), new dee.x(6));
    }
}
