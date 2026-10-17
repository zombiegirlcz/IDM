package qua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249298b;

    public h(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f249297a = id10;
        this.f249298b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f249297a, hVar.f249297a) && Intrinsics.f(this.f249298b, hVar.f249298b);
    }

    public final int hashCode() {
        return this.f249298b.hashCode() + (this.f249297a.hashCode() * 31);
    }
}
