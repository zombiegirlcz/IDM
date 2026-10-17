package ri5;

import com.revolut.domain.models.user.UserCompanyRegion;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f254555a;

    public a() {
        UserCompanyRegion[] elements = {UserCompanyRegion.EEA, UserCompanyRegion.CH, UserCompanyRegion.FR, UserCompanyRegion.LT, UserCompanyRegion.IE, UserCompanyRegion.ES, UserCompanyRegion.NL, UserCompanyRegion.DE, UserCompanyRegion.BE, UserCompanyRegion.PT, UserCompanyRegion.IT, UserCompanyRegion.PL, UserCompanyRegion.AT, UserCompanyRegion.GR, UserCompanyRegion.HU, UserCompanyRegion.RO};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f254555a = d.y0(elements);
    }
}
