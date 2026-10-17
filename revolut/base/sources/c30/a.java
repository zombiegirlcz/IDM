package c30;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lc30/a;", "", "", "toString", "()Ljava/lang/String;", "", "Lc20/a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "dates", "Ljava/time/LocalDate;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "fetchedOn", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("dates")
    @NotNull
    private final List<c20.a> dates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fetchedOn")
    @NotNull
    private final LocalDate fetchedOn;

    public a(LocalDate fetchedOn, ArrayList dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        Intrinsics.checkNotNullParameter(fetchedOn, "fetchedOn");
        this.dates = dates;
        this.fetchedOn = fetchedOn;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDates() {
        return this.dates;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getFetchedOn() {
        return this.fetchedOn;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.dates, aVar.dates) && Intrinsics.f(this.fetchedOn, aVar.fetchedOn);
    }

    public final int hashCode() {
        return this.fetchedOn.hashCode() + (this.dates.hashCode() * 31);
    }
}
