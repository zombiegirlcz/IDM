package dx4;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u3 implements v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f120790b;

    public u3(String pocketId, Map pocketsById) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(pocketsById, "pocketsById");
        this.f120789a = pocketId;
        this.f120790b = pocketsById;
    }

    @Override // dx4.v3
    public final io3.d a() {
        return (io3.d) this.f120790b.get(this.f120789a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj2;
        return Intrinsics.f(this.f120789a, u3Var.f120789a) && Intrinsics.f(this.f120790b, u3Var.f120790b);
    }

    public final int hashCode() {
        return this.f120790b.hashCode() + (this.f120789a.hashCode() * 31);
    }
}
