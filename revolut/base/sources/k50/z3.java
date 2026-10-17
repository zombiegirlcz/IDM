package k50;

import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class z3 extends gim.c {
    public int A;
    public UUID u;
    public z30.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z30.j f181311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f181313y;
    public final /* synthetic */ j4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(j4 j4Var, gim.c cVar) {
        super(cVar);
        this.z = j4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f181313y = obj2;
        this.A |= Integer.MIN_VALUE;
        return j4.S2(this.z, null, null, 0, null, this);
    }
}
