package kh3;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.List;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import yp0.b;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    @NotNull
    public static final C1049a Companion = new C1049a();

    /* JADX INFO: renamed from: kh3.a$a, reason: collision with other inner class name */
    public static final class C1049a {
        private C1049a() {
        }
    }

    public static List a(int i, int i2, Integer num) {
        List listC = u.c(new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(i, null, null, 14), num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : null, new ComplexImage.Regular(new GlyphImage(i2, null, null, 6)), new l6(12, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), zj.SMALL, false, null, null, null, 1984));
        b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
