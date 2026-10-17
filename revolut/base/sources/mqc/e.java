package mqc;

import com.revolut.feature.salary_switch.impl.network.PayrollServiceV2;
import ip0.v7;
import java.util.List;
import k7c.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayrollServiceV2 f207954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f207955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f207956c;
    public final x4l.c d;

    public e(PayrollServiceV2 payrollServiceV2, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(payrollServiceV2, "payrollServiceV2");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f207954a = payrollServiceV2;
        this.f207955b = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        int i2 = 2;
        int i3 = 3;
        this.f207956c = new x4l.c(new x(this, continuation, 25), new Function1(this) { // from class: mqc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f207948b;

            {
                this.f207948b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (cqc.a) this.f207948b.f207955b.get(params.f207953c);
                    default:
                        String payrollSwitchId = (String) obj2;
                        Intrinsics.checkNotNullParameter(payrollSwitchId, "payrollSwitchId");
                        return (List) v7.r("SALARY_DISPUTES_LIST_", payrollSwitchId, this.f207948b.f207955b);
                }
            }
        }, new Function2(this) { // from class: mqc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f207950b;

            {
                this.f207950b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        d params = (d) obj2;
                        cqc.a dispute = (cqc.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(dispute, "dispute");
                        this.f207950b.f207955b.f(params.f207953c, dispute);
                        break;
                    default:
                        String payrollSwitchId = (String) obj2;
                        List disputes = (List) obj3;
                        Intrinsics.checkNotNullParameter(payrollSwitchId, "payrollSwitchId");
                        Intrinsics.checkNotNullParameter(disputes, "disputes");
                        ehe.n.z("SALARY_DISPUTES_LIST_", payrollSwitchId, this.f207950b.f207955b, disputes);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(i2, 28, continuation), new k3c.l(i3, 18, continuation));
        final int i5 = 1;
        this.d = new x4l.c(new x(this, continuation, 26), new Function1(this) { // from class: mqc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f207948b;

            {
                this.f207948b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (cqc.a) this.f207948b.f207955b.get(params.f207953c);
                    default:
                        String payrollSwitchId = (String) obj2;
                        Intrinsics.checkNotNullParameter(payrollSwitchId, "payrollSwitchId");
                        return (List) v7.r("SALARY_DISPUTES_LIST_", payrollSwitchId, this.f207948b.f207955b);
                }
            }
        }, new Function2(this) { // from class: mqc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f207950b;

            {
                this.f207950b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        d params = (d) obj2;
                        cqc.a dispute = (cqc.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(dispute, "dispute");
                        this.f207950b.f207955b.f(params.f207953c, dispute);
                        break;
                    default:
                        String payrollSwitchId = (String) obj2;
                        List disputes = (List) obj3;
                        Intrinsics.checkNotNullParameter(payrollSwitchId, "payrollSwitchId");
                        Intrinsics.checkNotNullParameter(disputes, "disputes");
                        ehe.n.z("SALARY_DISPUTES_LIST_", payrollSwitchId, this.f207950b.f207955b, disputes);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(i2, 29, continuation), new k3c.l(i3, 19, continuation));
    }
}
