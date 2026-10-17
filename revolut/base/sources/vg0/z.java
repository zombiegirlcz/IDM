package vg0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class z implements a0 {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f288718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f288719c;
    public final String d;

    public z(String clientDataJSON, String authenticatorData, String signature, String userHandle) {
        Intrinsics.checkNotNullParameter(clientDataJSON, "clientDataJSON");
        Intrinsics.checkNotNullParameter(authenticatorData, "authenticatorData");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(userHandle, "userHandle");
        this.f288717a = clientDataJSON;
        this.f288718b = authenticatorData;
        this.f288719c = signature;
        this.d = userHandle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f288717a, zVar.f288717a) && Intrinsics.f(this.f288718b, zVar.f288718b) && Intrinsics.f(this.f288719c, zVar.f288719c) && Intrinsics.f(this.d, zVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f288717a.hashCode() * 31, 31, this.f288718b), 31, this.f288719c);
    }
}
