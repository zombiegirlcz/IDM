package hb4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import h43.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx4.z;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f150611b;

    public o(z creditScreenConstructorMapper, int i) {
        this.f150610a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
                this.f150611b = creditScreenConstructorMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
                this.f150611b = creditScreenConstructorMapper;
                break;
        }
    }

    public static TextLocalisedClause a(String str) {
        int i = R$string.congratulations_template_prompt_title;
        if (str == null) {
            str = "";
        }
        return new TextLocalisedClause(i, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    public static TextLocalisedClause b(String str) {
        int i = R$string.family_credit_card_settings_title;
        if (str == null) {
            str = "";
        }
        return new TextLocalisedClause(i, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        switch (this.f150610a) {
            case 0:
                e domainState = (e) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                return (j) iii.c.f(domainState.f150599b, new k(this, 1), new q(this, 28), new n(this, domainState, 0));
            default:
                x64.j domainState2 = (x64.j) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                return (x64.o) iii.c.f(domainState2.f303040b, new x64.a(this, 1), new x48.a(this, 4), new wx6.k(this, domainState2, 7));
        }
    }
}
