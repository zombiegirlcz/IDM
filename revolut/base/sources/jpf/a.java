package jpf;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.messaging.t;
import com.ironz.binaryprefs.exception.FileOperationException;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.commodities.onboarding.api.CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc;
import com.revolut.feature.global_markets.domain.MarketAsset;
import com.revolut.feature.payments.messaging.common.api.R$string;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.view.RootFrameLayout;
import e1.e;
import e8.v;
import ecm.w0;
import efm.r;
import gsi.g;
import gsi.h;
import ipa.i;
import ipa.l;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lki.x;
import lki.y;
import lki.z;
import retrofit2.Response;
import vc.s;
import w4l.f;
import w4l.k;
import wc.n;
import zb.j;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ge.b, ge.a, g, n, wji.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f177267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f177268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f177269c;

    public /* synthetic */ a(Object obj2, Object obj3, Object obj4) {
        this.f177267a = obj2;
        this.f177268b = obj3;
        this.f177269c = obj4;
    }

    public static File k(String str, File file, String str2) {
        File file2 = new File(new File(new File(file, "preferences"), str), str2);
        file2.mkdirs();
        if (file2.exists()) {
            return file2;
        }
        throw new FileOperationException(j6.a.q("Can't create preferences directory in ", file2.getAbsolutePath()));
    }

    public static ViewGroup o(nri.b bVar) {
        View decorView = bVar.getWindow().getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) decorView;
    }

    public static Method p(Class cls, String str, Class[] clsArr) {
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    return p(cls.getSuperclass(), str, clsArr);
                }
                Method method = cls.getMethod(str, clsArr);
                try {
                    if ((method.getModifiers() & 1) != 0) {
                        return method;
                    }
                } catch (NoSuchMethodException unused) {
                    return method;
                }
            } catch (NoSuchMethodException unused2) {
                return null;
            }
        }
        return null;
    }

    public static r u(a aVar, Object params, long j2) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        r rVarSwitchMap = ((ihm.b) aVar.f177267a).switchMap(new qe0.g(5, new csl.a(aVar, params, j2, 15)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public static r v(a aVar, Object params, long j2, k loadingStrategy) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarSwitchMap = ((ihm.b) aVar.f177267a).switchMap(new qe0.g(2, new e(aVar, params, loadingStrategy, j2, 6)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // wji.d
    public ViewGroup a() {
        return (ViewGroup) this.f177267a;
    }

    @Override // wji.d
    public void add(View view) {
        ViewGroup viewGroup = (ViewGroup) this.f177267a;
        Intrinsics.checkNotNullParameter(view, "view");
        x xVar = (x) this.f177269c;
        if (xVar != null) {
            xVar.g();
        }
        viewGroup.removeView(view);
        viewGroup.addView(view, -1, -1);
    }

    public w0 b() {
        return new w0((List) this.f177267a, (ecm.b) this.f177268b, this.f177269c);
    }

    @Override // gsi.g
    public h build() {
        s.h((xoi.d) this.f177268b, fsi.g.class);
        s.h((RemoteStoriesContract$Config) this.f177269c, RemoteStoriesContract$Config.class);
        return new rza.a((rza.b) this.f177267a, (xoi.d) this.f177268b, (RemoteStoriesContract$Config) this.f177269c);
    }

    @Override // wji.d
    public void c(View view) {
        ViewGroup viewGroup = (ViewGroup) this.f177267a;
        Intrinsics.checkNotNullParameter(view, "view");
        x xVar = (x) this.f177269c;
        if (xVar != null) {
            xVar.g();
        }
        viewGroup.removeView(view);
        viewGroup.addView(view, 0, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // wji.d
    public void d(View view, View view2, TransitionAnimation animation, boolean z, z transitionListener) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(transitionListener, "transitionListener");
        x xVar = (x) this.f177269c;
        if (xVar != null) {
            xVar.g();
        }
        x xVarA = ((y) this.f177268b).a(animation);
        this.f177269c = xVarA;
        xVarA.e(view, view2, z, transitionListener);
    }

    @Override // wji.d
    public void e(y99.c onDismiss) {
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
    }

    @Override // ge.b
    public void g(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f177269c;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // gsi.g
    public Object h(fsi.g gVar) {
        throw null;
    }

    @Override // ge.a
    public void i(Bundle bundle) {
        synchronized (this.f177268b) {
            try {
                fe.c cVar = fe.c.f134428a;
                cVar.e("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f177269c = new CountDownLatch(1);
                ((yf.c) this.f177267a).i(bundle);
                cVar.e("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f177269c).await(500, TimeUnit.MILLISECONDS)) {
                        cVar.e("App exception callback received from Analytics listener.");
                    } else {
                        cVar.f("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                }
                this.f177269c = null;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public j j() {
        String strConcat = ((String) this.f177267a) == null ? " backendName" : "";
        if (((wb.e) this.f177269c) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new j((String) this.f177267a, (byte[]) this.f177268b, (wb.e) this.f177269c);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public void l(Object obj2, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f177267a;
        ye.g gVar = new ye.g(byteArrayOutputStream, map, (HashMap) this.f177268b, (ve.c) this.f177269c);
        if (obj2 == null) {
            return;
        }
        ve.c cVar = (ve.c) map.get(obj2.getClass());
        if (cVar != null) {
            cVar.encode(obj2, gVar);
        } else {
            throw new EncodingException("No encoder for " + obj2.getClass());
        }
    }

    public i m() {
        return new i("CHAT_PUSH_CHANNEL", ((f01.c) this.f177268b).b(new TextLocalisedClause(R$string.social_payments_chat_notification_channel_chat_name, null, null, 14)).toString(), l.HIGH, 0);
    }

    public Method n(Class cls) {
        Class cls2;
        Method methodP = p(cls, (String) this.f177268b, (Class[]) this.f177269c);
        if (methodP == null || (cls2 = (Class) this.f177267a) == null || cls2.isAssignableFrom(methodP.getReturnType())) {
            return methodP;
        }
        return null;
    }

    public boolean q(Response response, ServerError serverError, Function1 function1) {
        return (response == null || response.code() != 403 || serverError == null || serverError.getF51362a() != 9005) ? (function1 == null || serverError == null || !((Boolean) function1.invoke(serverError)).booleanValue()) ? false : true : ((kwl.b) this.f177269c).a(e9b.a.f123938a);
    }

    public Object r(SSLSocket sSLSocket, Object... objArr) {
        Method methodN = n(sSLSocket.getClass());
        if (methodN == null) {
            throw new AssertionError("Method " + ((String) this.f177268b) + " not supported for object " + sSLSocket);
        }
        try {
            return methodN.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodN);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    @Override // wji.d
    public void remove(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public void s(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method methodN = n(sSLSocket.getClass());
            if (methodN == null) {
                return;
            }
            try {
                methodN.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object t(SSLSocket sSLSocket, Object... objArr) {
        try {
            return r(sSLSocket, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Flow w() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        t tVar = (t) this.f177267a;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = rd0.e.b(((f) tVar.e).e(Unit.f186387a, loadingStrategy));
        final int i = 0;
        akg.n nVarV = nim.a.v(dVarB, new Function1(this) { // from class: a87.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ jpf.a f2119b;

            {
                this.f2119b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List assets = (List) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(assets, "assets");
                        if (!((jte.d) ((gte.a) this.f2119b.f177269c)).c(CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc.f65947c)) {
                            return assets;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : assets) {
                            if (!(((MarketAsset) obj3) instanceof MarketAsset.Commodity)) {
                                arrayList.add(obj3);
                            }
                        }
                        return arrayList;
                    default:
                        Intrinsics.checkNotNullParameter(assets, "marketAssets");
                        ue0.c cVar = ((t77.i) this.f2119b.f177268b).f268602a;
                        Type STORAGE_TYPE = t77.i.f268601b;
                        Intrinsics.checkNotNullExpressionValue(STORAGE_TYPE, "STORAGE_TYPE");
                        return new a3i.i(new qij.s(cVar.C0("pinned_assets", STORAGE_TYPE), 24), assets, 4);
                }
            }
        });
        final int i2 = 1;
        return c6d.b.i(nVarV, new Function1(this) { // from class: a87.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ jpf.a f2119b;

            {
                this.f2119b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List assets = (List) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(assets, "assets");
                        if (!((jte.d) ((gte.a) this.f2119b.f177269c)).c(CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc.f65947c)) {
                            return assets;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : assets) {
                            if (!(((MarketAsset) obj3) instanceof MarketAsset.Commodity)) {
                                arrayList.add(obj3);
                            }
                        }
                        return arrayList;
                    default:
                        Intrinsics.checkNotNullParameter(assets, "marketAssets");
                        ue0.c cVar = ((t77.i) this.f2119b.f177268b).f268602a;
                        Type STORAGE_TYPE = t77.i.f268601b;
                        Intrinsics.checkNotNullExpressionValue(STORAGE_TYPE, "STORAGE_TYPE");
                        return new a3i.i(new qij.s(cVar.C0("pinned_assets", STORAGE_TYPE), 24), assets, 4);
                }
            }
        });
    }

    public void x(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f177267a = str;
    }

    @Override // wc.n
    public /* bridge */ /* synthetic */ Object zza() {
        return new vc.n(wc.l.a((n) this.f177267a), wc.l.a((n) this.f177268b), wc.l.a((n) this.f177269c));
    }

    public a(Function1 fromNetwork, Function1 function1, Function2 function2, e8h.a aVar, e8h.b bVar, int i) {
        Function1 fromMemory = (i & 2) != 0 ? qe0.h.f245028a : function1;
        Function2 toMemory = (i & 4) != 0 ? new pq0.d(2) : function2;
        Function1 fromStorage = (i & 8) != 0 ? qe0.i.f245029a : aVar;
        Function2 toStorage = (i & 16) != 0 ? new pq0.d(3) : bVar;
        jli.f onRemove = new jli.f(27);
        Intrinsics.checkNotNullParameter(fromNetwork, "fromNetwork");
        Intrinsics.checkNotNullParameter(fromMemory, "fromMemory");
        Intrinsics.checkNotNullParameter(toMemory, "toMemory");
        Intrinsics.checkNotNullParameter(fromStorage, "fromStorage");
        Intrinsics.checkNotNullParameter(toStorage, "toStorage");
        Intrinsics.checkNotNullParameter(onRemove, "onRemove");
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f177267a = bVarE;
        this.f177268b = new f(new akl.t(fromNetwork, 7), fromMemory, toMemory, fromStorage, toStorage, onRemove, null, null, 192);
        this.f177269c = new qe0.f(fromNetwork, new bp0.r(this, 2), new jli.f(28), new jli.f(29));
    }

    public a(v60.e serverErrorsProvider, Set domainServerErrorHandlers, kwl.b errorEventHandler) {
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(domainServerErrorHandlers, "domainServerErrorHandlers");
        Intrinsics.checkNotNullParameter(errorEventHandler, "errorEventHandler");
        this.f177267a = serverErrorsProvider;
        this.f177268b = domainServerErrorHandlers;
        this.f177269c = errorEventHandler;
    }

    public a(ViewGroup container, gki.j jVar) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f177267a = container;
        this.f177268b = new y(jVar);
        if (!(container instanceof hli.e) && !(container instanceof RootFrameLayout)) {
            throw new IllegalStateException("Controller's container must implement ControllerContainer interface");
        }
    }

    public a(e8.s sVar, u8.j jVar, v vVar) {
        this.f177269c = sVar;
        this.f177268b = jVar;
        this.f177267a = vVar;
    }
}
