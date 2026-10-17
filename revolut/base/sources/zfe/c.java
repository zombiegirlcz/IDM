package zfe;

import java.util.List;
import koi.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f321944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f321945b;

    public c(List content, j jVar) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f321944a = content;
        this.f321945b = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f321944a, cVar.f321944a) && Intrinsics.f(this.f321945b, cVar.f321945b);
    }

    public final int hashCode() {
        int iHashCode = this.f321944a.hashCode() * 31;
        j jVar = this.f321945b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }
}
