package h4k;

import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.c {
    public Set u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h30.q f149399w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f149400x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h30.q qVar, gim.c cVar) {
        super(cVar);
        this.f149399w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f149400x |= Integer.MIN_VALUE;
        return this.f149399w.A0(this);
    }
}
