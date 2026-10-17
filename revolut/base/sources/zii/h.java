package zii;

import aii.k;
import aii.l;
import aii.o;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.network.exceptions.ForceNetworkConnectionException;
import efm.c0;
import efm.r;
import io.reactivex.exceptions.CompositeException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import org.jetbrains.annotations.NotNull;
import pfm.t;
import w38.w;
import zc0.m;
import zc0.x2;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements j, i {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f322575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f322576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ifm.b f322577c;

    public h(j rxSubscriptionApiOwner, ifm.b finishCompositeDisposable, ifm.b hideCompositeDisposable) {
        Intrinsics.checkNotNullParameter(rxSubscriptionApiOwner, "rxSubscriptionApiOwner");
        Intrinsics.checkNotNullParameter(finishCompositeDisposable, "finishCompositeDisposable");
        Intrinsics.checkNotNullParameter(hideCompositeDisposable, "hideCompositeDisposable");
        this.f322575a = rxSubscriptionApiOwner;
        this.f322576b = finishCompositeDisposable;
        this.f322577c = hideCompositeDisposable;
    }

    public static aii.i h(Throwable cause, boolean z) {
        if (tj0.a.a(cause) && z) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            cause = new ForceNetworkConnectionException(cause);
        }
        return new aii.i(cause, (aii.a) null, 6);
    }

    public static Throwable i(Throwable th10) {
        if (!(th10 instanceof CompositeException)) {
            return th10;
        }
        List list = ((CompositeException) th10).f163108a;
        if (list.size() != 1) {
            return th10;
        }
        Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
        Object objB0 = d0.b0(list);
        Intrinsics.checkNotNullExpressionValue(objB0, "first(...)");
        return (Throwable) objB0;
    }

    @Override // zii.i
    public final ifm.c E(r rVar, Function1 onNext, Function1 handleError, m onComplete, c onSubscribe) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        r rVarDoOnSubscribe = rVar.doOnSubscribe(new zh7.a(29, new a(this, 4)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnSubscribe, "doOnSubscribe(...)");
        ifm.c cVarD = d(rVarDoOnSubscribe, onNext, handleError, onComplete, onSubscribe);
        this.f322577c.a(cVarD);
        return cVarD;
    }

    @Override // zii.j
    public final o O0() {
        return this.f322575a.O0();
    }

    public final boolean a(Throwable th10) {
        if (th10 instanceof CompositeException) {
            List list = ((CompositeException) th10).f163108a;
            Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
            List<Throwable> list2 = list;
            boolean z = list2 instanceof Collection;
            if (!z || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (((Throwable) it8.next()) instanceof BreadcrumbException) {
                    }
                }
            }
            Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
            if (z && list2.isEmpty()) {
                return false;
            }
            for (Throwable th11 : list2) {
                Intrinsics.h(th11);
                if (a(th11)) {
                    return true;
                }
            }
            return false;
        }
        return Intrinsics.f(this.f322575a.O0().M0(new l(th10)), k.f5289a);
    }

    public final void b(Throwable th10, boolean z) {
        boolean z3 = th10 instanceof CompositeException;
        j jVar = this.f322575a;
        if (z3) {
            List list = ((CompositeException) th10).f163108a;
            Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
            List<Throwable> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (((Throwable) it8.next()) instanceof BreadcrumbException) {
                    }
                }
            }
            Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
            for (Throwable th11 : list2) {
                o oVarO0 = jVar.O0();
                Intrinsics.h(th11);
                oVarO0.M0(h(th11, z));
            }
            return;
        }
        jVar.O0().M0(h(th10, z));
    }

    public final ifm.c d(r rVar, Function1 function1, Function1 handleError, Function0 function0, Function1 function12) {
        j jVar = this.f322575a;
        if (jVar.u0() != null) {
            rVar = rVar.observeOn(jVar.u0());
        }
        Intrinsics.checkNotNullExpressionValue(rVar, "run(...)");
        r rVarOnErrorResumeNext = rVar.onErrorResumeNext(new o0(29, new x2(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullParameter(rVarOnErrorResumeNext, "<this>");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        r rVarDoOnError = rVarOnErrorResumeNext.onErrorResumeNext(new zh7.a(25, new c(this, 0))).doOnError(new zh7.a(26, new d(this, handleError, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnError, "doOnError(...)");
        ifm.c cVarSubscribe = rVarDoOnError.subscribe(new w(8, function1), new x2l.a(28, new zg6.c(29)), new b(0, function0), new w(9, function12));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        return cVarSubscribe;
    }

    @Override // zii.j
    public final void d0(boolean z, boolean z3) {
        this.f322575a.d0(z, false);
    }

    public final ofm.i e(ufm.f fVar, Function1 function1, Function1 handleError) {
        j jVar = this.f322575a;
        ufm.f fVarN = fVar;
        if (jVar.u0() != null) {
            fVarN = fVar.n(jVar.u0());
        }
        ufm.i iVar = new ufm.i(fVarN, new o0(29, new x2(new BreadcrumbException(), 2)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        ufm.f fVar2 = new ufm.f(new ufm.i(iVar, new zh7.a(27, new c(this, 2)), 2), new zh7.a(28, new d(this, handleError, 1)), 1);
        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnError(...)");
        ofm.i iVar2 = new ofm.i(new w(10, function1), new x2l.a(29, new c(1)), 0);
        fVar2.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        return iVar2;
    }

    public final ofm.i f(efm.d0 d0Var, Function1 onSuccess, Function1 handleError) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        ufm.f fVar = new ufm.f(d0Var, new zh7.a(21, new a(this, 1)), 2);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSubscribe(...)");
        ofm.i iVarE = e(fVar, onSuccess, handleError);
        this.f322576b.a(iVarE);
        return iVarE;
    }

    public final ofm.i g(efm.d0 d0Var, Function1 onSuccess, Function1 handleError) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        ufm.f fVar = new ufm.f(d0Var, new zh7.a(24, new a(this, 3)), 2);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSubscribe(...)");
        ofm.i iVarE = e(fVar, onSuccess, handleError);
        this.f322577c.a(iVarE);
        return iVarE;
    }

    @Override // zii.j
    public final c0 u0() {
        return this.f322575a.u0();
    }

    @Override // zii.i
    public final ifm.c w0(r rVar, Function1 onNext, Function1 handleError, m onComplete, c onSubscribe) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        r rVarDoOnSubscribe = rVar.doOnSubscribe(new zh7.a(23, new a(this, 2)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnSubscribe, "doOnSubscribe(...)");
        ifm.c cVarD = d(rVarDoOnSubscribe, onNext, handleError, onComplete, onSubscribe);
        this.f322576b.a(cVarD);
        return cVarD;
    }

    @Override // zii.i
    public final ofm.h y0(efm.b bVar, boolean z, Function0 onComplete, Function1 handleError) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        zh7.a aVar = new zh7.a(22, new a(this, 0));
        dfm.c cVar = mfm.f.d;
        en.a aVar2 = mfm.f.f205043c;
        efm.b tVar = new t(bVar, aVar, cVar, aVar2, aVar2, aVar2, aVar2);
        Intrinsics.checkNotNullExpressionValue(tVar, "doOnSubscribe(...)");
        j jVar = this.f322575a;
        if (jVar.u0() != null) {
            tVar = tVar.t(jVar.u0());
        }
        Intrinsics.checkNotNullExpressionValue(tVar, "run(...)");
        pfm.a aVar3 = new pfm.a(tVar, new o0(29, new x2(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullParameter(aVar3, "<this>");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        efm.b bVarM = new pfm.a(aVar3, new zh7.a(19, new zg6.c(this, 28)), 2).m(new zh7.a(20, new wo5.a(this, z, handleError, 9)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "doOnError(...)");
        if (z) {
            bVarM = new pfm.l(new t(bVarM, new e(new a(this, 5), 0), cVar, aVar2, aVar2, aVar2, aVar2), new z6l.a(this, 5), 0);
        }
        ofm.h hVarW = bVarM.w(new f(new c(3)), new b(1, onComplete));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        this.f322576b.a(hVarW);
        return hVarW;
    }
}
