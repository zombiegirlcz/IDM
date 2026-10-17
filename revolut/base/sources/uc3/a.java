package uc3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f278974b;

    public a(String id10, io3.d pocket) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f278973a = id10;
        this.f278974b = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f278973a, aVar.f278973a) && Intrinsics.f(this.f278974b, aVar.f278974b);
    }

    public final int hashCode() {
        return this.f278974b.hashCode() + (this.f278973a.hashCode() * 31);
    }
}
