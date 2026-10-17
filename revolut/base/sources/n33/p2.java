package n33;

import com.revolut.retail.core.navigation.CompositeCommand;

/* JADX INFO: loaded from: classes21.dex */
public final class p2 extends gim.c {
    public psg.a u;
    public CompositeCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f211782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r2 f211783x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f211784y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(r2 r2Var, gim.c cVar) {
        super(cVar);
        this.f211783x = r2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f211782w = obj2;
        this.f211784y |= Integer.MIN_VALUE;
        return r2.a(this.f211783x, null, null, this);
    }
}
