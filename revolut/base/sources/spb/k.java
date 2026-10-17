package spb;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;
import com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.TransferWidgetCustomisationScreen;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import pcd.j;
import rnb.w;
import vkm.q;
import vkm.y;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements csh.e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f264934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f264935c;
    public final wsg.n d;
    public final xoj.a e;
    public final elb.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wa7.m f264936g;

    public k(ppg.b vaultsInteractor, w savingsVaultInteractor, wsg.n walletInteractor, xoj.a featuresInteractor, elb.b savingsFeatureConfigInteractor, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f264934b = vaultsInteractor;
        this.f264935c = savingsVaultInteractor;
        this.d = walletInteractor;
        this.e = featuresInteractor;
        this.f = savingsFeatureConfigInteractor;
        this.f264936g = hiddenAccountsInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "SavingsSmall")) {
            throw new IllegalStateException((str + " is not eligible for SavingsWidget").toString());
        }
        dsh.f fVar = new dsh.f();
        Intrinsics.checkNotNullParameter("SAVINGS_ACCOUNT_ID_KEY", "key");
        fVar.f117320a.remove("SAVINGS_ACCOUNT_ID_KEY");
        fVar.a("SHOW_WITHDRAW_KEY", "SHOW_WITHDRAW_KEY");
        return new dsh.e(fVar);
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        if (Intrinsics.f(str, "SavingsSmall")) {
            return q.x(i(), continuation);
        }
        throw new IllegalStateException((str + " is not eligible for SavingsWidget").toString());
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "SavingsSmall")) {
            return new QuickActionWidgetLoadingDelegate.Model(id10);
        }
        throw new IllegalStateException((widgetType + " is not eligible for SavingsWidget").toString());
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        if (Intrinsics.f(str2, "SavingsSmall")) {
            return q.x(j(str, eVar), fVar);
        }
        throw new IllegalStateException((str2 + " is not eligible for SavingsWidget").toString());
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Savings widgetContext2 = (HomeFeedWidgetContext.Savings) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.f(widgetType, "SavingsSmall")) {
            return q.Q(i(), new mki.d((Continuation) null, this, id10, config, 11));
        }
        throw new IllegalStateException((widgetType + " is not eligible for SavingsWidget").toString());
    }

    @Override // csh.e
    public final dsh.j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        HomeFeedWidgetContext.Savings widgetContext2 = (HomeFeedWidgetContext.Savings) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        if (Intrinsics.f(widgetType, "SavingsSmall")) {
            return new dsh.j((TextLocalisedClause) null, new dsh.m(new TransferWidgetCustomisationScreen(new SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.Customise(inputConfig.a("SAVINGS_ACCOUNT_ID_KEY"), inputConfig.a("SAVINGS_ACCOUNT_NAME_KEY"), inputConfig.a("SHOW_WITHDRAW_KEY") != null)), new soi.a(this, 4)), 1);
        }
        super.h(widgetContext2, widgetType, inputConfig);
        return null;
    }

    public final y i() {
        return rd0.e.e(new bo8.w(yh5.b.e(mo3.a.g(this.f264935c.a(new pcd.e(0), w4l.h.f294642c), null, new sl5.g(17), 1), rd0.e.b(((cpj.b) this.e).j(yoj.c.VAULTS_SAVINGS, w4l.h.f294642c)), this.f264936g.k()), 8), h0.f322473a, new qtb.o(3, 24, (Continuation) null));
    }

    public final y j(String str, dsh.e eVar) {
        Flow flowH;
        String strA = eVar != null ? eVar.a("SAVINGS_ACCOUNT_ID_KEY") : null;
        String strA2 = eVar != null ? eVar.a("SHOW_WITHDRAW_KEY") : null;
        boolean z = strA != null;
        wa7.m mVar = this.f264936g;
        w4l.h hVar = w4l.h.f294642c;
        w wVar = this.f264935c;
        if (z) {
            flowH = nim.a.v(u0.m(wVar.c(strA, hVar), new ahe.l(mVar.k(), 17)), new a31.i(str, strA2 != null, 13));
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            flowH = xam.a.h(new g(this, str, strA2 != null, null), nim.a.u(new qkg.a(2, 23, null), u0.m(u0.i(wVar.a(new pcd.e(j.d.f234867a), hVar), rd0.e.b(this.d.J(AccountId.Personal.f51414a, hVar)), this.f.a(w4l.j.f294644c)), new ahe.l(mVar.k(), 16))));
        }
        return rd0.e.e(mo3.a.g(nim.a.v(flowH, new i(1, 0, k.class, this, "mapWidgetContentToModel", "mapWidgetContentToModel(Lcom/revolut/feature/retail/savings/impl/ui/widgets/savings/all_savings/SavingsWidgetContentProvider$WidgetUiContent;)Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;")), null, new sl5.g(18), 1), h0.f322473a, new j(3, null));
    }
}
