package ly3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200661b;

    public c(String id10, String title) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f200660a = id10;
        this.f200661b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f200660a, cVar.f200660a) && Intrinsics.f(this.f200661b, cVar.f200661b);
    }

    public final int hashCode() {
        return this.f200661b.hashCode() + (this.f200660a.hashCode() * 31);
    }
}
