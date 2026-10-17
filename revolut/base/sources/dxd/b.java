package dxd;

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
public final class b implements zwd.a {
    @Override // zwd.a
    public final boolean a(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error instanceof a;
    }

    @Override // zwd.a
    public final y b(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a aVar = error instanceof a ? (a) error : null;
        if (aVar == null) {
            return null;
        }
        return zwd.f.a(new TextLocalisedClause(R$string.staking_validator_min_amount_info_title, null, null, 14), new TextLocalisedClause(R$string.staking_validator_min_amount_info_unstake_description, u.c(zwd.f.b(aVar.f120936a)), null, 12), new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null);
    }

    @Override // zwd.a
    public final bw0.d c(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a aVar = error instanceof a ? (a) error : null;
        if (aVar == null) {
            return null;
        }
        return zwd.f.c(R$string.staking_validator_min_amount_suggestion, aVar.f120936a);
    }

    @Override // zwd.a
    public final m d(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a aVar = error instanceof a ? (a) error : null;
        if (aVar == null) {
            return null;
        }
        return new m(new TextLocalisedClause(R$string.staking_validator_min_amount, u.c(zwd.f.b(aVar.f120936a)), null, 12), l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, error);
    }
}
