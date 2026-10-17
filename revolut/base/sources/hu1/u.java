package hu1;

import com.revolut.feature.apm.core.models.blik.BlikCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f155541b;

    public /* synthetic */ u(e0 e0Var, int i) {
        this.f155540a = i;
        this.f155541b = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        boolean z3;
        switch (this.f155540a) {
            case 0:
                o updateState = (o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                BlikCode blikCode = (BlikCode) updateState.f155532a.getContent();
                e0 e0Var = this.f155541b;
                if (blikCode != null) {
                    z = e0Var.z2() >= blikCode.d;
                } else {
                    z = false;
                }
                BlikCode blikCode2 = (BlikCode) updateState.f155532a.getContent();
                if (blikCode2 != null) {
                    z3 = e0Var.z2() >= blikCode2.e;
                } else {
                    z3 = false;
                }
                return o.a(updateState, null, null, null, z3, z, false, false, null, null, 487);
            case 1:
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.e) {
                    e0 e0Var2 = this.f155541b;
                    e0Var2.E2(new t(e0Var2, 0));
                }
                return Unit.f186387a;
            default:
                return this.f155541b.F;
        }
    }
}
