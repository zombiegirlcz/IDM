package otk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements oki.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f229726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f229727c;
    public final Data d;
    public final Data e;
    public final n2h.f f;

    public f(String str, List pagerItems, Data instrument, Data instrumentTicker, Data isInstrumentInWatchlist, n2h.f actionsPanelState) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(isInstrumentInWatchlist, "isInstrumentInWatchlist");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        this.f229725a = str;
        this.f229726b = pagerItems;
        this.f229727c = instrument;
        this.d = instrumentTicker;
        this.e = isInstrumentInWatchlist;
        this.f = actionsPanelState;
    }

    public static f a(f fVar, String str, Data data, Data data2, Data data3, n2h.f fVar2, int i) {
        if ((i & 1) != 0) {
            str = fVar.f229725a;
        }
        String str2 = str;
        List pagerItems = fVar.f229726b;
        if ((i & 4) != 0) {
            data = fVar.f229727c;
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
        if ((i & 32) != 0) {
            fVar2 = fVar.f;
        }
        n2h.f actionsPanelState = fVar2;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(isInstrumentInWatchlist, "isInstrumentInWatchlist");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        return new f(str2, pagerItems, instrument, instrumentTicker, isInstrumentInWatchlist, actionsPanelState);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF85711b() {
        return this.f229726b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f229725a, fVar.f229725a) && Intrinsics.f(this.f229726b, fVar.f229726b) && Intrinsics.f(this.f229727c, fVar.f229727c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        String str = this.f229725a;
        return this.f.f211545a.hashCode() + kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f229727c, p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f229726b), 31), 31), 31);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z */
    public final String getF85710a() {
        return this.f229725a;
    }
}
