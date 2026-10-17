package fg;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ c B;
    public int C;
    public Map u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f134858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public hlm.c f134859x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f134860y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(this);
    }
}
