package vg0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class x implements a0 {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f288716b;

    public x(String clientDataJSON, String attestationObject) {
        Intrinsics.checkNotNullParameter(clientDataJSON, "clientDataJSON");
        Intrinsics.checkNotNullParameter(attestationObject, "attestationObject");
        this.f288715a = clientDataJSON;
        this.f288716b = attestationObject;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f288715a, xVar.f288715a) && Intrinsics.f(this.f288716b, xVar.f288716b);
    }

    public final int hashCode() {
        return this.f288716b.hashCode() + (this.f288715a.hashCode() * 31);
    }
}
