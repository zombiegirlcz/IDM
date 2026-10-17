package svi;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalTime;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f265914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f265915b;

    public h(LocalTime open, LocalTime close) {
        Intrinsics.checkNotNullParameter(open, "open");
        Intrinsics.checkNotNullParameter(close, "close");
        this.f265914a = open;
        this.f265915b = close;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f265914a, hVar.f265914a) && Intrinsics.f(this.f265915b, hVar.f265915b);
    }

    public final int hashCode() {
        return this.f265915b.hashCode() + (this.f265914a.hashCode() * 31);
    }
}
