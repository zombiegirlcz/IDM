package mjf;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ q C;
    public int D;
    public List u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public io3.d f206024w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f206025x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f206026y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, gim.c cVar) {
        super(cVar);
        this.C = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.d(this, null, false);
    }
}
