package ar;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8475b;

    public a(String fileName, String verificationId) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        this.f8474a = fileName;
        this.f8475b = verificationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f8474a, aVar.f8474a) && Intrinsics.f(this.f8475b, aVar.f8475b);
    }

    public final int hashCode() {
        return this.f8475b.hashCode() + (this.f8474a.hashCode() * 31);
    }
}
