package no7;

import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import kl7.o0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ po7.f f217942b;

    public /* synthetic */ k(po7.f fVar, int i) {
        this.f217941a = i;
        this.f217942b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f217941a) {
            case 0:
                f updateState = (f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                o0 o0Var = ((po7.e) this.f217942b).f237894a;
                InsurableCar car = updateState.f217934a;
                Intrinsics.checkNotNullParameter(car, "car");
                return new f(car, o0Var);
            default:
                ro7.f updateState2 = (ro7.f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return ro7.f.a(updateState2, null, null, null, null, null, null, null, ((po7.e) this.f217942b).f237894a, null, 767);
        }
    }
}
