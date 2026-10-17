package ws2;

import aw0.o9;
import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.BusinessBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.Base64Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import ru.a0;
import ru.z;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu.g f299649a;

    public f(vu.g resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.f299649a = resourceProvider;
    }

    public final RowDelegate.Model a(a0 rewardTargetAccountWithImage, boolean z) {
        TextLocalisedClause textLocalisedClause;
        Image contactImage;
        CircleBadgeModel circleBadgeModel;
        pf pfVar;
        Intrinsics.checkNotNullParameter(rewardTargetAccountWithImage, "rewardTargetAccountWithImage");
        String strQ = j6.a.q("REWARD_TARGET_ACCOUNT_ID", rewardTargetAccountWithImage.f257353a.f50671a);
        RewardTargetAccount rewardTargetAccount = rewardTargetAccountWithImage.f257353a;
        TextClause textClause = new TextClause(rewardTargetAccount.f50672b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        z zVar = rewardTargetAccount.d;
        int[] iArr = e.f299648a;
        int i = iArr[zVar.ordinal()];
        vu.g gVar = this.f299649a;
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_referral_account_personal), null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_referral_account_business), null, null, 14);
        }
        CompositeClause compositeClause = new CompositeClause(v.k(textLocalisedClause, new TextClause(j6.a.q("@", rewardTargetAccount.f50673c), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12);
        String str = rewardTargetAccountWithImage.f257354b;
        if (str != null) {
            contactImage = new Base64Image(str, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), 4);
        } else {
            String str2 = rewardTargetAccount.f50672b;
            String upperCase = str2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            contactImage = new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, upperCase, str2, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 3999);
        }
        int i2 = iArr[zVar.ordinal()];
        if (i2 == 1) {
            circleBadgeModel = RetailBadge.f58066a;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            circleBadgeModel = BusinessBadge.f58051a;
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(contactImage, circleBadgeModel, null, false, null, false, 60);
        if (z) {
            pfVar = new pf(new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_active_campaign_referral_account_action), null, null, 14), null, null, false, null, null, 510);
        } else {
            pfVar = null;
        }
        return new RowDelegate.Model(strQ, image40, textClause, null, 0, compositeClause, null, null, 0, pfVar, false, null, false, null, null, null, null, null, null, rewardTargetAccountWithImage.f257353a, null, 0, 0, 0, 0, 532675544);
    }
}
