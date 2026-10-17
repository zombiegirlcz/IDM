package jfb;

import com.revolut.core.ui_kit.delegates.FullScreenDocumentLoadingDelegate;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreen;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$InputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReverywhereWebAppScreen f173790b;

    public /* synthetic */ c0(ReverywhereWebAppScreen reverywhereWebAppScreen, int i) {
        this.f173789a = i;
        this.f173790b = reverywhereWebAppScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f173789a;
        int i2 = 1;
        int i3 = 2;
        Object[] objArr = 0;
        ReverywhereWebAppScreen reverywhereWebAppScreen = this.f173790b;
        switch (i) {
            case 0:
                return new c(reverywhereWebAppScreen.X, new j75.i(reverywhereWebAppScreen, 6), new b0(reverywhereWebAppScreen, i2));
            case 1:
                KProperty[] kPropertyArr = ReverywhereWebAppScreen.g0;
                return new z4l.j(7, zhm.v.k(new FullScreenDocumentLoadingDelegate(), reverywhereWebAppScreen.f82917e0), false);
            case 2:
                KProperty[] kPropertyArr2 = ReverywhereWebAppScreen.g0;
                dfb.d dVarE3 = reverywhereWebAppScreen.e3();
                dVarE3.getClass();
                return new f1((x0) dVarE3.f113848c.get());
            case 3:
                KProperty[] kPropertyArr3 = ReverywhereWebAppScreen.g0;
                dfb.d dVarE32 = reverywhereWebAppScreen.e3();
                dVarE32.getClass();
                return new d1((x0) dVarE32.f113848c.get());
            case 4:
                KProperty[] kPropertyArr4 = ReverywhereWebAppScreen.g0;
                reverywhereWebAppScreen.e3().getClass();
                return new g1();
            case 5:
                KProperty[] kPropertyArr5 = ReverywhereWebAppScreen.g0;
                return new x(reverywhereWebAppScreen.e3().f113847b.f113837m.a());
            case 6:
                KProperty[] kPropertyArr6 = ReverywhereWebAppScreen.g0;
                return (a0) reverywhereWebAppScreen.e3().e.get();
            case 7:
                KProperty[] kPropertyArr7 = ReverywhereWebAppScreen.g0;
                return reverywhereWebAppScreen.e3().b();
            case 8:
                KProperty[] kPropertyArr8 = ReverywhereWebAppScreen.g0;
                phm.a aVar = (phm.a) ue0.e.j(reverywhereWebAppScreen.m2()).a().get(dfb.b.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", dfb.b.class, " is not found"));
                }
                dfb.b bVar = ((dfb.b) aVar2.b()).f113839p;
                ReverywhereWebAppScreenContract$InputData reverywhereWebAppScreenContract$InputData = reverywhereWebAppScreen.K;
                reverywhereWebAppScreenContract$InputData.getClass();
                return new dfb.d(bVar, reverywhereWebAppScreen, reverywhereWebAppScreenContract$InputData);
            case 9:
                KProperty[] kPropertyArr9 = ReverywhereWebAppScreen.g0;
                return (h0) reverywhereWebAppScreen.e3().f.get();
            case 10:
                if (!reverywhereWebAppScreen.V) {
                    reverywhereWebAppScreen.h3().evaluateJavascript(((x) reverywhereWebAppScreen.R.getValue()).a(reverywhereWebAppScreen.K.getD()), null);
                }
                a0 a0VarG3 = reverywhereWebAppScreen.g3();
                l80.e eVar = a0VarG3.f173771b;
                a0VarG3.f = System.currentTimeMillis();
                return Unit.f186387a;
            case 11:
                return Boolean.valueOf(reverywhereWebAppScreen.U);
            case 12:
                KProperty[] kPropertyArr10 = ReverywhereWebAppScreen.g0;
                com.revolut.feature.retail.reverywhere.impl.web_app.d dVar = (com.revolut.feature.retail.reverywhere.impl.web_app.d) reverywhereWebAppScreen.f3();
                a2 a2Var = dVar.f82941w;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                dVar.H2(dVar.B, new je5.n(14));
                reverywhereWebAppScreen.h3().evaluateJavascript("\n            (function() {\n              try {\n                if (window.__fcpObserverRegistered) return;\n                window.__fcpObserverRegistered = true;\n                new PerformanceObserver(function(list) {\n                  var entries = list.getEntries();\n                  for (var i = 0; i < entries.length; i++) {\n                    if (entries[i].name === 'first-contentful-paint') {\n                      AndroidPerf.postFcp(JSON.stringify({\n                        fcpStartTime: entries[i].startTime,\n                        timeOrigin: performance.timeOrigin\n                      }));\n                    }\n                  }\n                }).observe({type: 'paint', buffered: true});\n              } catch(e){}\n            })()\n        ", null);
                reverywhereWebAppScreen.h3().evaluateJavascript("\n            (function() {\n              try {\n                var nav = performance.getEntriesByType('navigation')[0];\n                if (!nav) return;\n                var data = {timeOrigin: performance.timeOrigin, responseStart: nav.responseStart};\n                try {\n                  if (nav.responseStatus !== undefined) data.httpStatus = nav.responseStatus;\n                } catch(e){}\n                AndroidPerf.postTimingFull(JSON.stringify(data));\n              } catch(e){}\n            })()\n        ", null);
                return Unit.f186387a;
            case 13:
                KProperty[] kPropertyArr11 = ReverywhereWebAppScreen.g0;
                com.revolut.feature.retail.reverywhere.impl.web_app.d dVar2 = (com.revolut.feature.retail.reverywhere.impl.web_app.d) reverywhereWebAppScreen.f3();
                cli.y yVar = dVar2.B;
                a2 a2Var2 = dVar2.f82941w;
                if (a2Var2 != null) {
                    a2Var2.f(null);
                }
                if (((com.revolut.feature.retail.reverywhere.impl.web_app.b) ((j2) yVar.f22677a).getValue()).e < 2) {
                    dVar2.J2(((com.revolut.feature.retail.reverywhere.impl.web_app.b) ((j2) yVar.f22677a).getValue()).e + 1);
                } else {
                    dVar2.H2(yVar, new je5.n(12));
                }
                return Unit.f186387a;
            case 14:
                KProperty[] kPropertyArr12 = ReverywhereWebAppScreen.g0;
                return n14.e.a(reverywhereWebAppScreen, reverywhereWebAppScreen.f3());
            case 15:
                reverywhereWebAppScreen.f82914a0 = false;
                ((com.revolut.feature.retail.reverywhere.impl.web_app.d) reverywhereWebAppScreen.f3()).B2();
                return Unit.f186387a;
            default:
                KProperty[] kPropertyArr13 = ReverywhereWebAppScreen.g0;
                com.revolut.feature.retail.reverywhere.impl.web_app.d dVar3 = (com.revolut.feature.retail.reverywhere.impl.web_app.d) reverywhereWebAppScreen.f3();
                dVar3.getClass();
                dVar3.l2(new s0(dVar3, objArr == true ? 1 : 0, i3), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
