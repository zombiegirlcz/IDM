package ur;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f282219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception f282220b;

    public b(ArrayList uploadedKeys, Exception error) {
        Intrinsics.checkNotNullParameter(uploadedKeys, "uploadedKeys");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f282219a = uploadedKeys;
        this.f282220b = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f282219a.equals(bVar.f282219a) && this.f282220b.equals(bVar.f282220b);
    }

    public final int hashCode() {
        return this.f282220b.hashCode() + (this.f282219a.hashCode() * 31);
    }
}
