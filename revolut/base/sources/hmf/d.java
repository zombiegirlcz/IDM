package hmf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public final /* synthetic */ a A;
    public int B;
    public a u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f153729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f153730x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f153731y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, gim.c cVar) {
        super(cVar);
        this.A = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return a.k(this.A, null, null, this);
    }
}
