package nq;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class r implements t {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f218327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vw.o f218328b;

    public r(l0 metadata, vw.o payload) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f218327a = metadata;
        this.f218328b = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f218327a, rVar.f218327a) && Intrinsics.f(this.f218328b, rVar.f218328b);
    }

    public final int hashCode() {
        return this.f218328b.hashCode() + (this.f218327a.hashCode() * 31);
    }
}
