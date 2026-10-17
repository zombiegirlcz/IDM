package m3j;

import aw0.o9;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.me;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d3;
import com.revolut.core.ui_kit.delegates.widgets.e3;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f61.a f202583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f202584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f202585c;

    public n(f61.a beneficiaryAccountFieldsNameMapper, j beneficiaryAvatarMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryAccountFieldsNameMapper, "beneficiaryAccountFieldsNameMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        this.f202583a = beneficiaryAccountFieldsNameMapper;
        this.f202584b = beneficiaryAvatarMapper;
        this.f202585c = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bank, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 16.0f, null, null, 48);
    }

    public final RewardDelegate.Model a(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        j jVar = this.f202584b;
        Image imageB = jVar.b(beneficiary);
        RewardDelegate.a meVar = imageB != null ? new me(imageB) : null;
        String str = beneficiary.f132329a;
        Image imageA = jVar.a(beneficiary);
        if (imageA == null) {
            imageA = this.f202585c;
        }
        if (meVar == null) {
            meVar = RewardDelegate.a.b.f53196a;
        }
        return new RewardDelegate.Model(str, imageA, (Clause) new TextClause(n61.j.e(beneficiary), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (CompositeClause) null, meVar, false, (Object) beneficiary, (AnalyticsContext) null, 744);
    }

    public final ReferralContactDelegate.Model b(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        String str = beneficiary.f132329a;
        j jVar = this.f202584b;
        Image imageA = jVar.a(beneficiary);
        if (imageA == null) {
            imageA = this.f202585c;
        }
        return new ReferralContactDelegate.Model(str, imageA, new TextClause(n61.j.e(beneficiary), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, jVar.b(beneficiary), null, null, null, beneficiary, null, 393176);
    }

    public final RowDelegate.Model c(f5j.a beneficiary, boolean z) {
        f61.a aVar;
        Clause textLocalisedClause;
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        String str = beneficiary.A;
        String str2 = beneficiary.f132337n;
        j jVar = this.f202584b;
        ContactImage contactImageA = jVar.a(beneficiary);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(contactImageA == null ? this.f202585c : contactImageA, contactImageA != null ? jVar.b(beneficiary) : null, null, false, 28);
        Custom custom = beneficiary.c() ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254) : null;
        f61.a aVar2 = this.f202583a;
        if (!z && str != null) {
            return new RowDelegate.Model(beneficiary.f132329a, image40, new TextLocalisedClause(R$string.bank_transfer_beneficiary_title_format, v.k(str, str2 != null ? str2 : ""), custom, 8), null, 0, aVar2.B(beneficiary, false, custom), null, null, 0, null, false, null, false, null, null, null, null, null, null, beneficiary, null, 0, 0, 0, 0, 532676568);
        }
        String str3 = beneficiary.f132329a;
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        AccountFieldType accountFieldType = AccountFieldType.ALIAS_NAME;
        if (beneficiary.f132335l == f5j.r.PAYID_ALIAS && f61.a.D(beneficiary, accountFieldType)) {
            String strI = f61.a.I(beneficiary, accountFieldType);
            aVar = aVar2;
            textLocalisedClause = new TextClause(strI, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
        } else {
            aVar = aVar2;
            textLocalisedClause = new TextLocalisedClause(R$string.bank_transfer_beneficiary_title_format, v.k(n61.j.c(beneficiary), str2 != null ? str2 : ""), custom, 8);
        }
        return new RowDelegate.Model(str3, image40, textLocalisedClause, null, 0, aVar.B(beneficiary, true, custom), null, null, 0, beneficiary.c() ? new RowDelegate.Model.c.a(new TagViewData(null, new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_common_outdated_tag, null, new Custom(Integer.valueOf(R$attr.uikit_colorDeepGrey), false, null, false, null, 254), 10), R$attr.uikit_colorBackground, null, R$attr.uikit_colorDeepGrey, null, 1000), null, false, 6) : null, false, null, false, null, null, null, null, null, null, beneficiary, null, 0, 0, 0, 0, 532675544);
    }

    public final QuickActionWidgetDelegate.Model d(String listId, f5j.a beneficiary, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        j jVar = this.f202584b;
        Image imageA = jVar.a(beneficiary);
        if (imageA == null) {
            imageA = this.f202585c;
        }
        return new QuickActionWidgetDelegate.Model(listId, imageA, jVar.b(beneficiary), i != 0 ? com.revolut.core.ui_kit_core.displayers.image.models.a.a(i, Integer.valueOf(R$attr.uikit_colorWidgetBackground), Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorAccent), 2.0f) : null, new TextClause(n61.j.e(beneficiary), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new d3(new e3(R$drawable.uikit_icn_24_arrow_up, true), (e3) null, 6), null, null, CaptureActivity.RESULT_EXIT_USER_FLOW);
    }
}
