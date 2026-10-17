package kj0;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f184266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Duration f184267b;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f184266a == gVar.f184266a && Intrinsics.f(this.f184267b, gVar.f184267b);
    }

    public final int hashCode() {
        return this.f184267b.hashCode() + (Integer.hashCode(this.f184266a) * 31);
    }

    public g(int i) {
        Duration openDuration = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(openDuration, "ofSeconds(...)");
        Intrinsics.checkNotNullParameter(openDuration, "openDuration");
        this.f184266a = 30;
        this.f184267b = openDuration;
    }
}
