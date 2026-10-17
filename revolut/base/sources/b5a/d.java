package b5a;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.ek;
import ip0.zj;
import java.util.List;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f12480a;

    public d(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f12480a = countryInteractor;
    }

    public static j a() {
        ek ekVar = new ek("CONTACTS_LOADING_ITEM_ID", 0, 0, 0, 0, true, SyslogConstants.LOG_CLOCK, false);
        yp0.b.l(ekVar, 0, 0, 0, 0, null, false, 63);
        return ekVar;
    }

    public static FullScreenStateDelegate.Model b(int i, int i2, String str) {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model(str, new TextLocalisedClause(i, null, null, 14), null, new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_phone_book, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 52, 52, 31), (Clause) null, 190)), new l6(12, new TextLocalisedClause(i2, null, null, 14), null, h4.SEMIACCENT), zj.REGULAR, false, null, null, null, 1860);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
