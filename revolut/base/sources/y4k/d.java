package y4k;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.transfer.models.config.AdditionalInformationInput;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import m3j.p;
import org.jetbrains.annotations.NotNull;
import p5k.x;
import qv0.i;
import vrf.h;
import yof.k;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f310955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f310956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9l.a f310957c;
    public final p d;
    public final usc.a e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f310958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p5k.a f310959h;
    public final dl9.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gte.a f310960j;
    public final fsf.b k;

    public d(k transferReviewMapper, x breakdownMapper, c3j.b bankInformationProvider, j9l.a moneyCalculator, p detailsMapper, usc.a transferDisclaimerMapper, b transferEdtMapper, m4k.h transferQuoteChargesMerger, h transferSectionUiMappersFactory, p5k.a creditCardTransferInterestMapper, dl9.c payWithPhotoMapper, gte.a featureToggleInteractor, fsf.b transferReasonsCommonUiMapper) {
        Intrinsics.checkNotNullParameter(transferReviewMapper, "transferReviewMapper");
        Intrinsics.checkNotNullParameter(breakdownMapper, "breakdownMapper");
        Intrinsics.checkNotNullParameter(bankInformationProvider, "bankInformationProvider");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(detailsMapper, "detailsMapper");
        Intrinsics.checkNotNullParameter(transferDisclaimerMapper, "transferDisclaimerMapper");
        Intrinsics.checkNotNullParameter(transferEdtMapper, "transferEdtMapper");
        Intrinsics.checkNotNullParameter(transferQuoteChargesMerger, "transferQuoteChargesMerger");
        Intrinsics.checkNotNullParameter(transferSectionUiMappersFactory, "transferSectionUiMappersFactory");
        Intrinsics.checkNotNullParameter(creditCardTransferInterestMapper, "creditCardTransferInterestMapper");
        Intrinsics.checkNotNullParameter(payWithPhotoMapper, "payWithPhotoMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transferReasonsCommonUiMapper, "transferReasonsCommonUiMapper");
        this.f310955a = transferReviewMapper;
        this.f310956b = breakdownMapper;
        this.f310957c = moneyCalculator;
        this.d = detailsMapper;
        this.e = transferDisclaimerMapper;
        this.f = transferEdtMapper;
        this.f310958g = transferSectionUiMappersFactory;
        this.f310959h = creditCardTransferInterestMapper;
        this.i = payWithPhotoMapper;
        this.f310960j = featureToggleInteractor;
        this.k = transferReasonsCommonUiMapper;
    }

    public final aim.e a(BankTransferData transferData, Map configs) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        aim.e eVarB = u.b();
        for (Map.Entry entry : transferData.f101931m.entrySet()) {
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            AdditionalInformationInput config = (AdditionalInformationInput) configs.get(key);
            if (config != null) {
                int i = ppf.d.f238604c;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(config, "config");
                String str = "ID_TRANSFER_REVIEW_ADDITIONAL_INPUT_" + key;
                TextClause textClause = new TextClause(config.f92267b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                i model = d0.W(value) ? new CellDetailsActionDelegate.Model(str, textClause, 0, new ResourceImage(ppf.d.f238603b, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.common_action_add, null, null, 14), false, false, null, config, 0, 0, 32224) : new CellDetailsNoteDelegate.Model(str, textClause, null, new TextClause(value, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, new ResourceImage(ppf.d.f238602a, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.common_action_edit, null, null, 14), null, config, null, 0, 128628);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model);
            }
        }
        return u.a(eVarB);
    }
}
