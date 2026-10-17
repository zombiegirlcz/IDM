package os5;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C1262a Companion = new C1262a();

    /* JADX INFO: renamed from: os5.a$a, reason: collision with other inner class name */
    public static final class C1262a {
        private C1262a() {
        }
    }

    public final List a() {
        return v.k(new CdnImage("card_1", "mobile/crypto/cards_widget_empty_state", null, null, null, null, Constants.TAG_FC_SPEED_MODE), new CdnImage("card_2", "mobile/crypto/cards_widget_empty_state", null, null, null, null, Constants.TAG_FC_SPEED_MODE), new CdnImage("card_3", "mobile/crypto/cards_widget_empty_state", null, null, null, null, Constants.TAG_FC_SPEED_MODE), new CdnImage("card_4", "mobile/crypto/cards_widget_empty_state", null, null, null, null, Constants.TAG_FC_SPEED_MODE));
    }
}
