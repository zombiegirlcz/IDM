package al3;

import com.revolut.feature.confirmationcode.impl.network.retrofit.LoginService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl0.a f6139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoginService f6140b;

    public a(tl0.a base64Wrapper, LoginService authenticationService) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(authenticationService, "authenticationService");
        this.f6139a = base64Wrapper;
        this.f6140b = authenticationService;
    }
}
