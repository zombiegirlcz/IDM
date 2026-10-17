package ma1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f203917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f203918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f203919c;

    public /* synthetic */ z(l0 l0Var, double d, b0 b0Var) {
        this.f203917a = l0Var;
        this.f203918b = d;
        this.f203919c = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        l0 l0Var = this.f203917a;
        double dMin = Math.min(100.0d, l0Var.f186425a + this.f203918b);
        l0Var.f186425a = dMin;
        this.f203919c.i.onNext(Integer.valueOf(rim.d.b(dMin)));
        return Unit.f186387a;
    }
}
