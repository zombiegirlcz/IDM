package ij6;

import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.BrazilConsentDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import ieg.y;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk6.b f161717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrazilConsentDetailsScreenContract$InputData f161718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je6.h f161719c;

    public k(lk6.b brazilPaymentConsentMapper, BrazilConsentDetailsScreenContract$InputData inputData, je6.h institutionLogoMapper) {
        Intrinsics.checkNotNullParameter(brazilPaymentConsentMapper, "brazilPaymentConsentMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(institutionLogoMapper, "institutionLogoMapper");
        this.f161717a = brazilPaymentConsentMapper;
        this.f161718b = inputData;
        this.f161719c = institutionLogoMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f161713a;
        com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c cVar = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) data.getContent();
        ThirdPartyBrazil thirdPartyBrazil = cVar != null ? cVar.f : null;
        return new h((List) iii.c.f(data, new igh.k(this, 26), new y(24), new igh.o(this, 6)), data.getLoading(), new yy0.j(((di6.a) this.f161719c).c(thirdPartyBrazil != null ? thirdPartyBrazil.f73115a : null)), thirdPartyBrazil != null ? thirdPartyBrazil.f73116b : null);
    }
}
