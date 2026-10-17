package b8d;

import a08.p0;
import com.revolut.data.model.Data;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f13157b;

    public /* synthetic */ d0(int i, Data data, boolean z) {
        this.f13156a = i;
        this.f13157b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f13156a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return this.f13157b;
            case 1:
                d6j.o update = (d6j.o) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return d6j.o.f(update, null, false, null, null, null, null, null, this.f13157b, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, 33553919);
            case 2:
                d6j.o update2 = (d6j.o) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return d6j.o.f(update2, null, false, null, null, null, null, this.f13157b, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, 33554175);
            case 3:
                d6j.o update3 = (d6j.o) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return d6j.o.f(update3, null, false, null, null, null, null, null, null, 0, this.f13157b, null, null, null, null, null, null, null, null, null, null, false, null, 33552383);
            case 4:
                efm.r shared = (efm.r) obj2;
                Intrinsics.checkNotNullParameter(shared, "shared");
                efm.p pVarB = efm.p.b(this.f13157b);
                Intrinsics.checkNotNullExpressionValue(pVarB, "createOnNext(...)");
                return efm.r.merge(shared, efm.r.timer(300L, TimeUnit.MILLISECONDS).map(new p0(26, new m2j.f(pVarB, 0))).takeUntil(shared)).filter(new a0d.g(27, new m2j.g(pVarB, new Ref$BooleanRef(), 0))).doOnNext(new lhi.b(3, new fjm.j(2)));
            case 5:
                efm.r shared2 = (efm.r) obj2;
                Intrinsics.checkNotNullParameter(shared2, "shared");
                efm.p pVarB2 = efm.p.b(this.f13157b);
                Intrinsics.checkNotNullExpressionValue(pVarB2, "createOnNext(...)");
                return efm.r.merge(shared2, efm.r.timer(300L, TimeUnit.MILLISECONDS).map(new p0(26, new m2j.f(pVarB2, 1))).takeUntil(shared2)).filter(new a0d.g(27, new m2j.g(pVarB2, new Ref$BooleanRef(), 1))).doOnNext(new lhi.b(3, new fjm.j(pVarB2, 3)));
            case 6:
                pvb.b update4 = (pvb.b) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Data data = this.f13157b;
                Intrinsics.h(data);
                return pvb.b.a(update4, null, data, 1);
            case 7:
                h3h.d update5 = (h3h.d) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                update5.getClass();
                return new h3h.d(this.f13157b);
            case 8:
                efm.r published = (efm.r) obj2;
                Intrinsics.checkNotNullParameter(published, "published");
                return published.ambWith(efm.r.fromCallable(new s7k.c(this.f13157b, 0)).delaySubscription(5L, TimeUnit.SECONDS).concatWith(published));
            case 9:
                efm.r published2 = (efm.r) obj2;
                Intrinsics.checkNotNullParameter(published2, "published");
                return published2.ambWith(efm.r.fromCallable(new s7k.c(this.f13157b, 1)).delaySubscription(5L, TimeUnit.SECONDS).concatWith(published2));
            case 10:
                xmc.j updateState = (xmc.j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return xmc.j.a(updateState, this.f13157b, null, null, 6);
            default:
                xmc.j updateState2 = (xmc.j) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return xmc.j.a(updateState2, null, this.f13157b, null, 5);
        }
    }

    public d0(Data data, int i) {
        this.f13156a = i;
        switch (i) {
            case 5:
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.f13157b = data;
                break;
            case 6:
            case 7:
            default:
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                this.f13157b = data;
                break;
            case 8:
                TimeUnit timeUnit3 = TimeUnit.SECONDS;
                this.f13157b = data;
                break;
            case 9:
                TimeUnit timeUnit4 = TimeUnit.SECONDS;
                this.f13157b = data;
                break;
        }
    }
}
