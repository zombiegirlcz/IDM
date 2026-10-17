package ro2;

import aw0.c7;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.api.R$string;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TimeClause timeClauseA;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f255811b;
        if (localDate != null) {
            c7.Companion.getClass();
            timeClauseA = com.revolut.core.ui_kit.models.j.a(localDate, LocalDateClause$DateFormat.DateLong.f57804a, null);
        } else {
            timeClauseA = null;
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("ID_START_DATE_FIELD", timeClauseA, new TextLocalisedClause(R$string.account_switch_set_payment_start_title, null, null, 14), null, false, null, false, null, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33562632, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        qo2.c cVar = domainState.f255812c;
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("ID_FREQUENCY_FIELD", cVar != null ? qo2.e.a(cVar) : null, new TextLocalisedClause(R$string.account_switch_set_payment_repeat_title, null, null, 14), null, false, null, false, null, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33562632, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new j(v.k(model, model2), domainState.d);
    }
}
