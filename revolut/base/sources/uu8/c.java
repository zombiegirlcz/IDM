package uu8;

import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f283166a;

    public c(a inputData, tu8.d consentUiProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(consentUiProvider, "consentUiProvider");
        this.f283166a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        a aVar = this.f283166a;
        my8.k kycConsent = aVar.f283163a;
        wi0.b countryCode = aVar.f283164b;
        Intrinsics.checkNotNullParameter(kycConsent, "kycConsent");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        TextLocalisedClause title = tu8.d.c(kycConsent, countryCode);
        Clause description = tu8.d.b(kycConsent, countryCode, null);
        TextLocalisedClause buttonText = tu8.d.a(kycConsent, countryCode);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        return new b(new cii.a(new lw0.a(title, description, null, null, false, 28), new aw0.e(false, null, null, new n6(buttonText, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55)));
    }
}
