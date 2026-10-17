package do3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f116430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f116431b;

    public r(ArrayList registeredIdentities, boolean z) {
        Intrinsics.checkNotNullParameter(registeredIdentities, "registeredIdentities");
        this.f116430a = z;
        this.f116431b = registeredIdentities;
    }

    public final boolean a() {
        return this.f116430a;
    }

    public final List b() {
        return this.f116431b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f116430a == rVar.f116430a && this.f116431b.equals(rVar.f116431b);
    }

    public final int hashCode() {
        return this.f116431b.hashCode() + (Boolean.hashCode(this.f116430a) * 31);
    }
}
