package e0f;

import com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;

/* JADX INFO: loaded from: classes8.dex */
public final class n1 extends gim.c {
    public int A;
    public hve.b u;
    public PreselectedTopUpMethodId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TopUpMethodsContext f121651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f121652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f121653y;
    public final /* synthetic */ r1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.z = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f121653y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.k(null, null, null, false, this);
    }
}
