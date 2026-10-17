package vdl;

import fdl.b3;
import hcl.c3;
import java.time.Duration;
import java.time.Instant;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f288050b;

    public /* synthetic */ u0(x0 x0Var, int i) {
        this.f288049a = i;
        this.f288050b = x0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f288049a) {
            case 0:
                this.f288050b.e.set(false);
                return Unit.f186387a;
            case 1:
                String stockExchangeCode = (String) obj2;
                Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
                return (b3) this.f288050b.f288062c.get(x0.a(stockExchangeCode));
            default:
                String stockExchangeCode2 = (String) obj2;
                Intrinsics.checkNotNullParameter(stockExchangeCode2, "stockExchangeCode");
                x0 x0Var = this.f288050b;
                c3 c3Var = (c3) j6.a.k(c3.class, x0Var.d, x0.a(stockExchangeCode2));
                if (c3Var == null) {
                    return null;
                }
                if (Duration.between(Instant.ofEpochMilli(c3Var.getTimestamp()), ((l80.f) x0Var.f288061b).b()).toHours() >= 24) {
                    c3Var = null;
                }
                if (c3Var != null) {
                    return c3Var.getDto();
                }
                return null;
        }
    }
}
