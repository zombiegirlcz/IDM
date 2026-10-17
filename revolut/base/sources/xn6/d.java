package xn6;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.ui.link.screens.institutions_list.InstitutionsListScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        k kVar = (k) this.receiver;
        KProperty[] kPropertyArr = InstitutionsListScreen.S;
        o oVar = (o) kVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        if (obj4 instanceof ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.CantLinkAccountItem) {
            NaviCommand naviCommand = ((ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.CantLinkAccountItem) obj4).f72292b;
            oVar.C2(naviCommand != null ? new i(naviCommand) : new g((Parcelable) obj4));
        } else if (obj4 instanceof ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.ExternalAccountItem) {
            NaviCommand naviCommand2 = ((ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.ExternalAccountItem) obj4).e;
            oVar.C2(naviCommand2 != null ? new i(naviCommand2) : new g((Parcelable) obj4));
        } else if (obj4 instanceof ExternalInstitution) {
            oVar.C2(new h((ExternalInstitution) obj4));
        }
        return Unit.f186387a;
    }
}
