package q97;

import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2 f243664a = new c2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BigDecimal value = ((rr6.o) obj2).getValue();
        Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-feature-freelancer-common-models-cashback-FreelancerCashbackRate$-it$0");
        od0.h hVar = od0.i.Companion;
        rr6.o oVar = new rr6.o(value);
        hVar.getClass();
        return od0.h.a(oVar);
    }
}
