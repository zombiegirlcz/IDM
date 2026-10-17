package ou9;

import ang.f;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.api.PaymentsToggles$ChatDisclaimerLearnMoreHidden;
import com.revolut.feature.payments.messaging.common.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.ck0;
import ip0.yj0;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import or2.e;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import ufm.i;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements du9.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f229852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f229853b;

    public c(f userInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f229852a = userInteractor;
        this.f229853b = featureToggleInteractor;
    }

    public static final RowDelegate.Model c(du9.a aVar, int i, int i2) {
        String strName = aVar.name();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62);
        int i3 = R$attr.uikit_dp8;
        return new RowDelegate.Model(strName, image40, textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar, null, i3, i3, 0, 0, 482344952);
    }

    public final TextDelegate.Model a() {
        return new TextDelegate.Model("CHAT_PRIVACY_DISCLAIMER_LIST_ID", d(), true, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2032);
    }

    public final y b() {
        t tVar = new t(new TextLocalisedClause(R$string.social_payments_chat_disclaimer_dialog_title, null, null, 14), null, null, 30);
        List listK = v.k(new TextDelegate.Model("CHAT_PRIVACY_DISCLAIMER_DIALOG_ID", new TextLocalisedClause(R$string.social_payments_chat_disclaimer_dialog_description, null, null, 14), false, new ck0(yj0.START), null, null, 0, R$attr.uikit_dp8, 0, 0, 1780), c(du9.a.COMMUNITY, R$drawable.uikit_icn_24_people, R$string.social_payments_chat_disclaimer_dialog_option_community), c(du9.a.PERSONAL, R$drawable.uikit_icn_24_profile, R$string.social_payments_chat_disclaimer_dialog_option_personal), c(du9.a.PRIVACY, R$drawable.uikit_icn_24_document, R$string.social_payments_chat_disclaimer_dialog_option_privacy));
        yp0.b.k(listK, 0, R$attr.uikit_dp16, 0, 0, 29);
        return new y(listK, tVar, l.WINDOW, null, null, null, 1016);
    }

    public final CompositeClause d() {
        TextLocalisedClause[] elements = {new TextLocalisedClause(R$string.social_payments_chat_disclaimer, null, null, 14), this.f229853b.a(PaymentsToggles$ChatDisclaimerLearnMoreHidden.f79145c) ? new TextLocalisedClause(R.string.common_action_learn_more, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(d.L(elements), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final i e(du9.a option) {
        Intrinsics.checkNotNullParameter(option, "option");
        i iVar = new i(this.f229852a.f(false), new e(new os9.t(this, option, 4), 22), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
