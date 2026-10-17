package ns1;

import aw0.o9;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.apm.bizum.api.R$string;
import com.revolut.feature.apm.bizum.api.navigation.BizumFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferBridgeFeatureConfig;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import ofm.q;
import sf0.h;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f218734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f218735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f218736c;

    public f(h serverErrorParser, v60.e serverErrorsProvider, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f218734a = serverErrorParser;
        this.f218735b = serverErrorsProvider;
        this.f218736c = dateProvider;
    }

    public static z b(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, NaviCommand naviCommand) {
        return new z(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, null, null, naviCommand, false, null, null, null, null, null, null, 32628);
    }

    public final z a(Throwable throwable, e7l.c cVar) {
        ServerError serverErrorA;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Integer numValueOf;
        NaviCommand naviCommandF;
        z zVarB;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if ((throwable instanceof UserDeclinedTwoFaException) || (throwable instanceof HandledNetworkException) || (serverErrorA = this.f218734a.a(throwable)) == null) {
            return null;
        }
        int i = serverErrorA.f51362a;
        switch (i) {
            case 34001:
                textLocalisedClause = new TextLocalisedClause(R$string.bizum_error_34001_title, null, null, 14);
                break;
            case 34002:
            case 34003:
            case 34009:
            case 34010:
            case 34013:
            case 34014:
            case 34015:
            case 34016:
            default:
                textLocalisedClause = null;
                break;
            case 34004:
                textLocalisedClause = new TextLocalisedClause(R$string.bizum_error_34004_title, null, null, 14);
                break;
            case 34005:
                textLocalisedClause = new TextLocalisedClause(R$string.bizum_error_34005_title, null, null, 14);
                break;
            case 34006:
                textLocalisedClause = new TextLocalisedClause(R$string.bizum_error_34006_title, null, null, 14);
                break;
            case 34007:
                textLocalisedClause = cVar == null ? new TextLocalisedClause(R$string.bizum_error_34007_title_generic, null, null, 14) : new TextLocalisedClause(R$string.bizum_error_34007_title, u.c(new MoneyClause(cVar.f123354a.f123353c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
                break;
            case 34008:
                textLocalisedClause = cVar == null ? new TextLocalisedClause(R$string.bizum_error_34008_title_generic, null, null, 14) : new TextLocalisedClause(R$string.bizum_error_34008_title, u.c(new MoneyClause(cVar.f123354a.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
                break;
            case 34011:
                textLocalisedClause = new TextLocalisedClause(R$string.bizum_error_34011_title, null, null, 14);
                break;
            case 34012:
                textLocalisedClause = new TextLocalisedClause(R$string.bizum_error_34012_title, null, null, 14);
                break;
            case 34017:
                textLocalisedClause = new TextLocalisedClause(R$string.bizum_error_34017_title, null, null, 14);
                break;
            case 34018:
                textLocalisedClause = new TextLocalisedClause(R$string.bizum_error_34018_title, null, null, 14);
                break;
            case 34019:
                textLocalisedClause = new TextLocalisedClause(R$string.bizum_error_34019_title, null, null, 14);
                break;
        }
        if (textLocalisedClause == null) {
            zVarB = null;
        } else {
            switch (i) {
                case 34004:
                    textLocalisedClause2 = new TextLocalisedClause(R$string.bizum_error_34004_description, null, null, 14);
                    break;
                case 34006:
                    textLocalisedClause2 = new TextLocalisedClause(R$string.bizum_error_34006_description_date, u.c(new TimeClause(((l80.f) this.f218736c).k().withDayOfMonth(1).plusMonths(1L).toInstant().toEpochMilli(), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12);
                    break;
                case 34007:
                    textLocalisedClause2 = new TextLocalisedClause(R$string.bizum_error_34007_description, null, null, 14);
                    break;
                case 34012:
                    textLocalisedClause2 = new TextLocalisedClause(R$string.bizum_error_34012_description, null, null, 14);
                    break;
                case 34019:
                    textLocalisedClause2 = new TextLocalisedClause(R$string.bizum_error_34019_subtitle, null, null, 14);
                    break;
                default:
                    textLocalisedClause2 = null;
                    break;
            }
            switch (i) {
                case 34001:
                    numValueOf = Integer.valueOf(R$string.bizum_error_34001_action);
                    break;
                case 34005:
                    numValueOf = Integer.valueOf(R$string.bizum_error_34005_action);
                    break;
                case 34008:
                    numValueOf = Integer.valueOf(R$string.bizum_error_34008_action);
                    break;
                case 34011:
                    numValueOf = Integer.valueOf(R$string.bizum_error_34011_action);
                    break;
                case 34017:
                    numValueOf = Integer.valueOf(R$string.bizum_error_34017_action);
                    break;
                case 34018:
                    numValueOf = Integer.valueOf(R$string.bizum_error_34018_action);
                    break;
                case 34019:
                    numValueOf = Integer.valueOf(R$string.bizum_error_34019_action_confirm);
                    break;
                default:
                    numValueOf = null;
                    break;
            }
            TextLocalisedClause textLocalisedClause3 = numValueOf != null ? new TextLocalisedClause(numValueOf.intValue(), null, null, 14) : null;
            switch (i) {
                case 34001:
                case 34011:
                    naviCommandF = u0.f(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
                    break;
                case 34005:
                case 34008:
                    naviCommandF = gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267950b, null, null, 6)));
                    break;
                case 34017:
                case 34018:
                    naviCommandF = com.revolut.retail.core.navigation.a.c(gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267950b, null, null, 6))), gc0.c.f(new TransferBridgeFeatureConfig.NewTransfer(0)));
                    break;
                case 34019:
                    naviCommandF = gc0.c.f(new BizumFeatureConfig(0));
                    break;
                default:
                    naviCommandF = null;
                    break;
            }
            zVarB = b(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, naviCommandF);
        }
        if (zVarB != null) {
            return zVarB;
        }
        v60.d dVarB = ((ao0.a) this.f218735b).b(Integer.valueOf(i));
        if (dVarB == null) {
            dVarB = new v60.b();
        }
        return b(q.O(dVarB), null, null, null);
    }
}
