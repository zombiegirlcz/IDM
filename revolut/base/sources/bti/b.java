package bti;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18587c;

    public b(ArrayList allAirports, ArrayList nearYouAirports, String flightNumberRegex) {
        Intrinsics.checkNotNullParameter(allAirports, "allAirports");
        Intrinsics.checkNotNullParameter(nearYouAirports, "nearYouAirports");
        Intrinsics.checkNotNullParameter(flightNumberRegex, "flightNumberRegex");
        this.f18585a = allAirports;
        this.f18586b = nearYouAirports;
        this.f18587c = flightNumberRegex;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f18585a.equals(bVar.f18585a) && this.f18586b.equals(bVar.f18586b) && Intrinsics.f(this.f18587c, bVar.f18587c);
    }

    public final int hashCode() {
        return this.f18587c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f18586b, this.f18585a.hashCode() * 31, 31);
    }
}
