package ugl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iel.a f280040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f280041b;

    public a(iel.a assetEvent, ArrayList instruments) {
        Intrinsics.checkNotNullParameter(assetEvent, "assetEvent");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        this.f280040a = assetEvent;
        this.f280041b = instruments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f280040a.equals(aVar.f280040a) && this.f280041b.equals(aVar.f280041b);
    }

    public final int hashCode() {
        return this.f280041b.hashCode() + (this.f280040a.hashCode() * 31);
    }
}
