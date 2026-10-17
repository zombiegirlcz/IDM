package qb7;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.hidden_accounts.impl.R$string;
import cw6.m;
import ip0.lr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f244132a = new m(4);

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextClause textClause = new TextClause(domainState.f244125a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hidden_accounts_secret_phrase_item_secret_phrase_placeholder, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = domainState.f244127c ? new TextLocalisedClause(R$string.hidden_accounts_secret_phrase_item_secret_phrase_error_min_length, null, null, 14) : null;
        boolean z = domainState.f244127c;
        boolean z3 = domainState.e;
        lr lrVar = new lr(1);
        m mVar = f244132a;
        InputTextDelegate.Model model = new InputTextDelegate.Model("LIST_ID_SECRET_PHRASE", textClause, textLocalisedClause, null, false, null, false, textLocalisedClause2, null, null, null, null, null, true, 16, null, z, false, false, false, lrVar, 0, null, null, false, z3, null, null, true, u.c(mVar), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1679999112, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("LIST_ID_CONFIRM_PHRASE", new TextClause(domainState.f244126b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.hidden_accounts_secret_phrase_item_confirm_phrase_placeholder, null, null, 14), null, false, null, false, domainState.d ? new TextLocalisedClause(R$string.hidden_accounts_secret_phrase_item_confirm_phrase_error_mismatch, null, null, 14) : null, null, null, null, null, null, false, null, null, domainState.d, false, false, false, new lr(1), 0, null, null, false, false, null, null, true, u.c(mVar), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1679949960, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        return new f(v.k(model, model2), domainState.f);
    }
}
