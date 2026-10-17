package w89;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f295621c;

    public c(String title, String link, e eVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f295619a = title;
        this.f295620b = link;
        this.f295621c = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f295619a, cVar.f295619a) && Intrinsics.f(this.f295620b, cVar.f295620b) && this.f295621c == cVar.f295621c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f295619a.hashCode() * 31, 31, this.f295620b);
        e eVar = this.f295621c;
        return iC + (eVar == null ? 0 : eVar.hashCode());
    }
}
