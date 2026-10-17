package pe0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends gim.c {
    public ArrayList u;
    public hlm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f235304w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f235305x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f235306y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, gim.c cVar) {
        super(cVar);
        this.f235305x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f235304w = obj2;
        this.f235306y |= Integer.MIN_VALUE;
        return this.f235305x.d(null, this);
    }
}
