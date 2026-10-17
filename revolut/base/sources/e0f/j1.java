package e0f;

import com.revolut.feature.topup_screen.api.model.CheckoutContext;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 extends gim.c {
    public yte.n u;
    public CheckoutContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f121621w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f121622x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r1 f121623y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.f121623y = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f121622x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f121623y.e(null, null, this);
    }
}
