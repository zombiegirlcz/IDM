package tj0;

import com.revolut.core.mobile_services.api.exceptions.MsApiException;
import com.revolut.core.network.exceptions.NetworkConnectException;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.reactivex.exceptions.CompositeException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.StreamResetException;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f271593a = v.k("POST", "PUT", "DELETE", "PATCH", "UPDATE");

    public static final boolean a(Throwable th10) {
        if (!(th10 instanceof CompositeException)) {
            if (!b(th10)) {
                if (!b(th10 != null ? th10.getCause() : null)) {
                    return false;
                }
            }
            return true;
        }
        List list = ((CompositeException) th10).f163108a;
        Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (b((Throwable) it8.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(Throwable th10) {
        return th10 instanceof NetworkConnectException ? !((NetworkConnectException) th10).f51446a : th10 instanceof MsApiException ? v.k(jh0.b.API_NOT_CONNECTED, jh0.b.CANCELED, jh0.b.CONNECTION_SUSPENDED_DURING_CALL, jh0.b.INTERNAL_ERROR, jh0.b.INTERRUPTED, jh0.b.NETWORK_ERROR, jh0.b.RECONNECTION_TIMED_OUT_DURING_UPDATE, jh0.b.TIMEOUT).contains(((MsApiException) th10).getF51387a()) : (th10 instanceof ConnectException) || (th10 instanceof CallNotPermittedException) || (th10 instanceof UnknownHostException) || (th10 instanceof SSLPeerUnverifiedException) || (th10 instanceof StreamResetException) || (th10 instanceof SocketException) || (th10 instanceof SocketTimeoutException) || (th10 instanceof SSLException);
    }
}
