package g4d;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Lg4d/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getIdempotencyKey", "idempotencyKey", "b", "getBase", "base", "c", "getCounter", "counter", "d", "getTargetRate", "targetRate", "e", "getPlacementRate", "placementRate", "f", "getNote", "note", "g", "getFrequency", "frequency", "feature_separate_favourites_item_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("idempotencyKey")
    @NotNull
    private final String idempotencyKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("base")
    @NotNull
    private final String base;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("counter")
    @NotNull
    private final String counter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("targetRate")
    @NotNull
    private final String targetRate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("placementRate")
    @NotNull
    private final String placementRate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("note")
    private final String note;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("frequency")
    private final String frequency;

    public c(String idempotencyKey, String base, String counter, String targetRate, String placementRate, String str, String str2) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(counter, "counter");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        Intrinsics.checkNotNullParameter(placementRate, "placementRate");
        this.idempotencyKey = idempotencyKey;
        this.base = base;
        this.counter = counter;
        this.targetRate = targetRate;
        this.placementRate = placementRate;
        this.note = str;
        this.frequency = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.idempotencyKey, cVar.idempotencyKey) && Intrinsics.f(this.base, cVar.base) && Intrinsics.f(this.counter, cVar.counter) && Intrinsics.f(this.targetRate, cVar.targetRate) && Intrinsics.f(this.placementRate, cVar.placementRate) && Intrinsics.f(this.note, cVar.note) && Intrinsics.f(this.frequency, cVar.frequency);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.idempotencyKey.hashCode() * 31, 31, this.base), 31, this.counter), 31, this.targetRate), 31, this.placementRate);
        String str = this.note;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.frequency;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
