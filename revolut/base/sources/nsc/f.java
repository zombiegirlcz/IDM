package nsc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f218778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vrc.k f218779b;

    public f(Data trustedEntities, vrc.k purpose) {
        Intrinsics.checkNotNullParameter(trustedEntities, "trustedEntities");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        this.f218778a = trustedEntities;
        this.f218779b = purpose;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f218778a, fVar.f218778a) && this.f218779b == fVar.f218779b;
    }

    public final int hashCode() {
        return this.f218779b.hashCode() + (this.f218778a.hashCode() * 31);
    }
}
