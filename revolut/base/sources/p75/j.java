package p75;

import aw0.o9;
import c55.n0;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import m35.r;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements p {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f233558a;

    public j(r loanUiContentMapper) {
        Intrinsics.checkNotNullParameter(loanUiContentMapper, "loanUiContentMapper");
        this.f233558a = loanUiContentMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f233551b;
        Clause clauseC = str == null ? ((n0) this.f233558a).c(domainState.f233550a) : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        m70.a.c(t0.f186434a);
        InputTextDelegate.Model model = new InputTextDelegate.Model("loan-name-input", clauseC, null, new TextLocalisedClause(R$string.loan_rename_loan_hint, null, null, 14), false, null, false, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, null, true, 25, null, false, false, false, false, null, 0, null, null, false, true, null, null, true, m72.b.u(25), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1677770892, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(model);
        String str2 = domainState.f233551b;
        return new f(listC, str2 != null ? true ^ d0.W(str2) : true);
    }
}
