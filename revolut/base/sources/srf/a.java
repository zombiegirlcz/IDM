package srf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.shared_core.R$string;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f265206a = new a();

    private a() {
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.transfer_validation_error_balance, null, null, 14);
    }
}
