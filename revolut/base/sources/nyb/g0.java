package nyb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f220791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1c.o0 f220792c;

    public /* synthetic */ g0(i0 i0Var, m1c.o0 o0Var, int i) {
        this.f220790a = i;
        this.f220791b = i0Var;
        this.f220792c = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        hha.d plan = (hha.d) obj2;
        switch (this.f220790a) {
            case 0:
                Intrinsics.checkNotNullParameter(plan, "plan");
                lxb.f fVar = this.f220791b.f220799b;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(plan, "plan");
                efm.r rVarE = fVar.e.e(new lxb.e(plan, this.f220792c), w4l.i.f294643c);
                lxb.b onNext = new lxb.b(fVar, 2);
                Intrinsics.checkNotNullParameter(rVarE, "<this>");
                Intrinsics.checkNotNullParameter(onNext, "onNext");
                efm.r rVarDoOnNext = rVarE.doOnNext(new v4a.i(7, new v25.k(onNext, 10)));
                Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
                return rVarDoOnNext;
            default:
                Intrinsics.checkNotNullParameter(plan, "plan");
                lxb.f fVar2 = this.f220791b.f220799b;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(plan, "plan");
                return fVar2.e.g(new lxb.e(plan, this.f220792c), false);
        }
    }
}
