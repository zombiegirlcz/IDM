package xr;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f308185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f308187c;

    public b(String verificationId, File file, String verificationToken) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
        this.f308185a = file;
        this.f308186b = verificationId;
        this.f308187c = verificationToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f308185a, bVar.f308185a) && Intrinsics.f(this.f308186b, bVar.f308186b) && Intrinsics.f(this.f308187c, bVar.f308187c);
    }

    public final int hashCode() {
        return this.f308187c.hashCode() + p.a.c(this.f308185a.hashCode() * 31, 31, this.f308186b);
    }
}
