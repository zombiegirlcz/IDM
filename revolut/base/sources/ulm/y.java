package ulm;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f281168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f281169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f281170c;
    public boolean d;

    public y() {
        this.f281168a = true;
    }

    public final a0 a() {
        return new a0(this.f281168a, this.d, this.f281169b, this.f281170c);
    }

    public final void b(String... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (!this.f281168a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.f281169b = (String[]) objArrCopyOf;
    }

    public final void c(v... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (!this.f281168a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (v vVar : cipherSuites) {
            arrayList.add(vVar.f281155a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void d(String... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (!this.f281168a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.f281170c = (String[]) objArrCopyOf;
    }

    public final void e(v1... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (!this.f281168a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(tlsVersions.length);
        for (v1 v1Var : tlsVersions) {
            arrayList.add(v1Var.a());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public y(a0 connectionSpec) {
        Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        this.f281168a = connectionSpec.f281062a;
        this.f281169b = connectionSpec.f281064c;
        this.f281170c = connectionSpec.d;
        this.d = connectionSpec.f281063b;
    }
}
