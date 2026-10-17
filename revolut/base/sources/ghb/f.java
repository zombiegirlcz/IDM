package ghb;

import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f143896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f143897c;
    public final FincrimeHomeScreen$V2 d;

    public f(String id10, d status, b method, FincrimeHomeScreen$V2 tracker) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f143895a = id10;
        this.f143896b = status;
        this.f143897c = method;
        this.d = tracker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f143895a, fVar.f143895a) && this.f143896b == fVar.f143896b && this.f143897c == fVar.f143897c && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f143897c.hashCode() + ((this.f143896b.hashCode() + (this.f143895a.hashCode() * 31)) * 31)) * 31);
    }
}
