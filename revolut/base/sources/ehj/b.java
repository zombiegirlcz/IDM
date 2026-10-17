package ehj;

import dej.m1;
import r10.w;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public String u;
    public m1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f126199w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f126200x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f126201y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w wVar, gim.c cVar) {
        super(cVar);
        this.f126200x = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f126199w = obj2;
        this.f126201y |= Integer.MIN_VALUE;
        return this.f126200x.y(null, null, this);
    }
}
