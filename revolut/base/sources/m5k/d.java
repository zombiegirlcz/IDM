package m5k;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.feature.payments.core.R$string;
import k5k.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f202958a;

    public d(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f202958a = userInteractor;
    }

    public static TextLocalisedClause b() {
        int i = R$string.payments_picker_breakdown_commodity_personal_terms;
        TermsScope.INSTANCE.getClass();
        return new TextLocalisedClause(i, null, new Click(28, (Integer) null, (Object) new j(TermsScope.S), "PERSONAL_TERMS_UK_LINK", false), 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xi0.b r11, xi0.b r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5k.d.a(xi0.b, xi0.b, gim.c):java.lang.Object");
    }
}
