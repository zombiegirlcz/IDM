package a31;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f963b;

    public /* synthetic */ f(x xVar, int i) {
        this.f962a = i;
        this.f963b = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f962a) {
            case 0:
                qua.p recurringPayment = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                return this.f963b.f.h(recurringPayment);
            case 1:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f963b.f.g(it8);
            case 2:
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                return this.f963b.f.g(recurringPayments);
            case 3:
                Intrinsics.checkNotNullParameter((hbd.a) obj2, "it");
                return (List) this.f963b.e.get("RECURRING_PAYMENTS");
            case 4:
                Intrinsics.checkNotNullParameter((hbd.a) obj2, "it");
                x xVar = this.f963b;
                ufm.i iVar = new ufm.i(new ufm.i(new ufm.c(new l(xVar, 0), 2), new e(new f(xVar, 2), 20), 0), new o(0, s.f989a), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 5:
                qua.d type = (qua.d) obj2;
                Intrinsics.checkNotNullParameter(type, "type");
                return (List) this.f963b.e.get("ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type);
            default:
                qua.d type2 = (qua.d) obj2;
                Intrinsics.checkNotNullParameter(type2, "type");
                return (List) p.a.j(String.class, KTypeProjection.INSTANCE, List.class, this.f963b.f1003h, "ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type2);
        }
    }
}
