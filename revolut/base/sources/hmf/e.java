package hmf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public final /* synthetic */ a A;
    public int B;
    public a u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f153732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f153733x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f153734y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, gim.c cVar) {
        super(cVar);
        this.A = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return a.l(this.A, null, null, this);
    }
}
