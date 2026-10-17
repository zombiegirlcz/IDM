package tuk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nel.n f274625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f274626b;

    public f(nel.n instrument, Data instrumentDetails) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        this.f274625a = instrument;
        this.f274626b = instrumentDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f274625a, fVar.f274625a) && Intrinsics.f(this.f274626b, fVar.f274626b);
    }

    public final int hashCode() {
        return this.f274626b.hashCode() + (this.f274625a.hashCode() * 31);
    }
}
