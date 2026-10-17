package mk0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n extends gim.c {
    public ArrayList u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f206162w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f206163x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f206162w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f206163x |= Integer.MIN_VALUE;
        return o.l(this.f206162w, this);
    }
}
