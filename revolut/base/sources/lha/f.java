package lha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195202a;

    public f(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f195202a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f195202a, ((f) obj2).f195202a);
    }

    public final int hashCode() {
        return this.f195202a.hashCode();
    }
}
