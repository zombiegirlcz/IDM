package xj0;

import com.revolut.core.network.exceptions.NetworkConnectException;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import java.io.IOException;
import java.net.ConnectException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import ulm.j1;
import ulm.y0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b80.c f306435a;

    public a(b80.c connectivityRepository) {
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        this.f306435a = connectivityRepository;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) throws Exception {
        Intrinsics.checkNotNullParameter(chain, "chain");
        b80.c cVar = this.f306435a;
        boolean z = false;
        if (cVar.a() == al0.a.OFFLINE) {
            ConnectException connectException = new ConnectException("NetworkStateRepository check for internet connection failed");
            j1 j1Var = ((zlm.h) chain).e;
            throw new NetworkConnectException(j1Var.f281096b, j1Var.f281095a, false, connectException);
        }
        try {
            return ((zlm.h) chain).b(((zlm.h) chain).e);
        } catch (Exception e) {
            if (!(e instanceof IOException) && !(e instanceof CallNotPermittedException)) {
                throw e;
            }
            if (!(e instanceof ConnectException) && !(e instanceof CallNotPermittedException) && cVar.a() == al0.a.ONLINE) {
                z = true;
            }
            j1 j1Var2 = ((zlm.h) chain).e;
            throw new NetworkConnectException(j1Var2.f281096b, j1Var2.f281095a, z, e);
        }
    }
}
