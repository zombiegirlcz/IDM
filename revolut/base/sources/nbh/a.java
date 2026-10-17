package nbh;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static InstrumentImage a(String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        return new InstrumentImage(securityRef, 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGreyTone20));
    }

    public static InstrumentImage b(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return a(instrument.f214596b);
    }
}
