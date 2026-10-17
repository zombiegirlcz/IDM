package l5d;

import a0e.n;
import com.revolut.chat.ChatApi$Toggles;
import kkf.z7;
import knd.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;
import vkm.q;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends e5d.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e5d.e f192247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f4h.a f192248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f192249n;
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f192250p;

    public j(e5d.e stateProvider, f4h.a airTipInteractor, gte.a featureToggleInteractor, k mapper) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(airTipInteractor, "airTipInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f192247l = stateProvider;
        this.f192248m = airTipInteractor;
        this.f192249n = featureToggleInteractor;
        this.o = mapper;
        this.f192250p = q.c(0);
    }

    @Override // e5d.a
    public final Flow Z2() {
        if (!((jte.d) this.f192249n).c(ChatApi$Toggles.MoneyAssistant.f50984c)) {
            return new go.g(f0.f322471a, 2);
        }
        return new z7(nim.a.u(new h0(this, (Continuation) null, 22), new t38.e(q.q(this.f192247l.c()), 24, this.f192250p, new n(3, 9, (Continuation) null))), this.o, 19);
    }

    @Override // e5d.a
    public final void b3(e5d.b parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        T2(new i(this, parcel, null, 0), new yi5.b(27));
    }

    @Override // e5d.a
    public final void c3(e5d.b parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        T2(new h0(this, parcel, (Continuation) null, 23), new yi5.b(27));
    }

    @Override // e5d.a
    public final void d3(e5d.b parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        T2(new i(this, parcel, null, 2), new yi5.b(27));
    }
}
