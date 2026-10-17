package wg9;

import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of9.f f297266a;

    public t(of9.f commonProvider, of9.g validator) {
        Intrinsics.checkNotNullParameter(commonProvider, "commonProvider");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f297266a = commonProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = domainState.f297248a;
        List list = domainState.f297250c;
        return new n(this.f297266a.d(arrayList, list), domainState.d, domainState.e, new aw0.e(true, domainState.f, null, new n6(new TextLocalisedClause(R$string.pay_bills_taxes_common_review, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "FORM_SCREEN_BUTTON_LOADING_TAG", of9.g.a(domainState.f297248a, of9.d.a(list)), null, null, 972), null, null, 52), domainState.f297251g != null);
    }
}
