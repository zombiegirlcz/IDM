package ip0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class rp0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f166223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ up0 f166224c;
    public final /* synthetic */ Ref$ObjectRef d;

    public /* synthetic */ rp0(Ref$IntRef ref$IntRef, up0 up0Var, Ref$ObjectRef ref$ObjectRef, int i) {
        this.f166222a = i;
        this.f166223b = ref$IntRef;
        this.f166224c = up0Var;
        this.d = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f166222a) {
            case 0:
                tq0.c clickData = (tq0.c) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.f273449a.i;
                Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Int");
                Integer num = (Integer) obj3;
                this.d.f186409a = num;
                return new tp0(this.f166224c, Integer.valueOf(num.intValue()), this.f166223b.f186408a);
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Ref$IntRef ref$IntRef = this.f166223b;
                int i = ref$IntRef.f186408a - 12;
                ref$IntRef.f186408a = i;
                return new tp0(this.f166224c, (Integer) this.d.f186409a, i);
            default:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Ref$IntRef ref$IntRef2 = this.f166223b;
                int i2 = ref$IntRef2.f186408a + 12;
                ref$IntRef2.f186408a = i2;
                return new tp0(this.f166224c, (Integer) this.d.f186409a, i2);
        }
    }

    public /* synthetic */ rp0(Ref$ObjectRef ref$ObjectRef, Ref$IntRef ref$IntRef, up0 up0Var) {
        this.f166222a = 0;
        this.d = ref$ObjectRef;
        this.f166223b = ref$IntRef;
        this.f166224c = up0Var;
    }
}
