package h21;

import com.revolut.network.b;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ij0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f148617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f148618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148619c;
    public final List d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f148620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f148621h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f148622j;
    public final ij0.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f148623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f148624m;

    public a(b versionName, int i, String baseUrl, List revolutHosts, boolean z, boolean z3, String sslHostPattern, List sslPins, boolean z4, b needToSimulatedDelay, ij0.b mandatoryInterceptorsProvider, b failingBackend, boolean z6) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(revolutHosts, "revolutHosts");
        Intrinsics.checkNotNullParameter(sslHostPattern, "sslHostPattern");
        Intrinsics.checkNotNullParameter(sslPins, "sslPins");
        Intrinsics.checkNotNullParameter(needToSimulatedDelay, "needToSimulatedDelay");
        Intrinsics.checkNotNullParameter(mandatoryInterceptorsProvider, "mandatoryInterceptorsProvider");
        Intrinsics.checkNotNullParameter(failingBackend, "failingBackend");
        Intrinsics.checkNotNullParameter("https://web3.revolut.com", "web3HostUrl");
        this.f148617a = versionName;
        this.f148618b = i;
        this.f148619c = baseUrl;
        this.d = revolutHosts;
        this.e = z;
        this.f = z3;
        this.f148620g = sslHostPattern;
        this.f148621h = sslPins;
        this.i = z4;
        this.f148622j = needToSimulatedDelay;
        this.k = mandatoryInterceptorsProvider;
        this.f148623l = failingBackend;
        this.f148624m = z6;
    }

    @Override // ij0.a
    public final boolean failingBackendEnabled() {
        return ((Boolean) this.f148623l.invoke()).booleanValue();
    }

    @Override // ij0.a
    public final String getAppTypeHeader() {
        return null;
    }

    @Override // ij0.a
    public final String getBaseUrl() {
        return this.f148619c;
    }

    @Override // ij0.a
    public final boolean getDebug() {
        return this.f;
    }

    @Override // ij0.a
    public final boolean getEndToEndMode() {
        return this.i;
    }

    @Override // ij0.a
    public final boolean getLogEnabled() {
        return this.e;
    }

    @Override // ij0.a
    public final ij0.b getMandatoryInterceptorsProvider() {
        return this.k;
    }

    @Override // ij0.a
    public final Function0 getNeedToSimulatedDelay() {
        return this.f148622j;
    }

    @Override // ij0.a
    public final List getRevolutHosts() {
        return this.d;
    }

    @Override // ij0.a
    public final String getSslHostPattern() {
        return this.f148620g;
    }

    @Override // ij0.a
    public final List getSslPins() {
        return this.f148621h;
    }

    @Override // ij0.a
    public final int getVersionCode() {
        return this.f148618b;
    }

    @Override // ij0.a
    public final Function0 getVersionName() {
        return this.f148617a;
    }

    @Override // ij0.a
    public final boolean signRequests() {
        return this.f148624m;
    }
}
