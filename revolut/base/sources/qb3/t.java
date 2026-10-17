package qb3;

import android.text.InputFilter;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cash_topup.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements jki.p {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputFilter f244106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f244107b;

    public t(u80.o moneyPrefixFormatter, InputFilter amountInputFilter, u hintMapper) {
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountInputFilter, "amountInputFilter");
        Intrinsics.checkNotNullParameter(hintMapper, "hintMapper");
        this.f244106a = amountInputFilter;
        this.f244107b = hintMapper;
    }

    public static TextLocalisedClause b(h hVar) {
        return new TextLocalisedClause(R$string.topup_cash_amount_balance, zhm.u.c(new MoneyClause(hVar.f244088a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r29) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb3.t.a(jki.i):jki.m");
    }
}
