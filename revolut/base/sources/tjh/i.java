package tjh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final del.f f271742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f271743b;

    public i(del.f sortBy, Data content) {
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f271742a = sortBy;
        this.f271743b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f271742a, iVar.f271742a) && Intrinsics.f(this.f271743b, iVar.f271743b);
    }

    public final int hashCode() {
        return this.f271743b.hashCode() + (this.f271742a.hashCode() * 31);
    }
}
