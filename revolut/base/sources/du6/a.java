package du6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Ldu6/a;", "", "", "toString", "()Ljava/lang/String;", "Ldu6/d;", "a", "Ldu6/d;", "()Ldu6/d;", "collected", "Ldu6/k;", "b", "Ldu6/k;", "()Ldu6/k;", "nextPayout", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("collected")
    @NotNull
    private final d collected;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextPayout")
    @NotNull
    private final k nextPayout;

    public a(d collected, k nextPayout) {
        Intrinsics.checkNotNullParameter(collected, "collected");
        Intrinsics.checkNotNullParameter(nextPayout, "nextPayout");
        this.collected = collected;
        this.nextPayout = nextPayout;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getCollected() {
        return this.collected;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k getNextPayout() {
        return this.nextPayout;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.collected, aVar.collected) && Intrinsics.f(this.nextPayout, aVar.nextPayout);
    }

    public final int hashCode() {
        return this.nextPayout.hashCode() + (this.collected.hashCode() * 31);
    }
}
