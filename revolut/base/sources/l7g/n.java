package l7g;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f192627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f192628c;

    public n(ArrayList includedBaggage, ArrayList extraBenefits, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(includedBaggage, "includedBaggage");
        Intrinsics.checkNotNullParameter(extraBenefits, "extraBenefits");
        this.f192626a = name;
        this.f192627b = includedBaggage;
        this.f192628c = extraBenefits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f192626a, nVar.f192626a) && this.f192627b.equals(nVar.f192627b) && this.f192628c.equals(nVar.f192628c);
    }

    public final int hashCode() {
        return this.f192628c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f192627b, this.f192626a.hashCode() * 31, 31);
    }
}
