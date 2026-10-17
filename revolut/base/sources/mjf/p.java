package mjf;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ q C;
    public int D;
    public List u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public pcd.s f206027w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f206028x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f206029y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, gim.c cVar) {
        super(cVar);
        this.C = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.e(this, null, false);
    }
}
