package e0f;

import com.revolut.feature.topup_screen.common.CardDetails;

/* JADX INFO: loaded from: classes8.dex */
public final class p1 extends gim.c {
    public final /* synthetic */ r1 A;
    public int B;
    public CardDetails u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public yte.n f121665w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public t61.g f121666x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f121667y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.A = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.m(null, null, null, false, this);
    }
}
