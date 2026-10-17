package svi;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265892b;

    public d(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f265891a = name;
        this.f265892b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f265891a, dVar.f265891a) && Intrinsics.f(this.f265892b, dVar.f265892b);
    }

    public final int hashCode() {
        int iHashCode = this.f265891a.hashCode() * 31;
        String str = this.f265892b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
