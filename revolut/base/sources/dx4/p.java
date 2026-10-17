package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f120708c;

    public p(String name, String text, l action) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f120706a = name;
        this.f120707b = text;
        this.f120708c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f120706a, pVar.f120706a) && Intrinsics.f(this.f120707b, pVar.f120707b) && Intrinsics.f(this.f120708c, pVar.f120708c);
    }

    public final int hashCode() {
        return this.f120708c.hashCode() + p.a.c(this.f120706a.hashCode() * 31, 31, this.f120707b);
    }
}
