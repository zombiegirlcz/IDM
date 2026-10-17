package doc;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f116505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f116506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final koc.g f116507c;
    public final pdh.c d;
    public final eoc.e e;

    public j(d dVar, Map chartMap, koc.g gVar, pdh.c selectedTimeSpan, eoc.e settingsState) {
        Intrinsics.checkNotNullParameter(chartMap, "chartMap");
        Intrinsics.checkNotNullParameter(selectedTimeSpan, "selectedTimeSpan");
        Intrinsics.checkNotNullParameter(settingsState, "settingsState");
        this.f116505a = dVar;
        this.f116506b = chartMap;
        this.f116507c = gVar;
        this.d = selectedTimeSpan;
        this.e = settingsState;
    }

    public static j a(j jVar, d dVar, Map map, koc.g gVar, pdh.c cVar, eoc.e eVar, int i) {
        if ((i & 1) != 0) {
            dVar = jVar.f116505a;
        }
        d dVar2 = dVar;
        if ((i & 2) != 0) {
            map = jVar.f116506b;
        }
        Map chartMap = map;
        if ((i & 4) != 0) {
            gVar = jVar.f116507c;
        }
        koc.g gVar2 = gVar;
        if ((i & 8) != 0) {
            cVar = jVar.d;
        }
        pdh.c selectedTimeSpan = cVar;
        if ((i & 16) != 0) {
            eVar = jVar.e;
        }
        eoc.e settingsState = eVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(chartMap, "chartMap");
        Intrinsics.checkNotNullParameter(selectedTimeSpan, "selectedTimeSpan");
        Intrinsics.checkNotNullParameter(settingsState, "settingsState");
        return new j(dVar2, chartMap, gVar2, selectedTimeSpan, settingsState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f116505a, jVar.f116505a) && Intrinsics.f(this.f116506b, jVar.f116506b) && Intrinsics.f(this.f116507c, jVar.f116507c) && this.d == jVar.d && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        d dVar = this.f116505a;
        int iE = p.a.e((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.f116506b);
        koc.g gVar = this.f116507c;
        return Boolean.hashCode(this.e.f127899a) + ((this.d.hashCode() + ((iE + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31);
    }
}
