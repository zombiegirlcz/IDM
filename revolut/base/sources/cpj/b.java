package cpj;

import cn0.g;
import efm.d0;
import efm.r;
import fpj.e;
import hx7.l;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import mm0.n;
import te0.w;
import ufm.i;
import w4l.h;
import w4l.k;
import yoj.d;
import yoj.f;
import zm0.c;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements xoj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f107969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f107970b;

    public b(e featuresRepository, fk3.a configurationInteractor, c sessionProvider) {
        Intrinsics.checkNotNullParameter(featuresRepository, "featuresRepository");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f107969a = featuresRepository;
        this.f107970b = sessionProvider;
    }

    public final d0 e(yoj.c name, d defaultState) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defaultState, "defaultState");
        yoj.a aVarX = l.x(name, defaultState);
        if (!(((g) this.f107970b).d() instanceof n)) {
            ufm.b bVarM = d0.m(aVarX);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        d0 d0VarFirstOrError = zi0.c.q(this.f107969a.a(name, h.f294642c), aVarX).firstOrError();
        Intrinsics.h(d0VarFirstOrError);
        return d0VarFirstOrError;
    }

    public final i f(yoj.c name, d defaultState) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defaultState, "defaultState");
        i iVar = new i(e(name, defaultState), new com.onfido.android.sdk.capture.ui.userconsent.c(new com.revolut.feature.alipay_plus.mpm.webcontainer.a(19), 15), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final yoj.a g(yoj.c featureName, d defaultState) {
        Intrinsics.checkNotNullParameter(featureName, "name");
        Intrinsics.checkNotNullParameter(defaultState, "defaultState");
        yoj.a aVarX = l.x(featureName, defaultState);
        if (((g) this.f107970b).d() instanceof n) {
            e eVar = this.f107969a;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(featureName, "featureName");
            f fVar = (f) eVar.f137111b.get(ib.b.Features);
            yoj.a aVar = null;
            Object obj2 = null;
            if (fVar != null) {
                Iterator it8 = fVar.a().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (((yoj.a) next).a() == featureName) {
                        obj2 = next;
                        break;
                    }
                }
                aVar = (yoj.a) obj2;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return aVarX;
    }

    public final d0 h() {
        if (!(((g) this.f107970b).d() instanceof n)) {
            f.Companion.getClass();
            return w.j(yoj.e.a());
        }
        r rVarN = mo3.a.n(this.f107969a.b(false));
        f.Companion.getClass();
        d0 d0VarFirstOrError = zi0.c.q(rVarN, yoj.e.a()).firstOrError();
        Intrinsics.h(d0VarFirstOrError);
        return d0VarFirstOrError;
    }

    public final efm.b i() {
        return this.f107969a.e.g(new fpj.d(null, true), true);
    }

    public final r j(yoj.c name, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarDistinctUntilChanged = zi0.c.q(this.f107969a.a(name, loadingStrategy), l.x(name, d.DISABLED)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final r k(yoj.c name, d defaultState) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defaultState, "defaultState");
        r rVarDistinctUntilChanged = nim.a.w(this.f107969a.b(false), new a(name, l.x(name, defaultState), 0)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final r l(yoj.c name) {
        Intrinsics.checkNotNullParameter(name, "name");
        r map = j(name, h.f294642c).map(new com.onfido.android.sdk.capture.ui.userconsent.c(new com.revolut.feature.alipay_plus.mpm.webcontainer.a(17), 13));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final r m(yoj.c name, d defaultState) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defaultState, "defaultState");
        yoj.a aVarX = l.x(name, defaultState);
        r map = zi0.c.q(nim.a.w(this.f107969a.b(false), new a(name, aVarX, 1)), aVarX).map(new com.onfido.android.sdk.capture.ui.userconsent.c(new com.revolut.feature.alipay_plus.mpm.webcontainer.a(18), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final pfm.a n() {
        e eVar = this.f107969a;
        eVar.getClass();
        pfm.h hVar = new pfm.h(new a08.d(eVar, 21), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        pfm.a aVarE = hVar.e(eVar.e.g(new fpj.d(null, true), true));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
