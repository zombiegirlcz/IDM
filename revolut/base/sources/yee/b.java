package yee;

import a0.d;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f312912c;
    public final String d;
    public final Set e;
    public final Set f;

    public b(String packageName, String fingerprintSha256, long j2, String installationSource, Set capabilities, Set requestedPermissions) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(fingerprintSha256, "fingerprintSha256");
        Intrinsics.checkNotNullParameter(installationSource, "installationSource");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(requestedPermissions, "requestedPermissions");
        this.f312910a = packageName;
        this.f312911b = fingerprintSha256;
        this.f312912c = j2;
        this.d = installationSource;
        this.e = capabilities;
        this.f = requestedPermissions;
    }

    public static b a(b bVar, Set requestedPermissions) {
        String packageName = bVar.f312910a;
        String fingerprintSha256 = bVar.f312911b;
        long j2 = bVar.f312912c;
        String installationSource = bVar.d;
        Set capabilities = bVar.e;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(fingerprintSha256, "fingerprintSha256");
        Intrinsics.checkNotNullParameter(installationSource, "installationSource");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(requestedPermissions, "requestedPermissions");
        return new b(packageName, fingerprintSha256, j2, installationSource, capabilities, requestedPermissions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f312910a, bVar.f312910a) && Intrinsics.f(this.f312911b, bVar.f312911b) && this.f312912c == bVar.f312912c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.f(p.a.c(d.c(p.a.c(this.f312910a.hashCode() * 31, 31, this.f312911b), 31, this.f312912c), 31, this.d), 31, this.e);
    }

    public b(String str, String str2, long j2, String str3, Set set) {
        this(str, str2, j2, str3, set, h0.f322473a);
    }
}
