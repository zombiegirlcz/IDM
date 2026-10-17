package ll7;

import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceCarService f196649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i90.b f196650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f196651c;

    public p(InsuranceCarService service, i90.b uuidGenerator, String baseUrl) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.f196649a = service;
        this.f196650b = uuidGenerator;
        this.f196651c = baseUrl;
    }
}
