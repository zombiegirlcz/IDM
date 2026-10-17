package q17;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.impl.R$string;
import jr6.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f241401a;

    public q(u saleStateMapper) {
        Intrinsics.checkNotNullParameter(saleStateMapper, "saleStateMapper");
        this.f241401a = saleStateMapper;
    }

    public static TextLocalisedClause a(FreelancerOrder freelancerOrder) {
        return new TextLocalisedClause(R$string.freelancer_sale_status_kind_expired, zhm.u.c(new TimeClause(freelancerOrder.f73304x.getMillis(), TimeClause.Format.DateLong.f57962b, null, null, 12)), null, 12);
    }
}
