package ulm;

import ch.qos.logback.core.CoreConstants;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f281054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f281055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f281056c;
    public final HostnameVerifier d;
    public final t e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f281057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0 f281058h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f281059j;

    public a(String uriHost, int i, ah.a dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, t tVar, b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f281054a = dns;
        this.f281055b = socketFactory;
        this.f281056c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = tVar;
        this.f = proxyAuthenticator;
        this.f281057g = proxySelector;
        v0 v0Var = new v0();
        v0Var.h(sSLSocketFactory != null ? "https" : "http");
        v0Var.c(uriHost);
        v0Var.e(i);
        this.f281058h = v0Var.b();
        this.i = vlm.j.q(protocols);
        this.f281059j = vlm.j.q(connectionSpecs);
    }

    public final boolean a(a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.f(this.f281054a, that.f281054a) && Intrinsics.f(this.f, that.f) && Intrinsics.f(this.i, that.i) && Intrinsics.f(this.f281059j, that.f281059j) && Intrinsics.f(this.f281057g, that.f281057g) && Intrinsics.f(this.f281056c, that.f281056c) && Intrinsics.f(this.d, that.d) && Intrinsics.f(this.e, that.e) && this.f281058h.e == that.f281058h.e;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f281058h, aVar.f281058h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f281056c) + ((this.f281057g.hashCode() + p.a.d(p.a.d((this.f.hashCode() + ((this.f281054a.hashCode() + p.a.c(527, 31, this.f281058h.i)) * 31)) * 31, 31, this.i), 31, this.f281059j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Address{");
        x0 x0Var = this.f281058h;
        sb6.append(x0Var.d);
        sb6.append(CoreConstants.COLON_CHAR);
        sb6.append(x0Var.e);
        sb6.append(", ");
        sb6.append("proxySelector=" + this.f281057g);
        sb6.append(CoreConstants.CURLY_RIGHT);
        return sb6.toString();
    }
}
