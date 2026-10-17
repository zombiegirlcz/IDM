package p0a;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.social.impl.R$string;
import ip0.zj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    public static FullScreenStateDelegate.Model a(boolean z) {
        return new FullScreenStateDelegate.Model("EMPTY_STATE_HEADER", new TextLocalisedClause(R$string.social_payments_chat_empty_state_title_contact_non_revolut, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D006", null, null, null, 30)), zj.REGULAR, null, false, null, null, z, 0, 0, 31716);
    }
}
