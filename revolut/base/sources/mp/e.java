package mp;

import android.os.Build;
import com.revolut.network.RetailAutoInvestNetworkConfiguration;
import com.revolut.network.RetailCpgNetworkConfiguration;
import com.revolut.network.RetailLearnNetworkConfiguration;
import com.revolut.network.RetailMarketDataNetworkConfiguration;
import com.revolut.network.RetailProductArticleNetworkConfiguration;
import com.revolut.network.RetailSavingsRequestNetworkConfiguration;
import com.revolut.network.RetailSharedConfigurationNetworkConfiguration;
import com.revolut.network.RetailSharedRatesNetworkConfiguration;
import com.revolut.network.RetailSharedVaultsNetworkConfiguration;
import com.revolut.network.RetailSharedWidgetsNetworkConfiguration;
import com.revolut.network.RetailSigninNetworkConfiguration;
import com.revolut.network.RetailWithdrawalPermissionNetworkConfiguration;
import dx4.a1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qlm.j1;
import zhm.h0;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207698a;

    public /* synthetic */ e(int i) {
        this.f207698a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f207698a) {
            case 0:
                return RetailWithdrawalPermissionNetworkConfiguration.INSTANCE;
            case 1:
                return RetailMarketDataNetworkConfiguration.INSTANCE;
            case 2:
                return RetailCpgNetworkConfiguration.INSTANCE;
            case 3:
                return RetailSigninNetworkConfiguration.INSTANCE;
            case 4:
                return RetailSharedConfigurationNetworkConfiguration.INSTANCE;
            case 5:
                return RetailAutoInvestNetworkConfiguration.INSTANCE;
            case 6:
                return RetailProductArticleNetworkConfiguration.INSTANCE;
            case 7:
                return RetailLearnNetworkConfiguration.INSTANCE;
            case 8:
                return RetailSharedWidgetsNetworkConfiguration.INSTANCE;
            case 9:
                return RetailSharedVaultsNetworkConfiguration.INSTANCE;
            case 10:
                return RetailSavingsRequestNetworkConfiguration.INSTANCE;
            case 11:
                return RetailSharedRatesNetworkConfiguration.INSTANCE;
            case 12:
                h0 set = h0.f322473a;
                Intrinsics.checkNotNullParameter(set, "set");
                return new k2d.b();
            case 13:
                h0 set2 = h0.f322473a;
                Intrinsics.checkNotNullParameter(set2, "set");
                return new k2d.a();
            case 14:
                Intrinsics.checkNotNullParameter("com.revolut.revolut", "retailApplicationId");
                Intrinsics.checkNotNullParameter("com.revolut.junior", "juniorApplicationId");
                return new z70.d();
            case 15:
                return new zzl.c();
            case 16:
                return new w70.a(Build.VERSION.SDK_INT);
            case 17:
                return new ui2.a();
            case 18:
                return fte.a.f138013a;
            case 19:
                h0 set3 = h0.f322473a;
                Intrinsics.checkNotNullParameter(set3, "set");
                return new k2d.c();
            case 20:
                return x2j.a.f302596a;
            case 21:
                return new ko.a();
            case 22:
                Intrinsics.checkNotNullParameter("aqueduct.revolut.codes", "aqueductHostDev");
                Intrinsics.checkNotNullParameter("aqueduct.revolut.com", "aqueductHostProd");
                Intrinsics.checkNotNullParameter("android", "platform");
                return new jo.c();
            case 23:
                return new nql.a(new lm.d(13));
            case 24:
                return "feature_in_app_calls_twilio_retail";
            case 25:
                return j1.b("com.revolut.feature.credit.application.models.entry_points.CreditAddNewEntryPointType", fs3.b.values());
            case 26:
                return new qlm.e(mp3.i.f207735a);
            case 27:
                return j1.b("com.revolut.feature.credit.application.models.entry_points.CreditAddNewEntryPointType", fs3.b.values());
            case 28:
                return new qlm.e(mp3.i.f207735a);
            default:
                return j1.b("com.revolut.feature.credit.core.constructor.api.items.ContentDrawableIcon", a1.values());
        }
    }
}
