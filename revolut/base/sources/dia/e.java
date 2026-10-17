package dia;

import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.h;
import od0.i;
import rr6.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f114961a = new e();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BigDecimal value = ((o) obj2).getValue();
        Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-feature-freelancer-common-models-cashback-FreelancerCashbackRate$-it$0");
        h hVar = i.Companion;
        o oVar = new o(value);
        hVar.getClass();
        return h.a(oVar);
    }
}
