package lo5;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f197410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f197411b;

    public s(Set supportedRecipients, r entrypoint) {
        Intrinsics.checkNotNullParameter(supportedRecipients, "supportedRecipients");
        Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
        this.f197410a = supportedRecipients;
        this.f197411b = entrypoint;
    }

    public final r b() {
        return this.f197411b;
    }

    public final Set c() {
        return this.f197410a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f197410a, sVar.f197410a) && this.f197411b == sVar.f197411b;
    }

    public final int hashCode() {
        return this.f197411b.hashCode() + (this.f197410a.hashCode() * 31);
    }
}
