package k0a;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.social.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f180005a;

    public a(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f180005a = countryInteractor;
    }

    public static ListCellDelegate.Model a(boolean z) {
        return new ListCellDelegate.Model("EMPTY_STATE_DESCRIPTION_LINK_ID", new j8(new ResourceImage(R$drawable.uikit_icn_16_link, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(z ? R$string.social_payments_chat_empty_state_description_link : R$string.chat_non_revolut_contact_help_receive_only_make_request_title, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4088);
    }
}
