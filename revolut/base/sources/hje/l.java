package hje;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.c {
    public NaviCommand u;
    public qka.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f152749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f152750x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f152751y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, gim.c cVar) {
        super(cVar);
        this.f152750x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f152749w = obj2;
        this.f152751y |= Integer.MIN_VALUE;
        return this.f152750x.g(null, null, this);
    }
}
