package s8a;

import kotlin.jvm.internal.Intrinsics;
import n8a.x;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f260949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xua.a f260950b;

    public f(x repository, xua.a recurringPaymentInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        this.f260949a = repository;
        this.f260950b = recurringPaymentInteractor;
    }

    public final vkm.d a(String authorisationId) {
        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
        x xVar = this.f260949a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
        return xVar.e.b(authorisationId, w4l.i.f294643c);
    }
}
