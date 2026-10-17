package i61;

import com.revolut.domain.models.topup.AutoTopUpState;
import e31.d;
import efm.r;
import i25.e;
import i4h.q;
import i52.j;
import io3.l;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;
import yoj.c;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w71.a f158852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f158853b;

    public b(w71.a autoTopUpRepository, xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(autoTopUpRepository, "autoTopUpRepository");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f158852a = autoTopUpRepository;
        this.f158853b = featuresInteractor;
    }

    public final r b(xi0.b initCCY, l pocketType, boolean z) {
        Intrinsics.checkNotNullParameter(initCCY, "initCCY");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        d dVar = (d) this.f158852a;
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        return nim.a.w(dVar.e.f(pocketType, z), new e(pocketType, initCCY, 3));
    }

    public final pfm.a c(AutoTopUpState autoTopUpState) {
        Intrinsics.checkNotNullParameter(autoTopUpState, "autoTopUpState");
        int i = 4;
        pfm.a aVar = new pfm.a(new i(((cpj.b) this.f158853b).e(c.AUTO_TOPUP_ON_THE_FLY_REDESIGN, yoj.d.DISABLED), new j(3, new q(20)), 1), new j(i, new e(this, autoTopUpState, i)), i);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
