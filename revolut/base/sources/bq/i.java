package bq;

import android.app.Activity;
import android.content.Context;
import bp0.y;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import cpi.p;
import ecm.q;
import eoi.u;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ljl.h2;
import ljl.i2;
import nii.t0;
import sri.m;
import sri.o;
import uo.q0;
import vc.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements e4m.e {
    public static t0 A(BaseDelegatesActivity activity) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new t0(activity);
    }

    public static mz0.a B(Activity context) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "activity");
        com.bumptech.glide.c.k(context).getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new mz0.a();
    }

    public static Activity a(BaseDelegatesActivity baseDelegatesActivity) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(baseDelegatesActivity, "baseDelegatesActivity");
        s.k(baseDelegatesActivity);
        return baseDelegatesActivity;
    }

    public static Activity b(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        Activity activity = coreActivityApi.getActivity();
        s.k(activity);
        return activity;
    }

    public static m c(Activity activity, Integer num) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        return o.c(activity, num, null, 12);
    }

    public static pri.f d(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        pri.f fVarW0 = coreActivityApi.w0();
        s.k(fVarW0);
        return fVarW0;
    }

    public static tri.c e(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        tri.c cVarU0 = coreActivityApi.u0();
        s.k(cVarU0);
        return cVarU0;
    }

    public static BaseDelegatesActivity f(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        BaseDelegatesActivity baseDelegatesActivityV0 = coreActivityApi.v0();
        s.k(baseDelegatesActivityV0);
        return baseDelegatesActivityV0;
    }

    public static ty0.c g(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        ty0.c cVarB0 = coreActivityApi.b0();
        s.k(cVarB0);
        return cVarB0;
    }

    public static Context h(BaseDelegatesActivity baseDelegatesActivity) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(baseDelegatesActivity, "baseDelegatesActivity");
        s.k(baseDelegatesActivity);
        return baseDelegatesActivity;
    }

    public static Context i(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        Context context = coreActivityApi.getContext();
        s.k(context);
        return context;
    }

    public static yy0.f j(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        yy0.f fVarQ = coreActivityApi.Q();
        s.k(fVarQ);
        return fVarQ;
    }

    public static Set k(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        Set setQ0 = coreActivityApi.q0();
        s.k(setQ0);
        return setQ0;
    }

    public static m l(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        m mVarP0 = coreActivityApi.p0();
        s.k(mVarP0);
        return mVarP0;
    }

    public static oe.c m(Activity activity) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        xoi.e eVarK = com.bumptech.glide.c.k(activity);
        eVarK.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        poi.b bVar = eVarK.f307859a;
        uo.b activeScreenHolder = bVar.b();
        q0 screenNameFinder = bVar.j();
        aoi.c analyticsInteractor = aoi.g.a();
        q progressDialogFactory = new q(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(progressDialogFactory, "progressDialogFactory");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        u screenNameProvider = new u(screenNameFinder);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(progressDialogFactory, "progressDialogFactory");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        eoi.c sessionMetricsAggregator = eoi.c.f127919a;
        Intrinsics.checkNotNullParameter(sessionMetricsAggregator, "sessionMetricsAggregator");
        Intrinsics.checkNotNullParameter(screenNameProvider, "screenNameProvider");
        oe.c cVar = new oe.c();
        cVar.f224497a = activity;
        cVar.f224498b = activeScreenHolder;
        cVar.f224499c = screenNameFinder;
        cVar.d = progressDialogFactory;
        cVar.e = analyticsInteractor;
        cVar.f = sessionMetricsAggregator;
        cVar.f224500g = screenNameProvider;
        return cVar;
    }

    public static h01.b n(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        h01.b bVarZ = coreActivityApi.Z();
        s.k(bVarZ);
        return bVarZ;
    }

    public static f01.c o(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        return new f01.c(coreActivityApi.getActivity());
    }

    public static mz0.a p(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        mz0.a aVarV = coreActivityApi.V();
        s.k(aVarV);
        return aVarV;
    }

    public static y q(Activity activity) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        return com.bumptech.glide.c.k(activity).a(activity);
    }

    public static q r(cpi.g gVar) {
        gVar.getClass();
        return new q(new cpi.f(gVar, 1));
    }

    public static gl3.f s(z70.a contextProvider, y80.a permissionProvider, gl3.g structuredNameWrapper) {
        hl3.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(structuredNameWrapper, "structuredNameWrapper");
        return new gl3.f(contextProvider.getContext(), permissionProvider, structuredNameWrapper);
    }

    public static f9b.f t(fsi.g coreActivityApi) {
        jsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        f9b.f fVarR0 = coreActivityApi.r0();
        s.k(fVarR0);
        return fVarR0;
    }

    public static a3l.a u(Activity activity) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.bumptech.glide.c.k(activity).getClass();
        return xoi.e.b(activity);
    }

    public static Set v(Set mandatoryDelegates) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(mandatoryDelegates, "mandatoryDelegates");
        s.k(mandatoryDelegates);
        return mandatoryDelegates;
    }

    public static jz0.b w(Activity context) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "activity");
        com.bumptech.glide.c.k(context).getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        a3l.a aVarB = xoi.e.b(context);
        Intrinsics.checkNotNullParameter(context, "context");
        return new jz0.b(aVarB, new mz0.a());
    }

    public static q x(p pVar) {
        pVar.getClass();
        return new q(new af0.a(6));
    }

    public static h01.b y(Activity activity) {
        hsi.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.bumptech.glide.c.k(activity).getClass();
        ww0.b bVarC = xoi.e.c(activity);
        s.k(bVarC);
        return bVarC;
    }

    public static xe0.e z(i2 i2Var, le0.a mapper, fni.a nativeValuesProvider, xe0.f storageFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(nativeValuesProvider, "nativeValuesProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, new h2(nativeValuesProvider, 0), "sso_authentication_session", mapper, 0, null, 56);
    }
}
