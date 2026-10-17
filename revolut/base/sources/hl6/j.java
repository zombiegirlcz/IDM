package hl6;

import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutboundOpenBankingClient f152993a;

    public j(OutboundOpenBankingClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f152993a = client;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f152993a, ((j) obj2).f152993a);
    }

    public final int hashCode() {
        return this.f152993a.hashCode();
    }
}
