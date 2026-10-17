package j8i;

import android.text.InputFilter;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_move_money.impl.R$string;
import ip0.nr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listC = u.c(new InputTextDelegate.Model("ID_INPUT_NOTE", new TextClause(domainState.f172217a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.move_money_review_note, null, null, 14), null, false, null, false, null, null, null, null, null, null, true, 64, null, false, false, false, false, null, 0, null, null, false, true, null, null, false, new nr(new InputFilter.LengthFilter(64)), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1140899848, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.q(listC, 0, 0, 0, 0, 15);
        return new h(new TextLocalisedClause(R$string.move_money_amount_screen_add_note, null, null, 14), listC, domainState.f172217a.length() <= 64);
    }
}
