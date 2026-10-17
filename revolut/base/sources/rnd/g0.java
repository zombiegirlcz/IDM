package rnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends gim.i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v0 f255611w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String str, v0 v0Var, Continuation continuation) {
        super(2, continuation);
        this.v = str;
        this.f255611w = v0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g0 g0Var = new g0(this.v, this.f255611w, continuation);
        g0Var.u = ((Boolean) obj2).booleanValue();
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((g0) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!z) {
            return zi0.c.i(AnalyticsAccount.Personal.All.f99192a);
        }
        nib.c.Companion.getClass();
        String str = nib.b.f215667b;
        String str2 = this.v;
        if (Intrinsics.f(str2, str)) {
            return zi0.c.i(AnalyticsAccount.Savings.PersonalAll.f99203a);
        }
        boolean zF = Intrinsics.f(str2, nib.b.f215668c);
        v0 v0Var = this.f255611w;
        if (zF) {
            return xam.a.h(new m0(2, null), v0Var.f255643g.h(w4l.h.f294642c));
        }
        return xam.a.h(new j0(v0Var, null), ((rnb.i) v0Var.f255641b).c(str2));
    }
}
