package de9;

import android.text.format.DateUtils;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.passcode.R$string;
import dce.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements jki.p {
    public y(z timeFormatter) {
        Intrinsics.checkNotNullParameter(timeFormatter, "timeFormatter");
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = null;
        if (domainState.f113324c) {
            String elapsedTime = DateUtils.formatElapsedTime(domainState.f113323b);
            Intrinsics.checkNotNullExpressionValue(elapsedTime, "formatElapsedTime(...)");
            textLocalisedClause = new TextLocalisedClause(R$string.passcode_incorrect_locked_message, zhm.u.c(elapsedTime), null, 12);
        }
        return (q) iii.c.f(domainState.d, new l0(domainState, 3), new a8a.a(textLocalisedClause, domainState, 18), new cab.m(domainState, textLocalisedClause, 20));
    }
}
