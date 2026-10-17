package bfh;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements oki.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14983c;
    public final Data d;
    public final Data e;
    public final n2h.f f;

    public c(List pagerItems, String str, String securityRef, Data instrument, Data isInstrumentInWatchlist, n2h.f actionsPanelState) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(isInstrumentInWatchlist, "isInstrumentInWatchlist");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        this.f14981a = pagerItems;
        this.f14982b = str;
        this.f14983c = securityRef;
        this.d = instrument;
        this.e = isInstrumentInWatchlist;
        this.f = actionsPanelState;
    }

    public static c a(c cVar, String str, Data data, Data data2, n2h.f fVar, int i) {
        List pagerItems = cVar.f14981a;
        if ((i & 2) != 0) {
            str = cVar.f14982b;
        }
        String str2 = str;
        String securityRef = cVar.f14983c;
        if ((i & 8) != 0) {
            data = cVar.d;
        }
        Data instrument = data;
        if ((i & 16) != 0) {
            data2 = cVar.e;
        }
        Data isInstrumentInWatchlist = data2;
        if ((i & 32) != 0) {
            fVar = cVar.f;
        }
        n2h.f actionsPanelState = fVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(isInstrumentInWatchlist, "isInstrumentInWatchlist");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        return new c(pagerItems, str2, securityRef, instrument, isInstrumentInWatchlist, actionsPanelState);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF85711b() {
        return this.f14981a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f14981a, cVar.f14981a) && Intrinsics.f(this.f14982b, cVar.f14982b) && Intrinsics.f(this.f14983c, cVar.f14983c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f14981a.hashCode() * 31;
        String str = this.f14982b;
        return this.f.f211545a.hashCode() + kii.e.c(this.e, kii.e.c(this.d, p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f14983c), 31), 31);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z */
    public final String getF85710a() {
        return this.f14982b;
    }
}
