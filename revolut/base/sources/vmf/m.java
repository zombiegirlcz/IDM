package vmf;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_details_note, null, null, 14);
        String str = domainState.f290566a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listC = u.c(new InputTextDelegate.Model("ID_INPUT_NOTE", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 124), textLocalisedClause, null, false, null, false, null, null, null, null, null, null, true, 64, null, false, false, false, false, null, 0, null, null, false, true, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -67158024, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.q(listC, 0, 0, 0, 0, 15);
        String str2 = domainState.f290566a;
        return new h(listC, !Intrinsics.f(str2, domainState.f290567b) && str2.length() <= 64);
    }
}
