package an4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0e.b f6557a;

    public e(n0e.b statementsNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(statementsNaviCommandFactory, "statementsNaviCommandFactory");
        this.f6557a = statementsNaviCommandFactory;
    }

    public static CreditCardDescriptionDestination a(um4.a limitsInfo, wi0.b countryCode, String facilityId) {
        CreditCardDescriptionDestination.DescriptionConfig totalLimit;
        Intrinsics.checkNotNullParameter(limitsInfo, "limitsInfo");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        if (limitsInfo.e) {
            Integer num = limitsInfo.d;
            int iIntValue = num != null ? num.intValue() : 0;
            dj0.d dVar = limitsInfo.f;
            if (dVar == null) {
                dj0.d.Companion.getClass();
                dVar = dj0.d.e;
            }
            totalLimit = new CreditCardDescriptionDestination.DescriptionConfig.Local.SecuredTotalLimit(iIntValue, dVar, countryCode);
        } else {
            totalLimit = new CreditCardDescriptionDestination.DescriptionConfig.Local.TotalLimit(countryCode, facilityId);
        }
        return new CreditCardDescriptionDestination(totalLimit);
    }

    public static BridgeDestination b(String url2, String title) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        return new BridgeDestination(new FeatureCommand(new PdfViewFeatureConfiguration(url2, new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, false, 56)));
    }

    public static BridgeDestination c(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return u0.b(new FeatureCommand(new CardsScreenFeatureConfig(i63.a.DETAILS, null, null, null, new CardScreenAction.Select(cardId, 6, false, false), 14)));
    }
}
