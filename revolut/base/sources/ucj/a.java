package ucj;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0013"}, d2 = {"Lucj/a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "d", "()Ljo3/a;", "high", "b", "average", "c", "e", "low", "Ljava/lang/String;", "date", "commentary", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("high")
    private final jo3.a high;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("average")
    @NotNull
    private final jo3.a average;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("low")
    private final jo3.a low;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("date")
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("commentary")
    private final String commentary;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAverage() {
        return this.average;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCommentary() {
        return this.commentary;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getHigh() {
        return this.high;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getLow() {
        return this.low;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.high, aVar.high) && Intrinsics.f(this.average, aVar.average) && Intrinsics.f(this.low, aVar.low) && Intrinsics.f(this.date, aVar.date) && Intrinsics.f(this.commentary, aVar.commentary);
    }

    public final int hashCode() {
        jo3.a aVar = this.high;
        int iJ = v7.j(this.average, (aVar == null ? 0 : aVar.hashCode()) * 31, 31);
        jo3.a aVar2 = this.low;
        int iC = p.a.c((iJ + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.date);
        String str = this.commentary;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
