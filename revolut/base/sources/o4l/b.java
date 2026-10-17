package o4l;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f222299b;

    public b(String exchange, ArrayList sessions) {
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        this.f222298a = exchange;
        this.f222299b = sessions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f222298a, bVar.f222298a) && this.f222299b.equals(bVar.f222299b);
    }

    public final int hashCode() {
        return this.f222299b.hashCode() + (this.f222298a.hashCode() * 31);
    }
}
