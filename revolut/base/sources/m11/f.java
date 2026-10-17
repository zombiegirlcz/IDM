package m11;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f201175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f11.c f201176b;

    public f(Data challengeStatus, f11.c cVar) {
        Intrinsics.checkNotNullParameter(challengeStatus, "challengeStatus");
        this.f201175a = challengeStatus;
        this.f201176b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f201175a, fVar.f201175a) && this.f201176b == fVar.f201176b;
    }

    public final int hashCode() {
        int iHashCode = this.f201175a.hashCode() * 31;
        f11.c cVar = this.f201176b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
