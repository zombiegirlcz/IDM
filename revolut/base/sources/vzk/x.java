package vzk;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.NationalitiesScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements jki.p {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f293574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NationalitiesScreenContract$InputData f293575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f293576c;

    public x(n8b.a countryInteractor, NationalitiesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f293574a = countryInteractor;
        this.f293575b = inputData;
        this.f293576c = te0.w.y0(new vo8.b(this));
    }

    public static k c(boolean z) {
        return new k(new TextLocalisedClause(R$string.common_action_continue, null, null, 14), z);
    }

    public static Clause d(Data data) {
        if (data != null) {
            return (Clause) iii.c.f(data, new vz1.h(7), new vv7.l(19), new uw2.n(29));
        }
        return null;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(domainState.f293548b, new vx9.b(this, 16), new vvc.s(this, domainState), new vh2.o(domainState, this, 11));
    }

    public final ListSubheaderDelegate.Model b(boolean z) {
        return new ListSubheaderDelegate.Model("TRADING_KYC_NATIONALITY_ADD_ACTION_ID", (Image) null, (Clause) new TextLocalisedClause(this.f293575b.f104204b ? com.revolut.retail.wealth.resources.R$string.wealth_trading_onboarding_kyc_nationalities_section_title : com.revolut.retail.wealth.resources.R$string.wealth_trading_onboarding_kyc_nationalities_section_title_all_nationalities, null, null, 14), (Image) null, (Clause) (z ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_onboarding_kyc_nationalities_button_add, null, null, 14) : null), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, z), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450);
    }
}
