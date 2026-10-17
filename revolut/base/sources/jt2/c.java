package jt2;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.retail.feature.business.referrals.shared.impl.R$string;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ru.y;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fnc.s f178317b;

    public /* synthetic */ c(fnc.s sVar, int i) {
        this.f178316a = i;
        this.f178317b = sVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        int i = this.f178316a;
        y content = (y) obj2;
        ((Boolean) obj3).getClass();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(content, "content");
                String str = content.f257392j;
                if (str != null) {
                    return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                ru.j jVar = content.f257390g;
                if (jVar == null) {
                    return this.f178317b.e();
                }
                dj0.d rewardAmount = jVar.f257367a;
                Intrinsics.checkNotNullParameter(rewardAmount, "rewardAmount");
                return new TextLocalisedClause(R$string.business_referrals_active_campaign_header_title, zhm.u.c(new MoneyClause(rewardAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
            default:
                Intrinsics.checkNotNullParameter(content, "content");
                Long l2 = content.i;
                if (l2 == null) {
                    return null;
                }
                long jLongValue = l2.longValue();
                return new TextLocalisedQuantityClause(((n5j.b) ((vu.g) this.f178317b.f136657b)).a(vu.e.business_referrals_active_campaign_header_subtitle), Integer.valueOf((int) jLongValue), zhm.u.c(Long.valueOf(jLongValue)), (Style) null, 24);
        }
    }
}
