package qua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249313b;

    public o(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f249312a = id10;
        this.f249313b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f249312a, oVar.f249312a) && Intrinsics.f(this.f249313b, oVar.f249313b);
    }

    public final int hashCode() {
        return this.f249313b.hashCode() + (this.f249312a.hashCode() * 31);
    }
}
