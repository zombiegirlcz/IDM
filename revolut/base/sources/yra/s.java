package yra;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f316192b;

    public /* synthetic */ s(x xVar, int i) {
        this.f316191a = i;
        this.f316192b = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f316191a) {
            case 0:
                l1j.e output = (l1j.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                x xVar = this.f316192b;
                xVar.x2(new s(xVar, 2));
                if (output instanceof l1j.f) {
                    l1j.f fVar = (l1j.f) output;
                    String str = fVar.e;
                    xVar.l2(new xkl.e((yji.l) xVar, fVar.f191554c, fVar.f191552a, str, fVar.d, (Continuation) null, 7), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                j updateState = (j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return j.a(updateState, null, null, ((j) this.f316192b.t2()).d + 1, null, 23);
            default:
                j updateState2 = (j) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return j.a(updateState2, null, null, ((j) this.f316192b.t2()).d + 1, null, 23);
        }
    }
}
