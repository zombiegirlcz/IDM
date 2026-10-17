package i69;

import com.revolut.feature.masav.impl.model.DirectDebitData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DirectDebitData f158893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f158894b;

    public f(DirectDebitData directDebitData, io3.d pocket) {
        Intrinsics.checkNotNullParameter(directDebitData, "directDebitData");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f158893a = directDebitData;
        this.f158894b = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f158893a, fVar.f158893a) && Intrinsics.f(this.f158894b, fVar.f158894b);
    }

    public final int hashCode() {
        return this.f158894b.hashCode() + (this.f158893a.hashCode() * 31);
    }
}
