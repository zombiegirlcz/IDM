package o55;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f222328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f222329c;

    public /* synthetic */ d0(f0 f0Var, String str, int i) {
        this.f222327a = i;
        this.f222328b = f0Var;
        this.f222329c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Map countryConfigs = (Map) obj2;
        switch (this.f222327a) {
            case 0:
                Intrinsics.checkNotNullParameter(countryConfigs, "countryConfigs");
                f0 f0Var = this.f222328b;
                efm.d0<k55.r> loan = f0Var.f222335b.getLoan(this.f222329c);
                o4a.e eVar = new o4a.e(23, new b0(countryConfigs, f0Var, 1));
                loan.getClass();
                return new ufm.i(loan, eVar, 1);
            default:
                Intrinsics.checkNotNullParameter(countryConfigs, "countryConfigs");
                return new ufm.c(new a9j.k(this.f222328b, 25, this.f222329c, countryConfigs), 2);
        }
    }
}
