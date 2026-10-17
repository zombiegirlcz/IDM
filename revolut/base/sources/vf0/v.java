package vf0;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import qfm.b3;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f288474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f288475c;

    public /* synthetic */ v(int i, long j2, Function2 function2) {
        this.f288473a = i;
        this.f288474b = function2;
        this.f288475c = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f288473a) {
            case 0:
                efm.i handler = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(handler, "handler");
                IntRange intRange = new IntRange(0, Integer.MAX_VALUE, 1);
                n nVar = new n(new vea.b(7), 19);
                handler.getClass();
                b3 b3Var = new b3(handler, intRange, nVar);
                n nVar2 = new n(new v(1, this.f288475c, this.f288474b), 15);
                int i = efm.i.f125385a;
                return b3Var.f(nVar2, i, i);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj3 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                Throwable th10 = (Throwable) obj3;
                Object obj4 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                if (!((Boolean) this.f288474b.invoke(th10, (Integer) obj4)).booleanValue()) {
                    return efm.i.c(th10);
                }
                return efm.i.i(Unit.f186387a).b(this.f288475c, TimeUnit.MILLISECONDS);
        }
    }
}
