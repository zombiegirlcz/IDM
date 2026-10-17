package e0f;

import com.revolut.feature.topup_screen.common.CardDetails;

/* JADX INFO: loaded from: classes8.dex */
public final class h1 extends gim.c {
    public CardDetails u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r1 f121610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f121611x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.f121610w = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f121611x |= Integer.MIN_VALUE;
        return this.f121610w.c(null, this);
    }
}
