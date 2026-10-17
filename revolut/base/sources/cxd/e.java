package cxd;

import bw0.l;
import bw0.m;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements zwd.a {
    @Override // zwd.a
    public final boolean a(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error instanceof d;
    }

    @Override // zwd.a
    public final y b(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        d dVar = error instanceof d ? (d) error : null;
        if (dVar == null) {
            return null;
        }
        dj0.d dVar2 = dVar.f109912b;
        return zwd.f.a(new TextLocalisedClause(R$string.staking_validator_max_balance_info_title, u.c(dVar2.f115083b.f306286a), null, 12), new TextLocalisedClause(R$string.staking_validator_max_balance_info_description, u.c(zwd.f.b(dVar2)), null, 12), new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null);
    }

    @Override // zwd.a
    public final bw0.d c(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        d dVar = error instanceof d ? (d) error : null;
        if (dVar == null) {
            return null;
        }
        return zwd.f.c(R$string.staking_validator_max_balance_suggestion, dVar.f109911a);
    }

    @Override // zwd.a
    public final m d(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new m(new TextLocalisedClause(R$string.staking_validator_max_balance, null, null, 14), l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, error);
    }
}
