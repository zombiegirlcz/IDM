package rs7;

import kotlin.jvm.internal.Intrinsics;
import ts7.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f257038a;

    public a(c embeddedClaims) {
        Intrinsics.checkNotNullParameter(embeddedClaims, "embeddedClaims");
        this.f257038a = embeddedClaims;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f257038a, ((a) obj2).f257038a);
    }

    public final int hashCode() {
        return this.f257038a.hashCode();
    }
}
