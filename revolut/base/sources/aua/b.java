package aua;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.o0;
import wim.z;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9681b;

    public /* synthetic */ b(f fVar, int i) {
        this.f9680a = i;
        this.f9681b = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9680a) {
            case 0:
                return (Long) this.f9681b.f9688a.v0(0L, "APP_RATING_SHOWN_DATE", z.d(o0.b(Long.TYPE)));
            case 1:
                return (Integer) this.f9681b.f9688a.v0(0, "SUCCESS_SCREEN_COUNTER", z.d(o0.b(Integer.TYPE)));
            case 2:
                return (Long) this.f9681b.f9688a.v0(0L, "NEXT_POSSIBLE_RATE_ACTION_DATE", z.d(o0.b(Long.TYPE)));
            default:
                return (Integer) this.f9681b.f9688a.v0(0, "POSTPONE_RATE_COUNTER", z.d(o0.b(Integer.TYPE)));
        }
    }
}
