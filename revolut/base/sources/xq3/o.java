package xq3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.c {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f308087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f308088x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f308089y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, gim.c cVar) {
        super(cVar);
        this.f308088x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f308087w = obj2;
        this.f308089y |= Integer.MIN_VALUE;
        return this.f308088x.a(this);
    }
}
