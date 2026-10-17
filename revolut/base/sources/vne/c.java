package vne;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f290797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290798b;

    public c(Data exemptions, String str) {
        Intrinsics.checkNotNullParameter(exemptions, "exemptions");
        this.f290797a = exemptions;
        this.f290798b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f290797a, cVar.f290797a) && Intrinsics.f(this.f290798b, cVar.f290798b);
    }

    public final int hashCode() {
        int iHashCode = this.f290797a.hashCode() * 31;
        String str = this.f290798b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
