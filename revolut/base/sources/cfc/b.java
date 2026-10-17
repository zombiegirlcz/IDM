package cfc;

import ang.f;
import do3.n;
import ffc.c;
import gr6.e;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.a f23673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f23674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ad1.a f23675c;
    public final f d;
    public final c e;

    public b(gr6.a freelancerAccountDetailsInteractor, e freelancerAvailabilityInteractor, ad1.a amountInteractor, f userInteractor, c requirementsRepository) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(amountInteractor, "amountInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(requirementsRepository, "requirementsRepository");
        this.f23673a = freelancerAccountDetailsInteractor;
        this.f23674b = freelancerAvailabilityInteractor;
        this.f23675c = amountInteractor;
        this.d = userInteractor;
        this.e = requirementsRepository;
    }

    public final String a() {
        Object objE = this.d.f(false).e();
        Intrinsics.checkNotNullExpressionValue(objE, "blockingGet(...)");
        n nVar = (n) objE;
        String[] elements = {nVar.f116410c, nVar.d, nVar.e};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        m70.a.t(t0.f186434a);
        return d0.k0(listL, " ", null, null, 0, null, 62);
    }
}
