package mfa;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public boolean u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f204979w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f204980x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f204981y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f204980x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f204979w = obj2;
        this.f204981y |= Integer.MIN_VALUE;
        return this.f204980x.b(false, this);
    }
}
