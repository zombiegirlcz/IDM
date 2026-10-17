package a6e;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.subaccount.accounts.impl.R$string;
import com.revolut.feature.subaccount.api.CreateSubaccountScreenDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s6e.z;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements mf1.c, mf1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5e.a f1620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f1621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f1622c;

    public d(z5e.a newSubaccountAvailabilityChecker, ppg.b vaultsInteractor, g6e.g subaccountsNavigationProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(newSubaccountAvailabilityChecker, "newSubaccountAvailabilityChecker");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(subaccountsNavigationProvider, "subaccountsNavigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f1620a = newSubaccountAvailabilityChecker;
        this.f1621b = vaultsInteractor;
        this.f1622c = featureToggleInteractor;
    }

    @Override // mf1.c
    public final Flow a() {
        return new go.g(new Data(new qf1.m(new TextLocalisedClause(R$string.pockets_account_add_new_widget_title, null, null, 14), new TextLocalisedClause(R$string.pockets_account_add_new_widget_subtitle, null, null, 14), new TextLocalisedClause(R$string.pockets_account_add_new_widget_action, null, null, 14), R$drawable.uikit_icn_24_wallet, null, new qf1.a(new ColorImage(new ColorImage.ColorInteger(-16777216), null)), null, SyslogConstants.LOG_LOCAL6), null, false, 6, null), 2);
    }

    @Override // mf1.b
    public final Flow b() {
        return ((jte.d) this.f1622c).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c) ? new go.g(Boolean.FALSE, 2) : new a07.p(nim.a.v(((z) ((x6e.a) this.f1620a).f303063a).g(), new x64.a(2)), 2);
    }

    @Override // mf1.c
    public final Object c(Continuation continuation) {
        return new of1.d(new CreateSubaccountScreenDestination(null));
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        return ((jte.d) this.f1622c).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c) ? new go.g(Boolean.FALSE, 2) : vkm.q.Q(nim.a.v(((z) ((x6e.a) this.f1620a).f303063a).g(), new x64.a(2)), new a0e.m((Continuation) null, this, 8));
    }
}
