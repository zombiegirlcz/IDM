package aye;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f11136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yte.m f11137b;

    public d(Data storedMethodDetail, yte.m mVar) {
        Intrinsics.checkNotNullParameter(storedMethodDetail, "storedMethodDetail");
        this.f11136a = storedMethodDetail;
        this.f11137b = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f11136a, dVar.f11136a) && this.f11137b == dVar.f11137b;
    }

    public final int hashCode() {
        int iHashCode = this.f11136a.hashCode() * 31;
        yte.m mVar = this.f11137b;
        return iHashCode + (mVar == null ? 0 : mVar.hashCode());
    }
}
