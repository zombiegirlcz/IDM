package xp7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import yp0.r;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p {
    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Occupation occupation = domainState.f307890a;
        boolean z = occupation != null;
        List listC = u.c(r.a(new InputTextDelegate.Model("OCCUPATION_INPUT_ID", occupation != null ? new TextClause(occupation.f75265b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.car_insurance_question_occupation_placeholder, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)));
        yp0.b.q(listC, 0, 0, 0, 0, 15);
        return new g(new TextLocalisedClause(R$string.car_insurance_question_occupation_footer_text, u.c(new TextLocalisedClause(R$string.car_insurance_question_occupation_footer_link, null, new Click(30, (Integer) null, (Object) null, "FOOTER_LINK_ID", false), 10)), null, 12), listC, z);
    }
}
