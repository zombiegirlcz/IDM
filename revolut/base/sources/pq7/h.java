package pq7;

import com.revolut.data.model.Data;
import kl7.j0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f238690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f238691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f238692c;

    public h(Data drivingStatistics, Data history, j0 historyWindow) {
        Intrinsics.checkNotNullParameter(drivingStatistics, "drivingStatistics");
        Intrinsics.checkNotNullParameter(history, "history");
        Intrinsics.checkNotNullParameter(historyWindow, "historyWindow");
        this.f238690a = drivingStatistics;
        this.f238691b = history;
        this.f238692c = historyWindow;
    }

    public static h a(h hVar, Data drivingStatistics, Data history, j0 historyWindow, int i) {
        if ((i & 1) != 0) {
            drivingStatistics = hVar.f238690a;
        }
        if ((i & 2) != 0) {
            history = hVar.f238691b;
        }
        if ((i & 4) != 0) {
            historyWindow = hVar.f238692c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(drivingStatistics, "drivingStatistics");
        Intrinsics.checkNotNullParameter(history, "history");
        Intrinsics.checkNotNullParameter(historyWindow, "historyWindow");
        return new h(drivingStatistics, history, historyWindow);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f238690a, hVar.f238690a) && Intrinsics.f(this.f238691b, hVar.f238691b) && this.f238692c == hVar.f238692c;
    }

    public final int hashCode() {
        return this.f238692c.hashCode() + kii.e.c(this.f238691b, this.f238690a.hashCode() * 31, 31);
    }
}
