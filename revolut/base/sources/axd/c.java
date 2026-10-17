package axd;

import bw0.l;
import bw0.m;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.staking.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements zwd.a {
    @Override // zwd.a
    public final boolean a(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error instanceof a;
    }

    @Override // zwd.a
    public final y b(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return null;
    }

    @Override // zwd.a
    public final bw0.d c(yqi.b error) {
        int i;
        Intrinsics.checkNotNullParameter(error, "error");
        a aVar = error instanceof a ? (a) error : null;
        if (aVar == null) {
            return null;
        }
        int i2 = b.f10928a[aVar.f10927b.ordinal()];
        if (i2 == 1) {
            i = R$string.staking_validator_insufficient_funds_stake_suggestion;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.staking_validator_insufficient_funds_unstake_suggestion;
        }
        return zwd.f.c(i, aVar.f10926a);
    }

    @Override // zwd.a
    public final m d(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new m(new TextLocalisedClause(R$string.staking_validator_insufficient_funds, null, null, 14), l.ERROR, null, false, null);
    }
}
