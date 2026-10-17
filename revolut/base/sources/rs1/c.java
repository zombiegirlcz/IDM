package rs1;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import com.revolut.retail.core.ui.error.ErrorNotHandledException;
import io.reactivex.exceptions.CompositeException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import ofm.q;
import retrofit2.HttpException;
import rv1.t;
import sf0.h;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d12.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256929a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f256930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f256931c;

    public c(ic2.c errorProvider, t onboardingInteractor) {
        Intrinsics.checkNotNullParameter(errorProvider, "errorProvider");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        this.f256930b = errorProvider;
        this.f256931c = onboardingInteractor;
    }

    @Override // d12.b
    public final z a(Throwable error) {
        Object next;
        v60.d bVar;
        switch (this.f256929a) {
            case 0:
                Intrinsics.checkNotNullParameter(error, "throwable");
                e1l.a aVar = (e1l.a) this.f256931c;
                Intrinsics.checkNotNullParameter(error, "error");
                if (error instanceof HandledNetworkException) {
                    return null;
                }
                h hVar = aVar.f122001c;
                if (error instanceof ErrorNotHandledException) {
                    return e1l.a.d();
                }
                if (!(error instanceof CompositeException)) {
                    return error instanceof HttpException ? aVar.e(hVar.c((HttpException) error)) : e1l.a.d();
                }
                List list = ((CompositeException) error).f163108a;
                Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (next instanceof HttpException) {
                        }
                    } else {
                        next = null;
                    }
                }
                if (!(next instanceof HttpException)) {
                    next = null;
                }
                HttpException httpException = (HttpException) next;
                return aVar.e(httpException != null ? hVar.c(httpException) : null);
            case 1:
                Intrinsics.checkNotNullParameter(error, "throwable");
                return ((oh2.d) this.f256931c).a(error);
            default:
                Intrinsics.checkNotNullParameter(error, "throwable");
                ic2.c cVar = (ic2.c) this.f256930b;
                Intrinsics.checkNotNullParameter(error, "error");
                if ((error instanceof UserDeclinedTwoFaException) || (error instanceof HandledNetworkException)) {
                    return null;
                }
                ServerError serverErrorA = cVar.f160202a.a(error);
                Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
                v60.e eVar = cVar.f160203b;
                if (numValueOf == null || (bVar = ((ao0.a) eVar).b(numValueOf)) == null) {
                    bVar = new v60.b();
                }
                return new z(q.O(bVar), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // d12.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.c.b(gim.c):java.lang.Object");
    }

    public c(ps1.b bizumInteractor, e1l.a bizumErrorHandler) {
        Intrinsics.checkNotNullParameter(bizumInteractor, "bizumInteractor");
        Intrinsics.checkNotNullParameter(bizumErrorHandler, "bizumErrorHandler");
        this.f256930b = bizumInteractor;
        this.f256931c = bizumErrorHandler;
    }

    public c(qh2.a weroInteractor, oh2.d weroErrorProvider) {
        Intrinsics.checkNotNullParameter(weroInteractor, "weroInteractor");
        Intrinsics.checkNotNullParameter(weroErrorProvider, "weroErrorProvider");
        this.f256930b = weroInteractor;
        this.f256931c = weroErrorProvider;
    }
}
