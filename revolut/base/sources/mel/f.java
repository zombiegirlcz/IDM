package mel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f204744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f204745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f204746c;

    public f(e ratingsDistribution, c priceTarget, o description) {
        Intrinsics.checkNotNullParameter(ratingsDistribution, "ratingsDistribution");
        Intrinsics.checkNotNullParameter(priceTarget, "priceTarget");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f204744a = ratingsDistribution;
        this.f204745b = priceTarget;
        this.f204746c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f204744a, fVar.f204744a) && Intrinsics.f(this.f204745b, fVar.f204745b) && Intrinsics.f(this.f204746c, fVar.f204746c);
    }

    public final int hashCode() {
        return this.f204746c.hashCode() + ((this.f204745b.hashCode() + (this.f204744a.hashCode() * 31)) * 31);
    }
}
