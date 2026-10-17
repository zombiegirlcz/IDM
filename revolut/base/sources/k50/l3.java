package k50;

import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class l3 extends gim.c {
    public UUID u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181168x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(j4 j4Var, gim.c cVar) {
        super(cVar);
        this.f181167w = j4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f181168x |= Integer.MIN_VALUE;
        return j4.P2(this.f181167w, null, this);
    }
}
