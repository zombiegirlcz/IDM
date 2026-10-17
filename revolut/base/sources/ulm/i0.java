package ulm;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: classes14.dex */
public final class i0 extends m0 {
    public final m0[] d;

    public i0(m0[] eventListeners) {
        Intrinsics.checkNotNullParameter(eventListeners, "eventListeners");
        this.d = eventListeners;
    }

    public final m0[] a() {
        return this.d;
    }

    @Override // ulm.m0
    public final void cacheConditionalHit(Call call, Response cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        for (m0 m0Var : this.d) {
            m0Var.cacheConditionalHit(call, cachedResponse);
        }
    }

    @Override // ulm.m0
    public final void cacheHit(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        for (m0 m0Var : this.d) {
            m0Var.cacheHit(call, response);
        }
    }

    @Override // ulm.m0
    public final void cacheMiss(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        for (m0 m0Var : this.d) {
            m0Var.cacheMiss(call);
        }
    }

    @Override // ulm.m0
    public final void callEnd(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        for (m0 m0Var : this.d) {
            m0Var.callEnd(call);
        }
    }

    @Override // ulm.m0
    public final void callFailed(Call call, IOException ioe2) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe2, "ioe");
        for (m0 m0Var : this.d) {
            m0Var.callFailed(call, ioe2);
        }
    }

    @Override // ulm.m0
    public final void callStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        for (m0 m0Var : this.d) {
            m0Var.callStart(call);
        }
    }

    @Override // ulm.m0
    public final void canceled(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        for (m0 m0Var : this.d) {
            m0Var.canceled(call);
        }
    }

    @Override // ulm.m0
    public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, h1 h1Var) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        for (m0 m0Var : this.d) {
            m0Var.connectEnd(call, inetSocketAddress, proxy, h1Var);
        }
    }

    @Override // ulm.m0
    public final void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, h1 h1Var, IOException ioe2) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe2, "ioe");
        for (m0 m0Var : this.d) {
            m0Var.connectFailed(call, inetSocketAddress, proxy, null, ioe2);
        }
    }

    @Override // ulm.m0
    public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        for (m0 m0Var : this.d) {
            m0Var.connectStart(call, inetSocketAddress, proxy);
        }
    }

    @Override // ulm.m0
    public final void connectionAcquired(Call call, w connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        for (m0 m0Var : this.d) {
            m0Var.connectionAcquired(call, connection);
        }
    }

    @Override // ulm.m0
    public final void connectionReleased(Call call, w connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        for (m0 m0Var : this.d) {
            m0Var.connectionReleased(call, connection);
        }
    }

    @Override // ulm.m0
    public final void dispatcherQueueEnd(Call call, f0 dispatcher) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        for (m0 m0Var : this.d) {
            m0Var.dispatcherQueueEnd(call, dispatcher);
        }
    }

    @Override // ulm.m0
    public final void dispatcherQueueStart(Call call, f0 dispatcher) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        for (m0 m0Var : this.d) {
            m0Var.dispatcherQueueStart(call, dispatcher);
        }
    }

    @Override // ulm.m0
    public final void dnsEnd(Call call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        for (m0 m0Var : this.d) {
            m0Var.dnsEnd(call, domainName, inetAddressList);
        }
    }

    @Override // ulm.m0
    public final void dnsStart(Call call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        for (m0 m0Var : this.d) {
            m0Var.dnsStart(call, domainName);
        }
    }

    @Override // ulm.m0
    public final void followUpDecision(Call call, Response networkResponse, j1 j1Var) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        for (m0 m0Var : this.d) {
            m0Var.followUpDecision(call, networkResponse, j1Var);
        }
    }

    @Override // ulm.m0
    public final void proxySelectEnd(Call call, x0 url2, List proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        for (m0 m0Var : this.d) {
            m0Var.proxySelectEnd(call, url2, proxies);
        }
    }

    @Override // ulm.m0
    public final void proxySelectStart(Call call, x0 url2) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url2, "url");
        for (m0 m0Var : this.d) {
            m0Var.proxySelectStart(call, url2);
        }
    }

    @Override // ulm.m0
    public final void requestBodyEnd(Call call, long j2) {
        Intrinsics.checkNotNullParameter(call, "call");
        for (m0 m0Var : this.d) {
            m0Var.requestBodyEnd(call, j2);
        }
    }

    @Override // ulm.m0
    public final void requestBodyStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        for (m0 m0Var : this.d) {
            m0Var.requestBodyStart(call);
        }
    }

    @Override // ulm.m0
    public final void requestFailed(Call call, IOException ioe2) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe2, "ioe");
        for (m0 m0Var : this.d) {
            m0Var.requestFailed(call, ioe2);
        }
    }

    @Override // ulm.m0
    public final void requestHeadersEnd(Call call, j1 request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        for (m0 m0Var : this.d) {
            m0Var.requestHeadersEnd(call, request);
        }
    }

    @Override // ulm.m0
    public final void requestHeadersStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        for (m0 m0Var : this.d) {
            m0Var.requestHeadersStart(call);
        }
    }

    @Override // ulm.m0
    public final void responseBodyEnd(Call call, long j2) {
        Intrinsics.checkNotNullParameter(call, "call");
        for (m0 m0Var : this.d) {
            m0Var.responseBodyEnd(call, j2);
        }
    }

    @Override // ulm.m0
    public final void responseBodyStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        for (m0 m0Var : this.d) {
            m0Var.responseBodyStart(call);
        }
    }

    @Override // ulm.m0
    public final void responseFailed(Call call, IOException ioe2) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe2, "ioe");
        for (m0 m0Var : this.d) {
            m0Var.responseFailed(call, ioe2);
        }
    }

    @Override // ulm.m0
    public final void responseHeadersEnd(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        for (m0 m0Var : this.d) {
            m0Var.responseHeadersEnd(call, response);
        }
    }

    @Override // ulm.m0
    public final void responseHeadersStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        for (m0 m0Var : this.d) {
            m0Var.responseHeadersStart(call);
        }
    }

    @Override // ulm.m0
    public final void retryDecision(Call call, IOException exception, boolean z) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(exception, "exception");
        for (m0 m0Var : this.d) {
            m0Var.retryDecision(call, exception, z);
        }
    }

    @Override // ulm.m0
    public final void satisfactionFailure(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        for (m0 m0Var : this.d) {
            m0Var.satisfactionFailure(call, response);
        }
    }

    @Override // ulm.m0
    public final void secureConnectEnd(Call call, r0 r0Var) {
        Intrinsics.checkNotNullParameter(call, "call");
        for (m0 m0Var : this.d) {
            m0Var.secureConnectEnd(call, r0Var);
        }
    }

    @Override // ulm.m0
    public final void secureConnectStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        for (m0 m0Var : this.d) {
            m0Var.secureConnectStart(call);
        }
    }
}
