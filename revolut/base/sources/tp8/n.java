package tp8;

import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.junior_tasks.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import yp0.r;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements cli.n {
    public static InputTextDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model(str, textLocalisedClause2, textLocalisedClause, null, false, null, false, null, null, null, null, null, null, false, null, null, false, true, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33951880, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        return modelA;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k(v.k(a("LIST_ID_START_DATE", new TextLocalisedClause(R$string.junior_challenges_edit_start_date_title, null, null, 14), new TextLocalisedClause(R$string.junior_challenges_common_frequency_start_date, u.c(new TimeClause(pu7.a.I(domainState.f273313a), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12)), a("LIST_ID_FREQUENCY", new TextLocalisedClause(R$string.junior_challenges_edit_frequency_title, null, null, 14), new TextLocalisedClause(cp5.c.v(domainState.f273314b), null, null, 14))));
    }
}
