package o97;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f223129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f223130b;

    public t(s sVar, Map overrides) {
        Intrinsics.checkNotNullParameter(sVar, "default");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        this.f223129a = sVar;
        this.f223130b = overrides;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final s a(m0 sourceIdentifier) {
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        s sVar = (s) this.f223130b.get(sourceIdentifier);
        return sVar == null ? this.f223129a : sVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f223129a.equals(tVar.f223129a) && this.f223130b.equals(tVar.f223130b);
    }

    public final int hashCode() {
        return this.f223130b.hashCode() + (this.f223129a.hashCode() * 31);
    }
}
