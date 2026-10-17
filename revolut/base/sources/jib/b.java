package jib;

import com.revolut.feature.retail.salary_account.api.navigation.VerifyEmploymentDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kib.a f174420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f174421b;

    public b(kib.a workEmailVerificationTokenProvider) {
        Intrinsics.checkNotNullParameter(workEmailVerificationTokenProvider, "workEmailVerificationTokenProvider");
        this.f174420a = workEmailVerificationTokenProvider;
        this.f174421b = y0.b("incentives/work-email/verify");
    }

    @Override // xii.b
    public final Set a() {
        return this.f174421b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195041c;
        String token = g.a("token", linkedHashMap);
        String strA = g.a("email", linkedHashMap);
        if (token != null) {
            kib.a aVar = this.f174420a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(token, "token");
            aVar.f184193a.k(token);
        }
        return new VerifyEmploymentDestination(token, strA);
    }
}
