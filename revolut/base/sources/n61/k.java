package n61;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f212690b;

    public k(String name, ArrayList beneficiaries) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        this.f212689a = name;
        this.f212690b = beneficiaries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f212689a, kVar.f212689a) && this.f212690b.equals(kVar.f212690b);
    }

    public final int hashCode() {
        return this.f212690b.hashCode() + (this.f212689a.hashCode() * 31);
    }
}
