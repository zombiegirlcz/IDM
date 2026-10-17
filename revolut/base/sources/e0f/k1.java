package e0f;

import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class k1 extends gim.c {
    public int A;
    public TopUpMethodsContext u;
    public Function2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f121629w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public yte.n f121630x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f121631y;
    public final /* synthetic */ r1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.z = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f121631y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, null, null, null, this);
    }
}
