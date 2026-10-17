package yta;

import ak7.g;
import aua.f;
import efm.d0;
import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import yi3.d;
import ypg.l;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f316687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f316688b;

    public b(f ratingRepository, Clock clock) {
        Intrinsics.checkNotNullParameter(ratingRepository, "ratingRepository");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f316687a = ratingRepository;
        this.f316688b = clock;
    }

    public final pfm.f a() {
        f fVar = this.f316687a;
        pfm.f fVarI = efm.b.i(v.k(fVar.d(-9), fVar.c(LocalDate.now(this.f316688b).plusMonths(1L).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli())));
        Intrinsics.checkNotNullExpressionValue(fVarI, "concat(...)");
        return fVarI;
    }

    public final pfm.f b() {
        f fVar = this.f316687a;
        pfm.f fVarI = efm.b.i(v.k(fVar.d(-3), fVar.c(LocalDate.now(this.f316688b).plusMonths(12L).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli())));
        Intrinsics.checkNotNullExpressionValue(fVarI, "concat(...)");
        return fVarI;
    }

    public final pfm.a c() {
        f fVar = this.f316687a;
        ufm.c cVar = new ufm.c(new aua.b(fVar, 3), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        ufm.f fVar2 = new ufm.f(w.i0(cVar), new aua.a(new g("Failed to get POSTPONE_RATE_COUNTER", 17), 7), 1);
        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnError(...)");
        pfm.a aVar = new pfm.a(d0.D(fVar2, fVar.a(), new l(new d(this, 19), 27)), new l(new ysk.a(3), 28), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
