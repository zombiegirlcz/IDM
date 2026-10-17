package w07;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f293653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f293654b;

    public f(j mode, Data termsData) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(termsData, "termsData");
        this.f293653a = mode;
        this.f293654b = termsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f293653a == fVar.f293653a && Intrinsics.f(this.f293654b, fVar.f293654b);
    }

    public final int hashCode() {
        return this.f293654b.hashCode() + (this.f293653a.hashCode() * 31);
    }
}
