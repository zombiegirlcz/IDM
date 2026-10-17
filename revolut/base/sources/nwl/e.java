package nwl;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.network.exceptions.NetworkConnectException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.models.Address;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import com.revolut.retail.feature.api.userauth.navigation.sso_app_unlock.RetailRevolutSsoUnlockAppWithBiometricsFeatureConfig;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.ui.login.pin.LoginActivity;
import do3.n;
import efm.r;
import grl.k9;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import sri.m;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f220016b;

    public /* synthetic */ e(l lVar, int i) {
        this.f220015a = i;
        this.f220016b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r rVarC;
        String country;
        int i = this.f220015a;
        boolean zA = false;
        zA = false;
        l lVar = this.f220016b;
        switch (i) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                owl.a aVar = (owl.a) lVar.L();
                if (aVar != null) {
                    ((npi.c) ((r41.a) ((LoginActivity) aVar).f107076w0).E()).V(null, z2l.a.f319097a.getString(R.string.error_unrecoverable), null, new lv4.b(22));
                    gom.e.a(it8);
                }
                return Unit.f186387a;
            case 1:
                m mVar = lVar.f220027m;
                rl0.d primaryAuthCredentialsType = (rl0.d) obj2;
                Intrinsics.checkNotNullParameter(primaryAuthCredentialsType, "primaryAuthCredentialsType");
                int i2 = i.f220021c[primaryAuthCredentialsType.ordinal()];
                if (i2 == 1) {
                    mVar.c(new FeatureCommand(new UserAuthFeatureConfig.Main((String) null, (UserAuthFeatureConfig.Main.SSODeeplinkData) null, true, (UserAuthFeatureConfig.UseCase) UserAuthFeatureConfig.UseCase.ForgotPasscode.f99358a, 7)));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.c(new FeatureCommand(RetailRevolutSsoUnlockAppWithBiometricsFeatureConfig.f99367g));
                }
                return Unit.f186387a;
            case 2:
                Throwable th10 = (Throwable) obj2;
                IllegalStateException illegalStateException = new IllegalStateException("Unable to load common configuration. The application launch is blocked", th10);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                Intrinsics.h(th10);
                int i3 = 14;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(tj0.a.a(th10) ? R$string.error_no_internet : ((th10 instanceof NetworkConnectException) && ((NetworkConnectException) th10).f51446a) ? R$string.error_no_internet_or_vpn_invalid : R$string.error_generic, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.common_action_retry, null, null, 14);
                k9 k9Var = k9.Onboarding;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                y0 y0Var = new y0("CONFIG_RETRIEVE_DIALOG_ID", new z(textLocalisedClause, null, textLocalisedClause2, null, null, null, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, null, null, null, 32246), false, 4);
                owl.a aVar2 = (owl.a) lVar.L();
                if (aVar2 != null && (rVarC = rd0.e.c(((LoginActivity) aVar2).u0.h(y0Var), kotlin.coroutines.g.f186406a)) != null) {
                    b bVar = new b(lVar, zA ? 1 : 0);
                    Function1 function1K = lVar.K();
                    Function0 function0J = lVar.J();
                    r rVarOnErrorResumeNext = rVarC.onErrorResumeNext(new gn.b(6, new ne0.e(new BreadcrumbException(), i3)));
                    Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                    ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new bo.e(7, bVar), new bo.e(7, function1K), new c86.f(8, function0J));
                    w.j0(lVar.f239031a, cVarSubscribe);
                    Intrinsics.h(cVarSubscribe);
                }
                return Unit.f186387a;
            default:
                n it9 = (n) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Address address = it9.k;
                if (address != null && (country = address.getCountry()) != null) {
                    zA = ((dl0.a) lVar.i.get()).a(country);
                }
                return Boolean.valueOf(zA);
        }
    }
}
