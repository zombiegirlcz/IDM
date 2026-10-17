package puk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements oki.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f239929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f239930c;
    public final Data d;
    public final Data e;
    public final n2h.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f239931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f239932h;
    public final Data i;

    public f(String str, List pagerItems, Data instrument, Data instrumentTicker, Data isInstrumentInWatchlist, n2h.f actionsPanelState, boolean z, boolean z3, Data data) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(isInstrumentInWatchlist, "isInstrumentInWatchlist");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        this.f239928a = str;
        this.f239929b = pagerItems;
        this.f239930c = instrument;
        this.d = instrumentTicker;
        this.e = isInstrumentInWatchlist;
        this.f = actionsPanelState;
        this.f239931g = z;
        this.f239932h = z3;
        this.i = data;
    }

    public static f a(f fVar, String str, List list, Data data, Data data2, Data data3, n2h.f fVar2, boolean z, boolean z3, Data data4, int i) {
        if ((i & 1) != 0) {
            str = fVar.f239928a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            list = fVar.f239929b;
        }
        List pagerItems = list;
        if ((i & 4) != 0) {
            data = fVar.f239930c;
        }
        Data instrument = data;
        if ((i & 8) != 0) {
            data2 = fVar.d;
        }
        Data instrumentTicker = data2;
        if ((i & 16) != 0) {
            data3 = fVar.e;
        }
        Data isInstrumentInWatchlist = data3;
        n2h.f actionsPanelState = (i & 32) != 0 ? fVar.f : fVar2;
        boolean z4 = (i & 64) != 0 ? fVar.f239931g : z;
        boolean z6 = (i & 128) != 0 ? fVar.f239932h : z3;
        Data data5 = (i & 256) != 0 ? fVar.i : data4;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(isInstrumentInWatchlist, "isInstrumentInWatchlist");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        return new f(str2, pagerItems, instrument, instrumentTicker, isInstrumentInWatchlist, actionsPanelState, z4, z6, data5);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF85711b() {
        return this.f239929b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f239928a, fVar.f239928a) && Intrinsics.f(this.f239929b, fVar.f239929b) && Intrinsics.f(this.f239930c, fVar.f239930c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && this.f239931g == fVar.f239931g && this.f239932h == fVar.f239932h && Intrinsics.f(this.i, fVar.i);
    }

    public final int hashCode() {
        String str = this.f239928a;
        int iC = j6.a.c(j6.a.c(kii.e.c(this.f.f211545a, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f239930c, p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f239929b), 31), 31), 31), 31), 31, this.f239931g), 31, this.f239932h);
        Data data = this.i;
        return iC + (data != null ? data.hashCode() : 0);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z */
    public final String getF85710a() {
        return this.f239928a;
    }
}
