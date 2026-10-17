package qdb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0016"}, d2 = {"Lqdb/j;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "getGuestsTotal", "()I", "guestsTotal", "b", "Ljava/lang/String;", "getDate", "date", "c", "getTime", "time", "d", "getAreaId", "areaId", "Companion", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("guestsTotal")
    private final int guestsTotal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("date")
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("time")
    @NotNull
    private final String time;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("areaId")
    private final String areaId;

    public j(int i, String date, String time, String str) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        this.guestsTotal = i;
        this.date = date;
        this.time = time;
        this.areaId = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.guestsTotal == jVar.guestsTotal && Intrinsics.f(this.date, jVar.date) && Intrinsics.f(this.time, jVar.time) && Intrinsics.f(this.areaId, jVar.areaId);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(Integer.hashCode(this.guestsTotal) * 31, 31, this.date), 31, this.time);
        String str = this.areaId;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
