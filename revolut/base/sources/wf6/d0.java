package wf6;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends gim.c {
    public jf0.c u;
    public NaviCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f296978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f296979x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e0 f296980y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, gim.c cVar) {
        super(cVar);
        this.f296980y = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f296979x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f296980y.b(null, this);
    }
}
