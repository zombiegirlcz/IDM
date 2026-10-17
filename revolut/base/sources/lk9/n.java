package lk9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f196316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ai9.c f196317b;

    public n(Data content, ai9.c cVar) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f196316a = content;
        this.f196317b = cVar;
    }

    public static n a(n nVar, Data content, ai9.c cVar, int i) {
        if ((i & 1) != 0) {
            content = nVar.f196316a;
        }
        if ((i & 2) != 0) {
            cVar = nVar.f196317b;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return new n(content, cVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f196316a, nVar.f196316a) && Intrinsics.f(this.f196317b, nVar.f196317b);
    }

    public final int hashCode() {
        int iHashCode = this.f196316a.hashCode() * 31;
        ai9.c cVar = this.f196317b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
