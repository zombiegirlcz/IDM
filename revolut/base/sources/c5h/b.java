package c5h;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f21552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f21553c;

    public b(String key, c eligibility, d dVar) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        this.f21551a = key;
        this.f21552b = eligibility;
        this.f21553c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f21551a, bVar.f21551a) && this.f21552b == bVar.f21552b && Intrinsics.f(this.f21553c, bVar.f21553c);
    }

    public final int hashCode() {
        int iHashCode = (this.f21552b.hashCode() + (this.f21551a.hashCode() * 31)) * 31;
        d dVar = this.f21553c;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
