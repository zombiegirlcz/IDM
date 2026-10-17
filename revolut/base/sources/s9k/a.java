package s9k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$string;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f261195a = new a();

    private a() {
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.payments_peer_to_peer_transfer_error_overdraft_usage, null, null, 14);
    }
}
