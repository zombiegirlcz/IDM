package x12;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302090b;

    public d(List files, String str) {
        Intrinsics.checkNotNullParameter(files, "files");
        this.f302089a = files;
        this.f302090b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f302089a, dVar.f302089a) && Intrinsics.f(this.f302090b, dVar.f302090b);
    }

    public final int hashCode() {
        int iHashCode = this.f302089a.hashCode() * 31;
        String str = this.f302090b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
