package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: loaded from: classes13.dex */
public final class f0 extends z1 {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SocketAddress f124798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InetSocketAddress f124799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124800c;
    public final String d;

    public f0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        Preconditions.checkNotNull(socketAddress, "proxyAddress");
        Preconditions.checkNotNull(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            Preconditions.checkState(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f124798a = socketAddress;
        this.f124799b = inetSocketAddress;
        this.f124800c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Objects.equal(this.f124798a, f0Var.f124798a) && Objects.equal(this.f124799b, f0Var.f124799b) && Objects.equal(this.f124800c, f0Var.f124800c) && Objects.equal(this.d, f0Var.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f124798a, this.f124799b, this.f124800c, this.d);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("proxyAddr", this.f124798a).add("targetAddr", this.f124799b).add("username", this.f124800c).add("hasPassword", this.d != null).toString();
    }
}
