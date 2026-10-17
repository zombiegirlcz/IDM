package eli;

import a08.f0;
import a08.g0;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorParams;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.kompot.twofa.InvalidTwoFaPushException;
import efm.r;
import ej9.s;
import grl.hb;
import grl.jb;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ms0.j0;
import no.j2;
import okhttp3.Response;
import retrofit2.HttpException;
import tjg.c;
import ulm.j1;
import ulm.x0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements sjg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ujg.a f127477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final msb.j f127478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cn0.h f127479c;
    public final sjg.c d;
    public final msb.i e;
    public final gpk.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2 f127480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ifm.b f127481h;

    public j(ujg.a twoFaRepository, msb.j twoFaServerErrorParser, cn0.h twoFactorCodeProvider, sjg.c pushInteractor, msb.i twoFaOtpResolverProvider, gpk.c ssoReauthenticationResolver, j2 tracker) {
        Intrinsics.checkNotNullParameter(twoFaRepository, "twoFaRepository");
        Intrinsics.checkNotNullParameter(twoFaServerErrorParser, "twoFaServerErrorParser");
        Intrinsics.checkNotNullParameter(twoFactorCodeProvider, "twoFactorCodeProvider");
        Intrinsics.checkNotNullParameter(pushInteractor, "pushInteractor");
        Intrinsics.checkNotNullParameter(twoFaOtpResolverProvider, "twoFaOtpResolverProvider");
        Intrinsics.checkNotNullParameter(ssoReauthenticationResolver, "ssoReauthenticationResolver");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f127477a = twoFaRepository;
        this.f127478b = twoFaServerErrorParser;
        this.f127479c = twoFactorCodeProvider;
        this.d = pushInteractor;
        this.e = twoFaOtpResolverProvider;
        this.f = ssoReauthenticationResolver;
        this.f127480g = tracker;
        this.f127481h = new ifm.b();
    }

    public static hb g(tjg.e eVar) {
        switch (f.f127473a[eVar.ordinal()]) {
            case 1:
                return hb.Push;
            case 2:
                return hb.SMS;
            case 3:
                return hb.Email;
            case 4:
                return hb.Call;
            case 5:
                return hb.Password;
            case 6:
                return hb.App;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void c() {
        if (j()) {
            i();
            ((l) this.f127477a).b(c.a.f271716a);
        }
    }

    public final void d(String url2, zm0.d code) {
        ((l) this.f127477a).b(c.C1515c.f271718a);
        cn0.h hVar = this.f127479c;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(code, "code");
        hVar.f25341a.f(url2, code);
    }

    public final r e(Throwable th10, rjg.a aVar) {
        r rVarF;
        efm.k kVarM;
        Response responseRaw;
        j1 j1Var;
        x0 x0Var;
        en.a aVar2 = mfm.f.f205043c;
        ((nri.a) this.d).init();
        if (!(th10 instanceof HttpException)) {
            return f(th10);
        }
        msb.j jVar = this.f127478b;
        HttpException httpException = (HttpException) th10;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(httpException, "httpException");
        ServerError serverErrorC = jVar.f208656a.c(httpException);
        retrofit2.Response<?> response = httpException.response();
        String str = (response == null || (responseRaw = response.raw()) == null || (j1Var = responseRaw.f226087a) == null || (x0Var = j1Var.f281095a) == null) ? null : x0Var.i;
        if (serverErrorC == null || !nz8.d.f(serverErrorC) || str == null || d0.W(str)) {
            return f(th10);
        }
        if (j() && nz8.d.e(serverErrorC)) {
            i();
        }
        ((l) this.f127477a).b(c.d.f271719a);
        if (nz8.d.c(serverErrorC)) {
            h();
            ((l) this.f127477a).b(new tjg.a(th10));
            rVarF = r.error(th10);
        } else {
            int i = 23;
            int i2 = 17;
            if (nz8.d.d(serverErrorC)) {
                tjg.e from = ((l) this.f127477a).f127485b;
                if (from == tjg.e.PUSH) {
                    InvalidTwoFaPushException invalidTwoFaPushException = new InvalidTwoFaPushException();
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, invalidTwoFaPushException, h0Var);
                    msb.i iVar = this.e;
                    c onFallback = new c(this, 8);
                    Intrinsics.checkNotNullParameter(from, "from");
                    Intrinsics.checkNotNullParameter(onFallback, "onFallback");
                    rfm.n nVar = new rfm.n(new la8.j(iVar, onFallback, i2));
                    Intrinsics.checkNotNullExpressionValue(nVar, "fromAction(...)");
                    ifm.b bVar = this.f127481h;
                    rfm.m mVar = new rfm.m(nVar, new g0(13, new e05.h(new BreadcrumbException(), i)), 2);
                    Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
                    rfm.b bVar2 = new rfm.b(new f0(9, g.f127474a), new f0(9, h.f127475a), aVar2);
                    mVar.i(bVar2);
                    Intrinsics.checkNotNullExpressionValue(bVar2, "subscribe(...)");
                    bVar.a(bVar2);
                } else {
                    h();
                    ((l) this.f127477a).b(new tjg.b(th10));
                }
                rVarF = ((l) this.f127477a).c().doOnError(new s(new c(this, 9), 20)).doOnNext(new s(new e(this, str, 1), 22));
            } else if (nz8.d.e(serverErrorC)) {
                tjg.d dVar = tjg.e.Companion;
                String d = serverErrorC.getD();
                dVar.getClass();
                tjg.e from2 = tjg.d.a(d);
                if (from2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (aVar == null || (kVarM = aVar.a(from2, th10)) == null) {
                    msb.i iVar2 = this.e;
                    ServerErrorParams f51364c = serverErrorC.getF51364c();
                    boolean z = !(f51364c != null ? Intrinsics.f(f51364c.getF51372c(), Boolean.TRUE) : false);
                    c onFallback2 = new c(this, 10);
                    Intrinsics.checkNotNullParameter(from2, "authMethod");
                    Intrinsics.checkNotNullParameter(onFallback2, "onFallback");
                    switch (msb.h.f208653a[from2.ordinal()]) {
                        case 1:
                            msb.g gVar = (msb.g) iVar2.f208655b;
                            efm.d0 d0VarFirstOrError = r.merge(r.timer(gVar.f208652c, TimeUnit.MILLISECONDS).map(new j0(new mqg.b(28), 27)), gVar.d.filter(new j0(new mqg.b(29), 28)).map(new j0(new msb.c(0), 29))).firstOrError();
                            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                            int i3 = 1;
                            msb.e eVar = new msb.e(i3, new msb.c(i3));
                            d0VarFirstOrError.getClass();
                            rfm.j jVar2 = new rfm.j(d0VarFirstOrError, eVar, 0);
                            int i5 = 2;
                            rfm.m mVar2 = new rfm.m(jVar2, new msb.e(i5, new msb.c(i5)), i3);
                            Intrinsics.checkNotNullExpressionValue(mVar2, "map(...)");
                            Intrinsics.checkNotNullParameter(from2, "from");
                            Intrinsics.checkNotNullParameter(onFallback2, "onFallback");
                            rfm.n nVar2 = new rfm.n(new la8.j(iVar2, onFallback2, 17));
                            Intrinsics.checkNotNullExpressionValue(nVar2, "fromAction(...)");
                            kVarM = mVar2.m(nVar2);
                            Intrinsics.checkNotNullExpressionValue(kVarM, "switchIfEmpty(...)");
                            break;
                        case 2:
                            kVarM = efm.k.f(new IllegalArgumentException(from2 + " is not supported"));
                            Intrinsics.checkNotNullExpressionValue(kVarM, "error(...)");
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            kVarM = new rfm.n(new br6.a(iVar2, from2, z, 5));
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                ifm.b bVar3 = this.f127481h;
                c cVar = new c(this, 11);
                rfm.m mVar3 = new rfm.m(kVarM, new g0(13, new e05.h(new BreadcrumbException(), 24)), 2);
                Intrinsics.checkNotNullExpressionValue(mVar3, "onErrorResumeNext(...)");
                rfm.b bVar4 = new rfm.b(new f0(9, cVar), new f0(9, i.f127476a), aVar2);
                mVar3.i(bVar4);
                Intrinsics.checkNotNullExpressionValue(bVar4, "subscribe(...)");
                bVar3.a(bVar4);
                l lVar = (l) this.f127477a;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(from2, "method");
                lVar.f127485b = from2;
                lVar.f127487g.onNext(from2);
                rVarF = ((l) this.f127477a).c().filter(new s(new ei8.d(from2, 14), 23)).doOnError(new s(new c(this, 12), 18)).doOnNext(new s(new e(this, str, 0), 19)).doOnDispose(new b(this, 1));
            } else {
                rVarF = f(th10);
            }
        }
        r rVarTake = rVarF.take(1L);
        Intrinsics.checkNotNullExpressionValue(rVarTake, "take(...)");
        return rVarTake;
    }

    public final r f(Throwable th10) {
        if (j()) {
            h();
            ((l) this.f127477a).b(c.b.f271717a);
        }
        r rVarError = r.error(th10);
        Intrinsics.checkNotNullExpressionValue(rVarError, "error(...)");
        return rVarError;
    }

    public final void h() {
        tjg.e eVar = ((l) this.f127477a).f127485b;
        hb hbVarG = eVar != null ? g(eVar) : null;
        zm0.d dVar = ((l) this.f127477a).f127486c;
        ((com.revolut.analytics.tracking.v3.l) this.f127480g).o3(null, jb.Failure, hbVarG, null);
    }

    public final void i() {
        tjg.e eVar = ((l) this.f127477a).f127485b;
        hb hbVarG = eVar != null ? g(eVar) : null;
        zm0.d dVar = ((l) this.f127477a).f127486c;
        ((com.revolut.analytics.tracking.v3.l) this.f127480g).o3(null, jb.Success, hbVarG, null);
    }

    public final boolean j() {
        return zhm.d0.T(v.k(c.d.f271719a, c.C1515c.f271718a), ((l) this.f127477a).f127484a);
    }
}
