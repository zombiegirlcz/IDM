package sa2;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.z3;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import ip0.ck0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        String str = domainState.f261270c;
        String str2 = domainState.d;
        eVarB.add(new z3("LIST_ID_CODE", str, null, null, false, null, false, false, 0, 0, 0, 0, 4092));
        od0.a aVar = od0.a.f224253a;
        if (od0.a.e() && str2 != null && !d0.W(str2)) {
            eVarB.add(new TextDelegate.Model(0, 0, 1020, new TextClause("Debug code is ".concat(str2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "LIST_ID_DEBUG_CODE"));
            eVarB.add(new TextDelegate.Model(0, 0, 1016, new TextClause("Tap here to apply", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "APPLY_CODE_DEBUG_ID"));
        }
        long j2 = domainState.f261269b;
        boolean z = j2 > 0;
        l lVar = null;
        if (z) {
            long j3 = 60;
            textLocalisedClause = new TextLocalisedClause(R$string.verify_ownership_resend_code, u.c((j2 / j3) + ":" + d0.b0(String.valueOf(j2 % j3), 2, '0')), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.verify_ownership_button_resend_code, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        }
        eVarB.add(new TextDelegate.Model("LIST_ID_RESEND", textLocalisedClause, !z, new ck0(0), null, null, 0, 0, 0, 0, 2032));
        aim.e eVarA = u.a(eVarB);
        Alias alias = domainState.f261268a;
        AliasType aliasType = alias.f61878a;
        String str3 = alias.f61879b;
        if (Intrinsics.f(aliasType, AliasType.EMAIL.f61894b)) {
            lVar = new l(R$string.verify_ownership_email_title, R$string.verify_ownership_email_subtitle, str3);
        } else if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
            lVar = new l(R$string.verify_ownership_phone_title, R$string.verify_ownership_phone_subtitle, str3);
        }
        return new m(lVar, eVarA);
    }
}
