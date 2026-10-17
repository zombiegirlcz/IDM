package i1l;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f157651a = new h();

    private h() {
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.transfer_error_zero_or_negative_amount, null, null, 14);
    }
}
