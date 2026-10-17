package ewc;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.repository.LimitValue;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import cuc.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xtc.d f130162a;

    public g(xtc.d securityHubIconMapper, rwc.c securityHubImageProgressStyleMapper) {
        Intrinsics.checkNotNullParameter(securityHubIconMapper, "securityHubIconMapper");
        Intrinsics.checkNotNullParameter(securityHubImageProgressStyleMapper, "securityHubImageProgressStyleMapper");
        this.f130162a = securityHubIconMapper;
    }

    public final ArrayList a(List list) {
        int i;
        Clause compositeClause;
        List<OutboundTransactionLimit> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (OutboundTransactionLimit outboundTransactionLimit : list2) {
            String str = outboundTransactionLimit.e;
            LimitValue limitValue = outboundTransactionLimit.f85477c;
            LimitValue limitValue2 = outboundTransactionLimit.f85476b;
            h hVar = outboundTransactionLimit.i;
            cuc.f fVar = outboundTransactionLimit.f85475a;
            String strQ = j6.a.q("LIMIT_ID_", str);
            TextClause textClause = new TextClause(outboundTransactionLimit.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int[] iArr = f.f130161b;
            int i2 = iArr[hVar.ordinal()];
            ProgressStyle progressStyleA = null;
            if (i2 == 1 || i2 == 2) {
                i = 1;
                compositeClause = fVar != cuc.f.DEACTIVATED ? new CompositeClause(v.k(com.revolut.feature.security_hub.impl.repository.a.a(limitValue), com.revolut.feature.security_hub.impl.repository.a.a(limitValue2)), new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12) : null;
            } else if (i2 == 3) {
                i = 1;
                compositeClause = new TextLocalisedClause(R$string.security_hub_transactions_limits_per_transfer, u.c(com.revolut.feature.security_hub.impl.repository.a.a(limitValue2)), null, 12);
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 1;
            }
            Integer numA = this.f130162a.a(outboundTransactionLimit.f85479h);
            GlyphImage glyphImage = new GlyphImage(numA != null ? numA.intValue() : R$drawable.uikit_icn_24_limit, null, null, 6);
            WarningCircleBadge warningCircleBadge = fVar == cuc.f.PENDING ? new WarningCircleBadge(dw0.a.Pending) : null;
            int i3 = iArr[hVar.ordinal()];
            if (i3 == i || i3 == 2) {
                if (fVar != cuc.f.DEACTIVATED) {
                    progressStyleA = rwc.c.a(limitValue.f85471a, limitValue2.f85471a);
                }
            } else if (i3 != 3 && i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(glyphImage, warningCircleBadge, progressStyleA, false, null, false, 56), textClause, null, 0, compositeClause, null, null, 0, null, true, null, false, null, null, null, null, null, null, outboundTransactionLimit, null, 0, 0, 0, 0, 532673496));
        }
        return arrayList;
    }
}
