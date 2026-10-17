package kn3;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f185980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f185981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f185982c;

    public e(Map filtersWithItemsCount, ArrayList recipients, ArrayList extraRecipients) {
        Intrinsics.checkNotNullParameter(filtersWithItemsCount, "filtersWithItemsCount");
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        Intrinsics.checkNotNullParameter(extraRecipients, "extraRecipients");
        this.f185980a = filtersWithItemsCount;
        this.f185981b = recipients;
        this.f185982c = extraRecipients;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f185980a, eVar.f185980a) && this.f185981b.equals(eVar.f185981b) && this.f185982c.equals(eVar.f185982c);
    }

    public final int hashCode() {
        return this.f185982c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f185981b, this.f185980a.hashCode() * 31, 31);
    }
}
