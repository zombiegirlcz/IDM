package bn5;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.tfr.validation.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import yp0.r;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements i {
    @Override // cli.n
    public final o c(cli.j jVar) {
        String str;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        g gVar = domainState.f17109a;
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("LIST_ID_PLACE_OF_BIRTH_INPUT_DROPDOWN", (gVar == null || (str = gVar.f17111a) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.crypto_tfr_validation_pob_toolbar_title, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        return new j(u.c(modelA), domainState.f17109a != null);
    }
}
