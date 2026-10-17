package lp;

import android.R;
import android.app.Activity;
import android.view.View;
import com.revolut.retail.common.ui.R$id;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class l9 implements e4m.e {
    public static BaseDelegatesActivity a(u2l.a baseActivity) {
        m41.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        vc.s.k(baseActivity);
        return baseActivity;
    }

    public static fsi.a b(Activity activity, xo.f factory) {
        xoi.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(factory, "factory");
        fsi.c cVarA = factory.a(new rp0.j(activity));
        vc.s.k(cVarA);
        return cVarA;
    }

    public static fsi.a c(u2l.a activity, xo.f factory) {
        m41.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(factory, "factory");
        fsi.c cVarA = factory.a(new rp0.j(activity));
        vc.s.k(cVarA);
        return cVarA;
    }

    public static c86.g d(ao.h factory, sri.m navigator, asi.d userSessionInteractor, mli.e userCleanerInteractor, uil.a revolutAccountsManager, com.revolut.retail.feature.api.userauth.navigation.a userOnboardingNavigationProvider, tpi.j progressView) {
        xoi.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        Intrinsics.checkNotNullParameter(userCleanerInteractor, "userCleanerInteractor");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(userOnboardingNavigationProvider, "userOnboardingNavigationProvider");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        efm.b logoutAction = (efm.b) userCleanerInteractor.f206964a.d.getValue();
        ufm.i navigateCommand = com.revolut.retail.feature.api.userauth.navigation.a.a(userOnboardingNavigationProvider, false, new UserOnboardingNavigationProvider$UseCase.SignIn(0), 3);
        bfe.b clearAccountsAction = new bfe.b(revolutAccountsManager, null, 1);
        xge.h isUserAuthorized = new xge.h(userSessionInteractor, 6);
        Intrinsics.checkNotNullParameter(clearAccountsAction, "clearAccountsAction");
        Intrinsics.checkNotNullParameter(isUserAuthorized, "isUserAuthorized");
        Intrinsics.checkNotNullParameter(logoutAction, "logoutAction");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigateCommand, "navigateCommand");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        return new c86.g(pd.b.n(skm.p0.f264003c, new az0.r1(clearAccountsAction, null, 1)), isUserAuthorized, logoutAction, navigator, navigateCommand, (f86.a) factory.f7847b, (ue0.c) factory.f7848c, progressView);
    }

    public static Set e(xoi.j jVar, kwl.a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Set setB = zhm.y0.b(factory.f190371c);
        vc.s.k(setB);
        return setB;
    }

    public static kg.o f(kg.o gson, s90.a backendFlowGsonBuilderConfigurator) {
        x90.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(backendFlowGsonBuilderConfigurator, "backendFlowGsonBuilderConfigurator");
        kg.p pVar = new kg.p(gson);
        Intrinsics.checkNotNullExpressionValue(pVar, "newBuilder(...)");
        s90.a.a(pVar);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static mn.d g(u2l.a activity, no.j2 settingsTracker) {
        m41.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(settingsTracker, "settingsTracker");
        return new mn.d(activity, settingsTracker);
    }

    public static kwl.b h(xoi.j jVar, kwl.a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new kwl.b(factory.f190369a, factory.f190370b);
    }

    public static Retrofit i(kg.o gson, Retrofit retrofit) {
        x90.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        builderNewBuilder.converterFactories().clear();
        Retrofit retrofitBuild = builderNewBuilder.addConverterFactory(GsonConverterFactory.create(gson)).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        vc.s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static ecm.q j(mp.f fVar) {
        fVar.getClass();
        return new ecm.q(new lm.d(6));
    }

    public static rp0.k1 k(Activity activity) {
        r3l.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewFindViewById = activity.findViewById(R$id.snackbar_container);
        if (viewFindViewById == null && (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            viewFindViewById = activity.getWindow().getDecorView();
        }
        Intrinsics.h(viewFindViewById);
        return rp0.x0.a(rp0.g1.Companion, viewFindViewById);
    }

    public static fsi.a l(Activity activity, mli.e userLogoutInteractor, aqi.a permissionView, c5l.b factory) {
        xoi.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "logoutInteractor");
        Intrinsics.checkNotNullParameter(permissionView, "permissionView");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        Intrinsics.checkNotNullParameter(permissionView, "permissionView");
        c5l.a aVar = c5l.b.f21578a;
        vc.s.k(aVar);
        return aVar;
    }
}
