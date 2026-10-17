package b7k;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import com.revolut.retail.feature.payments.money_request.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv9.c f13069a;

    public e(wv9.c moneyRequestResourcesMapper, b moneyRequestDetailsItemsMapper) {
        Intrinsics.checkNotNullParameter(moneyRequestResourcesMapper, "moneyRequestResourcesMapper");
        Intrinsics.checkNotNullParameter(moneyRequestDetailsItemsMapper, "moneyRequestDetailsItemsMapper");
        this.f13069a = moneyRequestResourcesMapper;
    }

    public static Image a(MoneyRequest moneyRequest) {
        Float fValueOf = Float.valueOf(28.0f);
        MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.k;
        MoneyRequestCounterParty moneyRequestCounterParty2 = moneyRequest.f60320l;
        MoneyRequestDirection moneyRequestDirection = moneyRequest.f60322n;
        return (moneyRequestDirection != MoneyRequestDirection.INCOMING || moneyRequestCounterParty2.getF60343a() == null) ? (moneyRequestDirection != MoneyRequestDirection.OUTGOING || moneyRequestCounterParty == null) ? moneyRequest.f60318h != null ? LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_link, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorBlue, 14.0f, fValueOf, null, 32) : LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_user, Integer.valueOf(R$attr.uikit_colorGreyTone50), R$attr.uikit_colorGreyTone10, 14.0f, fValueOf, null, 32) : new ContactImage(moneyRequestCounterParty.getF60343a(), (String) null, moneyRequestCounterParty.getE(), (String) null, (String) null, com.revolut.domain.models.moneyrequest.a.e(moneyRequestCounterParty), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4058) : new ContactImage(moneyRequestCounterParty2.getF60343a(), (String) null, moneyRequestCounterParty2.getE(), (String) null, (String) null, com.revolut.domain.models.moneyrequest.a.e(moneyRequestCounterParty2), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4058);
    }

    public static MoneyClause c(dj0.d dVar) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
    }

    public final TextLocalisedClause b(MoneyRequest moneyRequest) {
        v6k.c cVar = (v6k.c) this.f13069a;
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        if (com.revolut.domain.models.moneyrequest.b.f(moneyRequest)) {
            return null;
        }
        String strG = cVar.g(moneyRequest);
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
        Custom custom2 = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        MoneyRequestDirection moneyRequestDirection = moneyRequest.f60322n;
        MoneyRequestDirection moneyRequestDirection2 = MoneyRequestDirection.OUTGOING;
        if (moneyRequestDirection == moneyRequestDirection2 && strG == null) {
            return new TextLocalisedClause(R$string.money_request_details_request_via, u.c(new TextLocalisedClause(R$string.money_request_details_payment_link, null, custom2, 10)), custom, 8);
        }
        if (moneyRequestDirection == moneyRequestDirection2) {
            return new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.money_request_core_someone_owes_money, u.c(new TextClause(strG == null ? "" : strG, (Style) custom2, (Integer) null, false, (o9) null, (List) null, 124)), custom, 8);
        }
        if (moneyRequestDirection == MoneyRequestDirection.INCOMING && Intrinsics.f(moneyRequest.f60316c, MoneyRequestChannel.BankBeneficiary.Masav.f60330b)) {
            return new TextLocalisedClause(R$string.moneyRequest_details_payer_state_someone_requested, u.c(new TextClause(strG == null ? "" : strG, (Style) custom2, (Integer) null, false, (o9) null, (List) null, 124)), custom, 8);
        }
        return new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.money_request_core_you_owe_money, u.c(new TextClause(strG == null ? "" : strG, (Style) custom2, (Integer) null, false, (o9) null, (List) null, 124)), custom, 8);
    }
}
