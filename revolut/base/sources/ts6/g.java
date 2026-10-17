package ts6;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.c {
    public NaviCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f274005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f274006x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s0 s0Var, gim.c cVar) {
        super(cVar);
        this.f274005w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f274006x |= Integer.MIN_VALUE;
        return this.f274005w.g(null, null, this);
    }
}
