package ba6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f13955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f13956c;
    public final p d;
    public final ArrayList e;

    public r(String id10, q type, n cardDesign, p status, ArrayList minDonationsToUnlock) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(minDonationsToUnlock, "minDonationsToUnlock");
        this.f13954a = id10;
        this.f13955b = type;
        this.f13956c = cardDesign;
        this.d = status;
        this.e = minDonationsToUnlock;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f13954a, rVar.f13954a) && this.f13955b == rVar.f13955b && this.f13956c.equals(rVar.f13956c) && this.d == rVar.d && this.e.equals(rVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f13956c.hashCode() + ((this.f13955b.hashCode() + (this.f13954a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
