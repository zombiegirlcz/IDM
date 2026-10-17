package com.fourthline.orca.internal;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: classes23.dex */
final class ig0 extends ulm.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f29579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g80 f29580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Response f29581c;

    public ig0(ConcurrentHashMap metricsByRequestId) {
        Intrinsics.checkNotNullParameter(metricsByRequestId, "metricsByRequestId");
        this.f29579a = metricsByRequestId;
        this.f29580b = new g80();
    }

    @Override // ulm.m0
    public void callEnd(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f29580b.a(System.nanoTime());
        Response response = this.f29581c;
        if (response == null) {
            return;
        }
        bb0 bb0VarA = this.f29580b.a();
        String strA = response.f226087a.a("X-Fl-Network-Metrics-Request-Id");
        if (strA == null || kotlin.text.d0.W(strA)) {
            return;
        }
        this.f29579a.put(strA, bb0VarA);
    }

    @Override // ulm.m0
    public void callStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f29580b.b(System.nanoTime());
    }

    @Override // ulm.m0
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, ulm.h1 h1Var) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        this.f29580b.c(System.nanoTime());
        this.f29580b.a(h1Var != null ? h1Var.toString() : null);
    }

    @Override // ulm.m0
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, ulm.h1 h1Var, IOException ioe2) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe2, "ioe");
        this.f29580b.c(System.nanoTime());
    }

    @Override // ulm.m0
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        this.f29580b.d(System.nanoTime());
    }

    @Override // ulm.m0
    public void connectionAcquired(Call call, ulm.w connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        g80 g80Var = this.f29580b;
        g80Var.a(Boolean.valueOf(g80Var.b() == 0));
    }

    @Override // ulm.m0
    public void connectionReleased(Call call, ulm.w connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    @Override // ulm.m0
    public void dnsEnd(Call call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        this.f29580b.e(System.nanoTime());
    }

    @Override // ulm.m0
    public void dnsStart(Call call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        this.f29580b.f(System.nanoTime());
    }

    @Override // ulm.m0
    public void requestBodyEnd(Call call, long j2) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f29580b.h(System.nanoTime());
        this.f29580b.g(j2);
    }

    @Override // ulm.m0
    public void requestBodyStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f29580b.i(System.nanoTime());
    }

    @Override // ulm.m0
    public void requestHeadersEnd(Call call, ulm.j1 request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f29580b.j(System.nanoTime());
    }

    @Override // ulm.m0
    public void requestHeadersStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f29580b.k(System.nanoTime());
    }

    @Override // ulm.m0
    public void responseBodyEnd(Call call, long j2) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f29580b.m(System.nanoTime());
        this.f29580b.l(j2);
    }

    @Override // ulm.m0
    public void responseBodyStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f29580b.n(System.nanoTime());
    }

    @Override // ulm.m0
    public void responseHeadersEnd(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f29580b.o(System.nanoTime());
        this.f29581c = response;
    }

    @Override // ulm.m0
    public void responseHeadersStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f29580b.p(System.nanoTime());
    }

    @Override // ulm.m0
    public void secureConnectEnd(Call call, ulm.r0 r0Var) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f29580b.q(System.nanoTime());
    }

    @Override // ulm.m0
    public void secureConnectStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f29580b.r(System.nanoTime());
    }
}
