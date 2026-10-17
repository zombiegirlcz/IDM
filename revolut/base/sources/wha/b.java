package wha;

import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rr6.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f297446a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BigDecimal value = ((o) obj2).getValue();
        Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-feature-freelancer-common-models-cashback-FreelancerCashbackRate$-it$0");
        od0.h hVar = od0.i.Companion;
        o oVar = new o(value);
        hVar.getClass();
        return od0.h.a(oVar);
    }
}
