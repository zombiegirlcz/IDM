package ti7;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl7.a f271431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f271432b;

    public e(dl7.a insuranceSubtype, ArrayList limits) {
        Intrinsics.checkNotNullParameter(insuranceSubtype, "insuranceSubtype");
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f271431a = insuranceSubtype;
        this.f271432b = limits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f271431a == eVar.f271431a && this.f271432b.equals(eVar.f271432b);
    }

    public final int hashCode() {
        return this.f271432b.hashCode() + (this.f271431a.hashCode() * 31);
    }
}
