package ga1;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0013"}, d2 = {"Lga1/j;", "", "", "toString", "()Ljava/lang/String;", "", "Lga1/i;", "a", "Ljava/util/List;", "getRevolutEvents", "()Ljava/util/List;", "revolutEvents", "b", "getYouTransactorEvents", "youTransactorEvents", "c", "Ljava/lang/String;", "getTerminalId", "terminalId", "feature_acquiring_card_reader_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("app")
    @NotNull
    private final List<i> revolutEvents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminal")
    @NotNull
    private final List<i> youTransactorEvents;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminal_id")
    private final String terminalId;

    public j(ArrayList revolutEvents, ArrayList youTransactorEvents, String str) {
        Intrinsics.checkNotNullParameter(revolutEvents, "revolutEvents");
        Intrinsics.checkNotNullParameter(youTransactorEvents, "youTransactorEvents");
        this.revolutEvents = revolutEvents;
        this.youTransactorEvents = youTransactorEvents;
        this.terminalId = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.revolutEvents, jVar.revolutEvents) && Intrinsics.f(this.youTransactorEvents, jVar.youTransactorEvents) && Intrinsics.f(this.terminalId, jVar.terminalId);
    }

    public final int hashCode() {
        int iD = p.a.d(this.revolutEvents.hashCode() * 31, 31, this.youTransactorEvents);
        String str = this.terminalId;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
