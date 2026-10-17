package qua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f249336b;

    public s(String id10, r type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f249335a = id10;
        this.f249336b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f249335a, sVar.f249335a) && this.f249336b == sVar.f249336b;
    }

    public final int hashCode() {
        return this.f249336b.hashCode() + (this.f249335a.hashCode() * 31);
    }
}
