package of6;

import com.revolut.feature.external_accounts.impl.data.open_banking_brazil.inbound.BrazilInboundOpenBankingService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrazilInboundOpenBankingService f224745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f224746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f224747c;
    public re6.a d;

    public e(BrazilInboundOpenBankingService brazilInboundOpenBankingService, ue0.c pixMandateCreationStorage) {
        Intrinsics.checkNotNullParameter(brazilInboundOpenBankingService, "brazilInboundOpenBankingService");
        Intrinsics.checkNotNullParameter(pixMandateCreationStorage, "pixMandateCreationStorage");
        this.f224745a = brazilInboundOpenBankingService;
        this.f224746b = pixMandateCreationStorage;
        this.f224747c = hlm.d.a();
    }
}
