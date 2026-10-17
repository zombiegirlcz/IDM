package lz4;

import it3.e;
import it3.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f200935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f200936c;
    public final String d;
    public final gs3.a e;

    public a(String applicationId, f state, boolean z, String facilityId, gs3.a type) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f200934a = applicationId;
        this.f200935b = state;
        this.f200936c = z;
        this.d = facilityId;
        this.e = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200934a, aVar.f200934a) && this.f200935b == aVar.f200935b && this.f200936c == aVar.f200936c && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(j6.a.c((this.f200935b.hashCode() + (this.f200934a.hashCode() * 31)) * 31, 31, this.f200936c), 31, this.d);
    }
}
