package yd5;

import com.revolut.domain.models.user.UserCompanyRegion;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f312638a;

    static {
        UserCompanyRegion[] elements = {UserCompanyRegion.LT, UserCompanyRegion.HU, UserCompanyRegion.NL, UserCompanyRegion.RO, UserCompanyRegion.DE, UserCompanyRegion.PT, UserCompanyRegion.ES, UserCompanyRegion.IE, UserCompanyRegion.PL, UserCompanyRegion.BE, UserCompanyRegion.FR, UserCompanyRegion.IT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f312638a = d.y0(elements);
    }

    private a() {
    }
}
