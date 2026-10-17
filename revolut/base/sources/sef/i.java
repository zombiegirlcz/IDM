package sef;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transaction.recogniser.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements p {
    public static List b(String str) {
        List listC = u.c(new InputTextDelegate.Model("INPUT_TEXT_ID", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.transaction_recogniser_add_note_screen_edit_hint, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h(!(domainState.f262188b.length() == 0), (List) iii.c.f(domainState.f262189c, new se0.a(8), new scl.h(this, domainState), new sa5.b(this, domainState, 3)));
    }
}
