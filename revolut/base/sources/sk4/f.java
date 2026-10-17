package sk4;

import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v2.SelectAutopayMethodContractV2$InputData;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v2.SelectAutopayMethodScreenV2;
import dw3.b6;
import dw3.c1;
import dw3.g5;
import dw3.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263774a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectAutopayMethodScreenV2 f263775b;

    public /* synthetic */ f(SelectAutopayMethodScreenV2 selectAutopayMethodScreenV2) {
        this.f263775b = selectAutopayMethodScreenV2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f263774a;
        SelectAutopayMethodScreenV2 selectAutopayMethodScreenV2 = this.f263775b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = SelectAutopayMethodScreenV2.c0;
                qji.b bVarQ2 = selectAutopayMethodScreenV2.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v2.di.SelectAutopayMethodScreenInjectorV2");
                c1 c1Var = ((w) bVarQ2).f120034c;
                b6 b6Var = new b6();
                int i2 = 10;
                b6Var.f118377a = e4m.b.b(new g5(c1Var, b6Var, 1, i2));
                b6Var.f118378b = e4m.b.b(new g5(c1Var, b6Var, 0, i2));
                return b6Var;
            default:
                KProperty[] kPropertyArr2 = SelectAutopayMethodScreenV2.c0;
                return (c) ((b6) selectAutopayMethodScreenV2.f68653a0.getValue()).f118378b.get();
        }
    }

    public /* synthetic */ f(SelectAutopayMethodScreenV2 selectAutopayMethodScreenV2, SelectAutopayMethodContractV2$InputData selectAutopayMethodContractV2$InputData) {
        this.f263775b = selectAutopayMethodScreenV2;
    }
}
